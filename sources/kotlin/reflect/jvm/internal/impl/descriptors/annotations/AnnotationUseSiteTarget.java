package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* compiled from: AnnotationUseSiteTarget.kt */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String renderName;

    private AnnotationUseSiteTarget(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                C12880j.m40222a((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.renderName = str;
    }

    public final String getRenderName() {
        return this.renderName;
    }
}
