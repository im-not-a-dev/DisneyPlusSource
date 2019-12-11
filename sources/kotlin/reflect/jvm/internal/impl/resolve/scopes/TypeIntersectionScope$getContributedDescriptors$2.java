package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* compiled from: TypeIntersectionScope.kt */
final class TypeIntersectionScope$getContributedDescriptors$2 extends C12881k implements Function1<CallableDescriptor, CallableDescriptor> {
    public static final TypeIntersectionScope$getContributedDescriptors$2 INSTANCE = new TypeIntersectionScope$getContributedDescriptors$2();

    TypeIntersectionScope$getContributedDescriptors$2() {
        super(1);
    }

    public final CallableDescriptor invoke(CallableDescriptor callableDescriptor) {
        return callableDescriptor;
    }
}
