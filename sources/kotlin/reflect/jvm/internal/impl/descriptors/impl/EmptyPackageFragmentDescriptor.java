package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

/* compiled from: EmptyPackageFragmentDesciptor.kt */
public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    public EmptyPackageFragmentDescriptor(ModuleDescriptor moduleDescriptor, FqName fqName) {
        super(moduleDescriptor, fqName);
    }

    public Empty getMemberScope() {
        return Empty.INSTANCE;
    }
}
