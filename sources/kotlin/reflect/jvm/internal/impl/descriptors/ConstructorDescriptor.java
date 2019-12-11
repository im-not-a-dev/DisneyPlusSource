package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public interface ConstructorDescriptor extends FunctionDescriptor {
    ClassDescriptor getConstructedClass();

    ClassifierDescriptorWithTypeParameters getContainingDeclaration();

    KotlinType getReturnType();

    List<TypeParameterDescriptor> getTypeParameters();

    boolean isPrimary();

    ConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
