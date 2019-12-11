package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
final class LazyPackageViewDescriptorImpl$memberScope$1 extends C12881k implements Function0<MemberScope> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.this$0 = lazyPackageViewDescriptorImpl;
        super(0);
    }

    public final MemberScope invoke() {
        if (this.this$0.getFragments().isEmpty()) {
            return Empty.INSTANCE;
        }
        List<PackageFragmentDescriptor> fragments = this.this$0.getFragments();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) fragments, 10));
        for (PackageFragmentDescriptor memberScope : fragments) {
            arrayList.add(memberScope.getMemberScope());
        }
        List a = C13199w.m40563a((Collection) arrayList, (Object) new SubpackagesScope(this.this$0.getModule(), this.this$0.getFqName()));
        StringBuilder sb = new StringBuilder();
        sb.append("package view scope for ");
        sb.append(this.this$0.getFqName());
        sb.append(" in ");
        sb.append(this.this$0.getModule().getName());
        return new ChainedMemberScope(sb.toString(), a);
    }
}
