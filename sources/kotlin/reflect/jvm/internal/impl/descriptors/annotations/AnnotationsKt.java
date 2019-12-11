package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: Annotations.kt */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations annotations, Annotations annotations2) {
        if (annotations.isEmpty()) {
            return annotations2;
        }
        if (annotations2.isEmpty()) {
            return annotations;
        }
        return new CompositeAnnotations(annotations, annotations2);
    }
}
