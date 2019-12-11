package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$loadProperty$3 extends C12881k implements Function0<ConstantValue<?>> {
    final /* synthetic */ DeserializedPropertyDescriptor $property;
    final /* synthetic */ Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    MemberDeserializer$loadProperty$3(MemberDeserializer memberDeserializer, Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.this$0 = memberDeserializer;
        this.$proto = property;
        this.$property = deserializedPropertyDescriptor;
        super(0);
    }

    public final ConstantValue<?> invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer access$asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f29574c.getContainingDeclaration());
        if (access$asProtoContainer != null) {
            AnnotationAndConstantLoader annotationAndConstantLoader = this.this$0.f29574c.getComponents().getAnnotationAndConstantLoader();
            Property property = this.$proto;
            KotlinType returnType = this.$property.getReturnType();
            Intrinsics.checkReturnedValueIsNotNull((Object) returnType, "property.returnType");
            return (ConstantValue) annotationAndConstantLoader.loadPropertyConstant(access$asProtoContainer, property, returnType);
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
