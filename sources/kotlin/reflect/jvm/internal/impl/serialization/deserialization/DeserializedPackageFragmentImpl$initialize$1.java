package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeserializedPackageFragmentImpl.kt */
final class DeserializedPackageFragmentImpl$initialize$1 extends C12881k implements Function0<List<? extends Name>> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    DeserializedPackageFragmentImpl$initialize$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.this$0 = deserializedPackageFragmentImpl;
        super(0);
    }

    public final List<Name> invoke() {
        Collection allClassIds = this.this$0.getClassDataFinder().getAllClassIds();
        ArrayList<ClassId> arrayList = new ArrayList<>();
        for (Object next : allClassIds) {
            ClassId classId = (ClassId) next;
            if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (ClassId shortClassName : arrayList) {
            arrayList2.add(shortClassName.getShortClassName());
        }
        return arrayList2;
    }
}
