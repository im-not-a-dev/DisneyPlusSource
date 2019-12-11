package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
final class DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1 extends C12881k implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {
    public static final DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1 INSTANCE = new DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1();

    DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }

    public final boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }
}
