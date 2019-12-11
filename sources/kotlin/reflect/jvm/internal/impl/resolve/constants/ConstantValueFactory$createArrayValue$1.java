package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ConstantValueFactory.kt */
final class ConstantValueFactory$createArrayValue$1 extends C12881k implements Function1<ModuleDescriptor, KotlinType> {
    final /* synthetic */ KotlinType $type;

    ConstantValueFactory$createArrayValue$1(KotlinType kotlinType) {
        this.$type = kotlinType;
        super(1);
    }

    public final KotlinType invoke(ModuleDescriptor moduleDescriptor) {
        return this.$type;
    }
}
