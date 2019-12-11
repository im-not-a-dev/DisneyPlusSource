package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class LazyJavaAnnotationDescriptor$fqName$2 extends C12881k implements Function0<FqName> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    LazyJavaAnnotationDescriptor$fqName$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.this$0 = lazyJavaAnnotationDescriptor;
        super(0);
    }

    public final FqName invoke() {
        ClassId classId = this.this$0.javaAnnotation.getClassId();
        if (classId != null) {
            return classId.asSingleFqName();
        }
        return null;
    }
}
