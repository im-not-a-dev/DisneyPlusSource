package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;

/* compiled from: context.kt */
final class ContextKt$childForClassOrPackage$1 extends C12881k implements Function0<JavaTypeQualifiersByElementType> {
    final /* synthetic */ ClassOrPackageFragmentDescriptor $containingDeclaration;
    final /* synthetic */ LazyJavaResolverContext $this_childForClassOrPackage;

    ContextKt$childForClassOrPackage$1(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.$this_childForClassOrPackage = lazyJavaResolverContext;
        this.$containingDeclaration = classOrPackageFragmentDescriptor;
        super(0);
    }

    public final JavaTypeQualifiersByElementType invoke() {
        return ContextKt.computeNewDefaultTypeQualifiers(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
    }
}
