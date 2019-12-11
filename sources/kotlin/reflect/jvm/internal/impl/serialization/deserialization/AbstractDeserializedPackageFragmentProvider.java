package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProvider {
    protected DeserializationComponents components;
    private final KotlinMetadataFinder finder;
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> fragments = this.storageManager.createMemoizedFunctionWithNullableValues(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    private final ModuleDescriptor moduleDescriptor;
    private final StorageManager storageManager;

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager2, KotlinMetadataFinder kotlinMetadataFinder, ModuleDescriptor moduleDescriptor2) {
        this.storageManager = storageManager2;
        this.finder = kotlinMetadataFinder;
        this.moduleDescriptor = moduleDescriptor2;
    }

    /* access modifiers changed from: protected */
    public abstract DeserializedPackageFragment findPackage(FqName fqName);

    /* access modifiers changed from: protected */
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final KotlinMetadataFinder getFinder() {
        return this.finder;
    }

    /* access modifiers changed from: protected */
    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        return C13185o.m40517b(this.fragments.invoke(fqName));
    }

    /* access modifiers changed from: protected */
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        return C13188p0.m40531a();
    }

    /* access modifiers changed from: protected */
    public final void setComponents(DeserializationComponents deserializationComponents) {
        this.components = deserializationComponents;
    }
}
