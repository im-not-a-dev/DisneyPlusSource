package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 */
/* compiled from: CapturedTypeApproximation.kt */
public final class C13130x12aaa596 extends TypeConstructorSubstitution {
    C13130x12aaa596() {
    }

    public TypeProjection get(TypeConstructor typeConstructor) {
        if (!(typeConstructor instanceof CapturedTypeConstructor)) {
            typeConstructor = null;
        }
        CapturedTypeConstructor capturedTypeConstructor = (CapturedTypeConstructor) typeConstructor;
        if (capturedTypeConstructor == null) {
            return null;
        }
        if (capturedTypeConstructor.getProjection().isStarProjection()) {
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType());
        }
        return capturedTypeConstructor.getProjection();
    }
}
