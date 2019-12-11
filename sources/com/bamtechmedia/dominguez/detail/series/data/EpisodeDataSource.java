package com.bamtechmedia.dominguez.detail.series.data;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.content.search.C3724a.C3726b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;
import p163g.p500m.p501a.C11780y;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/EpisodeDataSource;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;)V", "episodeOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "seriesId", "", "seasonSequenceNumber", "", "episodeSequenceNumber", "EpisodesResponse", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EpisodeDataSource.kt */
public final class EpisodeDataSource {

    /* renamed from: a */
    private final C3724a f13890a;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/EpisodeDataSource$EpisodesResponse;", "", "videos", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "(Ljava/util/List;)V", "getVideos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: EpisodeDataSource.kt */
    public static final class EpisodesResponse {

        /* renamed from: a */
        private final List<C3626b> f13891a;

        public EpisodesResponse(List<? extends C3626b> list) {
            this.f13891a = list;
        }

        /* renamed from: a */
        public final List<C3626b> mo18127a() {
            return this.f13891a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13891a, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource.EpisodesResponse) r2).f13891a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource.EpisodesResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource$EpisodesResponse r2 = (com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource.EpisodesResponse) r2
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r1.f13891a
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r2 = r2.f13891a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource.EpisodesResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<C3626b> list = this.f13891a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EpisodesResponse(videos=");
            sb.append(this.f13891a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource$a */
    /* compiled from: EpisodeDataSource.kt */
    static final class C6027a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6027a f13892c = new C6027a();

        C6027a() {
        }

        /* renamed from: a */
        public final C3685g apply(GraphQlResponse<? extends Map<String, EpisodesResponse>> graphQlResponse) {
            Map map = (Map) graphQlResponse.getData();
            if (map != null) {
                EpisodesResponse episodesResponse = (EpisodesResponse) map.get("DmcVideos");
                if (episodesResponse != null) {
                    List a = episodesResponse.mo18127a();
                    if (a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : a) {
                            if (next instanceof C3685g) {
                                arrayList.add(next);
                            }
                        }
                        return (C3685g) C13199w.m40589f((List) arrayList);
                    }
                }
            }
            return null;
        }
    }

    public EpisodeDataSource(C3724a aVar) {
        this.f13890a = aVar;
    }

    /* renamed from: a */
    public final Single<C3685g> mo18126a(String str, int i, int i2) {
        C3724a aVar = this.f13890a;
        ParameterizedType a = C11780y.m37894a((Type) Map.class, String.class, EpisodesResponse.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Types.newParameterizedTy…odesResponse::class.java)");
        String str2 = "core/DmcVideos";
        Single<C3685g> g = C3726b.m12662a(aVar, a, str2, C13173j0.m40356a(C12907r.m40244a("seriesId", str), C12907r.m40244a("seasonSequenceNumber", Integer.valueOf(i)), C12907r.m40244a("episodeSequenceNumber", Integer.valueOf(i2))), null, 8, null).mo30233g(C6027a.f13892c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.search<Map<Str…nce<Episode>()?.first() }");
        return g;
    }
}
