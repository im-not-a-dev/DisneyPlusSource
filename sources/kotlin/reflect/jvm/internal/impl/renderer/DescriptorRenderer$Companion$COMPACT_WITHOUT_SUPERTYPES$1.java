package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: DescriptorRenderer.kt */
final class DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1 extends C12881k implements Function1<DescriptorRendererOptions, C13145v> {
    public static final DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1 INSTANCE = new DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1();

    DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return C13145v.f29587a;
    }

    public final void invoke(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.setWithDefinedIn(false);
        descriptorRendererOptions.setModifiers(C13188p0.m40531a());
        descriptorRendererOptions.setWithoutSuperTypes(true);
    }
}
