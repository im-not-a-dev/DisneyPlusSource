package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$3 extends C12881k implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    OperatorChecks$checks$3() {
        super(1);
    }

    public final String invoke(FunctionDescriptor functionDescriptor) {
        boolean z;
        ReceiverParameterDescriptor dispatchReceiverParameter = functionDescriptor.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        boolean z2 = false;
        if (dispatchReceiverParameter != null) {
            KotlinType returnType = functionDescriptor.getReturnType();
            if (returnType != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                C12880j.m40222a((Object) type, "receiver.type");
                z = TypeUtilsKt.isSubtypeOf(returnType, type);
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}
