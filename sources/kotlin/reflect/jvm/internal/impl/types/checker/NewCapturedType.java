package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {
    private final Annotations annotations;
    private final CaptureStatus captureStatus;
    private final NewCapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final UnwrappedType lowerType;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus2, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, Annotations annotations2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            annotations2 = Annotations.Companion.getEMPTY();
        }
        this(captureStatus2, newCapturedTypeConstructor, unwrappedType, annotations2, (i & 16) != 0 ? false : z);
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public List<TypeProjection> getArguments() {
        return C13185o.m40513a();
    }

    public final UnwrappedType getLowerType() {
        return this.lowerType;
    }

    public MemberScope getMemberScope() {
        MemberScope createErrorScope = ErrorUtils.createErrorScope("No member resolution should be done on captured type!", true);
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorScope, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return createErrorScope;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public NewCapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public NewCapturedType(CaptureStatus captureStatus2, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, Annotations annotations2, boolean z) {
        this.captureStatus = captureStatus2;
        this.constructor = newCapturedTypeConstructor;
        this.lowerType = unwrappedType;
        this.annotations = annotations2;
        this.isMarkedNullable = z;
    }

    public NewCapturedType makeNullableAsSpecified(boolean z) {
        NewCapturedType newCapturedType = new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, getAnnotations(), z);
        return newCapturedType;
    }

    public NewCapturedType replaceAnnotations(Annotations annotations2) {
        NewCapturedType newCapturedType = new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, annotations2, isMarkedNullable());
        return newCapturedType;
    }

    public NewCapturedType(CaptureStatus captureStatus2, UnwrappedType unwrappedType, TypeProjection typeProjection) {
        this(captureStatus2, new NewCapturedTypeConstructor(typeProjection, null, 2, null), unwrappedType, null, false, 24, null);
    }
}
