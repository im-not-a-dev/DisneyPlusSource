package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: context.kt */
public final class DeserializationComponents {
    private final AdditionalClassPartsProvider additionalClassPartsProvider;
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader;
    private final ClassDataFinder classDataFinder;
    private final ClassDeserializer classDeserializer = new ClassDeserializer(this);
    private final DeserializationConfiguration configuration;
    private final ContractDeserializer contractDeserializer;
    private final ErrorReporter errorReporter;
    private final ExtensionRegistryLite extensionRegistryLite;
    private final Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    private final FlexibleTypeDeserializer flexibleTypeDeserializer;
    private final LocalClassifierTypeSettings localClassifierTypeSettings;
    private final LookupTracker lookupTracker;
    private final ModuleDescriptor moduleDescriptor;
    private final NotFoundClasses notFoundClasses;
    private final PackageFragmentProvider packageFragmentProvider;
    private final PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    private final StorageManager storageManager;

    public DeserializationComponents(StorageManager storageManager2, ModuleDescriptor moduleDescriptor2, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder2, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader2, PackageFragmentProvider packageFragmentProvider2, LocalClassifierTypeSettings localClassifierTypeSettings2, ErrorReporter errorReporter2, LookupTracker lookupTracker2, FlexibleTypeDeserializer flexibleTypeDeserializer2, Iterable<? extends ClassDescriptorFactory> iterable, NotFoundClasses notFoundClasses2, ContractDeserializer contractDeserializer2, AdditionalClassPartsProvider additionalClassPartsProvider2, PlatformDependentDeclarationFilter platformDependentDeclarationFilter2, ExtensionRegistryLite extensionRegistryLite2) {
        this.storageManager = storageManager2;
        this.moduleDescriptor = moduleDescriptor2;
        this.configuration = deserializationConfiguration;
        this.classDataFinder = classDataFinder2;
        this.annotationAndConstantLoader = annotationAndConstantLoader2;
        this.packageFragmentProvider = packageFragmentProvider2;
        this.localClassifierTypeSettings = localClassifierTypeSettings2;
        this.errorReporter = errorReporter2;
        this.lookupTracker = lookupTracker2;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer2;
        this.fictitiousClassDescriptorFactories = iterable;
        this.notFoundClasses = notFoundClasses2;
        this.contractDeserializer = contractDeserializer2;
        this.additionalClassPartsProvider = additionalClassPartsProvider2;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter2;
        this.extensionRegistryLite = extensionRegistryLite2;
    }

    public final DeserializationContext createContext(PackageFragmentDescriptor packageFragmentDescriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource) {
        DeserializationContext deserializationContext = new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, binaryVersion, deserializedContainerSource, null, C13185o.m40513a());
        return deserializationContext;
    }

    public final ClassDescriptor deserializeClass(ClassId classId) {
        return ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    public final ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    public final ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    public final DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    public final ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public final NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }
}
