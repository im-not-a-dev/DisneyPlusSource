package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: signatureEnhancement.kt */
final class TypeAndDefaultQualifiers {
    private final JavaTypeQualifiers defaultQualifiers;
    private final KotlinType type;

    public TypeAndDefaultQualifiers(KotlinType kotlinType, JavaTypeQualifiers javaTypeQualifiers) {
        this.type = kotlinType;
        this.defaultQualifiers = javaTypeQualifiers;
    }

    public final KotlinType component1() {
        return this.type;
    }

    public final JavaTypeQualifiers component2() {
        return this.defaultQualifiers;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.defaultQualifiers, (java.lang.Object) r3.defaultQualifiers) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r3
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r2.type
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r3.type
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = r2.defaultQualifiers
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = r3.defaultQualifiers
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers.equals(java.lang.Object):boolean");
    }

    public final KotlinType getType() {
        return this.type;
    }

    public int hashCode() {
        KotlinType kotlinType = this.type;
        int i = 0;
        int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
        JavaTypeQualifiers javaTypeQualifiers = this.defaultQualifiers;
        if (javaTypeQualifiers != null) {
            i = javaTypeQualifiers.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TypeAndDefaultQualifiers(type=");
        sb.append(this.type);
        sb.append(", defaultQualifiers=");
        sb.append(this.defaultQualifiers);
        sb.append(")");
        return sb.toString();
    }
}
