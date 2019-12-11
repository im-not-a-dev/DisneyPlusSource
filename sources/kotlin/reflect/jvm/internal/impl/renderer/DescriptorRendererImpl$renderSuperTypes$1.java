package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$renderSuperTypes$1 extends C12881k implements Function1<KotlinType, String> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$renderSuperTypes$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    public final String invoke(KotlinType kotlinType) {
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        C12880j.m40222a((Object) kotlinType, "it");
        return descriptorRendererImpl.renderType(kotlinType);
    }
}
