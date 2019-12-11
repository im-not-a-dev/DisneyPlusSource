package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$simpleType$1 extends C12881k implements Function1<Type, List<? extends Argument>> {
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$simpleType$1(TypeDeserializer typeDeserializer) {
        this.this$0 = typeDeserializer;
        super(1);
    }

    public final List<Argument> invoke(Type type) {
        List argumentList = type.getArgumentList();
        Intrinsics.checkReturnedValueIsNotNull((Object) argumentList, "argumentList");
        Type outerType = ProtoTypeTableUtilKt.outerType(type, this.this$0.f29576c.getTypeTable());
        List invoke = outerType != null ? invoke(outerType) : null;
        if (invoke == null) {
            invoke = C13185o.m40513a();
        }
        return C13199w.m40583d((Collection) argumentList, (Iterable) invoke);
    }
}
