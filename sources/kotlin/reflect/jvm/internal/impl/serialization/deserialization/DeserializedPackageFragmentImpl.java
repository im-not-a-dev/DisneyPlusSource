package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    private MemberScope _memberScope;
    private PackageFragment _proto;
    private final ProtoBasedClassDataFinder classDataFinder;
    /* access modifiers changed from: private */
    public final DeserializedContainerSource containerSource;
    private final BinaryVersion metadataVersion;
    private final NameResolverImpl nameResolver;

    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, PackageFragment packageFragment, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        this.metadataVersion = binaryVersion;
        this.containerSource = deserializedContainerSource;
        StringTable strings = packageFragment.getStrings();
        Intrinsics.checkReturnedValueIsNotNull((Object) strings, "proto.strings");
        QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        Intrinsics.checkReturnedValueIsNotNull((Object) qualifiedNames, "proto.qualifiedNames");
        this.nameResolver = new NameResolverImpl(strings, qualifiedNames);
        this.classDataFinder = new ProtoBasedClassDataFinder(packageFragment, this.nameResolver, this.metadataVersion, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this._proto = packageFragment;
    }

    public MemberScope getMemberScope() {
        MemberScope memberScope = this._memberScope;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
        throw null;
    }

    public void initialize(DeserializationComponents deserializationComponents) {
        PackageFragment packageFragment = this._proto;
        if (packageFragment != null) {
            this._proto = null;
            Package packageR = packageFragment.getPackage();
            Intrinsics.checkReturnedValueIsNotNull((Object) packageR, "proto.`package`");
            DeserializedPackageMemberScope deserializedPackageMemberScope = new DeserializedPackageMemberScope(this, packageR, this.nameResolver, this.metadataVersion, this.containerSource, deserializationComponents, new DeserializedPackageFragmentImpl$initialize$1(this));
            this._memberScope = deserializedPackageMemberScope;
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }
}
