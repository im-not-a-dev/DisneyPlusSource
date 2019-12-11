package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* compiled from: DeserializationComponentsForJava.kt */
public final class DeserializationComponentsForJava {
    private final DeserializationComponents components;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializationComponentsForJava(kotlin.reflect.jvm.internal.impl.storage.StorageManager r20, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r21, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r22, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder r23, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl r24, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider r25, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter r27, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker r28, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer r29) {
        /*
            r19 = this;
            r19.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r0 = r21.getBuiltIns()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns
            if (r1 != 0) goto L_0x000c
            r0 = 0
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r0 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns) r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r15 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings$Default r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE
            kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer.INSTANCE
            java.util.List r12 = kotlin.p590y.C13185o.m40513a()
            if (r0 == 0) goto L_0x0021
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings r1 = r0.getSettings()
            if (r1 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider$None r1 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE
        L_0x0023:
            r16 = r1
            if (r0 == 0) goto L_0x002e
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings r0 = r0.getSettings()
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter$NoPlatformDependent r0 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE
        L_0x0030:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE
            kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r17 = r1.getEXTENSION_REGISTRY()
            r1 = r15
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r9 = r27
            r10 = r28
            r13 = r26
            r14 = r29
            r18 = r15
            r15 = r16
            r16 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r19
            r1 = r18
            r0.components = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.<init>(kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer):void");
    }

    public final DeserializationComponents getComponents() {
        return this.components;
    }
}
