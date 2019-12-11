package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.LinkedHashSet;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$computeSealedSubclasses$1 extends C12881k implements Function2<MemberScope, Boolean, C13145v> {
    final /* synthetic */ LinkedHashSet $result;
    final /* synthetic */ ClassDescriptor $sealedClass;

    DescriptorUtilsKt$computeSealedSubclasses$1(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet) {
        this.$sealedClass = classDescriptor;
        this.$result = linkedHashSet;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MemberScope) obj, ((Boolean) obj2).booleanValue());
        return C13145v.f29587a;
    }

    public final void invoke(MemberScope memberScope, boolean z) {
        for (DeclarationDescriptor declarationDescriptor : DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                if (DescriptorUtils.isDirectSubclass(classDescriptor, this.$sealedClass)) {
                    this.$result.add(declarationDescriptor);
                }
                if (z) {
                    MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
                    Intrinsics.checkReturnedValueIsNotNull((Object) unsubstitutedInnerClassesScope, "descriptor.unsubstitutedInnerClassesScope");
                    invoke(unsubstitutedInnerClassesScope, z);
                }
            }
        }
    }
}
