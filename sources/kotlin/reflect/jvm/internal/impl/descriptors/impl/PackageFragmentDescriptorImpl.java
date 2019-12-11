package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {
    private final FqName fqName;

    public PackageFragmentDescriptorImpl(ModuleDescriptor moduleDescriptor, FqName fqName2) {
        super(moduleDescriptor, Annotations.Companion.getEMPTY(), fqName2.shortNameOrSpecial(), SourceElement.NO_SOURCE);
        this.fqName = fqName2;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPackageFragmentDescriptor(this, d);
    }

    public final FqName getFqName() {
        return this.fqName;
    }

    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C12880j.m40222a((Object) sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package ");
        sb.append(this.fqName);
        return sb.toString();
    }

    public ModuleDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        if (containingDeclaration != null) {
            return (ModuleDescriptor) containingDeclaration;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }
}
