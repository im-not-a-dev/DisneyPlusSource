package com.facebook.stetho.json;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ObjectMapper {
    private final Map<Class<?>, Method> mJsonValueMethodCache = new IdentityHashMap();

    private <T> T _convertFromJSONObject(JSONObject jSONObject, Class<T> cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                Object valueForField = getValueForField(field, jSONObject.opt(field.getName()));
                try {
                    field.set(newInstance, valueForField);
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Class: ");
                    sb.append(cls.getSimpleName());
                    sb.append(" Field: ");
                    sb.append(field.getName());
                    sb.append(" type ");
                    sb.append(valueForField != null ? valueForField.getClass().getName() : "null");
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
        }
        return newInstance;
    }

    private JSONObject _convertToJSONObject(Object obj) throws JSONException, InvocationTargetException, IllegalAccessException {
        JSONObject jSONObject = new JSONObject();
        Field[] fields = obj.getClass().getFields();
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                JsonProperty jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class);
                if (jsonProperty != null) {
                    Object obj2 = field.get(obj);
                    Class type = field.getType();
                    if (obj2 != null) {
                        type = obj2.getClass();
                    }
                    String name = field.getName();
                    if (jsonProperty.required() && obj2 == null) {
                        obj2 = JSONObject.NULL;
                    } else if (obj2 != JSONObject.NULL) {
                        obj2 = getJsonValue(obj2, type, field);
                    }
                    jSONObject.put(name, obj2);
                }
            }
        }
        return jSONObject;
    }

    private static boolean canDirectlySerializeClass(Class cls) {
        return isWrapperOrPrimitiveType(cls) || cls.equals(String.class);
    }

    private List<Object> convertArrayToList(Field field, JSONArray jSONArray) throws IllegalAccessException, JSONException {
        if (List.class.isAssignableFrom(field.getType())) {
            Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Class cls = (Class) actualTypeArguments[0];
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (cls.isEnum()) {
                        arrayList.add(getEnumValue(jSONArray.getString(i), cls));
                    } else if (canDirectlySerializeClass(cls)) {
                        arrayList.add(jSONArray.get(i));
                    } else {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject == null) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(convertValue(jSONObject, cls));
                        }
                    }
                }
                return arrayList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Only able to handle a single type in a list ");
            sb.append(field.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("only know how to deserialize List<?> on field ");
        sb2.append(field.getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    private JSONArray convertListToJsonArray(Object obj) throws InvocationTargetException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Object next : (List) obj) {
            Object obj2 = null;
            if (next != null) {
                obj2 = getJsonValue(next, next.getClass(), null);
            }
            jSONArray.put(obj2);
        }
        return jSONArray;
    }

    private Enum getEnumByMethod(String str, Class<? extends Enum> cls, Method method) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int i = 0;
        while (i < enumArr.length) {
            Enum enumR = enumArr[i];
            try {
                Object invoke = method.invoke(enumR, new Object[0]);
                if (invoke != null && invoke.toString().equals(str)) {
                    return enumR;
                }
                i++;
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No enum constant ");
        sb.append(cls.getName());
        sb.append(".");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private Enum getEnumValue(String str, Class<? extends Enum> cls) {
        Method jsonValueMethod = getJsonValueMethod(cls);
        if (jsonValueMethod != null) {
            return getEnumByMethod(str, cls, jsonValueMethod);
        }
        return Enum.valueOf(cls, str);
    }

    private Object getJsonValue(Object obj, Class<?> cls, Field field) throws InvocationTargetException, IllegalAccessException {
        if (obj == null) {
            return null;
        }
        if (List.class.isAssignableFrom(cls)) {
            return convertListToJsonArray(obj);
        }
        Method jsonValueMethod = getJsonValueMethod(cls);
        if (jsonValueMethod != null) {
            return jsonValueMethod.invoke(obj, new Object[0]);
        }
        if (!canDirectlySerializeClass(cls)) {
            return convertValue(obj, JSONObject.class);
        }
        if (cls.equals(Double.class) || cls.equals(Float.class)) {
            double doubleValue = ((Number) obj).doubleValue();
            if (Double.isNaN(doubleValue)) {
                return "NaN";
            }
            if (doubleValue == Double.POSITIVE_INFINITY) {
                return "Infinity";
            }
            if (doubleValue == Double.NEGATIVE_INFINITY) {
                obj = "-Infinity";
            }
        }
        return obj;
    }

    private Method getJsonValueMethod(Class<?> cls) {
        Method method;
        synchronized (this.mJsonValueMethodCache) {
            method = (Method) this.mJsonValueMethodCache.get(cls);
            if (method == null && !this.mJsonValueMethodCache.containsKey(cls)) {
                method = getJsonValueMethodImpl(cls);
                this.mJsonValueMethodCache.put(cls, method);
            }
        }
        return method;
    }

    private static Method getJsonValueMethodImpl(Class<?> cls) {
        Method[] methods = cls.getMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getAnnotation(JsonValue.class) != null) {
                return methods[i];
            }
        }
        return null;
    }

    private Object getValueForField(Field field, Object obj) throws JSONException {
        if (obj != null) {
            try {
                if (obj == JSONObject.NULL) {
                    return null;
                }
                if (obj.getClass() == field.getType()) {
                    return obj;
                }
                if (obj instanceof JSONObject) {
                    return convertValue(obj, field.getType());
                }
                if (field.getType().isEnum()) {
                    return getEnumValue((String) obj, field.getType().asSubclass(Enum.class));
                }
                if (obj instanceof JSONArray) {
                    return convertArrayToList(field, (JSONArray) obj);
                }
                if (obj instanceof Number) {
                    Number number = (Number) obj;
                    Class<Short> type = field.getType();
                    if (type != Integer.class) {
                        if (type != Integer.TYPE) {
                            if (type != Long.class) {
                                if (type != Long.TYPE) {
                                    if (type != Double.class) {
                                        if (type != Double.TYPE) {
                                            if (type != Float.class) {
                                                if (type != Float.TYPE) {
                                                    if (type != Byte.class) {
                                                        if (type != Byte.TYPE) {
                                                            if (type != Short.class) {
                                                                if (type != Short.TYPE) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append("Not setup to handle class ");
                                                                    sb.append(type.getName());
                                                                    throw new IllegalArgumentException(sb.toString());
                                                                }
                                                            }
                                                            return Short.valueOf(number.shortValue());
                                                        }
                                                    }
                                                    return Byte.valueOf(number.byteValue());
                                                }
                                            }
                                            return Float.valueOf(number.floatValue());
                                        }
                                    }
                                    return Double.valueOf(number.doubleValue());
                                }
                            }
                            return Long.valueOf(number.longValue());
                        }
                    }
                    return Integer.valueOf(number.intValue());
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to set value for field ");
                sb2.append(field.getName());
                throw new IllegalArgumentException(sb2.toString(), e);
            }
        }
        return obj;
    }

    private static boolean isWrapperOrPrimitiveType(Class<?> cls) {
        return cls.isPrimitive() || cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        if (cls != Object.class && cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        try {
            if (obj instanceof JSONObject) {
                return _convertFromJSONObject((JSONObject) obj, cls);
            }
            if (cls == JSONObject.class) {
                return _convertToJSONObject(obj);
            }
            throw new IllegalArgumentException("Expecting either fromValue or toValueType to be a JSONObject");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalArgumentException(e3);
        } catch (JSONException e4) {
            throw new IllegalArgumentException(e4);
        } catch (InvocationTargetException e5) {
            throw ExceptionUtil.propagate(e5.getCause());
        }
    }
}
