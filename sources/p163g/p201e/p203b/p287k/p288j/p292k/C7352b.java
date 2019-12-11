package p163g.p201e.p203b.p287k.p288j.p292k;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.detail.common.C5967h;
import com.bamtechmedia.dominguez.detail.common.C5967h.C5968a;
import com.bamtechmedia.dominguez.detail.common.C5969i;
import com.bamtechmedia.dominguez.detail.common.C5969i.C5970a;
import com.bamtechmedia.dominguez.detail.common.C5982j;
import com.bamtechmedia.dominguez.detail.common.C5983k;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.offline.C5994b;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5913e;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5915f;
import com.bamtechmedia.dominguez.detail.common.p227d0.C5917a;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5920a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.movie.data.C6020c;
import com.bamtechmedia.dominguez.detail.movie.models.C6024b;
import com.bamtechmedia.dominguez.detail.movie.models.C6026d;
import com.bamtechmedia.dominguez.offline.C6243d;
import com.bamtechmedia.dominguez.offline.C6243d.C6244a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import net.danlew.android.joda.DateUtils;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p288j.C7316a;
import p163g.p201e.p203b.p287k.p288j.C7319b;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p163g.p503n.p504a.C11842x;
import p163g.p503n.p504a.C11844z;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11957k;
import p520io.reactivex.C11974s;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006:\u0002VWBy\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u001e\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u000209H\u0016J\u0010\u0010=\u001a\u0002092\u0006\u00106\u001a\u000207H\u0002J\b\u0010>\u001a\u000209H\u0002J\b\u0010?\u001a\u000209H\u0016J\u0010\u0010@\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020\u0007H\u0002J\u0006\u0010C\u001a\u000209J\u0010\u0010D\u001a\u0002092\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010E\u001a\u0002092\u0006\u00104\u001a\u0002052\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u001c\u0010F\u001a\u0002092\n\u0010G\u001a\u0006\u0012\u0002\b\u00030H2\u0006\u0010I\u001a\u00020&H\u0016J\u0010\u0010J\u001a\u0002092\u0006\u0010K\u001a\u000203H\u0016J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020NH\u0002J\u0006\u0010O\u001a\u000209J\b\u0010P\u001a\u000209H\u0016J\u0018\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u0018H\u0016J\u0010\u0010T\u001a\u0002092\u0006\u0010U\u001a\u00020\u0018H\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;", "Lcom/bamtechmedia/dominguez/detail/common/DetailViewModel;", "Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel$State;", "Lcom/bamtechmedia/dominguez/detail/common/listeners/OnTabSelectedListener;", "Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateObserver;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper$ViewModel;", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "dataSource", "Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailDataSource;", "downloadDelegate", "Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDownloadDelegate;", "watchlistHelper", "Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper;", "extrasContentDataSource", "Lcom/bamtechmedia/dominguez/detail/common/ExtrasContentDataSource;", "initialMovie", "familyId", "", "analytics", "Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailAnalytics;", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "addToWatchlist", "", "shouldDownload", "metadataFactory", "Lcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactory;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "(Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailDataSource;Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDownloadDelegate;Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper;Lcom/bamtechmedia/dominguez/detail/common/ExtrasContentDataSource;Lcom/bamtechmedia/dominguez/core/content/Movie;Ljava/lang/String;Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailAnalytics;Lcom/bamtechmedia/dominguez/core/content/InitialTab;ZZLcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactory;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;)V", "getContentDetailConfig", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "contentDetailTransitionState", "", "getContentDetailTransitionState$contentDetail_release", "()Ljava/lang/Integer;", "setContentDetailTransitionState$contentDetail_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pageName", "getPageName", "()Ljava/lang/String;", "getTransactionIdProvider", "()Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "createTabs", "", "Lcom/bamtechmedia/dominguez/detail/common/Tab;", "movieDetail", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieDetail;", "extraContent", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "handleError", "", "throwable", "", "loadDetails", "loadMoreExtraContent", "loadMovieDetail", "loadUserData", "mapInitialTabToMovieDetailString", "observeDownloadState", "movie", "onDownloadClicked", "onMoreExtraContentLoaded", "onMovieDetailLoaded", "onPageItemBound", "list", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "pagedListPosition", "onTabSelected", "tab", "onUserDataLoaded", "userData", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieUserData;", "onWatchlistClicked", "trackAddToWatchlistSuccess", "trackWatchListClick", "asset", "wasInWatchlist", "updateWatchlistState", "newState", "Companion", "State", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.j.k.b */
/* compiled from: MovieDetailViewModel.kt */
public final class C7352b extends C5967h<C7354b> implements C5917a, C5994b, C3702e, C5970a<C3692n> {

    /* renamed from: U */
    private final String f16161U = "movie_details";

    /* renamed from: V */
    private final C7319b f16162V;

    /* renamed from: W */
    private final C6020c f16163W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C5969i f16164X;

