package p163g.p201e.p203b.p287k.p293k.p297t;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.assets.Participant;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.content.paging.C3703f;
import com.bamtechmedia.dominguez.core.content.paging.C3704g;
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
import com.bamtechmedia.dominguez.detail.common.p228e0.C5923c;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.series.data.C6037a;
import com.bamtechmedia.dominguez.detail.series.data.C6038b;
import com.bamtechmedia.dominguez.detail.series.models.C6044b;
import com.bamtechmedia.dominguez.detail.series.models.C6045c;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import com.bamtechmedia.dominguez.detail.series.models.C6048f;
import com.bamtechmedia.dominguez.offline.C6243d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.reflect.KDeclarationContainer;
import net.danlew.android.joda.DateUtils;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p293k.C7381a;
import p163g.p201e.p203b.p287k.p293k.C7383c;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.C7394e;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p163g.p503n.p504a.C11842x;
import p163g.p503n.p504a.C11844z;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11957k;
import p520io.reactivex.C11974s;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\b\u0012\u0004\u0012\u00020\t0\b:\n\u0001\u0001\u0001\u0001\u0001Bq\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J(\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020LH\u0016J\u001a\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\b\u0010O\u001a\u00020\u0013H\u0002J\u0017\u0010P\u001a\u0004\u0018\u00010\u00132\u0006\u0010Q\u001a\u00020:H\u0002¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020\u0013H\u0002J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020.0UH\u0002J\b\u0010V\u001a\u00020\u0013H\u0002J\u0010\u0010W\u001a\u00020I2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020I2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010[\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010]\u001a\u00020IH\u0016J\u0014\u0010^\u001a\u00020I2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020.0@J$\u0010`\u001a\u00020I2\u0006\u0010Q\u001a\u00020:2\n\u0010a\u001a\u0006\u0012\u0002\b\u00030U2\u0006\u0010b\u001a\u00020\u0013H\u0002J\u0018\u0010c\u001a\u00020I2\u0006\u0010d\u001a\u00020:2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010e\u001a\u00020I2\u0006\u0010b\u001a\u00020\u0013H\u0002J \u0010f\u001a\u00020I2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\u0013H\u0007J\b\u0010k\u001a\u00020IH\u0016J$\u0010l\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020n0m2\u0006\u0010Q\u001a\u00020:2\u0006\u0010o\u001a\u00020nH\u0002J*\u0010p\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020n0m2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020.0@2\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010r\u001a\u00020:2\u0006\u0010s\u001a\u00020tH\u0002J\u0018\u0010u\u001a\u00020I2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010v\u001a\u00020:H\u0002J\u001c\u0010w\u001a\u00020I2\n\u0010a\u001a\u0006\u0012\u0002\b\u00030U2\u0006\u0010x\u001a\u00020\u0013H\u0016J\u0010\u0010y\u001a\u00020I2\u0006\u0010Q\u001a\u00020:H\u0016J \u0010z\u001a\u00020I2\u0006\u0010B\u001a\u00020C2\u0006\u0010{\u001a\u00020|2\u0006\u0010s\u001a\u00020:H\u0002J\u0010\u0010}\u001a\u00020I2\u0006\u0010\\\u001a\u00020AH\u0016J\u0006\u0010~\u001a\u00020IJ+\u0010\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u0013H\u0007J\t\u0010\u0001\u001a\u00020IH\u0016J\u0007\u0010\u0001\u001a\u00020IJ\u0010\u0010
\u0001\u001a\u00020I2\u0007\u0010\u0001\u001a\u00020\u0013J\u001b\u0010\u0001\u001a\u00020I2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\u0015H\u0016J\u0011\u0010\u0001\u001a\u00020I2\u0006\u0010X\u001a\u00020YH\u0002J \u0010\u0001\u001a\u00020I2\u0015\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020n\u0018\u00010mH\u0002J\u0011\u0010\u0001\u001a\u00020I2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010\u0001\u001a\u00020I2\u0007\u0010\u0001\u001a\u00020\u0015H\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010-\u001a\u0004\u0018\u00010.8F@FX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020:XD¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;", "Lcom/bamtechmedia/dominguez/detail/common/DetailViewModel;", "Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel$State;", "Lcom/bamtechmedia/dominguez/detail/common/listeners/OnTabSelectedListener;", "Lcom/bamtechmedia/dominguez/detail/series/DownloadEpisodeClickListener;", "Lcom/bamtechmedia/dominguez/core/content/paging/SeasonsPagingListener;", "Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateObserver;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper$ViewModel;", "Lcom/bamtechmedia/dominguez/core/content/Series;", "dataSource", "Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDetailDataSource;", "downloadDelegate", "Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDownloadDelegate;", "watchlistHelper", "Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper;", "extrasContentDataSource", "Lcom/bamtechmedia/dominguez/detail/common/ExtrasContentDataSource;", "seasonsToDisplayCount", "", "isTelevision", "", "arguments", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;", "analytics", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailAnalytics;", "metadataFactory", "Lcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactory;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "deepLinkActionHandler", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDeepLinkActionHandler;", "(Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDetailDataSource;Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDownloadDelegate;Lcom/bamtechmedia/dominguez/detail/common/DetailWatchlistHelper;Lcom/bamtechmedia/dominguez/detail/common/ExtrasContentDataSource;IZLcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailAnalytics;Lcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactory;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;Lcom/bamtechmedia/dominguez/detail/series/SeriesDeepLinkActionHandler;)V", "getContentDetailConfig", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "contentDetailTransitionState", "getContentDetailTransitionState$contentDetail_release", "()Ljava/lang/Integer;", "setContentDetailTransitionState$contentDetail_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "Lcom/bamtechmedia/dominguez/core/content/Season;", "currentSeason", "getCurrentSeason", "()Lcom/bamtechmedia/dominguez/core/content/Season;", "setCurrentSeason", "(Lcom/bamtechmedia/dominguez/core/content/Season;)V", "initialPageLoaded", "getInitialPageLoaded", "()Z", "setInitialPageLoaded", "(Z)V", "pageName", "", "getPageName", "()Ljava/lang/String;", "getTransactionIdProvider", "()Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "createTabs", "", "Lcom/bamtechmedia/dominguez/detail/common/Tab;", "seriesDetail", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;", "extraContent", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "featuredEpisode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "downloadEpisode", "", "episode", "downloadState", "Lcom/bamtechmedia/dominguez/offline/DownloadState;", "formatMetadata", "Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "getAndIncrementSeasonsLoadedCount", "getAssetListIndex", "seasonId", "(Ljava/lang/String;)Ljava/lang/Integer;", "getEpisodePagingOffset", "getSeasonsList", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "getSeasonsLoadedCount", "handleError", "throwable", "", "initializeCurrentSeason", "isEpisodeTabWithContent", "tab", "loadDetails", "loadEpisodes", "seasonList", "loadMoreEpisodes", "list", "positionInList", "loadMoreExtraContent", "familyId", "loadMoreSeasons", "loadSeasons", "pagedSeasons", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedSeasons;", "seasonsLoadedCount", "seasonsToDisplay", "loadUserData", "mapEpisodeUpdatesToSeason", "", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedEpisodes;", "pagedEpisodes", "mapEpisodesToSeason", "seasons", "mapInitialTabToSeriesDetailString", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "observeSeriesDownloadState", "encodedSeriesId", "onPageItemBound", "pagedListPosition", "onSeasonShelfBound", "onSeriesDetailLoaded", "userData", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesUserData;", "onTabSelected", "onWatchlistClicked", "shouldLoadMoreSeasons", "allSeasonsCount", "currentListPosition", "loadThreshold", "trackAddToWatchlistSuccess", "trackDownloadSeasonClick", "trackSeasonSelected", "seasonNumber", "trackWatchListClick", "asset", "wasInWatchlist", "updateEpisodeStateFail", "updateEpisodeStateSuccess", "map", "updateExtraContent", "updateWatchlistState", "newState", "Companion", "EmptyPagingMetaData", "PagedEpisodesImpl", "SeasonsViewState", "State", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.t.a */
/* compiled from: SeriesDetailViewModel.kt */
public final class C7454a extends C5967h<C7468g> implements C5917a, C7381a, C3704g, C5994b, C3702e, C5970a<C3791v> {

    /* renamed from: U */
    private Integer f16377U;

    /* renamed from: V */
    private final String f16378V = "series_detail";
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6037a f16379W;

    /* renamed from: X */
    private final C6038b f16380X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C5969i f16381Y;

    /* renamed from: Z */
    private final C5983k f16382Z;

    /* renamed from: a0 */
    private final int f16383a0;

    /* renamed from: b0 */
    private final boolean f16384b0;

    /* renamed from: c */
    private boolean f16385c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C7394e f16386c0;

    /* renamed from: d0 */
    private final C7391d f16387d0;

    /* renamed from: e0 */
    private final C5920a f16388e0;

    /* renamed from: f0 */
    private final C3572r0 f16389f0;

    /* renamed from: g0 */
    private final C5948c f16390g0;

    /* renamed from: h0 */
    private final C2366i0 f16391h0;

    /* renamed from: g.e.b.k.k.t.a$a */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7455a implements C11945a {

        /* renamed from: a */
        public static final C7455a f16392a = new C7455a();

        C7455a() {
        }

        public final void run() {
            Timber.m44522a("Handled deep link arguments", new Object[0]);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$a0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7456a0<T> implements C11952h<Map<String, ? extends C6243d>> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16393c;

        C7456a0(C7454a aVar) {
            this.f16393c = aVar;
        }

        /* renamed from: a */
        public final boolean test(Map<String, C6243d> map) {
            C7468g gVar = (C7468g) this.f16393c.getCurrentState();
            C6008x d = gVar != null ? gVar.mo17871d() : null;
            return d == null || d.mo18028d() == C7313g.nav_episodes;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$b */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7457b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7457b f16394c = new C7457b();

        C7457b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Failed to handle deep link arguments", new Object[0]);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0014\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "", "episodeDownloadMap", "", "", "Lcom/bamtechmedia/dominguez/core/content/EpisodeContentId;", "Lcom/bamtechmedia/dominguez/offline/DownloadState;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.t.a$b0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7458b0<T> implements Consumer<Map<String, ? extends C6243d>> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16395c;

        /* renamed from: g.e.b.k.k.t.a$b0$a */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7459a extends C12881k implements Function1<C7468g, C7468g> {

            /* renamed from: c */
            final /* synthetic */ Map f16396c;

            C7459a(Map map) {
                this.f16396c = map;
                super(1);
            }

            /* renamed from: a */
            public final C7468g invoke(C7468g gVar) {
                C7468g gVar2 = gVar;
                Map map = this.f16396c;
                Map map2 = map;
                Intrinsics.checkReturnedValueIsNotNull((Object) map, "episodeDownloadMap");
                return C7468g.m22348a(gVar2, null, null, null, null, null, null, null, null, null, 0, null, map2, false, false, false, false, false, 129023, null);
            }
        }

        C7458b0(C7454a aVar) {
            this.f16395c = aVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C6243d> map) {
            this.f16395c.updateState(new C7459a(map));
        }
    }

    /* renamed from: g.e.b.k.k.t.a$c */
    /* compiled from: SeriesDetailViewModel.kt */
    public static final class C7460c {
        private C7460c() {
        }

        public /* synthetic */ C7460c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.k.k.t.a$c0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7461c0<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ String f16397c;

        C7461c0(String str) {
            this.f16397c = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve download state for encodedSeriesId (");
            sb.append(this.f16397c);
            sb.append(").");
            Timber.m44530c(th, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$d */
    /* compiled from: SeriesDetailViewModel.kt */
    private static final class C7462d implements C3703f {

        /* renamed from: U */
        private static final int f16398U = 0;

        /* renamed from: V */
        private static final int f16399V = 0;

        /* renamed from: W */
        public static final C7462d f16400W = new C7462d();

        /* renamed from: c */
        private static final int f16401c = 0;

        private C7462d() {
        }

        /* renamed from: X */
        public int mo13409X() {
            return f16399V;
        }

        /* renamed from: Y */
        public int mo13410Y() {
            return 0;
        }

        /* renamed from: Z */
        public int mo13411Z() {
            return f16398U;
        }

        /* renamed from: a0 */
        public boolean mo13412a0() {
            return false;
        }

        /* renamed from: b0 */
        public int mo13413b0() {
            return f16401c;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$d0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7463d0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: U */
        final /* synthetic */ C6046d f16402U;

        /* renamed from: V */
        final /* synthetic */ C6048f f16403V;

        /* renamed from: W */
        final /* synthetic */ List f16404W;

        /* renamed from: X */
        final /* synthetic */ C6008x f16405X;

        /* renamed from: c */
        final /* synthetic */ C7454a f16406c;

        C7463d0(C7454a aVar, C6046d dVar, C6048f fVar, List list, C6008x xVar) {
            this.f16406c = aVar;
            this.f16402U = dVar;
            this.f16403V = fVar;
            this.f16404W = list;
            this.f16405X = xVar;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            C3789t f = gVar.mo20354f();
            C6046d dVar = this.f16402U;
            C5982j Y = dVar.mo18282Y();
            C7466f fVar = new C7466f(this.f16402U.mo18287c0(), this.f16406c.m22271H());
            C6048f fVar2 = this.f16403V;
            C3685g a = fVar2.mo18297a();
            if (a == null) {
                a = this.f16402U.mo18290e0();
            }
            C6048f a2 = C6048f.m19380a(fVar2, false, a, null, 5, null);
            C7468g gVar2 = new C7468g(dVar, null, fVar, Y, null, f, this.f16405X, this.f16404W, null, 0, a2, gVar.mo20355g(), false, false, false, false, false, 115474, null);
            return gVar2;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$e */
    /* compiled from: SeriesDetailViewModel.kt */
    public static final class C7464e implements List<C3685g>, C6044b, C12872a {

        /* renamed from: U */
        private final C3703f f16407U;

        /* renamed from: c */
        private final List<C3685g> f16408c;

        public C7464e() {
            this(null, null, 3, null);
        }

        public C7464e(List<? extends C3685g> list, C3703f fVar) {
            this.f16408c = list;
            this.f16407U = fVar;
        }

        /* renamed from: a */
        public boolean mo20312a(C3685g gVar) {
            return this.f16408c.contains(gVar);
        }

        public /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends C3685g> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends C3685g> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public int mo20317b() {
            return this.f16408c.size();
        }

        /* renamed from: b */
        public int mo20318b(C3685g gVar) {
            return this.f16408c.indexOf(gVar);
        }

        /* renamed from: c */
        public int mo20319c(C3685g gVar) {
            return this.f16408c.lastIndexOf(gVar);
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C3685g) {
                return mo20312a((C3685g) obj);
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f16408c.containsAll(collection);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo13457f0(), (java.lang.Object) r3.mo13457f0()) != false) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0023
                boolean r0 = r3 instanceof p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7464e
                if (r0 == 0) goto L_0x0021
                g.e.b.k.k.t.a$e r3 = (p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7464e) r3
                java.util.List<com.bamtechmedia.dominguez.core.content.g> r0 = r2.f16408c
                java.util.List<com.bamtechmedia.dominguez.core.content.g> r1 = r3.f16408c
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0021
                com.bamtechmedia.dominguez.core.content.paging.f r0 = r2.mo13457f0()
                com.bamtechmedia.dominguez.core.content.paging.f r3 = r3.mo13457f0()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r3 = 0
                return r3
            L_0x0023:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7464e.equals(java.lang.Object):boolean");
        }

        /* renamed from: f0 */
        public C3703f mo13457f0() {
            return this.f16407U;
        }

        public C3685g get(int i) {
            Object obj = this.f16408c.get(i);
            Intrinsics.checkReturnedValueIsNotNull(obj, "get(...)");
            return (C3685g) obj;
        }

        public int hashCode() {
            List<C3685g> list = this.f16408c;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            C3703f f0 = mo13457f0();
            if (f0 != null) {
                i = f0.hashCode();
            }
            return hashCode + i;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C3685g) {
                return mo20318b((C3685g) obj);
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f16408c.isEmpty();
        }

        public Iterator<C3685g> iterator() {
            return this.f16408c.iterator();
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C3685g) {
                return mo20319c((C3685g) obj);
            }
            return -1;
        }

        public ListIterator<C3685g> listIterator() {
            return this.f16408c.listIterator();
        }

        public ListIterator<C3685g> listIterator(int i) {
            return this.f16408c.listIterator(i);
        }

        public /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<C3685g> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return mo20317b();
        }

        public void sort(Comparator<? super C3685g> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<C3685g> subList(int i, int i2) {
            return this.f16408c.subList(i, i2);
        }

        public Object[] toArray() {
            return C12871f.m40215a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            return C12871f.m40216a(this, tArr);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PagedEpisodesImpl(list=");
            sb.append(this.f16408c);
            sb.append(", meta=");
            sb.append(mo13457f0());
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7464e(List list, C3703f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                fVar = C7462d.f16400W;
            }
            this(list, fVar);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$e0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7465e0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        final /* synthetic */ C6008x f16409c;

        C7465e0(C6008x xVar) {
            this.f16409c = xVar;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            return C7468g.m22348a(gVar, null, null, null, null, null, null, this.f16409c, null, null, C13199w.m40555a(gVar.mo17870c(), (Object) gVar.mo17871d()), null, null, false, false, false, false, false, 130495, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$f */
    /* compiled from: SeriesDetailViewModel.kt */
    public static final class C7466f {

        /* renamed from: a */
        private final C6045c f16410a;

        /* renamed from: b */
        private final int f16411b;

        public C7466f() {
            this(null, 0, 3, null);
        }

        public C7466f(C6045c cVar, int i) {
            this.f16410a = cVar;
            this.f16411b = i;
        }

        /* renamed from: a */
        public static /* synthetic */ C7466f m22343a(C7466f fVar, C6045c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = fVar.f16410a;
            }
            if ((i2 & 2) != 0) {
                i = fVar.f16411b;
            }
            return fVar.mo20346a(cVar, i);
        }

        /* renamed from: a */
        public final C6045c mo20345a() {
            return this.f16410a;
        }

        /* renamed from: a */
        public final C7466f mo20346a(C6045c cVar, int i) {
            return new C7466f(cVar, i);
        }

        /* renamed from: b */
        public final int mo20347b() {
            return this.f16411b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7466f) {
                    C7466f fVar = (C7466f) obj;
                    if (Intrinsics.areEqual((Object) this.f16410a, (Object) fVar.f16410a)) {
                        if (this.f16411b == fVar.f16411b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6045c cVar = this.f16410a;
            return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f16411b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SeasonsViewState(seasons=");
            sb.append(this.f16410a);
            sb.append(", seasonsLoadedCount=");
            sb.append(this.f16411b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7466f(C6045c cVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                cVar = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            this(cVar, i);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$f0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7467f0 extends C12881k implements Function2<C3791v, Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16412c;

        C7467f0(C7454a aVar) {
            this.f16412c = aVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20351a(C3791v vVar, boolean z) {
            this.f16412c.f16381Y.mo17919a(vVar, z, (C5970a<T>) this.f16412c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20351a((C3791v) obj, ((Boolean) obj2).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$g */
    /* compiled from: SeriesDetailViewModel.kt */
    public static final class C7468g extends C5968a {

        /* renamed from: a */
        private final C6046d f16413a;

        /* renamed from: b */
        private final C3791v f16414b;

        /* renamed from: c */
        private final C7466f f16415c;

        /* renamed from: d */
        private final C5982j f16416d;

        /* renamed from: e */
        private final Map<String, C6044b> f16417e;

        /* renamed from: f */
        private final C3789t f16418f;

        /* renamed from: g */
        private final C6008x f16419g;

        /* renamed from: h */
        private final List<C6008x> f16420h;

        /* renamed from: i */
        private final Map<String, Object> f16421i;

        /* renamed from: j */
        private int f16422j;

        /* renamed from: k */
        private final C6048f f16423k;

        /* renamed from: l */
        private final Map<String, C6243d> f16424l;

        /* renamed from: m */
        private final boolean f16425m;

        /* renamed from: n */
        private final boolean f16426n;

        /* renamed from: o */
        private final boolean f16427o;

        /* renamed from: p */
        private final boolean f16428p;

        /* renamed from: q */
        private final boolean f16429q;

        public C7468g() {
            this(null, null, null, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 131071, null);
        }

        public /* synthetic */ C7468g(C6046d dVar, C3791v vVar, C7466f fVar, C5982j jVar, Map map, C3789t tVar, C6008x xVar, List list, Map map2, int i, C6048f fVar2, Map map3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            int i3 = i2;
            C6048f fVar3 = null;
            C6046d dVar2 = (i3 & 1) != 0 ? null : dVar;
            C3791v vVar2 = (i3 & 2) != 0 ? dVar2 != null ? dVar2.mo18288d0() : null : vVar;
            C7466f fVar4 = (i3 & 4) != 0 ? new C7466f(null, 0, 3, null) : fVar;
            C5982j jVar2 = (i3 & 8) != 0 ? null : jVar;
            Map map4 = (i3 & 16) != 0 ? null : map;
            C3789t tVar2 = (i3 & 32) != 0 ? null : tVar;
            C6008x xVar2 = (i3 & 64) != 0 ? null : xVar;
            List a = (i3 & 128) != 0 ? C13185o.m40513a() : list;
            Map a2 = (i3 & 256) != 0 ? C13173j0.m40350a() : map2;
            int i4 = (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? 0 : i;
            if ((i3 & 1024) == 0) {
                fVar3 = fVar2;
            }
            this(dVar2, vVar2, fVar4, jVar2, map4, tVar2, xVar2, a, a2, i4, fVar3, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? C13173j0.m40350a() : map3, (i3 & 4096) != 0 ? false : z, (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? false : z2, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? false : z3, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z4, (i3 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? false : z5);
        }

        /* renamed from: a */
        public static /* synthetic */ C7468g m22348a(C7468g gVar, C6046d dVar, C3791v vVar, C7466f fVar, C5982j jVar, Map map, C3789t tVar, C6008x xVar, List list, Map map2, int i, C6048f fVar2, Map map3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            C7468g gVar2 = gVar;
            int i3 = i2;
            return gVar.mo20352a((i3 & 1) != 0 ? gVar2.f16413a : dVar, (i3 & 2) != 0 ? gVar2.f16414b : vVar, (i3 & 4) != 0 ? gVar2.f16415c : fVar, (i3 & 8) != 0 ? gVar2.f16416d : jVar, (i3 & 16) != 0 ? gVar2.f16417e : map, (i3 & 32) != 0 ? gVar2.f16418f : tVar, (i3 & 64) != 0 ? gVar.mo17871d() : xVar, (i3 & 128) != 0 ? gVar.mo17870c() : list, (i3 & 256) != 0 ? gVar.mo20360k() : map2, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? gVar2.f16422j : i, (i3 & 1024) != 0 ? gVar2.f16423k : fVar2, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? gVar2.f16424l : map3, (i3 & 4096) != 0 ? gVar2.f16425m : z, (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? gVar2.f16426n : z2, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? gVar2.f16427o : z3, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? gVar.mo17816e() : z4, (i3 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? gVar.mo17815b() : z5);
        }

        /* renamed from: a */
        public final C7468g mo20352a(C6046d dVar, C3791v vVar, C7466f fVar, C5982j jVar, Map<String, ? extends C6044b> map, C3789t tVar, C6008x xVar, List<? extends C6008x> list, Map<String, ? extends Object> map2, int i, C6048f fVar2, Map<String, C6243d> map3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C7468g gVar = new C7468g(dVar, vVar, fVar, jVar, map, tVar, xVar, list, map2, i, fVar2, map3, z, z2, z3, z4, z5);
            return gVar;
        }

        /* renamed from: a */
        public boolean mo17814a() {
            return this.f16425m && this.f16426n && this.f16414b == null;
        }

        /* renamed from: b */
        public boolean mo17815b() {
            return this.f16429q;
        }

        /* renamed from: c */
        public List<C6008x> mo17870c() {
            return this.f16420h;
        }

        /* renamed from: d */
        public C6008x mo17871d() {
            return this.f16419g;
        }

        /* renamed from: e */
        public boolean mo17816e() {
            return this.f16428p;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7468g) {
                    C7468g gVar = (C7468g) obj;
                    if (Intrinsics.areEqual((Object) this.f16413a, (Object) gVar.f16413a) && Intrinsics.areEqual((Object) this.f16414b, (Object) gVar.f16414b) && Intrinsics.areEqual((Object) this.f16415c, (Object) gVar.f16415c) && Intrinsics.areEqual((Object) this.f16416d, (Object) gVar.f16416d) && Intrinsics.areEqual((Object) this.f16417e, (Object) gVar.f16417e) && Intrinsics.areEqual((Object) this.f16418f, (Object) gVar.f16418f) && Intrinsics.areEqual((Object) mo17871d(), (Object) gVar.mo17871d()) && Intrinsics.areEqual((Object) mo17870c(), (Object) gVar.mo17870c()) && Intrinsics.areEqual((Object) mo20360k(), (Object) gVar.mo20360k())) {
                        if ((this.f16422j == gVar.f16422j) && Intrinsics.areEqual((Object) this.f16423k, (Object) gVar.f16423k) && Intrinsics.areEqual((Object) this.f16424l, (Object) gVar.f16424l)) {
                            if (this.f16425m == gVar.f16425m) {
                                if (this.f16426n == gVar.f16426n) {
                                    if (this.f16427o == gVar.f16427o) {
                                        if (mo17816e() == gVar.mo17816e()) {
                                            if (mo17815b() == gVar.mo17815b()) {
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
        public final C3789t mo20354f() {
            return this.f16418f;
        }

        /* renamed from: g */
        public final Map<String, C6243d> mo20355g() {
            return this.f16424l;
        }

        /* renamed from: h */
        public final Map<String, C6044b> mo20356h() {
            return this.f16417e;
        }

        public int hashCode() {
            C6046d dVar = this.f16413a;
            int i = 0;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            C3791v vVar = this.f16414b;
            int hashCode2 = (hashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
            C7466f fVar = this.f16415c;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            C5982j jVar = this.f16416d;
            int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            Map<String, C6044b> map = this.f16417e;
            int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
            C3789t tVar = this.f16418f;
            int hashCode6 = (hashCode5 + (tVar != null ? tVar.hashCode() : 0)) * 31;
            C6008x d = mo17871d();
            int hashCode7 = (hashCode6 + (d != null ? d.hashCode() : 0)) * 31;
            List c = mo17870c();
            int hashCode8 = (hashCode7 + (c != null ? c.hashCode() : 0)) * 31;
            Map k = mo20360k();
            int hashCode9 = (((hashCode8 + (k != null ? k.hashCode() : 0)) * 31) + this.f16422j) * 31;
            C6048f fVar2 = this.f16423k;
            int hashCode10 = (hashCode9 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
            Map<String, C6243d> map2 = this.f16424l;
            if (map2 != null) {
                i = map2.hashCode();
            }
            int i2 = (hashCode10 + i) * 31;
            boolean z = this.f16425m;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f16426n;
            if (z2) {
                z2 = true;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f16427o;
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
        public final C5982j mo20358i() {
            return this.f16416d;
        }

        /* renamed from: j */
        public final String mo20359j() {
            C3791v vVar = this.f16414b;
            if (vVar != null) {
                return vVar.mo13264e();
            }
            return null;
        }

        /* renamed from: k */
        public Map<String, Object> mo20360k() {
            return this.f16421i;
        }

        /* renamed from: l */
        public final C7466f mo20361l() {
            return this.f16415c;
        }

        /* renamed from: m */
        public final C3791v mo20362m() {
            return this.f16414b;
        }

        /* renamed from: n */
        public final C6046d mo20363n() {
            return this.f16413a;
        }

        /* renamed from: o */
        public final C6048f mo20364o() {
            return this.f16423k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(seriesDetail=");
            sb.append(this.f16413a);
            sb.append(", series=");
            sb.append(this.f16414b);
            sb.append(", seasonsViewState=");
            sb.append(this.f16415c);
            sb.append(", extraContent=");
            sb.append(this.f16416d);
            sb.append(", episodes=");
            sb.append(this.f16417e);
            sb.append(", currentSeason=");
            sb.append(this.f16418f);
            sb.append(", activeTab=");
            sb.append(mo17871d());
            sb.append(", tabs=");
            sb.append(mo17870c());
            sb.append(", itemViewState=");
            sb.append(mo20360k());
            sb.append(", lastSelectedTabPosition=");
            sb.append(this.f16422j);
            sb.append(", userData=");
            sb.append(this.f16423k);
            sb.append(", episodeDownloadMap=");
            sb.append(this.f16424l);
            sb.append(", seriesDetailFailed=");
            sb.append(this.f16425m);
            sb.append(", userSeriesDetailFailed=");
            sb.append(this.f16426n);
            sb.append(", episodeLoadFailed=");
            sb.append(this.f16427o);
            sb.append(", missingResource=");
            sb.append(mo17816e());
            sb.append(", filteredByKidsMode=");
            sb.append(mo17815b());
            sb.append(")");
            return sb.toString();
        }

        public C7468g(C6046d dVar, C3791v vVar, C7466f fVar, C5982j jVar, Map<String, ? extends C6044b> map, C3789t tVar, C6008x xVar, List<? extends C6008x> list, Map<String, ? extends Object> map2, int i, C6048f fVar2, Map<String, C6243d> map3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C6008x xVar2 = xVar;
            List<? extends C6008x> list2 = list;
            Map<String, ? extends Object> map4 = map2;
            super(xVar, list, map2);
            this.f16413a = dVar;
            this.f16414b = vVar;
            this.f16415c = fVar;
            this.f16416d = jVar;
            this.f16417e = map;
            this.f16418f = tVar;
            this.f16419g = xVar2;
            this.f16420h = list2;
            this.f16421i = map4;
            this.f16422j = i;
            this.f16423k = fVar2;
            this.f16424l = map3;
            this.f16425m = z;
            this.f16426n = z2;
            this.f16427o = z3;
            this.f16428p = z4;
            this.f16429q = z5;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$g0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7469g0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        public static final C7469g0 f16430c = new C7469g0();

        C7469g0() {
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, null, null, false, false, true, false, false, 114687, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$h */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7470h extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        final /* synthetic */ C3789t f16431c;

        C7470h(C3789t tVar) {
            this.f16431c = tVar;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            return C7468g.m22348a(gVar, null, null, null, null, null, this.f16431c, null, null, null, 0, null, null, false, false, false, false, false, 131039, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$h0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7471h0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        final /* synthetic */ Map f16432c;

        C7471h0(Map map) {
            this.f16432c = map;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            Map map;
            if (this.f16432c == null || gVar.mo20356h() == null) {
                map = this.f16432c;
            } else {
                map = C13173j0.m40353a(gVar.mo20356h(), this.f16432c);
            }
            return C7468g.m22348a(gVar, null, null, null, null, map, null, null, null, null, 0, null, null, false, false, false, false, false, 114671, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$i */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7472i extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        final /* synthetic */ int f16433c;

        C7472i(int i) {
            this.f16433c = i;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            C7466f l = gVar.mo20361l();
            C7466f fVar = null;
            if (l != null) {
                fVar = C7466f.m22343a(l, null, this.f16433c, 1, null);
            }
            return C7468g.m22348a(gVar, null, null, fVar, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 131067, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$i0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7473i0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: U */
        final /* synthetic */ C7454a f16434U;

        /* renamed from: V */
        final /* synthetic */ C5982j f16435V;

        /* renamed from: c */
        final /* synthetic */ C6046d f16436c;

        C7473i0(C6046d dVar, C7454a aVar, C5982j jVar) {
            this.f16436c = dVar;
            this.f16434U = aVar;
            this.f16435V = jVar;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            Object obj;
            boolean z;
            C7454a aVar = this.f16434U;
            C6046d dVar = this.f16436c;
            C5982j jVar = this.f16435V;
            C6048f o = gVar.mo20364o();
            List a = aVar.m22279a(dVar, jVar, o != null ? o.mo18297a() : null);
            C5982j jVar2 = this.f16435V;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int d = ((C6008x) obj).mo18028d();
                Object currentState = this.f16434U.getCurrentState();
                if (currentState != null) {
                    C6008x d2 = ((C7468g) currentState).mo17871d();
                    if (d2 == null || d != d2.mo18028d()) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            return C7468g.m22348a(gVar, null, null, null, jVar2, null, null, (C6008x) obj, a, null, 0, null, null, false, false, false, false, false, 130871, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$j */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7474j extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        public static final C7474j f16437c = new C7474j();

        C7474j() {
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, null, null, false, false, false, true, false, 98303, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$j0 */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7475j0 extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        final /* synthetic */ boolean f16438c;

        C7475j0(boolean z) {
            this.f16438c = z;
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            C6048f o = gVar.mo20364o();
            return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, o != null ? C6048f.m19380a(o, this.f16438c, null, null, 6, null) : null, null, false, false, false, false, false, 130047, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$k */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7476k extends C12881k implements Function1<C7468g, C7468g> {

        /* renamed from: c */
        public static final C7476k f16439c = new C7476k();

        C7476k() {
            super(1);
        }

        /* renamed from: a */
        public final C7468g invoke(C7468g gVar) {
            return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, null, null, false, false, false, false, true, 65535, null);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$l */
    /* compiled from: Singles.kt */
    public static final class C7477l<T1, T2, R> implements C11947c<C6046d, C6048f, R> {
        public final R apply(C6046d dVar, C6048f fVar) {
            return C12907r.m40244a(dVar, fVar);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$m */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7478m<T> implements Consumer<Pair<? extends C6046d, ? extends C6048f>> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16440c;

        C7478m(C7454a aVar) {
            this.f16440c = aVar;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends C6046d, C6048f> pair) {
            C7454a aVar = this.f16440c;
            Object c = pair.mo31015c();
            Intrinsics.checkReturnedValueIsNotNull(c, "pair.first");
            C6046d dVar = (C6046d) c;
            Object d = pair.mo31016d();
            Intrinsics.checkReturnedValueIsNotNull(d, "pair.second");
            C6048f fVar = (C6048f) d;
            C7454a aVar2 = this.f16440c;
            aVar.m22289a(dVar, fVar, aVar2.m22277a(aVar2.f16386c0.mo20232a0()));
        }
    }

    /* renamed from: g.e.b.k.k.t.a$n */
    /* compiled from: SeriesDetailViewModel.kt */
    static final /* synthetic */ class C7479n extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7479n f16441c = new C7479n();

        C7479n() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20375a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20375a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.t.a$o */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7480o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16442c;

        /* renamed from: g.e.b.k.k.t.a$o$a */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7481a extends C12881k implements Function1<C7468g, C7468g> {

            /* renamed from: c */
            public static final C7481a f16443c = new C7481a();

            C7481a() {
                super(1);
            }

            /* renamed from: a */
            public final C7468g invoke(C7468g gVar) {
                return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, null, null, false, true, false, false, false, 122879, null);
            }
        }

        C7480o(C7454a aVar) {
            this.f16442c = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16442c.updateState(C7481a.f16443c);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$p */
    /* compiled from: SeriesDetailViewModel.kt */
    static final /* synthetic */ class C7482p extends C12879i implements Function1<C6046d, C13145v> {
        C7482p(C7454a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo20378a(C6046d dVar) {
            ((C7454a) this.receiver).m22288a(dVar);
        }

        public final String getName() {
            return "initializeCurrentSeason";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7454a.class);
        }

        public final String getSignature() {
            return "initializeCurrentSeason(Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20378a((C6046d) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.t.a$q */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7483q<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16444c;

        /* renamed from: g.e.b.k.k.t.a$q$a */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7484a extends C12881k implements Function1<C7468g, C7468g> {

            /* renamed from: c */
            public static final C7484a f16445c = new C7484a();

            C7484a() {
                super(1);
            }

            /* renamed from: a */
            public final C7468g invoke(C7468g gVar) {
                return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, null, null, true, false, false, false, false, 126975, null);
            }
        }

        C7483q(C7454a aVar) {
            this.f16444c = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            if (th instanceof C11998a) {
                List<Throwable> a = ((C11998a) th).mo30334a();
                Intrinsics.checkReturnedValueIsNotNull((Object) a, "throwable.exceptions");
                for (Throwable th2 : a) {
                    C7454a aVar = this.f16444c;
                    Intrinsics.checkReturnedValueIsNotNull((Object) th2, "it");
                    aVar.m22297a(th2);
                }
            } else {
                C7454a aVar2 = this.f16444c;
                Intrinsics.checkReturnedValueIsNotNull((Object) th, "throwable");
                aVar2.m22297a(th);
            }
            this.f16444c.updateState(C7484a.f16445c);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$r */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7485r<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ List f16446U;

        /* renamed from: c */
        final /* synthetic */ C7454a f16447c;

        C7485r(C7454a aVar, List list) {
            this.f16447c = aVar;
            this.f16446U = list;
        }

        /* renamed from: a */
        public final Map<String, C6044b> apply(C6044b bVar) {
            return this.f16447c.m22284a(this.f16446U, bVar);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$s */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7486s<T> implements Consumer<Map<String, ? extends C6044b>> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16448c;

        C7486s(C7454a aVar) {
            this.f16448c = aVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends C6044b> map) {
            this.f16448c.m22298a(map);
        }
    }

    /* renamed from: g.e.b.k.k.t.a$t */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7487t<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16449c;

        C7487t(C7454a aVar) {
            this.f16449c = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C7454a aVar = this.f16449c;
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            aVar.m22303b(th);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "previousEpisodes", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedEpisodes;", "selectedSeason", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.t.a$u */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7488u extends C12881k implements Function2<C6044b, String, Disposable> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16450c;

        /* renamed from: g.e.b.k.k.t.a$u$a */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7489a<T, R> implements Function<T, R> {

            /* renamed from: U */
            final /* synthetic */ String f16451U;

            /* renamed from: c */
            final /* synthetic */ C7488u f16452c;

            C7489a(C7488u uVar, String str) {
                this.f16452c = uVar;
                this.f16451U = str;
            }

            /* renamed from: a */
            public final Map<String, C6044b> apply(C6044b bVar) {
                return this.f16452c.f16450c.m22283a(this.f16451U, bVar);
            }
        }

        /* renamed from: g.e.b.k.k.t.a$u$b */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7490b<T> implements Consumer<Map<String, ? extends C6044b>> {

            /* renamed from: c */
            final /* synthetic */ C7488u f16453c;

            C7490b(C7488u uVar) {
                this.f16453c = uVar;
            }

            /* renamed from: a */
            public final void accept(Map<String, ? extends C6044b> map) {
                this.f16453c.f16450c.m22298a(map);
            }
        }

        /* renamed from: g.e.b.k.k.t.a$u$c */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7491c<T> implements Consumer<Throwable> {

            /* renamed from: c */
            final /* synthetic */ C7488u f16454c;

            C7491c(C7488u uVar) {
                this.f16454c = uVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C7454a aVar = this.f16454c.f16450c;
                Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
                aVar.m22303b(th);
            }
        }

        C7488u(C7454a aVar) {
            this.f16450c = aVar;
            super(2);
        }

        /* renamed from: a */
        public final Disposable invoke(C6044b bVar, String str) {
            Maybe f = this.f16450c.f16379W.mo18134a(bVar, str, this.f16450c.mo17913B()).mo30131f(new C7489a(this, str));
            Intrinsics.checkReturnedValueIsNotNull((Object) f, "dataSource.loadNextPage(…es)\n                    }");
            Object a = f.mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(this.f16450c.getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            return ((C11844z) a).mo29929a(new C7490b(this), new C7491c(this));
        }
    }

    /* renamed from: g.e.b.k.k.t.a$v */
    /* compiled from: SeriesDetailViewModel.kt */
    static final /* synthetic */ class C7492v extends C12879i implements Function1<C5982j, C13145v> {
        C7492v(C7454a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo20388a(C5982j jVar) {
            ((C7454a) this.receiver).m22286a(jVar);
        }

        public final String getName() {
            return "updateExtraContent";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7454a.class);
        }

        public final String getSignature() {
            return "updateExtraContent(Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20388a((C5982j) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$w */
    /* compiled from: SeriesDetailViewModel.kt */
    static final /* synthetic */ class C7493w extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7493w f16455c = new C7493w();

        C7493w() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20389a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20389a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.k.k.t.a$x */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7494x<T> implements C11952h<C6048f> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16456c;

        C7494x(C7454a aVar) {
            this.f16456c = aVar;
        }

        /* renamed from: a */
        public final boolean test(C6048f fVar) {
            C7468g gVar = (C7468g) this.f16456c.getCurrentState();
            return !Intrinsics.areEqual((Object) fVar, (Object) gVar != null ? gVar.mo20364o() : null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "newUserData", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesUserData;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.t.a$y */
    /* compiled from: SeriesDetailViewModel.kt */
    static final class C7495y<T> implements Consumer<C6048f> {

        /* renamed from: c */
        final /* synthetic */ C7454a f16457c;

        /* renamed from: g.e.b.k.k.t.a$y$a */
        /* compiled from: SeriesDetailViewModel.kt */
        static final class C7496a extends C12881k implements Function1<C7468g, C7468g> {

            /* renamed from: c */
            final /* synthetic */ C6048f f16458c;

            C7496a(C6048f fVar) {
                this.f16458c = fVar;
                super(1);
            }

            /* renamed from: a */
            public final C7468g invoke(C7468g gVar) {
                return C7468g.m22348a(gVar, null, null, null, null, null, null, null, null, null, 0, this.f16458c, null, false, false, false, false, false, 130047, null);
            }
        }

        C7495y(C7454a aVar) {
            this.f16457c = aVar;
        }

        /* renamed from: a */
        public final void accept(C6048f fVar) {
            this.f16457c.updateState(new C7496a(fVar));
        }
    }

    /* renamed from: g.e.b.k.k.t.a$z */
    /* compiled from: SeriesDetailViewModel.kt */
    static final /* synthetic */ class C7497z extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7497z f16459c = new C7497z();

        C7497z() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20393a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20393a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7460c(null);
    }

    public C7454a(C6037a aVar, C6038b bVar, C5969i iVar, C5983k kVar, int i, boolean z, C7394e eVar, C7391d dVar, C5920a aVar2, C3572r0 r0Var, C5948c cVar, C2366i0 i0Var, C7383c cVar2) {
        this.f16379W = aVar;
        this.f16380X = bVar;
        this.f16381Y = iVar;
        this.f16382Z = kVar;
        this.f16383a0 = i;
        this.f16384b0 = z;
        this.f16386c0 = eVar;
        this.f16387d0 = dVar;
        this.f16388e0 = aVar2;
        this.f16389f0 = r0Var;
        this.f16390g0 = cVar;
        this.f16391h0 = i0Var;
        C7468g gVar = new C7468g(null, this.f16386c0.mo20231Z(), null, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 131069, null);
        createState(gVar);
        mo18036m();
        C6038b bVar2 = this.f16380X;
        if (bVar2 != null) {
            m22287a(bVar2, this.f16386c0.mo20226C());
        }
        Object a = cVar2.mo20211a(this).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(C7455a.f16392a, C7457b.f16394c);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final int m22271H() {
        if (!this.f16384b0) {
            return this.f16383a0;
        }
        int K = m22274K() + this.f16383a0;
        updateState(new C7472i(K));
        return K;
    }

    /* renamed from: I */
    private final int m22272I() {
        boolean z = this.f16384b0;
        if (z) {
            return 3;
        }
        if (!z) {
            return 7;
        }
        throw new C12898l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bamtechmedia.dominguez.core.content.paging.C3700c<com.bamtechmedia.dominguez.core.content.C3789t> m22273J() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.getCurrentState()
            g.e.b.k.k.t.a$g r0 = (p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g) r0
            r1 = 0
            if (r0 == 0) goto L_0x0014
            g.e.b.k.k.t.a$f r0 = r0.mo20361l()
            if (r0 == 0) goto L_0x0014
            com.bamtechmedia.dominguez.detail.series.models.c r0 = r0.mo20345a()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            boolean r2 = r0 instanceof com.bamtechmedia.dominguez.core.content.paging.C3700c
            if (r2 != 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            com.bamtechmedia.dominguez.core.content.paging.c r0 = com.bamtechmedia.dominguez.core.content.paging.C3701d.m12588a()
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.m22273J():com.bamtechmedia.dominguez.core.content.paging.c");
    }

    /* renamed from: K */
    private final int m22274K() {
        C7468g gVar = (C7468g) getCurrentState();
        if (gVar != null) {
            C7466f l = gVar.mo20361l();
            if (l != null) {
                return l.mo20347b();
            }
        }
        return 0;
    }

    /* renamed from: A */
    public String mo17912A() {
        return this.f16378V;
    }

    /* renamed from: C */
    public C2366i0 mo17914C() {
        return this.f16391h0;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [g.e.b.k.k.t.a$z, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.e.b.k.k.t.c] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17915D() {
        /*
            r4 = this;
            com.bamtechmedia.dominguez.detail.series.data.a r0 = r4.f16379W
            g.e.b.k.k.e r1 = r4.f16386c0
            java.lang.String r1 = r1.mo20226C()
            java.lang.String r2 = r4.mo17913B()
            io.reactivex.Single r0 = r0.mo18135a(r1, r2)
            g.e.b.k.k.t.a$x r1 = new g.e.b.k.k.t.a$x
            r1.<init>(r4)
            io.reactivex.Maybe r0 = r0.mo30202a(r1)
            java.lang.String r1 = "dataSource.getSeriesUser… currentState?.userData }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.c0 r1 = r4.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30112a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.z r0 = (p163g.p503n.p504a.C11844z) r0
            g.e.b.k.k.t.a$y r1 = new g.e.b.k.k.t.a$y
            r1.<init>(r4)
            g.e.b.k.k.t.a$z r2 = p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7497z.f16459c
            if (r2 == 0) goto L_0x0040
            g.e.b.k.k.t.c r3 = new g.e.b.k.k.t.c
            r3.<init>(r2)
            r2 = r3
        L_0x0040:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo29929a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.mo17915D():void");
    }

    /* renamed from: E */
    public final Integer mo20297E() {
        return this.f16377U;
    }

    /* renamed from: F */
    public final C3789t mo20298F() {
        C7468g gVar = (C7468g) getCurrentState();
        if (gVar != null) {
            return gVar.mo20354f();
        }
        return null;
    }

    /* renamed from: G */
    public final void mo20299G() {
        C7468g gVar = (C7468g) getCurrentState();
        Boolean bool = null;
        Object m = gVar != null ? gVar.mo20362m() : null;
        C7468g gVar2 = (C7468g) getCurrentState();
        if (gVar2 != null) {
            C6048f o = gVar2.mo20364o();
            if (o != null) {
                bool = Boolean.valueOf(o.mo18300c());
            }
        }
        C5884x.m18949a(m, bool, new C7467f0(this));
    }

    /* renamed from: a */
    public final boolean mo20305a(int i, int i2, int i3, int i4) {
        return i > i2 && i4 >= i2 - (i3 + 1);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [kotlin.jvm.functions.Function1, g.e.b.k.k.t.a$n] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r3v2, types: [g.e.b.k.k.t.c] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18036m() {
        /*
            r4 = this;
            g.e.b.k.k.e r0 = r4.f16386c0
            java.lang.String r0 = r0.mo20226C()
            com.bamtechmedia.dominguez.detail.series.data.a r1 = r4.f16379W
            java.lang.String r2 = r4.mo17913B()
            io.reactivex.Single r1 = r1.mo18139b(r0, r2)
            g.e.b.k.k.t.a$p r2 = new g.e.b.k.k.t.a$p
            r2.<init>(r4)
            g.e.b.k.k.t.c r3 = new g.e.b.k.k.t.c
            r3.<init>(r2)
            io.reactivex.Single r1 = r1.mo30227d(r3)
            g.e.b.k.k.t.a$q r2 = new g.e.b.k.k.t.a$q
            r2.<init>(r4)
            io.reactivex.Single r1 = r1.mo30218b(r2)
            java.lang.String r2 = "dataSource.getSeriesDeta…d = true) }\n            }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            com.bamtechmedia.dominguez.detail.series.data.a r2 = r4.f16379W
            java.lang.String r3 = r4.mo17913B()
            io.reactivex.Single r0 = r2.mo18135a(r0, r3)
            g.e.b.k.k.t.a$o r2 = new g.e.b.k.k.t.a$o
            r2.<init>(r4)
            io.reactivex.Single r0 = r0.mo30218b(r2)
            java.lang.String r2 = "dataSource.getSeriesUser…sDetailFailed = true) } }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            io.reactivex.d0.b r2 = p520io.reactivex.p524d0.C11918b.f27600a
            g.e.b.k.k.t.a$l r2 = new g.e.b.k.k.t.a$l
            r2.<init>()
            io.reactivex.Single r0 = p520io.reactivex.Single.m38390a(r1, r0, r2)
            java.lang.String r1 = "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.c0 r1 = r4.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30215a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.d0 r0 = (p163g.p503n.p504a.C11792d0) r0
            g.e.b.k.k.t.a$m r1 = new g.e.b.k.k.t.a$m
            r1.<init>(r4)
            g.e.b.k.k.t.a$n r2 = p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7479n.f16441c
            if (r2 == 0) goto L_0x0076
            g.e.b.k.k.t.c r3 = new g.e.b.k.k.t.c
            r3.<init>(r2)
            r2 = r3
        L_0x0076:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo29920a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.mo18036m():void");
    }

    /* renamed from: r */
    public void mo17923r() {
        this.f16387d0.mo20224e();
    }

    /* renamed from: y */
    public C5948c mo17916y() {
        return this.f16390g0;
    }

    /* renamed from: b */
    public void mo17921b(boolean z) {
        updateState(new C7475j0(z));
    }

    /* renamed from: b */
    private final Integer m22301b(String str) {
        Iterator it = m22273J().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((Object) ((C3789t) it.next()).mo12992E(), (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22303b(Throwable th) {
        Timber.m44527b(th);
        updateState(C7469g0.f16430c);
    }

    /* renamed from: a */
    public final void mo20300a(C3789t tVar) {
        updateState(new C7470h(tVar));
    }

    /* renamed from: a */
    public final void mo20303a(Integer num) {
        this.f16377U = num;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22286a(C5982j jVar) {
        C7468g gVar = (C7468g) getCurrentState();
        if (gVar != null) {
            C6046d n = gVar.mo20363n();
            if (n != null) {
                updateState(new C7473i0(n, this, jVar));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [g.e.b.k.k.t.a$w, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r1v1, types: [g.e.b.k.k.t.c] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22296a(java.lang.String r3, com.bamtechmedia.dominguez.detail.common.C5982j r4) {
        /*
            r2 = this;
            com.bamtechmedia.dominguez.detail.common.k r0 = r2.f16382Z
            java.lang.String r1 = r2.mo17913B()
            io.reactivex.Maybe r3 = r0.mo17936a(r3, r4, r1)
            g.n.a.c0 r4 = r2.getViewModelScope()
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30112a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            g.n.a.z r3 = (p163g.p503n.p504a.C11844z) r3
            g.e.b.k.k.t.a$v r4 = new g.e.b.k.k.t.a$v
            r4.<init>(r2)
            g.e.b.k.k.t.c r0 = new g.e.b.k.k.t.c
            r0.<init>(r4)
            g.e.b.k.k.t.a$w r4 = p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7493w.f16455c
            if (r4 == 0) goto L_0x0031
            g.e.b.k.k.t.c r1 = new g.e.b.k.k.t.c
            r1.<init>(r4)
            r4 = r1
        L_0x0031:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r3.mo29929a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.m22296a(java.lang.String, com.bamtechmedia.dominguez.detail.common.j):void");
    }

    /* renamed from: a */
    private final void m22287a(C6038b bVar, String str) {
        Flowable a = bVar.mo18176a(str).mo30069a((C11952h<? super T>) new C7456a0<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "downloadDelegate.getDown…av_episodes\n            }");
        Object a2 = a.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a2).mo29927a(new C7458b0(this), new C7461c0(str));
    }

    /* renamed from: a */
    public void mo17920a(C3791v vVar, boolean z) {
        this.f16387d0.mo20219a(z);
    }

    /* renamed from: a */
    public void mo17819a(C6008x xVar) {
        int d = xVar.mo18028d();
        if (d == C7313g.nav_extras) {
            this.f16387d0.mo20222c();
        } else if (d == C7313g.nav_related) {
            this.f16387d0.mo20223d();
        } else if (d == C7313g.nav_episodes) {
            this.f16387d0.mo20220b();
        } else if (d == C7313g.nav_details) {
            this.f16387d0.mo20217a();
        }
        updateState(new C7465e0(xVar));
    }

    /* renamed from: a */
    public void mo12663a(C3700c<?> cVar, int i) {
        if (cVar instanceof C6044b) {
            m22295a(((C3685g) ((C6044b) cVar).get(i)).mo12875E(), cVar, i);
        } else if (cVar instanceof C5982j) {
            C7468g gVar = (C7468g) getCurrentState();
            if (gVar != null) {
                String j = gVar.mo20359j();
                if (j != null) {
                    m22296a(j, (C5982j) cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13476a(String str) {
        Integer b = m22301b(str);
        if (b != null) {
            m22285a(b.intValue());
        }
    }

    /* renamed from: a */
    public final void mo20302a(C6045c cVar, int i, int i2) {
        if (i == 0) {
            mo20304a(C13199w.m40580d((Iterable) cVar, i2));
        } else if (i2 <= cVar.size()) {
            mo20304a(cVar.subList(i, i2));
        } else {
            Timber.m44532e("attempted to load more seasons than are available", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22285a(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.getCurrentState()
            g.e.b.k.k.t.a$g r0 = (p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g) r0
            if (r0 == 0) goto L_0x0013
            g.e.b.k.k.t.a$f r0 = r0.mo20361l()
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.detail.series.models.c r0 = r0.mo20345a()
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x003e
            int r1 = r5.m22274K()
            int r2 = r5.f16383a0
            int r1 = r1 + r2
            int r2 = r0.size()
            int r2 = r2 - r1
            if (r2 >= 0) goto L_0x0028
            int r1 = r0.size()
        L_0x0028:
            int r2 = r5.m22274K()
            int r3 = r0.size()
            int r4 = r5.f16383a0
            boolean r6 = r5.mo20305a(r3, r2, r6, r4)
            if (r6 == 0) goto L_0x003e
            r5.m22271H()
            r5.mo20302a(r0, r2, r1)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.m22285a(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22297a(Throwable th) {
        if (th instanceof C5915f) {
            updateState(C7474j.f16437c);
        } else if (th instanceof C5913e) {
            updateState(C7476k.f16439c);
        }
    }

    /* renamed from: a */
    public final void mo20304a(List<? extends C3789t> list) {
        C6037a aVar = this.f16379W;
        String B = mo17913B();
        Object[] array = list.toArray(new C3789t[0]);
        if (array != null) {
            C3789t[] tVarArr = (C3789t[]) array;
            Single g = aVar.mo18136a(B, (C3789t[]) Arrays.copyOf(tVarArr, tVarArr.length)).mo30233g(new C7485r(this, list));
            Intrinsics.checkReturnedValueIsNotNull((Object) g, "dataSource.loadEpisodes(…oSeason(seasonList, it) }");
            Object a = g.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a).mo29920a(new C7486s(this), new C7487t(this));
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private final void m22295a(String str, C3700c<?> cVar, int i) {
        C6044b bVar;
        int I = m22272I();
        boolean a = this.f16379W.mo18137a();
        boolean z = true;
        if (!(i + I >= cVar.size()) || !cVar.mo13457f0().mo13412a0() || a) {
            z = false;
        }
        if (z) {
            C7468g gVar = (C7468g) getCurrentState();
            if (gVar != null) {
                Map h = gVar.mo20356h();
                if (h != null) {
                    bVar = (C6044b) h.get(str);
                    C5884x.m18949a(bVar, str, new C7488u(this));
                }
            }
            bVar = null;
            C5884x.m18949a(bVar, str, new C7488u(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22298a(Map<String, ? extends C6044b> map) {
        updateState(new C7471h0(map));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C6044b> m22283a(String str, C6044b bVar) {
        C7468g gVar = (C7468g) getCurrentState();
        if (gVar != null) {
            Map h = gVar.mo20356h();
            if (h != null) {
                Map e = C13173j0.m40365e(h);
                if (e != null) {
                    Map a = C13173j0.m40354a(e, C12907r.m40244a(str, bVar));
                    if (a != null) {
                        Map<String, C6044b> d = C13173j0.m40364d(a);
                        if (d != null) {
                            return d;
                        }
                    }
                }
            }
        }
        return C13173j0.m40364d(C13173j0.m40360b(C12907r.m40244a(str, bVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22289a(C6046d dVar, C6048f fVar, String str) {
        Object obj;
        C3685g a = fVar.mo18297a();
        if (a == null) {
            a = dVar.mo18290e0();
        }
        List a2 = m22279a(dVar, dVar.mo18282Y(), a);
        Iterator it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) C3573a.m12035a(this.f16389f0, ((C6008x) obj).mo18028d(), (Map) null, 2, (Object) null), (Object) str)) {
                break;
            }
        }
        C6008x xVar = (C6008x) obj;
        C7463d0 d0Var = new C7463d0(this, dVar, fVar, a2, xVar != null ? xVar : (C6008x) C13199w.m40591g(a2));
        updateState(d0Var);
        if (this.f16386c0.mo20227F() == 0 || this.f16385c) {
            mo20302a(dVar.mo18287c0(), 0, this.f16383a0);
            return;
        }
        mo20304a(C13183n.m40498a(dVar.mo18287c0().get(this.f16386c0.mo20227F() - 1)));
        this.f16385c = true;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.bamtechmedia.dominguez.detail.common.w] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.bamtechmedia.dominguez.detail.common.o] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.bamtechmedia.dominguez.detail.common.w] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v5
      assigns: [?[OBJECT, ARRAY], com.bamtechmedia.dominguez.detail.common.o, com.bamtechmedia.dominguez.detail.common.w]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.Object, com.bamtechmedia.dominguez.detail.common.o, com.bamtechmedia.dominguez.detail.common.w]
      mth insns count: 69
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bamtechmedia.dominguez.detail.common.C6008x> m22279a(com.bamtechmedia.dominguez.detail.series.models.C6046d r13, com.bamtechmedia.dominguez.detail.common.C5982j r14, com.bamtechmedia.dominguez.core.content.C3685g r15) {
        /*
            r12 = this;
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r12.mo17916y()
            java.util.List r0 = r0.mo17879h()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 0
            switch(r3) {
                case -1289032093: goto L_0x008a;
                case -632946216: goto L_0x006d;
                case 1090493483: goto L_0x0051;
                case 1557721666: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x00a2
        L_0x0027:
            java.lang.String r3 = "details"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00a2
            com.bamtechmedia.dominguez.detail.common.w r2 = new com.bamtechmedia.dominguez.detail.common.w
            com.bamtechmedia.dominguez.detail.common.item.a r3 = new com.bamtechmedia.dominguez.detail.common.item.a
            com.bamtechmedia.dominguez.detail.common.e0.c r4 = r12.m22276a(r13, r15)
            com.bamtechmedia.dominguez.config.r0 r5 = r12.f16389f0
            com.bamtechmedia.dominguez.detail.common.g0.c r6 = r12.mo17916y()
            r3.<init>(r4, r5, r6)
            java.util.List r6 = kotlin.p590y.C13183n.m40498a(r3)
            int r7 = p163g.p201e.p203b.p287k.C7313g.nav_details
            r9 = 0
            r10 = 8
            r11 = 0
            java.lang.String r8 = "moreDetails"
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00a3
        L_0x0051:
            java.lang.String r3 = "related"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00a2
            com.bamtechmedia.dominguez.detail.common.o r4 = new com.bamtechmedia.dominguez.detail.common.o
            com.bamtechmedia.dominguez.detail.common.u r2 = r13.mo18284a0()
            int r5 = p163g.p201e.p203b.p287k.C7313g.nav_related
            com.bamtechmedia.dominguez.detail.common.u r6 = r13.mo18284a0()
            java.lang.String r6 = r6.mo17987a()
            r4.<init>(r2, r5, r3, r6)
            goto L_0x00a2
        L_0x006d:
            java.lang.String r3 = "episodes"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00a2
            com.bamtechmedia.dominguez.detail.common.o r2 = new com.bamtechmedia.dominguez.detail.common.o
            g.e.b.k.k.t.a$e r6 = new g.e.b.k.k.t.a$e
            r3 = 3
            r6.<init>(r4, r4, r3, r4)
            int r7 = p163g.p201e.p203b.p287k.C7313g.nav_episodes
            r9 = 0
            r10 = 8
            r11 = 0
            java.lang.String r8 = "episodes"
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00a3
        L_0x008a:
            java.lang.String r3 = "extras"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00a2
            com.bamtechmedia.dominguez.detail.common.o r2 = new com.bamtechmedia.dominguez.detail.common.o
            int r7 = p163g.p201e.p203b.p287k.C7313g.nav_extras
            r9 = 0
            r10 = 8
            r11 = 0
            java.lang.String r8 = "extras"
            r5 = r2
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00a3
        L_0x00a2:
            r2 = r4
        L_0x00a3:
            if (r2 == 0) goto L_0x0011
            r1.add(r2)
            goto L_0x0011
        L_0x00aa:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r1.iterator()
        L_0x00b3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r15.next()
            r1 = r0
            com.bamtechmedia.dominguez.detail.common.x r1 = (com.bamtechmedia.dominguez.detail.common.C6008x) r1
            boolean r2 = r12.m22299a(r1, r13)
            r3 = 1
            if (r2 != 0) goto L_0x00d4
            java.util.List r1 = r1.mo18025a()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r3 = 0
        L_0x00d4:
            if (r3 == 0) goto L_0x00b3
            r14.add(r0)
            goto L_0x00b3
        L_0x00da:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p297t.C7454a.m22279a(com.bamtechmedia.dominguez.detail.series.models.d, com.bamtechmedia.dominguez.detail.common.j, com.bamtechmedia.dominguez.core.content.g):java.util.List");
    }

    /* renamed from: a */
    private final boolean m22299a(C6008x xVar, C6046d dVar) {
        return xVar.mo18028d() == C7313g.nav_episodes && (dVar.mo18287c0().isEmpty() ^ true);
    }

    /* renamed from: a */
    private final C5923c m22276a(C6046d dVar, C3685g gVar) {
        List list;
        if (gVar != null) {
            C5920a aVar = this.f16388e0;
            C3791v d0 = dVar.mo18288d0();
            List z = gVar.mo12916z();
            if (z != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object next : z) {
                    if (hashSet.add(((Participant) next).mo13150X())) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            } else {
                list = C13185o.m40513a();
            }
            C5923c a = aVar.mo17821a(d0, gVar, list);
            if (a != null) {
                return a;
            }
        }
        return this.f16388e0.mo17821a(dVar.mo18288d0(), null, dVar.mo18288d0().mo13047z());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22288a(C6046d dVar) {
        C3789t tVar;
        if (mo20298F() == null) {
            if (this.f16386c0.mo20227F() != 0) {
                tVar = (C3789t) dVar.mo18287c0().get(this.f16386c0.mo20227F() - 1);
            } else {
                tVar = (C3789t) C13199w.m40591g((List) dVar.mo18287c0());
            }
            mo20300a(tVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m22277a(C3690l lVar) {
        int i = C7498b.$EnumSwitchMapping$0[lVar.ordinal()];
        if (i == 1) {
            return C3573a.m12035a(this.f16389f0, C7313g.nav_details, (Map) null, 2, (Object) null);
        }
        if (i == 2) {
            return C3573a.m12035a(this.f16389f0, C7313g.nav_extras, (Map) null, 2, (Object) null);
        }
        if (i == 3) {
            return C3573a.m12035a(this.f16389f0, C7313g.nav_episodes, (Map) null, 2, (Object) null);
        }
        if (i == 4) {
            return C3573a.m12035a(this.f16389f0, C7313g.nav_related, (Map) null, 2, (Object) null);
        }
        if (i == 5) {
            return C3573a.m12035a(this.f16389f0, C7313g.nav_episodes, (Map) null, 2, (Object) null);
        }
        throw new C12898l();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C6044b> m22284a(List<? extends C3789t> list, C6044b bVar) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C3789t tVar : list) {
            String E = tVar.mo12992E();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : bVar) {
                if (Intrinsics.areEqual((Object) ((C3685g) next).mo12875E(), (Object) tVar.mo12992E())) {
                    arrayList2.add(next);
                }
            }
            arrayList.add(C12907r.m40244a(E, new C7464e(arrayList2, bVar.mo13457f0())));
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }
}
