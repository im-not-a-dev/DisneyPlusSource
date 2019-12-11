package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

public interface TypeProjection extends TypeArgumentMarker {
    Variance getProjectionKind();

    KotlinType getType();

    boolean isStarProjection();
}
