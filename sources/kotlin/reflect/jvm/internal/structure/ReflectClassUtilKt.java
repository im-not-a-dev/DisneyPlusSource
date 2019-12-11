package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12730d;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.C12840a;
import kotlin.jvm.functions.C12841b;
import kotlin.jvm.functions.C12842c;
import kotlin.jvm.functions.C12843d;
import kotlin.jvm.functions.C12844e;
import kotlin.jvm.functions.C12845f;
import kotlin.jvm.functions.C12846g;
import kotlin.jvm.functions.C12847h;
import kotlin.jvm.functions.C12848i;
import kotlin.jvm.functions.C12849j;
import kotlin.jvm.functions.C12850k;
import kotlin.jvm.functions.C12851l;
import kotlin.jvm.functions.C12852m;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.C12854o;
import kotlin.jvm.functions.C12855p;
import kotlin.jvm.functions.C12856q;
import kotlin.jvm.functions.C12857r;
import kotlin.jvm.functions.C12858s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.p581d0.C12731a;
import kotlin.p590y.C13180m;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, mo31007d2 = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt {
    private static final Map<Class<? extends C12730d<?>>, Integer> FUNCTION_CLASSES;
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES = C13185o.m40520c(C12895y.m40230a(Boolean.TYPE), C12895y.m40230a(Byte.TYPE), C12895y.m40230a(Character.TYPE), C12895y.m40230a(Double.TYPE), C12895y.m40230a(Float.TYPE), C12895y.m40230a(Integer.TYPE), C12895y.m40230a(Long.TYPE), C12895y.m40230a(Short.TYPE));
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        int i = 0;
        List<KClass<? extends Object>> list = PRIMITIVE_CLASSES;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (KClass kClass : list) {
            arrayList.add(C12907r.m40244a(C12731a.m39869b(kClass), C12731a.m39870c(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = C13173j0.m40351a((Iterable) arrayList);
        List<KClass<? extends Object>> list2 = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list2, 10));
        for (KClass kClass2 : list2) {
            arrayList2.add(C12907r.m40244a(C12731a.m39870c(kClass2), C12731a.m39869b(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = C13173j0.m40351a((Iterable) arrayList2);
        List c = C13185o.m40520c(Function0.class, Function1.class, Function2.class, C12853n.class, Function4.class, C12854o.class, C12855p.class, C12856q.class, C12857r.class, C12858s.class, C12840a.class, C12841b.class, C12842c.class, C12843d.class, C12844e.class, C12845f.class, C12846g.class, C12847h.class, C12848i.class, C12849j.class, C12850k.class, C12851l.class, C12852m.class);
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (Object next : c) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(C12907r.m40244a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        FUNCTION_CLASSES = C13173j0.m40351a((Iterable) arrayList3);
    }

    public static final Class<?> createArrayType(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static final ClassId getClassId(Class<?> cls) {
        if (cls.isPrimitive()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't compute ClassId for primitive type: ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C12880j.m40222a((Object) simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        ClassId classId = getClassId(declaringClass);
                        if (classId != null) {
                            ClassId createNestedClassId = classId.createNestedClassId(Name.identifier(cls.getSimpleName()));
                            if (createNestedClassId != null) {
                                return createNestedClassId;
                            }
                        }
                    }
                    ClassId classId2 = ClassId.topLevel(new FqName(cls.getName()));
                    C12880j.m40222a((Object) classId2, "ClassId.topLevel(FqName(name))");
                    return classId2;
                }
            }
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't compute ClassId for array type: ");
            sb2.append(cls);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final String getDesc(Class<?> cls) {
        if (C12880j.m40224a((Object) cls, (Object) Void.TYPE)) {
            return "V";
        }
        String name = createArrayType(cls).getName();
        C12880j.m40222a((Object) name, "createArrayType().name");
        if (name != null) {
            String substring = name.substring(1);
            C12880j.m40222a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return C12832w.m40115a(substring, '.', '/', false, 4, (Object) null);
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    public static final Integer getFunctionClassArity(Class<?> cls) {
        return (Integer) FUNCTION_CLASSES.get(cls);
    }

    public static final List<Type> getParameterizedTypeArguments(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return C13185o.m40513a();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C12788p.m39999g(C12788p.m39992c(C12781n.m39973a(type, (Function1<? super T, ? extends T>) ReflectClassUtilKt$parameterizedTypeArguments$1.INSTANCE), ReflectClassUtilKt$parameterizedTypeArguments$2.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C12880j.m40222a((Object) actualTypeArguments, "actualTypeArguments");
        return C13174k.m40412l(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(Class<?> cls) {
        return (Class) WRAPPER_TO_PRIMITIVE.get(cls);
    }

    public static final ClassLoader getSafeClassLoader(Class<?> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C12880j.m40222a((Object) systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(Class<?> cls) {
        return (Class) PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
