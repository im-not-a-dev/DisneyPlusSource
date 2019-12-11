package com.bamtechmedia.dominguez.analytics;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010 \u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AdobeConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/analytics/AdobeConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "acquisitionAdapter", "Lcom/bamtechmedia/dominguez/analytics/Acquisition;", "analyticsAdapter", "Lcom/bamtechmedia/dominguez/analytics/Analytics;", "audienceManagerAdapter", "Lcom/bamtechmedia/dominguez/analytics/AudienceManager;", "listOfStringAdapter", "", "", "marketingCloudAdapter", "Lcom/bamtechmedia/dominguez/analytics/MarketingCloud;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "remotesAdapter", "Lcom/bamtechmedia/dominguez/analytics/Remotes;", "stringAdapter", "targetAdapter", "Lcom/bamtechmedia/dominguez/analytics/Target;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdobeConfigJsonAdapter.kt */
public final class AdobeConfigJsonAdapter extends C11725h<AdobeConfig> {
    private final C11725h<Acquisition> acquisitionAdapter;
    private final C11725h<Analytics> analyticsAdapter;
    private final C11725h<AudienceManager> audienceManagerAdapter;
    private final C11725h<List<String>> listOfStringAdapter;
    private final C11725h<MarketingCloud> marketingCloudAdapter;
    private final C11739b options;
    private final C11725h<Remotes> remotesAdapter;
    private final C11725h<String> stringAdapter;
    private final C11725h<Target> targetAdapter;

