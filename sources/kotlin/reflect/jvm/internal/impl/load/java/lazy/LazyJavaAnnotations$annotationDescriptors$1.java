package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;

/* compiled from: LazyJavaAnnotations.kt */
final class LazyJavaAnnotations$annotationDescriptors$1 extends C12881k implements Function1<JavaAnnotation, AnnotationDescriptor> {
    final /* synthetic */ LazyJavaAnnotations this$0;

    LazyJavaAnnotations$annotationDescriptors$1(LazyJavaAnnotations lazyJavaAnnotations) {
        this.this$0 = lazyJavaAnnotations;
        super(1);
    }

    public final AnnotationDescriptor invoke(JavaAnnotation javaAnnotation) {
        return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(javaAnnotation, this.this$0.f29552c);
    }
}
