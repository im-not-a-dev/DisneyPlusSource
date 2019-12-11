package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: SpecialTypes.kt */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeVariable, DefinitelyNotNullTypeMarker {
    public static final Companion Companion = new Companion(null);
    private final SimpleType original;

    /* compiled from: SpecialTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        private final boolean makesSenseToBeDefinitelyNotNull(UnwrappedType unwrappedType) {
            return TypeUtilsKt.canHaveUndefinedNullability(unwrappedType) && !NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType);
        }

        public final DefinitelyNotNullType makeDefinitelyNotNull$descriptors(UnwrappedType unwrappedType) {
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            if (!makesSenseToBeDefinitelyNotNull(unwrappedType)) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                boolean a = C12880j.m40224a((Object) flexibleType.getLowerBound().getConstructor(), (Object) flexibleType.getUpperBound().getConstructor());
                if (C13147x.f29590a && !a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DefinitelyNotNullType for flexible type (");
                    sb.append(unwrappedType);
                    sb.append(") can be created only from type variable with the same constructor for bounds");
                    throw new AssertionError(sb.toString());
                }
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(unwrappedType), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DefinitelyNotNullType(SimpleType simpleType) {
        this.original = simpleType;
    }

    /* access modifiers changed from: protected */
    public SimpleType getDelegate() {
        return this.original;
    }

    public final SimpleType getOriginal() {
        return this.original;
    }

    public boolean isMarkedNullable() {
        return false;
    }

    public boolean isTypeVariable() {
        return (getDelegate().getConstructor() instanceof NewTypeVariableConstructor) || (getDelegate().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor);
    }

    public KotlinType substitutionResult(KotlinType kotlinType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(kotlinType.unwrap());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDelegate());
        sb.append("!!");
        return sb.toString();
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType);
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(z) : this;
    }

    public DefinitelyNotNullType replaceAnnotations(Annotations annotations) {
        return new DefinitelyNotNullType(getDelegate().replaceAnnotations(annotations));
    }
}
