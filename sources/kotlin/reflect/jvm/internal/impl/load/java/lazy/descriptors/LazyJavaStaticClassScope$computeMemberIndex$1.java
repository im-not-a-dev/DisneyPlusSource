package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* compiled from: LazyJavaStaticClassScope.kt */
final class LazyJavaStaticClassScope$computeMemberIndex$1 extends C12881k implements Function1<JavaMember, Boolean> {
    public static final LazyJavaStaticClassScope$computeMemberIndex$1 INSTANCE = new LazyJavaStaticClassScope$computeMemberIndex$1();

    LazyJavaStaticClassScope$computeMemberIndex$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaMember) obj));
    }

    public final boolean invoke(JavaMember javaMember) {
        return javaMember.isStatic();
    }
}
