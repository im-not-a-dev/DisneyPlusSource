package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
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

/* compiled from: NewKotlinTypeChecker.kt */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {
    public static final SimpleClassicTypeSystemContext INSTANCE = new SimpleClassicTypeSystemContext();

    private SimpleClassicTypeSystemContext() {
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

    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        return DefaultImpls.get(this, typeArgumentListMarker, i);
    }

    public TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i) {
        return DefaultImpls.getArgument(this, kotlinTypeMarker, i);
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

    public boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }

    public KotlinTypeMarker intersectTypes(List<? extends KotlinTypeMarker> list) {
        return DefaultImpls.intersectTypes(this, list);
    }

    public boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    public boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    public boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    public boolean isDenotable(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    public boolean isEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        return DefaultImpls.isEqualTypeConstructors(this, typeConstructorMarker, typeConstructorMarker2);
    }

    public boolean isError(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isError(this, kotlinTypeMarker);
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

    public AbstractTypeCheckerContext newBaseTypeCheckerContext(boolean z) {
        return DefaultImpls.newBaseTypeCheckerContext(this, z);
    }

    public int parametersCount(TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    public Collection<KotlinTypeMarker> possibleIntegerTypes(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.possibleIntegerTypes(this, simpleTypeMarker);
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

    public TypeVariance getVariance(TypeParameterMarker typeParameterMarker) {
        return DefaultImpls.getVariance((ClassicTypeSystemContext) this, typeParameterMarker);
    }

    public TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, simpleTypeMarker);
    }
}
