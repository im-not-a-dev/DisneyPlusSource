package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: Annotations.kt */
public final class CompositeAnnotations implements Annotations {
    private final List<Annotations> delegates;

    public CompositeAnnotations(List<? extends Annotations> list) {
        this.delegates = list;
    }

    public AnnotationDescriptor findAnnotation(FqName fqName) {
        return (AnnotationDescriptor) C12788p.m39997f(C12788p.m39996e(C13199w.m40577c((Iterable) this.delegates), new CompositeAnnotations$findAnnotation$1(fqName)));
    }

    public boolean hasAnnotation(FqName fqName) {
        for (Annotations hasAnnotation : C13199w.m40577c((Iterable) this.delegates)) {
            if (hasAnnotation.hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Annotations isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<AnnotationDescriptor> iterator() {
        return C12788p.m39992c(C13199w.m40577c((Iterable) this.delegates), CompositeAnnotations$iterator$1.INSTANCE).iterator();
    }

    public CompositeAnnotations(Annotations... annotationsArr) {
        this(C13174k.m40412l(annotationsArr));
    }
}
