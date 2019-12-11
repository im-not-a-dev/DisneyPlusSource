package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* compiled from: LazyJavaPackageScope.kt */
final class LazyJavaPackageScope$knownClassNamesInPackage$1 extends C12881k implements Function0<Set<? extends String>> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f29562$c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    LazyJavaPackageScope$knownClassNamesInPackage$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaPackageScope;
        this.f29562$c = lazyJavaResolverContext;
        super(0);
    }

    public final Set<String> invoke() {
        return this.f29562$c.getComponents().getFinder().knownClassNamesInPackage(this.this$0.getOwnerDescriptor().getFqName());
    }
}
