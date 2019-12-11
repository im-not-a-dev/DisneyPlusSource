package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$getReceiverParameterAnnotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ MessageLite $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.this$0 = memberDeserializer;
        this.$proto = messageLite;
        this.$kind = annotatedCallableKind;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer access$asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f29574c.getContainingDeclaration());
        List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations = access$asProtoContainer != null ? this.this$0.f29574c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(access$asProtoContainer, this.$proto, this.$kind) : null;
        return loadExtensionReceiverParameterAnnotations != null ? loadExtensionReceiverParameterAnnotations : C13185o.m40513a();
    }
}
