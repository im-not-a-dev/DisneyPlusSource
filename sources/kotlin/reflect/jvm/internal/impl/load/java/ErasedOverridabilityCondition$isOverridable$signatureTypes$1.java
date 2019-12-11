package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ErasedOverridabilityCondition.kt */
final class ErasedOverridabilityCondition$isOverridable$signatureTypes$1 extends C12881k implements Function1<ValueParameterDescriptor, KotlinType> {
    public static final ErasedOverridabilityCondition$isOverridable$signatureTypes$1 INSTANCE = new ErasedOverridabilityCondition$isOverridable$signatureTypes$1();

    ErasedOverridabilityCondition$isOverridable$signatureTypes$1() {
        super(1);
    }

    public final KotlinType invoke(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "it");
        return valueParameterDescriptor.getType();
    }
}
