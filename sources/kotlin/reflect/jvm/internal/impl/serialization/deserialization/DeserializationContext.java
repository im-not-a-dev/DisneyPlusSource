package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: context.kt */
public final class DeserializationContext {
    private final DeserializationComponents components;
    private final DeserializedContainerSource containerSource;
    private final DeclarationDescriptor containingDeclaration;
    private final MemberDeserializer memberDeserializer;
    private final BinaryVersion metadataVersion;
    private final NameResolver nameResolver;
    private final TypeDeserializer typeDeserializer;
    private final TypeTable typeTable;
    private final VersionRequirementTable versionRequirementTable;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0042, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializationContext(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r12, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r13, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r14, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r15, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r16, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r17, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r18, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r19, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r20) {
        /*
            r11 = this;
            r9 = r11
            r11.<init>()
            r0 = r12
            r9.components = r0
            r0 = r13
            r9.nameResolver = r0
            r0 = r14
            r9.containingDeclaration = r0
            r0 = r15
            r9.typeTable = r0
            r0 = r16
            r9.versionRequirementTable = r0
            r0 = r17
            r9.metadataVersion = r0
            r0 = r18
            r9.containerSource = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r10 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Deserializer for \""
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r9.containingDeclaration
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r1.getName()
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r0 = r9.containerSource
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r0.getPresentableString()
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            java.lang.String r0 = "[container not found]"
        L_0x0047:
            r5 = r0
            r6 = 0
            r7 = 32
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.typeDeserializer = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer
            r0.<init>(r11)
            r9.memberDeserializer = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer, java.util.List):void");
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, BinaryVersion binaryVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            nameResolver2 = deserializationContext.nameResolver;
        }
        NameResolver nameResolver3 = nameResolver2;
        if ((i & 8) != 0) {
            typeTable2 = deserializationContext.typeTable;
        }
        TypeTable typeTable3 = typeTable2;
        if ((i & 16) != 0) {
            versionRequirementTable2 = deserializationContext.versionRequirementTable;
        }
        VersionRequirementTable versionRequirementTable3 = versionRequirementTable2;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.metadataVersion;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver3, typeTable3, versionRequirementTable3, binaryVersion);
    }

    public final DeserializationContext childContext(DeclarationDescriptor declarationDescriptor, List<TypeParameter> list, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, BinaryVersion binaryVersion) {
        DeserializationContext deserializationContext = new DeserializationContext(this.components, nameResolver2, declarationDescriptor, typeTable2, VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion) ? versionRequirementTable2 : this.versionRequirementTable, binaryVersion, this.containerSource, this.typeDeserializer, list);
        return deserializationContext;
    }

    public final DeserializationComponents getComponents() {
        return this.components;
    }

    public final DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public final DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public final MemberDeserializer getMemberDeserializer() {
        return this.memberDeserializer;
    }

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    public final TypeDeserializer getTypeDeserializer() {
        return this.typeDeserializer;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    public final VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }
}
