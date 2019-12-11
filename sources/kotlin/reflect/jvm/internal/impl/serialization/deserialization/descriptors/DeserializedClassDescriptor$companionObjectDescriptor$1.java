package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$companionObjectDescriptor$1 extends C12881k implements Function0<ClassDescriptor> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    DeserializedClassDescriptor$companionObjectDescriptor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.this$0 = deserializedClassDescriptor;
        super(0);
    }

    public final ClassDescriptor invoke() {
        return this.this$0.computeCompanionObjectDescriptor();
    }
}
