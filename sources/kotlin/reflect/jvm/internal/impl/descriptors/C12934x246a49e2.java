package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 */
/* compiled from: typeParameterUtils.kt */
final class C12934x246a49e2 extends C12881k implements Function1<DeclarationDescriptor, Boolean> {
    public static final C12934x246a49e2 INSTANCE = new C12934x246a49e2();

    C12934x246a49e2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((DeclarationDescriptor) obj));
    }

    public final boolean invoke(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof CallableDescriptor;
    }
}
