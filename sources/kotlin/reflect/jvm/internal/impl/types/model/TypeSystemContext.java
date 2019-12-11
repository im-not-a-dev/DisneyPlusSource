package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;

/* compiled from: TypeSystemContext.kt */
public interface TypeSystemContext extends TypeSystemOptimizationContext {

    /* compiled from: TypeSystemContext.kt */
    public static final class DefaultImpls {
        public static List<SimpleTypeMarker> fastCorrespondingSupertypes(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
            return null;
        }

        public static TypeArgumentMarker get(TypeSystemContext typeSystemContext, TypeArgumentListMarker typeArgumentListMarker, int i) {
            if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                return typeSystemContext.getArgument((KotlinTypeMarker) typeArgumentListMarker, i);
            }
            if (typeArgumentListMarker instanceof ArgumentList) {
                Object obj = ((ArgumentList) typeArgumentListMarker).get(i);
                C12880j.m40222a(obj, "get(index)");
                return (TypeArgumentMarker) obj;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown type argument list type: ");
            sb.append(typeArgumentListMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeArgumentListMarker.getClass()));
            throw new IllegalStateException(sb.toString().toString());
        }

        public static TypeArgumentMarker getArgumentOrNull(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, int i) {
            int argumentsCount = typeSystemContext.argumentsCount(simpleTypeMarker);
            if (i >= 0 && argumentsCount > i) {
                return typeSystemContext.getArgument(simpleTypeMarker, i);
            }
            return null;
        }

        public static boolean hasFlexibleNullability(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker)) != typeSystemContext.isMarkedNullable(typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker));
        }

        public static boolean identicalArguments(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext.DefaultImpls.identicalArguments(typeSystemContext, simpleTypeMarker, simpleTypeMarker2);
        }

        public static boolean isClassType(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return typeSystemContext.isClassTypeConstructor(typeSystemContext.typeConstructor(simpleTypeMarker));
        }

        public static boolean isDefinitelyNotNullType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
            return (asSimpleType != null ? typeSystemContext.asDefinitelyNotNullType(asSimpleType) : null) != null;
        }

        public static boolean isDynamic(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
            return (asFlexibleType != null ? typeSystemContext.asDynamicType(asFlexibleType) : null) != null;
        }

        public static boolean isIntegerLiteralType(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return typeSystemContext.isIntegerLiteralTypeConstructor(typeSystemContext.typeConstructor(simpleTypeMarker));
        }

        public static boolean isNothing(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(kotlinTypeMarker)) && !typeSystemContext.isNullableType(kotlinTypeMarker);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
            if (r0 != null) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r1, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r2) {
            /*
                kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker r0 = r1.asFlexibleType(r2)
                if (r0 == 0) goto L_0x000d
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r1.lowerBound(r0)
                if (r0 == 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r1.asSimpleType(r2)
                if (r0 == 0) goto L_0x0014
            L_0x0013:
                return r0
            L_0x0014:
                kotlin.jvm.internal.C12880j.m40220a()
                r1 = 0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker");
        }

        public static int size(TypeSystemContext typeSystemContext, TypeArgumentListMarker typeArgumentListMarker) {
            if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                return typeSystemContext.argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
            }
            if (typeArgumentListMarker instanceof ArgumentList) {
                return ((ArgumentList) typeArgumentListMarker).size();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown type argument list type: ");
            sb.append(typeArgumentListMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeArgumentListMarker.getClass()));
            throw new IllegalStateException(sb.toString().toString());
        }

        public static TypeConstructorMarker typeConstructor(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
            if (asSimpleType == null) {
                asSimpleType = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker);
            }
            return typeSystemContext.typeConstructor(asSimpleType);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
            if (r0 != null) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r1, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r2) {
            /*
                kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker r0 = r1.asFlexibleType(r2)
                if (r0 == 0) goto L_0x000d
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r1.upperBound(r0)
                if (r0 == 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r1.asSimpleType(r2)
                if (r0 == 0) goto L_0x0014
            L_0x0013:
                return r0
            L_0x0014:
                kotlin.jvm.internal.C12880j.m40220a()
                r1 = 0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker");
        }
    }

    int argumentsCount(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentListMarker asArgumentList(SimpleTypeMarker simpleTypeMarker);

    CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker);

    DefinitelyNotNullTypeMarker asDefinitelyNotNullType(SimpleTypeMarker simpleTypeMarker);

    DynamicTypeMarker asDynamicType(FlexibleTypeMarker flexibleTypeMarker);

    FlexibleTypeMarker asFlexibleType(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentMarker asTypeArgument(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker captureFromArguments(SimpleTypeMarker simpleTypeMarker, CaptureStatus captureStatus);

    TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i);

    TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i);

    TypeParameterMarker getParameter(TypeConstructorMarker typeConstructorMarker, int i);

    KotlinTypeMarker getType(TypeArgumentMarker typeArgumentMarker);

    TypeVariance getVariance(TypeArgumentMarker typeArgumentMarker);

    TypeVariance getVariance(TypeParameterMarker typeParameterMarker);

    KotlinTypeMarker intersectTypes(List<? extends KotlinTypeMarker> list);

    boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isDenotable(TypeConstructorMarker typeConstructorMarker);

    boolean isEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    boolean isError(KotlinTypeMarker kotlinTypeMarker);

    boolean isIntegerLiteralTypeConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isIntersection(TypeConstructorMarker typeConstructorMarker);

    boolean isMarkedNullable(SimpleTypeMarker simpleTypeMarker);

    boolean isNothingConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isNullableType(KotlinTypeMarker kotlinTypeMarker);

    boolean isSingleClassifierType(SimpleTypeMarker simpleTypeMarker);

    boolean isStarProjection(TypeArgumentMarker typeArgumentMarker);

    boolean isStubType(SimpleTypeMarker simpleTypeMarker);

    SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker);

    SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker lowerType(CapturedTypeMarker capturedTypeMarker);

    int parametersCount(TypeConstructorMarker typeConstructorMarker);

    Collection<KotlinTypeMarker> possibleIntegerTypes(SimpleTypeMarker simpleTypeMarker);

    int size(TypeArgumentListMarker typeArgumentListMarker);

    Collection<KotlinTypeMarker> supertypes(TypeConstructorMarker typeConstructorMarker);

    TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker);

    TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker);

    SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker);

    SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker withNullability(SimpleTypeMarker simpleTypeMarker, boolean z);
}
