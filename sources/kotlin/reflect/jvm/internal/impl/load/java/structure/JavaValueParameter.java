package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: javaElements.kt */
public interface JavaValueParameter extends JavaAnnotationOwner {
    Name getName();

    JavaType getType();

    boolean isVararg();
}
