package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: typeEnhancement.kt */
final class EnhancementResult<T> {
    private final Annotations enhancementAnnotations;
    private final T result;

    public EnhancementResult(T t, Annotations annotations) {
        this.result = t;
        this.enhancementAnnotations = annotations;
    }

    public final T component1() {
        return this.result;
    }

    public final Annotations component2() {
        return this.enhancementAnnotations;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.enhancementAnnotations, (java.lang.Object) r3.enhancementAnnotations) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult) r3
            T r0 = r2.result
            T r1 = r3.result
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r2.enhancementAnnotations
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r3.enhancementAnnotations
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        T t = this.result;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Annotations annotations = this.enhancementAnnotations;
        if (annotations != null) {
            i = annotations.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnhancementResult(result=");
        sb.append(this.result);
        sb.append(", enhancementAnnotations=");
        sb.append(this.enhancementAnnotations);
        sb.append(")");
        return sb.toString();
    }
}
