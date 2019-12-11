package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12894x;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;

/* compiled from: DescriptorUtils.kt */
public final class DescriptorUtilsKt$firstOverridden$2 extends AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor> {
    final /* synthetic */ Function1 $predicate;
    final /* synthetic */ C12894x $result;

    DescriptorUtilsKt$firstOverridden$2(C12894x xVar, Function1 function1) {
        this.$result = xVar;
        this.$predicate = function1;
    }

    public void afterChildren(CallableMemberDescriptor callableMemberDescriptor) {
        if (((CallableMemberDescriptor) this.$result.f29534c) == null && ((Boolean) this.$predicate.invoke(callableMemberDescriptor)).booleanValue()) {
            this.$result.f29534c = callableMemberDescriptor;
        }
    }

    public boolean beforeChildren(CallableMemberDescriptor callableMemberDescriptor) {
        return ((CallableMemberDescriptor) this.$result.f29534c) == null;
    }

    public CallableMemberDescriptor result() {
        return (CallableMemberDescriptor) this.$result.f29534c;
    }
}
