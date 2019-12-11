package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: JavaPropertyInitializerEvaluator.kt */
public interface JavaPropertyInitializerEvaluator {

    /* compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class DoNothing implements JavaPropertyInitializerEvaluator {
        public static final DoNothing INSTANCE = new DoNothing();

        private DoNothing() {
        }

        public ConstantValue<?> getInitializerConstant(JavaField javaField, PropertyDescriptor propertyDescriptor) {
            return null;
        }
    }

    ConstantValue<?> getInitializerConstant(JavaField javaField, PropertyDescriptor propertyDescriptor);
}
