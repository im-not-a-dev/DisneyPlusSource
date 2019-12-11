package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: LazyJavaPackageFragment.kt */
final class LazyJavaPackageFragment$subPackages$1 extends C12881k implements Function0<List<? extends FqName>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    LazyJavaPackageFragment$subPackages$1(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.this$0 = lazyJavaPackageFragment;
        super(0);
    }

    public final List<FqName> invoke() {
        Collection<JavaPackage> subPackages = this.this$0.jPackage.getSubPackages();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) subPackages, 10));
        for (JavaPackage fqName : subPackages) {
            arrayList.add(fqName.getFqName());
        }
        return arrayList;
    }
}
