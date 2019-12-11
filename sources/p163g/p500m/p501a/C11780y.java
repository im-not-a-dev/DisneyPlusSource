package p163g.p500m.p501a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import p163g.p500m.p501a.p502z.C11781a;
import p163g.p500m.p501a.p502z.C11781a.C11782a;
import p163g.p500m.p501a.p502z.C11781a.C11783b;
import p163g.p500m.p501a.p502z.C11781a.C11784c;

/* renamed from: g.m.a.y */
/* compiled from: Types */
public final class C11780y {
    /* renamed from: a */
    public static ParameterizedType m37894a(Type type, Type... typeArr) {
        return new C11783b(null, type, typeArr);
    }

    /* renamed from: b */
    public static GenericArrayType m37899b(Type type) {
        return new C11782a(type);
    }

    /* renamed from: c */
    static Type m37901c(Type type) {
        Class d = m37902d(type);
        return C11781a.m37914a(type, d, d.getGenericSuperclass());
    }

    /* renamed from: d */
    public static Class<?> m37902d(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m37902d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m37902d(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        sb.append("> is of type ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static boolean m37903e(Type type) {
        return type == Boolean.class || type == Byte.class || type == Character.class || type == Double.class || type == Float.class || type == Integer.class || type == Long.class || type == Short.class || type == String.class || type == Object.class;
    }

    /* renamed from: f */
    public static WildcardType m37904f(Type type) {
        return new C11784c(new Type[]{type}, C11781a.f27419b);
    }

    /* renamed from: g */
    public static WildcardType m37905g(Type type) {
        return new C11784c(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: a */
    public static Type m37896a(Type type, Class<?> cls) {
        Type a = m37897a(type, cls, Collection.class);
        if (a instanceof WildcardType) {
            a = ((WildcardType) a).getUpperBounds()[0];
        }
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    static Type[] m37900b(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type a = m37897a(type, cls, Map.class);
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: a */
    public static boolean m37898a(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m37898a((Type) ((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C11783b) {
                typeArr = ((C11783b) parameterizedType).f27422V;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C11783b) {
                typeArr2 = ((C11783b) parameterizedType2).f27422V;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m37898a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m37898a((Type) ((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m37898a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    static Type m37897a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C11781a.m37914a(type, cls, C11781a.m37913a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static Type m37895a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }
}
