package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();
    private static final Map<String, KotlinRetention> retentionNameList = C13173j0.m40356a(C12907r.m40244a("RUNTIME", KotlinRetention.RUNTIME), C12907r.m40244a("CLASS", KotlinRetention.BINARY), C12907r.m40244a("SOURCE", KotlinRetention.SOURCE));
    private static final Map<String, EnumSet<KotlinTarget>> targetNameLists = C13173j0.m40356a(C12907r.m40244a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), C12907r.m40244a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), C12907r.m40244a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), C12907r.m40244a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), C12907r.m40244a("FIELD", EnumSet.of(KotlinTarget.FIELD)), C12907r.m40244a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), C12907r.m40244a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), C12907r.m40244a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), C12907r.m40244a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), C12907r.m40244a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    private JavaAnnotationTargetMapper() {
    }

    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(JavaAnnotationArgument javaAnnotationArgument) {
        if (!(javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument)) {
            javaAnnotationArgument = null;
        }
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
        if (javaEnumValueAnnotationArgument == null) {
            return null;
        }
        Map<String, KotlinRetention> map = retentionNameList;
        Name entryName = javaEnumValueAnnotationArgument.getEntryName();
        KotlinRetention kotlinRetention = (KotlinRetention) map.get(entryName != null ? entryName.asString() : null);
        if (kotlinRetention == null) {
            return null;
        }
        ClassId classId = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.annotationRetention);
        C12880j.m40222a((Object) classId, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
        Name identifier = Name.identifier(kotlinRetention.name());
        C12880j.m40222a((Object) identifier, "Name.identifier(retention.name)");
        return new EnumValue(classId, identifier);
    }

    public final Set<KotlinTarget> mapJavaTargetArgumentByName(String str) {
        EnumSet enumSet = (EnumSet) targetNameLists.get(str);
        return enumSet != null ? enumSet : C13188p0.m40531a();
    }

    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(List<? extends JavaAnnotationArgument> list) {
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(next);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList<>();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            C13196t.m40545a((Collection) arrayList2, (Iterable) javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classId = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.annotationTarget);
            C12880j.m40222a((Object) classId, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            Name identifier = Name.identifier(kotlinTarget.name());
            C12880j.m40222a((Object) identifier, "Name.identifier(kotlinTarget.name)");
            arrayList3.add(new EnumValue(classId, identifier));
        }
        return new ArrayValue(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.INSTANCE);
    }
}
