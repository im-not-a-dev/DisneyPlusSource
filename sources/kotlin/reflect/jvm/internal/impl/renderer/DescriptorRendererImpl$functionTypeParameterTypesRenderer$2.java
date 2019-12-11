package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$functionTypeParameterTypesRenderer$2 extends C12881k implements Function0<DescriptorRenderer> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(0);
    }

    public final DescriptorRenderer invoke() {
        return this.this$0.withOptions(C130861.INSTANCE);
    }
}
