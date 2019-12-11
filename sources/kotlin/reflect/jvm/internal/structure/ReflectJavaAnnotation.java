package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p581d0.C12731a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.Factory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", "other", "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaAnnotation.kt */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {
    private final Annotation annotation;

    public ReflectJavaAnnotation(Annotation annotation2) {
        this.annotation = annotation2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && Intrinsics.areEqual((Object) this.annotation, (Object) ((ReflectJavaAnnotation) obj).annotation);
    }

    public final Annotation getAnnotation() {
        return this.annotation;
    }

    public Collection<JavaAnnotationArgument> getArguments() {
        Method[] declaredMethods = C12731a.m39866a(C12731a.m39868a(this.annotation)).getDeclaredMethods();
        Intrinsics.checkReturnedValueIsNotNull((Object) declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Factory factory = ReflectJavaAnnotationArgument.Factory;
            Object invoke = method.invoke(this.annotation, new Object[0]);
            Intrinsics.checkReturnedValueIsNotNull(invoke, "method.invoke(annotation)");
            Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
            arrayList.add(factory.create(invoke, Name.identifier(method.getName())));
        }
        return arrayList;
    }

    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(C12731a.m39866a(C12731a.m39868a(this.annotation)));
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    public boolean isIdeExternalAnnotation() {
        return DefaultImpls.isIdeExternalAnnotation(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaAnnotation.class.getName());
        sb.append(": ");
        sb.append(this.annotation);
        return sb.toString();
    }

    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(C12731a.m39866a(C12731a.m39868a(this.annotation)));
    }
}
