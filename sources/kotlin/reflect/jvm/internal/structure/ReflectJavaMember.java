package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\"2\u0006\u0010&\u001a\u00020\u001bH\u0004¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", "other", "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaMember.kt */
public abstract class ReflectJavaMember extends ReflectJavaElement implements JavaMember, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {
    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && C12880j.m40224a((Object) getMember(), (Object) ((ReflectJavaMember) obj).getMember());
    }

    public AnnotatedElement getElement() {
        Member member = getMember();
        if (member != null) {
            return (AnnotatedElement) member;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public abstract Member getMember();

    public int getModifiers() {
        return getMember().getModifiers();
    }

    public Name getName() {
        String name = getMember().getName();
        if (name != null) {
            Name identifier = Name.identifier(name);
            if (identifier != null) {
                return identifier;
            }
        }
        Name name2 = SpecialNames.NO_NAME_PROVIDED;
        C12880j.m40222a((Object) name2, "SpecialNames.NO_NAME_PROVIDED");
        return name2;
    }

    /* access modifiers changed from: protected */
    public final List<JavaValueParameter> getValueParameters(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList(typeArr.length);
        List loadParameterNames = Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        int size = loadParameterNames != null ? loadParameterNames.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            ReflectJavaType create = ReflectJavaType.Factory.create(typeArr[i]);
            if (loadParameterNames != null) {
                str = (String) C13199w.m40578d(loadParameterNames, i + size);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No parameter with index ");
                    sb.append(i);
                    sb.append('+');
                    sb.append(size);
                    sb.append(" (name=");
                    sb.append(getName());
                    sb.append(" type=");
                    sb.append(create);
                    sb.append(") in ");
                    sb.append(loadParameterNames);
                    sb.append("@ReflectJavaMember");
                    throw new IllegalStateException(sb.toString().toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new ReflectJavaValueParameter(create, annotationArr[i], str, z && i == C13174k.m40407g(typeArr)));
            i++;
        }
        return arrayList;
    }

    public Visibility getVisibility() {
        return DefaultImpls.getVisibility(this);
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    public boolean isAbstract() {
        return DefaultImpls.isAbstract(this);
    }

    public boolean isDeprecatedInJavaDoc() {
        return ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public boolean isFinal() {
        return DefaultImpls.isFinal(this);
    }

    public boolean isStatic() {
        return DefaultImpls.isStatic(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMember());
        return sb.toString();
    }

    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        return ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    public ReflectJavaClass getContainingClass() {
        Class declaringClass = getMember().getDeclaringClass();
        C12880j.m40222a((Object) declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }
}
