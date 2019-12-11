package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$declaredMemberIndex$1 extends C12881k implements Function0<DeclaredMemberIndex> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$declaredMemberIndex$1(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(0);
    }

    public final DeclaredMemberIndex invoke() {
        return this.this$0.computeMemberIndex();
    }
}
