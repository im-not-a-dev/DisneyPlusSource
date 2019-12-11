package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* compiled from: ModuleClassResolver.kt */
public interface ModuleClassResolver {
    ClassDescriptor resolveClass(JavaClass javaClass);
}
