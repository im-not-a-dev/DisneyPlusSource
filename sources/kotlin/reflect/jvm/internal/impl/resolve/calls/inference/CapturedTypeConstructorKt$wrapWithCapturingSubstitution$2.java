package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2 extends DelegatedTypeSubstitution {
    final /* synthetic */ boolean $needApproximation;
    final /* synthetic */ TypeSubstitution $this_wrapWithCapturingSubstitution;

    CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(TypeSubstitution typeSubstitution, boolean z, TypeSubstitution typeSubstitution2) {
        this.$this_wrapWithCapturingSubstitution = typeSubstitution;
        this.$needApproximation = z;
        super(typeSubstitution2);
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.$needApproximation;
    }

    public TypeProjection get(KotlinType kotlinType) {
        TypeProjection typeProjection = super.get(kotlinType);
        if (typeProjection == null) {
            return null;
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
            declarationDescriptor = null;
        }
        return CapturedTypeConstructorKt.createCapturedIfNeeded(typeProjection, (TypeParameterDescriptor) declarationDescriptor);
    }
}
