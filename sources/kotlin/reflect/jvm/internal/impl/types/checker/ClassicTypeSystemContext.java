package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StubType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
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
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: ClassicTypeSystemContext.kt */
public interface ClassicTypeSystemContext extends TypeSystemInferenceExtensionContext {

    /* compiled from: ClassicTypeSystemContext.kt */
    public static final class DefaultImpls {
        public static int argumentsCount(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().size();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeArgumentListMarker asArgumentList(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) simpleTypeMarker;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static CapturedTypeMarker asCapturedType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                if (!(simpleTypeMarker instanceof NewCapturedType)) {
                    simpleTypeMarker = null;
                }
                return (NewCapturedType) simpleTypeMarker;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                if (!(simpleTypeMarker instanceof DefinitelyNotNullType)) {
                    simpleTypeMarker = null;
                }
                return (DefinitelyNotNullType) simpleTypeMarker;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static DynamicTypeMarker asDynamicType(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (!(flexibleTypeMarker instanceof DynamicType)) {
                    flexibleTypeMarker = null;
                }
                return (DynamicType) flexibleTypeMarker;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(flexibleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static FlexibleTypeMarker asFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (!(unwrap instanceof FlexibleType)) {
                    unwrap = null;
                }
                return (FlexibleType) unwrap;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker asSimpleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (!(unwrap instanceof SimpleType)) {
                    unwrap = null;
                }
                return (SimpleType) unwrap;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeArgumentMarker asTypeArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker captureFromArguments(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, CaptureStatus captureStatus) {
            if (simpleTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments$default((SimpleType) simpleTypeMarker, captureStatus, null, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static List<SimpleTypeMarker> fastCorrespondingSupertypes(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.fastCorrespondingSupertypes(classicTypeSystemContext, simpleTypeMarker, typeConstructorMarker);
        }

        public static TypeArgumentMarker get(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentListMarker typeArgumentListMarker, int i) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.get(classicTypeSystemContext, typeArgumentListMarker, i);
        }

        public static TypeArgumentMarker getArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, int i) {
            if (kotlinTypeMarker instanceof KotlinType) {
                return (TypeArgumentMarker) ((KotlinType) kotlinTypeMarker).getArguments().get(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeArgumentMarker getArgumentOrNull(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, int i) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.getArgumentOrNull(classicTypeSystemContext, simpleTypeMarker, i);
        }

        public static TypeParameterMarker getParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker, int i) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                Object obj = ((TypeConstructor) typeConstructorMarker).getParameters().get(i);
                C12880j.m40222a(obj, "this.parameters[index]");
                return (TypeParameterMarker) obj;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static KotlinTypeMarker getType(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().unwrap();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeArgumentMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) typeArgumentMarker).getProjectionKind();
                C12880j.m40222a((Object) projectionKind, "this.projectionKind");
                return ClassicTypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeArgumentMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean hasFlexibleNullability(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.hasFlexibleNullability(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static boolean identicalArguments(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            String str = ", ";
            String str2 = "ClassicTypeSystemContext couldn't handle: ";
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(simpleTypeMarker);
                sb.append(str);
                sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (simpleTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getArguments() == ((SimpleType) simpleTypeMarker2).getArguments();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(simpleTypeMarker2);
                sb2.append(str);
                sb2.append(C12895y.m40230a(simpleTypeMarker2.getClass()));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }

        public static KotlinTypeMarker intersectTypes(ClassicTypeSystemContext classicTypeSystemContext, List<? extends KotlinTypeMarker> list) {
            return IntersectionTypeKt.intersectTypes(list);
        }

        public static boolean isAnyConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, KotlinBuiltIns.FQ_NAMES.any);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isClassType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isClassType(classicTypeSystemContext, simpleTypeMarker);
        }

        public static boolean isClassTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isCommonFinalClassConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor declarationDescriptor = ((TypeConstructor) typeConstructorMarker).getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof ClassDescriptor)) {
                    declarationDescriptor = null;
                }
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor == null || !ModalityKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isDefinitelyNotNullType(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static boolean isDenotable(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).isDenotable();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isDynamic(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isDynamic(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static boolean isEqualTypeConstructors(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
            String str = ", ";
            String str2 = "ClassicTypeSystemContext couldn't handle: ";
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(typeConstructorMarker);
                sb.append(str);
                sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (typeConstructorMarker2 instanceof TypeConstructor) {
                return C12880j.m40224a((Object) typeConstructorMarker, (Object) typeConstructorMarker2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(typeConstructorMarker2);
                sb2.append(str);
                sb2.append(C12895y.m40230a(typeConstructorMarker2.getClass()));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }

        public static boolean isError(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isIntegerLiteralType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isIntegerLiteralType(classicTypeSystemContext, simpleTypeMarker);
        }

        public static boolean isIntegerLiteralTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isIntersection(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isMarkedNullable(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).isMarkedNullable();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isNothing(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isNothing(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static boolean isNothingConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, KotlinBuiltIns.FQ_NAMES.nothing);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isNullableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(kotlinTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isSingleClassifierType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                if (!KotlinTypeKt.isError((KotlinType) simpleTypeMarker)) {
                    SimpleType simpleType = (SimpleType) simpleTypeMarker;
                    if (!(simpleType.getConstructor().getDeclarationDescriptor() instanceof TypeAliasDescriptor) && (simpleType.getConstructor().getDeclarationDescriptor() != null || (simpleTypeMarker instanceof CapturedType) || (simpleTypeMarker instanceof NewCapturedType) || (simpleTypeMarker instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor))) {
                        return true;
                    }
                }
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isStarProjection(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).isStarProjection();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeArgumentMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isStubType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                return simpleTypeMarker instanceof StubType;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker lowerBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getLowerBound();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(flexibleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker lowerBoundIfFlexible(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.lowerBoundIfFlexible(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static KotlinTypeMarker lowerType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getLowerType();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(capturedTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static AbstractTypeCheckerContext newBaseTypeCheckerContext(ClassicTypeSystemContext classicTypeSystemContext, boolean z) {
            return new ClassicTypeCheckerContext(z, false, 2, null);
        }

        public static int parametersCount(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static Collection<KotlinTypeMarker> possibleIntegerTypes(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            TypeConstructorMarker typeConstructor = classicTypeSystemContext.typeConstructor(simpleTypeMarker);
            if (typeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructor).getPossibleTypes();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static int size(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentListMarker typeArgumentListMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.size(classicTypeSystemContext, typeArgumentListMarker);
        }

        public static Collection<KotlinTypeMarker> supertypes(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinTypeMarker> supertypes = ((TypeConstructor) typeConstructorMarker).getSupertypes();
                C12880j.m40222a((Object) supertypes, "this.supertypes");
                return supertypes;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeConstructorMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.typeConstructor(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getConstructor();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker upperBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getUpperBound();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(flexibleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static SimpleTypeMarker upperBoundIfFlexible(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.upperBoundIfFlexible(classicTypeSystemContext, kotlinTypeMarker);
        }

        public static SimpleTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, boolean z) {
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).makeNullableAsSpecified(z);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(simpleTypeMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker) {
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) typeParameterMarker).getVariance();
                C12880j.m40222a((Object) variance, "this.variance");
                return ClassicTypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            sb.append(C12895y.m40230a(typeParameterMarker.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker);

    TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker);
}
