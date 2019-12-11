package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProvider {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29553c;
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments = this.f29553c.getStorageManager().createCacheWithNotNullValues();

    public LazyJavaPackageFragmentProvider(JavaResolverComponents javaResolverComponents) {
        this.f29553c = new LazyJavaResolverContext(javaResolverComponents, EMPTY.INSTANCE, C12797j.m40009a(null));
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        JavaPackage findPackage = this.f29553c.getComponents().getFinder().findPackage(fqName);
        if (findPackage != null) {
            return (LazyJavaPackageFragment) this.packageFragments.computeIfAbsent(fqName, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, findPackage));
        }
        return null;
    }

    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        return C13185o.m40517b((Object) getPackageFragment(fqName));
    }

    public List<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm != null ? subPackageFqNames$descriptors_jvm : C13185o.m40513a();
    }
}
