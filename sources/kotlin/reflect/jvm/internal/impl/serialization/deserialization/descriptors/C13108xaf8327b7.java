package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 */
/* compiled from: DeserializedClassDescriptor.kt */
final class C13108xaf8327b7 extends C12881k implements Function1<Name, EnumEntrySyntheticClassDescriptor> {
    final /* synthetic */ EnumEntryClassDescriptors this$0;

    C13108xaf8327b7(EnumEntryClassDescriptors enumEntryClassDescriptors) {
        this.this$0 = enumEntryClassDescriptors;
        super(1);
    }

    public final EnumEntrySyntheticClassDescriptor invoke(Name name) {
        EnumEntry enumEntry = (EnumEntry) this.this$0.enumEntryProtos.get(name);
        if (enumEntry == null) {
            return null;
        }
        StorageManager storageManager = DeserializedClassDescriptor.this.getC().getStorageManager();
        EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
        return EnumEntrySyntheticClassDescriptor.create(storageManager, DeserializedClassDescriptor.this, name, enumEntryClassDescriptors.enumMemberNames, new DeserializedAnnotations(DeserializedClassDescriptor.this.getC().getStorageManager(), new C13103x7c5aab78(enumEntry, this, name)), SourceElement.NO_SOURCE);
    }
}
