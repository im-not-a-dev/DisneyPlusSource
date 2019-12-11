package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* compiled from: ClassicTypeCheckerContext.kt */
public class ClassicTypeCheckerContext extends AbstractTypeCheckerContext implements ClassicTypeSystemContext {
    public static final Companion Companion = new Companion(null);
    private final boolean allowedTypeVariable;
    private final boolean errorTypeEqualsToAnything;

    /* compiled from: ClassicTypeCheckerContext.kt */
    public static final class Companion {
        private Companion() {
        }

        public final DoCustomTransform classicSubstitutionSupertypePolicy(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                return new C13122x9ae7c99c(classicTypeSystemContext, TypeConstructorSubstitution.Companion.create((KotlinType) simpleTypeMarker).buildSubstitutor());
            }
            throw new IllegalArgumentException(ClassicTypeCheckerContextKt.errorMessage(simpleTypeMarker).toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClassicTypeCheckerContext(boolean z, boolean z2) {
        this.errorTypeEqualsToAnything = z;
        this.allowedTypeVariable = z2;
    }

    public boolean areEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        if (!(typeConstructorMarker instanceof TypeConstructor)) {
            throw new IllegalArgumentException(ClassicTypeCheckerContextKt.errorMessage(typeConstructorMarker).toString());
        } else if (typeConstructorMarker2 instanceof TypeConstructor) {
            return areEqualTypeConstructors((TypeConstructor) typeConstructorMarker, (TypeConstructor) typeConstructorMarker2);
        } else {
            throw new IllegalArgumentException(ClassicTypeCheckerContextKt.errorMessage(typeConstructorMarker2).toString());
        }
    }

    public int argumentsCount(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.argumentsCount(this, kotlinTypeMarker);
    }

    public TypeArgumentListMarker asArgumentList(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.asArgumentList(this, simpleTypeMarker);
    }

    public CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.asCapturedType(this, simpleTypeMarker);
    }

