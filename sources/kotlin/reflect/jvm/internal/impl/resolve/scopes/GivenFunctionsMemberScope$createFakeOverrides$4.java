package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* compiled from: GivenFunctionsMemberScope.kt */
public final class GivenFunctionsMemberScope$createFakeOverrides$4 extends NonReportingOverrideStrategy {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    GivenFunctionsMemberScope$createFakeOverrides$4(GivenFunctionsMemberScope givenFunctionsMemberScope, ArrayList arrayList) {
        this.this$0 = givenFunctionsMemberScope;
        this.$result = arrayList;
    }

    public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
        this.$result.add(callableMemberDescriptor);
    }

    /* access modifiers changed from: protected */
    public void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Conflict in scope of ");
        sb.append(this.this$0.getContainingClass());
        sb.append(": ");
        sb.append(callableMemberDescriptor);
        sb.append(" vs ");
        sb.append(callableMemberDescriptor2);
        throw new IllegalStateException(sb.toString().toString());
    }
}
