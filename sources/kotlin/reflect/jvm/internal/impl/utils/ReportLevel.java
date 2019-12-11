package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: Jsr305State.kt */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final Companion Companion = null;
    private final String description;

    /* compiled from: Jsr305State.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    private ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
