package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: constantValues.kt */
public final class AnnotationValue extends ConstantValue<AnnotationDescriptor> {
    public AnnotationValue(AnnotationDescriptor annotationDescriptor) {
        super(annotationDescriptor);
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        return ((AnnotationDescriptor) getValue()).getType();
    }
}
