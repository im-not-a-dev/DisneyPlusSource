package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {
    private final KotlinJvmBinaryClass binaryClass;
    private final IncompatibleVersionErrorData<JvmMetadataVersion> incompatibility;
    private final boolean isPreReleaseInvisible;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass kotlinJvmBinaryClass, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z) {
        this.binaryClass = kotlinJvmBinaryClass;
        this.incompatibility = incompatibleVersionErrorData;
        this.isPreReleaseInvisible = z;
    }

    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.binaryClass;
    }

    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C12880j.m40222a((Object) sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }

    public String getPresentableString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(this.binaryClass.getClassId().asSingleFqName().asString());
        sb.append('\'');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KotlinJvmBinarySourceElement.class.getSimpleName());
        sb.append(": ");
        sb.append(this.binaryClass);
        return sb.toString();
    }
}
