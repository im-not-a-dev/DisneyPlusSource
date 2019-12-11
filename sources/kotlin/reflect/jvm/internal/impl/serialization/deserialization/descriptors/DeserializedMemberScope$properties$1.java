package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$properties$1 extends C12881k implements Function1<Name, Collection<? extends PropertyDescriptor>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    DeserializedMemberScope$properties$1(DeserializedMemberScope deserializedMemberScope) {
        this.this$0 = deserializedMemberScope;
        super(1);
    }

    public final Collection<PropertyDescriptor> invoke(Name name) {
        return this.this$0.computeProperties(name);
    }
}
