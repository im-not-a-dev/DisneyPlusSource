package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 implements AnnotationArgumentVisitor {
    final /* synthetic */ ClassDescriptor $annotationClass;
    final /* synthetic */ List $result;
    final /* synthetic */ SourceElement $source;
    /* access modifiers changed from: private */
    public final HashMap<Name, ConstantValue<?>> arguments = new HashMap<>();
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl this$0;

    BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, List list, SourceElement sourceElement) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl;
        this.$annotationClass = classDescriptor;
        this.$result = list;
        this.$source = sourceElement;
    }

    /* access modifiers changed from: private */
    public final ConstantValue<?> createConstant(Name name, Object obj) {
        ConstantValue<?> createConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj);
        if (createConstantValue != null) {
            return createConstantValue;
        }
        Companion companion = ErrorValue.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported annotation argument: ");
        sb.append(name);
        return companion.create(sb.toString());
    }

    public void visit(Name name, Object obj) {
        if (name != null) {
            this.arguments.put(name, createConstant(name, obj));
        }
    }

    public AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.this$0;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
        AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
        if (loadAnnotation != null) {
            return new C13015xe59bb5e1(this, loadAnnotation, name, arrayList);
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public AnnotationArrayArgumentVisitor visitArray(Name name) {
        return new C13016xfa5093a1(this, name);
    }

    public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        this.arguments.put(name, new KClassValue(classLiteralValue));
    }

    public void visitEnd() {
        this.$result.add(new AnnotationDescriptorImpl(this.$annotationClass.getDefaultType(), this.arguments, this.$source));
    }

    public void visitEnum(Name name, ClassId classId, Name name2) {
        this.arguments.put(name, new EnumValue(classId, name2));
    }
}
