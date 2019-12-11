package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
final class LazyPackageViewDescriptorImpl$fragments$2 extends C12881k implements Function0<List<? extends PackageFragmentDescriptor>> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    LazyPackageViewDescriptorImpl$fragments$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.this$0 = lazyPackageViewDescriptorImpl;
        super(0);
    }

    public final List<PackageFragmentDescriptor> invoke() {
        return this.this$0.getModule().getPackageFragmentProvider().getPackageFragments(this.this$0.getFqName());
    }
}
