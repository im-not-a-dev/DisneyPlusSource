package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends C12881k implements Function0<LazyJavaPackageFragment> {
    final /* synthetic */ JavaPackage $jPackage;
    final /* synthetic */ LazyJavaPackageFragmentProvider this$0;

    LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.this$0 = lazyJavaPackageFragmentProvider;
        this.$jPackage = javaPackage;
        super(0);
    }

    public final LazyJavaPackageFragment invoke() {
        return new LazyJavaPackageFragment(this.this$0.f29553c, this.$jPackage);
    }
}
