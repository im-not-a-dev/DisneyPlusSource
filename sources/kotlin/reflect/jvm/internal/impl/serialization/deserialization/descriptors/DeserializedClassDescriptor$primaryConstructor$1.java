package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$primaryConstructor$1 extends C12881k implements Function0<ClassConstructorDescriptor> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    DeserializedClassDescriptor$primaryConstructor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.this$0 = deserializedClassDescriptor;
        super(0);
    }

    public final ClassConstructorDescriptor invoke() {
        return this.this$0.computePrimaryConstructor();
    }
}
