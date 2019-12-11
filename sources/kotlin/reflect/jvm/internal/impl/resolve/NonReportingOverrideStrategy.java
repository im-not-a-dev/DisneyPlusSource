package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: OverridingStrategy.kt */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    /* access modifiers changed from: protected */
    public abstract void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void inheritanceConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void overrideConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        conflict(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
