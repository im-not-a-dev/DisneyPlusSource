package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* compiled from: resolvers.kt */
public interface TypeParameterResolver {

    /* compiled from: resolvers.kt */
    public static final class EMPTY implements TypeParameterResolver {
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
            return null;
        }
    }

    TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter);
}
