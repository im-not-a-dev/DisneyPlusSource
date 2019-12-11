package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* compiled from: JvmPackagePartSource.kt */
public final class JvmPackagePartSource implements DeserializedContainerSource {
    private final JvmClassName className;
    private final JvmClassName facadeClassName;
    private final IncompatibleVersionErrorData<JvmMetadataVersion> incompatibility;
    private final boolean isPreReleaseInvisible;
    private final KotlinJvmBinaryClass knownJvmBinaryClass;
    private final String moduleName;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JvmPackagePartSource(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r1, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> r5, boolean r6, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r7) {
        /*
            r0 = this;
            r0.<init>()
            r0.className = r1
            r0.facadeClassName = r2
            r0.incompatibility = r5
            r0.isPreReleaseInvisible = r6
            r0.knownJvmBinaryClass = r7
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageModuleName
            java.lang.String r2 = "JvmProtoBuf.packageModuleName"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r3, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0027
            int r1 = r1.intValue()
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = "main"
        L_0x0029:
            r0.moduleName = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource.<init>(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):void");
    }

    public final ClassId getClassId() {
        return new ClassId(this.className.getPackageFqName(), getSimpleName());
    }

    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C12880j.m40222a((Object) sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }

    public final JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    public String getPresentableString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(getClassId().asSingleFqName().asString());
        sb.append('\'');
        return sb.toString();
    }

    public final Name getSimpleName() {
        String internalName = this.className.getInternalName();
        C12880j.m40222a((Object) internalName, "className.internalName");
        Name identifier = Name.identifier(C12833x.m40161b(internalName, '/', (String) null, 2, (Object) null));
        C12880j.m40222a((Object) identifier, "Name.identifier(classNam….substringAfterLast('/'))");
        return identifier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JvmPackagePartSource.class.getSimpleName());
        sb.append(": ");
        sb.append(this.className);
        return sb.toString();
    }

    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinJvmBinaryClass, Package packageR, NameResolver nameResolver, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z) {
        JvmClassName byClassId = JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        C12880j.m40222a((Object) byClassId, "JvmClassName.byClassId(kotlinClass.classId)");
        String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassName = null;
        if (multifileClassName != null) {
            if (multifileClassName.length() > 0) {
                jvmClassName = JvmClassName.byInternalName(multifileClassName);
            }
        }
        JvmClassName jvmClassName2 = jvmClassName;
        this(byClassId, jvmClassName2, packageR, nameResolver, incompatibleVersionErrorData, z, kotlinJvmBinaryClass);
    }
}
