package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class ShortValue extends IntegerValueConstant<Short> {
    public ShortValue(short s) {
        super(Short.valueOf(s));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).shortValue());
        sb.append(".toShort()");
        return sb.toString();
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType shortType = moduleDescriptor.getBuiltIns().getShortType();
        C12880j.m40222a((Object) shortType, "module.builtIns.shortType");
        return shortType;
    }
}
