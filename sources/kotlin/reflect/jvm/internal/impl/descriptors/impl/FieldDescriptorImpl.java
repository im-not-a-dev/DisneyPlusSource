package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: FieldDescriptorImpl.kt */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {
    private final PropertyDescriptor correspondingProperty;

    public FieldDescriptorImpl(Annotations annotations, PropertyDescriptor propertyDescriptor) {
        super(annotations);
        this.correspondingProperty = propertyDescriptor;
    }
}
