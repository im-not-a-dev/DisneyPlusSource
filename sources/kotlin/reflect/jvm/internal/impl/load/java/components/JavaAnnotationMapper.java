package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.C12907r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationMapper {
    private static final Name DEPRECATED_ANNOTATION_MESSAGE;
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();
    private static final FqName JAVA_DEPRECATED_FQ_NAME = new FqName(Deprecated.class.getCanonicalName());
    private static final FqName JAVA_DOCUMENTED_FQ_NAME = new FqName(Documented.class.getCanonicalName());
    private static final FqName JAVA_REPEATABLE_FQ_NAME = new FqName("java.lang.annotation.Repeatable");
    private static final FqName JAVA_RETENTION_FQ_NAME = new FqName(Retention.class.getCanonicalName());
    private static final FqName JAVA_TARGET_FQ_NAME = new FqName(Target.class.getCanonicalName());
    private static final Name RETENTION_ANNOTATION_VALUE;
    private static final Name TARGET_ANNOTATION_ALLOWED_TARGETS;
    private static final Map<FqName, FqName> javaToKotlinNameMap = C13173j0.m40356a(C12907r.m40244a(JAVA_TARGET_FQ_NAME, KotlinBuiltIns.FQ_NAMES.target), C12907r.m40244a(JAVA_RETENTION_FQ_NAME, KotlinBuiltIns.FQ_NAMES.retention), C12907r.m40244a(JAVA_DEPRECATED_FQ_NAME, KotlinBuiltIns.FQ_NAMES.deprecated), C12907r.m40244a(JAVA_REPEATABLE_FQ_NAME, KotlinBuiltIns.FQ_NAMES.repeatable), C12907r.m40244a(JAVA_DOCUMENTED_FQ_NAME, KotlinBuiltIns.FQ_NAMES.mustBeDocumented));
    private static final Map<FqName, FqName> kotlinToJavaNameMap = C13173j0.m40356a(C12907r.m40244a(KotlinBuiltIns.FQ_NAMES.target, JAVA_TARGET_FQ_NAME), C12907r.m40244a(KotlinBuiltIns.FQ_NAMES.retention, JAVA_RETENTION_FQ_NAME), C12907r.m40244a(KotlinBuiltIns.FQ_NAMES.repeatable, JAVA_REPEATABLE_FQ_NAME), C12907r.m40244a(KotlinBuiltIns.FQ_NAMES.mustBeDocumented, JAVA_DOCUMENTED_FQ_NAME));

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    static {
        Name identifier = Name.identifier("message");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(\"message\")");
        DEPRECATED_ANNOTATION_MESSAGE = identifier;
        Name identifier2 = Name.identifier("allowedTargets");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier2, "Name.identifier(\"allowedTargets\")");
        TARGET_ANNOTATION_ALLOWED_TARGETS = identifier2;
        Name identifier3 = Name.identifier("value");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier3, "Name.identifier(\"value\")");
        RETENTION_ANNOTATION_VALUE = identifier3;
    }

    private JavaAnnotationMapper() {
    }

    public final AnnotationDescriptor findMappedJavaAnnotation(FqName fqName, JavaAnnotationOwner javaAnnotationOwner, LazyJavaResolverContext lazyJavaResolverContext) {
        if (Intrinsics.areEqual((Object) fqName, (Object) KotlinBuiltIns.FQ_NAMES.deprecated)) {
            JavaAnnotation findAnnotation = javaAnnotationOwner.findAnnotation(JAVA_DEPRECATED_FQ_NAME);
            if (findAnnotation != null || javaAnnotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(findAnnotation, lazyJavaResolverContext);
            }
        }
        FqName fqName2 = (FqName) kotlinToJavaNameMap.get(fqName);
        AnnotationDescriptor annotationDescriptor = null;
        if (fqName2 != null) {
            JavaAnnotation findAnnotation2 = javaAnnotationOwner.findAnnotation(fqName2);
            if (findAnnotation2 != null) {
                annotationDescriptor = INSTANCE.mapOrResolveJavaAnnotation(findAnnotation2, lazyJavaResolverContext);
            }
        }
        return annotationDescriptor;
    }

    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    public final AnnotationDescriptor mapOrResolveJavaAnnotation(JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassId classId = javaAnnotation.getClassId();
        if (Intrinsics.areEqual((Object) classId, (Object) ClassId.topLevel(JAVA_TARGET_FQ_NAME))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.areEqual((Object) classId, (Object) ClassId.topLevel(JAVA_RETENTION_FQ_NAME))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.areEqual((Object) classId, (Object) ClassId.topLevel(JAVA_REPEATABLE_FQ_NAME))) {
            FqName fqName = KotlinBuiltIns.FQ_NAMES.repeatable;
            Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, fqName);
        } else if (Intrinsics.areEqual((Object) classId, (Object) ClassId.topLevel(JAVA_DOCUMENTED_FQ_NAME))) {
            FqName fqName2 = KotlinBuiltIns.FQ_NAMES.mustBeDocumented;
            Intrinsics.checkReturnedValueIsNotNull((Object) fqName2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, fqName2);
        } else if (Intrinsics.areEqual((Object) classId, (Object) ClassId.topLevel(JAVA_DEPRECATED_FQ_NAME))) {
            return null;
        } else {
            return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation);
        }
    }
}
