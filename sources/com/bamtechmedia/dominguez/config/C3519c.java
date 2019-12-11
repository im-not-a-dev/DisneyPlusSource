package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.Market;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/AppConfigImpl;", "Lcom/bamtechmedia/dominguez/config/AppConfig;", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "appUpdateUrl", "", "getAppUpdateUrl", "()Ljava/lang/String;", "appUpdateUrls", "", "getAppUpdateUrls", "()Ljava/util/Map;", "billingUrl", "getBillingUrl", "helpUrl", "getHelpUrl", "minAppVersion", "", "getMinAppVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.c */
/* compiled from: AppConfigImpl.kt */
public final class C3519c implements C3517b {

    /* renamed from: c */
    private static final Map<String, String> f8813c;

    /* renamed from: a */
    private final C3524e f8814a;

    /* renamed from: b */
    private final BuildInfo f8815b;

    /* renamed from: com.bamtechmedia.dominguez.config.c$a */
    /* compiled from: AppConfigImpl.kt */
    private static final class C3520a {
        private C3520a() {
        }

        public /* synthetic */ C3520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3520a(null);
        StringBuilder sb = new StringBuilder();
        String str = "market_";
        sb.append(str);
        sb.append(Market.AMAZON);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(Market.GOOGLE);
        f8813c = C13173j0.m40356a(C12907r.m40244a(sb.toString(), "amzn://apps/android?p=com.disney.disneyplus"), C12907r.m40244a(sb2.toString(), "market://details?id=com.disney.disneyplus"));
    }

    public C3519c(C3524e eVar, BuildInfo buildInfo) {
        this.f8814a = eVar;
        this.f8815b = buildInfo;
    }

    /* renamed from: d */
    private final Map<String, String> m11924d() {
        Map<String, String> map = (Map) this.f8814a.mo12720d("appUpdateUrls", new String[0]);
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: a */
    public int mo12726a() {
        Integer c = this.f8814a.mo12719c("minAppVersion", new String[0]);
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public String mo12727b() {
        String str = (String) this.f8814a.mo12720d("billingUrl", new String[0]);
        return str != null ? str : "http://disneyplus.com/account/billing-details";
    }

    /* renamed from: c */
    public String mo12728c() {
        Map d = m11924d();
        StringBuilder sb = new StringBuilder();
        String str = "market_";
        sb.append(str);
        sb.append(this.f8815b.mo12779b().name());
        String str2 = (String) d.get(sb.toString());
        if (str2 == null) {
            Map<String, String> map = f8813c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f8815b.mo12779b().name());
            str2 = (String) map.get(sb2.toString());
        }
        return str2 != null ? str2 : "market://details?id=com.disney.disneyplus";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8815b, (java.lang.Object) r3.f8815b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.config.C3519c
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.config.c r3 = (com.bamtechmedia.dominguez.config.C3519c) r3
            com.bamtechmedia.dominguez.config.e r0 = r2.f8814a
            com.bamtechmedia.dominguez.config.e r1 = r3.f8814a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.BuildInfo r0 = r2.f8815b
            com.bamtechmedia.dominguez.core.BuildInfo r3 = r3.f8815b
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.config.C3519c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3524e eVar = this.f8814a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        BuildInfo buildInfo = this.f8815b;
        if (buildInfo != null) {
            i = buildInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigImpl(map=");
        sb.append(this.f8814a);
        sb.append(", buildInfo=");
        sb.append(this.f8815b);
        sb.append(")");
        return sb.toString();
    }
}
