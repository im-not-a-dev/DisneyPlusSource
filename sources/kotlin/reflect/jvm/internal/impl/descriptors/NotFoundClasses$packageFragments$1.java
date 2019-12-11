package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: NotFoundClasses.kt */
final class NotFoundClasses$packageFragments$1 extends C12881k implements Function1<FqName, EmptyPackageFragmentDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        this.this$0 = notFoundClasses;
        super(1);
    }

    public final EmptyPackageFragmentDescriptor invoke(FqName fqName) {
        return new EmptyPackageFragmentDescriptor(this.this$0.module, fqName);
    }
}
