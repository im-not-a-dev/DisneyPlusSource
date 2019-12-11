package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 */
/* compiled from: specialBuiltinMembers.kt */
final class C12965xdb572182 extends C12881k implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C12965xdb572182 INSTANCE = new C12965xdb572182();

    C12965xdb572182() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return (callableMemberDescriptor instanceof FunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getHasErasedValueParametersInJava(callableMemberDescriptor);
    }
}
