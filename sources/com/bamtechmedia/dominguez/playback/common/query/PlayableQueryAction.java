package com.bamtechmedia.dominguez.playback.common.query;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;)V", "playableQuery", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "contentId", "", "Companion", "ContentIdReferenceResponse", "DmcVideoElements", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayableQueryAction.kt */
public final class PlayableQueryAction {

    /* renamed from: a */
    private final C3724a f14361a;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction$ContentIdReferenceResponse;", "", "videoElements", "Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction$DmcVideoElements;", "(Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction$DmcVideoElements;)V", "getVideoElements", "()Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction$DmcVideoElements;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PlayableQueryAction.kt */
    public static final class ContentIdReferenceResponse {

        /* renamed from: a */
        private final DmcVideoElements f14362a;

        public ContentIdReferenceResponse(@C11724g(name = "DmcVideos") DmcVideoElements dmcVideoElements) {
            this.f14362a = dmcVideoElements;
        }

        /* renamed from: a */
        public final DmcVideoElements mo18895a() {
            return this.f14362a;
        }

        public final ContentIdReferenceResponse copy(@C11724g(name = "DmcVideos") DmcVideoElements dmcVideoElements) {
            return new ContentIdReferenceResponse(dmcVideoElements);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f14362a, (java.lang.Object) ((com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse) r2).f14362a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$ContentIdReferenceResponse r2 = (com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse) r2
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$DmcVideoElements r0 = r1.f14362a
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$DmcVideoElements r2 = r2.f14362a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            DmcVideoElements dmcVideoElements = this.f14362a;
            if (dmcVideoElements != null) {
                return dmcVideoElements.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContentIdReferenceResponse(videoElements=");
            sb.append(this.f14362a);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction$DmcVideoElements;", "", "videos", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "(Ljava/util/List;)V", "getVideos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PlayableQueryAction.kt */
    public static final class DmcVideoElements {

        /* renamed from: a */
        private final List<C3626b> f14363a;

        public DmcVideoElements(List<? extends C3626b> list) {
            this.f14363a = list;
        }

        /* renamed from: a */
        public final List<C3626b> mo18900a() {
            return this.f14363a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f14363a, (java.lang.Object) ((com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.DmcVideoElements) r2).f14363a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.DmcVideoElements
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$DmcVideoElements r2 = (com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.DmcVideoElements) r2
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r1.f14363a
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r2 = r2.f14363a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.DmcVideoElements.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<C3626b> list = this.f14363a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DmcVideoElements(videos=");
            sb.append(this.f14363a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$a */
    /* compiled from: PlayableQueryAction.kt */
    public static final class C6292a {
        private C6292a() {
        }

        public /* synthetic */ C6292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$b */
    /* compiled from: PlayableQueryAction.kt */
    static final class C6293b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6293b f14364c = new C6293b();

        C6293b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bamtechmedia.dominguez.core.content.C3693o apply(com.bamtech.sdk4.content.GraphQlResponse<com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse> r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r4.getData()
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$ContentIdReferenceResponse r0 = (com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.ContentIdReferenceResponse) r0
                r1 = 0
                if (r0 == 0) goto L_0x001c
                com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction$DmcVideoElements r0 = r0.mo18895a()
                if (r0 == 0) goto L_0x001c
                java.util.List r0 = r0.mo18900a()
                if (r0 == 0) goto L_0x001c
                java.lang.Object r0 = kotlin.p590y.C13199w.m40591g(r0)
                com.bamtechmedia.dominguez.core.content.assets.b r0 = (com.bamtechmedia.dominguez.core.content.assets.C3626b) r0
                goto L_0x001d
            L_0x001c:
                r0 = r1
            L_0x001d:
                boolean r2 = r0 instanceof com.bamtechmedia.dominguez.core.content.C3693o
                if (r2 != 0) goto L_0x0022
                r0 = r1
            L_0x0022:
                com.bamtechmedia.dominguez.core.content.o r0 = (com.bamtechmedia.dominguez.core.content.C3693o) r0
                if (r0 == 0) goto L_0x0027
                return r0
            L_0x0027:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Missing or bad data in GraphQlResponse "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction.C6293b.apply(com.bamtech.sdk4.content.GraphQlResponse):com.bamtechmedia.dominguez.core.content.o");
        }
    }

    static {
        new C6292a(null);
    }

    public PlayableQueryAction(C3724a aVar) {
        this.f14361a = aVar;
    }

    /* renamed from: a */
    public final Single<C3693o> mo18894a(String str) {
        Single<C3693o> g = this.f14361a.mo13577a(ContentIdReferenceResponse.class, "core/DmcVideos", C13170i0.m40332a(C12907r.m40244a("contentId", str)), null).mo30233g(C6293b.f14364c);
        C12880j.m40222a((Object) g, "searchApi.typedSearch<Co…ponse $it\")\n            }");
        return g;
    }
}
