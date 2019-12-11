package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class NullValue extends ConstantValue<Void> {
    public NullValue() {
        super(null);
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType nullableNothingType = moduleDescriptor.getBuiltIns().getNullableNothingType();
        Intrinsics.checkReturnedValueIsNotNull((Object) nullableNothingType, "module.builtIns.nullableNothingType");
        return nullableNothingType;
    }
}
