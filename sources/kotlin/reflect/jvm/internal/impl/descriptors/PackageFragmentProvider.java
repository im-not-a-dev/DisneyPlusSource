package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: PackageFragmentProvider.kt */
public interface PackageFragmentProvider {
    List<PackageFragmentDescriptor> getPackageFragments(FqName fqName);

    Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1);
}
