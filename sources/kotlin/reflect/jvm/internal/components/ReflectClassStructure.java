package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p581d0.C12731a;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0006H\u0002¨\u0006\u001b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "classLiteralValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ClassLiteralValue;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectKotlinClass.kt */
final class ReflectClassStructure {
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            Intrinsics.checkReturnedValueIsNotNull((Object) cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName asSingleFqName = classId.asSingleFqName();
            Intrinsics.checkReturnedValueIsNotNull((Object) asSingleFqName, "javaClassId.asSingleFqName()");
            ClassId mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(asSingleFqName);
            if (mapJavaToKotlin != null) {
                classId = mapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i);
        } else if (Intrinsics.areEqual((Object) cls, (Object) Void.TYPE)) {
            ClassId classId2 = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.unit.toSafe());
            Intrinsics.checkReturnedValueIsNotNull((Object) classId2, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new ClassLiteralValue(classId2, i);
        } else {
            JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(cls.getName());
            Intrinsics.checkReturnedValueIsNotNull((Object) jvmPrimitiveType, "JvmPrimitiveType.get(currentClass.name)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkReturnedValueIsNotNull((Object) primitiveType, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                ClassId classId3 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
                Intrinsics.checkReturnedValueIsNotNull((Object) classId3, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                return new ClassLiteralValue(classId3, i - 1);
            }
            ClassId classId4 = ClassId.topLevel(primitiveType.getTypeFqName());
            Intrinsics.checkReturnedValueIsNotNull((Object) classId4, "ClassId.topLevel(primitiveType.typeFqName)");
            return new ClassLiteralValue(classId4, i);
        }
    }

