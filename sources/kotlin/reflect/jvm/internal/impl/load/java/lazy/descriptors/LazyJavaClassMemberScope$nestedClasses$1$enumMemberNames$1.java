package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ LazyJavaClassMemberScope$nestedClasses$1 this$0;

    LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(LazyJavaClassMemberScope$nestedClasses$1 lazyJavaClassMemberScope$nestedClasses$1) {
        this.this$0 = lazyJavaClassMemberScope$nestedClasses$1;
        super(0);
    }

    public final Set<Name> invoke() {
        return C13190q0.m40534a(this.this$0.this$0.getFunctionNames(), (Iterable) this.this$0.this$0.getVariableNames());
    }
}
