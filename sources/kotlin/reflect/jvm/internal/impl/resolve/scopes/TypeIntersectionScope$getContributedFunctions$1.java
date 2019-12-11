package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* compiled from: TypeIntersectionScope.kt */
final class TypeIntersectionScope$getContributedFunctions$1 extends C12881k implements Function1<SimpleFunctionDescriptor, SimpleFunctionDescriptor> {
    public static final TypeIntersectionScope$getContributedFunctions$1 INSTANCE = new TypeIntersectionScope$getContributedFunctions$1();

    TypeIntersectionScope$getContributedFunctions$1() {
        super(1);
    }

    public final SimpleFunctionDescriptor invoke(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        return simpleFunctionDescriptor;
    }
}
