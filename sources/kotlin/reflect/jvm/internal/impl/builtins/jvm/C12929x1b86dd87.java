package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getAdditionalFunctions$fakeJavaClassDescriptor$1 */
/* compiled from: JvmBuiltInsSettings.kt */
final class C12929x1b86dd87 extends C12881k implements Function0<LazyJavaClassDescriptor> {
    final /* synthetic */ LazyJavaClassDescriptor $javaAnalogueDescriptor;
    final /* synthetic */ ClassDescriptor $kotlinMutableClassIfContainer;

    C12929x1b86dd87(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.$javaAnalogueDescriptor = lazyJavaClassDescriptor;
        this.$kotlinMutableClassIfContainer = classDescriptor;
        super(0);
    }

    public final LazyJavaClassDescriptor invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.$javaAnalogueDescriptor;
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        C12880j.m40222a((Object) javaResolverCache, "JavaResolverCache.EMPTY");
        return lazyJavaClassDescriptor.copy$descriptors_jvm(javaResolverCache, this.$kotlinMutableClassIfContainer);
    }
}
