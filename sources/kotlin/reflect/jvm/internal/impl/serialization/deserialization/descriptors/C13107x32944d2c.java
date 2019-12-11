package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1 */
/* compiled from: DeserializedClassDescriptor.kt */
final class C13107x32944d2c extends C12881k implements Function0<List<? extends TypeParameterDescriptor>> {
    final /* synthetic */ DeserializedClassTypeConstructor this$0;

    C13107x32944d2c(DeserializedClassTypeConstructor deserializedClassTypeConstructor) {
        this.this$0 = deserializedClassTypeConstructor;
        super(0);
    }

    public final List<TypeParameterDescriptor> invoke() {
        return TypeParameterUtilsKt.computeConstructorTypeParameters(DeserializedClassDescriptor.this);
    }
}
