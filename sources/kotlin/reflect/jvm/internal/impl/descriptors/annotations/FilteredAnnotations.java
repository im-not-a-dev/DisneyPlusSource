package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: Annotations.kt */
public final class FilteredAnnotations implements Annotations {
    private final Annotations delegate;
    private final Function1<FqName, Boolean> fqNameFilter;

    public FilteredAnnotations(Annotations annotations, Function1<? super FqName, Boolean> function1) {
        this.delegate = annotations;
        this.fqNameFilter = function1;
    }

    private final boolean shouldBeReturned(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        return fqName != null && ((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue();
    }

    public AnnotationDescriptor findAnnotation(FqName fqName) {
        if (((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
            return this.delegate.findAnnotation(fqName);
        }
        return null;
    }

    public boolean hasAnnotation(FqName fqName) {
        if (((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
            return this.delegate.hasAnnotation(fqName);
        }
        return false;
    }

    public boolean isEmpty() {
        Annotations<AnnotationDescriptor> annotations = this.delegate;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            return false;
        }
        for (AnnotationDescriptor shouldBeReturned : annotations) {
            if (shouldBeReturned(shouldBeReturned)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.delegate;
        ArrayList arrayList = new ArrayList();
        for (Object next : annotations) {
            if (shouldBeReturned((AnnotationDescriptor) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }
}
