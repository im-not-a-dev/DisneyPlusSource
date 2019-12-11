package p163g.p201e.p203b.p287k.p293k;

import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.detail.series.data.C6038b;
import com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import com.google.common.base.Optional;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g;
import p163g.p201e.p203b.p407e0.C10601l;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/SeriesDeepLinkActionHandler;", "", "downloadDelegate", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDownloadDelegate;", "watchlistRepository", "Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepository;", "episodeDataSource", "Lcom/bamtechmedia/dominguez/detail/series/data/EpisodeDataSource;", "arguments", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;", "router", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailRouter;", "isTelevision", "", "(Lcom/google/common/base/Optional;Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepository;Lcom/bamtechmedia/dominguez/detail/series/data/EpisodeDataSource;Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailRouter;Z)V", "downloadEpisode", "Lio/reactivex/Completable;", "seriesDetail", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;", "seasonSequenceNumber", "", "episodeSequenceNumber", "downloadSeason", "seasonNumber", "handleDeepLink", "viewModel", "Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;", "handleDeepLinks", "handleDownload", "handleWatchlist", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.c */
/* compiled from: SeriesDeepLinkActionHandler.kt */
public final class C7383c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Optional<C6038b> f16220a;

    /* renamed from: b */
    private final C10601l f16221b;

    /* renamed from: c */
    private final EpisodeDataSource f16222c;

    /* renamed from: d */
    private final C7394e f16223d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7400i f16224e;

    /* renamed from: f */
    private final boolean f16225f;

    /* renamed from: g.e.b.k.k.c$a */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7384a<T> implements Consumer<Disposable> {

        /* renamed from: U */
        final /* synthetic */ int f16226U;

        /* renamed from: c */
        final /* synthetic */ int f16227c;

        C7384a(int i, int i2) {
            this.f16227c = i;
            this.f16226U = i2;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downloading S");
            sb.append(this.f16227c);
            sb.append('E');
            sb.append(this.f16226U);
            C14100a.m44522a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: g.e.b.k.k.c$b */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7385b<T, R> implements Function<C3685g, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C6046d f16228U;

        /* renamed from: c */
        final /* synthetic */ C7383c f16229c;

        C7385b(C7383c cVar, C6046d dVar) {
            this.f16229c = cVar;
            this.f16228U = dVar;
        }

        /* renamed from: a */
        public final Completable apply(C3685g gVar) {
            return ((C6038b) this.f16229c.f16220a.mo27104a()).mo18175a(this.f16228U.mo18288d0(), gVar, null);
        }
    }

    /* renamed from: g.e.b.k.k.c$c */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7386c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7383c f16230a;

        /* renamed from: b */
        final /* synthetic */ C6046d f16231b;

        /* renamed from: c */
        final /* synthetic */ C3789t f16232c;

        C7386c(C7383c cVar, C6046d dVar, C3789t tVar) {
            this.f16230a = cVar;
            this.f16231b = dVar;
            this.f16232c = tVar;
        }

        public final void run() {
            this.f16230a.f16224e.mo20241a(this.f16231b.mo18288d0(), this.f16232c);
        }
    }

    /* renamed from: g.e.b.k.k.c$d */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7387d<T> implements C11952h<C7468g> {

        /* renamed from: c */
        public static final C7387d f16233c = new C7387d();

        C7387d() {
        }

        /* renamed from: a */
        public final boolean test(C7468g gVar) {
            return gVar.mo20363n() != null;
        }
    }

    /* renamed from: g.e.b.k.k.c$e */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7388e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C7388e f16234c = new C7388e();

        C7388e() {
        }

        /* renamed from: a */
        public final C6046d apply(C7468g gVar) {
            C6046d n = gVar.mo20363n();
            if (n != null) {
                return n;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: g.e.b.k.k.c$f */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7389f<T, R> implements Function<C6046d, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C7454a f16235U;

        /* renamed from: c */
        final /* synthetic */ C7383c f16236c;

        C7389f(C7383c cVar, C7454a aVar) {
            this.f16236c = cVar;
            this.f16235U = aVar;
        }

        /* renamed from: a */
        public final Completable apply(C6046d dVar) {
            return this.f16236c.m22119a(this.f16235U, dVar);
        }
    }

    /* renamed from: g.e.b.k.k.c$g */
    /* compiled from: SeriesDeepLinkActionHandler.kt */
    static final class C7390g implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7454a f16237a;

        C7390g(C7454a aVar) {
            this.f16237a = aVar;
        }

        public final void run() {
            this.f16237a.mo17921b(true);
        }
    }

    public C7383c(Optional<C6038b> optional, C10601l lVar, EpisodeDataSource episodeDataSource, C7394e eVar, C7400i iVar, boolean z) {
        this.f16220a = optional;
        this.f16221b = lVar;
        this.f16222c = episodeDataSource;
        this.f16223d = eVar;
        this.f16224e = iVar;
        this.f16225f = z;
    }

    /* renamed from: a */
    public final Completable mo20211a(C7454a aVar) {
        Completable b = aVar.getState().mo30150a((C11952h<? super T>) C7387d.f16233c).mo30193g(C7388e.f16234c).mo30186d().mo30217b((Function<? super T, ? extends CompletableSource>) new C7389f<Object,Object>(this, aVar));
        C12880j.m40222a((Object) b, "viewModel.state\n        …DeepLink(viewModel, it) }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Completable m22119a(C7454a aVar, C6046d dVar) {
        Completable a = Completable.m38157a(m22117a(dVar, aVar), m22114a(dVar));
        C12880j.m40222a((Object) a, "Completable.mergeArray(\n…d(seriesDetail)\n        )");
        return a;
    }

    /* renamed from: a */
    private final Completable m22117a(C6046d dVar, C7454a aVar) {
        if (this.f16223d.mo20229X()) {
            Completable b = this.f16221b.mo27467a(dVar.mo18288d0().mo12903f()).mo30050b((C11945a) new C7390g(aVar));
            C12880j.m40222a((Object) b, "watchlistRepository.addI…tState(newState = true) }");
            return b;
        }
        Completable h = Completable.m38169h();
        C12880j.m40222a((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: a */
    private final Completable m22114a(C6046d dVar) {
        if (!this.f16223d.mo20230Y() || this.f16225f) {
            Completable h = Completable.m38169h();
            C12880j.m40222a((Object) h, "Completable.complete()");
            return h;
        } else if (this.f16223d.mo20227F() != 0 && this.f16223d.mo20228I() != 0) {
            return m22116a(dVar, this.f16223d.mo20227F(), this.f16223d.mo20228I());
        } else {
            if (this.f16223d.mo20227F() != 0) {
                return m22115a(dVar, this.f16223d.mo20227F());
            }
            Completable a = Completable.m38154a((Throwable) new IllegalArgumentException("No season and optional episode number was specified"));
            C12880j.m40222a((Object) a, "Completable.error(Illega…e number was specified\"))");
            return a;
        }
    }

    /* renamed from: a */
    private final Completable m22115a(C6046d dVar, int i) {
        Object obj;
        boolean z;
        Iterator it = dVar.mo18287c0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C3789t) obj).mo12993L() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C3789t tVar = (C3789t) obj;
        if (tVar != null) {
            Completable c = Completable.m38166c((C11945a) new C7386c(this, dVar, tVar));
            C12880j.m40222a((Object) c, "Completable.fromAction {…sDetail.series, season) }");
            return c;
        }
        Completable h = Completable.m38169h();
        C12880j.m40222a((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: a */
    private final Completable m22116a(C6046d dVar, int i, int i2) {
        Completable b = this.f16222c.mo18126a(dVar.mo18288d0().mo13025D(), i, i2).mo30222c((Consumer<? super Disposable>) new C7384a<Object>(i, i2)).mo30217b((Function<? super T, ? extends CompletableSource>) new C7385b<Object,Object>(this, dVar));
        C12880j.m40222a((Object) b, "episodeDataSource.episod…etail.series, it, null) }");
        return b;
    }
}
