package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$appendTypeProjections$1 extends C12881k implements Function1<TypeProjection, CharSequence> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        this.this$0 = descriptorRendererImpl;
        super(1);
    }

    public final CharSequence invoke(TypeProjection typeProjection) {
        if (typeProjection.isStarProjection()) {
            return "*";
        }
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        KotlinType type = typeProjection.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "it.type");
        String renderType = descriptorRendererImpl.renderType(type);
        if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return renderType;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(typeProjection.getProjectionKind());
        sb.append(' ');
        sb.append(renderType);
        return sb.toString();
    }
}
