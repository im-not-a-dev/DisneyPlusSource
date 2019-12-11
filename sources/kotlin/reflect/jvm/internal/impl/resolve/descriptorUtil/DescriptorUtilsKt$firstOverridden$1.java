package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$firstOverridden$1<N> implements Neighbors<N> {
    final /* synthetic */ boolean $useOriginal;

    DescriptorUtilsKt$firstOverridden$1(boolean z) {
        this.$useOriginal = z;
    }

    public final Iterable<CallableMemberDescriptor> getNeighbors(CallableMemberDescriptor callableMemberDescriptor) {
        if (this.$useOriginal) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        if (callableMemberDescriptor != null) {
            Collection overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            if (overriddenDescriptors != null) {
                return overriddenDescriptors;
            }
        }
        return C13185o.m40513a();
    }
}
