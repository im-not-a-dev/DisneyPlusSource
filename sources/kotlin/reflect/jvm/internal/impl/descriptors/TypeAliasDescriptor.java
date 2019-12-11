package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: TypeAliasDescriptor.kt */
public interface TypeAliasDescriptor extends ClassifierDescriptorWithTypeParameters {
    ClassDescriptor getClassDescriptor();

    SimpleType getExpandedType();

    SimpleType getUnderlyingType();
}
