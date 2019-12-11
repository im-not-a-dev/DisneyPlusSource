package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* compiled from: AnnotationTypeQualifierResolver.kt */
final /* synthetic */ class AnnotationTypeQualifierResolver$resolvedNicknames$1 extends C12879i implements Function1<ClassDescriptor, AnnotationDescriptor> {
    AnnotationTypeQualifierResolver$resolvedNicknames$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(1, annotationTypeQualifierResolver);
    }

    public final String getName() {
        return "computeTypeQualifierNickname";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(AnnotationTypeQualifierResolver.class);
    }

    public final String getSignature() {
        return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }

    public final AnnotationDescriptor invoke(ClassDescriptor classDescriptor) {
        return ((AnnotationTypeQualifierResolver) this.receiver).computeTypeQualifierNickname(classDescriptor);
    }
}
