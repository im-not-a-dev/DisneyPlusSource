package kotlin.reflect.jvm;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\",\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"value", "", "isAccessible", "Lkotlin/reflect/KCallable;", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: KCallablesJvm.kt */
public final class KCallablesJvm {
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isAccessible(kotlin.reflect.KCallable<?> r5) {
        /*
            boolean r0 = r5 instanceof kotlin.reflect.KMutableProperty
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r5
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            java.lang.reflect.Field r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r3 == 0) goto L_0x0014
            boolean r3 = r3.isAccessible()
            goto L_0x0015
        L_0x0014:
            r3 = 1
        L_0x0015:
            if (r3 == 0) goto L_0x00f8
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r0)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isAccessible()
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x00f8
            kotlin.reflect.KMutableProperty r5 = (kotlin.reflect.KMutableProperty) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaSetter(r5)
            if (r5 == 0) goto L_0x0032
            boolean r5 = r5.isAccessible()
            goto L_0x0033
        L_0x0032:
            r5 = 1
        L_0x0033:
            if (r5 == 0) goto L_0x00f8
            goto L_0x0058
        L_0x0036:
            boolean r0 = r5 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L_0x005b
            kotlin.reflect.KProperty r5 = (kotlin.reflect.KProperty) r5
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r5)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isAccessible()
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 == 0) goto L_0x00f8
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r5)
            if (r5 == 0) goto L_0x0055
            boolean r5 = r5.isAccessible()
            goto L_0x0056
        L_0x0055:
            r5 = 1
        L_0x0056:
            if (r5 == 0) goto L_0x00f8
        L_0x0058:
            r1 = 1
            goto L_0x00f8
        L_0x005b:
            boolean r0 = r5 instanceof kotlin.reflect.KProperty.Getter
            if (r0 == 0) goto L_0x0085
            r0 = r5
            kotlin.reflect.KProperty$Getter r0 = (kotlin.reflect.KProperty.Getter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.isAccessible()
            goto L_0x0072
        L_0x0071:
            r0 = 1
        L_0x0072:
            if (r0 == 0) goto L_0x00f8
            kotlin.reflect.KFunction r5 = (kotlin.reflect.KFunction) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r5)
            if (r5 == 0) goto L_0x0081
            boolean r5 = r5.isAccessible()
            goto L_0x0082
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r5 == 0) goto L_0x00f8
            goto L_0x0058
        L_0x0085:
            boolean r0 = r5 instanceof kotlin.reflect.KMutableProperty.Setter
            if (r0 == 0) goto L_0x00af
            r0 = r5
            kotlin.reflect.KMutableProperty$Setter r0 = (kotlin.reflect.KMutableProperty.Setter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r0.isAccessible()
            goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            if (r0 == 0) goto L_0x00f8
            kotlin.reflect.KFunction r5 = (kotlin.reflect.KFunction) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r5)
            if (r5 == 0) goto L_0x00ab
            boolean r5 = r5.isAccessible()
            goto L_0x00ac
        L_0x00ab:
            r5 = 1
        L_0x00ac:
            if (r5 == 0) goto L_0x00f8
            goto L_0x0058
        L_0x00af:
            boolean r0 = r5 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L_0x00f9
            r0 = r5
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r0)
            if (r3 == 0) goto L_0x00c1
            boolean r3 = r3.isAccessible()
            goto L_0x00c2
        L_0x00c1:
            r3 = 1
        L_0x00c2:
            if (r3 == 0) goto L_0x00f8
            kotlin.reflect.jvm.internal.KCallableImpl r5 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r5)
            r3 = 0
            if (r5 == 0) goto L_0x00d6
            kotlin.reflect.jvm.internal.calls.Caller r5 = r5.getDefaultCaller()
            if (r5 == 0) goto L_0x00d6
            java.lang.reflect.Member r5 = r5.getMember()
            goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            boolean r4 = r5 instanceof java.lang.reflect.AccessibleObject
            if (r4 != 0) goto L_0x00dc
            r5 = r3
        L_0x00dc:
            java.lang.reflect.AccessibleObject r5 = (java.lang.reflect.AccessibleObject) r5
            if (r5 == 0) goto L_0x00e5
            boolean r5 = r5.isAccessible()
            goto L_0x00e6
        L_0x00e5:
            r5 = 1
        L_0x00e6:
            if (r5 == 0) goto L_0x00f8
            java.lang.reflect.Constructor r5 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(r0)
            if (r5 == 0) goto L_0x00f3
            boolean r5 = r5.isAccessible()
            goto L_0x00f4
        L_0x00f3:
            r5 = 1
        L_0x00f4:
            if (r5 == 0) goto L_0x00f8
            goto L_0x0058
        L_0x00f8:
            return r1
        L_0x00f9:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown callable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " ("
            r1.append(r2)
            java.lang.Class r5 = r5.getClass()
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.KCallablesJvm.isAccessible(kotlin.reflect.KCallable):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setAccessible(kotlin.reflect.KCallable<?> r3, boolean r4) {
        /*
            boolean r0 = r3 instanceof kotlin.reflect.KMutableProperty
            if (r0 == 0) goto L_0x0026
            r0 = r3
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            java.lang.reflect.Field r1 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r1 == 0) goto L_0x0010
            r1.setAccessible(r4)
        L_0x0010:
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r0)
            if (r0 == 0) goto L_0x0019
            r0.setAccessible(r4)
        L_0x0019:
            kotlin.reflect.KMutableProperty r3 = (kotlin.reflect.KMutableProperty) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaSetter(r3)
            if (r3 == 0) goto L_0x00b9
            r3.setAccessible(r4)
            goto L_0x00b9
        L_0x0026:
            boolean r0 = r3 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L_0x0040
            kotlin.reflect.KProperty r3 = (kotlin.reflect.KProperty) r3
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r3)
            if (r0 == 0) goto L_0x0035
            r0.setAccessible(r4)
        L_0x0035:
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r3)
            if (r3 == 0) goto L_0x00b9
            r3.setAccessible(r4)
            goto L_0x00b9
        L_0x0040:
            boolean r0 = r3 instanceof kotlin.reflect.KProperty.Getter
            if (r0 == 0) goto L_0x0060
            r0 = r3
            kotlin.reflect.KProperty$Getter r0 = (kotlin.reflect.KProperty.Getter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x0054
            r0.setAccessible(r4)
        L_0x0054:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r3)
            if (r3 == 0) goto L_0x00b9
            r3.setAccessible(r4)
            goto L_0x00b9
        L_0x0060:
            boolean r0 = r3 instanceof kotlin.reflect.KMutableProperty.Setter
            if (r0 == 0) goto L_0x0080
            r0 = r3
            kotlin.reflect.KMutableProperty$Setter r0 = (kotlin.reflect.KMutableProperty.Setter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x0074
            r0.setAccessible(r4)
        L_0x0074:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r3)
            if (r3 == 0) goto L_0x00b9
            r3.setAccessible(r4)
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r3 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L_0x00ba
            r0 = r3
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            java.lang.reflect.Method r1 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r0)
            if (r1 == 0) goto L_0x0090
            r1.setAccessible(r4)
        L_0x0090:
            kotlin.reflect.jvm.internal.KCallableImpl r3 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r3)
            r1 = 0
            if (r3 == 0) goto L_0x00a2
            kotlin.reflect.jvm.internal.calls.Caller r3 = r3.getDefaultCaller()
            if (r3 == 0) goto L_0x00a2
            java.lang.reflect.Member r3 = r3.getMember()
            goto L_0x00a3
        L_0x00a2:
            r3 = r1
        L_0x00a3:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 != 0) goto L_0x00a8
            r3 = r1
        L_0x00a8:
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            if (r3 == 0) goto L_0x00b0
            r1 = 1
            r3.setAccessible(r1)
        L_0x00b0:
            java.lang.reflect.Constructor r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(r0)
            if (r3 == 0) goto L_0x00b9
            r3.setAccessible(r4)
        L_0x00b9:
            return
        L_0x00ba:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.KCallablesJvm.setAccessible(kotlin.reflect.KCallable, boolean):void");
    }
}
