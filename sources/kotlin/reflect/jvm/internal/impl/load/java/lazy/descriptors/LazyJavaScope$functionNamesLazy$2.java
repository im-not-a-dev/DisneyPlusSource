package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$functionNamesLazy$2 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$functionNamesLazy$2(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(0);
    }

    public final Set<Name> invoke() {
        return this.this$0.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
    }
}
