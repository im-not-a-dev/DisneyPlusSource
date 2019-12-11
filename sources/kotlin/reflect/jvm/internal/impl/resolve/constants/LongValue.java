package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class LongValue extends IntegerValueConstant<Long> {
    public LongValue(long j) {
        super(Long.valueOf(j));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).longValue());
        sb.append(".toLong()");
        return sb.toString();
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType longType = moduleDescriptor.getBuiltIns().getLongType();
        C12880j.m40222a((Object) longType, "module.builtIns.longType");
        return longType;
    }
}
