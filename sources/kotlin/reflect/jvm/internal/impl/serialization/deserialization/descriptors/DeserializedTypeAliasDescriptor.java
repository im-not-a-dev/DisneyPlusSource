package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: DeserializedMemberDescriptor.kt */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    private Collection<? extends TypeAliasConstructorDescriptor> constructors;
    private final DeserializedContainerSource containerSource;
    private CoroutinesCompatibilityMode coroutinesExperimentalCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
    private SimpleType defaultTypeImpl;
    private SimpleType expandedType;
    private final NameResolver nameResolver;
    private final TypeAlias proto;
    private final StorageManager storageManager;
    private List<? extends TypeParameterDescriptor> typeConstructorParameters;
    private final TypeTable typeTable;
    private SimpleType underlyingType;
    private final VersionRequirementTable versionRequirementTable;

    public DeserializedTypeAliasDescriptor(StorageManager storageManager2, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Visibility visibility, TypeAlias typeAlias, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, DeserializedContainerSource deserializedContainerSource) {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
        super(declarationDescriptor, annotations, name, sourceElement, visibility);
        this.storageManager = storageManager2;
        this.proto = typeAlias;
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.versionRequirementTable = versionRequirementTable2;
        this.containerSource = deserializedContainerSource;
    }

    public ClassDescriptor getClassDescriptor() {
        if (KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        ClassifierDescriptor declarationDescriptor = getExpandedType().getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        return (ClassDescriptor) declarationDescriptor;
    }

    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public CoroutinesCompatibilityMode getCoroutinesExperimentalCompatibilityMode() {
        return this.coroutinesExperimentalCompatibilityMode;
    }

    public SimpleType getDefaultType() {
        SimpleType simpleType = this.defaultTypeImpl;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultTypeImpl");
        throw null;
    }

    public SimpleType getExpandedType() {
        SimpleType simpleType = this.expandedType;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedType");
        throw null;
    }

    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    /* access modifiers changed from: protected */
    public StorageManager getStorageManager() {
        return this.storageManager;
    }

    /* access modifiers changed from: protected */
    public List<TypeParameterDescriptor> getTypeConstructorTypeParameters() {
        List<? extends TypeParameterDescriptor> list = this.typeConstructorParameters;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeConstructorParameters");
        throw null;
    }

    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    public SimpleType getUnderlyingType() {
        SimpleType simpleType = this.underlyingType;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("underlyingType");
        throw null;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    public List<VersionRequirement> getVersionRequirements() {
        return DefaultImpls.getVersionRequirements(this);
    }

    public final void initialize(List<? extends TypeParameterDescriptor> list, SimpleType simpleType, SimpleType simpleType2, CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        initialize(list);
        this.underlyingType = simpleType;
        this.expandedType = simpleType2;
        this.typeConstructorParameters = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        this.defaultTypeImpl = computeDefaultType();
        this.constructors = getTypeAliasConstructors();
        this.coroutinesExperimentalCompatibilityMode = coroutinesCompatibilityMode;
    }

    public TypeAlias getProto() {
        return this.proto;
    }

    public TypeAliasDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        StorageManager storageManager2 = getStorageManager();
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkReturnedValueIsNotNull((Object) containingDeclaration, "containingDeclaration");
        Annotations annotations = getAnnotations();
        Intrinsics.checkReturnedValueIsNotNull((Object) annotations, "annotations");
        Name name = getName();
        Intrinsics.checkReturnedValueIsNotNull((Object) name, "name");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager2, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List declaredTypeParameters = getDeclaredTypeParameters();
        KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(getUnderlyingType(), Variance.INVARIANT);
        String str = "substitutor.safeSubstitu…Type, Variance.INVARIANT)";
        Intrinsics.checkReturnedValueIsNotNull((Object) safeSubstitute, str);
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(safeSubstitute);
        KotlinType safeSubstitute2 = typeSubstitutor.safeSubstitute(getExpandedType(), Variance.INVARIANT);
        Intrinsics.checkReturnedValueIsNotNull((Object) safeSubstitute2, str);
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, asSimpleType, TypeSubstitutionKt.asSimpleType(safeSubstitute2), getCoroutinesExperimentalCompatibilityMode());
        return deserializedTypeAliasDescriptor;
    }
}
