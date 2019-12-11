package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "T", "", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "Lkotlin/ParameterName;", "name", "proto", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends C12879i implements Function2<MemberDeserializer, Property, PropertyDescriptor> {
    public static final KClassImpl$getLocalProperty$2$1$1 INSTANCE = new KClassImpl$getLocalProperty$2$1$1();

    KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    public final String getName() {
        return "loadProperty";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    public final PropertyDescriptor invoke(MemberDeserializer memberDeserializer, Property property) {
        return memberDeserializer.loadProperty(property);
    }
}
