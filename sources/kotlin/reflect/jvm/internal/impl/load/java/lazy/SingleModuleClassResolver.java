package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* compiled from: ModuleClassResolver.kt */
public final class SingleModuleClassResolver implements ModuleClassResolver {
    public JavaDescriptorResolver resolver;

    public ClassDescriptor resolveClass(JavaClass javaClass) {
        JavaDescriptorResolver javaDescriptorResolver = this.resolver;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver.resolveClass(javaClass);
        }
        Intrinsics.throwUninitializedPropertyAccessException("resolver");
        throw null;
    }

    public final void setResolver(JavaDescriptorResolver javaDescriptorResolver) {
        this.resolver = javaDescriptorResolver;
    }
}
