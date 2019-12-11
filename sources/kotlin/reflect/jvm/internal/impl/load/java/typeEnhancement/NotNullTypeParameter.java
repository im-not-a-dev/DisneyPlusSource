package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeVariable;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: typeEnhancement.kt */
public final class NotNullTypeParameter extends DelegatingSimpleType implements NotNullTypeVariable {
    private final SimpleType delegate;

    public NotNullTypeParameter(SimpleType simpleType) {
        this.delegate = simpleType;
    }

    private final SimpleType prepareReplacement(SimpleType simpleType) {
        SimpleType makeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
        if (!TypeUtilsKt.isTypeParameter(simpleType)) {
            return makeNullableAsSpecified;
        }
        return new NotNullTypeParameter(makeNullableAsSpecified);
    }

    /* access modifiers changed from: protected */
    public SimpleType getDelegate() {
        return this.delegate;
    }

    public boolean isMarkedNullable() {
        return false;
    }

    public boolean isTypeVariable() {
        return true;
    }

    public KotlinType substitutionResult(KotlinType kotlinType) {
        KotlinType kotlinType2;
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!TypeUtils.isNullableType(unwrap) && !TypeUtilsKt.isTypeParameter(unwrap)) {
            return unwrap;
        }
        if (unwrap instanceof SimpleType) {
            kotlinType2 = prepareReplacement((SimpleType) unwrap);
        } else if (unwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap;
            kotlinType2 = TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(prepareReplacement(flexibleType.getLowerBound()), prepareReplacement(flexibleType.getUpperBound())), TypeWithEnhancementKt.getEnhancement(unwrap));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Incorrect type: ");
            sb.append(unwrap);
            throw new IllegalStateException(sb.toString().toString());
        }
        return kotlinType2;
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    public NotNullTypeParameter replaceAnnotations(Annotations annotations) {
        return new NotNullTypeParameter(getDelegate().replaceAnnotations(annotations));
    }
}
