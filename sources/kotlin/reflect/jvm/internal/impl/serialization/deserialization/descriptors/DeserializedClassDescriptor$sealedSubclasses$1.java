package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$sealedSubclasses$1 extends C12881k implements Function0<Collection<? extends ClassDescriptor>> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.this$0 = deserializedClassDescriptor;
        super(0);
    }

    public final Collection<ClassDescriptor> invoke() {
        return this.this$0.computeSubclassesForSealedClass();
    }
}
