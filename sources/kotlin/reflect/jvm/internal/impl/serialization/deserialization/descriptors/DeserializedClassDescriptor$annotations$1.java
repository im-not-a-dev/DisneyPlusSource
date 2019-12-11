package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$annotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    DeserializedClassDescriptor$annotations$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.this$0 = deserializedClassDescriptor;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        return C13199w.m40606q(this.this$0.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(this.this$0.getThisAsProtoContainer$deserialization()));
    }
}
