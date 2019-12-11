package com.bamtechmedia.dominguez.collections;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtech.sdk4.useractivity.GlimpseEvent.Custom;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.C2476z.C2477a;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3628c;
import com.bamtechmedia.dominguez.core.content.assets.CollectionAsset;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.bamtechmedia.dominguez.offline.C6240b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ,\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J,\u0010\u001e\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0002J$\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020\u0013H\u0016J,\u0010*\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0013H\u0016J$\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00132\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J \u0010/\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016J>\u00102\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001c\u001a\u0004\u0018\u0001032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u00105\u001a\u000206H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00068"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionAnalyticsImpl;", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "contentClicksTransformations", "Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;", "ioThread", "Lio/reactivex/Scheduler;", "contentLocationProvider", "Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;)V", "backgroundPlaybackStart", "", "playbackSelectedExtras", "", "", "getPlaybackSelectedExtras", "(Ljava/util/Map;)Ljava/util/Map;", "addCollectionExtraValues", "", "extrasMap", "", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAsset;", "addPlayableExtraValues", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "createCommonExtrasMap", "adapterPosition", "", "scrollDirection", "firstItemPos", "prevFirstItemPos", "trackBackgroundPlaybackExit", "mediaTitle", "videoUri", "playbackIntent", "trackBackgroundPlaybackStart", "playbackStartupTime", "trackPlaybackSelected", "contentId", "analyticsExtras", "trackRowSwipe", "previousFirstItemPos", "newFirstItemPos", "trackTileClick", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "optionalExtraMap", "startPlayback", "", "Companion", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.g */
/* compiled from: CollectionAnalyticsImpl.kt */
public final class C3324g implements C3320f {

    /* renamed from: b */
    private long f8374b;

    /* renamed from: c */
    private final C2348e f8375c;

    /* renamed from: d */
    private final C2436p f8376d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2476z f8377e;

    /* renamed from: f */
    private final C3628c f8378f;

    /* renamed from: g */
    private final C11969r f8379g;

    /* renamed from: h */
    private final C6240b f8380h;

    /* renamed from: com.bamtechmedia.dominguez.collections.g$a */
    /* compiled from: CollectionAnalyticsImpl.kt */
    public static final class C3325a {
        private C3325a() {
        }

        public /* synthetic */ C3325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.g$b */
    /* compiled from: CollectionAnalyticsImpl.kt */
    static final class C3326b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ Map f8381U;

        /* renamed from: c */
        final /* synthetic */ C3324g f8382c;

        C3326b(C3324g gVar, Map map) {
            this.f8382c = gVar;
            this.f8381U = map;
        }

