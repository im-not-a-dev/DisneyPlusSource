package p163g.p201e.p203b.p287k.p288j;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.C2476z.C2477a;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3628c;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.detail.common.p225b0.C5906a;
import com.bamtechmedia.dominguez.detail.common.p225b0.C5907b;
import com.bamtechmedia.dominguez.detail.movie.data.C6018a;
import com.bamtechmedia.dominguez.offline.C6240b;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u001f\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0%H\u0002J\u0010\u0010&\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010'\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020#J\u0016\u0010*\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailAnalytics;", "Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "contentClicksTransformations", "Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;", "ioThread", "Lio/reactivex/Scheduler;", "contentLocationProvider", "Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;)V", "contentTileClicked", "", "analyticsInfo", "Lcom/bamtechmedia/dominguez/detail/movie/data/DetailAnalyticsInfo;", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "trackAddToWatchlistSuccess", "trackBackClick", "trackDownloadClick", "trackDownloadPauseResumeClick", "resume", "", "downloadable", "Lcom/bamtechmedia/dominguez/core/content/Downloadable;", "(Ljava/lang/Boolean;Lcom/bamtechmedia/dominguez/core/content/Downloadable;)V", "trackPlayClick", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "trackPlaybackSelected", "contentId", "", "analyticsExtras", "", "trackRemoveDownload", "trackRestartPlayClick", "trackTabClick", "contentClass", "trackWatchlistClick", "isInWatchlist", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.j.a */
/* compiled from: MovieDetailAnalytics.kt */
public final class C7316a implements C5906a {

    /* renamed from: a */
    private final C2348e f16070a;

    /* renamed from: b */
    private final C2436p f16071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2476z f16072c;

    /* renamed from: d */
    private final C3628c f16073d;

    /* renamed from: e */
    private final C11969r f16074e;

    /* renamed from: f */
    private final C6240b f16075f;

    /* renamed from: g.e.b.k.j.a$a */
    /* compiled from: MovieDetailAnalytics.kt */
    public static final class C7317a {
        private C7317a() {
        }

        public /* synthetic */ C7317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.k.j.a$b */
    /* compiled from: MovieDetailAnalytics.kt */
    static final class C7318b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ Map f16076U;

        /* renamed from: c */
        final /* synthetic */ C7316a f16077c;

        C7318b(C7316a aVar, Map map) {
            this.f16077c = aVar;
            this.f16076U = map;
        }

        /* renamed from: a */
        public final void mo20119a(String str) {
            C2477a.m9078a(this.f16077c.f16072c, null, GlimpseEvent.Companion.getPlaybackSelected(), C13173j0.m40355a(C5907b.m18991a(this.f16076U), new Pair[]{C12907r.m40244a("playbackIntent", "userAction"), C12907r.m40244a("mediaSource", str)}), 1, null);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo20119a((String) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7317a(null);
    }

    public C7316a(C2348e eVar, C2436p pVar, C2476z zVar, C3628c cVar, C11969r rVar, C6240b bVar) {
        this.f16070a = eVar;
        this.f16071b = pVar;
        this.f16072c = zVar;
        this.f16073d = cVar;
        this.f16074e = rVar;
        this.f16075f = bVar;
    }

    /* renamed from: b */
    public final void mo20117b() {
        C2349a.m8853a(this.f16070a, "{{ANALYTICS_PAGE}} : Download Movie Click", null, true, 2, null);
        C2437a.m8999a(this.f16071b, "{{ANALYTICS_PAGE}} : Download Movie Click", null, 2, null);
    }

    /* renamed from: a */
    public final void mo20114a(C3692n nVar) {
        Map b = this.f16073d.mo13258b(nVar);
        String str = "{{ANALYTICS_PAGE}} : Play Click";
        this.f16070a.mo11467a(str, b, true);
        C2437a.m8999a(this.f16071b, str, null, 2, null);
        m21945a(nVar.mo12903f(), b);
    }

    /* renamed from: b */
    public final void mo20118b(C3692n nVar) {
        Map b = this.f16073d.mo13258b(nVar);
        C2349a.m8853a(this.f16070a, "{{ANALYTICS_PAGE}} : Restart Play Click", b, false, 4, null);
        m21945a(nVar.mo12903f(), b);
    }

    /* renamed from: a */
    public final void mo20116a(String str) {
        C2348e eVar = this.f16070a;
        StringBuilder sb = new StringBuilder();
        String str2 = "{{ANALYTICS_PAGE}} : ";
        sb.append(str2);
        sb.append(C12832w.m40125f(str));
        String str3 = " Click";
        sb.append(str3);
        C2349a.m8853a(eVar, sb.toString(), null, true, 2, null);
        C2436p pVar = this.f16071b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(C12832w.m40125f(str));
        sb2.append(str3);
        C2437a.m8999a(pVar, sb2.toString(), null, 2, null);
    }

    /* renamed from: a */
    public final void mo20115a(C3692n nVar, boolean z) {
        C2348e eVar = this.f16070a;
        StringBuilder sb = new StringBuilder();
        sb.append("{{ANALYTICS_PAGE}} : Watchlist ");
        sb.append(z ? "Remove" : "Add");
        sb.append(" Click");
        eVar.mo11467a(sb.toString(), this.f16073d.mo13258b(nVar), true);
        if (!z) {
            C2437a.m8999a(this.f16071b, "{{ANALYTICS_PAGE}} : Watchlist Add Click", null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo20113a() {
        C2349a.m8853a(this.f16070a, "{{ANALYTICS_PAGE}} : Add To Watchlist Success", null, true, 2, null);
    }

    /* renamed from: a */
    public void mo17812a(C6018a aVar, C3693o oVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("0 - ");
        sb.append(aVar.mo18077b());
        sb.append(" - ");
        sb.append(aVar.mo18078c());
        String str = "{{ANALYTICS_PAGE}} : Content Tile Click";
        this.f16070a.mo11467a(str, C13173j0.m40356a(C12907r.m40244a("clickContainerPosition", "0"), C12907r.m40244a("clickpathContainerSet", aVar.mo18077b()), C12907r.m40244a("clickpathContentPosition", String.valueOf(aVar.mo18076a())), C12907r.m40244a("clickpathString", sb.toString())), true);
        C2437a.m8999a(this.f16071b, str, null, 2, null);
        m21945a(oVar.mo12903f(), this.f16073d.mo13258b(oVar));
    }

    /* renamed from: a */
    private final void m21945a(String str, Map<String, String> map) {
        Single g = this.f16075f.mo18834a(str).mo30220b(this.f16074e).mo30233g(new C7318b(this, map));
        C12880j.m40222a((Object) g, "contentLocationProvider.…mpseExtras)\n            }");
        C5826e0.m18824a(g);
    }
}
