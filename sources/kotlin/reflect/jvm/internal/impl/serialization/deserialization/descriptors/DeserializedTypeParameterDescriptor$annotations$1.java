package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
final class DeserializedTypeParameterDescriptor$annotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ DeserializedTypeParameterDescriptor this$0;

    DeserializedTypeParameterDescriptor$annotations$1(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        this.this$0 = deserializedTypeParameterDescriptor;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        return C13199w.m40606q(this.this$0.f29579c.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(this.this$0.getProto(), this.this$0.f29579c.getNameResolver()));
    }
}
