package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$allDescriptors$1 extends C12881k implements Function0<List<? extends DeclarationDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(0);
    }

    public final List<DeclarationDescriptor> invoke() {
        return this.this$0.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
    }
}
