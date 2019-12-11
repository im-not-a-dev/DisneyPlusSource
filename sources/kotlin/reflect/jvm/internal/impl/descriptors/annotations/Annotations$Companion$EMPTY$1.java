package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: Annotations.kt */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    Annotations$Companion$EMPTY$1() {
    }

    public Void findAnnotation(FqName fqName) {
        return null;
    }

    public boolean hasAnnotation(FqName fqName) {
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator<AnnotationDescriptor> iterator() {
        return C13185o.m40513a().iterator();
    }

    public String toString() {
        return "EMPTY";
    }
}
