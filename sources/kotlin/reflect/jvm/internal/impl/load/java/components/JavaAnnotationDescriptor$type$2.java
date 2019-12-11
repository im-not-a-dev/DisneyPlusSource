package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaAnnotationDescriptor$type$2 extends C12881k implements Function0<SimpleType> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f29551$c;
    final /* synthetic */ JavaAnnotationDescriptor this$0;

    JavaAnnotationDescriptor$type$2(JavaAnnotationDescriptor javaAnnotationDescriptor, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = javaAnnotationDescriptor;
        this.f29551$c = lazyJavaResolverContext;
        super(0);
    }

    public final SimpleType invoke() {
        ClassDescriptor builtInClassByFqName = this.f29551$c.getModule().getBuiltIns().getBuiltInClassByFqName(this.this$0.getFqName());
        C12880j.m40222a((Object) builtInClassByFqName, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
        return builtInClassByFqName.getDefaultType();
    }
}
