package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {
    private final DeserializedContainerSource containerSource;
    private CoroutinesCompatibilityMode coroutinesExperimentalCompatibilityMode;
    private final NameResolver nameResolver;
    private final Constructor proto;
    private final TypeTable typeTable;
    private final VersionRequirementTable versionRequirementTable;

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, Kind kind, Constructor constructor, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, constructorDescriptor, annotations, z, kind, constructor, nameResolver2, typeTable2, versionRequirementTable2, deserializedContainerSource, (i & 1024) != 0 ? null : sourceElement);
    }

    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public CoroutinesCompatibilityMode getCoroutinesExperimentalCompatibilityMode() {
        return this.coroutinesExperimentalCompatibilityMode;
    }

    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    public List<VersionRequirement> getVersionRequirements() {
        return DefaultImpls.getVersionRequirements(this);
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    public void setCoroutinesExperimentalCompatibilityMode$deserialization(CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        this.coroutinesExperimentalCompatibilityMode = coroutinesCompatibilityMode;
    }

    public DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, Kind kind, Constructor constructor, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, z, kind, sourceElement != null ? sourceElement : SourceElement.NO_SOURCE);
        this.proto = constructor;
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.versionRequirementTable = versionRequirementTable2;
        this.containerSource = deserializedContainerSource;
        this.coroutinesExperimentalCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
    }

    public Constructor getProto() {
        return this.proto;
    }

    /* access modifiers changed from: protected */
    public DeserializedClassConstructorDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (ConstructorDescriptor) functionDescriptor, annotations, this.isPrimary, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement);
        deserializedClassConstructorDescriptor.setCoroutinesExperimentalCompatibilityMode$deserialization(getCoroutinesExperimentalCompatibilityMode());
        return deserializedClassConstructorDescriptor;
    }
}
