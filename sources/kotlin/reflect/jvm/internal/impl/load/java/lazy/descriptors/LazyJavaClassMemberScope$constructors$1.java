package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$constructors$1 extends C12881k implements Function0<List<? extends ClassConstructorDescriptor>> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f29558$c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaClassMemberScope;
        this.f29558$c = lazyJavaResolverContext;
        super(0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> invoke() {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r0 = r4.this$0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r0.jClass
            java.util.Collection r0 = r0.getConstructors()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor) r2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r3 = r4.this$0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor r2 = r3.resolveConstructor(r2)
            r1.add(r2)
            goto L_0x0017
        L_0x002d:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = r4.f29558$c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r0.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r0 = r0.getSignatureEnhancement()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r2 = r4.f29558$c
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0049
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r1 = r4.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r1 = r1.createDefaultConstructor()
            java.util.List r1 = kotlin.p590y.C13185o.m40517b(r1)
        L_0x0049:
            java.util.Collection r0 = r0.enhanceSignatures(r2, r1)
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1.invoke():java.util.List");
    }
}
