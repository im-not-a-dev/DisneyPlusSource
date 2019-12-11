package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: CompositePackageFragmentProvider.kt */
public final class CompositePackageFragmentProvider implements PackageFragmentProvider {
    private final List<PackageFragmentProvider> providers;

    public CompositePackageFragmentProvider(List<? extends PackageFragmentProvider> list) {
        this.providers = list;
    }

    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        ArrayList arrayList = new ArrayList();
        for (PackageFragmentProvider packageFragments : this.providers) {
            arrayList.addAll(packageFragments.getPackageFragments(fqName));
        }
        return C13199w.m40606q(arrayList);
    }

    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        HashSet hashSet = new HashSet();
        for (PackageFragmentProvider subPackagesOf : this.providers) {
            hashSet.addAll(subPackagesOf.getSubPackagesOf(fqName, function1));
        }
        return hashSet;
    }
}
