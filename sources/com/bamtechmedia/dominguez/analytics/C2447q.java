package com.bamtechmedia.dominguez.analytics;

import android.content.Context;
import com.appboy.C1440a;
import com.appboy.C1477e;
import com.appboy.p025o.C1502i;
import com.appboy.p030r.p032p.C1551a;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J$\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001c\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J \u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/BrazeAnalyticsImpl;", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "context", "Landroid/content/Context;", "activePageTracker", "Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;", "config", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;)V", "appBoy", "Lcom/appboy/Appboy;", "kotlin.jvm.PlatformType", "getAppBoy", "()Lcom/appboy/Appboy;", "<set-?>", "", "isKidsProfile", "()Z", "createAppboyProperties", "Lcom/appboy/models/outgoing/AppboyProperties;", "extras", "", "", "setUserAttributes", "", "user", "Lcom/appboy/AppboyUser;", "language", "trackAction", "action", "trackPageLoad", "trackProfileChange", "profileId", "updatePushSettings", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.q */
/* compiled from: BrazeAnalyticsImpl.kt */
public final class C2447q implements C2436p {

    /* renamed from: a */
    private boolean f6739a;

    /* renamed from: b */
    private final Context f6740b;

    /* renamed from: c */
    private final C2336b f6741c;

    /* renamed from: d */
    private final C2364i f6742d;

    /* renamed from: com.bamtechmedia.dominguez.analytics.q$a */
    /* compiled from: BrazeAnalyticsImpl.kt */
    public static final class C2448a {
        private C2448a() {
        }

        public /* synthetic */ C2448a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2448a(null);
    }

    public C2447q(Context context, C2336b bVar, C2364i iVar) {
        this.f6740b = context;
        this.f6741c = bVar;
        this.f6742d = iVar;
    }

    /* renamed from: b */
    private final C1440a m9012b() {
        return C1440a.m6921c(this.f6740b);
    }

    /* renamed from: a */
    public final boolean mo11575a() {
        return this.f6739a;
    }

    /* renamed from: b */
    private final C1551a m9013b(Map<String, String> map) {
        C1551a aVar = new C1551a();
        for (Entry entry : map.entrySet()) {
            aVar.mo6892a((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo11568a(Map<String, String> map) {
        if (!this.f6739a) {
            m9012b().mo6564a(this.f6741c.mo11445a(), m9013b(map));
        }
    }

    /* renamed from: a */
    public void mo11567a(String str, Map<String, String> map) {
        if (!this.f6739a) {
            String a = this.f6741c.mo11446a(str);
            if (!this.f6742d.mo11490a("braze", a)) {
                m9012b().mo6564a(a, m9013b(map));
            }
        }
    }

    /* renamed from: a */
    public void mo11566a(String str, String str2, boolean z) {
        this.f6739a = z;
        C1440a b = m9012b();
        String str3 = "appBoy";
        C12880j.m40222a((Object) b, str3);
        C1477e d = b.mo6581d();
        boolean z2 = true;
        if (d != null && !(!C12880j.m40224a((Object) d.mo6636a(), (Object) str))) {
            z2 = false;
        }
        if (z2) {
            m9012b().mo6563a(str);
        }
        m9011a(z);
        C1440a b2 = m9012b();
        C12880j.m40222a((Object) b2, str3);
        C1477e d2 = b2.mo6581d();
        if (d2 != null && !z) {
            C12880j.m40222a((Object) d2, "it");
            m9010a(d2, str2);
        }
        m9012b().mo6588j();
    }

    /* renamed from: a */
    private final void m9010a(C1477e eVar, String str) {
        eVar.mo6656g(str);
        eVar.mo6652c("appLanguage", str);
    }

    /* renamed from: a */
    private final void m9011a(boolean z) {
        C1502i iVar;
        C1440a b = m9012b();
        C12880j.m40222a((Object) b, "appBoy");
        C1477e d = b.mo6581d();
        if (d != null) {
            if (z) {
                iVar = C1502i.UNSUBSCRIBED;
            } else {
                iVar = C1502i.SUBSCRIBED;
            }
            d.mo6647b(iVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
