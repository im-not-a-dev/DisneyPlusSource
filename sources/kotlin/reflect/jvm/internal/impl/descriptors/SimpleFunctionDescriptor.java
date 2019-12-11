package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;

public interface SimpleFunctionDescriptor extends FunctionDescriptor {
    CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder();
}
