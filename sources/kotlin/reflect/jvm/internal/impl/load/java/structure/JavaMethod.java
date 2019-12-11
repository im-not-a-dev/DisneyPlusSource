package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* compiled from: javaElements.kt */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {

    /* compiled from: javaElements.kt */
    public static final class DefaultImpls {
        public static boolean getHasAnnotationParameterDefaultValue(JavaMethod javaMethod) {
            return javaMethod.getAnnotationParameterDefaultValue() != null;
        }
    }

    JavaAnnotationArgument getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    JavaType getReturnType();

    List<JavaValueParameter> getValueParameters();
}
