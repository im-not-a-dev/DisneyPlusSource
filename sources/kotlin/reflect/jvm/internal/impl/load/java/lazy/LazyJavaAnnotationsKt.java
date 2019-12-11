package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* compiled from: LazyJavaAnnotations.kt */
public final class LazyJavaAnnotationsKt {
    public static final Annotations resolveAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner) {
        return new LazyJavaAnnotations(lazyJavaResolverContext, javaAnnotationOwner);
    }
}
