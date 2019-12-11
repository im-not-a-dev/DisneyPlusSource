package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12860a0;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass extends ReflectJavaElement implements JavaClass, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {
    private final Class<?> klass;

    public ReflectJavaClass(Class<?> cls) {
        this.klass = cls;
    }

    /* access modifiers changed from: private */
    public final boolean isEnumValuesOrValueOf(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032 || !name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            Class[] parameterTypes = method.getParameterTypes();
            C12880j.m40222a((Object) parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaClass) && C12880j.m40224a((Object) this.klass, (Object) ((ReflectJavaClass) obj).klass);
    }

    public FqName getFqName() {
        FqName asSingleFqName = ReflectClassUtilKt.getClassId(this.klass).asSingleFqName();
        C12880j.m40222a((Object) asSingleFqName, "klass.classId.asSingleFqName()");
        return asSingleFqName;
    }

    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    public int getModifiers() {
        return this.klass.getModifiers();
    }

    public Name getName() {
        Name identifier = Name.identifier(this.klass.getSimpleName());
        C12880j.m40222a((Object) identifier, "Name.identifier(klass.simpleName)");
        return identifier;
    }

    public Collection<JavaClassifierType> getSupertypes() {
        Type type = Object.class;
        if (C12880j.m40224a((Object) this.klass, (Object) type)) {
            return C13185o.m40513a();
        }
        C12860a0 a0Var = new C12860a0(2);
        Type genericSuperclass = this.klass.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        a0Var.mo31155a((Object) type);
        Type[] genericInterfaces = this.klass.getGenericInterfaces();
        C12880j.m40222a((Object) genericInterfaces, "klass.genericInterfaces");
        a0Var.mo31157b(genericInterfaces);
        List<Type> c = C13185o.m40520c((Type[]) a0Var.mo31156a((Object[]) new Type[a0Var.mo31154a()]));
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (Type reflectJavaClassifierType : c) {
            arrayList.add(new ReflectJavaClassifierType(reflectJavaClassifierType));
        }
        return arrayList;
    }

    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable[] typeParameters = this.klass.getTypeParameters();
        C12880j.m40222a((Object) typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable reflectJavaTypeParameter : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(reflectJavaTypeParameter));
        }
        return arrayList;
    }

    public Visibility getVisibility() {
        return DefaultImpls.getVisibility(this);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public boolean isAbstract() {
        return DefaultImpls.isAbstract(this);
    }

    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    public boolean isDeprecatedInJavaDoc() {
        return ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public boolean isEnum() {
        return this.klass.isEnum();
    }

    public boolean isFinal() {
        return DefaultImpls.isFinal(this);
    }

    public boolean isInterface() {
        return this.klass.isInterface();
    }

    public boolean isStatic() {
        return DefaultImpls.isStatic(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaClass.class.getName());
        sb.append(": ");
        sb.append(this.klass);
        return sb.toString();
    }

    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        return ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    public List<ReflectJavaConstructor> getConstructors() {
        Constructor[] declaredConstructors = this.klass.getDeclaredConstructors();
        C12880j.m40222a((Object) declaredConstructors, "klass.declaredConstructors");
        return C12788p.m39999g(C12788p.m39994d(C12788p.m39990b(C13174k.m40401c((Object[]) declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    public Class<?> getElement() {
        return this.klass;
    }

    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.klass.getDeclaredFields();
        C12880j.m40222a((Object) declaredFields, "klass.declaredFields");
        return C12788p.m39999g(C12788p.m39994d(C12788p.m39990b(C13174k.m40401c((Object[]) declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    public List<Name> getInnerClassNames() {
        Class[] declaredClasses = this.klass.getDeclaredClasses();
        C12880j.m40222a((Object) declaredClasses, "klass.declaredClasses");
        return C12788p.m39999g(C12788p.m39996e(C12788p.m39990b(C13174k.m40401c((Object[]) declaredClasses), ReflectJavaClass$innerClassNames$1.INSTANCE), ReflectJavaClass$innerClassNames$2.INSTANCE));
    }

    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.klass.getDeclaredMethods();
        C12880j.m40222a((Object) declaredMethods, "klass.declaredMethods");
        return C12788p.m39999g(C12788p.m39994d(C12788p.m39989a(C13174k.m40401c((Object[]) declaredMethods), (Function1<? super T, Boolean>) new ReflectJavaClass$methods$1<Object,Boolean>(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    public ReflectJavaClass getOuterClass() {
        Class declaringClass = this.klass.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }
}
