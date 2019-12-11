package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.p587i0.C12775h;

/* compiled from: Annotations.kt */
final class CompositeAnnotations$iterator$1 extends C12881k implements Function1<Annotations, C12775h<? extends AnnotationDescriptor>> {
    public static final CompositeAnnotations$iterator$1 INSTANCE = new CompositeAnnotations$iterator$1();

    CompositeAnnotations$iterator$1() {
        super(1);
    }

    public final C12775h<AnnotationDescriptor> invoke(Annotations annotations) {
        return C13199w.m40577c((Iterable) annotations);
    }
}
