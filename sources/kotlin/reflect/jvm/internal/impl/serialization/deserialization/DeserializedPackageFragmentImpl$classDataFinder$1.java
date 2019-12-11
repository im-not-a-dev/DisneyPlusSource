package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* compiled from: DeserializedPackageFragmentImpl.kt */
final class DeserializedPackageFragmentImpl$classDataFinder$1 extends C12881k implements Function1<ClassId, SourceElement> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.this$0 = deserializedPackageFragmentImpl;
        super(1);
    }

    public final SourceElement invoke(ClassId classId) {
        DeserializedContainerSource access$getContainerSource$p = this.this$0.containerSource;
        if (access$getContainerSource$p != null) {
            return access$getContainerSource$p;
        }
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C12880j.m40222a((Object) sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }
}
