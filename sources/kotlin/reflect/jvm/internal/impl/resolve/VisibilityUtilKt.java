package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

/* compiled from: VisibilityUtil.kt */
public final class VisibilityUtilKt {
    public static final CallableMemberDescriptor findMemberWithMaxVisibility(Collection<? extends CallableMemberDescriptor> collection) {
        boolean z = !collection.isEmpty();
        if (!C13147x.f29590a || z) {
            CallableMemberDescriptor callableMemberDescriptor = null;
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                if (callableMemberDescriptor != null) {
                    Integer compare = Visibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility());
                    if (compare != null) {
                        if (compare.intValue() >= 0) {
                        }
                    }
                }
                callableMemberDescriptor = callableMemberDescriptor2;
            }
            if (callableMemberDescriptor != null) {
                return callableMemberDescriptor;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }
}
