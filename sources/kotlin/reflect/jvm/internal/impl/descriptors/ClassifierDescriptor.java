package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    SimpleType getDefaultType();

    ClassifierDescriptor getOriginal();

    TypeConstructor getTypeConstructor();
}
