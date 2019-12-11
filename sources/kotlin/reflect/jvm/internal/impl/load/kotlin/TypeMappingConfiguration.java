package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: typeSignatureMapping.kt */
public interface TypeMappingConfiguration<T> {

    /* compiled from: typeSignatureMapping.kt */
    public static final class DefaultImpls {
        public static <T> KotlinType preprocessType(TypeMappingConfiguration<? extends T> typeMappingConfiguration, KotlinType kotlinType) {
            return null;
        }

        public static <T> boolean releaseCoroutines(TypeMappingConfiguration<? extends T> typeMappingConfiguration) {
            return true;
        }
    }

    KotlinType commonSupertype(Collection<KotlinType> collection);

    String getPredefinedInternalNameForClass(ClassDescriptor classDescriptor);

    T getPredefinedTypeForClass(ClassDescriptor classDescriptor);

    KotlinType preprocessType(KotlinType kotlinType);

    void processErrorType(KotlinType kotlinType, ClassDescriptor classDescriptor);

    boolean releaseCoroutines();
}
