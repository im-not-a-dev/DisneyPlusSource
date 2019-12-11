package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class IntValue extends IntegerValueConstant<Integer> {
    public IntValue(int i) {
        super(Integer.valueOf(i));
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType intType = moduleDescriptor.getBuiltIns().getIntType();
        C12880j.m40222a((Object) intType, "module.builtIns.intType");
        return intType;
    }
}
