package com.bamtechmedia.dominguez.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001:\u0003%&'B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB%\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\rHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/BuildInfo;", "", "environmentFlavor", "", "marketFlavor", "platform", "Lcom/bamtechmedia/dominguez/core/BuildInfo$Platform;", "versionCode", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/BuildInfo$Platform;I)V", "environment", "Lcom/bamtechmedia/dominguez/core/BuildInfo$Environment;", "market", "Lcom/bamtechmedia/dominguez/core/BuildInfo$Market;", "(Lcom/bamtechmedia/dominguez/core/BuildInfo$Environment;Lcom/bamtechmedia/dominguez/core/BuildInfo$Market;Lcom/bamtechmedia/dominguez/core/BuildInfo$Platform;I)V", "getEnvironment", "()Lcom/bamtechmedia/dominguez/core/BuildInfo$Environment;", "isAdmAvailable", "", "()Z", "isDevDebugBuild", "isFcmAvailable", "getMarket", "()Lcom/bamtechmedia/dominguez/core/BuildInfo$Market;", "getPlatform", "()Lcom/bamtechmedia/dominguez/core/BuildInfo$Platform;", "getVersionCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Environment", "Market", "Platform", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BuildInfo.kt */
public final class BuildInfo {

    /* renamed from: a */
    private final Environment f8916a;

    /* renamed from: b */
    private final Market f8917b;

    /* renamed from: c */
    private final C3584a f8918c;

    /* renamed from: d */
    private final int f8919d;

    @Keep
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/BuildInfo$Environment;", "", "sdk", "Lcom/bamtech/sdk4/configuration/Environment;", "appConfigPath", "", "isLocal", "", "(Ljava/lang/String;ILcom/bamtech/sdk4/configuration/Environment;Ljava/lang/String;Z)V", "getAppConfigPath", "()Ljava/lang/String;", "()Z", "getSdk", "()Lcom/bamtech/sdk4/configuration/Environment;", "DEV", "EDITORIAL", "QA", "LOCAL", "PROD", "MOCK", "RAPID", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BuildInfo.kt */
    public enum Environment {
        DEV(com.bamtech.sdk4.configuration.Environment.DEV, "dev", false, 4, null),
        EDITORIAL(com.bamtech.sdk4.configuration.Environment.PROD, "prod", false, 4, null),
        QA(com.bamtech.sdk4.configuration.Environment.QA, "qa", false, 4, null),
        LOCAL(com.bamtech.sdk4.configuration.Environment.QA, "qa", true),
        PROD(com.bamtech.sdk4.configuration.Environment.PROD, "prod", false, 4, null),
        MOCK(com.bamtech.sdk4.configuration.Environment.MOCK, "dev", false, 4, null),
        RAPID(com.bamtech.sdk4.configuration.Environment.RAPID, "dev", false, 4, null);
        
        private final String appConfigPath;
        private final boolean isLocal;
        private final com.bamtech.sdk4.configuration.Environment sdk;

        private Environment(com.bamtech.sdk4.configuration.Environment environment, String str, boolean z) {
            this.sdk = environment;
            this.appConfigPath = str;
            this.isLocal = z;
        }

        public final String getAppConfigPath() {
            return this.appConfigPath;
        }

        public final com.bamtech.sdk4.configuration.Environment getSdk() {
            return this.sdk;
        }

        public final boolean isLocal() {
            return this.isLocal;
        }
    }

    @Keep
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/BuildInfo$Market;", "", "(Ljava/lang/String;I)V", "GOOGLE", "AMAZON", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BuildInfo.kt */
    public enum Market {
        GOOGLE,
        AMAZON
    }

    /* renamed from: com.bamtechmedia.dominguez.core.BuildInfo$a */
    /* compiled from: BuildInfo.kt */
    public enum C3584a {
        TV("android-tv");
        

        /* renamed from: c */
        private final String f8923c;

        private C3584a(String str) {
            this.f8923c = str;
        }

        /* renamed from: a */
        public final String mo12791a() {
            return this.f8923c;
        }
    }

    public BuildInfo(Environment environment, Market market, C3584a aVar, int i) {
        this.f8916a = environment;
        this.f8917b = market;
        this.f8918c = aVar;
        this.f8919d = i;
    }

    /* renamed from: a */
    public final Environment mo12778a() {
        return this.f8916a;
    }

    /* renamed from: b */
    public final Market mo12779b() {
        return this.f8917b;
    }

    /* renamed from: c */
    public final C3584a mo12780c() {
        return this.f8918c;
    }

    /* renamed from: d */
    public final int mo12781d() {
        return this.f8919d;
    }

    /* renamed from: e */
    public final boolean mo12782e() {
        return this.f8917b == Market.AMAZON;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BuildInfo) {
                BuildInfo buildInfo = (BuildInfo) obj;
                if (C12880j.m40224a((Object) this.f8916a, (Object) buildInfo.f8916a) && C12880j.m40224a((Object) this.f8917b, (Object) buildInfo.f8917b) && C12880j.m40224a((Object) this.f8918c, (Object) buildInfo.f8918c)) {
                    if (this.f8919d == buildInfo.f8919d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo12784f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo12785g() {
        return this.f8917b == Market.GOOGLE;
    }

    public int hashCode() {
        Environment environment = this.f8916a;
        int i = 0;
        int hashCode = (environment != null ? environment.hashCode() : 0) * 31;
        Market market = this.f8917b;
        int hashCode2 = (hashCode + (market != null ? market.hashCode() : 0)) * 31;
        C3584a aVar = this.f8918c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f8919d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BuildInfo(environment=");
        sb.append(this.f8916a);
        sb.append(", market=");
        sb.append(this.f8917b);
        sb.append(", platform=");
        sb.append(this.f8918c);
        sb.append(", versionCode=");
        sb.append(this.f8919d);
        sb.append(")");
        return sb.toString();
    }

    public BuildInfo(String str, String str2, C3584a aVar, int i) {
        String upperCase = str.toUpperCase();
        String str3 = "(this as java.lang.String).toUpperCase()";
        C12880j.m40222a((Object) upperCase, str3);
        Environment valueOf = Environment.valueOf(upperCase);
        String upperCase2 = str2.toUpperCase();
        C12880j.m40222a((Object) upperCase2, str3);
        this(valueOf, Market.valueOf(upperCase2), aVar, i);
    }
}
