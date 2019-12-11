package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1 */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C13016xfa5093a1 implements AnnotationArrayArgumentVisitor {
    final /* synthetic */ Name $name;
    private final ArrayList<ConstantValue<?>> elements = new ArrayList<>();
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 this$0;

    C13016xfa5093a1(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1, Name name) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1;
        this.$name = name;
    }

    public void visit(Object obj) {
        this.elements.add(this.this$0.createConstant(this.$name, obj));
    }

    public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
        this.elements.add(new KClassValue(classLiteralValue));
    }

    public void visitEnd() {
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(this.$name, this.this$0.$annotationClass);
        if (annotationParameterByName != null) {
            HashMap access$getArguments$p = this.this$0.arguments;
            Name name = this.$name;
            ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
            List compact = CollectionsKt.compact(this.elements);
            KotlinType type = annotationParameterByName.getType();
            C12880j.m40222a((Object) type, "parameter.type");
            access$getArguments$p.put(name, constantValueFactory.createArrayValue(compact, type));
        }
    }

    public void visitEnum(ClassId classId, Name name) {
        this.elements.add(new EnumValue(classId, name));
    }
}
