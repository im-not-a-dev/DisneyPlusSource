package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

public interface VariableDescriptor extends ValueDescriptor {
    ConstantValue<?> getCompileTimeInitializer();

    boolean isConst();

    boolean isLateInit();

    boolean isVar();
}
