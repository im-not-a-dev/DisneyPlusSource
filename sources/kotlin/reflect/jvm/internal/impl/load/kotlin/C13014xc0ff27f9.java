package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1 */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class C13014xc0ff27f9 implements AnnotationVisitor {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    C13014xc0ff27f9(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ArrayList arrayList) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        this.$result = arrayList;
    }

    public AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        return this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, this.$result);
    }

    public void visitEnd() {
    }
}
