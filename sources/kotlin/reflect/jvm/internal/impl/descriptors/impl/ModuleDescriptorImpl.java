package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13147x;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: ModuleDescriptorImpl.kt */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(ModuleDescriptorImpl.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    private final KotlinBuiltIns builtIns;
    private final Map<Object<?>, Object> capabilities;
    /* access modifiers changed from: private */
    public ModuleDependencies dependencies;
    private boolean isValid;
    /* access modifiers changed from: private */
    public PackageFragmentProvider packageFragmentProviderForModuleContent;
    private final Lazy packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> packages;
    private final TargetPlatform platform;
    private final Name stableName;
    /* access modifiers changed from: private */
    public final StorageManager storageManager;

    public ModuleDescriptorImpl(Name name, StorageManager storageManager2, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform) {
        this(name, storageManager2, kotlinBuiltIns, targetPlatform, null, null, 48, null);
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager2, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager2, kotlinBuiltIns, (i & 8) != 0 ? null : targetPlatform, (i & 16) != 0 ? C13173j0.m40350a() : map, (i & 32) != 0 ? null : name2);
    }

    /* access modifiers changed from: private */
    public final String getId() {
        String name = getName().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) name, "name.toString()");
        return name;
    }

    private final CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        Lazy lazy = this.packageFragmentProviderForWholeModuleWithDependencies$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (CompositePackageFragmentProvider) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    public void assertValid() {
        if (!isValid()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Accessing invalid module descriptor ");
            sb.append(this);
            throw new InvalidModuleException(sb.toString());
        }
    }

    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    public DeclarationDescriptor getContainingDeclaration() {
        return DefaultImpls.getContainingDeclaration(this);
    }

    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getExpectedByDependencies();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        sb.append(getId());
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    public PackageViewDescriptor getPackage(FqName fqName) {
        assertValid();
        return (PackageViewDescriptor) this.packages.invoke(fqName);
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void initialize(PackageFragmentProvider packageFragmentProvider) {
        boolean z = !isInitialized();
        if (!C13147x.f29590a || z) {
            this.packageFragmentProviderForModuleContent = packageFragmentProvider;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to initialize module ");
        sb.append(getId());
        sb.append(" twice");
        throw new AssertionError(sb.toString());
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(ModuleDependencies moduleDependencies) {
        boolean z = this.dependencies == null;
        if (!C13147x.f29590a || z) {
            this.dependencies = moduleDependencies;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of ");
        sb.append(getId());
        sb.append(" were already set");
        throw new AssertionError(sb.toString());
    }

    public boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor) {
        if (!Intrinsics.areEqual((Object) this, (Object) moduleDescriptor)) {
            ModuleDependencies moduleDependencies = this.dependencies;
            if (moduleDependencies == null) {
                Intrinsics.throwNpe();
                throw null;
            } else if (!C13199w.m40564a((Iterable) moduleDependencies.getModulesWhoseInternalsAreVisible(), (Object) moduleDescriptor) && !getExpectedByModules().contains(moduleDescriptor)) {
                return false;
            }
        }
        return true;
    }

    public ModuleDescriptorImpl(Name name, StorageManager storageManager2, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map<Object<?>, ? extends Object> map, Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        this.storageManager = storageManager2;
        this.builtIns = kotlinBuiltIns;
        this.platform = targetPlatform;
        this.capabilities = map;
        this.stableName = name2;
        if (name.isSpecial()) {
            this.isValid = true;
            this.packages = this.storageManager.createMemoizedFunction(new ModuleDescriptorImpl$packages$1(this));
            this.packageFragmentProviderForWholeModuleWithDependencies$delegate = C12763i.m39921a(new C12962x39a25915(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module name must be special: ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setDependencies(ModuleDescriptorImpl... moduleDescriptorImplArr) {
        setDependencies(C13174k.m40412l(moduleDescriptorImplArr));
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list) {
        setDependencies(list, C13188p0.m40531a());
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set) {
        setDependencies((ModuleDependencies) new ModuleDependenciesImpl(list, set, C13185o.m40513a()));
    }
}
