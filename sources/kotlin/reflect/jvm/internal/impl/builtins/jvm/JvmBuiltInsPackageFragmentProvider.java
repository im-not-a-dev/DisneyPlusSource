package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {
    public JvmBuiltInsPackageFragmentProvider(StorageManager storageManager, KotlinClassFinder kotlinClassFinder, ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, DeserializationConfiguration deserializationConfiguration) {
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor moduleDescriptor3 = moduleDescriptor;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        AdditionalClassPartsProvider additionalClassPartsProvider2 = additionalClassPartsProvider;
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter2 = platformDependentDeclarationFilter;
        DeserializationConfiguration deserializationConfiguration2 = deserializationConfiguration;
        super(storageManager, kotlinClassFinder, moduleDescriptor);
        DeserializedClassDataFinder deserializedClassDataFinder = r5;
        DeserializedClassDataFinder deserializedClassDataFinder2 = new DeserializedClassDataFinder(this);
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = r7;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl2 = new AnnotationAndConstantLoaderImpl(moduleDescriptor2, notFoundClasses, BuiltInSerializerProtocol.INSTANCE);
        Default defaultR = Default.INSTANCE;
        ErrorReporter errorReporter = ErrorReporter.DO_NOTHING;
        ErrorReporter errorReporter2 = errorReporter;
        DeserializationComponents deserializationComponents = r0;
        Intrinsics.checkReturnedValueIsNotNull((Object) errorReporter, "ErrorReporter.DO_NOTHING");
        DO_NOTHING do_nothing = DO_NOTHING.INSTANCE;
        ThrowException throwException = ThrowException.INSTANCE;
        DeserializationComponents deserializationComponents2 = deserializationComponents;
        StorageManager storageManager3 = storageManager2;
        JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null);
        DeserializationComponents deserializationComponents3 = new DeserializationComponents(storageManager3, moduleDescriptor3, deserializationConfiguration2, deserializedClassDataFinder, annotationAndConstantLoaderImpl, this, defaultR, errorReporter2, do_nothing, throwException, C13185o.m40520c(new BuiltInFictitiousFunctionClassFactory(storageManager2, moduleDescriptor2), jvmBuiltInClassDescriptorFactory), notFoundClasses2, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider2, platformDependentDeclarationFilter2, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
        setComponents(deserializationComponents2);
    }

    /* access modifiers changed from: protected */
    public DeserializedPackageFragment findPackage(FqName fqName) {
        InputStream findBuiltInsData = getFinder().findBuiltInsData(fqName);
        if (findBuiltInsData == null) {
            return null;
        }
        return BuiltInsPackageFragmentImpl.Companion.create(fqName, getStorageManager(), getModuleDescriptor(), findBuiltInsData, false);
    }
}
