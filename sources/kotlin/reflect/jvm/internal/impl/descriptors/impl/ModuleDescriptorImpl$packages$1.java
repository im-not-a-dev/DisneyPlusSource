package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: ModuleDescriptorImpl.kt */
final class ModuleDescriptorImpl$packages$1 extends C12881k implements Function1<FqName, LazyPackageViewDescriptorImpl> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    ModuleDescriptorImpl$packages$1(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.this$0 = moduleDescriptorImpl;
        super(1);
    }

    public final LazyPackageViewDescriptorImpl invoke(FqName fqName) {
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, moduleDescriptorImpl.storageManager);
    }
}
