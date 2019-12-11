package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class StringValue extends ConstantValue<String> {
    public StringValue(String str) {
        super(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append((String) getValue());
        sb.append('\"');
        return sb.toString();
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType stringType = moduleDescriptor.getBuiltIns().getStringType();
        C12880j.m40222a((Object) stringType, "module.builtIns.stringType");
        return stringType;
    }
}
