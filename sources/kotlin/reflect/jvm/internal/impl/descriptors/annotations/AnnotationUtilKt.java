package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.C12907r;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* compiled from: annotationUtil.kt */
public final class AnnotationUtilKt {
    private static final Name DEPRECATED_LEVEL_NAME;
    private static final Name DEPRECATED_MESSAGE_NAME;
    private static final Name DEPRECATED_REPLACE_WITH_NAME;
    private static final Name REPLACE_WITH_EXPRESSION_NAME;
    private static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name identifier = Name.identifier("message");
        C12880j.m40222a((Object) identifier, "Name.identifier(\"message\")");
        DEPRECATED_MESSAGE_NAME = identifier;
        Name identifier2 = Name.identifier("replaceWith");
        C12880j.m40222a((Object) identifier2, "Name.identifier(\"replaceWith\")");
        DEPRECATED_REPLACE_WITH_NAME = identifier2;
        Name identifier3 = Name.identifier("level");
        C12880j.m40222a((Object) identifier3, "Name.identifier(\"level\")");
        DEPRECATED_LEVEL_NAME = identifier3;
        Name identifier4 = Name.identifier("expression");
        C12880j.m40222a((Object) identifier4, "Name.identifier(\"expression\")");
        REPLACE_WITH_EXPRESSION_NAME = identifier4;
        Name identifier5 = Name.identifier("imports");
        C12880j.m40222a((Object) identifier5, "Name.identifier(\"imports\")");
        REPLACE_WITH_IMPORTS_NAME = identifier5;
    }

    public static final AnnotationDescriptor createDeprecatedAnnotation(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3) {
        FqName fqName = KotlinBuiltIns.FQ_NAMES.replaceWith;
        C12880j.m40222a((Object) fqName, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, C13173j0.m40356a(C12907r.m40244a(REPLACE_WITH_EXPRESSION_NAME, new StringValue(str2)), C12907r.m40244a(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(C13185o.m40513a(), new C12948xf14e0c1a(kotlinBuiltIns)))));
        FqName fqName2 = KotlinBuiltIns.FQ_NAMES.deprecated;
        C12880j.m40222a((Object) fqName2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        Name name = DEPRECATED_LEVEL_NAME;
        ClassId classId = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.deprecationLevel);
        C12880j.m40222a((Object) classId, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        Name identifier = Name.identifier(str3);
        C12880j.m40222a((Object) identifier, "Name.identifier(level)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, C13173j0.m40356a(C12907r.m40244a(DEPRECATED_MESSAGE_NAME, new StringValue(str)), C12907r.m40244a(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor)), C12907r.m40244a(name, new EnumValue(classId, identifier))));
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3);
    }
}
