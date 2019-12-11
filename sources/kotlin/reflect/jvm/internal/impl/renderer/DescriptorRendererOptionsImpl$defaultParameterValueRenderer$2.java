package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* compiled from: DescriptorRendererOptionsImpl.kt */
final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends C12881k implements Function1<ValueParameterDescriptor, String> {
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 INSTANCE = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    public final String invoke(ValueParameterDescriptor valueParameterDescriptor) {
        return "...";
    }
}
