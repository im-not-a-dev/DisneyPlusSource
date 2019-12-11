package com.bamtechmedia.dominguez.detail.series.data;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.core.content.assets.DmcEpisode;
import com.bamtechmedia.dominguez.core.content.assets.DmcLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeason;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeries;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5911c;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5915f;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.series.models.C6042a;
import com.bamtechmedia.dominguez.detail.series.models.C6044b;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import com.bamtechmedia.dominguez.detail.series.models.C6048f;
import com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle;
import com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundleResponse;
import com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes;
import com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p530x.C11998a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0005*+,-.B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0018\u00010\u0016j\u0002`\u0018H\u0016J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0018\u00010\u0016j\u0002`\u0018H\u0016J\b\u0010\f\u001a\u00020\u001bH\u0016J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\u0006\u0010\u001e\u001a\u00020\u00162\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`!0 2\f\u0010\u0017\u001a\b\u0018\u00010\u0016j\u0002`\u0018H\u0016J5\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\f\u0010\u0017\u001a\b\u0018\u00010\u0016j\u0002`\u00182\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$\"\u00020%H\u0016¢\u0006\u0002\u0010&J,\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0(2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0018\u00010\u0016j\u0002`\u0018H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource;", "Lcom/bamtechmedia/dominguez/detail/series/data/SeriesDetailDataSource;", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "detailResponseErrorHandler", "Lcom/bamtechmedia/dominguez/detail/common/error/DetailResponseErrorHandler;", "localBookmarks", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "config", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lcom/bamtechmedia/dominguez/detail/common/error/DetailResponseErrorHandler;Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "isLoadingEpisodes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoadingSeriesUserData", "getCacheOverrideValue", "", "getCacheOverrideValue$contentDetail_release", "getSeriesDetail", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;", "seriesId", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "getSeriesUserData", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesUserData;", "", "loadEpisodeRange", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedEpisodes;", "seasonId", "contentIds", "", "Lcom/bamtechmedia/dominguez/core/content/ContentId;", "loadEpisodes", "seasons", "", "Lcom/bamtechmedia/dominguez/core/content/Season;", "(Ljava/lang/String;[Lcom/bamtechmedia/dominguez/core/content/Season;)Lio/reactivex/Single;", "loadNextPage", "Lio/reactivex/Maybe;", "pagedEpisodes", "Companion", "ContinueWatchingSeries", "ContinueWatchingSeriesResponse", "DmcAssetResponse", "DmcVideoResponse", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoteSeriesDetailDataSource.kt */
public final class RemoteSeriesDetailDataSource implements C6037a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AtomicBoolean f13893a = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AtomicBoolean f13894b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3724a f13895c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5911c f13896d;

    /* renamed from: e */
    private final C3165c<C3693o> f13897e;

    /* renamed from: f */
    private final C5948c f13898f;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeries;", "", "resume", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;)V", "getLabels", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "getResume", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toUserData", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesUserData;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    public static final class ContinueWatchingSeries {

        /* renamed from: a */
        private final DmcEpisode f13899a;

        /* renamed from: b */
        private final DmcLabel f13900b;

        public ContinueWatchingSeries(DmcEpisode dmcEpisode, DmcLabel dmcLabel) {
            this.f13899a = dmcEpisode;
            this.f13900b = dmcLabel;
        }

        /* renamed from: a */
        public final DmcLabel mo18140a() {
            return this.f13900b;
        }

        /* renamed from: b */
        public final DmcEpisode mo18141b() {
            return this.f13899a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            if (r1.mo13075X() == true) goto L_0x0015;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bamtechmedia.dominguez.detail.series.models.C6048f mo18142c() {
            /*
                r4 = this;
                com.bamtechmedia.dominguez.detail.series.models.f r0 = new com.bamtechmedia.dominguez.detail.series.models.f
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r1 = r4.f13900b
                r2 = 1
                if (r1 == 0) goto L_0x0014
                com.bamtechmedia.dominguez.core.content.assets.DmcWatchlistLabel r1 = r1.mo12940Y()
                if (r1 == 0) goto L_0x0014
                boolean r1 = r1.mo13075X()
                if (r1 != r2) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = 0
            L_0x0015:
                com.bamtechmedia.dominguez.core.content.assets.DmcEpisode r1 = r4.f13899a
                if (r1 == 0) goto L_0x001e
                com.bamtech.sdk4.bookmarks.Bookmark r3 = r1.mo12881O()
                goto L_0x001f
            L_0x001e:
                r3 = 0
            L_0x001f:
                r0.<init>(r2, r1, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeries.mo18142c():com.bamtechmedia.dominguez.detail.series.models.f");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f13900b, (java.lang.Object) r3.f13900b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeries
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$ContinueWatchingSeries r3 = (com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeries) r3
                com.bamtechmedia.dominguez.core.content.assets.DmcEpisode r0 = r2.f13899a
                com.bamtechmedia.dominguez.core.content.assets.DmcEpisode r1 = r3.f13899a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r0 = r2.f13900b
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r3 = r3.f13900b
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeries.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            DmcEpisode dmcEpisode = this.f13899a;
            int i = 0;
            int hashCode = (dmcEpisode != null ? dmcEpisode.hashCode() : 0) * 31;
            DmcLabel dmcLabel = this.f13900b;
            if (dmcLabel != null) {
                i = dmcLabel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContinueWatchingSeries(resume=");
            sb.append(this.f13899a);
            sb.append(", labels=");
            sb.append(this.f13900b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeriesResponse;", "", "continueWatchingSeries", "Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeries;", "(Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeries;)V", "getContinueWatchingSeries", "()Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeries;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    public static final class ContinueWatchingSeriesResponse {

        /* renamed from: a */
        private final ContinueWatchingSeries f13901a;

        public ContinueWatchingSeriesResponse(@C11724g(name = "ContinueWatchingSeries") ContinueWatchingSeries continueWatchingSeries) {
            this.f13901a = continueWatchingSeries;
        }

        /* renamed from: a */
        public final ContinueWatchingSeries mo18146a() {
            return this.f13901a;
        }

        public final ContinueWatchingSeriesResponse copy(@C11724g(name = "ContinueWatchingSeries") ContinueWatchingSeries continueWatchingSeries) {
            return new ContinueWatchingSeriesResponse(continueWatchingSeries);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13901a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeriesResponse) r2).f13901a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeriesResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$ContinueWatchingSeriesResponse r2 = (com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeriesResponse) r2
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$ContinueWatchingSeries r0 = r1.f13901a
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$ContinueWatchingSeries r2 = r2.f13901a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeriesResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ContinueWatchingSeries continueWatchingSeries = this.f13901a;
            if (continueWatchingSeries != null) {
                return continueWatchingSeries.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContinueWatchingSeriesResponse(continueWatchingSeries=");
            sb.append(this.f13901a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$DmcAssetResponse;", "", "composite", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "(Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;)V", "getComposite", "()Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    public static final class DmcAssetResponse {

        /* renamed from: a */
        private final SeriesBundleEpisodes f13902a;

        public DmcAssetResponse(@C11724g(name = "DmcEpisodes") SeriesBundleEpisodes seriesBundleEpisodes) {
            this.f13902a = seriesBundleEpisodes;
        }

        /* renamed from: a */
        public final SeriesBundleEpisodes mo18151a() {
            return this.f13902a;
        }

        public final DmcAssetResponse copy(@C11724g(name = "DmcEpisodes") SeriesBundleEpisodes seriesBundleEpisodes) {
            return new DmcAssetResponse(seriesBundleEpisodes);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13902a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcAssetResponse) r2).f13902a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcAssetResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$DmcAssetResponse r2 = (com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcAssetResponse) r2
                com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0 = r1.f13902a
                com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r2 = r2.f13902a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcAssetResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            SeriesBundleEpisodes seriesBundleEpisodes = this.f13902a;
            if (seriesBundleEpisodes != null) {
                return seriesBundleEpisodes.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DmcAssetResponse(composite=");
            sb.append(this.f13902a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$DmcVideoResponse;", "", "composite", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "(Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;)V", "getComposite", "()Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    public static final class DmcVideoResponse {

        /* renamed from: a */
        private final SeriesBundleEpisodes f13903a;

        public DmcVideoResponse(@C11724g(name = "DmcVideos") SeriesBundleEpisodes seriesBundleEpisodes) {
            this.f13903a = seriesBundleEpisodes;
        }

        /* renamed from: a */
        public final SeriesBundleEpisodes mo18156a() {
            return this.f13903a;
        }

        public final DmcVideoResponse copy(@C11724g(name = "DmcVideos") SeriesBundleEpisodes seriesBundleEpisodes) {
            return new DmcVideoResponse(seriesBundleEpisodes);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13903a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcVideoResponse) r2).f13903a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcVideoResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$DmcVideoResponse r2 = (com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcVideoResponse) r2
                com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0 = r1.f13903a
                com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r2 = r2.f13903a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.DmcVideoResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            SeriesBundleEpisodes seriesBundleEpisodes = this.f13903a;
            if (seriesBundleEpisodes != null) {
                return seriesBundleEpisodes.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DmcVideoResponse(composite=");
            sb.append(this.f13903a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$a */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    public static final class C6028a {
        private C6028a() {
        }

        public /* synthetic */ C6028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$b */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6029b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ RemoteSeriesDetailDataSource f13904c;

        C6029b(RemoteSeriesDetailDataSource remoteSeriesDetailDataSource) {
            this.f13904c = remoteSeriesDetailDataSource;
        }

        /* renamed from: a */
        public final C6042a apply(GraphQlResponse<DmcSeriesBundleResponse> graphQlResponse) {
            DmcSeries dmcSeries;
            List a = this.f13904c.f13896d.mo17818a(graphQlResponse.getErrors());
            if (!(!a.isEmpty())) {
                DmcSeriesBundleResponse dmcSeriesBundleResponse = (DmcSeriesBundleResponse) graphQlResponse.getData();
                DmcSeriesBundle a2 = dmcSeriesBundleResponse != null ? dmcSeriesBundleResponse.mo18193a() : null;
                DmcSeriesBundleResponse dmcSeriesBundleResponse2 = (DmcSeriesBundleResponse) graphQlResponse.getData();
                if (dmcSeriesBundleResponse2 != null) {
                    DmcSeriesBundle a3 = dmcSeriesBundleResponse2.mo18193a();
                    if (a3 != null) {
                        dmcSeries = a3.mo18178Y();
                        if (a2 != null || dmcSeries == null) {
                            throw new C5915f();
                        }
                        List X = a2.mo18177X().mo18241X();
                        ArrayList arrayList = new ArrayList();
                        for (Object next : X) {
                            if (((DmcSeason) next).mo12996Q() > 0) {
                                arrayList.add(next);
                            }
                        }
                        C6042a aVar = new C6042a(dmcSeries, a2.mo18181b0(), SeriesBundleSeasons.m19350a(a2.mo18177X(), arrayList, null, 2, null), a2.mo18179Z(), a2.mo18182c0(), a2.mo18180a0());
                        return aVar;
                    }
                }
                dmcSeries = null;
                if (a2 != null) {
                }
                throw new C5915f();
            }
            throw new C11998a((Iterable<? extends Throwable>) a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$c */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6030c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f13905U;

        /* renamed from: V */
        final /* synthetic */ String f13906V;

        /* renamed from: c */
        final /* synthetic */ RemoteSeriesDetailDataSource f13907c;

        C6030c(RemoteSeriesDetailDataSource remoteSeriesDetailDataSource, String str, String str2) {
            this.f13907c = remoteSeriesDetailDataSource;
            this.f13905U = str;
            this.f13906V = str2;
        }

        /* renamed from: a */
        public final Single<GraphQlResponse<ContinueWatchingSeriesResponse>> apply(Map<String, ? extends Object> map) {
            return this.f13907c.f13895c.mo13577a(ContinueWatchingSeriesResponse.class, "core/ContinueWatchingSeries", C5859p.m18901a(C13173j0.m40356a(C12907r.m40244a("cacheOverride", Long.valueOf(this.f13907c.mo18138b())), C12907r.m40244a("seriesId", this.f13905U)), !map.isEmpty(), "lastBookmark", map), this.f13906V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$d */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6031d implements C11945a {

        /* renamed from: a */
        final /* synthetic */ RemoteSeriesDetailDataSource f13908a;

        C6031d(RemoteSeriesDetailDataSource remoteSeriesDetailDataSource) {
            this.f13908a = remoteSeriesDetailDataSource;
        }

        public final void run() {
            this.f13908a.f13894b.set(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$e */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6032e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6032e f13909c = new C6032e();

        C6032e() {
        }

        /* renamed from: a */
        public final C6048f apply(GraphQlResponse<ContinueWatchingSeriesResponse> graphQlResponse) {
            ContinueWatchingSeriesResponse continueWatchingSeriesResponse = (ContinueWatchingSeriesResponse) graphQlResponse.getData();
            if (continueWatchingSeriesResponse != null) {
                ContinueWatchingSeries a = continueWatchingSeriesResponse.mo18146a();
                if (a != null) {
                    C6048f c = a.mo18142c();
                    if (c != null) {
                        return c;
                    }
                }
            }
            throw new AssertionError("No data in GraphQlResponse for core/ContinueWatchingSeries");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$f */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6033f<T, R> implements Function<Throwable, C6048f> {

        /* renamed from: c */
        public static final C6033f f13910c = new C6033f();

        C6033f() {
        }

        /* renamed from: a */
        public final C6048f apply(Throwable th) {
            return new C6048f(false, null, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$g */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6034g<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ RemoteSeriesDetailDataSource f13911c;

        C6034g(RemoteSeriesDetailDataSource remoteSeriesDetailDataSource) {
            this.f13911c = remoteSeriesDetailDataSource;
        }

        /* renamed from: a */
        public final SeriesBundleEpisodes apply(GraphQlResponse<DmcAssetResponse> graphQlResponse) {
            this.f13911c.f13893a.set(false);
            DmcAssetResponse dmcAssetResponse = (DmcAssetResponse) graphQlResponse.getData();
            if (dmcAssetResponse != null) {
                SeriesBundleEpisodes a = dmcAssetResponse.mo18151a();
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Missing or bad data in GraphQlResponse ");
            sb.append(graphQlResponse);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource$h */
    /* compiled from: RemoteSeriesDetailDataSource.kt */
    static final class C6035h<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6044b f13912U;

        /* renamed from: c */
        final /* synthetic */ RemoteSeriesDetailDataSource f13913c;

        C6035h(RemoteSeriesDetailDataSource remoteSeriesDetailDataSource, C6044b bVar) {
            this.f13913c = remoteSeriesDetailDataSource;
            this.f13912U = bVar;
        }

        /* renamed from: a */
        public final SeriesBundleEpisodes apply(GraphQlResponse<DmcAssetResponse> graphQlResponse) {
            this.f13913c.f13893a.set(false);
            DmcAssetResponse dmcAssetResponse = (DmcAssetResponse) graphQlResponse.getData();
            SeriesBundleEpisodes a = dmcAssetResponse != null ? dmcAssetResponse.mo18151a() : null;
            if (a != null) {
                List<C3685g> d = C13199w.m40583d((Collection) C13199w.m40574c((Collection) this.f13912U), (Iterable) a.mo18202Z());
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
                for (C3685g gVar : d) {
                    if (gVar != null) {
                        arrayList.add((DmcEpisode) gVar);
                    } else {
                        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.assets.DmcEpisode");
                    }
                }
                return SeriesBundleEpisodes.m19341a(a, arrayList, null, 2, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Missing or bad data in GraphQlResponse ");
            sb.append(graphQlResponse);
            throw new AssertionError(sb.toString());
        }
    }

    static {
        new C6028a(null);
    }

    public RemoteSeriesDetailDataSource(C3724a aVar, C5911c cVar, C3165c<C3693o> cVar2, C5948c cVar3) {
        this.f13895c = aVar;
        this.f13896d = cVar;
        this.f13897e = cVar2;
        this.f13898f = cVar3;
    }

    /* renamed from: a */
    public Maybe<C6044b> mo18134a(C6044b bVar, String str, String str2) {
        if (bVar.mo13457f0().mo13412a0()) {
            this.f13893a.set(true);
            Maybe<C6044b> h = this.f13895c.mo13577a(DmcAssetResponse.class, "core/DmcEpisodes", C13173j0.m40356a(C12907r.m40244a("seasonId", str), C12907r.m40244a("episodePage", Integer.valueOf(bVar.mo13457f0().mo13410Y())), C12907r.m40244a("episodePageSize", Integer.valueOf(bVar.mo13457f0().mo13411Z()))), str2).mo30233g(new C6035h(this, bVar)).mo30234h();
            C12880j.m40222a((Object) h, "searchApi.typedSearch<Dm…)\n            }.toMaybe()");
            return h;
        }
        Maybe<C6044b> h2 = Maybe.m38259h();
        C12880j.m40222a((Object) h2, "Maybe.empty()");
        return h2;
    }

    /* renamed from: b */
    public Single<C6046d> mo18139b(String str, String str2) {
        Single<C6046d> g = this.f13895c.mo13577a(DmcSeriesBundleResponse.class, "core/DmcSeriesBundle", C13173j0.m40356a(C12907r.m40244a("seriesId", str), C12907r.m40244a("includePromoLabels", C13185o.m40520c("ComingSoon", "NewlyAdded"))), str2).mo30233g(new C6029b(this));
        C12880j.m40222a((Object) g, "searchApi.typedSearch<Dm…)\n            }\n        }");
        return g;
    }

    /* renamed from: b */
    public final long mo18138b() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public Single<C6048f> mo18135a(String str, String str2) {
        if (this.f13894b.get()) {
            Single<C6048f> j = Single.m38402j();
            C12880j.m40222a((Object) j, "Single.never()");
            return j;
        }
        this.f13894b.set(true);
        Single<C6048f> i = this.f13897e.mo12187b(str).mo30120b(C13173j0.m40350a()).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6030c<Object,Object>(this, str, str2)).mo30219b((C11945a) new C6031d(this)).mo30233g(C6032e.f13909c).mo30203a(this.f13898f.mo17875d(), TimeUnit.SECONDS, C11934b.m38500b()).mo30237i(C6033f.f13910c);
        C12880j.m40222a((Object) i, "localBookmarks.lastSerie…Data(false, null, null) }");
        return i;
    }

    /* renamed from: a */
    public boolean mo18137a() {
        return this.f13893a.get();
    }

    /* renamed from: a */
    public Single<C6044b> mo18136a(String str, C3789t... tVarArr) {
        ArrayList arrayList = new ArrayList(tVarArr.length);
        for (C3789t E : tVarArr) {
            arrayList.add(E.mo12992E());
        }
        this.f13893a.set(true);
        Single<C6044b> g = this.f13895c.mo13577a(DmcAssetResponse.class, "core/DmcEpisodes", C13170i0.m40332a(C12907r.m40244a("seasonId", arrayList)), str).mo30233g(new C6034g(this));
        C12880j.m40222a((Object) g, "searchApi.typedSearch<Dm…lResponse $it\")\n        }");
        return g;
    }
}
