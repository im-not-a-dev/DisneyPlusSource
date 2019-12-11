package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;

/* compiled from: modifierChecks.kt */
final class NoDefaultAndVarargsCheck implements Check {
    public static final NoDefaultAndVarargsCheck INSTANCE = new NoDefaultAndVarargsCheck();
    private static final String description = description;

    private NoDefaultAndVarargsCheck() {
    }

    public boolean check(FunctionDescriptor functionDescriptor) {
        boolean z;
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        C12880j.m40222a((Object) valueParameters, "functionDescriptor.valueParameters");
        if ((valueParameters instanceof Collection) && valueParameters.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
            C12880j.m40222a((Object) valueParameterDescriptor, "it");
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public String invoke(FunctionDescriptor functionDescriptor) {
        return DefaultImpls.invoke(this, functionDescriptor);
    }
}
