package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;"))};
    private final FqName fqName;
    private final NotNullLazyValue fragments$delegate;
    private final MemberScope memberScope;
    private final ModuleDescriptorImpl module;

    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName2, StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName2.shortNameOrSpecial());
        this.module = moduleDescriptorImpl;
        this.fqName = fqName2;
        this.fragments$delegate = storageManager.createLazyValue(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.memberScope = new LazyScopeAdapter(storageManager.createLazyValue(new LazyPackageViewDescriptorImpl$memberScope$1(this)));
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPackageViewDescriptor(this, d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PackageViewDescriptor)) {
            obj = null;
        }
        PackageViewDescriptor packageViewDescriptor = (PackageViewDescriptor) obj;
        if (packageViewDescriptor == null || !C12880j.m40224a((Object) getFqName(), (Object) packageViewDescriptor.getFqName()) || !C12880j.m40224a((Object) getModule(), (Object) packageViewDescriptor.getModule())) {
            return false;
        }
        return true;
    }

    public FqName getFqName() {
        return this.fqName;
    }

    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.fragments$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    public boolean isEmpty() {
        return DefaultImpls.isEmpty(this);
    }

    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        ModuleDescriptorImpl module2 = getModule();
        FqName parent = getFqName().parent();
        C12880j.m40222a((Object) parent, "fqName.parent()");
        return module2.getPackage(parent);
    }

    public ModuleDescriptorImpl getModule() {
        return this.module;
    }
}
