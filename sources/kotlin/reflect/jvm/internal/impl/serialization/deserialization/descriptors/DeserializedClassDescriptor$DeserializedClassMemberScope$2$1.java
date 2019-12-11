package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 extends C12881k implements Function0<List<? extends Name>> {
    final /* synthetic */ List $it;

    DeserializedClassDescriptor$DeserializedClassMemberScope$2$1(List list) {
        this.$it = list;
        super(0);
    }

    public final List<Name> invoke() {
        return this.$it;
    }
}
