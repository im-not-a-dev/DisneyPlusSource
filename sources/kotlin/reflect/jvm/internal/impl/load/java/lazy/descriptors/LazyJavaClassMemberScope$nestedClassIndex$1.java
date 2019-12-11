package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$nestedClassIndex$1 extends C12881k implements Function0<Set<? extends Name>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$nestedClassIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.this$0 = lazyJavaClassMemberScope;
        super(0);
    }

    public final Set<Name> invoke() {
        return C13199w.m40609t(this.this$0.jClass.getInnerClassNames());
    }
}
