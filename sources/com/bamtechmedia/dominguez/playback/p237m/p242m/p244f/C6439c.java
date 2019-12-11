package com.bamtechmedia.dominguez.playback.p237m.p242m.p244f;

import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.bamtech.player.exo.sdk4.C1752c;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.media.AudioQuality;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaPreferences;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.PlaybackIntent;
import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.offline.StreamingPreferences;
import com.bamtechmedia.dominguez.offline.StreamingPreferences.CellularDataPreference;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6391e;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6423b;
import com.google.common.base.Optional;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014Bo\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J6\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\"0 0\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00132\b\b\u0002\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0013H\u0002J \u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020.J\"\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;", "", "mediaApi", "Lcom/bamtech/sdk4/media/MediaApi;", "convivaSetup", "Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;", "playbackScenarioProvider", "Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackScenarioProvider;", "streamingPrefs", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/offline/StreamingPreferences;", "connectivityManager", "Landroid/net/ConnectivityManager;", "displayMetrics", "Landroid/util/DisplayMetrics;", "playbackAnalytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;", "localBookmarks", "Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "config", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "mainThread", "Lio/reactivex/Scheduler;", "ioThread", "(Lcom/bamtech/sdk4/media/MediaApi;Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackScenarioProvider;Lcom/google/common/base/Optional;Landroid/net/ConnectivityManager;Landroid/util/DisplayMetrics;Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;Lcom/bamtechmedia/dominguez/bookmarks/LocalBookmarks;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "assertOnMainThread", "", "message", "", "createSession", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "Lcom/bamtech/sdk4/media/PlaybackContext;", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "playable", "startFromBeginning", "", "getPlaybackContext", "getResumePoint", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getThumbnailResolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "prepareVideoPlayer", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "resumePoint", "preferences", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c */
/* compiled from: SessionStarter.kt */
public final class C6439c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MediaApi f14597a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6384c f14598b;

    /* renamed from: c */
    private final C6423b f14599c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Optional<StreamingPreferences> f14600d;

    /* renamed from: e */
    private final ConnectivityManager f14601e;

    /* renamed from: f */
    private final DisplayMetrics f14602f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6391e f14603g;

    /* renamed from: h */
    private final C3165c<C3693o> f14604h;

    /* renamed from: i */
    private final C6266a f14605i;

    /* renamed from: j */
    private final C11969r f14606j;

    /* renamed from: k */
    private final C11969r f14607k;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c$a */
    /* compiled from: SessionStarter.kt */
    public static final class C6440a {
        private C6440a() {
        }

        public /* synthetic */ C6440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c$b */
    /* compiled from: SessionStarter.kt */
    static final class C6441b<T> implements Consumer<MediaItem> {

        /* renamed from: U */
        final /* synthetic */ C3693o f14608U;

        /* renamed from: V */
        final /* synthetic */ PlaybackContext f14609V;

        /* renamed from: c */
        final /* synthetic */ C6439c f14610c;

        C6441b(C6439c cVar, C3693o oVar, PlaybackContext playbackContext) {
            this.f14610c = cVar;
            this.f14608U = oVar;
            this.f14609V = playbackContext;
        }

        /* renamed from: a */
        public final void accept(MediaItem mediaItem) {
            C6391e c = this.f14610c.f14603g;
            C12880j.m40222a((Object) mediaItem, "it");
            c.mo19036a(mediaItem, this.f14608U, this.f14609V.getPlaybackSessionId());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c$c */
    /* compiled from: SessionStarter.kt */
    static final class C6442c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ SDK4ExoPlaybackEngine f14611U;

        /* renamed from: V */
        final /* synthetic */ C3693o f14612V;

        /* renamed from: c */
        final /* synthetic */ C6439c f14613c;

        C6442c(C6439c cVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar) {
            this.f14613c = cVar;
            this.f14611U = sDK4ExoPlaybackEngine;
            this.f14612V = oVar;
        }

        /* renamed from: a */
        public final Single<MediaItem> apply(MediaItem mediaItem) {
            Single<MediaItem> a = this.f14613c.f14598b.mo19028a((C5280i) this.f14611U, this.f14612V, mediaItem.getDefaultPlaylist()).mo30045a(mediaItem);
            C12880j.m40222a((Object) a, "convivaSetup.initializeC…list).toSingleDefault(it)");
            return a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c$d */
    /* compiled from: SessionStarter.kt */
    static final class C6443d<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ SDK4ExoPlaybackEngine f14614U;

        /* renamed from: V */
        final /* synthetic */ C3693o f14615V;

        /* renamed from: W */
        final /* synthetic */ boolean f14616W;

        /* renamed from: c */
        final /* synthetic */ C6439c f14617c;

        C6443d(C6439c cVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, boolean z) {
            this.f14617c = cVar;
            this.f14614U = sDK4ExoPlaybackEngine;
            this.f14615V = oVar;
            this.f14616W = z;
        }

        /* renamed from: a */
        public final MediaItemPlaylist apply(MediaItem mediaItem) {
            this.f14617c.m20117a("player must be prepared on main thread");
            SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14614U;
            long a = this.f14617c.m20109a(this.f14615V, this.f14616W, mediaItem);
            C6439c cVar = this.f14617c;
            C5326w d = sDK4ExoPlaybackEngine.mo7539d();
            C12880j.m40222a((Object) d, "videoPlayer");
            cVar.m20116a(d, a, (StreamingPreferences) this.f14617c.f14600d.mo27107c());
            sDK4ExoPlaybackEngine.mo7532a(C1752c.m8115a(this.f14617c.f14597a, mediaItem, this.f14617c.mo19090a()));
            Float n = this.f14615V.mo13275n();
            sDK4ExoPlaybackEngine.mo7529a(n != null ? n.floatValue() : -1.0f);
            PlaybackSession i = this.f14614U.mo7814i();
            if (i != null) {
                return i.prepare(mediaItem);
            }
            return null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.c$e */
    /* compiled from: SessionStarter.kt */
    static final class C6444e<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ PlaybackContext f14618c;

        C6444e(PlaybackContext playbackContext) {
            this.f14618c = playbackContext;
        }

        /* renamed from: a */
        public final Pair<MediaItemPlaylist, PlaybackContext> apply(MediaItemPlaylist mediaItemPlaylist) {
            return new Pair<>(mediaItemPlaylist, this.f14618c);
        }
    }

    static {
        new C6440a(null);
    }

    public C6439c(MediaApi mediaApi, C6384c cVar, C6423b bVar, Optional<StreamingPreferences> optional, ConnectivityManager connectivityManager, DisplayMetrics displayMetrics, C6391e eVar, C3165c<C3693o> cVar2, C6266a aVar, C11969r rVar, C11969r rVar2) {
        this.f14597a = mediaApi;
        this.f14598b = cVar;
        this.f14599c = bVar;
        this.f14600d = optional;
        this.f14601e = connectivityManager;
        this.f14602f = displayMetrics;
        this.f14603g = eVar;
        this.f14604h = cVar2;
        this.f14605i = aVar;
        this.f14606j = rVar;
        this.f14607k = rVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ Single m20113a(C6439c cVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cVar.mo19091a(sDK4ExoPlaybackEngine, oVar, z);
    }

    /* renamed from: a */
    public final Single<Pair<MediaItemPlaylist, PlaybackContext>> mo19091a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, boolean z) {
        MediaDescriptor mediaDescriptor = new MediaDescriptor(oVar.mo13278q(), oVar.mo12903f(), null, this.f14599c.mo19076d(), null, null, this.f14599c.mo19075c(), new MediaPreferences(null, AudioQuality.atmos), 52, null);
        PlayerAdapter j = sDK4ExoPlaybackEngine.mo7815j();
        C12880j.m40222a((Object) j, "engine.playerAdapter");
        if (sDK4ExoPlaybackEngine.mo7814i() == null) {
            sDK4ExoPlaybackEngine.mo7813a(this.f14597a.createPlaybackSession(j));
        }
        PlaybackContext a = m20111a(oVar);
        Single<Pair<MediaItemPlaylist, PlaybackContext>> g = this.f14604h.mo12184a(oVar).mo30055f().mo30044a((SingleSource<T>) this.f14597a.fetch(mediaDescriptor, a)).mo30211a(this.f14607k).mo30227d((Consumer<? super T>) new C6441b<Object>(this, oVar, a)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6442c<Object,Object>(this, sDK4ExoPlaybackEngine, oVar)).mo30211a(this.f14606j).mo30233g(new C6443d(this, sDK4ExoPlaybackEngine, oVar, z)).mo30233g(new C6444e(a));
        C12880j.m40222a((Object) g, "localBookmarks.preparePl…ir(it, playbackContext) }");
        return g;
    }

    /* renamed from: a */
    public final ThumbnailResolution mo19090a() {
        if (this.f14601e.isActiveNetworkMetered()) {
            return ThumbnailResolution.LOW;
        }
        if (this.f14602f.density >= 2.5f) {
            return ThumbnailResolution.HIGH;
        }
        return ThumbnailResolution.MED;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final long m20109a(C3693o oVar, boolean z, MediaItem mediaItem) {
        Long playhead = oVar.getPlayhead();
        if ((playhead != null && playhead.longValue() == -1) || z) {
            return 0;
        }
        return C6445d.m20128b(mediaItem);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20116a(C5326w wVar, long j, StreamingPreferences streamingPreferences) {
        boolean isActiveNetworkMetered = this.f14601e.isActiveNetworkMetered();
        if ((streamingPreferences != null ? streamingPreferences.mo18832b() : null) == CellularDataPreference.DATA_SAVER && isActiveNetworkMetered) {
            C5855o oVar = C5855o.f13640a;
            wVar.mo7601a(this.f14605i.mo18856g(), this.f14605i.mo18855f(), this.f14605i.mo18854e());
        } else if (this.f14601e.isActiveNetworkMetered()) {
            C5855o oVar2 = C5855o.f13640a;
            wVar.mo7601a(Integer.MAX_VALUE, Integer.MAX_VALUE, this.f14605i.mo18853d());
        } else {
            C5855o oVar3 = C5855o.f13640a;
            wVar.mo7601a(Integer.MAX_VALUE, Integer.MAX_VALUE, this.f14605i.mo18858i());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("playheadMilliseconds ");
        sb.append(j);
        C14100a.m44522a(sb.toString(), new Object[0]);
        wVar.mo7612b(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20117a(String str) {
        if (!C12880j.m40224a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            throw new IllegalStateException(str.toString());
        }
    }

    /* renamed from: a */
    private final PlaybackContext m20111a(C3693o oVar) {
        return this.f14597a.initializePlaybackContext(PlaybackIntent.userAction, true, false, C13173j0.m40356a(C12907r.m40244a("contentId", oVar.mo12903f()), C12907r.m40244a("mediaId", oVar.getMediaId())));
    }
}
