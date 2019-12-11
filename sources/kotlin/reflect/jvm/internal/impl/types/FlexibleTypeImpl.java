package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C12898l;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: flexibleTypes.kt */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeVariable {
    public static final Companion Companion = new Companion(null);
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    /* compiled from: flexibleTypes.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FlexibleTypeImpl(SimpleType simpleType, SimpleType simpleType2) {
        super(simpleType, simpleType2);
    }

    private final void runAssertions() {
        if (RUN_SLOW_ASSERTIONS && !this.assertionsDone) {
            this.assertionsDone = true;
            boolean z = !FlexibleTypesKt.isFlexible(getLowerBound());
            if (!C13147x.f29590a || z) {
                boolean z2 = !FlexibleTypesKt.isFlexible(getUpperBound());
                if (!C13147x.f29590a || z2) {
                    boolean a = true ^ Intrinsics.areEqual((Object) getLowerBound(), (Object) getUpperBound());
                    if (!C13147x.f29590a || a) {
                        boolean isSubtypeOf = KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
                        if (C13147x.f29590a && !isSubtypeOf) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Lower bound ");
                            sb.append(getLowerBound());
                            sb.append(" of a flexible type must be a subtype of the upper bound ");
                            sb.append(getUpperBound());
                            throw new AssertionError(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Lower and upper bounds are equal: ");
                    sb2.append(getLowerBound());
                    sb2.append(" == ");
                    sb2.append(getUpperBound());
                    throw new AssertionError(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Upper bound of a flexible type can not be flexible: ");
                sb3.append(getUpperBound());
                throw new AssertionError(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Lower bound of a flexible type can not be flexible: ");
            sb4.append(getLowerBound());
            throw new AssertionError(sb4.toString());
        }
    }

    public SimpleType getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    public boolean isTypeVariable() {
        return (getLowerBound().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) && Intrinsics.areEqual((Object) getLowerBound().getConstructor(), (Object) getUpperBound().getConstructor());
    }

    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        if (!descriptorRendererOptions.getDebugMode()) {
            return descriptorRenderer.renderFlexibleType(descriptorRenderer.renderType(getLowerBound()), descriptorRenderer.renderType(getUpperBound()), TypeUtilsKt.getBuiltIns(this));
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(descriptorRenderer.renderType(getLowerBound()));
        sb.append("..");
        sb.append(descriptorRenderer.renderType(getUpperBound()));
        sb.append(')');
        return sb.toString();
    }

    public UnwrappedType replaceAnnotations(Annotations annotations) {
        return KotlinTypeFactory.flexibleType(getLowerBound().replaceAnnotations(annotations), getUpperBound().replaceAnnotations(annotations));
    }

    public KotlinType substitutionResult(KotlinType kotlinType) {
        UnwrappedType unwrappedType;
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            unwrappedType = unwrap;
        } else if (unwrap instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrap;
            unwrappedType = KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        } else {
            throw new C12898l();
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedType, unwrap);
    }
}
