package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12866d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p588j0.C12808i;
import kotlin.p588j0.C12815k;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002J=\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:J8\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J(\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010<\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006@"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class KDeclarationContainerImpl implements C12866d {
    public static final Companion Companion = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
    /* access modifiers changed from: private */
    public static final C12815k LOCAL_PROPERTY_SIGNATURE = new C12815k("<v#(\\d+)>");

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public final C12815k getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(Data.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};
        private final LazySoftVal moduleData$delegate = ReflectProperties.lazySoft(new KDeclarationContainerImpl$Data$moduleData$2(this));

        public Data() {
        }

        public final RuntimeModuleData getModuleData() {
            return (RuntimeModuleData) this.moduleData$delegate.getValue(this, $$delegatedProperties[0]);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            Kind kind = callableMemberDescriptor.getKind();
            Intrinsics.checkReturnedValueIsNotNull((Object) kind, "member.kind");
            return kind.isReal() == (this == DECLARED);
        }
    }

    private final void addParametersAndMasks(List<Class<?>> list, String str, boolean z) {
        List loadParameterTypes = loadParameterTypes(str);
        list.addAll(loadParameterTypes);
        int size = ((loadParameterTypes.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            Intrinsics.checkReturnedValueIsNotNull((Object) cls, "Integer.TYPE");
            list.add(cls);
        }
        Object obj = z ? DEFAULT_CONSTRUCTOR_MARKER : Object.class;
        Intrinsics.checkReturnedValueIsNotNull(obj, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(obj);
    }

    /* access modifiers changed from: private */
    public final KPropertyImpl<?> createProperty(PropertyDescriptor propertyDescriptor) {
        int i = 0;
        int i2 = propertyDescriptor.getDispatchReceiverParameter() != null ? 1 : 0;
        if (propertyDescriptor.getExtensionReceiverParameter() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (propertyDescriptor.isVar()) {
            if (i3 == 0) {
                return new KMutableProperty0Impl(this, propertyDescriptor);
            }
            if (i3 == 1) {
                return new KMutableProperty1Impl(this, propertyDescriptor);
            }
            if (i3 == 2) {
                return new KMutableProperty2Impl(this, propertyDescriptor);
            }
        } else if (i3 == 0) {
            return new KProperty0Impl(this, propertyDescriptor);
        } else {
            if (i3 == 1) {
                return new KProperty1Impl(this, propertyDescriptor);
            }
            if (i3 == 2) {
                return new KProperty2Impl(this, propertyDescriptor);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported property: ");
        sb.append(propertyDescriptor);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    private final List<Class<?>> loadParameterTypes(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C12833x.m40151a((CharSequence) "VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C12833x.m40128a((CharSequence) str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type prefix in the method signature: ");
                sb.append(str);
                throw new KotlinReflectionInternalError(sb.toString());
            }
            arrayList.add(parseType(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    private final Class<?> loadReturnType(String str) {
        return parseType(str, C12833x.m40128a((CharSequence) str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Class[] interfaces;
        Method tryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (tryGetMethod != null) {
            return tryGetMethod;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method lookupMethod = lookupMethod(superclass, str, clsArr, cls2);
            if (lookupMethod != null) {
                return lookupMethod;
            }
        }
        for (Class cls3 : cls.getInterfaces()) {
            Intrinsics.checkReturnedValueIsNotNull((Object) cls3, "superInterface");
            Method lookupMethod2 = lookupMethod(cls3, str, clsArr, cls2);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
        }
        return null;
    }

    private final Class<?> parseType(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            int i3 = i + 1;
            int i4 = i2 - 1;
            if (str != null) {
                String substring = str.substring(i3, i4);
                Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Class<?> loadClass = safeClassLoader.loadClass(C12832w.m40115a(substring, '/', '.', false, 4, (Object) null));
                Intrinsics.checkReturnedValueIsNotNull((Object) loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                Intrinsics.checkReturnedValueIsNotNull((Object) cls, "Void.TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return ReflectClassUtilKt.createArrayType(parseType(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type prefix in the method signature: ");
                        sb.append(str);
                        throw new KotlinReflectionInternalError(sb.toString());
                }
            }
        }
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[LOOP:0: B:6:0x0029->B:21:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method tryGetMethod(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r2 = "result"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r10)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x0060
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r1 = "declaredMethods"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x0060 }
            r2 = 0
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x0060
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r5 = "method"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r10)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0054
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0054:
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NoSuchMethodException -> 0x0060 }
            throw r0
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x005d
            r0 = r4
            goto L_0x0060
        L_0x005d:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    public final Constructor<?> findConstructorBySignature(String str) {
        return tryGetConstructor(getJClass(), loadParameterTypes(str));
    }

    public final Constructor<?> findDefaultConstructor(String str) {
        Class jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, str, true);
        return tryGetConstructor(jClass, arrayList);
    }

    public final Method findDefaultMethod(String str, String str2, boolean z) {
        if (Intrinsics.areEqual((Object) str, (Object) "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getJClass());
        }
        addParametersAndMasks(arrayList, str2, false);
        Class methodOwner = getMethodOwner();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("$default");
        return lookupMethod(methodOwner, sb.toString(), (List<? extends Class<?>>) arrayList, loadReturnType(str2));
    }

    public final FunctionDescriptor findFunctionDescriptor(String str, String str2) {
        Iterable iterable;
        String str3;
        if (Intrinsics.areEqual((Object) str, (Object) "<init>")) {
            iterable = C13199w.m40606q(getConstructorDescriptors());
        } else {
            Name identifier = Name.identifier(str);
            Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(name)");
            iterable = getFunctions(identifier);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (Intrinsics.areEqual((Object) RuntimeTypeMapper.INSTANCE.mapSignature((FunctionDescriptor) next).asString(), (Object) str2)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) C13199w.m40599k((List) arrayList);
        }
        String a = C13199w.m40559a(iterable2, "\n", null, null, 0, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.INSTANCE, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (a.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(10);
            sb2.append(a);
            str3 = sb2.toString();
        }
        sb.append(str3);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public final Method findMethodBySignature(String str, String str2) {
        if (Intrinsics.areEqual((Object) str, (Object) "<init>")) {
            return null;
        }
        return lookupMethod(getMethodOwner(), str, loadParameterTypes(str2), loadReturnType(str2));
    }

    public final PropertyDescriptor findPropertyDescriptor(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C12808i b = LOCAL_PROPERTY_SIGNATURE.mo31140b(str5);
        boolean z = true;
        if (b != null) {
            String str6 = (String) b.mo31119a().mo31122a().mo31120b().get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str6));
            if (localProperty != null) {
                return localProperty;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Local property #");
            sb.append(str6);
            sb.append(" not found in ");
            sb.append(getJClass());
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Name identifier = Name.identifier(str);
        String str7 = "Name.identifier(name)";
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, str7);
        Collection properties = getProperties(identifier);
        ArrayList arrayList = new ArrayList();
        for (Object next : properties) {
            if (Intrinsics.areEqual((Object) RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) next).asString(), (Object) str5)) {
                arrayList.add(next);
            }
        }
        String str8 = ") not resolved in ";
        String str9 = "' (JVM signature: ";
        String str10 = "Property '";
        if (arrayList.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str10);
            sb2.append(str4);
            sb2.append(str9);
            sb2.append(str5);
            sb2.append(str8);
            sb2.append(this);
            throw new KotlinReflectionInternalError(sb2.toString());
        } else if (arrayList.size() == 1) {
            return (PropertyDescriptor) C13199w.m40599k((List) arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                Visibility visibility = ((PropertyDescriptor) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = C13170i0.m40333a(linkedHashMap, C12914x62283bb.INSTANCE).values();
            Intrinsics.checkReturnedValueIsNotNull((Object) values, "properties\n             …                }).values");
            List list = (List) C13199w.m40592h((Iterable) values);
            if (list.size() == 1) {
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "mostVisibleProperties");
                return (PropertyDescriptor) C13199w.m40589f(list);
            }
            Name identifier2 = Name.identifier(str);
            Intrinsics.checkReturnedValueIsNotNull((Object) identifier2, str7);
            String a = C13199w.m40559a(getProperties(identifier2), "\n", null, null, 0, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.INSTANCE, 30, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str10);
            sb3.append(str4);
            sb3.append(str9);
            sb3.append(str5);
            sb3.append(str8);
            sb3.append(this);
            sb3.append(':');
            if (a.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(10);
                sb4.append(a);
                str3 = sb4.toString();
            }
            sb3.append(str3);
            throw new KotlinReflectionInternalError(sb3.toString());
        }
    }

    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    public abstract Collection<FunctionDescriptor> getFunctions(Name name);

    public abstract PropertyDescriptor getLocalProperty(int i);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1 r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0014:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L_0x0044
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r6 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INVISIBLE_FAKE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0044
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L_0x0044
            kotlin.v r4 = kotlin.C13145v.f29587a
            java.lang.Object r3 = r3.accept(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            if (r3 == 0) goto L_0x0014
            r2.add(r3)
            goto L_0x0014
        L_0x004b:
            java.util.List r8 = kotlin.p590y.C13199w.m40606q(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive != null ? wrapperByPrimitive : getJClass();
    }

    public abstract Collection<PropertyDescriptor> getProperties(Name name);

    private final Method lookupMethod(Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2) {
        Object[] array = list.toArray(new Class[0]);
        String str2 = "null cannot be cast to non-null type kotlin.Array<T>";
        if (array != null) {
            Method lookupMethod = lookupMethod(cls, str, (Class<?>[]) (Class[]) array, cls2);
            if (lookupMethod != null) {
                return lookupMethod;
            }
            if (cls.isInterface()) {
                Class<Object> cls3 = Object.class;
                Object[] array2 = list.toArray(new Class[0]);
                if (array2 != null) {
                    Method lookupMethod2 = lookupMethod(cls3, str, (Class<?>[]) (Class[]) array2, cls2);
                    if (lookupMethod2 != null) {
                        return lookupMethod2;
                    }
                } else {
                    throw new C13142s(str2);
                }
            }
            return null;
        }
        throw new C13142s(str2);
    }
}
