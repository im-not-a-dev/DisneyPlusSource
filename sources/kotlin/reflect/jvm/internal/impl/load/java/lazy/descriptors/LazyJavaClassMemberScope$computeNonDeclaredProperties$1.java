package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$computeNonDeclaredProperties$1 extends C12881k implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$computeNonDeclaredProperties$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.this$0 = lazyJavaClassMemberScope;
        super(1);
    }

    public final Collection<SimpleFunctionDescriptor> invoke(Name name) {
        return this.this$0.searchMethodsByNameWithoutBuiltinMagic(name);
    }
}
