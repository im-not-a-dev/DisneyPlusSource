package kotlin.reflect.jvm.internal.structure;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPackage;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "(Lorg/jetbrains/kotlin/name/FqName;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "isDeprecatedInJavaDoc", "", "()Z", "subPackages", "", "getSubPackages", "()Ljava/util/Collection;", "equals", "other", "", "findAnnotation", "getClasses", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "nameFilter", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "hashCode", "", "toString", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaPackage.kt */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {
    private final FqName fqName;

    public ReflectJavaPackage(FqName fqName2) {
        this.fqName = fqName2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.areEqual((Object) getFqName(), (Object) ((ReflectJavaPackage) obj).getFqName());
    }

    public JavaAnnotation findAnnotation(FqName fqName2) {
        return null;
    }

    public Collection<JavaClass> getClasses(Function1<? super Name, Boolean> function1) {
        return C13185o.m40513a();
    }

    public FqName getFqName() {
        return this.fqName;
    }

    public Collection<JavaPackage> getSubPackages() {
        return C13185o.m40513a();
    }

    public int hashCode() {
        return getFqName().hashCode();
    }

    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaPackage.class.getName());
        sb.append(": ");
        sb.append(getFqName());
        return sb.toString();
    }

    public List<JavaAnnotation> getAnnotations() {
        return C13185o.m40513a();
    }
}
