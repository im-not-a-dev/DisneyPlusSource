package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* compiled from: specialBuiltinMembers.kt */
final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends C12881k implements Function1<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 INSTANCE = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2();

    SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) callableMemberDescriptor);
    }
}
