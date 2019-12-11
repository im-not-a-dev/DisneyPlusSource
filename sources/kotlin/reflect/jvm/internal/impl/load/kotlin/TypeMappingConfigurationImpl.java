package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: methodSignatureMapping.kt */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {
    public static final TypeMappingConfigurationImpl INSTANCE = new TypeMappingConfigurationImpl();

    private TypeMappingConfigurationImpl() {
    }

    public KotlinType commonSupertype(Collection<? extends KotlinType> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no intersection type in existing descriptors, but found: ");
        sb.append(C13199w.m40559a(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(sb.toString());
    }

    public String getPredefinedInternalNameForClass(ClassDescriptor classDescriptor) {
        return null;
    }

    public JvmType getPredefinedTypeForClass(ClassDescriptor classDescriptor) {
        return null;
    }

    public KotlinType preprocessType(KotlinType kotlinType) {
        return DefaultImpls.preprocessType(this, kotlinType);
    }

    public void processErrorType(KotlinType kotlinType, ClassDescriptor classDescriptor) {
    }

    public boolean releaseCoroutines() {
        return DefaultImpls.releaseCoroutines(this);
    }
}
