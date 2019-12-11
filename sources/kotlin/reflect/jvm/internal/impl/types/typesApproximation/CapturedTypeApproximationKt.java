package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C12898l;
import kotlin.C13142s;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: CapturedTypeApproximation.kt */
public final class CapturedTypeApproximationKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Variance.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Variance.values().length];

        static {
            $EnumSwitchMapping$0[Variance.INVARIANT.ordinal()] = 1;
            $EnumSwitchMapping$0[Variance.IN_VARIANCE.ordinal()] = 2;
            $EnumSwitchMapping$0[Variance.OUT_VARIANCE.ordinal()] = 3;
            $EnumSwitchMapping$1[Variance.IN_VARIANCE.ordinal()] = 1;
            $EnumSwitchMapping$1[Variance.OUT_VARIANCE.ordinal()] = 2;
        }
    }

    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(KotlinType kotlinType) {
        Object obj;
        ApproximationBounds<KotlinType> approximationBounds;
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds approximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds approximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible((KotlinType) approximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible((KotlinType) approximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible((KotlinType) approximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible((KotlinType) approximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        String str = "type.builtIns.nothingType";
        if (CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            if (constructor != null) {
                TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
                CapturedTypeApproximationKt$approximateCapturedTypes$1 capturedTypeApproximationKt$approximateCapturedTypes$1 = new CapturedTypeApproximationKt$approximateCapturedTypes$1(kotlinType);
                KotlinType type = projection.getType();
                C12880j.m40222a((Object) type, "typeProjection.type");
                KotlinType invoke = capturedTypeApproximationKt$approximateCapturedTypes$1.invoke(type);
                int i = WhenMappings.$EnumSwitchMapping$1[projection.getProjectionKind().ordinal()];
                if (i == 1) {
                    SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
                    C12880j.m40222a((Object) nullableAnyType, "type.builtIns.nullableAnyType");
                    approximationBounds = new ApproximationBounds<>(invoke, nullableAnyType);
                } else if (i == 2) {
                    SimpleType nothingType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                    C12880j.m40222a((Object) nothingType, str);
                    approximationBounds = new ApproximationBounds<>(capturedTypeApproximationKt$approximateCapturedTypes$1.invoke((KotlinType) nothingType), invoke);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Only nontrivial projections should have been captured, not: ");
                    sb.append(projection);
                    throw new AssertionError(sb.toString());
                }
                return approximationBounds;
            }
            throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
        } else if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List arguments = kotlinType.getArguments();
            List parameters = constructor.getParameters();
            C12880j.m40222a((Object) parameters, "typeConstructor.parameters");
            for (Pair pair : C13199w.m40586e((Iterable) arguments, (Iterable) parameters)) {
                TypeProjection typeProjection = (TypeProjection) pair.mo31013a();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.mo31014b();
                C12880j.m40222a((Object) typeParameterDescriptor, "typeParameter");
                TypeArgument typeArgument = toTypeArgument(typeProjection, typeParameterDescriptor);
                if (typeProjection.isStarProjection()) {
                    arrayList.add(typeArgument);
                    arrayList2.add(typeArgument);
                } else {
                    ApproximationBounds approximateProjection = approximateProjection(typeArgument);
                    TypeArgument typeArgument2 = (TypeArgument) approximateProjection.component1();
                    TypeArgument typeArgument3 = (TypeArgument) approximateProjection.component2();
                    arrayList.add(typeArgument2);
                    arrayList2.add(typeArgument3);
                }
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((TypeArgument) it.next()).isConsistent()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                obj = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                C12880j.m40222a(obj, str);
            } else {
                obj = replaceTypeArguments(kotlinType, arrayList);
            }
            return new ApproximationBounds<>(obj, replaceTypeArguments(kotlinType, arrayList2));
        }
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        C12880j.m40222a((Object) type, "typeProjection.type");
        if (!TypeUtils.contains(type, C13129x21acc51c.INSTANCE)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        C12880j.m40222a((Object) projectionKind, "typeProjection.projectionKind");
        if (projectionKind == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(projectionKind, (KotlinType) approximateCapturedTypes(type).getUpper());
        }
        if (z) {
            return new TypeProjectionImpl(projectionKind, (KotlinType) approximateCapturedTypes(type).getLower());
        }
        return substituteCapturedTypesWithProjections(typeProjection);
    }

    private static final ApproximationBounds<TypeArgument> approximateProjection(TypeArgument typeArgument) {
        ApproximationBounds approximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        KotlinType kotlinType = (KotlinType) approximateCapturedTypes.component1();
        KotlinType kotlinType2 = (KotlinType) approximateCapturedTypes.component2();
        ApproximationBounds approximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new ApproximationBounds<>(new TypeArgument(typeArgument.getTypeParameter(), kotlinType2, (KotlinType) approximateCapturedTypes2.component1()), new TypeArgument(typeArgument.getTypeParameter(), kotlinType, (KotlinType) approximateCapturedTypes2.component2()));
    }

    private static final KotlinType replaceTypeArguments(KotlinType kotlinType, List<TypeArgument> list) {
        boolean z = kotlinType.getArguments().size() == list.size();
        if (!C13147x.f29590a || z) {
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (TypeArgument typeProjection : list) {
                arrayList.add(toTypeProjection(typeProjection));
            }
            return TypeSubstitutionKt.replace$default(kotlinType, (List) arrayList, (Annotations) null, 2, (Object) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incorrect type arguments ");
        sb.append(list);
        throw new AssertionError(sb.toString());
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        TypeSubstitutor create = TypeSubstitutor.create((TypeSubstitution) new C13130x12aaa596());
        C12880j.m40222a((Object) create, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return create.substituteWithoutApproximation(typeProjection);
    }

    private static final TypeArgument toTypeArgument(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        String str = "type";
        if (i == 1) {
            KotlinType type = typeProjection.getType();
            C12880j.m40222a((Object) type, str);
            KotlinType type2 = typeProjection.getType();
            C12880j.m40222a((Object) type2, str);
            return new TypeArgument(typeParameterDescriptor, type, type2);
        } else if (i == 2) {
            KotlinType type3 = typeProjection.getType();
            C12880j.m40222a((Object) type3, str);
            SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            C12880j.m40222a((Object) nullableAnyType, "typeParameter.builtIns.nullableAnyType");
            return new TypeArgument(typeParameterDescriptor, type3, nullableAnyType);
        } else if (i == 3) {
            SimpleType nothingType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
            C12880j.m40222a((Object) nothingType, "typeParameter.builtIns.nothingType");
            KotlinType type4 = typeProjection.getType();
            C12880j.m40222a((Object) type4, str);
            return new TypeArgument(typeParameterDescriptor, nothingType, type4);
        } else {
            throw new C12898l();
        }
    }

    private static final TypeProjection toTypeProjection(TypeArgument typeArgument) {
        boolean isConsistent = typeArgument.isConsistent();
        if (!C13147x.f29590a || isConsistent) {
            CapturedTypeApproximationKt$toTypeProjection$2 capturedTypeApproximationKt$toTypeProjection$2 = new CapturedTypeApproximationKt$toTypeProjection$2(typeArgument);
            if (C12880j.m40224a((Object) typeArgument.getInProjection(), (Object) typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(typeArgument.getInProjection());
            }
            if (KotlinBuiltIns.isNothing(typeArgument.getInProjection()) && typeArgument.getTypeParameter().getVariance() != Variance.IN_VARIANCE) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
            }
            if (KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.IN_VARIANCE), typeArgument.getInProjection());
            }
            return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
        }
        DescriptorRenderer withOptions = DescriptorRenderer.Companion.withOptions(C13131x8e300b6.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append("Only consistent enhanced type projection can be converted to type projection, but ");
        sb.append('[');
        sb.append(withOptions.render(typeArgument.getTypeParameter()));
        sb.append(": <");
        sb.append(withOptions.renderType(typeArgument.getInProjection()));
        sb.append(", ");
        sb.append(withOptions.renderType(typeArgument.getOutProjection()));
        sb.append(">]");
        sb.append(" was found");
        throw new AssertionError(sb.toString());
    }
}
