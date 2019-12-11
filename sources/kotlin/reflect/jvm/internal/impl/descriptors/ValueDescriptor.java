package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public interface ValueDescriptor extends CallableDescriptor {
    DeclarationDescriptor getContainingDeclaration();

    KotlinType getType();
}
