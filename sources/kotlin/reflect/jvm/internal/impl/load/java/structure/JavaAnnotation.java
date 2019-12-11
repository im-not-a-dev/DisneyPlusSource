package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: javaElements.kt */
public interface JavaAnnotation extends JavaElement {

    /* compiled from: javaElements.kt */
    public static final class DefaultImpls {
        public static boolean isIdeExternalAnnotation(JavaAnnotation javaAnnotation) {
            return false;
        }
    }

    Collection<JavaAnnotationArgument> getArguments();

    ClassId getClassId();

    boolean isIdeExternalAnnotation();

    JavaClass resolve();
}
