package com.bamtechmedia.dominguez.playback.p237m.p239j;

import android.content.Context;
import com.bamtech.player.exo.p041i.C1713d;
import com.bamtech.player.exo.p041i.C1714e;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.playback.C6266a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p426g.p427a.C10812d.C10813a;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ8\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J.\u0010&\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018 (*\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170'H\u0002J\u0006\u0010)\u001a\u00020\u001dJ\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;", "", "metaDataContributorsProvider", "", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/ConvivaMetaDataContributor;", "config", "Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaConfig;", "playbackConfig", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "context", "Landroid/content/Context;", "(Ljava/util/Set;Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaConfig;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;Landroid/content/Context;)V", "convivaBindings", "Lcom/bamtech/player/exo/conviva/ConvivaBindings;", "getConvivaBindings", "()Lcom/bamtech/player/exo/conviva/ConvivaBindings;", "setConvivaBindings", "(Lcom/bamtech/player/exo/conviva/ConvivaBindings;)V", "convivaEvents", "Lio/reactivex/disposables/Disposable;", "createConfiguration", "Lcom/bamtech/player/exo/conviva/ConvivaConfiguration;", "metaData", "", "", "sdkValues", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "debugLog", "", "configuration", "getSdkTrackingMap", "playlist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "initializeConviva", "Lio/reactivex/Completable;", "engine", "Lcom/bamtech/player/PlaybackEngine;", "mapMetaDataOnce", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "release", "videoDurationMillisToSeconds", "", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.j.c */
/* compiled from: ConvivaSetup.kt */
public final class C6384c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Disposable f14497a;

    /* renamed from: b */
    private C1713d f14498b;

    /* renamed from: c */
    private final Set<C2435d> f14499c;

    /* renamed from: d */
    private final C6381a f14500d;

    /* renamed from: e */
    private final C6266a f14501e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f14502f;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.c$a */
    /* compiled from: ConvivaSetup.kt */
    public static final class C6385a {
        private C6385a() {
        }

        public /* synthetic */ C6385a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.c$b */
    /* compiled from: ConvivaSetup.kt */
    static final class C6386b extends C12881k implements Function1<GenreMeta, String> {

        /* renamed from: c */
        public static final C6386b f14503c = new C6386b();

        C6386b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(GenreMeta genreMeta) {
            return genreMeta.mo12797X();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.c$c */
    /* compiled from: ConvivaSetup.kt */
    static final class C6387c<T, R> implements Function<Map<String, ? extends String>, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C5280i f14504U;

        /* renamed from: V */
        final /* synthetic */ MediaItemPlaylist f14505V;

        /* renamed from: W */
        final /* synthetic */ C3693o f14506W;

        /* renamed from: c */
        final /* synthetic */ C6384c f14507c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.j.c$c$a */
        /* compiled from: ConvivaSetup.kt */
        static final class C6388a implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C6387c f14508a;

            /* renamed from: b */
            final /* synthetic */ Map f14509b;

            C6388a(C6387c cVar, Map map) {
                this.f14508a = cVar;
                this.f14509b = map;
            }

            public final void run() {
                this.f14508a.f14504U.mo7537b().mo16962O0();
                Disposable b = this.f14508a.f14507c.f14497a;
                if (b != null) {
                    b.dispose();
                }
                C1713d a = this.f14508a.f14507c.mo19027a();
                if (a != null) {
                    a.mo7671x();
                }
                C6384c cVar = this.f14508a.f14507c;
                Map map = this.f14509b;
                C12880j.m40222a((Object) map, "it");
                C6387c cVar2 = this.f14508a;
                C1714e a2 = cVar.m20008a(map, cVar2.f14507c.m20009a(cVar2.f14505V, cVar2.f14506W), this.f14508a.f14506W);
                C6384c cVar3 = this.f14508a.f14507c;
                cVar3.mo19029a(new C1713d(cVar3.f14502f, this.f14508a.f14504U.mo7539d(), a2));
                C6387c cVar4 = this.f14508a;
                cVar4.f14507c.f14497a = cVar4.f14504U.mo7537b().mo16982a((C4922v2) this.f14508a.f14507c.mo19027a());
                this.f14508a.f14507c.m20011a(a2);
            }
        }

        C6387c(C6384c cVar, C5280i iVar, MediaItemPlaylist mediaItemPlaylist, C3693o oVar) {
            this.f14507c = cVar;
            this.f14504U = iVar;
            this.f14505V = mediaItemPlaylist;
            this.f14506W = oVar;
        }

        /* renamed from: a */
        public final Completable apply(Map<String, String> map) {
            return Completable.m38166c((C11945a) new C6388a(this, map));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.c$d */
    /* compiled from: ConvivaSetup.kt */
    static final class C6389d<T, R> implements Function<Object[], R> {

        /* renamed from: c */
        public static final C6389d f14510c = new C6389d();

        C6389d() {
        }

        /* renamed from: a */
        public final Map<String, String> apply(Object[] objArr) {
            ArrayList<Map> arrayList = new ArrayList<>();
            for (Object obj : objArr) {
                if (obj instanceof Map) {
                    arrayList.add(obj);
                }
            }
            Map<String, String> a = C13173j0.m40350a();
            for (Map a2 : arrayList) {
                a = C13173j0.m40353a((Map) a, a2);
            }
            return a;
        }
    }

    static {
        new C6385a(null);
    }

    public C6384c(Set<? extends C2435d> set, C6381a aVar, C6266a aVar2, Context context) {
        this.f14499c = set;
        this.f14500d = aVar;
        this.f14501e = aVar2;
        this.f14502f = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20011a(C1714e eVar) {
    }

    /* renamed from: c */
    private final Single<Map<String, String>> m20015c() {
        Set<C2435d> set = this.f14499c;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (C2435d dVar : set) {
            Single a = dVar.mo11526b().mo30203a(1500, TimeUnit.MILLISECONDS, C11934b.m38498a()).mo30213a(C13173j0.m40350a());
            C12880j.m40222a((Object) a, "it.createMetaData().time…rorReturnItem(emptyMap())");
            C12880j.m40222a((Object) dVar.getClass().getName(), "it.javaClass.name");
            arrayList.add(a);
        }
        Single<Map<String, String>> a2 = Single.m38394a((Iterable<? extends SingleSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) C6389d.f14510c);
        C12880j.m40222a((Object) a2, "Single.zip(metaDataContr…target + item }\n        }");
        return a2;
    }

    /* renamed from: b */
    public final void mo19030b() {
        Disposable disposable = this.f14497a;
        if (disposable != null) {
            disposable.dispose();
        }
        C1713d dVar = this.f14498b;
        if (dVar != null) {
            dVar.mo7671x();
        }
    }

    /* renamed from: a */
    public final C1713d mo19027a() {
        return this.f14498b;
    }

    /* renamed from: a */
    public final void mo19029a(C1713d dVar) {
        this.f14498b = dVar;
    }

    /* renamed from: a */
    public final Completable mo19028a(C5280i iVar, C3693o oVar, MediaItemPlaylist mediaItemPlaylist) {
        Completable b = m20015c().mo30217b((Function<? super T, ? extends CompletableSource>) new C6387c<Object,Object>(this, iVar, mediaItemPlaylist, oVar));
        C12880j.m40222a((Object) b, "mapMetaDataOnce()\n      …          }\n            }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1714e m20008a(Map<String, String> map, Map<String, String> map2, C3693o oVar) {
        C1714e eVar = new C1714e(this.f14500d.mo19024b());
        eVar.mo7675a(C13173j0.m40353a((Map) map, (Map) map2), C6390d.m20023a(oVar), "BTMP Android");
        C1714e eVar2 = eVar;
        eVar2.mo7673a(C10813a.VOD, (String) map2.get("userid"), oVar.mo13278q(), 24, m20005a(oVar));
        eVar.mo7677b(this.f14500d.mo19026d());
        eVar.mo7674a(this.f14500d.mo19025c());
        return eVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c3, code lost:
        if (r8 != null) goto L_0x00ca;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> m20009a(com.bamtech.sdk4.media.MediaItemPlaylist r19, com.bamtechmedia.dominguez.core.content.C3693o r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            com.bamtech.sdk4.media.MediaAnalyticsKey r2 = com.bamtech.sdk4.media.MediaAnalyticsKey.CONVIVA
            r3 = r19
            java.util.Map r2 = r3.getTrackingData(r2)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 == 0) goto L_0x0019
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L_0x0019
        L_0x0039:
            r2 = 17
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            r4 = 0
            com.bamtechmedia.dominguez.playback.m.j.a r5 = r0.f14500d
            java.lang.String r5 = r5.mo19023a()
            java.lang.String r6 = "applicationName"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r6, r5)
            r2[r4] = r5
            r4 = 1
            java.lang.String r5 = "playerVersion"
            java.lang.String r6 = "BTMP Android 53.0"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r5, r6)
            r2[r4] = r5
            r4 = 2
            long r5 = r0.m20005a(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "contentDuration"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r6, r5)
            r2[r4] = r5
            r4 = 3
            com.bamtech.sdk4.media.PlaybackIntent r5 = com.bamtech.sdk4.media.PlaybackIntent.userAction
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "startType"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r6, r5)
            r2[r4] = r5
            r4 = 4
            g.g.a.d$a r5 = p163g.p426g.p427a.C10812d.C10813a.VOD
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "streamType"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r6, r5)
            r2[r4] = r5
            r4 = 5
            java.lang.String r5 = "encodedFrameRate"
            java.lang.String r6 = "23.97"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r5, r6)
            r2[r4] = r5
            r4 = 6
            java.lang.String r5 = r20.mo12910s()
            java.lang.String r6 = "NA"
            if (r5 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r5 = r6
        L_0x009c:
            java.lang.String r7 = "language"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r7, r5)
            r2[r4] = r5
            r4 = 7
            java.lang.String r5 = r20.mo12909r()
            java.lang.String r7 = "programType"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r7, r5)
            r2[r4] = r5
            r4 = 8
            boolean r5 = r1 instanceof com.bamtechmedia.dominguez.core.content.C3685g
            r7 = 0
            if (r5 != 0) goto L_0x00ba
            r8 = r7
            goto L_0x00bb
        L_0x00ba:
            r8 = r1
        L_0x00bb:
            com.bamtechmedia.dominguez.core.content.g r8 = (com.bamtechmedia.dominguez.core.content.C3685g) r8
            if (r8 == 0) goto L_0x00c6
            java.lang.String r8 = r8.mo12877G()
            if (r8 == 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r8 = r20.getTitle()
        L_0x00ca:
            java.lang.String r9 = "title"
            kotlin.Pair r8 = kotlin.C12907r.m40244a(r9, r8)
            r2[r4] = r8
            r4 = 9
            java.util.List r8 = r20.mo12896c()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00e0
            r8 = r6
            goto L_0x00f4
        L_0x00e0:
            java.util.List r9 = r20.mo12896c()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.bamtechmedia.dominguez.playback.m.j.c$b r15 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c.C6386b.f14503c
            r16 = 30
            r17 = 0
            java.lang.String r10 = ","
            java.lang.String r8 = kotlin.p590y.C13199w.m40559a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00f4:
            java.lang.String r9 = "genre"
            kotlin.Pair r8 = kotlin.C12907r.m40244a(r9, r8)
            r2[r4] = r8
            r4 = 10
            if (r5 != 0) goto L_0x0102
            r8 = r7
            goto L_0x0103
        L_0x0102:
            r8 = r1
        L_0x0103:
            com.bamtechmedia.dominguez.core.content.g r8 = (com.bamtechmedia.dominguez.core.content.C3685g) r8
            if (r8 == 0) goto L_0x0110
            int r8 = r8.mo12879J()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0111
        L_0x0110:
            r8 = r7
        L_0x0111:
            java.lang.String r8 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6390d.m20026b(r8)
            java.lang.String r9 = "episodeNumber"
            kotlin.Pair r8 = kotlin.C12907r.m40244a(r9, r8)
            r2[r4] = r8
            r4 = 11
            if (r5 != 0) goto L_0x0122
            r1 = r7
        L_0x0122:
            com.bamtechmedia.dominguez.core.content.g r1 = (com.bamtechmedia.dominguez.core.content.C3685g) r1
            if (r1 == 0) goto L_0x012e
            int r1 = r1.mo12876F()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x012e:
            java.lang.String r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6390d.m20026b(r7)
            java.lang.String r5 = "seasonNumber"
            kotlin.Pair r1 = kotlin.C12907r.m40244a(r5, r1)
            r2[r4] = r1
            r1 = 12
            java.lang.String r4 = "playlistSessionId"
            kotlin.Pair r4 = kotlin.C12907r.m40244a(r4, r6)
            r2[r1] = r4
            r1 = 13
            java.lang.String r4 = "franchise"
            kotlin.Pair r4 = kotlin.C12907r.m40244a(r4, r6)
            r2[r1] = r4
            r1 = 14
            java.lang.String r4 = "channelId"
            kotlin.Pair r4 = kotlin.C12907r.m40244a(r4, r6)
            r2[r1] = r4
            r1 = 15
            java.lang.String r4 = "ver"
            kotlin.Pair r4 = kotlin.C12907r.m40244a(r4, r6)
            r2[r1] = r4
            r1 = 16
            com.bamtechmedia.dominguez.playback.a r4 = r0.f14501e
            boolean r4 = r4.mo18863n()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "experimentTunneledPlayback"
            kotlin.Pair r4 = kotlin.C12907r.m40244a(r5, r4)
            r2[r1] = r4
            java.util.Map r1 = kotlin.p590y.C13173j0.m40356a(r2)
            java.util.Map r1 = kotlin.p590y.C13173j0.m40353a(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c.m20009a(com.bamtech.sdk4.media.MediaItemPlaylist, com.bamtechmedia.dominguez.core.content.o):java.util.Map");
    }

    /* renamed from: a */
    private final long m20005a(C3693o oVar) {
        Long w = oVar.mo12913w();
        if (w != null) {
            return w.longValue() / ((long) 1000);
        }
        return 0;
    }
}
