package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$renderConstant$1 extends C12881k implements Function1<ConstantValue<?>, String> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$renderConstant$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    public final String invoke(ConstantValue<?> constantValue) {
        return this.this$0.renderConstant(constantValue);
    }
}
