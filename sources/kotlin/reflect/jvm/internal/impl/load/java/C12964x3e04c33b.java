package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 */
/* compiled from: specialBuiltinMembers.kt */
final class C12964x3e04c33b extends C12881k implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C12964x3e04c33b INSTANCE = new C12964x3e04c33b();

    C12964x3e04c33b() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getHasErasedValueParametersInJava(callableMemberDescriptor);
    }
}
