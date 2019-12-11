package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* compiled from: context.kt */
public final class NullabilityQualifierWithApplicability {
    private final NullabilityQualifierWithMigrationStatus nullabilityQualifier;
    private final Collection<QualifierApplicabilityType> qualifierApplicabilityTypes;

    public NullabilityQualifierWithApplicability(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection<? extends QualifierApplicabilityType> collection) {
        this.nullabilityQualifier = nullabilityQualifierWithMigrationStatus;
        this.qualifierApplicabilityTypes = collection;
    }

    public final NullabilityQualifierWithMigrationStatus component1() {
        return this.nullabilityQualifier;
    }

    public final Collection<QualifierApplicabilityType> component2() {
        return this.qualifierApplicabilityTypes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.qualifierApplicabilityTypes, (java.lang.Object) r3.qualifierApplicabilityTypes) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability
            if (r0 == 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r0 = r2.nullabilityQualifier
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r1 = r3.nullabilityQualifier
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType> r0 = r2.qualifierApplicabilityTypes
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType> r3 = r3.qualifierApplicabilityTypes
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = this.nullabilityQualifier;
        int i = 0;
        int hashCode = (nullabilityQualifierWithMigrationStatus != null ? nullabilityQualifierWithMigrationStatus.hashCode() : 0) * 31;
        Collection<QualifierApplicabilityType> collection = this.qualifierApplicabilityTypes;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        sb.append(this.nullabilityQualifier);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.qualifierApplicabilityTypes);
        sb.append(")");
        return sb.toString();
    }
}
