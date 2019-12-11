package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: ImplicitClassReceiver.kt */
public interface ThisClassReceiver extends ReceiverValue {
    ClassDescriptor getClassDescriptor();
}
