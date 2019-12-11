package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$1 extends C12881k implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    OperatorChecks$checks$1() {
        super(1);
    }

    public final String invoke(FunctionDescriptor functionDescriptor) {
        List valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) C13199w.m40595i(valueParameters);
        boolean z = false;
        if (valueParameterDescriptor != null) {
            if (!DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                z = true;
            }
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        if (!z) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
