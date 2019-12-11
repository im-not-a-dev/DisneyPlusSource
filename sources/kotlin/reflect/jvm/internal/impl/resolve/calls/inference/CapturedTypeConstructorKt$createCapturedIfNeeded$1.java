package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: CapturedTypeConstructor.kt */
final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends C12881k implements Function0<KotlinType> {
    final /* synthetic */ TypeProjection $this_createCapturedIfNeeded;

    CapturedTypeConstructorKt$createCapturedIfNeeded$1(TypeProjection typeProjection) {
        this.$this_createCapturedIfNeeded = typeProjection;
        super(0);
    }

    public final KotlinType invoke() {
        KotlinType type = this.$this_createCapturedIfNeeded.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "this@createCapturedIfNeeded.type");
        return type;
    }
}
