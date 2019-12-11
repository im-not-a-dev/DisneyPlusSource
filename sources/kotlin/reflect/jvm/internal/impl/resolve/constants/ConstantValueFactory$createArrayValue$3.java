package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: ConstantValueFactory.kt */
final class ConstantValueFactory$createArrayValue$3 extends C12881k implements Function1<ModuleDescriptor, SimpleType> {
    final /* synthetic */ PrimitiveType $componentType;

    ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        this.$componentType = primitiveType;
        super(1);
    }

    public final SimpleType invoke(ModuleDescriptor moduleDescriptor) {
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(this.$componentType);
        Intrinsics.checkReturnedValueIsNotNull((Object) primitiveArrayKotlinType, "module.builtIns.getPrimi…KotlinType(componentType)");
        return primitiveArrayKotlinType;
    }
}
