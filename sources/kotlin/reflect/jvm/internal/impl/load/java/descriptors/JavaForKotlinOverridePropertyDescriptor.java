package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor2, PropertyDescriptor propertyDescriptor) {
        super(classDescriptor, Annotations.Companion.getEMPTY(), simpleFunctionDescriptor.getModality(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.getSource(), null, Kind.DECLARATION, false, null);
    }
}
