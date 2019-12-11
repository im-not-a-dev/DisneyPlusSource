package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: DeserializedPackageFragment.kt */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {
    private final StorageManager storageManager;

    public DeserializedPackageFragment(FqName fqName, StorageManager storageManager2, ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        this.storageManager = storageManager2;
    }

    public abstract ClassDataFinder getClassDataFinder();

    public boolean hasTopLevelClass(Name name) {
        MemberScope memberScope = getMemberScope();
        return (memberScope instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name);
    }

    public abstract void initialize(DeserializationComponents deserializationComponents);
}
