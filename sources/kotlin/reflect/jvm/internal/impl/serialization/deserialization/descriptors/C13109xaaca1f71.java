package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 */
/* compiled from: DeserializedClassDescriptor.kt */
final class C13109xaaca1f71 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ EnumEntryClassDescriptors this$0;

    C13109xaaca1f71(EnumEntryClassDescriptors enumEntryClassDescriptors) {
        this.this$0 = enumEntryClassDescriptors;
        super(0);
    }

    public final Set<Name> invoke() {
        return this.this$0.computeEnumMemberNames();
    }
}
