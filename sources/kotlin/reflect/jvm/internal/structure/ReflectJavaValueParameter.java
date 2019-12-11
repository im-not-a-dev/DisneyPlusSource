package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaValueParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "reflectAnnotations", "", "", "reflectName", "", "isVararg", "", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "isDeprecatedInJavaDoc", "()Z", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "[Ljava/lang/annotation/Annotation;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "toString", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaValueParameter.kt */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {
    private final boolean isVararg;
    private final Annotation[] reflectAnnotations;
    private final String reflectName;
    private final ReflectJavaType type;

    public ReflectJavaValueParameter(ReflectJavaType reflectJavaType, Annotation[] annotationArr, String str, boolean z) {
        this.type = reflectJavaType;
        this.reflectAnnotations = annotationArr;
        this.reflectName = str;
        this.isVararg = z;
    }

    public Name getName() {
        String str = this.reflectName;
        if (str != null) {
            return Name.guessByFirstCharacter(str);
        }
        return null;
    }

    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public boolean isVararg() {
        return this.isVararg;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaValueParameter.class.getName());
        String str = ": ";
        sb.append(str);
        sb.append(isVararg() ? "vararg " : "");
        sb.append(getName());
        sb.append(str);
        sb.append(getType());
        return sb.toString();
    }

    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.reflectAnnotations, fqName);
    }

    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.reflectAnnotations);
    }

    public ReflectJavaType getType() {
        return this.type;
    }
}