    /* renamed from: Y */
    private final C5983k f16165Y;

    /* renamed from: Z */
    private final C3692n f16166Z;

    /* renamed from: a0 */
    private final String f16167a0;

    /* renamed from: b0 */
    private final C7316a f16168b0;

    /* renamed from: c */
    private Integer f16169c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C3690l f16170c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final boolean f16171d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final boolean f16172e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final C5920a f16173f0;

    /* renamed from: g0 */
    private final C3572r0 f16174g0;

    /* renamed from: h0 */
    private final C5948c f16175h0;

    /* renamed from: i0 */
    private final C2366i0 f16176i0;

    /* renamed from: g.e.b.k.j.k.b$a */
    /* compiled from: MovieDetailViewModel.kt */
    public static final class C7353a {
        private C7353a() {
        }

        public /* synthetic */ C7353a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.k.j.k.b$b */
    /* compiled from: MovieDetailViewModel.kt */
    public static final class C7354b extends C5968a {

        /* renamed from: a */
        private final C6024b f16177a;

        /* renamed from: b */
        private final C3692n f16178b;

        /* renamed from: c */
        private final C5982j f16179c;

        /* renamed from: d */
        private final PromoLabel f16180d;

        /* renamed from: e */
        private final C6008x f16181e;

        /* renamed from: f */
        private final List<C6008x> f16182f;

        /* renamed from: g */
        private final Map<String, Object> f16183g;

        /* renamed from: h */
        private int f16184h;

        /* renamed from: i */
        private final C6243d f16185i;

        /* renamed from: j */
        private final C6026d f16186j;

        /* renamed from: k */
        private final boolean f16187k;

        /* renamed from: l */
        private final boolean f16188l;

        /* renamed from: m */
        private final boolean f16189m;

        /* renamed from: n */
        private final boolean f16190n;

        /* renamed from: o */
        private final boolean f16191o;

        public C7354b() {
            this(null, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 32767, null);
        }

