package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BuiltInsLoaderImpl.kt */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    private final BuiltInsResourceLoader resourceLoader = new BuiltInsResourceLoader();

    public static /* synthetic */ PackageFragmentProvider createBuiltInPackageFragmentProvider$default(BuiltInsLoaderImpl builtInsLoaderImpl, StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set set, Iterable iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, Function1 function1, int i, Object obj) {
        return builtInsLoaderImpl.createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, set, iterable, platformDependentDeclarationFilter, (i & 32) != 0 ? None.INSTANCE : additionalClassPartsProvider, z, function1);
    }

    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set<FqName> set, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, Function1<? super String, ? extends InputStream> function1) {
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (FqName fqName : set) {
            String builtInsFilePath = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            InputStream inputStream = (InputStream) function1.invoke(builtInsFilePath);
            if (inputStream != null) {
                arrayList.add(BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor, inputStream, z));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Resource not found in classpath: ");
                sb.append(builtInsFilePath);
                throw new IllegalStateException(sb.toString());
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = r14;
        PackageFragmentProviderImpl packageFragmentProviderImpl2 = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = r1;
        NotFoundClasses notFoundClasses2 = new NotFoundClasses(storageManager, moduleDescriptor2);
        Default defaultR = Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = r5;
        DeserializedClassDataFinder deserializedClassDataFinder2 = new DeserializedClassDataFinder(packageFragmentProviderImpl2);
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = r7;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl2 = new AnnotationAndConstantLoaderImpl(moduleDescriptor2, notFoundClasses2, BuiltInSerializerProtocol.INSTANCE);
        LocalClassifierTypeSettings.Default defaultR2 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter errorReporter = ErrorReporter.DO_NOTHING;
        ErrorReporter errorReporter2 = errorReporter;
        Intrinsics.checkReturnedValueIsNotNull((Object) errorReporter, "ErrorReporter.DO_NOTHING");
        DeserializationComponents deserializationComponents = r0;
        PackageFragmentProviderImpl packageFragmentProviderImpl3 = packageFragmentProviderImpl2;
        ArrayList<BuiltInsPackageFragmentImpl> arrayList2 = arrayList;
        DeserializationComponents deserializationComponents2 = new DeserializationComponents(storageManager, moduleDescriptor, defaultR, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, defaultR2, errorReporter2, DO_NOTHING.INSTANCE, ThrowException.INSTANCE, iterable, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
        for (BuiltInsPackageFragmentImpl initialize : arrayList2) {
            initialize.initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl3;
    }

    public PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        Set<FqName> set = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES;
        Intrinsics.checkReturnedValueIsNotNull((Object) set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        return createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, set, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.resourceLoader));
    }
}