        /* renamed from: a */
        public final void mo12381a(String str) {
            C2477a.m9078a(this.f8382c.f8377e, null, GlimpseEvent.Companion.getPlaybackSelected(), C13173j0.m40355a(this.f8382c.m11441a(this.f8381U), new Pair[]{C12907r.m40244a("playbackIntent", "userAction"), C12907r.m40244a("mediaSource", str)}), 1, null);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo12381a((String) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C3325a(null);
    }

    public C3324g(C2348e eVar, C2436p pVar, C2476z zVar, C3628c cVar, C11969r rVar, C6240b bVar) {
        this.f8375c = eVar;
        this.f8376d = pVar;
        this.f8377e = zVar;
        this.f8378f = cVar;
        this.f8379g = rVar;
        this.f8380h = bVar;
    }

    /* renamed from: a */
    private final String m11438a(int i, int i2) {
        return i > i2 ? "Left" : i < i2 ? "Right" : "NA";
    }

    /* renamed from: a */
    public void mo12371a(C3444j jVar, int i, int i2) {
        if (!C3320f.f8371a.mo12375a().getAndSet(false)) {
            String a = m11438a(i, i2);
            String str = "NA";
            if (!Intrinsics.areEqual((Object) a, (Object) str)) {
                String valueOf = String.valueOf(jVar.mo12618a().mo12424c());
                String f = C12832w.m40125f(jVar.mo12618a().mo12422a());
                String b = jVar.mo12618a().mo12423b();
                String g = jVar.mo12618a().mo12429g();
                StringBuilder sb = new StringBuilder();
                sb.append("{{ANALYTICS_SECTION}} - ");
                sb.append(valueOf);
                sb.append(" - ");
                sb.append(f);
                sb.append(" - NA");
                Map b2 = C13173j0.m40360b(C12907r.m40244a("clickPathContainerPosition", valueOf), C12907r.m40244a("clickPathContainerSet", f), C12907r.m40244a("clickPathContentPosition", str), C12907r.m40244a("clickPathString", sb.toString()), C12907r.m40244a("contentCollectionId", b), C12907r.m40244a("contentSetId", g));
                C2348e eVar = this.f8375c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("{{ANALYTICS_PAGE}} : ");
                sb2.append(a);
                sb2.append(" Navigation");
                eVar.mo11467a(sb2.toString(), b2, true);
            }
        }
    }

    /* renamed from: a */
    public void mo12372a(C3444j jVar, int i, C3626b bVar, Map<String, String> map, boolean z) {
        Map a = m11440a(jVar, i);
        Map b = this.f8378f.mo13258b(bVar);
        boolean z2 = bVar instanceof C3693o;
        String str = z2 ? "Content Tile" : "Collection";
        if (z2) {
            m11444a(a, jVar, (C3693o) bVar);
        } else if (bVar instanceof CollectionAsset) {
            m11443a(a, jVar, (CollectionAsset) bVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{{ANALYTICS_PAGE}} : ");
        sb.append(str);
        sb.append(" Click");
        String sb2 = sb.toString();
        this.f8375c.mo11467a(sb2, C13173j0.m40353a(C13173j0.m40353a(a, b), (Map) map), true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : a.entrySet()) {
            if (Intrinsics.areEqual((Object) (String) entry.getKey(), (Object) "brand")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f8376d.mo11567a(sb2, linkedHashMap);
        String e = jVar.mo12618a().mo12426e();
        boolean z3 = false;
        Map a2 = C13173j0.m40356a(C12907r.m40244a("contentId", this.f8378f.mo13257a(bVar)), C12907r.m40244a("contentSetId", jVar.mo12618a().mo12429g()));
        if (e == null || e.length() == 0) {
            z3 = true;
        }
        Map a3 = C5859p.m18901a(a2, !z3, "experimentToken", C13183n.m40498a(jVar.mo12618a().mo12426e()));
        if (z) {
            if (!z2) {
                bVar = null;
            }
            C3693o oVar = (C3693o) bVar;
            if (oVar != null) {
                String f = oVar.mo12903f();
                if (f != null) {
                    m11442a(f, C13173j0.m40353a(a, b));
                    return;
                }
                return;
            }
            return;
        }
        this.f8377e.mo11536a("click", GlimpseEvent.Companion.getContentSelected(), a3);
    }

    /* renamed from: a */
    public void mo12373a(String str, String str2, long j, String str3) {
        this.f8374b = System.currentTimeMillis();
        Map a = C5859p.m18900a(C5859p.m18900a(C13173j0.m40356a(C12907r.m40244a("contentSource", "cache"), C12907r.m40244a("playbackIntent", str3), C12907r.m40244a("playbackStartupTime", Long.valueOf(j))), C12907r.m40244a("mediaTitle", str)), C12907r.m40244a("videoURI", str2));
        this.f8377e.mo11536a("", new Custom("urn:dss:glimpse:event:app-lifecycle:background-playback-started"), a);
    }

    /* renamed from: a */
    public void mo12374a(String str, String str2, String str3) {
        Pair[] pairArr = {C12907r.m40244a("contentSource", "cache"), C12907r.m40244a("exitReason", "backgroundUser")};
        String str4 = "duration";
        Map a = C13173j0.m40354a(C5859p.m18900a(C5859p.m18900a(C13173j0.m40356a(pairArr), C12907r.m40244a("mediaTitle", str)), C12907r.m40244a("videoURI", str2)), C12907r.m40244a(str4, Long.valueOf(System.currentTimeMillis() - this.f8374b)));
        this.f8377e.mo11536a("", new Custom("urn:dss:glimpse:event:app-lifecycle:background-playback-exited"), a);
    }

    /* renamed from: a */
    private final void m11444a(Map<String, String> map, C3444j jVar, C3693o oVar) {
        map.put("contentId", this.f8378f.mo13257a(oVar));
        map.put("contentSetId", jVar.mo12618a().mo12429g());
    }

    /* renamed from: a */
    private final void m11442a(String str, Map<String, String> map) {
        Single g = this.f8380h.mo18834a(str).mo30220b(this.f8379g).mo30233g(new C3326b(this, map));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "contentLocationProvider.…mpseExtras)\n            }");
        C5826e0.m18824a(g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11443a(java.util.Map<java.lang.String, java.lang.String> r4, com.bamtechmedia.dominguez.collections.p080o0.C3444j r5, com.bamtechmedia.dominguez.core.content.assets.CollectionAsset r6) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.collections.items.b r0 = r5.mo12618a()
            java.lang.String r0 = r0.mo12423b()
            java.lang.String r1 = "contentCollectionId"
            r4.put(r1, r0)
            com.bamtechmedia.dominguez.core.content.assets.CollectionAsset$CollectionGroup r0 = r6.mo12840K()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.mo12854b()
            if (r0 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            java.lang.String r2 = "contentCollectionKey"
            r4.put(r2, r0)
            com.bamtechmedia.dominguez.collections.items.b r5 = r5.mo12618a()
            java.lang.String r5 = r5.mo12428f()
            java.lang.String r0 = "brand"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = r6.mo12841O()
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r5 = r1
        L_0x003a:
            r4.put(r0, r5)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3324g.m11443a(java.util.Map, com.bamtechmedia.dominguez.collections.o0.j, com.bamtechmedia.dominguez.core.content.assets.CollectionAsset):void");
    }

    /* renamed from: a */
    private final Map<String, String> m11440a(C3444j jVar, int i) {
        String valueOf = String.valueOf(jVar.mo12618a().mo12424c());
        String name = jVar.mo12618a().mo12425d().name();
        String valueOf2 = String.valueOf(i);
        StringBuilder sb = new StringBuilder();
        sb.append("{{ANALYTICS_SECTION}} - ");
        sb.append(valueOf);
        String str = " - ";
        sb.append(str);
        sb.append(name);
        sb.append(str);
        sb.append(valueOf2);
        return C13173j0.m40360b(C12907r.m40244a("section", "{{ANALYTICS_SECTION}}"), C12907r.m40244a("clickPathContainerPosition", valueOf), C12907r.m40244a("clickPathContainerSet", name), C12907r.m40244a("clickPathContentPosition", valueOf2), C12907r.m40244a("clickPathString", sb.toString()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, String> m11441a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (map.containsKey("contentId") || map.containsKey("mediaId")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
