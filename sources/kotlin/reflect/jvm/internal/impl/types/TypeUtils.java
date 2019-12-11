package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;

public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final SimpleType CANT_INFER_FUNCTION_PARAM_TYPE = ErrorUtils.createErrorType("Cannot be inferred");
    public static final SimpleType DONT_CARE = ErrorUtils.createErrorTypeWithCustomDebugName("DONT_CARE");
    public static final SimpleType NO_EXPECTED_TYPE = new SpecialType("NO_EXPECTED_TYPE");
    public static final SimpleType UNIT_EXPECTED_TYPE = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {
        private final String name;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i != 1) {
                objArr[0] = "newAnnotations";
            } else {
                objArr[0] = str2;
            }
            if (i != 1) {
                objArr[1] = str2;
            } else {
                objArr[1] = "toString";
            }
            if (i != 1) {
                objArr[2] = "replaceAnnotations";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public SpecialType(String str) {
            this.name = str;
        }

        /* access modifiers changed from: protected */
        public SimpleType getDelegate() {
            throw new IllegalStateException(this.name);
        }

        public String toString() {
            String str = this.name;
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return str;
        }

        public SimpleType makeNullableAsSpecified(boolean z) {
            throw new IllegalStateException(this.name);
        }

        public SimpleType replaceAnnotations(Annotations annotations) {
            if (annotations == null) {
                $$$reportNull$$$0(0);
            }
            throw new IllegalStateException(this.name);
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 13:
                objArr[0] = "parameters";
                break;
            case 17:
                objArr[0] = "subType";
                break;
            case 18:
                objArr[0] = "superType";
                break;
            case 19:
                objArr[0] = "substitutor";
                break;
            case 21:
                objArr[0] = "result";
                break;
            case 28:
            case 30:
                objArr[0] = "clazz";
                break;
            case 29:
                objArr[0] = "typeArguments";
                break;
            case 31:
                objArr[0] = "projections";
                break;
            case 33:
                objArr[0] = "a";
                break;
            case 34:
                objArr[0] = "b";
                break;
            case 36:
                objArr[0] = "typeParameters";
                break;
            case 38:
                objArr[0] = "typeParameterConstructors";
                break;
            case 39:
                objArr[0] = "specialType";
                break;
            case 40:
            case 41:
                objArr[0] = "isSpecialType";
                break;
            case 42:
                objArr[0] = "parameterDescriptor";
                break;
            case 43:
            case 47:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 45:
            case 46:
                objArr[0] = "supertypes";
                break;
            case 48:
            case 51:
                objArr[0] = "expectedType";
                break;
            case 50:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 14) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 16) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 23) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 32) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 44) {
                    if (i3 != 49) {
                        if (!(i3 == 6 || i3 == 7)) {
                            if (i3 != 11 && i3 != 12) {
                                switch (i3) {
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                        break;
                                }
                            } else {
                                objArr[1] = "makeUnsubstitutedType";
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 13:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 15:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 17:
            case 18:
            case 19:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 20:
            case 21:
                objArr[2] = "collectAllSupertypes";
                break;
            case 22:
                objArr[2] = "getAllSupertypes";
                break;
            case 24:
                objArr[2] = "isNullableType";
                break;
            case 25:
                objArr[2] = "acceptsNullable";
                break;
            case 26:
                objArr[2] = "hasNullableSuperType";
                break;
            case 27:
                objArr[2] = "getClassDescriptor";
                break;
            case 28:
            case 29:
                objArr[2] = "substituteParameters";
                break;
            case 30:
            case 31:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "equalTypes";
                break;
            case 35:
            case 36:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 37:
            case 38:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "contains";
                break;
            case 42:
                objArr[2] = "makeStarProjection";
                break;
            case 43:
            case 45:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 46:
                objArr[2] = "findByFqName";
                break;
            case 47:
            case 48:
            case 50:
            case 51:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 56:
                objArr[2] = "isTypeParameter";
                break;
            case 57:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 58:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 59:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 14 || i3 == 16 || i3 == 23 || i3 == 32 || i3 == 44 || i3 == 49 || i3 == 6 || i3 == 7 || i3 == 11 || i3 == 12)) {
            switch (i3) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static boolean acceptsNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(25);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (!FlexibleTypesKt.isFlexible(kotlinType) || !acceptsNullable(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return false;
        }
        return true;
    }

    public static boolean contains(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(40);
        }
        return contains(kotlinType, function1, new HashSet());
    }

    public static KotlinType createSubstitutedSupertype(KotlinType kotlinType, KotlinType kotlinType2, TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(17);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(18);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(19);
        }
        KotlinType substitute = typeSubstitutor.substitute(kotlinType2, Variance.INVARIANT);
        if (substitute != null) {
            return makeNullableIfNeeded(substitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static ClassDescriptor getClassDescriptor(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(27);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) declarationDescriptor;
        }
        return null;
    }

    public static List<TypeProjection> getDefaultTypeProjections(List<TypeParameterDescriptor> list) {
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (TypeParameterDescriptor defaultType : list) {
            arrayList.add(new TypeProjectionImpl(defaultType.getDefaultType()));
        }
        List<TypeProjection> q = C13199w.m40606q(arrayList);
        if (q == null) {
            $$$reportNull$$$0(14);
        }
        return q;
    }

    public static List<KotlinType> getImmediateSupertypes(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(15);
        }
        TypeSubstitutor create = TypeSubstitutor.create(kotlinType);
        Collection<KotlinType> supertypes = kotlinType.getConstructor().getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        for (KotlinType createSubstitutedSupertype : supertypes) {
            KotlinType createSubstitutedSupertype2 = createSubstitutedSupertype(kotlinType, createSubstitutedSupertype, create);
            if (createSubstitutedSupertype2 != null) {
                arrayList.add(createSubstitutedSupertype2);
            }
        }
        return arrayList;
    }

    public static TypeParameterDescriptor getTypeParameterDescriptorOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(59);
        }
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.getConstructor().getDeclarationDescriptor();
        }
        return null;
    }

    public static boolean hasNullableSuperType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(26);
        }
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
            return false;
        }
        for (KotlinType isNullableType : getImmediateSupertypes(kotlinType)) {
            if (isNullableType(isNullableType)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDontCarePlaceholder(KotlinType kotlinType) {
        return kotlinType != null && kotlinType.getConstructor() == DONT_CARE.getConstructor();
    }

    public static boolean isNullableType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(24);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            for (KotlinType isNullableType : constructor.getSupertypes()) {
                if (isNullableType(isNullableType)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTypeParameter(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(56);
        }
        return getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof NewTypeVariableConstructor);
    }

    public static KotlinType makeNotNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(2);
        }
        return makeNullableAsSpecified(kotlinType, false);
    }

    public static KotlinType makeNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        return makeNullableAsSpecified(kotlinType, true);
    }

    public static KotlinType makeNullableAsSpecified(KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(3);
        }
        UnwrappedType makeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z);
        if (makeNullableAsSpecified == null) {
            $$$reportNull$$$0(4);
        }
        return makeNullableAsSpecified;
    }

    public static KotlinType makeNullableIfNeeded(KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(8);
        }
        if (z) {
            return makeNullable(kotlinType);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
        }
        return kotlinType;
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(42);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    public static SimpleType makeUnsubstitutedType(ClassifierDescriptor classifierDescriptor, MemberScope memberScope) {
        if (ErrorUtils.isError(classifierDescriptor)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsubstituted type for ");
            sb.append(classifierDescriptor);
            SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
            if (createErrorType == null) {
                $$$reportNull$$$0(11);
            }
            return createErrorType;
        }
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        SimpleType simpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(Annotations.Companion.getEMPTY(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope);
        if (simpleTypeWithNonTrivialMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return simpleTypeWithNonTrivialMemberScope;
    }

    public static boolean noExpectedType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
        return kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE;
    }

    private static boolean contains(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1, HashSet<KotlinType> hashSet) {
        if (function1 == null) {
            $$$reportNull$$$0(41);
        }
        if (kotlinType == null || hashSet.contains(kotlinType)) {
            return false;
        }
        hashSet.add(kotlinType);
        UnwrappedType unwrap = kotlinType.unwrap();
        if (((Boolean) function1.invoke(unwrap)).booleanValue()) {
            return true;
        }
        FlexibleType flexibleType = unwrap instanceof FlexibleType ? (FlexibleType) unwrap : null;
        if (flexibleType != null && (contains(flexibleType.getLowerBound(), function1, hashSet) || contains(flexibleType.getUpperBound(), function1, hashSet))) {
            return true;
        }
        if ((unwrap instanceof DefinitelyNotNullType) && contains(((DefinitelyNotNullType) unwrap).getOriginal(), function1, hashSet)) {
            return true;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            for (KotlinType contains : ((IntersectionTypeConstructor) constructor).getSupertypes()) {
                if (contains(contains, function1, hashSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection()) {
                if (contains(typeProjection.getType(), function1, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }
}
