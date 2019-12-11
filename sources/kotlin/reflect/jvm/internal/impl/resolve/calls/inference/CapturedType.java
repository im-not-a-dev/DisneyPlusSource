package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedType extends SimpleType implements SubtypingRepresentatives, CapturedTypeMarker {
    private final Annotations annotations;
    private final CapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final TypeProjection typeProjection;

    public /* synthetic */ CapturedType(TypeProjection typeProjection2, CapturedTypeConstructor capturedTypeConstructor, boolean z, Annotations annotations2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            capturedTypeConstructor = new CapturedTypeConstructorImpl(typeProjection2);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            annotations2 = Annotations.Companion.getEMPTY();
        }
        this(typeProjection2, capturedTypeConstructor, z, annotations2);
    }

    private final KotlinType representative(Variance variance, KotlinType kotlinType) {
        if (this.typeProjection.getProjectionKind() == variance) {
            kotlinType = this.typeProjection.getType();
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType, "if (typeProjection.proje…jection.type else default");
        return kotlinType;
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public List<TypeProjection> getArguments() {
        return C13185o.m40513a();
    }

    public MemberScope getMemberScope() {
        MemberScope createErrorScope = ErrorUtils.createErrorScope("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorScope, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return createErrorScope;
    }

    public KotlinType getSubTypeRepresentative() {
        Variance variance = Variance.OUT_VARIANCE;
        SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(this).getNullableAnyType();
        Intrinsics.checkReturnedValueIsNotNull((Object) nullableAnyType, "builtIns.nullableAnyType");
        return representative(variance, nullableAnyType);
    }

    public KotlinType getSuperTypeRepresentative() {
        Variance variance = Variance.IN_VARIANCE;
        SimpleType nothingType = TypeUtilsKt.getBuiltIns(this).getNothingType();
        Intrinsics.checkReturnedValueIsNotNull((Object) nothingType, "builtIns.nothingType");
        return representative(variance, nothingType);
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public boolean sameTypeConstructor(KotlinType kotlinType) {
        return getConstructor() == kotlinType.getConstructor();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.typeProjection);
        sb.append(')');
        sb.append(isMarkedNullable() ? "?" : "");
        return sb.toString();
    }

    public CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public CapturedType(TypeProjection typeProjection2, CapturedTypeConstructor capturedTypeConstructor, boolean z, Annotations annotations2) {
        this.typeProjection = typeProjection2;
        this.constructor = capturedTypeConstructor;
        this.isMarkedNullable = z;
        this.annotations = annotations2;
    }

    public CapturedType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return new CapturedType(this.typeProjection, getConstructor(), z, getAnnotations());
    }

    public CapturedType replaceAnnotations(Annotations annotations2) {
        return new CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), annotations2);
    }
}
