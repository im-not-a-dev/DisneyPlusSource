package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;

/* compiled from: KotlinTarget.kt */
public enum KotlinTarget {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<KotlinTarget> ALL_TARGET_SET = null;
    public static final Companion Companion = null;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET = null;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING = null;
    private static final HashMap<String, KotlinTarget> map = null;
    private final String description;
    private final boolean isDefault;

    /* compiled from: KotlinTarget.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        KotlinTarget[] values;
        Companion = new Companion(null);
        map = new HashMap<>();
        for (KotlinTarget kotlinTarget : values()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values2) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = C13199w.m40609t(arrayList);
        ALL_TARGET_SET = C13174k.m40414n(values());
        USE_SITE_MAPPING = C13173j0.m40356a(C12907r.m40244a(AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), C12907r.m40244a(AnnotationUseSiteTarget.FIELD, FIELD), C12907r.m40244a(AnnotationUseSiteTarget.PROPERTY, PROPERTY), C12907r.m40244a(AnnotationUseSiteTarget.FILE, FILE), C12907r.m40244a(AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), C12907r.m40244a(AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), C12907r.m40244a(AnnotationUseSiteTarget.RECEIVER, VALUE_PARAMETER), C12907r.m40244a(AnnotationUseSiteTarget.SETTER_PARAMETER, VALUE_PARAMETER), C12907r.m40244a(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, FIELD));
    }

    private KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }
}