    public DefinitelyNotNullTypeMarker asDefinitelyNotNullType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.asDefinitelyNotNullType(this, simpleTypeMarker);
    }

    public DynamicTypeMarker asDynamicType(FlexibleTypeMarker flexibleTypeMarker) {
        return DefaultImpls.asDynamicType(this, flexibleTypeMarker);
    }

    public FlexibleTypeMarker asFlexibleType(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.asFlexibleType(this, kotlinTypeMarker);
    }

    public SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.asSimpleType(this, kotlinTypeMarker);
    }

    public TypeArgumentMarker asTypeArgument(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.asTypeArgument(this, kotlinTypeMarker);
    }

    public SimpleTypeMarker captureFromArguments(SimpleTypeMarker simpleTypeMarker, CaptureStatus captureStatus) {
        return DefaultImpls.captureFromArguments(this, simpleTypeMarker, captureStatus);
    }

    public List<SimpleTypeMarker> fastCorrespondingSupertypes(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.fastCorrespondingSupertypes(this, simpleTypeMarker, typeConstructorMarker);
    }

    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        return DefaultImpls.get(this, typeArgumentListMarker, i);
    }

    public TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i) {
        return DefaultImpls.getArgument(this, kotlinTypeMarker, i);
    }

    public TypeArgumentMarker getArgumentOrNull(SimpleTypeMarker simpleTypeMarker, int i) {
        return DefaultImpls.getArgumentOrNull(this, simpleTypeMarker, i);
    }

    public TypeParameterMarker getParameter(TypeConstructorMarker typeConstructorMarker, int i) {
        return DefaultImpls.getParameter(this, typeConstructorMarker, i);
    }

    public KotlinTypeMarker getType(TypeArgumentMarker typeArgumentMarker) {
        return DefaultImpls.getType(this, typeArgumentMarker);
    }

    public TypeVariance getVariance(TypeArgumentMarker typeArgumentMarker) {
        return DefaultImpls.getVariance((ClassicTypeSystemContext) this, typeArgumentMarker);
    }

    public boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.hasFlexibleNullability(this, kotlinTypeMarker);
    }

    public boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }

    public KotlinTypeMarker intersectTypes(List<? extends KotlinTypeMarker> list) {
        return DefaultImpls.intersectTypes(this, list);
    }

    public boolean isAllowedTypeVariable(KotlinTypeMarker kotlinTypeMarker) {
        return (kotlinTypeMarker instanceof UnwrappedType) && this.allowedTypeVariable && (((UnwrappedType) kotlinTypeMarker).getConstructor() instanceof NewTypeVariableConstructor);
    }

    public boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    public boolean isClassType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isClassType(this, simpleTypeMarker);
    }

    public boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    public boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    public boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isDefinitelyNotNullType(this, kotlinTypeMarker);
    }

    public boolean isDenotable(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    public boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isDynamic(this, kotlinTypeMarker);
    }

    public boolean isEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        return DefaultImpls.isEqualTypeConstructors(this, typeConstructorMarker, typeConstructorMarker2);
    }

    public boolean isError(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isError(this, kotlinTypeMarker);
    }

    public boolean isErrorTypeEqualsToAnything() {
        return this.errorTypeEqualsToAnything;
    }

    public boolean isIntegerLiteralType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isIntegerLiteralType(this, simpleTypeMarker);
    }

    public boolean isIntegerLiteralTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isIntegerLiteralTypeConstructor(this, typeConstructorMarker);
    }

    public boolean isIntersection(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isIntersection(this, typeConstructorMarker);
    }

    public boolean isMarkedNullable(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isMarkedNullable(this, simpleTypeMarker);
    }

    public boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isNothing(this, kotlinTypeMarker);
    }

    public boolean isNothingConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isNothingConstructor(this, typeConstructorMarker);
    }

    public boolean isNullableType(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isNullableType(this, kotlinTypeMarker);
    }

    public boolean isSingleClassifierType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isSingleClassifierType(this, simpleTypeMarker);
    }

    public boolean isStarProjection(TypeArgumentMarker typeArgumentMarker) {
        return DefaultImpls.isStarProjection(this, typeArgumentMarker);
    }

    public boolean isStubType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isStubType(this, simpleTypeMarker);
    }

    public SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker) {
        return DefaultImpls.lowerBound(this, flexibleTypeMarker);
    }

    public SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.lowerBoundIfFlexible(this, kotlinTypeMarker);
    }

    public KotlinTypeMarker lowerType(CapturedTypeMarker capturedTypeMarker) {
        return DefaultImpls.lowerType(this, capturedTypeMarker);
    }

    public int parametersCount(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    public Collection<KotlinTypeMarker> possibleIntegerTypes(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.possibleIntegerTypes(this, simpleTypeMarker);
    }

    public KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker) {
        return NewKotlinTypeChecker.INSTANCE.transformToNewType(((KotlinType) kotlinTypeMarker).unwrap());
    }

    public int size(TypeArgumentListMarker typeArgumentListMarker) {
        return DefaultImpls.size(this, typeArgumentListMarker);
    }

    public Collection<KotlinTypeMarker> supertypes(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.supertypes(this, typeConstructorMarker);
    }

    public TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, kotlinTypeMarker);
    }

    public SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker) {
        return DefaultImpls.upperBound(this, flexibleTypeMarker);
    }

    public SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.upperBoundIfFlexible(this, kotlinTypeMarker);
    }

    public SimpleTypeMarker withNullability(SimpleTypeMarker simpleTypeMarker, boolean z) {
        return DefaultImpls.withNullability(this, simpleTypeMarker, z);
    }

    public /* synthetic */ ClassicTypeCheckerContext(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }

    public TypeVariance getVariance(TypeParameterMarker typeParameterMarker) {
        return DefaultImpls.getVariance((ClassicTypeSystemContext) this, typeParameterMarker);
    }

    public DoCustomTransform substitutionSupertypePolicy(SimpleTypeMarker simpleTypeMarker) {
        return Companion.classicSubstitutionSupertypePolicy(this, simpleTypeMarker);
    }

    public TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, simpleTypeMarker);
    }

    public boolean areEqualTypeConstructors(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor instanceof IntegerLiteralTypeConstructor) {
            return ((IntegerLiteralTypeConstructor) typeConstructor).checkConstructor(typeConstructor2);
        }
        if (typeConstructor2 instanceof IntegerLiteralTypeConstructor) {
            return ((IntegerLiteralTypeConstructor) typeConstructor2).checkConstructor(typeConstructor);
        }
        return C12880j.m40224a((Object) typeConstructor, (Object) typeConstructor2);
    }
}
