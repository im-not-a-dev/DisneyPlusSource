package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "element$annotations", "()V", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaTypeParameter.kt */
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements JavaTypeParameter, ReflectJavaAnnotationOwner {
    private final TypeVariable<?> typeVariable;

    public ReflectJavaTypeParameter(TypeVariable<?> typeVariable2) {
        this.typeVariable = typeVariable2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaTypeParameter) && C12880j.m40224a((Object) this.typeVariable, (Object) ((ReflectJavaTypeParameter) obj).typeVariable);
    }

    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable2 = this.typeVariable;
        if (!(typeVariable2 instanceof AnnotatedElement)) {
            typeVariable2 = null;
        }
        return (AnnotatedElement) typeVariable2;
    }

    public Name getName() {
        Name identifier = Name.identifier(this.typeVariable.getName());
        C12880j.m40222a((Object) identifier, "Name.identifier(typeVariable.name)");
        return identifier;
    }

    public int hashCode() {
        return this.typeVariable.hashCode();
    }

    public boolean isDeprecatedInJavaDoc() {
        return DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaTypeParameter.class.getName());
        sb.append(": ");
        sb.append(this.typeVariable);
        return sb.toString();
    }

    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        return DefaultImpls.findAnnotation(this, fqName);
    }

    public List<ReflectJavaAnnotation> getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    public List<ReflectJavaClassifierType> getUpperBounds() {
        Type[] bounds = this.typeVariable.getBounds();
        C12880j.m40222a((Object) bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type reflectJavaClassifierType : bounds) {
            arrayList.add(new ReflectJavaClassifierType(reflectJavaClassifierType));
        }
        ReflectJavaClassifierType reflectJavaClassifierType2 = (ReflectJavaClassifierType) C13199w.m40600l((List) arrayList);
        return C12880j.m40224a((Object) reflectJavaClassifierType2 != null ? reflectJavaClassifierType2.getReflectType() : null, (Object) Object.class) ? C13185o.m40513a() : arrayList;
    }
}
