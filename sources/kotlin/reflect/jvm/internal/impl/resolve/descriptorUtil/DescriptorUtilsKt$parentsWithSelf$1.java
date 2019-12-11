package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$parentsWithSelf$1 extends C12881k implements Function1<DeclarationDescriptor, DeclarationDescriptor> {
    public static final DescriptorUtilsKt$parentsWithSelf$1 INSTANCE = new DescriptorUtilsKt$parentsWithSelf$1();

    DescriptorUtilsKt$parentsWithSelf$1() {
        super(1);
    }

    public final DeclarationDescriptor invoke(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor.getContainingDeclaration();
    }
}
