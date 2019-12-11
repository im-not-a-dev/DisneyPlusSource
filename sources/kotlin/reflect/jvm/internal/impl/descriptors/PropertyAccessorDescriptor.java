package kotlin.reflect.jvm.internal.impl.descriptors;

public interface PropertyAccessorDescriptor extends VariableAccessorDescriptor {
    PropertyDescriptor getCorrespondingProperty();

    boolean isDefault();
}
