package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 */
/* compiled from: CapturedTypeApproximation.kt */
final class C13129x21acc51c extends C12881k implements Function1<UnwrappedType, Boolean> {
    public static final C13129x21acc51c INSTANCE = new C13129x21acc51c();

    C13129x21acc51c() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((UnwrappedType) obj));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        C12880j.m40222a((Object) unwrappedType, "it");
        return CapturedTypeConstructorKt.isCaptured(unwrappedType);
    }
}
