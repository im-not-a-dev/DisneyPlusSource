package com.bamtechmedia.dominguez.watchlist.remote;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;)V", "add", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistHit;", "contentIds", "", "removeItems", "AddToWatchlistResponse", "Companion", "DeleteFromWatchlistResponse", "WatchlistHit", "WatchlistUpdateResponse", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoteWatchlistDataSource.kt */
public final class RemoteWatchlistDataSource {

    /* renamed from: a */
    private final C3724a f17339a;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$AddToWatchlistResponse;", "", "updated", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "(Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;)V", "getUpdated", "()Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteWatchlistDataSource.kt */
    public static final class AddToWatchlistResponse {

        /* renamed from: a */
        private final WatchlistUpdateResponse f17340a;

        public AddToWatchlistResponse(@C11724g(name = "AddToWatchlist") WatchlistUpdateResponse watchlistUpdateResponse) {
            this.f17340a = watchlistUpdateResponse;
        }

        /* renamed from: a */
        public final WatchlistUpdateResponse mo21110a() {
            return this.f17340a;
        }

        public final AddToWatchlistResponse copy(@C11724g(name = "AddToWatchlist") WatchlistUpdateResponse watchlistUpdateResponse) {
            return new AddToWatchlistResponse(watchlistUpdateResponse);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17340a, (java.lang.Object) ((com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.AddToWatchlistResponse) r2).f17340a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.AddToWatchlistResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$AddToWatchlistResponse r2 = (com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.AddToWatchlistResponse) r2
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistUpdateResponse r0 = r1.f17340a
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistUpdateResponse r2 = r2.f17340a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.AddToWatchlistResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            WatchlistUpdateResponse watchlistUpdateResponse = this.f17340a;
            if (watchlistUpdateResponse != null) {
                return watchlistUpdateResponse.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AddToWatchlistResponse(updated=");
            sb.append(this.f17340a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$DeleteFromWatchlistResponse;", "", "updated", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "(Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;)V", "getUpdated", "()Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteWatchlistDataSource.kt */
    public static final class DeleteFromWatchlistResponse {

        /* renamed from: a */
        private final WatchlistUpdateResponse f17341a;

        public DeleteFromWatchlistResponse(@C11724g(name = "DeleteFromWatchlist") WatchlistUpdateResponse watchlistUpdateResponse) {
            this.f17341a = watchlistUpdateResponse;
        }

        /* renamed from: a */
        public final WatchlistUpdateResponse mo21115a() {
            return this.f17341a;
        }

        public final DeleteFromWatchlistResponse copy(@C11724g(name = "DeleteFromWatchlist") WatchlistUpdateResponse watchlistUpdateResponse) {
            return new DeleteFromWatchlistResponse(watchlistUpdateResponse);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17341a, (java.lang.Object) ((com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.DeleteFromWatchlistResponse) r2).f17341a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.DeleteFromWatchlistResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$DeleteFromWatchlistResponse r2 = (com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.DeleteFromWatchlistResponse) r2
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistUpdateResponse r0 = r1.f17341a
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistUpdateResponse r2 = r2.f17341a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.DeleteFromWatchlistResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            WatchlistUpdateResponse watchlistUpdateResponse = this.f17341a;
            if (watchlistUpdateResponse != null) {
                return watchlistUpdateResponse.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DeleteFromWatchlistResponse(updated=");
            sb.append(this.f17341a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistHit;", "", "contentId", "", "(Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteWatchlistDataSource.kt */
    public static final class WatchlistHit {

        /* renamed from: a */
        private final String f17342a;

        public WatchlistHit(String str) {
            this.f17342a = str;
        }

        /* renamed from: a */
        public final String mo21120a() {
            return this.f17342a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17342a, (java.lang.Object) ((com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistHit) r2).f17342a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistHit
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistHit r2 = (com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistHit) r2
                java.lang.String r0 = r1.f17342a
                java.lang.String r2 = r2.f17342a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistHit.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f17342a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WatchlistHit(contentId=");
            sb.append(this.f17342a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "", "watchlistItems", "", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistHit;", "(Ljava/util/List;)V", "getWatchlistItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteWatchlistDataSource.kt */
    public static final class WatchlistUpdateResponse {

        /* renamed from: a */
        private final List<WatchlistHit> f17343a;

        public WatchlistUpdateResponse(List<WatchlistHit> list) {
            this.f17343a = list;
        }

        /* renamed from: a */
        public final List<WatchlistHit> mo21124a() {
            return this.f17343a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17343a, (java.lang.Object) ((com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistUpdateResponse) r2).f17343a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistUpdateResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistUpdateResponse r2 = (com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistUpdateResponse) r2
                java.util.List<com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistHit> r0 = r1.f17343a
                java.util.List<com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$WatchlistHit> r2 = r2.f17343a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistUpdateResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<WatchlistHit> list = this.f17343a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WatchlistUpdateResponse(watchlistItems=");
            sb.append(this.f17343a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$a */
    /* compiled from: RemoteWatchlistDataSource.kt */
    public static final class C8098a {
        private C8098a() {
        }

        public /* synthetic */ C8098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$b */
    /* compiled from: RemoteWatchlistDataSource.kt */
    static final class C8099b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C8099b f17344c = new C8099b();

        C8099b() {
        }

        /* renamed from: a */
        public final List<WatchlistHit> apply(GraphQlResponse<AddToWatchlistResponse> graphQlResponse) {
            Object obj;
            AddToWatchlistResponse addToWatchlistResponse = (AddToWatchlistResponse) graphQlResponse.getData();
            if (addToWatchlistResponse != null) {
                WatchlistUpdateResponse a = addToWatchlistResponse.mo21110a();
                if (a != null) {
                    obj = a.mo21124a();
                    C5884x.m18951a(obj, (String) null, 1, (Object) null);
                    return (List) obj;
                }
            }
            obj = null;
            C5884x.m18951a(obj, (String) null, 1, (Object) null);
            return (List) obj;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource$c */
    /* compiled from: RemoteWatchlistDataSource.kt */
    static final class C8100c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C8100c f17345c = new C8100c();

        C8100c() {
        }

        /* renamed from: a */
        public final List<WatchlistHit> apply(GraphQlResponse<DeleteFromWatchlistResponse> graphQlResponse) {
            Object obj;
            DeleteFromWatchlistResponse deleteFromWatchlistResponse = (DeleteFromWatchlistResponse) graphQlResponse.getData();
            if (deleteFromWatchlistResponse != null) {
                WatchlistUpdateResponse a = deleteFromWatchlistResponse.mo21115a();
                if (a != null) {
                    obj = a.mo21124a();
                    C5884x.m18951a(obj, (String) null, 1, (Object) null);
                    return (List) obj;
                }
            }
            obj = null;
            C5884x.m18951a(obj, (String) null, 1, (Object) null);
            return (List) obj;
        }
    }

    static {
        new C8098a(null);
    }

    public RemoteWatchlistDataSource(C3724a aVar) {
        this.f17339a = aVar;
    }

    /* renamed from: a */
    public final Single<? extends List<WatchlistHit>> mo21108a(List<String> list) {
        Single<? extends List<WatchlistHit>> g = this.f17339a.mo13577a(AddToWatchlistResponse.class, "core/AddToWatchlist", C13173j0.m40356a(C12907r.m40244a("contentIds", list), C12907r.m40244a("requestedAt", Long.valueOf(System.currentTimeMillis()))), null).mo30233g(C8099b.f17344c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.typedSearch<Ad…istItems.checkNotNull() }");
        return g;
    }

    /* renamed from: b */
    public final Single<List<WatchlistHit>> mo21109b(List<String> list) {
        Single<List<WatchlistHit>> g = this.f17339a.mo13577a(DeleteFromWatchlistResponse.class, "core/DeleteFromWatchlist", C13173j0.m40356a(C12907r.m40244a("contentIds", list), C12907r.m40244a("requestedAt", Long.valueOf(System.currentTimeMillis()))), null).mo30233g(C8100c.f17345c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.typedSearch<De…istItems.checkNotNull() }");
        return g;
    }
}
