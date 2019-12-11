package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* compiled from: context.kt */
public final class JavaTypeQualifiersByElementType {
    private final EnumMap<QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> nullabilityQualifiers;

    public JavaTypeQualifiersByElementType(EnumMap<QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> enumMap) {
        this.nullabilityQualifiers = enumMap;
    }

    public final JavaTypeQualifiers get(QualifierApplicabilityType qualifierApplicabilityType) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) this.nullabilityQualifiers.get(qualifierApplicabilityType);
        if (nullabilityQualifierWithMigrationStatus == null) {
            return null;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) nullabilityQualifierWithMigrationStatus, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new JavaTypeQualifiers(nullabilityQualifierWithMigrationStatus.getQualifier(), null, false, nullabilityQualifierWithMigrationStatus.isForWarningOnly());
    }

    public final EnumMap<QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> getNullabilityQualifiers() {
        return this.nullabilityQualifiers;
    }
}
