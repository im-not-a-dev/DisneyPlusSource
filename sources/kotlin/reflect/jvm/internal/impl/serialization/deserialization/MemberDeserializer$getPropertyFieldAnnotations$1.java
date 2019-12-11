package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$getPropertyFieldAnnotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ boolean $isDelegate;
    final /* synthetic */ Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z, Property property) {
        this.this$0 = memberDeserializer;
        this.$isDelegate = z;
        this.$proto = property;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer access$asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f29574c.getContainingDeclaration());
        List<AnnotationDescriptor> list = access$asProtoContainer != null ? this.$isDelegate ? C13199w.m40606q(this.this$0.f29574c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(access$asProtoContainer, this.$proto)) : C13199w.m40606q(this.this$0.f29574c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(access$asProtoContainer, this.$proto)) : null;
        return list != null ? list : C13185o.m40513a();
    }
}
