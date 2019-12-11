package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12888r;
import kotlin.jvm.internal.C12889s;
import kotlin.jvm.internal.C12895y;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002"}, mo31007d2 = {"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCallerKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties;

    static {
        Class<AnnotationConstructorCallerKt> cls = AnnotationConstructorCallerKt.class;
        String str = "kotlin-reflection";
        $$delegatedProperties = new KProperty[]{C12895y.m40234a((C12888r) new C12889s(C12895y.m40231a(cls, str), "hashCode", "<v#0>")), C12895y.m40234a((C12888r) new C12889s(C12895y.m40231a(cls, str), "toString", "<v#1>"))};
    }

    public static final <T> T createAnnotationInstance(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2 = new AnnotationConstructorCallerKt$createAnnotationInstance$2(cls, list, map);
        Lazy a = C12763i.m39921a(new C12916xa743ec88(map));
        KProperty kProperty = $$delegatedProperties[0];
        Lazy a2 = C12763i.m39921a(new C12917x4fc4299(cls, map));
        KProperty kProperty2 = $$delegatedProperties[1];
        ClassLoader classLoader = cls.getClassLoader();
        Class[] clsArr = {cls};
        AnnotationConstructorCallerKt$createAnnotationInstance$result$1 annotationConstructorCallerKt$createAnnotationInstance$result$1 = new AnnotationConstructorCallerKt$createAnnotationInstance$result$1(cls, a2, kProperty2, a, kProperty, annotationConstructorCallerKt$createAnnotationInstance$2, map);
        T newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, annotationConstructorCallerKt$createAnnotationInstance$result$1);
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new C13142s("null cannot be cast to non-null type T");
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            List arrayList = new ArrayList(C13187p.m40525a((Iterable) keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    /* access modifiers changed from: private */
    public static final Void throwIllegalArgumentType(int i, String str, Class<?> cls) {
        KClass kClass;
        String str2;
        if (C12880j.m40224a((Object) cls, (Object) Class.class)) {
            kClass = C12895y.m40230a(KClass.class);
        } else if (!cls.isArray() || !C12880j.m40224a((Object) cls.getComponentType(), (Object) Class.class)) {
            kClass = C12731a.m39867a(cls);
        } else {
            kClass = C12895y.m40230a(KClass[].class);
        }
        if (C12880j.m40224a((Object) kClass.getQualifiedName(), (Object) C12895y.m40230a(Object[].class).getQualifiedName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(kClass.getQualifiedName());
            sb.append('<');
            Class componentType = C12731a.m39866a(kClass).getComponentType();
            C12880j.m40222a((Object) componentType, "kotlinClass.java.componentType");
            sb.append(C12731a.m39867a(componentType).getQualifiedName());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = kClass.getQualifiedName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C12731a.m39866a((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object obj2 = (Object[]) obj;
            if (obj2 instanceof Class[]) {
                return null;
            }
            if (!(obj2 instanceof KClass[])) {
                obj = obj2;
            } else if (obj != null) {
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass a : kClassArr) {
                    arrayList.add(C12731a.m39866a(a));
                }
                obj = arrayList.toArray(new Class[0]);
                if (obj == null) {
                    throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        return obj;
    }
}
