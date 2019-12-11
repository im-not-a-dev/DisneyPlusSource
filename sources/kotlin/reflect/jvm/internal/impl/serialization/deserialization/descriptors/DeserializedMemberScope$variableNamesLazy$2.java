package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$variableNamesLazy$2 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    DeserializedMemberScope$variableNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        this.this$0 = deserializedMemberScope;
        super(0);
    }

    public final Set<Name> invoke() {
        return C13190q0.m40534a(this.this$0.propertyProtosBytes.keySet(), (Iterable) this.this$0.getNonDeclaredVariableNames());
    }
}
