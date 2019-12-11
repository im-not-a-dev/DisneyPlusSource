package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: PackageFragmentProviderImpl.kt */
public final class PackageFragmentProviderImpl implements PackageFragmentProvider {
    private final Collection<PackageFragmentDescriptor> packageFragments;

    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> collection) {
        this.packageFragments = collection;
    }

    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        Collection<PackageFragmentDescriptor> collection = this.packageFragments;
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (Intrinsics.areEqual((Object) ((PackageFragmentDescriptor) next).getFqName(), (Object) fqName)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        return C12788p.m39999g(C12788p.m39989a(C12788p.m39994d(C13199w.m40577c((Iterable) this.packageFragments), PackageFragmentProviderImpl$getSubPackagesOf$1.INSTANCE), (Function1<? super T, Boolean>) new PackageFragmentProviderImpl$getSubPackagesOf$2<Object,Boolean>(fqName)));
    }
}
