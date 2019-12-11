package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitAnnotation$1 */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C13015xe59bb5e1 implements AnnotationArgumentVisitor {
    private final /* synthetic */ AnnotationArgumentVisitor $$delegate_0;
    final /* synthetic */ ArrayList $list;
    final /* synthetic */ Name $name;
    final /* synthetic */ AnnotationArgumentVisitor $visitor;
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 this$0;

    C13015xe59bb5e1(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1, AnnotationArgumentVisitor annotationArgumentVisitor, Name name, ArrayList arrayList) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1;
        this.$visitor = annotationArgumentVisitor;
        this.$name = name;
        this.$list = arrayList;
        this.$$delegate_0 = annotationArgumentVisitor;
    }

    public void visit(Name name, Object obj) {
        this.$$delegate_0.visit(name, obj);
    }

    public AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        return this.$$delegate_0.visitAnnotation(name, classId);
    }

    public AnnotationArrayArgumentVisitor visitArray(Name name) {
        return this.$$delegate_0.visitArray(name);
    }

    public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        this.$$delegate_0.visitClassLiteral(name, classLiteralValue);
    }

    public void visitEnd() {
        this.$visitor.visitEnd();
        this.this$0.arguments.put(this.$name, new AnnotationValue((AnnotationDescriptor) C13199w.m40599k((List) this.$list)));
    }

    public void visitEnum(Name name, ClassId classId, Name name2) {
        this.$$delegate_0.visitEnum(name, classId, name2);
    }
}
