package com.bamtechmedia.dominguez.detail.movie.data;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.DmcLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcMovie;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.bamtechmedia.dominguez.detail.common.BookmarkHit;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5911c;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5915f;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.movie.models.C6022a;
import com.bamtechmedia.dominguez.detail.movie.models.C6024b;
import com.bamtechmedia.dominguez.detail.movie.models.C6026d;
import com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle;
import com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundleResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.p288j.C7319b;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p530x.C11998a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0018\u00010\u0013j\u0002`\u0015H\u0016J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0018\u00010\u0013j\u0002`\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource;", "Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailDataSource;", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "detailResponseErrorHandler", "Lcom/bamtechmedia/dominguez/detail/common/error/DetailResponseErrorHandler;", "localBookmarks", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "config", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lcom/bamtechmedia/dominguez/detail/common/error/DetailResponseErrorHandler;Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "getCacheOverrideValue", "", "getCacheOverrideValue$contentDetail_release", "getMovieDetail", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieDetail;", "familyId", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "getMovieUserData", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieUserData;", "Companion", "ContinueWatchingVideo", "ContinueWatchingVideoResponse", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MovieDetailRemoteDataSource.kt */
public final class MovieDetailRemoteDataSource implements C7319b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3724a f13858a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5911c f13859b;

    /* renamed from: c */
    private final C3165c<C3693o> f13860c;

    /* renamed from: d */
    private final C5948c f13861d;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;", "", "resume", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "(Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;)V", "getLabels", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "getResume", "()Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toUserData", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieUserData;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MovieDetailRemoteDataSource.kt */
    public static final class ContinueWatchingVideo {

        /* renamed from: a */
        private final BookmarkHit f13862a;

        /* renamed from: b */
        private final DmcLabel f13863b;

        public ContinueWatchingVideo(BookmarkHit bookmarkHit, DmcLabel dmcLabel) {
            this.f13862a = bookmarkHit;
            this.f13863b = dmcLabel;
        }

        /* renamed from: a */
        public final DmcLabel mo18057a() {
            return this.f13863b;
        }

        /* renamed from: b */
        public final BookmarkHit mo18058b() {
            return this.f13862a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            if (r1.mo13075X() == true) goto L_0x0015;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bamtechmedia.dominguez.detail.movie.models.C6026d mo18059c() {
            /*
                r3 = this;
                com.bamtechmedia.dominguez.detail.movie.models.d r0 = new com.bamtechmedia.dominguez.detail.movie.models.d
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r1 = r3.f13863b
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
                com.bamtechmedia.dominguez.detail.common.BookmarkHit r1 = r3.f13862a
                if (r1 == 0) goto L_0x001e
                com.bamtech.sdk4.bookmarks.Bookmark r1 = r1.mo17781Y()
                goto L_0x001f
            L_0x001e:
                r1 = 0
            L_0x001f:
                r0.<init>(r2, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo.mo18059c():com.bamtechmedia.dominguez.detail.movie.models.d");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13863b, (java.lang.Object) r3.f13863b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$ContinueWatchingVideo r3 = (com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo) r3
                com.bamtechmedia.dominguez.detail.common.BookmarkHit r0 = r2.f13862a
                com.bamtechmedia.dominguez.detail.common.BookmarkHit r1 = r3.f13862a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r0 = r2.f13863b
                com.bamtechmedia.dominguez.core.content.assets.DmcLabel r3 = r3.f13863b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideo.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            BookmarkHit bookmarkHit = this.f13862a;
            int i = 0;
            int hashCode = (bookmarkHit != null ? bookmarkHit.hashCode() : 0) * 31;
            DmcLabel dmcLabel = this.f13863b;
            if (dmcLabel != null) {
                i = dmcLabel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContinueWatchingVideo(resume=");
            sb.append(this.f13862a);
            sb.append(", labels=");
            sb.append(this.f13863b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideoResponse;", "", "continueWatchingVideo", "Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;", "(Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;)V", "getContinueWatchingVideo", "()Lcom/bamtechmedia/dominguez/detail/movie/data/MovieDetailRemoteDataSource$ContinueWatchingVideo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MovieDetailRemoteDataSource.kt */
    public static final class ContinueWatchingVideoResponse {

        /* renamed from: a */
        private final ContinueWatchingVideo f13864a;

        public ContinueWatchingVideoResponse(@C11724g(name = "ContinueWatchingVideo") ContinueWatchingVideo continueWatchingVideo) {
            this.f13864a = continueWatchingVideo;
        }

        /* renamed from: a */
        public final ContinueWatchingVideo mo18063a() {
            return this.f13864a;
        }

        public final ContinueWatchingVideoResponse copy(@C11724g(name = "ContinueWatchingVideo") ContinueWatchingVideo continueWatchingVideo) {
            return new ContinueWatchingVideoResponse(continueWatchingVideo);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13864a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideoResponse) r2).f13864a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideoResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$ContinueWatchingVideoResponse r2 = (com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideoResponse) r2
                com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$ContinueWatchingVideo r0 = r1.f13864a
                com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$ContinueWatchingVideo r2 = r2.f13864a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource.ContinueWatchingVideoResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ContinueWatchingVideo continueWatchingVideo = this.f13864a;
            if (continueWatchingVideo != null) {
                return continueWatchingVideo.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContinueWatchingVideoResponse(continueWatchingVideo=");
            sb.append(this.f13864a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$a */
    /* compiled from: MovieDetailRemoteDataSource.kt */
    public static final class C6012a {
        private C6012a() {
        }

        public /* synthetic */ C6012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$b */
    /* compiled from: MovieDetailRemoteDataSource.kt */
    static final class C6013b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ MovieDetailRemoteDataSource f13865c;

        C6013b(MovieDetailRemoteDataSource movieDetailRemoteDataSource) {
            this.f13865c = movieDetailRemoteDataSource;
        }

        /* renamed from: a */
        public final C6022a apply(GraphQlResponse<DmcVideoBundleResponse> graphQlResponse) {
            List a = this.f13865c.f13859b.mo17818a(graphQlResponse.getErrors());
            if (!(!a.isEmpty())) {
                DmcVideoBundleResponse dmcVideoBundleResponse = (DmcVideoBundleResponse) graphQlResponse.getData();
                DmcMovie dmcMovie = null;
                DmcVideoBundle a2 = dmcVideoBundleResponse != null ? dmcVideoBundleResponse.mo18098a() : null;
                if (a2 != null) {
                    dmcMovie = a2.mo18088a0();
                }
                if (a2 != null && dmcMovie != null) {
                    return new C6022a(a2.mo18085Y(), dmcMovie, a2.mo18084X(), a2.mo18086Z());
                }
                throw new C5915f();
            }
            throw new C11998a((Iterable<? extends Throwable>) a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$c */
    /* compiled from: MovieDetailRemoteDataSource.kt */
    static final class C6014c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f13866U;

        /* renamed from: V */
        final /* synthetic */ String f13867V;

        /* renamed from: c */
        final /* synthetic */ MovieDetailRemoteDataSource f13868c;

        C6014c(MovieDetailRemoteDataSource movieDetailRemoteDataSource, String str, String str2) {
            this.f13868c = movieDetailRemoteDataSource;
            this.f13866U = str;
            this.f13867V = str2;
        }

        /* renamed from: a */
        public final Single<GraphQlResponse<ContinueWatchingVideoResponse>> apply(Map<String, ? extends Object> map) {
            return this.f13868c.f13858a.mo13577a(ContinueWatchingVideoResponse.class, "core/ContinueWatchingVideo", C5859p.m18901a(C13173j0.m40356a(C12907r.m40244a("filterCompletedBookmarks", Boolean.valueOf(true)), C12907r.m40244a("cacheOverride", Long.valueOf(this.f13868c.mo18054a())), C12907r.m40244a("familyId", this.f13866U)), true ^ map.isEmpty(), "lastBookmark", map), this.f13867V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$d */
    /* compiled from: MovieDetailRemoteDataSource.kt */
    static final class C6015d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6015d f13869c = new C6015d();

        C6015d() {
        }

        /* renamed from: a */
        public final C6026d apply(GraphQlResponse<ContinueWatchingVideoResponse> graphQlResponse) {
            ContinueWatchingVideoResponse continueWatchingVideoResponse = (ContinueWatchingVideoResponse) graphQlResponse.getData();
            if (continueWatchingVideoResponse != null) {
                ContinueWatchingVideo a = continueWatchingVideoResponse.mo18063a();
                if (a != null) {
                    C6026d c = a.mo18059c();
                    if (c != null) {
                        return c;
                    }
                }
            }
            throw new AssertionError("No data in GraphQlResponse for core/ContinueWatchingVideo");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource$e */
    /* compiled from: MovieDetailRemoteDataSource.kt */
    static final class C6016e<T, R> implements Function<Throwable, C6026d> {

        /* renamed from: c */
        public static final C6016e f13870c = new C6016e();

        C6016e() {
        }

        /* renamed from: a */
        public final C6026d apply(Throwable th) {
            return new C6026d(false, null);
        }
    }

    static {
        new C6012a(null);
    }

    public MovieDetailRemoteDataSource(C3724a aVar, C5911c cVar, C3165c<C3693o> cVar2, C5948c cVar3) {
        this.f13858a = aVar;
        this.f13859b = cVar;
        this.f13860c = cVar2;
        this.f13861d = cVar3;
    }

    /* renamed from: a */
    public Single<C6024b> mo18055a(String str, String str2) {
        Single<C6024b> g = this.f13858a.mo13577a(DmcVideoBundleResponse.class, "core/DmcVideoBundle", C13173j0.m40356a(C12907r.m40244a("familyId", str), C12907r.m40244a("includePromoLabels", C13185o.m40520c("ComingSoon", "NewlyAdded"))), str2).mo30233g(new C6013b(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.typedSearch<Dm…)\n            }\n        }");
        return g;
    }

    /* renamed from: b */
    public Single<C6026d> mo18056b(String str, String str2) {
        Single<C6026d> i = this.f13860c.mo12186a(str).mo30120b(C13173j0.m40350a()).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6014c<Object,Object>(this, str, str2)).mo30233g(C6015d.f13869c).mo30203a(this.f13861d.mo17875d(), TimeUnit.SECONDS, C11934b.m38500b()).mo30237i(C6016e.f13870c);
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "localBookmarks.lastMovie…false, bookmark = null) }");
        return i;
    }

    /* renamed from: a */
    public final long mo18054a() {
        return System.currentTimeMillis();
    }
}
