package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface PlatformDependentDeclarationFilter {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class All implements PlatformDependentDeclarationFilter {
        public static final All INSTANCE = new All();

        private All() {
        }

        public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {
        public static final NoPlatformDependent INSTANCE = new NoPlatformDependent();

        private NoPlatformDependent() {
        }

        public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            return !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }

    boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor);
}
