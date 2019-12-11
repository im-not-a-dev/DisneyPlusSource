package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C12880j;

/* compiled from: signatureEnhancement.kt */
public final class NullabilityQualifierWithMigrationStatus {
    private final boolean isForWarningOnly;
    private final NullabilityQualifier qualifier;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z) {
        this.qualifier = nullabilityQualifier;
        this.isForWarningOnly = z;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.qualifier;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.isForWarningOnly;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z);
    }

    public final NullabilityQualifierWithMigrationStatus copy(NullabilityQualifier nullabilityQualifier, boolean z) {
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NullabilityQualifierWithMigrationStatus) {
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
                if (C12880j.m40224a((Object) this.qualifier, (Object) nullabilityQualifierWithMigrationStatus.qualifier)) {
                    if (this.isForWarningOnly == nullabilityQualifierWithMigrationStatus.isForWarningOnly) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final NullabilityQualifier getQualifier() {
        return this.qualifier;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.qualifier;
        int hashCode = (nullabilityQualifier != null ? nullabilityQualifier.hashCode() : 0) * 31;
        boolean z = this.isForWarningOnly;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.qualifier);
        sb.append(", isForWarningOnly=");
        sb.append(this.isForWarningOnly);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(nullabilityQualifier, z);
    }
}
