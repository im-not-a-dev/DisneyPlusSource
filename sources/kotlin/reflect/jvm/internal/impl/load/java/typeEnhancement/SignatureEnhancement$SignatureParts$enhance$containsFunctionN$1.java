package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 extends C12881k implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 INSTANCE = new SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1();

    SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((UnwrappedType) obj));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return false;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "it.constructor.declarati… ?: return@contains false");
        if (!Intrinsics.areEqual((Object) declarationDescriptor.getName(), (Object) JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) || !Intrinsics.areEqual((Object) DescriptorUtilsKt.fqNameOrNull(declarationDescriptor), (Object) JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            return false;
        }
        return true;
    }
}
