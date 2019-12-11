package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
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
        Intrinsics.checkReturnedValueIsNotNull((Object) stringType, "module.builtIns.stringType");
        return stringType;
    }
}
