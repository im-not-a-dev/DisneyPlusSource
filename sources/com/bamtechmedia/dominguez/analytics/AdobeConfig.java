package com.bamtechmedia.dominguez.analytics;

import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003J_\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AdobeConfig;", "", "lastModified", "", "marketingCloud", "Lcom/bamtechmedia/dominguez/analytics/MarketingCloud;", "target", "Lcom/bamtechmedia/dominguez/analytics/Target;", "audienceManager", "Lcom/bamtechmedia/dominguez/analytics/AudienceManager;", "acquisition", "Lcom/bamtechmedia/dominguez/analytics/Acquisition;", "analytics", "Lcom/bamtechmedia/dominguez/analytics/Analytics;", "messages", "", "remotes", "Lcom/bamtechmedia/dominguez/analytics/Remotes;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/analytics/MarketingCloud;Lcom/bamtechmedia/dominguez/analytics/Target;Lcom/bamtechmedia/dominguez/analytics/AudienceManager;Lcom/bamtechmedia/dominguez/analytics/Acquisition;Lcom/bamtechmedia/dominguez/analytics/Analytics;Ljava/util/List;Lcom/bamtechmedia/dominguez/analytics/Remotes;)V", "getAcquisition", "()Lcom/bamtechmedia/dominguez/analytics/Acquisition;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/analytics/Analytics;", "getAudienceManager", "()Lcom/bamtechmedia/dominguez/analytics/AudienceManager;", "getLastModified", "()Ljava/lang/String;", "getMarketingCloud", "()Lcom/bamtechmedia/dominguez/analytics/MarketingCloud;", "getMessages", "()Ljava/util/List;", "getRemotes", "()Lcom/bamtechmedia/dominguez/analytics/Remotes;", "getTarget", "()Lcom/bamtechmedia/dominguez/analytics/Target;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AdobeConfig.kt */
public final class AdobeConfig {

    /* renamed from: a */
    private final String f6503a;

    /* renamed from: b */
    private final MarketingCloud f6504b;

    /* renamed from: c */
    private final Target f6505c;

    /* renamed from: d */
    private final AudienceManager f6506d;

    /* renamed from: e */
    private final Acquisition f6507e;

    /* renamed from: f */
    private final Analytics f6508f;

    /* renamed from: g */
    private final List<String> f6509g;

    /* renamed from: h */
    private final Remotes f6510h;

    public AdobeConfig(String str, MarketingCloud marketingCloud, Target target, AudienceManager audienceManager, Acquisition acquisition, Analytics analytics, List<String> list, Remotes remotes) {
        this.f6503a = str;
        this.f6504b = marketingCloud;
        this.f6505c = target;
        this.f6506d = audienceManager;
        this.f6507e = acquisition;
        this.f6508f = analytics;
        this.f6509g = list;
        this.f6510h = remotes;
    }

    /* renamed from: a */
    public final Acquisition mo11380a() {
        return this.f6507e;
    }

    /* renamed from: b */
    public final Analytics mo11381b() {
        return this.f6508f;
    }

    /* renamed from: c */
    public final AudienceManager mo11382c() {
        return this.f6506d;
    }

    /* renamed from: d */
    public final String mo11383d() {
        return this.f6503a;
    }

    /* renamed from: e */
    public final MarketingCloud mo11384e() {
        return this.f6504b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6510h, (java.lang.Object) r3.f6510h) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.AdobeConfig
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.AdobeConfig r3 = (com.bamtechmedia.dominguez.analytics.AdobeConfig) r3
            java.lang.String r0 = r2.f6503a
            java.lang.String r1 = r3.f6503a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.MarketingCloud r0 = r2.f6504b
            com.bamtechmedia.dominguez.analytics.MarketingCloud r1 = r3.f6504b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.Target r0 = r2.f6505c
            com.bamtechmedia.dominguez.analytics.Target r1 = r3.f6505c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.AudienceManager r0 = r2.f6506d
            com.bamtechmedia.dominguez.analytics.AudienceManager r1 = r3.f6506d
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.Acquisition r0 = r2.f6507e
            com.bamtechmedia.dominguez.analytics.Acquisition r1 = r3.f6507e
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.Analytics r0 = r2.f6508f
            com.bamtechmedia.dominguez.analytics.Analytics r1 = r3.f6508f
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.List<java.lang.String> r0 = r2.f6509g
            java.util.List<java.lang.String> r1 = r3.f6509g
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.analytics.Remotes r0 = r2.f6510h
            com.bamtechmedia.dominguez.analytics.Remotes r3 = r3.f6510h
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.AdobeConfig.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final List<String> mo11386f() {
        return this.f6509g;
    }

    /* renamed from: g */
    public final Remotes mo11387g() {
        return this.f6510h;
    }

    /* renamed from: h */
    public final Target mo11388h() {
        return this.f6505c;
    }

    public int hashCode() {
        String str = this.f6503a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MarketingCloud marketingCloud = this.f6504b;
        int hashCode2 = (hashCode + (marketingCloud != null ? marketingCloud.hashCode() : 0)) * 31;
        Target target = this.f6505c;
        int hashCode3 = (hashCode2 + (target != null ? target.hashCode() : 0)) * 31;
        AudienceManager audienceManager = this.f6506d;
        int hashCode4 = (hashCode3 + (audienceManager != null ? audienceManager.hashCode() : 0)) * 31;
        Acquisition acquisition = this.f6507e;
        int hashCode5 = (hashCode4 + (acquisition != null ? acquisition.hashCode() : 0)) * 31;
        Analytics analytics = this.f6508f;
        int hashCode6 = (hashCode5 + (analytics != null ? analytics.hashCode() : 0)) * 31;
        List<String> list = this.f6509g;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        Remotes remotes = this.f6510h;
        if (remotes != null) {
            i = remotes.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdobeConfig(lastModified=");
        sb.append(this.f6503a);
        sb.append(", marketingCloud=");
        sb.append(this.f6504b);
        sb.append(", target=");
        sb.append(this.f6505c);
        sb.append(", audienceManager=");
        sb.append(this.f6506d);
        sb.append(", acquisition=");
        sb.append(this.f6507e);
        sb.append(", analytics=");
        sb.append(this.f6508f);
        sb.append(", messages=");
        sb.append(this.f6509g);
        sb.append(", remotes=");
        sb.append(this.f6510h);
        sb.append(")");
        return sb.toString();
    }
}
