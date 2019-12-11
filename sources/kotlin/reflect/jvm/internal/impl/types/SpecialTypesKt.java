package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: SpecialTypes.kt */
public final class SpecialTypesKt {
    public static final AbbreviatedType getAbbreviatedType(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof AbbreviatedType)) {
            unwrap = null;
        }
        return (AbbreviatedType) unwrap;
    }

    public static final SimpleType getAbbreviation(KotlinType kotlinType) {
        AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(KotlinType kotlinType) {
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(UnwrappedType unwrappedType) {
        UnwrappedType makeDefinitelyNotNull$descriptors = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(unwrappedType);
        if (makeDefinitelyNotNull$descriptors == null) {
            makeDefinitelyNotNull$descriptors = makeIntersectionTypeDefinitelyNotNullOrNotNull(unwrappedType);
        }
        return makeDefinitelyNotNull$descriptors != null ? makeDefinitelyNotNull$descriptors : unwrappedType.makeNullableAsSpecified(false);
    }

    private static final SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull(KotlinType kotlinType) {
        TypeConstructor constructor = kotlinType.getConstructor();
        if (!(constructor instanceof IntersectionTypeConstructor)) {
            constructor = null;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
        if (intersectionTypeConstructor != null) {
            IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(intersectionTypeConstructor);
            if (makeDefinitelyNotNullOrNotNull != null) {
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlinType.getAnnotations(), makeDefinitelyNotNullOrNotNull, C13185o.m40513a(), false, makeDefinitelyNotNullOrNotNull.createScopeForKotlinType());
            }
        }
        return null;
    }

    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(SimpleType simpleType) {
        SimpleType makeDefinitelyNotNull$descriptors = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(simpleType);
        if (makeDefinitelyNotNull$descriptors == null) {
            makeDefinitelyNotNull$descriptors = makeIntersectionTypeDefinitelyNotNullOrNotNull(simpleType);
        }
        return makeDefinitelyNotNull$descriptors != null ? makeDefinitelyNotNull$descriptors : simpleType.makeNullableAsSpecified(false);
    }

    public static final SimpleType withAbbreviation(SimpleType simpleType, SimpleType simpleType2) {
        if (KotlinTypeKt.isError(simpleType)) {
            return simpleType;
        }
        return new AbbreviatedType(simpleType, simpleType2);
    }

    private static final IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull(IntersectionTypeConstructor intersectionTypeConstructor) {
        Collection<KotlinType> supertypes = intersectionTypeConstructor.getSupertypes();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) supertypes, 10));
        boolean z = false;
        for (KotlinType kotlinType : supertypes) {
            if (TypeUtils.isNullableType(kotlinType)) {
                z = true;
                kotlinType = makeDefinitelyNotNullOrNotNull(kotlinType.unwrap());
            }
            arrayList.add(kotlinType);
        }
        if (!z) {
            return null;
        }
        return new IntersectionTypeConstructor(arrayList);
    }
}
