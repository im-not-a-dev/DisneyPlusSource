package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class DoubleValue extends ConstantValue<Double> {
    public DoubleValue(double d) {
        super(Double.valueOf(d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).doubleValue());
        sb.append(".toDouble()");
        return sb.toString();
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType doubleType = moduleDescriptor.getBuiltIns().getDoubleType();
        C12880j.m40222a((Object) doubleType, "module.builtIns.doubleType");
        return doubleType;
    }
}
