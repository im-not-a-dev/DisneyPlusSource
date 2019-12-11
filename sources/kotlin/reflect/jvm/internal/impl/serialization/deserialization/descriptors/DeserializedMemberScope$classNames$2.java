package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$classNames$2 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ Function0 $classNames;

    DeserializedMemberScope$classNames$2(Function0 function0) {
        this.$classNames = function0;
        super(0);
    }

    public final Set<Name> invoke() {
        return C13199w.m40609t((Iterable) this.$classNames.invoke());
    }
}