    public AdobeConfigJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("lastModified", "marketingCloud", "target", "audienceManager", "acquisition", "analytics", "messages", "remotes");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"l…\", \"messages\", \"remotes\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "lastModified");
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ptySet(), \"lastModified\")");
        this.stringAdapter = a2;
        C11725h<MarketingCloud> a3 = vVar.mo29869a((Type) MarketingCloud.class, C13188p0.m40531a(), "marketingCloud");
        C12880j.m40222a((Object) a3, "moshi.adapter<MarketingC…ySet(), \"marketingCloud\")");
        this.marketingCloudAdapter = a3;
        C11725h<Target> a4 = vVar.mo29869a((Type) Target.class, C13188p0.m40531a(), "target");
        C12880j.m40222a((Object) a4, "moshi.adapter<Target>(Ta…ons.emptySet(), \"target\")");
        this.targetAdapter = a4;
        C11725h<AudienceManager> a5 = vVar.mo29869a((Type) AudienceManager.class, C13188p0.m40531a(), "audienceManager");
        C12880j.m40222a((Object) a5, "moshi.adapter<AudienceMa…Set(), \"audienceManager\")");
        this.audienceManagerAdapter = a5;
        C11725h<Acquisition> a6 = vVar.mo29869a((Type) Acquisition.class, C13188p0.m40531a(), "acquisition");
        C12880j.m40222a((Object) a6, "moshi.adapter<Acquisitio…mptySet(), \"acquisition\")");
        this.acquisitionAdapter = a6;
        C11725h<Analytics> a7 = vVar.mo29869a((Type) Analytics.class, C13188p0.m40531a(), "analytics");
        C12880j.m40222a((Object) a7, "moshi.adapter<Analytics>….emptySet(), \"analytics\")");
        this.analyticsAdapter = a7;
        C11725h<List<String>> a8 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), "messages");
        C12880j.m40222a((Object) a8, "moshi.adapter<List<Strin…s.emptySet(), \"messages\")");
        this.listOfStringAdapter = a8;
        C11725h<Remotes> a9 = vVar.mo29869a((Type) Remotes.class, C13188p0.m40531a(), "remotes");
        C12880j.m40222a((Object) a9, "moshi.adapter<Remotes>(R…ns.emptySet(), \"remotes\")");
        this.remotesAdapter = a9;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, AdobeConfig adobeConfig) {
        if (adobeConfig != null) {
            sVar.mo29791b();
            sVar.mo29796e("lastModified");
            this.stringAdapter.toJson(sVar, adobeConfig.mo11383d());
            sVar.mo29796e("marketingCloud");
            this.marketingCloudAdapter.toJson(sVar, adobeConfig.mo11384e());
            sVar.mo29796e("target");
            this.targetAdapter.toJson(sVar, adobeConfig.mo11388h());
            sVar.mo29796e("audienceManager");
            this.audienceManagerAdapter.toJson(sVar, adobeConfig.mo11382c());
            sVar.mo29796e("acquisition");
            this.acquisitionAdapter.toJson(sVar, adobeConfig.mo11380a());
            sVar.mo29796e("analytics");
            this.analyticsAdapter.toJson(sVar, adobeConfig.mo11381b());
            sVar.mo29796e("messages");
            this.listOfStringAdapter.toJson(sVar, adobeConfig.mo11386f());
            sVar.mo29796e("remotes");
            this.remotesAdapter.toJson(sVar, adobeConfig.mo11387g());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AdobeConfig)";
    }

    public AdobeConfig fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        MarketingCloud marketingCloud = null;
        Target target = null;
        AudienceManager audienceManager = null;
        Acquisition acquisition = null;
        Analytics analytics = null;
        List list = null;
        Remotes remotes = null;
        while (mVar.mo29770f()) {
            switch (mVar.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    String str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 != null) {
                        str = str2;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'lastModified' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    MarketingCloud marketingCloud2 = (MarketingCloud) this.marketingCloudAdapter.fromJson(mVar);
                    if (marketingCloud2 != null) {
                        marketingCloud = marketingCloud2;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'marketingCloud' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    Target target2 = (Target) this.targetAdapter.fromJson(mVar);
                    if (target2 != null) {
                        target = target2;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'target' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 3:
                    AudienceManager audienceManager2 = (AudienceManager) this.audienceManagerAdapter.fromJson(mVar);
                    if (audienceManager2 != null) {
                        audienceManager = audienceManager2;
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'audienceManager' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 4:
                    Acquisition acquisition2 = (Acquisition) this.acquisitionAdapter.fromJson(mVar);
                    if (acquisition2 != null) {
                        acquisition = acquisition2;
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'acquisition' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 5:
                    Analytics analytics2 = (Analytics) this.analyticsAdapter.fromJson(mVar);
                    if (analytics2 != null) {
                        analytics = analytics2;
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Non-null value 'analytics' was null at ");
                        sb6.append(mVar.mo29775j0());
                        throw new C11734j(sb6.toString());
                    }
                case 6:
                    List list2 = (List) this.listOfStringAdapter.fromJson(mVar);
                    if (list2 != null) {
                        list = list2;
                        break;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Non-null value 'messages' was null at ");
                        sb7.append(mVar.mo29775j0());
                        throw new C11734j(sb7.toString());
                    }
                case 7:
                    Remotes remotes2 = (Remotes) this.remotesAdapter.fromJson(mVar);
                    if (remotes2 != null) {
                        remotes = remotes2;
                        break;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Non-null value 'remotes' was null at ");
                        sb8.append(mVar.mo29775j0());
                        throw new C11734j(sb8.toString());
                    }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'lastModified' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        } else if (marketingCloud == null) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Required property 'marketingCloud' missing at ");
            sb10.append(mVar.mo29775j0());
            throw new C11734j(sb10.toString());
        } else if (target == null) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Required property 'target' missing at ");
            sb11.append(mVar.mo29775j0());
            throw new C11734j(sb11.toString());
        } else if (audienceManager == null) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Required property 'audienceManager' missing at ");
            sb12.append(mVar.mo29775j0());
            throw new C11734j(sb12.toString());
        } else if (acquisition == null) {
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Required property 'acquisition' missing at ");
            sb13.append(mVar.mo29775j0());
            throw new C11734j(sb13.toString());
        } else if (analytics == null) {
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Required property 'analytics' missing at ");
            sb14.append(mVar.mo29775j0());
            throw new C11734j(sb14.toString());
        } else if (list == null) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Required property 'messages' missing at ");
            sb15.append(mVar.mo29775j0());
            throw new C11734j(sb15.toString());
        } else if (remotes != null) {
            AdobeConfig adobeConfig = new AdobeConfig(str, marketingCloud, target, audienceManager, acquisition, analytics, list, remotes);
            return adobeConfig;
        } else {
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Required property 'remotes' missing at ");
            sb16.append(mVar.mo29775j0());
            throw new C11734j(sb16.toString());
        }
    }
}
