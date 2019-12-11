package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3628c;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.offline.C6240b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001cJ\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b J\u001d\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020\u0012H\u0000¢\u0006\u0002\b$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;", "", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "contentClicksTransformations", "Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;", "ioThread", "Lio/reactivex/Scheduler;", "contentLocationProvider", "Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;)V", "getTimerType", "", "timerEnabled", "", "trackPlaybackSelected", "", "contentId", "action", "analyticsExtras", "", "trackSeeAllEpisodes", "currentPlayhead", "", "trackSeeAllEpisodes$playback_release", "trackUpNextLoad", "trackUpNextLoad$playback_release", "trackUpNextPlayNext", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "trackUpNextPlayNext$playback_release", "trackUpNextPlayNextAuto", "trackUpNextPlayNextAuto$playback_release", "trackUpNextPlayNextAutoBackClick", "trackUpNextPlayNextAutoBackClick$playback_release", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.j.j */
/* compiled from: UpNextAnalytics.kt */
public final class C6410j {

    /* renamed from: a */
    private final C2348e f14536a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2476z f14537b;

    /* renamed from: c */
    private final C3628c f14538c;

    /* renamed from: d */
    private final C11969r f14539d;

    /* renamed from: e */
    private final C6240b f14540e;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.j$a */
    /* compiled from: UpNextAnalytics.kt */
    public static final class C6411a {
        private C6411a() {
        }

        public /* synthetic */ C6411a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.j$b */
    /* compiled from: UpNextAnalytics.kt */
    static final class C6412b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ Map f14541U;

        /* renamed from: V */
        final /* synthetic */ String f14542V;

        /* renamed from: c */
        final /* synthetic */ C6410j f14543c;

        C6412b(C6410j jVar, Map map, String str) {
            this.f14543c = jVar;
            this.f14541U = map;
            this.f14542V = str;
        }

        /* renamed from: a */
        public final void mo19059a(String str) {
            this.f14543c.f14537b.mo11536a(this.f14542V, GlimpseEvent.Companion.getPlaybackSelected(), C13173j0.m40354a(this.f14541U, C12907r.m40244a("mediaSource", str)));
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo19059a((String) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6411a(null);
    }

    public C6410j(C2348e eVar, C2476z zVar, C3628c cVar, C11969r rVar, C6240b bVar) {
        this.f14536a = eVar;
        this.f14537b = zVar;
        this.f14538c = cVar;
        this.f14539d = rVar;
        this.f14540e = bVar;
    }

    /* renamed from: a */
    private final String m20061a(boolean z) {
        return z ? "timer" : "no timer";
    }

    /* renamed from: b */
    public final void mo19058b(C3693o oVar, boolean z) {
        C2349a.m8853a(this.f14536a, "Video Player - Up Next : Play Next Auto", C13170i0.m40332a(C12907r.m40244a("videoUpNextStatus", m20061a(z))), false, 4, null);
        Map b = this.f14538c.mo13258b(oVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            boolean z2 = false;
            if (C12833x.m40154a((CharSequence) str, (CharSequence) "contentId", false, 2, (Object) null) || C12833x.m40154a((CharSequence) str, (CharSequence) "mediaId", false, 2, (Object) null)) {
                z2 = true;
            }
            if (z2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m20062a(oVar.mo12903f(), "", C13173j0.m40354a((Map) linkedHashMap, C12907r.m40244a("playbackIntent", "autoAdvance")));
    }

    /* renamed from: a */
    public final void mo19057a(C3693o oVar, boolean z) {
        C2349a.m8853a(this.f14536a, "Video Player - Up Next : Play Next Episode Click", C13170i0.m40332a(C12907r.m40244a("videoUpNextStatus", m20061a(z))), false, 4, null);
        Map b = this.f14538c.mo13258b(oVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            boolean z2 = false;
            if (C12833x.m40154a((CharSequence) str, (CharSequence) "contentId", false, 2, (Object) null) || C12833x.m40154a((CharSequence) str, (CharSequence) "mediaId", false, 2, (Object) null)) {
                z2 = true;
            }
            if (z2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m20062a(oVar.mo12903f(), "Video Player - Up Next : Play Next Episode Click", C13173j0.m40354a((Map) linkedHashMap, C12907r.m40244a("playbackIntent", "userAction")));
    }

    /* renamed from: a */
    private final void m20062a(String str, String str2, Map<String, String> map) {
        Single g = this.f14540e.mo18834a(str).mo30220b(this.f14539d).mo30233g(new C6412b(this, map, str2));
        C12880j.m40222a((Object) g, "contentLocationProvider.…mpseExtras)\n            }");
        C5826e0.m18824a(g);
    }
}
