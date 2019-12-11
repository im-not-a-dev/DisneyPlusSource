package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1 */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C13106xf150c8cf extends NonReportingOverrideStrategy {
    final /* synthetic */ Collection $result;

    C13106xf150c8cf(Collection collection) {
        this.$result = collection;
    }

    public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
        this.$result.add(callableMemberDescriptor);
    }

    /* access modifiers changed from: protected */
    public void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
    }
}
