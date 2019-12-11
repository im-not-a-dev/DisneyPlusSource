package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends C12881k implements Function1<FqName, DeserializedPackageFragment> {
    final /* synthetic */ AbstractDeserializedPackageFragmentProvider this$0;

    AbstractDeserializedPackageFragmentProvider$fragments$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        this.this$0 = abstractDeserializedPackageFragmentProvider;
        super(1);
    }

    public final DeserializedPackageFragment invoke(FqName fqName) {
        DeserializedPackageFragment findPackage = this.this$0.findPackage(fqName);
        if (findPackage == null) {
            return null;
        }
        findPackage.initialize(this.this$0.getComponents());
        return findPackage;
    }
}
