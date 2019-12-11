package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$typeAliasByName$1 extends C12881k implements Function1<Name, TypeAliasDescriptor> {
    final /* synthetic */ DeserializedMemberScope this$0;

    DeserializedMemberScope$typeAliasByName$1(DeserializedMemberScope deserializedMemberScope) {
        this.this$0 = deserializedMemberScope;
        super(1);
    }

    public final TypeAliasDescriptor invoke(Name name) {
        return this.this$0.createTypeAlias(name);
    }
}