        public /* synthetic */ C7354b(C6024b bVar, C3692n nVar, C5982j jVar, PromoLabel promoLabel, C6008x xVar, List list, Map map, int i, C6243d dVar, C6026d dVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            int i3 = i2;
            C6026d dVar3 = null;
            C6024b bVar2 = (i3 & 1) != 0 ? null : bVar;
            C3692n nVar2 = (i3 & 2) != 0 ? bVar2 != null ? bVar2.mo18111c0() : null : nVar;
            C5982j jVar2 = (i3 & 4) != 0 ? null : jVar;
            PromoLabel promoLabel2 = (i3 & 8) != 0 ? bVar2 != null ? bVar2.mo18107Z() : null : promoLabel;
            C6008x xVar2 = (i3 & 16) != 0 ? null : xVar;
            List a = (i3 & 32) != 0 ? C13185o.m40513a() : list;
            Map a2 = (i3 & 64) != 0 ? C13173j0.m40350a() : map;
            boolean z6 = false;
            int i4 = (i3 & 128) != 0 ? 0 : i;
            C6243d a3 = (i3 & 256) != 0 ? C6244a.m19736a(C6243d.f14276d0, null, null, null, 0.0f, 0, false, null, null, 0, 511, null) : dVar;
            if ((i3 & DateUtils.FORMAT_NO_NOON) == 0) {
                dVar3 = dVar2;
            }
            boolean z7 = (i3 & 1024) != 0 ? false : z;
            boolean z8 = (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? false : z2;
            boolean z9 = (i3 & 4096) != 0 ? false : z3;
            boolean z10 = (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? false : z4;
            if ((i3 & DateUtils.FORMAT_ABBREV_TIME) == 0) {
                z6 = z5;
            }
            this(bVar2, nVar2, jVar2, promoLabel2, xVar2, a, a2, i4, a3, dVar3, z7, z8, z9, z10, z6);
        }

        /* renamed from: a */
        public static /* synthetic */ C7354b m22075a(C7354b bVar, C6024b bVar2, C3692n nVar, C5982j jVar, PromoLabel promoLabel, C6008x xVar, List list, Map map, int i, C6243d dVar, C6026d dVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            C7354b bVar3 = bVar;
            int i3 = i2;
            return bVar.mo20176a((i3 & 1) != 0 ? bVar3.f16177a : bVar2, (i3 & 2) != 0 ? bVar3.f16178b : nVar, (i3 & 4) != 0 ? bVar3.f16179c : jVar, (i3 & 8) != 0 ? bVar3.f16180d : promoLabel, (i3 & 16) != 0 ? bVar.mo17871d() : xVar, (i3 & 32) != 0 ? bVar.mo17870c() : list, (i3 & 64) != 0 ? bVar.mo20180h() : map, (i3 & 128) != 0 ? bVar3.f16184h : i, (i3 & 256) != 0 ? bVar3.f16185i : dVar, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? bVar3.f16186j : dVar2, (i3 & 1024) != 0 ? bVar3.f16187k : z, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? bVar3.f16188l : z2, (i3 & 4096) != 0 ? bVar3.f16189m : z3, (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? bVar.mo17816e() : z4, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? bVar.mo17815b() : z5);
        }

        /* renamed from: a */
        public final C7354b mo20176a(C6024b bVar, C3692n nVar, C5982j jVar, PromoLabel promoLabel, C6008x xVar, List<? extends C6008x> list, Map<String, ? extends Object> map, int i, C6243d dVar, C6026d dVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C7354b bVar2 = new C7354b(bVar, nVar, jVar, promoLabel, xVar, list, map, i, dVar, dVar2, z, z2, z3, z4, z5);
            return bVar2;
        }

        /* renamed from: a */
        public boolean mo17814a() {
            return this.f16187k && this.f16188l && this.f16178b == null;
        }

        /* renamed from: b */
        public boolean mo17815b() {
            return this.f16191o;
        }

        /* renamed from: c */
        public List<C6008x> mo17870c() {
            return this.f16182f;
        }

        /* renamed from: d */
        public C6008x mo17871d() {
            return this.f16181e;
        }

        /* renamed from: e */
        public boolean mo17816e() {
            return this.f16190n;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7354b) {
                    C7354b bVar = (C7354b) obj;
                    if (C12880j.m40224a((Object) this.f16177a, (Object) bVar.f16177a) && C12880j.m40224a((Object) this.f16178b, (Object) bVar.f16178b) && C12880j.m40224a((Object) this.f16179c, (Object) bVar.f16179c) && C12880j.m40224a((Object) this.f16180d, (Object) bVar.f16180d) && C12880j.m40224a((Object) mo17871d(), (Object) bVar.mo17871d()) && C12880j.m40224a((Object) mo17870c(), (Object) bVar.mo17870c()) && C12880j.m40224a((Object) mo20180h(), (Object) bVar.mo20180h())) {
                        if ((this.f16184h == bVar.f16184h) && C12880j.m40224a((Object) this.f16185i, (Object) bVar.f16185i) && C12880j.m40224a((Object) this.f16186j, (Object) bVar.f16186j)) {
                            if (this.f16187k == bVar.f16187k) {
                                if (this.f16188l == bVar.f16188l) {
                                    if (this.f16189m == bVar.f16189m) {
                                        if (mo17816e() == bVar.mo17816e()) {
                                            if (mo17815b() == bVar.mo17815b()) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final C6243d mo20178f() {
            return this.f16185i;
        }

        /* renamed from: g */
        public final C5982j mo20179g() {
            return this.f16179c;
        }

        /* renamed from: h */
        public Map<String, Object> mo20180h() {
            return this.f16183g;
        }

        public int hashCode() {
            C6024b bVar = this.f16177a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C3692n nVar = this.f16178b;
            int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
            C5982j jVar = this.f16179c;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            PromoLabel promoLabel = this.f16180d;
            int hashCode4 = (hashCode3 + (promoLabel != null ? promoLabel.hashCode() : 0)) * 31;
            C6008x d = mo17871d();
            int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
            List c = mo17870c();
            int hashCode6 = (hashCode5 + (c != null ? c.hashCode() : 0)) * 31;
            Map h = mo20180h();
            int hashCode7 = (((hashCode6 + (h != null ? h.hashCode() : 0)) * 31) + this.f16184h) * 31;
            C6243d dVar = this.f16185i;
            int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            C6026d dVar2 = this.f16186j;
            if (dVar2 != null) {
                i = dVar2.hashCode();
            }
            int i2 = (hashCode8 + i) * 31;
            boolean z = this.f16187k;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f16188l;
            if (z2) {
                z2 = true;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f16189m;
            if (z3) {
                z3 = true;
            }
            int i5 = (i4 + (z3 ? 1 : 0)) * 31;
            boolean e = mo17816e();
            if (e) {
                e = true;
            }
            int i6 = (i5 + (e ? 1 : 0)) * 31;
            boolean b = mo17815b();
            if (b) {
                b = true;
            }
            return i6 + (b ? 1 : 0);
        }

        /* renamed from: i */
        public final C3692n mo20182i() {
            return this.f16178b;
        }

        /* renamed from: j */
        public final C6024b mo20183j() {
            return this.f16177a;
        }

        /* renamed from: k */
        public final PromoLabel mo20184k() {
            return this.f16180d;
        }

        /* renamed from: l */
        public final C6026d mo20185l() {
            return this.f16186j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(movieDetail=");
            sb.append(this.f16177a);
            sb.append(", movie=");
            sb.append(this.f16178b);
            sb.append(", extraContent=");
            sb.append(this.f16179c);
            sb.append(", promoLabel=");
            sb.append(this.f16180d);
            sb.append(", activeTab=");
            sb.append(mo17871d());
            sb.append(", tabs=");
            sb.append(mo17870c());
            sb.append(", itemViewState=");
            sb.append(mo20180h());
            sb.append(", lastSelectedTabPosition=");
            sb.append(this.f16184h);
            sb.append(", downloadState=");
            sb.append(this.f16185i);
            sb.append(", userData=");
            sb.append(this.f16186j);
            sb.append(", movieDetailFailed=");
            sb.append(this.f16187k);
            sb.append(", userMovieDetailFailed=");
            sb.append(this.f16188l);
            sb.append(", downloadStateFailed=");
            sb.append(this.f16189m);
            sb.append(", missingResource=");
            sb.append(mo17816e());
            sb.append(", filteredByKidsMode=");
            sb.append(mo17815b());
            sb.append(")");
            return sb.toString();
        }

        public C7354b(C6024b bVar, C3692n nVar, C5982j jVar, PromoLabel promoLabel, C6008x xVar, List<? extends C6008x> list, Map<String, ? extends Object> map, int i, C6243d dVar, C6026d dVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(xVar, list, map);
            this.f16177a = bVar;
            this.f16178b = nVar;
            this.f16179c = jVar;
            this.f16180d = promoLabel;
            this.f16181e = xVar;
            this.f16182f = list;
            this.f16183g = map;
            this.f16184h = i;
            this.f16185i = dVar;
            this.f16186j = dVar2;
            this.f16187k = z;
            this.f16188l = z2;
            this.f16189m = z3;
            this.f16190n = z4;
            this.f16191o = z5;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$c */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7355c extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: c */
        public static final C7355c f16192c = new C7355c();

        C7355c() {
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, null, false, false, false, true, false, 24575, null);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$d */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7356d extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: c */
        public static final C7356d f16193c = new C7356d();

        C7356d() {
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, null, false, false, false, false, true, 16383, null);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$e */
    /* compiled from: MovieDetailViewModel.kt */
    static final /* synthetic */ class C7357e extends C12879i implements Function1<C5982j, C13145v> {
        C7357e(C7352b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo20189a(C5982j jVar) {
            ((C7352b) this.receiver).m22056b(jVar);
        }

        public final String getName() {
            return "onMoreExtraContentLoaded";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7352b.class);
        }

        public final String getSignature() {
            return "onMoreExtraContentLoaded(Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20189a((C5982j) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$f */
    /* compiled from: MovieDetailViewModel.kt */
    static final /* synthetic */ class C7358f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7358f f16194c = new C7358f();

        C7358f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20190a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20190a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$g */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7359g<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16195c;

        C7359g(C7352b bVar) {
            this.f16195c = bVar;
        }

        /* renamed from: a */
        public final C6024b mo20191a(C6024b bVar) {
            bVar.mo18108a(this.f16195c.f16173f0.mo17821a(bVar.mo18111c0(), bVar.mo18111c0(), bVar.mo18117z()));
            return bVar;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            C6024b bVar = (C6024b) obj;
            mo20191a(bVar);
            return bVar;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$h */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7360h<T> implements Consumer<C6024b> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16196c;

        C7360h(C7352b bVar) {
            this.f16196c = bVar;
        }

        /* renamed from: a */
        public final void accept(C6024b bVar) {
            C7352b bVar2 = this.f16196c;
            C12880j.m40222a((Object) bVar, "it");
            C7352b bVar3 = this.f16196c;
            bVar2.m22047a(bVar, bVar3.m22041a(bVar3.f16170c0));
            if (this.f16196c.f16171d0) {
                this.f16196c.f16164X.mo17918a(bVar.mo18111c0(), (C5970a<T>) this.f16196c);
            }
            if (this.f16196c.f16172e0) {
                this.f16196c.mo20172F();
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.j.k.b$i */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7361i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16197c;

        /* renamed from: g.e.b.k.j.k.b$i$a */
        /* compiled from: MovieDetailViewModel.kt */
        static final class C7362a extends C12881k implements Function1<C7354b, C7354b> {

            /* renamed from: c */
            public static final C7362a f16198c = new C7362a();

            C7362a() {
                super(1);
            }

            /* renamed from: a */
            public final C7354b invoke(C7354b bVar) {
                return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, null, true, false, false, false, false, 31743, null);
            }
        }

        C7361i(C7352b bVar) {
            this.f16197c = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            if (th instanceof C11998a) {
                List<Throwable> a = ((C11998a) th).mo30334a();
                C12880j.m40222a((Object) a, "throwable.exceptions");
                for (Throwable th2 : a) {
                    C7352b bVar = this.f16197c;
                    C12880j.m40222a((Object) th2, "it");
                    bVar.m22053a(th2);
                }
            } else {
                C7352b bVar2 = this.f16197c;
                C12880j.m40222a((Object) th, "throwable");
                bVar2.m22053a(th);
            }
            this.f16197c.updateState(C7362a.f16198c);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$j */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7363j<T> implements C11952h<C6026d> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16199c;

        C7363j(C7352b bVar) {
            this.f16199c = bVar;
        }

        /* renamed from: a */
        public final boolean test(C6026d dVar) {
            C7354b bVar = (C7354b) this.f16199c.getCurrentState();
            return !C12880j.m40224a((Object) dVar, (Object) bVar != null ? bVar.mo20185l() : null);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$k */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7364k<T> implements Consumer<C6026d> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16200c;

        C7364k(C7352b bVar) {
            this.f16200c = bVar;
        }

        /* renamed from: a */
        public final void accept(C6026d dVar) {
            C7352b bVar = this.f16200c;
            C12880j.m40222a((Object) dVar, "it");
            bVar.m22048a(dVar);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.j.k.b$l */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7365l<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16201c;

        /* renamed from: g.e.b.k.j.k.b$l$a */
        /* compiled from: MovieDetailViewModel.kt */
        static final class C7366a extends C12881k implements Function1<C7354b, C7354b> {

            /* renamed from: c */
            public static final C7366a f16202c = new C7366a();

            C7366a() {
                super(1);
            }

            /* renamed from: a */
            public final C7354b invoke(C7354b bVar) {
                return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, null, false, true, false, false, false, 30719, null);
            }
        }

        C7365l(C7352b bVar) {
            this.f16201c = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16201c.updateState(C7366a.f16202c);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtechmedia/dominguez/offline/DownloadState;", "kotlin.jvm.PlatformType", "accept", "com/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel$observeDownloadState$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.j.k.b$m */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7367m<T> implements Consumer<C6243d> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16203c;

        /* renamed from: g.e.b.k.j.k.b$m$a */
        /* compiled from: MovieDetailViewModel.kt */
        static final class C7368a extends C12881k implements Function1<C7354b, C7354b> {

            /* renamed from: c */
            final /* synthetic */ C6243d f16204c;

            C7368a(C6243d dVar) {
                this.f16204c = dVar;
                super(1);
            }

            /* renamed from: a */
            public final C7354b invoke(C7354b bVar) {
                C7354b bVar2 = bVar;
                C6243d dVar = this.f16204c;
                C6243d dVar2 = dVar;
                C12880j.m40222a((Object) dVar, "it");
                return C7354b.m22075a(bVar2, null, null, null, null, null, null, null, 0, dVar2, null, false, false, false, false, false, 28415, null);
            }
        }

        C7367m(C7352b bVar, C3692n nVar) {
            this.f16203c = bVar;
        }

        /* renamed from: a */
        public final void accept(C6243d dVar) {
            this.f16203c.updateState(new C7368a(dVar));
        }
    }

    /* renamed from: g.e.b.k.j.k.b$n */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7369n<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16205c;

        C7369n(C7352b bVar, C3692n nVar) {
            this.f16205c = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16205c.updateState(C7379d.f16218c);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$o */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7370o implements C11945a {

        /* renamed from: a */
        public static final C7370o f16206a = new C7370o();

        C7370o() {
        }

        public final void run() {
            C14100a.m44529c("Download started", new Object[0]);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$p */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7371p<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7371p f16207c = new C7371p();

        C7371p() {
        }

        /* renamed from: a */
        public final void mo20202a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20202a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$q */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7372q extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: U */
        final /* synthetic */ C7352b f16208U;

        /* renamed from: V */
        final /* synthetic */ C5982j f16209V;

        /* renamed from: c */
        final /* synthetic */ C6024b f16210c;

        C7372q(C6024b bVar, C7352b bVar2, C5982j jVar) {
            this.f16210c = bVar;
            this.f16208U = bVar2;
            this.f16209V = jVar;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[EDGE_INSN: B:16:0x0040->B:13:0x0040 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b invoke(p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b r23) {
            /*
                r22 = this;
                r0 = r22
                g.e.b.k.j.k.b r1 = r0.f16208U
                com.bamtechmedia.dominguez.detail.movie.models.b r2 = r0.f16210c
                com.bamtechmedia.dominguez.detail.common.j r3 = r0.f16209V
                java.util.List r10 = r1.m22043a(r2, r3)
                com.bamtechmedia.dominguez.detail.common.j r7 = r0.f16209V
                java.util.Iterator r1 = r10.iterator()
            L_0x0012:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x003f
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.bamtechmedia.dominguez.detail.common.x r3 = (com.bamtechmedia.dominguez.detail.common.C6008x) r3
                int r3 = r3.mo18028d()
                g.e.b.k.j.k.b r4 = r0.f16208U
                java.lang.Object r4 = r4.getCurrentState()
                g.e.b.k.j.k.b$b r4 = (p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b) r4
                if (r4 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.detail.common.x r4 = r4.mo17871d()
                if (r4 == 0) goto L_0x003b
                int r4 = r4.mo18028d()
                if (r3 != r4) goto L_0x003b
                r3 = 1
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x0012
                goto L_0x0040
            L_0x003f:
                r2 = 0
            L_0x0040:
                r9 = r2
                com.bamtechmedia.dominguez.detail.common.x r9 = (com.bamtechmedia.dominguez.detail.common.C6008x) r9
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 32715(0x7fcb, float:4.5843E-41)
                r21 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                r4 = r23
                g.e.b.k.j.k.b$b r1 = p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b.m22075a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7372q.invoke(g.e.b.k.j.k.b$b):g.e.b.k.j.k.b$b");
        }
    }

    /* renamed from: g.e.b.k.j.k.b$r */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7373r extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: U */
        final /* synthetic */ List f16211U;

        /* renamed from: V */
        final /* synthetic */ C6008x f16212V;

        /* renamed from: c */
        final /* synthetic */ C6024b f16213c;

        C7373r(C6024b bVar, List list, C6008x xVar) {
            this.f16213c = bVar;
            this.f16211U = list;
            this.f16212V = xVar;
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            C6024b bVar2 = this.f16213c;
            C6026d l = bVar.mo20185l();
            C5982j Y = this.f16213c.mo18106Y();
            C6243d f = bVar.mo20178f();
            C7354b bVar3 = new C7354b(bVar2, null, Y, null, this.f16212V, this.f16211U, null, 0, f, l, false, false, false, false, false, 30922, null);
            return bVar3;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$s */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7374s extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: c */
        final /* synthetic */ C6008x f16214c;

        C7374s(C6008x xVar) {
            this.f16214c = xVar;
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            return C7354b.m22075a(bVar, null, null, null, null, this.f16214c, null, null, C13199w.m40555a(bVar.mo17870c(), (Object) bVar.mo17871d()), null, null, false, false, false, false, false, 32623, null);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$t */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7375t extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: c */
        final /* synthetic */ C6026d f16215c;

        C7375t(C6026d dVar) {
            this.f16215c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, this.f16215c, false, false, false, false, false, 30207, null);
        }
    }

    /* renamed from: g.e.b.k.j.k.b$u */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7376u extends C12881k implements Function2<C3692n, Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7352b f16216c;

        C7376u(C7352b bVar) {
            this.f16216c = bVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20207a(C3692n nVar, boolean z) {
            this.f16216c.f16164X.mo17919a(nVar, z, (C5970a<T>) this.f16216c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20207a((C3692n) obj, ((Boolean) obj2).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.j.k.b$v */
    /* compiled from: MovieDetailViewModel.kt */
    static final class C7377v extends C12881k implements Function1<C7354b, C7354b> {

        /* renamed from: c */
        final /* synthetic */ boolean f16217c;

        C7377v(boolean z) {
            this.f16217c = z;
            super(1);
        }

        /* renamed from: a */
        public final C7354b invoke(C7354b bVar) {
            C6026d l = bVar.mo20185l();
            C6026d dVar = null;
            if (l != null) {
                dVar = C6026d.m19290a(l, this.f16217c, null, 2, null);
            }
            return C7354b.m22075a(bVar, null, null, null, null, null, null, null, 0, null, dVar, false, false, false, false, false, 32255, null);
        }
    }

    static {
        new C7353a(null);
    }

    public C7352b(C7319b bVar, C6020c cVar, C5969i iVar, C5983k kVar, C3692n nVar, String str, C7316a aVar, C3690l lVar, boolean z, boolean z2, C5920a aVar2, C3572r0 r0Var, C5948c cVar2, C2366i0 i0Var) {
        this.f16162V = bVar;
        this.f16163W = cVar;
        this.f16164X = iVar;
        this.f16165Y = kVar;
        this.f16166Z = nVar;
        this.f16167a0 = str;
        this.f16168b0 = aVar;
        this.f16170c0 = lVar;
        this.f16171d0 = z;
        this.f16172e0 = z2;
        this.f16173f0 = aVar2;
        this.f16174g0 = r0Var;
        this.f16175h0 = cVar2;
        this.f16176i0 = i0Var;
        StringBuilder sb = new StringBuilder();
        sb.append("familyId ");
        sb.append(this.f16167a0);
        C14100a.m44531d(sb.toString(), new Object[0]);
        C7354b bVar2 = new C7354b(null, this.f16166Z, null, null, null, null, null, 0, null, null, false, false, false, false, false, 32765, null);
        createState(bVar2);
        C3692n nVar2 = this.f16166Z;
        if (nVar2 != null) {
            m22045a(nVar2);
        }
        mo18036m();
    }

    /* renamed from: H */
    private final void m22040H() {
        Single g = this.f16162V.mo18055a(this.f16167a0, mo17913B()).mo30233g(new C7359g(this));
        C12880j.m40222a((Object) g, "dataSource.getMovieDetai…a(metadata)\n            }");
        Object a = g.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C7360h(this), new C7361i(this));
    }

    /* renamed from: A */
    public String mo17912A() {
        return this.f16161U;
    }

    /* renamed from: C */
    public C2366i0 mo17914C() {
        return this.f16176i0;
    }

    /* renamed from: D */
    public void mo17915D() {
        Maybe a = this.f16162V.mo18056b(this.f16167a0, mo17913B()).mo30202a((C11952h<? super T>) new C7363j<Object>(this));
        C12880j.m40222a((Object) a, "dataSource.getMovieUserD… currentState?.userData }");
        Object a2 = a.mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11844z) a2).mo29929a(new C7364k(this), new C7365l(this));
    }

    /* renamed from: E */
    public final Integer mo20171E() {
        return this.f16169c;
    }

    /* renamed from: F */
    public final void mo20172F() {
        C7354b bVar = (C7354b) getCurrentState();
        if (bVar != null) {
            C3692n i = bVar.mo20182i();
            if (i != null) {
                C6020c cVar = this.f16163W;
                if (cVar != null) {
                    C7354b bVar2 = (C7354b) getCurrentState();
                    Object a = cVar.mo18082a(i, bVar2 != null ? bVar2.mo20178f() : null).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
                    C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    ((C11839v) a).mo29926a(C7370o.f16206a, C7371p.f16207c);
                }
            }
        }
        this.f16168b0.mo20117b();
    }

    /* renamed from: G */
    public final void mo20173G() {
        C7354b bVar = (C7354b) getCurrentState();
        Boolean bool = null;
        Object i = bVar != null ? bVar.mo20182i() : null;
        C7354b bVar2 = (C7354b) getCurrentState();
        if (bVar2 != null) {
            C6026d l = bVar2.mo20185l();
            if (l != null) {
                bool = Boolean.valueOf(l.mo18122b());
            }
        }
        C5884x.m18949a(i, bool, new C7376u(this));
    }

    /* renamed from: m */
    public void mo18036m() {
        mo17915D();
        m22040H();
    }

    /* renamed from: r */
    public void mo17923r() {
        this.f16168b0.mo20113a();
    }

    /* renamed from: y */
    public C5948c mo17916y() {
        return this.f16175h0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22056b(C5982j jVar) {
        C7354b bVar = (C7354b) getCurrentState();
        if (bVar != null) {
            C6024b j = bVar.mo20183j();
            if (j != null) {
                updateState(new C7372q(j, this, jVar));
            }
        }
    }

    /* renamed from: b */
    public void mo17921b(boolean z) {
        updateState(new C7377v(z));
    }

    /* renamed from: a */
    public final void mo20175a(Integer num) {
        this.f16169c = num;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22047a(C6024b bVar, String str) {
        Object obj;
        if (this.f16166Z == null) {
            m22045a(bVar.mo18111c0());
        }
        List a = m22043a(bVar, bVar.mo18106Y());
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12880j.m40224a((Object) C3573a.m12035a(this.f16174g0, ((C6008x) obj).mo18028d(), (Map) null, 2, (Object) null), (Object) str)) {
                break;
            }
        }
        C6008x xVar = (C6008x) obj;
        if (xVar == null) {
            xVar = (C6008x) C13199w.m40591g(a);
        }
        updateState(new C7373r(bVar, a, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22053a(Throwable th) {
        if (th instanceof C5915f) {
            updateState(C7355c.f16192c);
        } else if (th instanceof C5913e) {
            updateState(C7356d.f16193c);
        }
    }

    /* renamed from: a */
    public void mo12663a(C3700c<?> cVar, int i) {
        if (cVar instanceof C5982j) {
            m22046a((C5982j) cVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [g.e.b.k.j.k.b$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r2v1, types: [g.e.b.k.j.k.e] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22046a(com.bamtechmedia.dominguez.detail.common.C5982j r4) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.detail.common.k r0 = r3.f16165Y
            java.lang.String r1 = r3.f16167a0
            java.lang.String r2 = r3.mo17913B()
            io.reactivex.Maybe r4 = r0.mo17936a(r1, r4, r2)
            g.n.a.c0 r0 = r3.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r4 = r4.mo30112a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            g.n.a.z r4 = (p163g.p503n.p504a.C11844z) r4
            g.e.b.k.j.k.b$e r0 = new g.e.b.k.j.k.b$e
            r0.<init>(r3)
            g.e.b.k.j.k.e r1 = new g.e.b.k.j.k.e
            r1.<init>(r0)
            g.e.b.k.j.k.b$f r0 = p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7358f.f16194c
            if (r0 == 0) goto L_0x0033
            g.e.b.k.j.k.e r2 = new g.e.b.k.j.k.e
            r2.<init>(r0)
            r0 = r2
        L_0x0033:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r4.mo29929a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p292k.C7352b.m22046a(com.bamtechmedia.dominguez.detail.common.j):void");
    }

    /* renamed from: a */
    private final void m22045a(C3692n nVar) {
        C6020c cVar = this.f16163W;
        if (cVar != null) {
            Object a = cVar.mo18083a(nVar).mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
            C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11842x) a).mo29927a(new C7367m(this, nVar), new C7369n(this, nVar));
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r2v8, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.bamtechmedia.dominguez.detail.common.w] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.bamtechmedia.dominguez.detail.common.w] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v11
      assigns: [com.bamtechmedia.dominguez.detail.common.o, com.bamtechmedia.dominguez.detail.common.w]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.Object, com.bamtechmedia.dominguez.detail.common.o, com.bamtechmedia.dominguez.detail.common.w]
      mth insns count: 58
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bamtechmedia.dominguez.detail.common.C6008x> m22043a(com.bamtechmedia.dominguez.detail.movie.models.C6024b r11, com.bamtechmedia.dominguez.detail.common.C5982j r12) {
        /*
            r10 = this;
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r10.mo17916y()
            java.util.List r0 = r0.mo17877f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = -1289032093(0xffffffffb32aee63, float:-3.979802E-8)
            if (r3 == r4) goto L_0x0077
            r4 = 1090493483(0x40ff9c2b, float:7.9878135)
            if (r3 == r4) goto L_0x005b
            r4 = 1557721666(0x5cd8f242, float:4.88519682E17)
            if (r3 == r4) goto L_0x0031
            goto L_0x008f
        L_0x0031:
            java.lang.String r3 = "details"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008f
            com.bamtechmedia.dominguez.detail.common.w r2 = new com.bamtechmedia.dominguez.detail.common.w
            com.bamtechmedia.dominguez.detail.common.item.a r3 = new com.bamtechmedia.dominguez.detail.common.item.a
            com.bamtechmedia.dominguez.detail.common.e0.c r4 = r11.mo18105X()
            com.bamtechmedia.dominguez.config.r0 r5 = r10.f16174g0
            com.bamtechmedia.dominguez.detail.common.g0.c r6 = r10.mo17916y()
            r3.<init>(r4, r5, r6)
            java.util.List r4 = kotlin.p590y.C13183n.m40498a(r3)
            int r5 = p163g.p201e.p203b.p287k.C7313g.nav_details
            r7 = 0
            r8 = 8
            r9 = 0
            java.lang.String r6 = "moreDetails"
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0090
        L_0x005b:
            java.lang.String r3 = "related"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008f
            com.bamtechmedia.dominguez.detail.common.o r2 = new com.bamtechmedia.dominguez.detail.common.o
            com.bamtechmedia.dominguez.detail.common.u r4 = r11.mo18109a0()
            int r5 = p163g.p201e.p203b.p287k.C7313g.nav_related
            com.bamtechmedia.dominguez.detail.common.u r6 = r11.mo18109a0()
            java.lang.String r6 = r6.mo17987a()
            r2.<init>(r4, r5, r3, r6)
            goto L_0x0090
        L_0x0077:
            java.lang.String r3 = "extras"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008f
            com.bamtechmedia.dominguez.detail.common.o r2 = new com.bamtechmedia.dominguez.detail.common.o
            int r5 = p163g.p201e.p203b.p287k.C7313g.nav_extras
            r7 = 0
            r8 = 8
            r9 = 0
            java.lang.String r6 = "extras"
            r3 = r2
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            if (r2 == 0) goto L_0x0011
            r1.add(r2)
            goto L_0x0011
        L_0x0097:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r1.iterator()
        L_0x00a0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r12.next()
            r1 = r0
            com.bamtechmedia.dominguez.detail.common.x r1 = (com.bamtechmedia.dominguez.detail.common.C6008x) r1
            java.util.List r1 = r1.mo18025a()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a0
            r11.add(r0)
            goto L_0x00a0
        L_0x00bd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p292k.C7352b.m22043a(com.bamtechmedia.dominguez.detail.movie.models.b, com.bamtechmedia.dominguez.detail.common.j):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22048a(C6026d dVar) {
        updateState(new C7375t(dVar));
    }

    /* renamed from: a */
    public void mo17920a(C3692n nVar, boolean z) {
        this.f16168b0.mo20115a(nVar, z);
    }

    /* renamed from: a */
    public void mo17819a(C6008x xVar) {
        this.f16168b0.mo20116a(xVar.mo18027c());
        updateState(new C7374s(xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m22041a(C3690l lVar) {
        int i = C7378c.$EnumSwitchMapping$0[lVar.ordinal()];
        if (i == 1) {
            return C3573a.m12035a(this.f16174g0, C7313g.nav_details, (Map) null, 2, (Object) null);
        }
        if (i == 2) {
            return C3573a.m12035a(this.f16174g0, C7313g.nav_extras, (Map) null, 2, (Object) null);
        }
        if (i != 3) {
            return C3573a.m12035a(this.f16174g0, C7313g.nav_related, (Map) null, 2, (Object) null);
        }
        return C3573a.m12035a(this.f16174g0, C7313g.nav_related, (Map) null, 2, (Object) null);
    }
}
