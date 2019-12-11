package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType.Factory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClassifierType.kt */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {
    private final JavaClassifier classifier;
    private final Type reflectType;

    public ReflectJavaClassifierType(Type type) {
        JavaClassifier javaClassifier;
        this.reflectType = type;
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof Class) {
            javaClassifier = new ReflectJavaClass((Class) reflectType2);
        } else if (reflectType2 instanceof TypeVariable) {
            javaClassifier = new ReflectJavaTypeParameter((TypeVariable) reflectType2);
        } else if (reflectType2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) reflectType2).getRawType();
            if (rawType != null) {
                javaClassifier = new ReflectJavaClass((Class) rawType);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a classifier type (");
            sb.append(reflectType2.getClass());
            sb.append("): ");
            sb.append(reflectType2);
            throw new IllegalStateException(sb.toString());
        }
        this.classifier = javaClassifier;
    }

    public JavaAnnotation findAnnotation(FqName fqName) {
        return null;
    }

    public Collection<JavaAnnotation> getAnnotations() {
        return C13185o.m40513a();
    }

    public JavaClassifier getClassifier() {
        return this.classifier;
    }

    public String getClassifierQualifiedName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type not found: ");
        sb.append(getReflectType());
        throw new UnsupportedOperationException(sb.toString());
    }

    public String getPresentableText() {
        return getReflectType().toString();
    }

    public Type getReflectType() {
        return this.reflectType;
    }

    public List<JavaType> getTypeArguments() {
        List<Type> parameterizedTypeArguments = ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        Factory factory = ReflectJavaType.Factory;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameterizedTypeArguments, 10));
        for (Type create : parameterizedTypeArguments) {
            arrayList.add(factory.create(create));
        }
        return arrayList;
    }

    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public boolean isRaw() {
        Type reflectType2 = getReflectType();
        if (!(reflectType2 instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) reflectType2).getTypeParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }
}
