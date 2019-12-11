package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: PackageFragmentProviderImpl.kt */
final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends C12881k implements Function1<FqName, Boolean> {
    final /* synthetic */ FqName $fqName;

    PackageFragmentProviderImpl$getSubPackagesOf$2(FqName fqName) {
        this.$fqName = fqName;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((FqName) obj));
    }

    public final boolean invoke(FqName fqName) {
        return !fqName.isRoot() && Intrinsics.areEqual((Object) fqName.parent(), (Object) this.$fqName);
    }
}
