package kotlin.reflect.jvm.internal.components;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver.Empty;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "", "deserialization", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;", "packagePartScopeCache", "Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "(Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;)V", "getDeserialization", "()Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;", "module", "Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getPackagePartScopeCache", "()Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "Companion", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RuntimeModuleData.kt */
public final class RuntimeModuleData {
    public static final Companion Companion = new Companion(null);
    private final DeserializationComponents deserialization;
    private final PackagePartScopeCache packagePartScopeCache;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "classLoader", "Ljava/lang/ClassLoader;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RuntimeModuleData.kt */
    public static final class Companion {
        private Companion() {
        }

        public final RuntimeModuleData create(ClassLoader classLoader) {
            ClassLoader classLoader2 = classLoader;
            LockBasedStorageManager lockBasedStorageManager = r15;
            LockBasedStorageManager lockBasedStorageManager2 = new LockBasedStorageManager("RuntimeModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager2, Kind.FROM_DEPENDENCIES);
            ModuleDescriptorImpl moduleDescriptorImpl = r1;
            StringBuilder sb = new StringBuilder();
            sb.append("<runtime module for ");
            sb.append(classLoader2);
            sb.append('>');
            Name special = Name.special(sb.toString());
            Intrinsics.checkReturnedValueIsNotNull((Object) special, "Name.special(\"<runtime module for $classLoader>\")");
            JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
            ModuleDescriptorImpl moduleDescriptorImpl2 = new ModuleDescriptorImpl(special, lockBasedStorageManager2, jvmBuiltIns2, null, null, null, 56, null);
            jvmBuiltIns.setBuiltInsModule(moduleDescriptorImpl2);
            ReflectKotlinClassFinder reflectKotlinClassFinder = r9;
            ReflectKotlinClassFinder reflectKotlinClassFinder2 = new ReflectKotlinClassFinder(classLoader2);
            DeserializedDescriptorResolver deserializedDescriptorResolver = r8;
            DeserializedDescriptorResolver deserializedDescriptorResolver2 = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = r7;
            SingleModuleClassResolver singleModuleClassResolver2 = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager2, moduleDescriptorImpl2);
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver = r1;
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = new AnnotationTypeQualifierResolver(lockBasedStorageManager2, Jsr305State.DISABLED);
            ModuleDescriptorImpl moduleDescriptorImpl3 = moduleDescriptorImpl2;
            ReflectJavaClassFinder reflectJavaClassFinder = r3;
            ReflectJavaClassFinder reflectJavaClassFinder2 = new ReflectJavaClassFinder(classLoader2);
            SignaturePropagator signaturePropagator = SignaturePropagator.DO_NOTHING;
            LockBasedStorageManager lockBasedStorageManager3 = lockBasedStorageManager2;
            SignaturePropagator signaturePropagator2 = signaturePropagator;
            SingleModuleClassResolver singleModuleClassResolver3 = singleModuleClassResolver2;
            Intrinsics.checkReturnedValueIsNotNull((Object) signaturePropagator, "SignaturePropagator.DO_NOTHING");
            RuntimeErrorReporter runtimeErrorReporter = RuntimeErrorReporter.INSTANCE;
            JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
            JavaResolverCache javaResolverCache2 = javaResolverCache;
            String str = "JavaResolverCache.EMPTY";
            Intrinsics.checkReturnedValueIsNotNull((Object) javaResolverCache, str);
            DoNothing doNothing = DoNothing.INSTANCE;
            Empty empty = Empty.INSTANCE;
            RuntimeSourceElementFactory runtimeSourceElementFactory = RuntimeSourceElementFactory.INSTANCE;
            PackagePartProvider.Empty empty2 = PackagePartProvider.Empty.INSTANCE;
            EMPTY empty3 = EMPTY.INSTANCE;
            DO_NOTHING do_nothing = DO_NOTHING.INSTANCE;
            ReflectionTypes reflectionTypes = r0;
            ReflectionTypes reflectionTypes2 = new ReflectionTypes(moduleDescriptorImpl3, notFoundClasses);
            SignatureEnhancement signatureEnhancement = r0;
            LockBasedStorageManager lockBasedStorageManager4 = lockBasedStorageManager3;
            SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(annotationTypeQualifierResolver2, Jsr305State.DISABLED);
            JavaResolverComponents javaResolverComponents = new JavaResolverComponents(lockBasedStorageManager, reflectJavaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, signaturePropagator2, runtimeErrorReporter, javaResolverCache2, doNothing, empty, runtimeSourceElementFactory, singleModuleClassResolver, empty2, empty3, do_nothing, moduleDescriptorImpl, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, Default.INSTANCE, JavaResolverSettings.Default.INSTANCE);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(javaResolverComponents);
            jvmBuiltIns2.initialize(moduleDescriptorImpl3, true);
            JavaResolverCache javaResolverCache3 = JavaResolverCache.EMPTY;
            Intrinsics.checkReturnedValueIsNotNull((Object) javaResolverCache3, str);
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider, javaResolverCache3);
            JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(reflectKotlinClassFinder2, deserializedDescriptorResolver2);
            LockBasedStorageManager lockBasedStorageManager5 = lockBasedStorageManager4;
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptorImpl3, notFoundClasses, lockBasedStorageManager5, reflectKotlinClassFinder2);
            DeserializationConfiguration.Default defaultR = DeserializationConfiguration.Default.INSTANCE;
            LockBasedStorageManager lockBasedStorageManager6 = lockBasedStorageManager5;
            ModuleDescriptorImpl moduleDescriptorImpl4 = moduleDescriptorImpl3;
            LockBasedStorageManager lockBasedStorageManager7 = lockBasedStorageManager5;
            DeserializationConfiguration.Default defaultR2 = defaultR;
            JvmBuiltIns jvmBuiltIns3 = jvmBuiltIns2;
            JavaClassDataFinder javaClassDataFinder2 = javaClassDataFinder;
            ModuleDescriptorImpl moduleDescriptorImpl5 = moduleDescriptorImpl3;
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl2 = binaryClassAnnotationAndConstantLoaderImpl;
            NotFoundClasses notFoundClasses2 = notFoundClasses;
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
            SingleModuleClassResolver singleModuleClassResolver4 = singleModuleClassResolver3;
            DeserializationComponentsForJava deserializationComponentsForJava = r0;
            DeserializedDescriptorResolver deserializedDescriptorResolver3 = deserializedDescriptorResolver2;
            ReflectKotlinClassFinder reflectKotlinClassFinder3 = reflectKotlinClassFinder2;
            ModuleDescriptorImpl moduleDescriptorImpl6 = moduleDescriptorImpl5;
            DeserializationComponentsForJava deserializationComponentsForJava2 = new DeserializationComponentsForJava(lockBasedStorageManager6, moduleDescriptorImpl4, defaultR2, javaClassDataFinder2, binaryClassAnnotationAndConstantLoaderImpl2, lazyJavaPackageFragmentProvider2, notFoundClasses2, RuntimeErrorReporter.INSTANCE, DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT());
            ClassLoader classLoader3 = C13145v.class.getClassLoader();
            Intrinsics.checkReturnedValueIsNotNull((Object) classLoader3, "stdlibClassLoader");
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager7, new ReflectKotlinClassFinder(classLoader3), moduleDescriptorImpl6, notFoundClasses2, jvmBuiltIns3.getSettings(), jvmBuiltIns3.getSettings(), DeserializationConfiguration.Default.INSTANCE);
            singleModuleClassResolver4.setResolver(javaDescriptorResolver);
            DeserializationComponentsForJava deserializationComponentsForJava3 = deserializationComponentsForJava;
            deserializedDescriptorResolver3.setComponents(deserializationComponentsForJava3);
            ModuleDescriptorImpl moduleDescriptorImpl7 = moduleDescriptorImpl6;
            moduleDescriptorImpl7.setDependencies(moduleDescriptorImpl7);
            moduleDescriptorImpl7.initialize(new CompositePackageFragmentProvider(C13185o.m40520c(javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider)));
            return new RuntimeModuleData(deserializationComponentsForJava3.getComponents(), new PackagePartScopeCache(deserializedDescriptorResolver3, reflectKotlinClassFinder3), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache2) {
        this.deserialization = deserializationComponents;
        this.packagePartScopeCache = packagePartScopeCache2;
    }

    public final DeserializationComponents getDeserialization() {
        return this.deserialization;
    }

    public final ModuleDescriptor getModule() {
        return this.deserialization.getModuleDescriptor();
    }

    public final PackagePartScopeCache getPackagePartScopeCache() {
        return this.packagePartScopeCache;
    }

    public /* synthetic */ RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache2, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache2);
    }
}
