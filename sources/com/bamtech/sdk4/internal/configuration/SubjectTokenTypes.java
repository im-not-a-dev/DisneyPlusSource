package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/SubjectTokenTypes;", "", "map", "", "", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "get", "key", "toString", "Companion", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenServiceConfiguration.kt */
public final class SubjectTokenTypes {
    public static final String ACCOUNT = "account";
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final Map<String, String> DEFAULT;
    public static final String DEVICE = "device";
    public static final String PARTNER = "partner";
    public static final String TEMPORARY = "temporary";
    private final Map<String, String> map;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/SubjectTokenTypes$Companion;", "", "()V", "ACCOUNT", "", "DEFAULT", "", "getDEFAULT", "()Ljava/util/Map;", "DEVICE", "PARTNER", "TEMPORARY", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TokenServiceConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Map<String, String> getDEFAULT() {
            return SubjectTokenTypes.DEFAULT;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = "urn:ietf:params:oauth:token-type:jwt";
        DEFAULT = C13173j0.m40356a(C12907r.m40244a(DEVICE, "urn:bamtech:params:oauth:token-type:device"), C12907r.m40244a(ACCOUNT, str), C12907r.m40244a(PARTNER, str), C12907r.m40244a(TEMPORARY, str));
    }

    public SubjectTokenTypes() {
        this(null, 1, null);
    }

    public SubjectTokenTypes(Map<String, String> map2) {
        this.map = map2;
    }

    public final String get(String str) {
        String str2 = (String) this.map.get(str);
        if (str2 == null) {
            str2 = (String) DEFAULT.get(str);
        }
        return str2 != null ? str2 : "urn:ietf:params:oauth:token-type:jwt";
    }

    public final Map<String, String> getMap() {
        return this.map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubjectTokenTypes(map=");
        sb.append(this.map);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ SubjectTokenTypes(Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            map2 = C13173j0.m40350a();
        }
        this(map2);
    }
}
