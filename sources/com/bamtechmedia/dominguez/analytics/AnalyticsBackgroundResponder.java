package com.bamtechmedia.dominguez.analytics;

import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.core.background.BackgroundResponder;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5767a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5768b;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5769c;
import kotlin.C12907r;
import kotlin.Metadata;
import p512h.C11868a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AnalyticsBackgroundResponder;", "Lcom/bamtechmedia/dominguez/core/background/BackgroundResponder;", "adobeAnalytics", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "appPresence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "(Ldagger/Lazy;Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;)V", "getAppPresence", "()Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "processPresence", "", "presence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AnalyticsBackgroundResponder.kt */
public final class AnalyticsBackgroundResponder extends BackgroundResponder {

    /* renamed from: U */
    private final C11868a<C2348e> f6524U;

    /* renamed from: V */
    private final C5765a f6525V;

    /* renamed from: com.bamtechmedia.dominguez.analytics.AnalyticsBackgroundResponder$a */
    /* compiled from: AnalyticsBackgroundResponder.kt */
    public static final class C2333a {
        private C2333a() {
        }

        public /* synthetic */ C2333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2333a(null);
    }

    public AnalyticsBackgroundResponder(C11868a<C2348e> aVar, C5765a aVar2) {
        this.f6524U = aVar;
        this.f6525V = aVar2;
    }

    /* renamed from: a */
    public void mo11409a(C5766a aVar) {
        String str = "1";
        if (aVar instanceof C5768b) {
            C2349a.m8853a((C2348e) this.f6524U.get(), "Disney Plus : Foreground App", C13170i0.m40332a(C12907r.m40244a("events.foregroundApp", str)), false, 4, null);
            return;
        }
        String str2 = "events.backgroundApp";
        if (aVar instanceof C5767a) {
            C2349a.m8853a((C2348e) this.f6524U.get(), "Disney Plus : Background App", C13170i0.m40332a(C12907r.m40244a(str2, str)), false, 4, null);
        } else if (aVar instanceof C5769c) {
            C2349a.m8853a((C2348e) this.f6524U.get(), "Disney Plus : Background App", C13170i0.m40332a(C12907r.m40244a(str2, str)), false, 4, null);
        }
    }

    /* renamed from: b */
    public C5765a mo11410b() {
        return this.f6525V;
    }
}
