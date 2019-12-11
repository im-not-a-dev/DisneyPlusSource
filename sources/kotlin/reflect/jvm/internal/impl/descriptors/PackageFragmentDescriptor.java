package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: PackageFragmentDescriptor.kt */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    ModuleDescriptor getContainingDeclaration();

    FqName getFqName();

    MemberScope getMemberScope();
}
