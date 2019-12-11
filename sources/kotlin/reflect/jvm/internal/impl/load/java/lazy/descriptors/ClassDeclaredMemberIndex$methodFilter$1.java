package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* compiled from: DeclaredMemberIndex.kt */
final class ClassDeclaredMemberIndex$methodFilter$1 extends C12881k implements Function1<JavaMethod, Boolean> {
    final /* synthetic */ ClassDeclaredMemberIndex this$0;

    ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.this$0 = classDeclaredMemberIndex;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaMethod) obj));
    }

    public final boolean invoke(JavaMethod javaMethod) {
        return ((Boolean) this.this$0.memberFilter.invoke(javaMethod)).booleanValue() && !DescriptorResolverUtils.isObjectMethodInInterface(javaMethod);
    }
}
