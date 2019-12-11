package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: specialBuiltinMembers.kt */
final class NameAndSignature {
    private final Name name;
    private final String signature;

    public NameAndSignature(Name name2, String str) {
        this.name = name2;
        this.signature = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.signature, (java.lang.Object) r3.signature) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature r3 = (kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature) r3
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r2.name
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r3.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.signature
            java.lang.String r3 = r3.signature
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature.equals(java.lang.Object):boolean");
    }

    public final Name getName() {
        return this.name;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        Name name2 = this.name;
        int i = 0;
        int hashCode = (name2 != null ? name2.hashCode() : 0) * 31;
        String str = this.signature;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NameAndSignature(name=");
        sb.append(this.name);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(")");
        return sb.toString();
    }
}
