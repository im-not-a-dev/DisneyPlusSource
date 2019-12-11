package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeApproximation.kt */
final class CapturedTypeApproximationKt$toTypeProjection$2 extends C12881k implements Function1<Variance, Variance> {
    final /* synthetic */ TypeArgument $this_toTypeProjection;

    CapturedTypeApproximationKt$toTypeProjection$2(TypeArgument typeArgument) {
        this.$this_toTypeProjection = typeArgument;
        super(1);
    }

    public final Variance invoke(Variance variance) {
        return variance == this.$this_toTypeProjection.getTypeParameter().getVariance() ? Variance.INVARIANT : variance;
    }
}
