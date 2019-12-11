package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: Annotations.kt */
final class CompositeAnnotations$findAnnotation$1 extends C12881k implements Function1<Annotations, AnnotationDescriptor> {
    final /* synthetic */ FqName $fqName;

    CompositeAnnotations$findAnnotation$1(FqName fqName) {
        this.$fqName = fqName;
        super(1);
    }

    public final AnnotationDescriptor invoke(Annotations annotations) {
        return annotations.findAnnotation(this.$fqName);
    }
}
