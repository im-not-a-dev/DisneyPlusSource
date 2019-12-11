package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 */
/* compiled from: ModuleDescriptorImpl.kt */
final class C12962x39a25915 extends C12881k implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    C12962x39a25915(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.this$0 = moduleDescriptorImpl;
        super(0);
    }

    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies access$getDependencies$p = this.this$0.dependencies;
        if (access$getDependencies$p != null) {
            List<ModuleDescriptorImpl> allDependencies = access$getDependencies$p.getAllDependencies();
            boolean contains = allDependencies.contains(this.this$0);
            if (!C13147x.f29590a || contains) {
                for (ModuleDescriptorImpl moduleDescriptorImpl : allDependencies) {
                    boolean access$isInitialized$p = moduleDescriptorImpl.isInitialized();
                    if (C13147x.f29590a && !access$isInitialized$p) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Dependency module ");
                        sb.append(moduleDescriptorImpl.getId());
                        sb.append(" was not initialized by the time contents of dependent module ");
                        sb.append(this.this$0.getId());
                        sb.append(" were queried");
                        throw new AssertionError(sb.toString());
                    }
                }
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) allDependencies, 10));
                for (ModuleDescriptorImpl access$getPackageFragmentProviderForModuleContent$p : allDependencies) {
                    PackageFragmentProvider access$getPackageFragmentProviderForModuleContent$p2 = access$getPackageFragmentProviderForModuleContent$p.packageFragmentProviderForModuleContent;
                    if (access$getPackageFragmentProviderForModuleContent$p2 != null) {
                        arrayList.add(access$getPackageFragmentProviderForModuleContent$p2);
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                return new CompositePackageFragmentProvider(arrayList);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Module ");
            sb2.append(this.this$0.getId());
            sb2.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Dependencies of module ");
        sb3.append(this.this$0.getId());
        sb3.append(" were not set before querying module content");
        throw new AssertionError(sb3.toString());
    }
}
