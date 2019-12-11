package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    ReceiverValue getValue();

    ReceiverParameterDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
