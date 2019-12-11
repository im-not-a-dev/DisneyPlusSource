package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class FloatValue extends ConstantValue<Float> {
    public FloatValue(float f) {
        super(Float.valueOf(f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).floatValue());
        sb.append(".toFloat()");
        return sb.toString();
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType floatType = moduleDescriptor.getBuiltIns().getFloatType();
        C12880j.m40222a((Object) floatType, "module.builtIns.floatType");
        return floatType;
    }
}
