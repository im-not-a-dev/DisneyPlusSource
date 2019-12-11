package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* compiled from: typeSignatureMapping.kt */
public final class TypeSignatureMappingKt {
    private static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    public static final KotlinType computeExpandedTypeForInlineClass(KotlinType kotlinType) {
        return computeExpandedTypeInner(kotlinType, new HashSet());
    }

    public static final KotlinType computeExpandedTypeInner(KotlinType kotlinType, HashSet<ClassifierDescriptor> hashSet) {
        KotlinType kotlinType2;
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "kotlinType.constructor.d…n expected: $kotlinType\")");
            if (!hashSet.add(declarationDescriptor)) {
                return null;
            }
            if (declarationDescriptor instanceof TypeParameterDescriptor) {
                kotlinType2 = computeExpandedTypeInner(TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) declarationDescriptor), hashSet);
                if (kotlinType2 == null) {
                    kotlinType = null;
                } else if (!KotlinTypeKt.isNullable(kotlinType2) && kotlinType.isMarkedNullable()) {
                    kotlinType = TypeUtilsKt.makeNullable(kotlinType2);
                }
                return kotlinType;
            }
            if ((declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).isInline()) {
                KotlinType substitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(kotlinType);
                if (substitutedUnderlyingType != null) {
                    kotlinType2 = computeExpandedTypeInner(substitutedUnderlyingType, hashSet);
                    if (kotlinType2 != null) {
                        if (KotlinTypeKt.isNullable(kotlinType)) {
                            if (!KotlinTypeKt.isNullable(kotlinType2) && !KotlinBuiltIns.isPrimitiveType(kotlinType2)) {
                                kotlinType = TypeUtilsKt.makeNullable(kotlinType2);
                            }
                        }
                    }
                }
                return null;
            }
            return kotlinType;
            kotlinType = kotlinType2;
            return kotlinType;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type with a declaration expected: ");
        sb.append(kotlinType);
        throw new AssertionError(sb.toString());
    }

    public static final String computeInternalName(ClassDescriptor classDescriptor, TypeMappingConfiguration<?> typeMappingConfiguration, boolean z) {
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        if (z) {
            containingDeclaration = getContainer(containingDeclaration);
        }
        Name safeIdentifier = SpecialNames.safeIdentifier(classDescriptor.getName());
        Intrinsics.checkReturnedValueIsNotNull((Object) safeIdentifier, "SpecialNames.safeIdentifier(klass.name)");
        String identifier = safeIdentifier.getIdentifier();
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (!fqName.isRoot()) {
                StringBuilder sb = new StringBuilder();
                String asString = fqName.asString();
                Intrinsics.checkReturnedValueIsNotNull((Object) asString, "fqName.asString()");
                sb.append(C12832w.m40115a(asString, '.', '/', false, 4, (Object) null));
                sb.append('/');
                sb.append(identifier);
                identifier = sb.toString();
            }
            return identifier;
        }
        ClassDescriptor classDescriptor2 = (ClassDescriptor) (!(containingDeclaration instanceof ClassDescriptor) ? null : containingDeclaration);
        if (classDescriptor2 != null) {
            String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
            if (predefinedInternalNameForClass == null) {
                predefinedInternalNameForClass = computeInternalName(classDescriptor2, typeMappingConfiguration, z);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(predefinedInternalNameForClass);
            sb2.append('$');
            sb2.append(identifier);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected container: ");
        sb3.append(containingDeclaration);
        sb3.append(" for ");
        sb3.append(classDescriptor);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration, z);
    }

    private static final DeclarationDescriptor getContainer(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptor2 = (ClassDescriptor) (!(declarationDescriptor instanceof ClassDescriptor) ? null : declarationDescriptor);
        if (declarationDescriptor2 == null) {
            declarationDescriptor2 = (PackageFragmentDescriptor) (!(declarationDescriptor instanceof PackageFragmentDescriptor) ? null : declarationDescriptor);
        }
        if (declarationDescriptor2 != null) {
            return declarationDescriptor2;
        }
        if (declarationDescriptor != null) {
            return getContainer(declarationDescriptor.getContainingDeclaration());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean hasVoidReturnType(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r3) {
        /*
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r3.getReturnType()
            r2 = 0
            if (r0 == 0) goto L_0x002a
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(r0)
            if (r0 == 0) goto L_0x0028
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r3.getReturnType()
            if (r0 == 0) goto L_0x0024
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(r0)
            if (r0 != 0) goto L_0x0028
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor
            if (r3 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0024:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r2
        L_0x0028:
            r1 = 0
        L_0x0029:
            return r1
        L_0x002a:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.hasVoidReturnType(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor):boolean");
    }

    private static final <T> T mapBuiltInType(KotlinType kotlinType, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null) {
            PrimitiveType primitiveType = KotlinBuiltIns.getPrimitiveType(classDescriptor);
            boolean z = true;
            boolean z2 = false;
            if (primitiveType != null) {
                JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(primitiveType);
                Intrinsics.checkReturnedValueIsNotNull((Object) jvmPrimitiveType, "JvmPrimitiveType.get(primitiveType)");
                String desc = jvmPrimitiveType.getDesc();
                Intrinsics.checkReturnedValueIsNotNull((Object) desc, "JvmPrimitiveType.get(primitiveType).desc");
                Object createFromString = jvmTypeFactory.createFromString(desc);
                if (!TypeUtils.isNullableType(kotlinType) && !TypeEnhancementKt.hasEnhancedNullability(kotlinType)) {
                    z = false;
                }
                return boxTypeIfNeeded(jvmTypeFactory, createFromString, z);
            }
            PrimitiveType primitiveArrayType = KotlinBuiltIns.getPrimitiveArrayType(classDescriptor);
            if (primitiveArrayType != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.get(primitiveArrayType);
                Intrinsics.checkReturnedValueIsNotNull((Object) jvmPrimitiveType2, "JvmPrimitiveType.get(arrayElementType)");
                sb.append(jvmPrimitiveType2.getDesc());
                return jvmTypeFactory.createFromString(sb.toString());
            } else if (KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
                ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
                if (mapKotlinToJava != null) {
                    if (!typeMappingMode.getKotlinCollectionsToJavaCollections()) {
                        List mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                        if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                            Iterator it = mutabilityMappings.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.areEqual((Object) ((PlatformMutabilityMapping) it.next()).getJavaClass(), (Object) mapKotlinToJava)) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            return null;
                        }
                    }
                    JvmClassName byClassId = JvmClassName.byClassId(mapKotlinToJava);
                    Intrinsics.checkReturnedValueIsNotNull((Object) byClassId, "JvmClassName.byClassId(classId)");
                    String internalName = byClassId.getInternalName();
                    Intrinsics.checkReturnedValueIsNotNull((Object) internalName, "JvmClassName.byClassId(classId).internalName");
                    return jvmTypeFactory.createObjectType(internalName);
                }
            }
        }
        return null;
    }

    public static final <T> T mapType(KotlinType kotlinType, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration<? extends T> typeMappingConfiguration, JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, C12853n<? super KotlinType, ? super T, ? super TypeMappingMode, C13145v> nVar, boolean z) {
        T t;
        Object obj;
        KotlinType kotlinType2 = kotlinType;
        JvmTypeFactory<T> jvmTypeFactory2 = jvmTypeFactory;
        TypeMappingMode typeMappingMode2 = typeMappingMode;
        TypeMappingConfiguration<? extends T> typeMappingConfiguration2 = typeMappingConfiguration;
        JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter2 = jvmDescriptorTypeWriter;
        C12853n<? super KotlinType, ? super T, ? super TypeMappingMode, C13145v> nVar2 = nVar;
        KotlinType preprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (preprocessType != null) {
            return mapType(preprocessType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
        }
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType, typeMappingConfiguration.releaseCoroutines()), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
        }
        Object mapBuiltInType = mapBuiltInType(kotlinType, jvmTypeFactory, typeMappingMode);
        if (mapBuiltInType != null) {
            T boxTypeIfNeeded = boxTypeIfNeeded(jvmTypeFactory, mapBuiltInType, typeMappingMode.getNeedPrimitiveBoxing());
            nVar.invoke(kotlinType, boxTypeIfNeeded, typeMappingMode);
            return boxTypeIfNeeded;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            return mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(typeMappingConfiguration.commonSupertype(((IntersectionTypeConstructor) constructor).getSupertypes())), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
        }
        ClassifierDescriptor declarationDescriptor = constructor.getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "constructor.declarationD…structor of $kotlinType\")");
            String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
            if (ErrorUtils.isError(declarationDescriptor)) {
                T createObjectType = jvmTypeFactory.createObjectType("error/NonExistentClass");
                if (declarationDescriptor != null) {
                    typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) declarationDescriptor);
                    if (jvmDescriptorTypeWriter2 != null) {
                        jvmDescriptorTypeWriter.writeClass(createObjectType);
                    }
                    return createObjectType;
                }
                throw new C13142s(str);
            }
            boolean z2 = declarationDescriptor instanceof ClassDescriptor;
            if (!z2 || !KotlinBuiltIns.isArray(kotlinType)) {
                if (z2) {
                    ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                    if (classDescriptor.isInline() && !typeMappingMode.getNeedInlineClassWrapping()) {
                        KotlinType computeExpandedTypeForInlineClass = computeExpandedTypeForInlineClass(kotlinType);
                        if (computeExpandedTypeForInlineClass != null) {
                            return mapType(computeExpandedTypeForInlineClass, jvmTypeFactory, typeMappingMode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
                        }
                    }
                    if (!typeMappingMode.isForAnnotationParameter() || !KotlinBuiltIns.isKClass(classDescriptor)) {
                        ClassDescriptor original = classDescriptor.getOriginal();
                        Intrinsics.checkReturnedValueIsNotNull((Object) original, "descriptor.original");
                        t = typeMappingConfiguration.getPredefinedTypeForClass(original);
                        if (t == null) {
                            if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                                DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                                if (containingDeclaration != null) {
                                    classDescriptor = (ClassDescriptor) containingDeclaration;
                                } else {
                                    throw new C13142s(str);
                                }
                            }
                            ClassDescriptor original2 = classDescriptor.getOriginal();
                            Intrinsics.checkReturnedValueIsNotNull((Object) original2, "enumClassIfEnumEntry.original");
                            t = jvmTypeFactory.createObjectType(computeInternalName(original2, typeMappingConfiguration, z));
                        }
                    } else {
                        t = jvmTypeFactory.getJavaLangClassType();
                    }
                    nVar.invoke(kotlinType, t, typeMappingMode);
                    return t;
                }
                boolean z3 = z;
                if (declarationDescriptor instanceof TypeParameterDescriptor) {
                    try {
                        T mapType = mapType(TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) declarationDescriptor), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3(), z);
                        if (jvmDescriptorTypeWriter2 != null) {
                            Name name = declarationDescriptor.getName();
                            Intrinsics.checkReturnedValueIsNotNull((Object) name, "descriptor.getName()");
                            jvmDescriptorTypeWriter.writeTypeVariable(name, mapType);
                        }
                        return mapType;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type ");
                    sb.append(kotlinType);
                    throw new UnsupportedOperationException(sb.toString());
                }
            } else if (kotlinType.getArguments().size() == 1) {
                TypeProjection typeProjection = (TypeProjection) kotlinType.getArguments().get(0);
                KotlinType type = typeProjection.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, "memberProjection.type");
                if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                    obj = jvmTypeFactory.createObjectType("java/lang/Object");
                    if (jvmDescriptorTypeWriter2 != null) {
                        jvmDescriptorTypeWriter.writeArrayType();
                        jvmDescriptorTypeWriter.writeClass(obj);
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                } else {
                    if (jvmDescriptorTypeWriter2 != null) {
                        jvmDescriptorTypeWriter.writeArrayType();
                    }
                    Variance projectionKind = typeProjection.getProjectionKind();
                    Intrinsics.checkReturnedValueIsNotNull((Object) projectionKind, "memberProjection.projectionKind");
                    obj = mapType(type, jvmTypeFactory, typeMappingMode.toGenericArgumentMode(projectionKind), typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
                    if (jvmDescriptorTypeWriter2 != null) {
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[");
                sb2.append(jvmTypeFactory.toString(obj));
                return jvmTypeFactory.createFromString(sb2.toString());
            } else {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("no descriptor for type constructor of ");
            sb3.append(kotlinType);
            throw new UnsupportedOperationException(sb3.toString());
        }
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, C12853n nVar, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            nVar = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, nVar, z);
    }
}
