package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 */
/* compiled from: CapturedTypeApproximation.kt */
final class C13131x8e300b6 extends C12881k implements Function1<DescriptorRendererOptions, C13145v> {
    public static final C13131x8e300b6 INSTANCE = new C13131x8e300b6();

    C13131x8e300b6() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return C13145v.f29587a;
    }

    public final void invoke(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.setClassifierNamePolicy(FULLY_QUALIFIED.INSTANCE);
    }
}
