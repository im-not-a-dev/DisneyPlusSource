package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.C13145v;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {
    private final DeserializedContainerSource containerSource;
    private CoroutinesCompatibilityMode coroutinesExperimentalCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
    private final NameResolver nameResolver;
    private final Property proto;
    private final TypeTable typeTable;
    private final VersionRequirementTable versionRequirementTable;

    public DeserializedPropertyDescriptor(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, Visibility visibility, boolean z, Name name, Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Property property, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, DeserializedContainerSource deserializedContainerSource) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, visibility, z, name, kind, SourceElement.NO_SOURCE, z2, z3, z6, false, z4, z5);
        this.proto = property;
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.versionRequirementTable = versionRequirementTable2;
        this.containerSource = deserializedContainerSource;
    }

    /* access modifiers changed from: protected */
    public PropertyDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, PropertyDescriptor propertyDescriptor, Kind kind, Name name) {
        Name name2 = name;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, visibility, isVar(), name2, kind, isLateInit(), isConst(), isExternal(), isDelegated(), isExpect(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        return deserializedPropertyDescriptor;
    }

    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
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

    public final void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2, CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        super.initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, fieldDescriptor, fieldDescriptor2);
        C13145v vVar = C13145v.f29587a;
        this.coroutinesExperimentalCompatibilityMode = coroutinesCompatibilityMode;
    }

    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_PROPERTY.get(getProto().getFlags());
        C12880j.m40222a((Object) bool, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return bool.booleanValue();
    }

    public Property getProto() {
        return this.proto;
    }
}
