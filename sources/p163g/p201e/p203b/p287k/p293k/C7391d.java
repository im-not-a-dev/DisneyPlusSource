package p163g.p201e.p203b.p287k.p293k;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.C2476z.C2477a;
import com.bamtechmedia.dominguez.core.content.C3685g;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 C2\u00020\u0001:\u0001CB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0010H\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\u0010H\u0000¢\u0006\u0002\b(J#\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5J,\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080;H\u0002J\u0017\u0010<\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020+H\u0000¢\u0006\u0002\bBR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailAnalytics;", "Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "contentClicksTransformations", "Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;", "ioThread", "Lio/reactivex/Scheduler;", "contentLocationProvider", "Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;", "(Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/offline/ContentLocationProvider;)V", "chromecastClicked", "", "chromecastClicked$contentDetail_release", "contentTileClicked", "analyticsInfo", "Lcom/bamtechmedia/dominguez/detail/movie/data/DetailAnalyticsInfo;", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "detailsClicked", "detailsClicked$contentDetail_release", "episodesClicked", "episodesClicked$contentDetail_release", "exitClicked", "exitClicked$contentDetail_release", "extrasClicked", "extrasClicked$contentDetail_release", "relatedTileClick", "relatedTileClick$contentDetail_release", "seasonClick", "seasonNumber", "", "seasonClick$contentDetail_release", "trackAddToWatchListSuccess", "trackAddToWatchListSuccess$contentDetail_release", "trackDownloadEpisodeClick", "trackDownloadEpisodeClick$contentDetail_release", "trackDownloadPauseResumeClick", "resume", "", "downloadable", "Lcom/bamtechmedia/dominguez/core/content/Downloadable;", "trackDownloadPauseResumeClick$contentDetail_release", "(Ljava/lang/Boolean;Lcom/bamtechmedia/dominguez/core/content/Downloadable;)V", "trackDownloadSeasonClick", "trackDownloadSeasonClick$contentDetail_release", "trackPlayClick", "episode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "trackPlayClick$contentDetail_release", "trackPlaybackSelected", "contentId", "", "userAction", "analyticsExtras", "", "trackRemoveDownload", "trackRemoveDownload$contentDetail_release", "trackRestartClick", "trackRestartClick$contentDetail_release", "trackWatchListClick", "isInWatchlist", "trackWatchListClick$contentDetail_release", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.d */
/* compiled from: SeriesDetailAnalytics.kt */
public final class C7391d implements C5906a {

    /* renamed from: a */
    private final C2348e f16238a;

    /* renamed from: b */
    private final C2436p f16239b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2476z f16240c;

    /* renamed from: d */
    private final C3628c f16241d;

    /* renamed from: e */
    private final C11969r f16242e;

    /* renamed from: f */
    private final C6240b f16243f;

    /* renamed from: g.e.b.k.k.d$a */
    /* compiled from: SeriesDetailAnalytics.kt */
    public static final class C7392a {
        private C7392a() {
        }

        public /* synthetic */ C7392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.k.k.d$b */
    /* compiled from: SeriesDetailAnalytics.kt */
    static final class C7393b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ String f16244U;

        /* renamed from: V */
        final /* synthetic */ Map f16245V;

        /* renamed from: c */
        final /* synthetic */ C7391d f16246c;

        C7393b(C7391d dVar, String str, Map map) {
            this.f16246c = dVar;
            this.f16244U = str;
            this.f16245V = map;
        }

        /* renamed from: a */
        public final void mo20225a(String str) {
            C2477a.m9078a(this.f16246c.f16240c, null, GlimpseEvent.Companion.getPlaybackSelected(), C13173j0.m40355a(C5907b.m18991a(this.f16245V), new Pair[]{C12907r.m40244a("playbackIntent", this.f16244U), C12907r.m40244a("mediaSource", str)}), 1, null);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo20225a((String) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7392a(null);
    }

    public C7391d(C2348e eVar, C2436p pVar, C2476z zVar, C3628c cVar, C11969r rVar, C6240b bVar) {
        this.f16238a = eVar;
        this.f16239b = pVar;
        this.f16240c = zVar;
        this.f16241d = cVar;
        this.f16242e = rVar;
        this.f16243f = bVar;
    }

    /* renamed from: b */
    public final void mo20221b(C3685g gVar) {
        Map b = this.f16241d.mo13258b(gVar);
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Restart Play Click", b, false, 4, null);
        m22128a(gVar.mo12903f(), "user-action-restart-button", b);
    }

    /* renamed from: c */
    public final void mo20222c() {
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Extras Click", null, true, 2, null);
        C2437a.m8999a(this.f16239b, "{{ANALYTICS_PAGE}} : Extras Click", null, 2, null);
    }

    /* renamed from: d */
    public final void mo20223d() {
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Related Click", null, true, 2, null);
        C2437a.m8999a(this.f16239b, "{{ANALYTICS_PAGE}} : Related Click", null, 2, null);
    }

    /* renamed from: e */
    public final void mo20224e() {
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Add To Watchlist Success", null, true, 2, null);
    }

    /* renamed from: a */
    public final void mo20218a(C3685g gVar) {
        Map b = this.f16241d.mo13258b(gVar);
        String str = "{{ANALYTICS_PAGE}} : Play Click";
        this.f16238a.mo11467a(str, b, true);
        C2437a.m8999a(this.f16239b, str, null, 2, null);
        m22128a(gVar.mo12903f(), "userAction", b);
    }

    /* renamed from: b */
    public final void mo20220b() {
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Episodes Click", null, true, 2, null);
        C2437a.m8999a(this.f16239b, "{{ANALYTICS_PAGE}} : Episodes Click", null, 2, null);
    }

    /* renamed from: a */
    public final void mo20219a(boolean z) {
        C2348e eVar = this.f16238a;
        StringBuilder sb = new StringBuilder();
        sb.append("{{ANALYTICS_PAGE}} : Watchlist ");
        sb.append(z ? "Remove" : "Add");
        sb.append(" Click");
        C2349a.m8853a(eVar, sb.toString(), null, true, 2, null);
        if (!z) {
            C2437a.m8999a(this.f16239b, "{{ANALYTICS_PAGE}} : Watchlist Add Click", null, 2, null);
        }
    }

    /* renamed from: a */
    public void mo17812a(C6018a aVar, C3693o oVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("0 - ");
        sb.append(aVar.mo18077b());
        sb.append(" - ");
        sb.append(aVar.mo18078c());
        String str = "{{ANALYTICS_PAGE}} : Content Tile Click";
        this.f16238a.mo11467a(str, C13173j0.m40356a(C12907r.m40244a("clickContainerPosition", "0"), C12907r.m40244a("clickpathContainerSet", aVar.mo18077b()), C12907r.m40244a("clickpathContentPosition", String.valueOf(aVar.mo18076a())), C12907r.m40244a("clickpathString", sb.toString())), true);
        C2437a.m8999a(this.f16239b, str, null, 2, null);
        m22128a(oVar.mo12903f(), "userAction", this.f16241d.mo13258b(oVar));
    }

    /* renamed from: a */
    public final void mo20217a() {
        C2349a.m8853a(this.f16238a, "{{ANALYTICS_PAGE}} : Details Click", null, true, 2, null);
        C2437a.m8999a(this.f16239b, "{{ANALYTICS_PAGE}} : Details Click", null, 2, null);
    }

    /* renamed from: a */
    private final void m22128a(String str, String str2, Map<String, String> map) {
        Single g = this.f16243f.mo18834a(str).mo30220b(this.f16242e).mo30233g(new C7393b(this, str2, map));
        C12880j.m40222a((Object) g, "contentLocationProvider.…mpseExtras)\n            }");
        C5826e0.m18824a(g);
    }
}
