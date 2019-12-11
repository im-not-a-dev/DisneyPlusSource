package kotlin.reflect.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010%\u001a\u0004\u0018\u00010&*\u00020'H\u0002\"/\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"-\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001e*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001b\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, mo31007d2 = {"javaConstructor", "Ljava/lang/reflect/Constructor;", "T", "Lkotlin/reflect/KFunction;", "javaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "javaField", "Ljava/lang/reflect/Field;", "Lkotlin/reflect/KProperty;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaGetter", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaMethod", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "kotlinFunction", "", "getKotlinFunction", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinProperty", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "getKPackage", "Lkotlin/reflect/KDeclarationContainer;", "Ljava/lang/reflect/Member;", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJvmMapping.kt */
public final class ReflectJvmMapping {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.FILE_FACADE.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.MULTIFILE_CLASS.ordinal()] = 2;
            $EnumSwitchMapping$0[Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.reflect.Constructor<T> getJavaConstructor(kotlin.reflect.KFunction<? extends T> r2) {
        /*
            kotlin.reflect.jvm.internal.KCallableImpl r2 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0012
            kotlin.reflect.jvm.internal.calls.Caller r2 = r2.getCaller()
            if (r2 == 0) goto L_0x0012
            java.lang.reflect.Member r2 = r2.getMember()
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            boolean r1 = r2 instanceof java.lang.reflect.Constructor
            if (r1 != 0) goto L_0x0018
            r2 = r0
        L_0x0018:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(kotlin.reflect.KFunction):java.lang.reflect.Constructor");
    }

    public static final Field getJavaField(KProperty<?> kProperty) {
        KPropertyImpl asKPropertyImpl = UtilKt.asKPropertyImpl(kProperty);
        if (asKPropertyImpl != null) {
            return asKPropertyImpl.getJavaField();
        }
        return null;
    }

    public static final Method getJavaGetter(KProperty<?> kProperty) {
        return getJavaMethod(kProperty.getGetter());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Method getJavaMethod(kotlin.reflect.KFunction<?> r2) {
        /*
            kotlin.reflect.jvm.internal.KCallableImpl r2 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0012
            kotlin.reflect.jvm.internal.calls.Caller r2 = r2.getCaller()
            if (r2 == 0) goto L_0x0012
            java.lang.reflect.Member r2 = r2.getMember()
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 != 0) goto L_0x0018
            r2 = r0
        L_0x0018:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(kotlin.reflect.KFunction):java.lang.reflect.Method");
    }

    public static final Method getJavaSetter(KMutableProperty<?> kMutableProperty) {
        return getJavaMethod(kMutableProperty.getSetter());
    }

    public static final Type getJavaType(KType kType) {
        return ((KTypeImpl) kType).getJavaType$kotlin_reflection();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlin.reflect.KDeclarationContainer getKPackage(java.lang.reflect.Member r5) {
        /*
            kotlin.reflect.jvm.internal.components.ReflectKotlinClass$Factory r0 = kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Factory
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r2 = "declaringClass"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            kotlin.reflect.jvm.internal.components.ReflectKotlinClass r0 = r0.create(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.getClassHeader()
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.getKind()
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            goto L_0x0032
        L_0x0021:
            int[] r3 = kotlin.reflect.jvm.ReflectJvmMapping.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            r4 = 2
            if (r0 == r3) goto L_0x0034
            if (r0 == r4) goto L_0x0034
            r3 = 3
            if (r0 == r3) goto L_0x0034
        L_0x0032:
            r0 = r1
            goto L_0x0040
        L_0x0034:
            kotlin.reflect.jvm.internal.KPackageImpl r0 = new kotlin.reflect.jvm.internal.KPackageImpl
            java.lang.Class r5 = r5.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r2)
            r0.<init>(r5, r1, r4, r1)
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.ReflectJvmMapping.getKPackage(java.lang.reflect.Member):kotlin.reflect.KDeclarationContainer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ba A[EDGE_INSN: B:58:0x00ba->B:39:0x00ba ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.KFunction<?> getKotlinFunction(java.lang.reflect.Method r8) {
        /*
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            java.lang.String r1 = "declaringClass"
            r2 = 0
            if (r0 == 0) goto L_0x00bf
            kotlin.reflect.KDeclarationContainer r0 = getKPackage(r8)
            if (r0 == 0) goto L_0x0052
            java.util.Collection r0 = r0.getMembers()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof kotlin.reflect.KFunction
            if (r4 == 0) goto L_0x0020
            r1.add(r3)
            goto L_0x0020
        L_0x0032:
            java.util.Iterator r0 = r1.iterator()
        L_0x0036:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = getJavaMethod(r3)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r8)
            if (r3 == 0) goto L_0x0036
            goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            kotlin.reflect.KFunction r1 = (kotlin.reflect.KFunction) r1
            return r1
        L_0x0052:
            java.lang.Class r0 = r8.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            kotlin.reflect.KClass r0 = kotlin.p581d0.C12731a.m39867a(r0)
            kotlin.reflect.KClass r0 = kotlin.reflect.full.KClasses.getCompanionObject(r0)
            if (r0 == 0) goto L_0x00bf
            java.util.Collection r0 = kotlin.reflect.full.KClasses.getFunctions(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r0.next()
            r4 = r3
            kotlin.reflect.KFunction r4 = (kotlin.reflect.KFunction) r4
            java.lang.reflect.Method r4 = getJavaMethod(r4)
            if (r4 == 0) goto L_0x00b5
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = r8.getName()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L_0x00b5
            java.lang.Class[] r5 = r4.getParameterTypes()
            if (r5 == 0) goto L_0x00b1
            java.lang.Class[] r6 = r8.getParameterTypes()
            java.lang.String r7 = "this.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r7)
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 == 0) goto L_0x00b5
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r5 = r8.getReturnType()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x00b1:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r2
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            if (r4 == 0) goto L_0x006b
            goto L_0x00ba
        L_0x00b9:
            r3 = r2
        L_0x00ba:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            if (r3 == 0) goto L_0x00bf
            return r3
        L_0x00bf:
            java.lang.Class r0 = r8.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            kotlin.reflect.KClass r0 = kotlin.p581d0.C12731a.m39867a(r0)
            java.util.Collection r0 = kotlin.reflect.full.KClasses.getFunctions(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = getJavaMethod(r3)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r8)
            if (r3 == 0) goto L_0x00d2
            goto L_0x00eb
        L_0x00ea:
            r1 = r2
        L_0x00eb:
            kotlin.reflect.KFunction r1 = (kotlin.reflect.KFunction) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.ReflectJvmMapping.getKotlinFunction(java.lang.reflect.Method):kotlin.reflect.KFunction");
    }

    public static final KProperty<?> getKotlinProperty(Field field) {
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        KDeclarationContainer kPackage = getKPackage(field);
        if (kPackage != null) {
            Collection members = kPackage.getMembers();
            ArrayList arrayList = new ArrayList();
            for (Object next : members) {
                if (next instanceof KProperty) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (Intrinsics.areEqual((Object) getJavaField((KProperty) next2), (Object) field)) {
                    obj = next2;
                    break;
                }
            }
            return (KProperty) obj;
        }
        Class declaringClass = field.getDeclaringClass();
        Intrinsics.checkReturnedValueIsNotNull((Object) declaringClass, "declaringClass");
        Iterator it2 = KClasses.getMemberProperties(C12731a.m39867a(declaringClass)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next3 = it2.next();
            if (Intrinsics.areEqual((Object) getJavaField((KProperty1) next3), (Object) field)) {
                obj = next3;
                break;
            }
        }
        return (KProperty) obj;
    }

    public static /* synthetic */ void javaConstructor$annotations(KFunction kFunction) {
    }

    public static final <T> KFunction<T> getKotlinFunction(Constructor<T> constructor) {
        Object obj;
        Class declaringClass = constructor.getDeclaringClass();
        Intrinsics.checkReturnedValueIsNotNull((Object) declaringClass, "declaringClass");
        Iterator it = C12731a.m39867a(declaringClass).getConstructors().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) getJavaConstructor((KFunction) obj), (Object) constructor)) {
                break;
            }
        }
        return (KFunction) obj;
    }
}
