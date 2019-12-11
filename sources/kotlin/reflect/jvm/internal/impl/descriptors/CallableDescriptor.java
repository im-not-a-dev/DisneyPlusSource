package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    public interface UserDataKey<V> {
    }

    ReceiverParameterDescriptor getDispatchReceiverParameter();

    ReceiverParameterDescriptor getExtensionReceiverParameter();

    CallableDescriptor getOriginal();

    Collection<? extends CallableDescriptor> getOverriddenDescriptors();

    KotlinType getReturnType();

    List<TypeParameterDescriptor> getTypeParameters();

    <V> V getUserData(UserDataKey<V> userDataKey);

    List<ValueParameterDescriptor> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
