package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends C12881k implements Function1<CallableMemberDescriptor, KotlinType> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    public final KotlinType invoke(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) extensionReceiverParameter, "it.extensionReceiverParameter!!");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "it.extensionReceiverParameter!!.type");
            return type;
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
