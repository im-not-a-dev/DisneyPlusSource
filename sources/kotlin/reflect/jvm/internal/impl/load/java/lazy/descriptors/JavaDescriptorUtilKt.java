package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* compiled from: JavaDescriptorUtil.kt */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(PropertyDescriptor propertyDescriptor) {
        return propertyDescriptor.getGetter() == null;
    }
}
