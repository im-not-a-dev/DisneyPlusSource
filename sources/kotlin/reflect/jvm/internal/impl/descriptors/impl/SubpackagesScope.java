package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: SubpackagesScope.kt */
public class SubpackagesScope extends MemberScopeImpl {
    private final FqName fqName;
    private final ModuleDescriptor moduleDescriptor;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor2, FqName fqName2) {
        this.moduleDescriptor = moduleDescriptor2;
        this.fqName = fqName2;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return C13185o.m40513a();
        }
        if (this.fqName.isRoot() && descriptorKindFilter.getExcludes().contains(TopLevelPackages.INSTANCE)) {
            return C13185o.m40513a();
        }
        Collection<FqName> subPackagesOf = this.moduleDescriptor.getSubPackagesOf(this.fqName, function1);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        for (FqName shortName : subPackagesOf) {
            Name shortName2 = shortName.shortName();
            Intrinsics.checkReturnedValueIsNotNull((Object) shortName2, "subFqName.shortName()");
            if (((Boolean) function1.invoke(shortName2)).booleanValue()) {
                CollectionsKt.addIfNotNull(arrayList, getPackage(shortName2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final PackageViewDescriptor getPackage(Name name) {
        if (name.isSpecial()) {
            return null;
        }
        ModuleDescriptor moduleDescriptor2 = this.moduleDescriptor;
        FqName child = this.fqName.child(name);
        Intrinsics.checkReturnedValueIsNotNull((Object) child, "fqName.child(name)");
        PackageViewDescriptor packageViewDescriptor = moduleDescriptor2.getPackage(child);
        if (packageViewDescriptor.isEmpty()) {
            return null;
        }
        return packageViewDescriptor;
    }
}
