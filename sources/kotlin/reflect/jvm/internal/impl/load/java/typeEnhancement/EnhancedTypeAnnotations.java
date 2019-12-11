package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: typeEnhancement.kt */
final class EnhancedTypeAnnotations implements Annotations {
    private final FqName fqNameToMatch;

    public EnhancedTypeAnnotations(FqName fqName) {
        this.fqNameToMatch = fqName;
    }

    public boolean hasAnnotation(FqName fqName) {
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<AnnotationDescriptor> iterator() {
        return C13185o.m40513a().iterator();
    }

    public EnhancedTypeAnnotationDescriptor findAnnotation(FqName fqName) {
        if (C12880j.m40224a((Object) fqName, (Object) this.fqNameToMatch)) {
            return EnhancedTypeAnnotationDescriptor.INSTANCE;
        }
        return null;
    }
}
