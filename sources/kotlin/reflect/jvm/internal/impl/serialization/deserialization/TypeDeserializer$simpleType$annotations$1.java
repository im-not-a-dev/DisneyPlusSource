package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$simpleType$annotations$1 extends C12881k implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, Type type) {
        this.this$0 = typeDeserializer;
        this.$proto = type;
        super(0);
    }

    public final List<AnnotationDescriptor> invoke() {
        return this.this$0.f29576c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(this.$proto, this.this$0.f29576c.getNameResolver());
    }
}
