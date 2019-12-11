package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.bookmarks.C3166d;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.Collection;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJI\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0018\u00010\u0010j\u0002`\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0018\u00010\u0010j\u0002`\u0012J$\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/RemoteContentSetDataSource;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "requestConfig", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetRequestConfig;", "localBookmarks", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetRequestConfig;Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;)V", "get", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "type", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "setId", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "lastUpdated", "", "pageSize", "", "(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lio/reactivex/Single;", "getNextPage", "set", "localBookmarkMapOnce", "", "Companion", "SetBySetId", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoteContentSetDataSource.kt */
public final class RemoteContentSetDataSource {
    @Deprecated

    /* renamed from: d */
    public static final C3757a f9379d = new C3757a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3724a f9380a;

    /* renamed from: b */
    private final C3776f f9381b;

    /* renamed from: c */
    private final C3165c<C3693o> f9382c;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/RemoteContentSetDataSource$SetBySetId;", "", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V", "getSet", "()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RemoteContentSetDataSource.kt */
    public static final class SetBySetId {

        /* renamed from: a */
        private final ContentSet f9383a;

        public SetBySetId(@C11724g(name = "SetBySetId") ContentSet contentSet) {
            this.f9383a = contentSet;
        }

        /* renamed from: a */
        public final ContentSet mo13645a() {
            return this.f9383a;
        }

        public final SetBySetId copy(@C11724g(name = "SetBySetId") ContentSet contentSet) {
            return new SetBySetId(contentSet);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f9383a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource.SetBySetId) r2).f9383a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource.SetBySetId
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$SetBySetId r2 = (com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource.SetBySetId) r2
                com.bamtechmedia.dominguez.core.content.sets.ContentSet r0 = r1.f9383a
                com.bamtechmedia.dominguez.core.content.sets.ContentSet r2 = r2.f9383a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource.SetBySetId.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ContentSet contentSet = this.f9383a;
            if (contentSet != null) {
                return contentSet.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetBySetId(set=");
            sb.append(this.f9383a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$a */
    /* compiled from: RemoteContentSetDataSource.kt */
    private static final class C3757a {
        private C3757a() {
        }

        public /* synthetic */ C3757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$b */
    /* compiled from: RemoteContentSetDataSource.kt */
    static final class C3758b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ Map f9384c;

        C3758b(Map map) {
            this.f9384c = map;
        }

        /* renamed from: a */
        public final Map<String, Object> apply(Map<String, ? extends Object> map) {
            Map map2 = this.f9384c;
            boolean z = !map.isEmpty();
            RemoteContentSetDataSource.f9379d;
            return C5859p.m18901a(map2, z, "lastBookmark", map);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$c */
    /* compiled from: RemoteContentSetDataSource.kt */
    static final class C3759c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f9385U;

        /* renamed from: c */
        final /* synthetic */ RemoteContentSetDataSource f9386c;

        C3759c(RemoteContentSetDataSource remoteContentSetDataSource, String str) {
            this.f9386c = remoteContentSetDataSource;
            this.f9385U = str;
        }

        /* renamed from: a */
        public final Single<GraphQlResponse<SetBySetId>> apply(Map<String, ? extends Object> map) {
            C3724a a = this.f9386c.f9380a;
            RemoteContentSetDataSource.f9379d;
            return a.mo13577a(SetBySetId.class, "core/SetBySetId", map, this.f9385U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$d */
    /* compiled from: RemoteContentSetDataSource.kt */
    static final class C3760d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3760d f9387c = new C3760d();

        C3760d() {
        }

        /* renamed from: a */
        public final ContentSet apply(GraphQlResponse<SetBySetId> graphQlResponse) {
            SetBySetId setBySetId = (SetBySetId) graphQlResponse.getData();
            ContentSet a = setBySetId != null ? setBySetId.mo13645a() : null;
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("No data in GraphQlRespone".toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource$e */
    /* compiled from: RemoteContentSetDataSource.kt */
    static final class C3761e<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ ContentSet f9388c;

        C3761e(ContentSet contentSet) {
            this.f9388c = contentSet;
        }

        /* renamed from: a */
        public final ContentSet apply(GraphQlResponse<SetBySetId> graphQlResponse) {
            SetBySetId setBySetId = (SetBySetId) graphQlResponse.getData();
            Object a = setBySetId != null ? setBySetId.mo13645a() : null;
            C5884x.m18951a(a, (String) null, 1, (Object) null);
            ContentSet contentSet = (ContentSet) a;
            return ContentSet.m12706a(contentSet, null, null, null, C13199w.m40583d((Collection) this.f9388c.mo13614i(), (Iterable) contentSet.mo13614i()), null, null, null, 119, null);
        }
    }

    public RemoteContentSetDataSource(C3724a aVar, C3776f fVar, C3165c<C3693o> cVar) {
        this.f9380a = aVar;
        this.f9381b = fVar;
        this.f9382c = cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Single m12748a(RemoteContentSetDataSource remoteContentSetDataSource, ContentSetType contentSetType, String str, String str2, Long l, Integer num, int i, Object obj) {
        return remoteContentSetDataSource.mo13644a(contentSetType, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num);
    }

    /* renamed from: a */
    public final Single<ContentSet> mo13644a(ContentSetType contentSetType, String str, String str2, Long l, Integer num) {
        Single<ContentSet> g = m12747a(contentSetType).mo30233g(new C3758b(C5859p.m18900a(C5859p.m18900a(C5859p.m18900a(C13173j0.m40356a(C12907r.m40244a("setId", str), C12907r.m40244a("setType", contentSetType.name())), C12907r.m40244a("lastUpdated", l)), C12907r.m40244a("pageSize", num)), C12907r.m40244a("text_field", this.f9381b.mo13666a(contentSetType))))).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C3759c<Object,Object>(this, str2)).mo30233g(C3760d.f9387c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "localBookmarkMapOnce(typ…ta in GraphQlRespone\" } }");
        return g;
    }

    /* renamed from: a */
    private final Single<Map<String, Object>> m12747a(ContentSetType contentSetType) {
        if (contentSetType == ContentSetType.ContinueWatchingSet) {
            return C3166d.m11070a(this.f9382c);
        }
        Single<Map<String, Object>> b = Single.m38399b(C13173j0.m40350a());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(emptyMap())");
        return b;
    }

    /* renamed from: a */
    public final Single<ContentSet> mo13643a(ContentSet contentSet, String str) {
        Pair[] pairArr = {C12907r.m40244a("setId", contentSet.mo13608e()), C12907r.m40244a("setType", contentSet.mo13618k()), C12907r.m40244a("pageSize", Integer.valueOf(contentSet.m12717f0().mo13411Z())), C12907r.m40244a("page", Integer.valueOf(contentSet.m12717f0().mo13410Y()))};
        Single<ContentSet> g = this.f9380a.mo13577a(SetBySetId.class, "core/SetBySetId", C13173j0.m40356a(pairArr), str).mo30233g(new C3761e(contentSet));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.typedSearch<Se…items + newSet.items) } }");
        return g;
    }
}
