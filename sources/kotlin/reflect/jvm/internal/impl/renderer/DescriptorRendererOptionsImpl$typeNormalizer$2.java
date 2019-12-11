package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: DescriptorRendererOptionsImpl.kt */
final class DescriptorRendererOptionsImpl$typeNormalizer$2 extends C12881k implements Function1<KotlinType, KotlinType> {
    public static final DescriptorRendererOptionsImpl$typeNormalizer$2 INSTANCE = new DescriptorRendererOptionsImpl$typeNormalizer$2();

    DescriptorRendererOptionsImpl$typeNormalizer$2() {
        super(1);
    }

    public final KotlinType invoke(KotlinType kotlinType) {
        return kotlinType;
    }
}
