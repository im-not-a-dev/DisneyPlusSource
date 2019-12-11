package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.jvm.internal.C12880j;
import kotlin.p587i0.C12775h;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* compiled from: LazyJavaAnnotations.kt */
public final class LazyJavaAnnotations implements Annotations {
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors = this.f29552c.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaAnnotations$annotationDescriptors$1(this));
    private final JavaAnnotationOwner annotationOwner;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29552c;

    public LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner) {
        this.f29552c = lazyJavaResolverContext;
        this.annotationOwner = javaAnnotationOwner;
    }

    public AnnotationDescriptor findAnnotation(FqName fqName) {
        JavaAnnotation findAnnotation = this.annotationOwner.findAnnotation(fqName);
        if (findAnnotation != null) {
            AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) this.annotationDescriptors.invoke(findAnnotation);
            if (annotationDescriptor != null) {
                return annotationDescriptor;
            }
        }
        return JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f29552c);
    }

    public boolean hasAnnotation(FqName fqName) {
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    public Iterator<AnnotationDescriptor> iterator() {
        C12775h d = C12788p.m39994d(C13199w.m40577c((Iterable) this.annotationOwner.getAnnotations()), this.annotationDescriptors);
        JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.INSTANCE;
        FqName fqName = KotlinBuiltIns.FQ_NAMES.deprecated;
        C12880j.m40222a((Object) fqName, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return C12788p.m39995e(C12788p.m39988a(d, javaAnnotationMapper.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f29552c))).iterator();
    }
}
