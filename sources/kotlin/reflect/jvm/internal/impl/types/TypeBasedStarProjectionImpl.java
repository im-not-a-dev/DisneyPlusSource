package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: StarProjectionImpl.kt */
public final class TypeBasedStarProjectionImpl extends TypeProjectionBase {
    private final KotlinType _type;

    public TypeBasedStarProjectionImpl(KotlinType kotlinType) {
        this._type = kotlinType;
    }

    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    public KotlinType getType() {
        return this._type;
    }

    public boolean isStarProjection() {
        return true;
    }
}
