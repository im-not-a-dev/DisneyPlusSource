package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* compiled from: CapturedTypeApproximation.kt */
final class CapturedTypeApproximationKt$approximateCapturedTypes$1 extends C12881k implements Function1<KotlinType, KotlinType> {
    final /* synthetic */ KotlinType $type;

    CapturedTypeApproximationKt$approximateCapturedTypes$1(KotlinType kotlinType) {
        this.$type = kotlinType;
        super(1);
    }

    public final KotlinType invoke(KotlinType kotlinType) {
        KotlinType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType, this.$type.isMarkedNullable());
        Intrinsics.checkReturnedValueIsNotNull((Object) makeNullableIfNeeded, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
        return makeNullableIfNeeded;
    }
}
