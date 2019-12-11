package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1 */
/* compiled from: LazyJavaClassMemberScope.kt */
final class C12976xb5a47a0f extends C12881k implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ SimpleFunctionDescriptor $function$inlined;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    C12976xb5a47a0f(LazyJavaClassMemberScope lazyJavaClassMemberScope, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.this$0 = lazyJavaClassMemberScope;
        this.$function$inlined = simpleFunctionDescriptor;
        super(1);
    }

    public final Collection<SimpleFunctionDescriptor> invoke(Name name) {
        if (Intrinsics.areEqual((Object) this.$function$inlined.getName(), (Object) name)) {
            return C13183n.m40498a(this.$function$inlined);
        }
        return C13199w.m40583d(this.this$0.searchMethodsByNameWithoutBuiltinMagic(name), (Iterable) this.this$0.searchMethodsInSupertypesWithoutBuiltinMagic(name));
    }
}
