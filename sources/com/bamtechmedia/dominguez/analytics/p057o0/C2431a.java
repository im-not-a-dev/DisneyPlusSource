package com.bamtechmedia.dominguez.analytics.p057o0;

import com.bamtechmedia.dominguez.analytics.AdobeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import p163g.p164a.p165a.C4705m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/globalvalues/AdobeValues;", "", "adobeConfig", "Lcom/bamtechmedia/dominguez/analytics/AdobeConfig;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeConfig;)V", "adobeMap", "", "", "getAdobeMap", "()Ljava/util/Map;", "adobeRsidValue", "appIdValue", "rsidNameValue", "sdkVersionValue", "kotlin.jvm.PlatformType", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.o0.a */
/* compiled from: AdobeValues.kt */
public final class C2431a {

    /* renamed from: e */
    private static final Map<String, String> f6693e = C13173j0.m40356a(C12907r.m40244a("wdgdsvodandroiddev", "Disney SVOD Android - Dev"), C12907r.m40244a("wdgdsvodandroid", "Disney SVOD Android - Prod"));

    /* renamed from: a */
    private final String f6694a;

    /* renamed from: b */
    private final String f6695b;

    /* renamed from: c */
    private final String f6696c;

    /* renamed from: d */
    private final String f6697d;

    /* renamed from: com.bamtechmedia.dominguez.analytics.o0.a$a */
    /* compiled from: AdobeValues.kt */
    public static final class C2432a {
        private C2432a() {
        }

        public /* synthetic */ C2432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    static {
        new C2432a(null);
    }

    public C2431a(AdobeConfig adobeConfig) {
        this.f6694a = adobeConfig.mo11381b().mo11403i();
        this.f6695b = adobeConfig.mo11380a().mo11371a();
        List<String> a = C12833x.m40142a((CharSequence) this.f6694a, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (String str : a) {
            arrayList.add((String) f6693e.get(str));
        }
        this.f6696c = C13199w.m40559a(arrayList, ", ", null, null, 0, null, null, 62, null);
        this.f6697d = C4705m.m16369a();
    }

    /* renamed from: a */
    public final Map<String, String> mo11563a() {
        return C13173j0.m40356a(C12907r.m40244a("s.visitorId", "D=s_vi"), C12907r.m40244a("adobeRsid", this.f6694a), C12907r.m40244a("adobeRsidName", this.f6696c), C12907r.m40244a("appID", this.f6695b), C12907r.m40244a("adobeSdkVersion", this.f6697d));
    }
}
