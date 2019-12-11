package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$typeAliasDescriptors$1 extends C12881k implements Function1<Integer, ClassifierDescriptor> {
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$typeAliasDescriptors$1(TypeDeserializer typeDeserializer) {
        this.this$0 = typeDeserializer;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final ClassifierDescriptor invoke(int i) {
        return this.this$0.computeTypeAliasDescriptor(i);
    }
}
