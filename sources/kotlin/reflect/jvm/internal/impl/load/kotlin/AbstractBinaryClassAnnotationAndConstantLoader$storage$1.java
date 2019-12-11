package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends C12881k implements Function1<KotlinJvmBinaryClass, Storage<? extends A, ? extends C>> {
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        super(1);
    }

    public final Storage<A, C> invoke(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return this.this$0.loadAnnotationsAndInitializers(kotlinJvmBinaryClass);
    }
}
