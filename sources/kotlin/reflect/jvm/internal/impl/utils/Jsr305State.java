package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

/* compiled from: Jsr305State.kt */
public final class Jsr305State {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(Jsr305State.class), "description", "getDescription()[Ljava/lang/String;"))};
    public static final Companion Companion = new Companion(null);
    public static final Jsr305State DEFAULT;
    public static final Jsr305State DISABLED;
    public static final Jsr305State STRICT;
    private final Lazy description$delegate;
    private final boolean enableCompatqualCheckerFrameworkAnnotations;
    private final ReportLevel global;
    private final ReportLevel migration;
    private final Map<String, ReportLevel> user;

    /* compiled from: Jsr305State.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Jsr305State jsr305State = new Jsr305State(ReportLevel.WARN, null, C13173j0.m40350a(), false, 8, null);
        DEFAULT = jsr305State;
        ReportLevel reportLevel = ReportLevel.IGNORE;
        Jsr305State jsr305State2 = new Jsr305State(reportLevel, reportLevel, C13173j0.m40350a(), false, 8, null);
        DISABLED = jsr305State2;
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        Jsr305State jsr305State3 = new Jsr305State(reportLevel2, reportLevel2, C13173j0.m40350a(), false, 8, null);
        STRICT = jsr305State3;
    }

    public Jsr305State(ReportLevel reportLevel, ReportLevel reportLevel2, Map<String, ? extends ReportLevel> map, boolean z) {
        this.global = reportLevel;
        this.migration = reportLevel2;
        this.user = map;
        this.enableCompatqualCheckerFrameworkAnnotations = z;
        this.description$delegate = C12763i.m39921a(new Jsr305State$description$2(this));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jsr305State) {
                Jsr305State jsr305State = (Jsr305State) obj;
                if (C12880j.m40224a((Object) this.global, (Object) jsr305State.global) && C12880j.m40224a((Object) this.migration, (Object) jsr305State.migration) && C12880j.m40224a((Object) this.user, (Object) jsr305State.user)) {
                    if (this.enableCompatqualCheckerFrameworkAnnotations == jsr305State.enableCompatqualCheckerFrameworkAnnotations) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getDisabled() {
        return this == DISABLED;
    }

    public final boolean getEnableCompatqualCheckerFrameworkAnnotations() {
        return this.enableCompatqualCheckerFrameworkAnnotations;
    }

    public final ReportLevel getGlobal() {
        return this.global;
    }

    public final ReportLevel getMigration() {
        return this.migration;
    }

    public final Map<String, ReportLevel> getUser() {
        return this.user;
    }

    public int hashCode() {
        ReportLevel reportLevel = this.global;
        int i = 0;
        int hashCode = (reportLevel != null ? reportLevel.hashCode() : 0) * 31;
        ReportLevel reportLevel2 = this.migration;
        int hashCode2 = (hashCode + (reportLevel2 != null ? reportLevel2.hashCode() : 0)) * 31;
        Map<String, ReportLevel> map = this.user;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.enableCompatqualCheckerFrameworkAnnotations;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jsr305State(global=");
        sb.append(this.global);
        sb.append(", migration=");
        sb.append(this.migration);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", enableCompatqualCheckerFrameworkAnnotations=");
        sb.append(this.enableCompatqualCheckerFrameworkAnnotations);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Jsr305State(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            z = true;
        }
        this(reportLevel, reportLevel2, map, z);
    }
}
