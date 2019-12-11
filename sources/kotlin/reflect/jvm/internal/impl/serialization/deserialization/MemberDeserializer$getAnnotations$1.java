package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$getAnnotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ MessageLite $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$getAnnotations$1(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.this$0 = memberDeserializer;
        this.$proto = messageLite;
        this.$kind = annotatedCallableKind;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer access$asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f29574c.getContainingDeclaration());
        List<AnnotationDescriptor> q = access$asProtoContainer != null ? C13199w.m40606q(this.this$0.f29574c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(access$asProtoContainer, this.$proto, this.$kind)) : null;
        return q != null ? q : C13185o.m40513a();
    }
}
