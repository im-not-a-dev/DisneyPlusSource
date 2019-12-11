package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$functions$1 extends C12881k implements Function1<Name, List<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(1);
    }

    public final List<SimpleFunctionDescriptor> invoke(Name name) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaMethod javaMethod : ((DeclaredMemberIndex) this.this$0.getDeclaredMemberIndex().invoke()).findMethodsByName(name)) {
            JavaMethodDescriptor resolveMethodToFunctionDescriptor = this.this$0.resolveMethodToFunctionDescriptor(javaMethod);
            if (this.this$0.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                this.this$0.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                linkedHashSet.add(resolveMethodToFunctionDescriptor);
            }
        }
        OverridingUtilsKt.retainMostSpecificInEachOverridableGroup(linkedHashSet);
        this.this$0.computeNonDeclaredFunctions(linkedHashSet, name);
        return C13199w.m40606q(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), linkedHashSet));
    }
}
