package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: PackageFragmentProviderImpl.kt */
final class PackageFragmentProviderImpl$getSubPackagesOf$1 extends C12881k implements Function1<PackageFragmentDescriptor, FqName> {
    public static final PackageFragmentProviderImpl$getSubPackagesOf$1 INSTANCE = new PackageFragmentProviderImpl$getSubPackagesOf$1();

    PackageFragmentProviderImpl$getSubPackagesOf$1() {
        super(1);
    }

    public final FqName invoke(PackageFragmentDescriptor packageFragmentDescriptor) {
        return packageFragmentDescriptor.getFqName();
    }
}
