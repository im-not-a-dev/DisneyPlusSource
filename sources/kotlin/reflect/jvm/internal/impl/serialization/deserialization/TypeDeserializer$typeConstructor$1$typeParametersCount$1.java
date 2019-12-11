package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$typeConstructor$1$typeParametersCount$1 extends C12881k implements Function1<Type, Type> {
    final /* synthetic */ TypeDeserializer$typeConstructor$1 this$0;

    TypeDeserializer$typeConstructor$1$typeParametersCount$1(TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1) {
        this.this$0 = typeDeserializer$typeConstructor$1;
        super(1);
    }

    public final Type invoke(Type type) {
        return ProtoTypeTableUtilKt.outerType(type, this.this$0.this$0.f29576c.getTypeTable());
    }
}
