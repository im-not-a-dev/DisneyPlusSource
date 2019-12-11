package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    private final TypeSubstitution first;
    private final TypeSubstitution second;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class Companion {
        private Companion() {
        }

        public final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
            if (typeSubstitution.isEmpty()) {
                return typeSubstitution2;
            }
            if (typeSubstitution2.isEmpty()) {
                return typeSubstitution;
            }
            return new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }

    public static final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    public boolean approximateCapturedTypes() {
        return this.first.approximateCapturedTypes() || this.second.approximateCapturedTypes();
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.first.approximateContravariantCapturedTypes() || this.second.approximateContravariantCapturedTypes();
    }

    public Annotations filterAnnotations(Annotations annotations) {
        return this.second.filterAnnotations(this.first.filterAnnotations(annotations));
    }

    public TypeProjection get(KotlinType kotlinType) {
        TypeProjection typeProjection = this.first.get(kotlinType);
        return typeProjection != null ? typeProjection : this.second.get(kotlinType);
    }

    public boolean isEmpty() {
        return false;
    }

    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(kotlinType, variance), variance);
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.first = typeSubstitution;
        this.second = typeSubstitution2;
    }
}
