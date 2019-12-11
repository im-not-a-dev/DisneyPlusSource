package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z) {
        super(Boolean.valueOf(z));
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType booleanType = moduleDescriptor.getBuiltIns().getBooleanType();
        C12880j.m40222a((Object) booleanType, "module.builtIns.booleanType");
        return booleanType;
    }
}
