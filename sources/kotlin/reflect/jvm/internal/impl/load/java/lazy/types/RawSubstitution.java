package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: RawType.kt */
public final class RawSubstitution extends TypeSubstitution {
    public static final RawSubstitution INSTANCE = new RawSubstitution();
    private static final JavaTypeAttributes lowerTypeAttr = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
    private static final JavaTypeAttributes upperTypeAttr = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[JavaTypeFlexibility.values().length];

        static {
            $EnumSwitchMapping$0[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            $EnumSwitchMapping$0[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            $EnumSwitchMapping$0[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
        }
    }

    private RawSubstitution() {
    }

    public static /* synthetic */ TypeProjection computeProjection$default(RawSubstitution rawSubstitution, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, KotlinType kotlinType, int i, Object obj) {
        if ((i & 4) != 0) {
            kotlinType = JavaTypeResolverKt.getErasedUpperBound$default(typeParameterDescriptor, null, null, 3, null);
        }
        return rawSubstitution.computeProjection(typeParameterDescriptor, javaTypeAttributes, kotlinType);
    }

    private final Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        boolean isEmpty = simpleType.getConstructor().getParameters().isEmpty();
        Boolean valueOf = Boolean.valueOf(false);
        if (isEmpty) {
            return C12907r.m40244a(simpleType, valueOf);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = (TypeProjection) simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            C12880j.m40222a((Object) type, "componentTypeProjection.type");
            return C12907r.m40244a(KotlinTypeFactory.simpleType(simpleType.getAnnotations(), simpleType.getConstructor(), C13183n.m40498a(new TypeProjectionImpl(projectionKind, eraseType(type))), simpleType.isMarkedNullable()), valueOf);
        } else if (KotlinTypeKt.isError(simpleType)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Raw error type: ");
            sb.append(simpleType.getConstructor());
            return C12907r.m40244a(ErrorUtils.createErrorType(sb.toString()), valueOf);
        } else {
            Annotations annotations = simpleType.getAnnotations();
            TypeConstructor constructor = simpleType.getConstructor();
            List<TypeParameterDescriptor> parameters = simpleType.getConstructor().getParameters();
            C12880j.m40222a((Object) parameters, "type.constructor.parameters");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameters, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : parameters) {
                RawSubstitution rawSubstitution = INSTANCE;
                C12880j.m40222a((Object) typeParameterDescriptor, "parameter");
                arrayList.add(computeProjection$default(rawSubstitution, typeParameterDescriptor, javaTypeAttributes, null, 4, null));
            }
            boolean isMarkedNullable = simpleType.isMarkedNullable();
            MemberScope memberScope = classDescriptor.getMemberScope(INSTANCE);
            C12880j.m40222a((Object) memberScope, "declaration.getMemberScope(RawSubstitution)");
            return C12907r.m40244a(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations, constructor, arrayList, isMarkedNullable, memberScope), Boolean.valueOf(true));
        }
    }

    private final KotlinType eraseType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof TypeParameterDescriptor) {
            return eraseType(JavaTypeResolverKt.getErasedUpperBound$default((TypeParameterDescriptor) declarationDescriptor, null, null, 3, null));
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            Pair eraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.lowerIfFlexible(kotlinType), classDescriptor, lowerTypeAttr);
            SimpleType simpleType = (SimpleType) eraseInflexibleBasedOnClassDescriptor.mo31013a();
            boolean booleanValue = ((Boolean) eraseInflexibleBasedOnClassDescriptor.mo31014b()).booleanValue();
            Pair eraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.upperIfFlexible(kotlinType), classDescriptor, upperTypeAttr);
            SimpleType simpleType2 = (SimpleType) eraseInflexibleBasedOnClassDescriptor2.mo31013a();
            boolean booleanValue2 = ((Boolean) eraseInflexibleBasedOnClassDescriptor2.mo31014b()).booleanValue();
            if (booleanValue || booleanValue2) {
                return new RawTypeImpl(simpleType, simpleType2);
            }
            return KotlinTypeFactory.flexibleType(simpleType, simpleType2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected declaration kind: ");
        sb.append(declarationDescriptor);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final TypeProjection computeProjection(TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, KotlinType kotlinType) {
        TypeProjection typeProjection;
        int i = WhenMappings.$EnumSwitchMapping$0[javaTypeAttributes.getFlexibility().ordinal()];
        if (i == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, kotlinType);
        }
        if (i != 2 && i != 3) {
            throw new C12898l();
        } else if (!typeParameterDescriptor.getVariance().getAllowsOutPosition()) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType());
        } else {
            List parameters = kotlinType.getConstructor().getParameters();
            C12880j.m40222a((Object) parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                typeProjection = new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
            } else {
                typeProjection = JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
            }
            return typeProjection;
        }
    }

    public boolean isEmpty() {
        return false;
    }

    public TypeProjectionImpl get(KotlinType kotlinType) {
        return new TypeProjectionImpl(eraseType(kotlinType));
    }
}
