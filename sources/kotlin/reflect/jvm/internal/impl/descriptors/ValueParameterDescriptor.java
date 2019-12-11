package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ValueParameterDescriptor.kt */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    /* compiled from: ValueParameterDescriptor.kt */
    public static final class DefaultImpls {
        public static boolean isLateInit(ValueParameterDescriptor valueParameterDescriptor) {
            return false;
        }
    }

    ValueParameterDescriptor copy(CallableDescriptor callableDescriptor, Name name, int i);

    boolean declaresDefaultValue();

    CallableDescriptor getContainingDeclaration();

    int getIndex();

    ValueParameterDescriptor getOriginal();

    Collection<ValueParameterDescriptor> getOverriddenDescriptors();

    KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
