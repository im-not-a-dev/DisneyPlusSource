package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p587i0.C12775h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2 */
/* compiled from: typeParameterUtils.kt */
final class C12935x246a49e3 extends C12881k implements Function1<DeclarationDescriptor, C12775h<? extends TypeParameterDescriptor>> {
    public static final C12935x246a49e3 INSTANCE = new C12935x246a49e3();

    C12935x246a49e3() {
        super(1);
    }

    public final C12775h<TypeParameterDescriptor> invoke(DeclarationDescriptor declarationDescriptor) {
        List typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        C12880j.m40222a((Object) typeParameters, "(it as CallableDescriptor).typeParameters");
        return C13199w.m40577c((Iterable) typeParameters);
    }
}
