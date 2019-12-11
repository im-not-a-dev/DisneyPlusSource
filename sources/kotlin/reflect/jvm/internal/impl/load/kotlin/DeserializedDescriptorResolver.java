package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;

/* compiled from: DeserializedDescriptorResolver.kt */
public final class DeserializedDescriptorResolver {
    public static final Companion Companion = new Companion(null);
    private static final JvmMetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new JvmMetadataVersion(1, 1, 2);
    private static final JvmMetadataVersion KOTLIN_1_3_M1_METADATA_VERSION = new JvmMetadataVersion(1, 1, 11);
    /* access modifiers changed from: private */
    public static final JvmMetadataVersion KOTLIN_1_3_RC_METADATA_VERSION = new JvmMetadataVersion(1, 1, 13);
    private static final Set<Kind> KOTLIN_CLASS = C13186o0.m40524a(Kind.CLASS);
    private static final Set<Kind> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = C13188p0.m40533b(Kind.FILE_FACADE, Kind.MULTIFILE_CLASS_PART);
    public DeserializationComponents components;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.KOTLIN_1_3_RC_METADATA_VERSION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final IncompatibleVersionErrorData<JvmMetadataVersion> getIncompatibility(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    /* access modifiers changed from: private */
    public final boolean getSkipMetadataVersionCheck() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents.getConfiguration().getSkipMetadataVersionCheck();
        }
        C12880j.m40227c("components");
        throw null;
    }

    private final boolean isCompiledWith13M1(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return !deserializationComponents.getConfiguration().getSkipMetadataVersionCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && C12880j.m40224a((Object) kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), (Object) KOTLIN_1_3_M1_METADATA_VERSION);
        }
        C12880j.m40227c("components");
        throw null;
    }

    private final boolean isPreReleaseInvisible(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return (deserializationComponents.getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || C12880j.m40224a((Object) kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), (Object) KOTLIN_1_1_EAP_METADATA_VERSION))) || isCompiledWith13M1(kotlinJvmBinaryClass);
        }
        C12880j.m40227c("components");
        throw null;
    }

    private final String[] readData(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends Kind> set) {
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }

    public final MemberScope createKotlinPackagePartScope(PackageFragmentDescriptor packageFragmentDescriptor, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair pair;
        String[] readData = readData(kotlinJvmBinaryClass, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (readData != null) {
            String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
            if (strings != null) {
                try {
                    pair = JvmProtoBufUtil.readPackageDataFrom(readData, strings);
                } catch (InvalidProtocolBufferException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not read data from ");
                    sb.append(kotlinJvmBinaryClass.getLocation());
                    throw new IllegalStateException(sb.toString(), e);
                } catch (Throwable th) {
                    if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                        throw th;
                    }
                    pair = null;
                }
                if (pair == null) {
                    return null;
                }
                JvmNameResolver jvmNameResolver = (JvmNameResolver) pair.mo31013a();
                Package packageR = (Package) pair.mo31014b();
                JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, packageR, jvmNameResolver, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass));
                JvmMetadataVersion metadataVersion = kotlinJvmBinaryClass.getClassHeader().getMetadataVersion();
                DeserializationComponents deserializationComponents = this.components;
                if (deserializationComponents != null) {
                    DeserializedPackageMemberScope deserializedPackageMemberScope = new DeserializedPackageMemberScope(packageFragmentDescriptor, packageR, jvmNameResolver, metadataVersion, jvmPackagePartSource, deserializationComponents, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.INSTANCE);
                    return deserializedPackageMemberScope;
                }
                C12880j.m40227c("components");
                throw null;
            }
        }
        return null;
    }

    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        C12880j.m40227c("components");
        throw null;
    }

    public final ClassData readClassData$descriptors_jvm(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair pair;
        String[] readData = readData(kotlinJvmBinaryClass, KOTLIN_CLASS);
        if (readData != null) {
            String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
            if (strings != null) {
                try {
                    pair = JvmProtoBufUtil.readClassDataFrom(readData, strings);
                } catch (InvalidProtocolBufferException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not read data from ");
                    sb.append(kotlinJvmBinaryClass.getLocation());
                    throw new IllegalStateException(sb.toString(), e);
                } catch (Throwable th) {
                    if (getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                        throw th;
                    }
                    pair = null;
                }
                if (pair == null) {
                    return null;
                }
                return new ClassData((JvmNameResolver) pair.mo31013a(), (Class) pair.mo31014b(), kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass)));
            }
        }
        return null;
    }

    public final ClassDescriptor resolveClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        ClassData readClassData$descriptors_jvm = readClassData$descriptors_jvm(kotlinJvmBinaryClass);
        if (readClassData$descriptors_jvm == null) {
            return null;
        }
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents.getClassDeserializer().deserializeClass(kotlinJvmBinaryClass.getClassId(), readClassData$descriptors_jvm);
        }
        C12880j.m40227c("components");
        throw null;
    }

    public final void setComponents(DeserializationComponentsForJava deserializationComponentsForJava) {
        this.components = deserializationComponentsForJava.getComponents();
    }
}
