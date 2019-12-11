package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: IncompatibleVersionErrorData.kt */
public final class IncompatibleVersionErrorData<T extends BinaryVersion> {
    private final T actualVersion;
    private final ClassId classId;
    private final T expectedVersion;
    private final String filePath;

    public IncompatibleVersionErrorData(T t, T t2, String str, ClassId classId2) {
        this.actualVersion = t;
        this.expectedVersion = t2;
        this.filePath = str;
        this.classId = classId2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.classId, (java.lang.Object) r3.classId) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData
            if (r0 == 0) goto L_0x0031
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData) r3
            T r0 = r2.actualVersion
            T r1 = r3.actualVersion
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            T r0 = r2.expectedVersion
            T r1 = r3.expectedVersion
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.filePath
            java.lang.String r1 = r3.filePath
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            kotlin.reflect.jvm.internal.impl.name.ClassId r0 = r2.classId
            kotlin.reflect.jvm.internal.impl.name.ClassId r3 = r3.classId
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        T t = this.actualVersion;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.expectedVersion;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.filePath;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ClassId classId2 = this.classId;
        if (classId2 != null) {
            i = classId2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.actualVersion);
        sb.append(", expectedVersion=");
        sb.append(this.expectedVersion);
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(", classId=");
        sb.append(this.classId);
        sb.append(")");
        return sb.toString();
    }
}
