package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1 */
/* compiled from: LazyJavaClassDescriptor.kt */
final class C12975xbaf55d8a extends C12881k implements Function0<List<? extends TypeParameterDescriptor>> {
    final /* synthetic */ LazyJavaClassTypeConstructor this$0;

    C12975xbaf55d8a(LazyJavaClassTypeConstructor lazyJavaClassTypeConstructor) {
        this.this$0 = lazyJavaClassTypeConstructor;
        super(0);
    }

    public final List<TypeParameterDescriptor> invoke() {
        return TypeParameterUtilsKt.computeConstructorTypeParameters(LazyJavaClassDescriptor.this);
    }
}
