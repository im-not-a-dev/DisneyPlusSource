package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* compiled from: JavaClassesTracker.kt */
public interface JavaClassesTracker {

    /* compiled from: JavaClassesTracker.kt */
    public static final class Default implements JavaClassesTracker {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public void reportClass(JavaClassDescriptor javaClassDescriptor) {
        }
    }

    void reportClass(JavaClassDescriptor javaClassDescriptor);
}
