package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13180m;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeBasedStarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DeserializationContext f29576c;
    private final Function1<Integer, ClassDescriptor> classDescriptors;
    private final String containerPresentableName;
    private final String debugName;
    private boolean experimentalSuspendFunctionTypeEncountered;
    private final TypeDeserializer parent;
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List<TypeParameter> list, String str, String str2, boolean z) {
        Map<Integer, TypeParameterDescriptor> map;
        this.f29576c = deserializationContext;
        this.parent = typeDeserializer;
        this.debugName = str;
        this.containerPresentableName = str2;
        this.experimentalSuspendFunctionTypeEncountered = z;
        this.classDescriptors = this.f29576c.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$classDescriptors$1(this));
        this.typeAliasDescriptors = this.f29576c.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            map = C13173j0.m40350a();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (TypeParameter typeParameter : list) {
                map.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f29576c, typeParameter, i));
                i++;
            }
        }
        this.typeParameterDescriptors = map;
    }

    /* access modifiers changed from: private */
    public final ClassDescriptor computeClassDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f29576c.getNameResolver(), i);
        if (classId.isLocal()) {
            return this.f29576c.getComponents().deserializeClass(classId);
        }
        return FindClassInModuleKt.findClassAcrossModuleDependencies(this.f29576c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        if (NameResolverUtilKt.getClassId(this.f29576c.getNameResolver(), i).isLocal()) {
            return this.f29576c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f29576c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f29576c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<TypeProjection> c = C13199w.m40575c(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (TypeProjection type : c) {
            arrayList.add(type.getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType createSuspendFunctionType(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        int size = typeConstructor.getParameters().size() - list.size();
        SimpleType simpleType = null;
        if (size == 0) {
            simpleType = createSuspendFunctionTypeForBasicCase(annotations, typeConstructor, list, z);
        } else if (size == 1) {
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                ClassDescriptor suspendFunction = typeConstructor.getBuiltIns().getSuspendFunction(size2);
                Intrinsics.checkReturnedValueIsNotNull((Object) suspendFunction, "functionTypeConstructor.…getSuspendFunction(arity)");
                TypeConstructor typeConstructor2 = suspendFunction.getTypeConstructor();
                Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor2, "functionTypeConstructor.…on(arity).typeConstructor");
                simpleType = KotlinTypeFactory.simpleType(annotations, typeConstructor2, list, z);
            }
        }
        if (simpleType != null) {
            return simpleType;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad suspend function in metadata with constructor: ");
        sb.append(typeConstructor);
        SimpleType createErrorTypeWithArguments = ErrorUtils.createErrorTypeWithArguments(sb.toString(), list);
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorTypeWithArguments, "ErrorUtils.createErrorTy…      arguments\n        )");
        return createErrorTypeWithArguments;
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleType = KotlinTypeFactory.simpleType(annotations, typeConstructor, list, z);
        if (!FunctionTypesKt.isFunctionType(simpleType)) {
            return null;
        }
        return transformRuntimeFunctionTypeToSuspendFunction(simpleType);
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        boolean releaseCoroutines = this.f29576c.getComponents().getConfiguration().getReleaseCoroutines();
        TypeProjection typeProjection = (TypeProjection) C13199w.m40595i(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        FqName fqName = null;
        if (typeProjection != null) {
            KotlinType type = typeProjection.getType();
            if (type != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) type, "funType.getValueParamete…ll()?.type ?: return null");
                ClassifierDescriptor declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
                FqName fqNameSafe = declarationDescriptor != null ? DescriptorUtilsKt.getFqNameSafe(declarationDescriptor) : null;
                boolean z = true;
                if (type.getArguments().size() != 1 || (!SuspendFunctionTypesKt.isContinuation(fqNameSafe, true) && !SuspendFunctionTypesKt.isContinuation(fqNameSafe, false))) {
                    return (SimpleType) kotlinType;
                }
                KotlinType type2 = ((TypeProjection) C13199w.m40599k(type.getArguments())).getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type2, "continuationArgumentType.arguments.single().type");
                DeclarationDescriptor containingDeclaration = this.f29576c.getContainingDeclaration();
                if (!(containingDeclaration instanceof CallableDescriptor)) {
                    containingDeclaration = null;
                }
                CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
                if (callableDescriptor != null) {
                    fqName = DescriptorUtilsKt.fqNameOrNull(callableDescriptor);
                }
                if (Intrinsics.areEqual((Object) fqName, (Object) SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
                    return createSimpleSuspendFunctionType(kotlinType, type2);
                }
                if (!this.experimentalSuspendFunctionTypeEncountered && (!releaseCoroutines || !SuspendFunctionTypesKt.isContinuation(fqNameSafe, !releaseCoroutines))) {
                    z = false;
                }
                this.experimentalSuspendFunctionTypeEncountered = z;
                return createSimpleSuspendFunctionType(kotlinType, type2);
            }
        }
        return null;
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, Argument argument) {
        TypeProjection typeProjection;
        if (argument.getProjection() == Projection.STAR) {
            if (typeParameterDescriptor == null) {
                SimpleType nullableAnyType = this.f29576c.getComponents().getModuleDescriptor().getBuiltIns().getNullableAnyType();
                Intrinsics.checkReturnedValueIsNotNull((Object) nullableAnyType, "c.components.moduleDescr….builtIns.nullableAnyType");
                typeProjection = new TypeBasedStarProjectionImpl(nullableAnyType);
            } else {
                typeProjection = new StarProjectionImpl(typeParameterDescriptor);
            }
            return typeProjection;
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Projection projection = argument.getProjection();
        Intrinsics.checkReturnedValueIsNotNull((Object) projection, "typeArgumentProto.projection");
        Variance variance = protoEnumFlags.variance(projection);
        Type type = ProtoTypeTableUtilKt.type(argument, this.f29576c.getTypeTable());
        if (type != null) {
            return new TypeProjectionImpl(variance, type(type));
        }
        return new TypeProjectionImpl(ErrorUtils.createErrorType("No type recorded"));
    }

    private final TypeConstructor typeConstructor(Type type) {
        Object obj;
        TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1 = new TypeDeserializer$typeConstructor$1(this, type);
        if (type.hasClassName()) {
            ClassDescriptor classDescriptor = (ClassDescriptor) this.classDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (classDescriptor == null) {
                classDescriptor = typeDeserializer$typeConstructor$1.invoke(type.getClassName());
            }
            TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "(classDescriptors(proto.…assName)).typeConstructor");
            return typeConstructor;
        } else if (type.hasTypeParameter()) {
            TypeConstructor typeParameterTypeConstructor = typeParameterTypeConstructor(type.getTypeParameter());
            if (typeParameterTypeConstructor != null) {
                return typeParameterTypeConstructor;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown type parameter ");
            sb.append(type.getTypeParameter());
            sb.append(". Please try recompiling module containing \"");
            sb.append(this.containerPresentableName);
            sb.append('\"');
            TypeConstructor createErrorTypeConstructor = ErrorUtils.createErrorTypeConstructor(sb.toString());
            Intrinsics.checkReturnedValueIsNotNull((Object) createErrorTypeConstructor, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return createErrorTypeConstructor;
        } else if (type.hasTypeParameterName()) {
            DeclarationDescriptor containingDeclaration = this.f29576c.getContainingDeclaration();
            String string = this.f29576c.getNameResolver().getString(type.getTypeParameterName());
            Iterator it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((TypeParameterDescriptor) obj).getName().asString(), (Object) string)) {
                    break;
                }
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) obj;
            if (typeParameterDescriptor != null) {
                TypeConstructor typeConstructor2 = typeParameterDescriptor.getTypeConstructor();
                if (typeConstructor2 != null) {
                    return typeConstructor2;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Deserialized type parameter ");
            sb2.append(string);
            sb2.append(" in ");
            sb2.append(containingDeclaration);
            TypeConstructor createErrorTypeConstructor2 = ErrorUtils.createErrorTypeConstructor(sb2.toString());
            Intrinsics.checkReturnedValueIsNotNull((Object) createErrorTypeConstructor2, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return createErrorTypeConstructor2;
        } else if (type.hasTypeAliasName()) {
            ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeDeserializer$typeConstructor$1.invoke(type.getTypeAliasName());
            }
            TypeConstructor typeConstructor3 = classifierDescriptor.getTypeConstructor();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor3, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return typeConstructor3;
        } else {
            TypeConstructor createErrorTypeConstructor3 = ErrorUtils.createErrorTypeConstructor("Unknown type");
            Intrinsics.checkReturnedValueIsNotNull((Object) createErrorTypeConstructor3, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return createErrorTypeConstructor3;
        }
    }

    private final TypeConstructor typeParameterTypeConstructor(int i) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            TypeConstructor typeConstructor = typeParameterDescriptor.getTypeConstructor();
            if (typeConstructor != null) {
                return typeConstructor;
            }
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.typeParameterTypeConstructor(i);
        }
        return null;
    }

    public final boolean getExperimentalSuspendFunctionTypeEncountered() {
        return this.experimentalSuspendFunctionTypeEncountered;
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return C13199w.m40606q(this.typeParameterDescriptors.values());
    }

    public final SimpleType simpleType(Type type) {
        SimpleType simpleType;
        SimpleType simpleType2 = type.hasClassName() ? computeLocalClassifierReplacementType(type.getClassName()) : type.hasTypeAliasName() ? computeLocalClassifierReplacementType(type.getTypeAliasName()) : null;
        if (simpleType2 != null) {
            return simpleType2;
        }
        TypeConstructor typeConstructor = typeConstructor(type);
        if (ErrorUtils.isError(typeConstructor.getDeclarationDescriptor())) {
            SimpleType createErrorTypeWithCustomConstructor = ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructor.toString(), typeConstructor);
            Intrinsics.checkReturnedValueIsNotNull((Object) createErrorTypeWithCustomConstructor, "ErrorUtils.createErrorTy….toString(), constructor)");
            return createErrorTypeWithCustomConstructor;
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f29576c.getStorageManager(), new TypeDeserializer$simpleType$annotations$1(this, type));
        List invoke = new TypeDeserializer$simpleType$1(this).invoke(type);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) invoke, 10));
        int i = 0;
        for (Object next : invoke) {
            int i2 = i + 1;
            if (i >= 0) {
                Argument argument = (Argument) next;
                List parameters = typeConstructor.getParameters();
                Intrinsics.checkReturnedValueIsNotNull((Object) parameters, "constructor.parameters");
                arrayList.add(typeArgument((TypeParameterDescriptor) C13199w.m40578d(parameters, i), argument));
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        List q = C13199w.m40606q(arrayList);
        Boolean bool = Flags.SUSPEND_TYPE.get(type.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (bool.booleanValue()) {
            simpleType = createSuspendFunctionType(deserializedAnnotations, typeConstructor, q, type.getNullable());
        } else {
            simpleType = KotlinTypeFactory.simpleType(deserializedAnnotations, typeConstructor, q, type.getNullable());
        }
        Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type, this.f29576c.getTypeTable());
        return abbreviatedType != null ? SpecialTypesKt.withAbbreviation(simpleType, simpleType(abbreviatedType)) : simpleType;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(". Child of ");
            sb2.append(this.parent.debugName);
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    public final KotlinType type(Type type) {
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type);
        }
        String string = this.f29576c.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType = simpleType(type);
        Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type, this.f29576c.getTypeTable());
        if (flexibleUpperBound != null) {
            return this.f29576c.getComponents().getFlexibleTypeDeserializer().create(type, string, simpleType, simpleType(flexibleUpperBound));
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public /* synthetic */ TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationContext, typeDeserializer, list, str, str2, (i & 32) != 0 ? false : z);
    }
}
