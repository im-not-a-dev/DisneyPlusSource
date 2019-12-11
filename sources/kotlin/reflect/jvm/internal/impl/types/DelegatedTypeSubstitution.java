package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: TypeSubstitution.kt */
public class DelegatedTypeSubstitution extends TypeSubstitution {
    private final TypeSubstitution substitution;

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        this.substitution = typeSubstitution;
    }

    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    public Annotations filterAnnotations(Annotations annotations) {
        return this.substitution.filterAnnotations(annotations);
    }

    public TypeProjection get(KotlinType kotlinType) {
        return this.substitution.get(kotlinType);
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        return this.substitution.prepareTopLevelType(kotlinType, variance);
    }
}