    private final void loadConstructorAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        int i;
        Constructor[] constructorArr;
        String str;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            Name special = Name.special("<init>");
            Intrinsics.checkReturnedValueIsNotNull((Object) special, "Name.special(\"<init>\")");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor, "constructor");
            MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(special, signatureSerializer.constructorDesc(constructor));
            if (visitMethod != null) {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i3 = 0;
                while (true) {
                    str = "annotation";
                    if (i3 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i3];
                    Intrinsics.checkReturnedValueIsNotNull((Object) annotation, str);
                    processAnnotation(visitMethod, annotation);
                    i3++;
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.checkReturnedValueIsNotNull((Object) parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        Annotation[] annotationArr = parameterAnnotations[i4];
                        int length5 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length5) {
                            Annotation annotation2 = annotationArr[i5];
                            Class a = C12731a.m39866a(C12731a.m39868a(annotation2));
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i6 = i4 + length3;
                            int i7 = length;
                            ClassId classId = ReflectClassUtilKt.getClassId(a);
                            int i8 = length3;
                            Intrinsics.checkReturnedValueIsNotNull((Object) annotation2, str);
                            AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i6, classId, new ReflectAnnotationSource(annotation2));
                            if (visitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, a);
                            }
                            i5++;
                            declaredConstructors = constructorArr2;
                            length = i7;
                            length3 = i8;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i9 = length;
                        int i10 = length3;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                visitMethod.visitEnd();
            } else {
                constructorArr = declaredConstructors;
                i = length;
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        Field[] declaredFields;
        Annotation[] declaredAnnotations;
        for (Field field : cls.getDeclaredFields()) {
            Intrinsics.checkReturnedValueIsNotNull((Object) field, "field");
            Name identifier = Name.identifier(field.getName());
            Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(field.name)");
            AnnotationVisitor visitField = memberVisitor.visitField(identifier, SignatureSerializer.INSTANCE.fieldDesc(field), null);
            if (visitField != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) annotation, "annotation");
                    processAnnotation(visitField, annotation);
                }
                visitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        Method[] methodArr;
        String str;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
            Name identifier = Name.identifier(method.getName());
            Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(method.name)");
            MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, SignatureSerializer.INSTANCE.methodDesc(method));
            if (visitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i2 = 0;
                while (true) {
                    str = "annotation";
                    if (i2 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i2];
                    Intrinsics.checkReturnedValueIsNotNull((Object) annotation, str);
                    processAnnotation(visitMethod, annotation);
                    i2++;
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkReturnedValueIsNotNull((Object) parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    Annotation[] annotationArr = parameterAnnotations[i3];
                    int length4 = annotationArr.length;
                    int i4 = 0;
                    while (i4 < length4) {
                        Annotation annotation2 = annotationArr[i4];
                        Class a = C12731a.m39866a(C12731a.m39868a(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(a);
                        Method[] methodArr2 = declaredMethods;
                        Intrinsics.checkReturnedValueIsNotNull((Object) annotation2, str);
                        AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i3, classId, new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, a);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                visitMethod.visitEnd();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    private final void processAnnotation(AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class a = C12731a.m39866a(C12731a.m39868a(annotation));
        AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(a), new ReflectAnnotationSource(annotation));
        if (visitAnnotation != null) {
            INSTANCE.processAnnotationArguments(visitAnnotation, annotation, a);
        }
    }

    private final void processAnnotationArgumentValue(AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) {
        Class cls = obj.getClass();
        String str = "null cannot be cast to non-null type java.lang.Class<*>";
        if (Intrinsics.areEqual((Object) cls, (Object) Class.class)) {
            if (obj != null) {
                annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            } else {
                throw new C13142s(str);
            }
        } else if (ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(cls)) {
            annotationArgumentVisitor.visit(name, obj);
        } else {
            String str2 = "null cannot be cast to non-null type kotlin.Enum<*>";
            if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
                if (!cls.isEnum()) {
                    cls = cls.getEnclosingClass();
                }
                Intrinsics.checkReturnedValueIsNotNull((Object) cls, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
                ClassId classId = ReflectClassUtilKt.getClassId(cls);
                if (obj != null) {
                    Name identifier = Name.identifier(((Enum) obj).name());
                    Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier((value as Enum<*>).name)");
                    annotationArgumentVisitor.visitEnum(name, classId, identifier);
                } else {
                    throw new C13142s(str2);
                }
            } else if (Annotation.class.isAssignableFrom(cls)) {
                Class[] interfaces = cls.getInterfaces();
                Intrinsics.checkReturnedValueIsNotNull((Object) interfaces, "clazz.interfaces");
                Class cls2 = (Class) C13174k.m40410j(interfaces);
                Intrinsics.checkReturnedValueIsNotNull((Object) cls2, "annotationClass");
                AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls2));
                if (visitAnnotation == null) {
                    return;
                }
                if (obj != null) {
                    processAnnotationArguments(visitAnnotation, (Annotation) obj, cls2);
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlin.Annotation");
                }
            } else if (cls.isArray()) {
                AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(name);
                if (visitArray != null) {
                    Class componentType = cls.getComponentType();
                    Intrinsics.checkReturnedValueIsNotNull((Object) componentType, "componentType");
                    String str3 = "null cannot be cast to non-null type kotlin.Array<*>";
                    int i = 0;
                    if (componentType.isEnum()) {
                        ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                        if (obj != null) {
                            Object[] objArr = (Object[]) obj;
                            int length = objArr.length;
                            while (i < length) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    Name identifier2 = Name.identifier(((Enum) obj2).name());
                                    Intrinsics.checkReturnedValueIsNotNull((Object) identifier2, "Name.identifier((element as Enum<*>).name)");
                                    visitArray.visitEnum(classId2, identifier2);
                                    i++;
                                } else {
                                    throw new C13142s(str2);
                                }
                            }
                        } else {
                            throw new C13142s(str3);
                        }
                    } else if (Intrinsics.areEqual((Object) componentType, (Object) Class.class)) {
                        if (obj != null) {
                            Object[] objArr2 = (Object[]) obj;
                            int length2 = objArr2.length;
                            while (i < length2) {
                                Object obj3 = objArr2[i];
                                if (obj3 != null) {
                                    visitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                                    i++;
                                } else {
                                    throw new C13142s(str);
                                }
                            }
                        } else {
                            throw new C13142s(str3);
                        }
                    } else if (obj != null) {
                        Object[] objArr3 = (Object[]) obj;
                        int length3 = objArr3.length;
                        while (i < length3) {
                            visitArray.visit(objArr3[i]);
                            i++;
                        }
                    } else {
                        throw new C13142s(str3);
                    }
                    visitArray.visitEnd();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported annotation argument value (");
                sb.append(cls);
                sb.append("): ");
                sb.append(obj);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    private final void processAnnotationArguments(AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) method, "method");
                    Name identifier = Name.identifier(method.getName());
                    Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(method.name)");
                    processAnnotationArgumentValue(annotationArgumentVisitor, identifier, invoke);
                    i++;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(Class<?> cls, AnnotationVisitor annotationVisitor) {
        Annotation[] declaredAnnotations;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            Intrinsics.checkReturnedValueIsNotNull((Object) annotation, "annotation");
            processAnnotation(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    public final void visitMembers(Class<?> cls, MemberVisitor memberVisitor) {
        loadMethodAnnotations(cls, memberVisitor);
        loadConstructorAnnotations(cls, memberVisitor);
        loadFieldAnnotations(cls, memberVisitor);
    }
}
