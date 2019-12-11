package com.bamtechmedia.dominguez.search;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2476z;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0002J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;)V", "extraMap", "", "", "query", "getExtraMap", "getExtraMap$search_release", "trackCancelClick", "", "trackCancelClick$search_release", "trackNoResult", "trackNoResult$search_release", "trackRecentSearchClick", "index", "", "trackRecentSearchClick$search_release", "trackSearchLoaded", "searchStartTime", "", "trackSearchLoaded$search_release", "trackStartTyping", "trackStartTyping$search_release", "trackStopTyping", "trackStopTyping$search_release", "Companion", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.t */
/* compiled from: SearchAnalytics.kt */
public final class C8060t {

    /* renamed from: a */
    private final C2476z f17255a;

    /* renamed from: com.bamtechmedia.dominguez.search.t$a */
    /* compiled from: SearchAnalytics.kt */
    public static final class C8061a {
        private C8061a() {
        }

        public /* synthetic */ C8061a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8061a(null);
    }

    public C8060t(C2348e eVar, C2476z zVar) {
        this.f17255a = zVar;
    }

    /* renamed from: a */
    public final void mo21041a(String str, long j) {
        DateTime now = DateTime.now();
        C12880j.m40222a((Object) now, "DateTime.now()");
        long millis = now.getMillis() - j;
        Pair[] pairArr = {C12907r.m40244a("fullLoadTime", String.valueOf(millis)), C12907r.m40244a("searchKeyword", str)};
        String str2 = "Search and Explore : Search Start";
        this.f17255a.mo11536a(str2, GlimpseEvent.Companion.getSearchViewLoaded(), C13173j0.m40356a(pairArr));
    }
}
