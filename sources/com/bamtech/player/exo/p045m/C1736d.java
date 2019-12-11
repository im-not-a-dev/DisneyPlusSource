package com.bamtech.player.exo.p045m;

import com.bamtech.player.exo.C1708g;
import com.bamtech.player.exo.p044l.C1732d;
import com.google.android.exoplayer2.source.MediaSource;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u001c\u0010!\u001a\u00020\u001d2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/player/exo/media/SingleSourceManager;", "Lcom/bamtech/player/exo/media/MediaSourceManager;", "player", "Lcom/bamtech/player/exo/SimplerExoPlayer;", "mediaSourceCreator", "Lcom/bamtech/player/exo/framework/MediaSourceCreator;", "playerEvents", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/exo/SimplerExoPlayer;Lcom/bamtech/player/exo/framework/MediaSourceCreator;Lcom/bamtech/player/PlayerEvents;)V", "singleSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "getSingleSource", "()Lcom/google/android/exoplayer2/source/MediaSource;", "setSingleSource", "(Lcom/google/android/exoplayer2/source/MediaSource;)V", "wrapper", "Lio/reactivex/functions/Function;", "getWrapper", "()Lio/reactivex/functions/Function;", "setWrapper", "(Lio/reactivex/functions/Function;)V", "createNewMediaSource", "uri", "Landroid/net/Uri;", "type", "Lcom/bamtech/player/VideoType;", "getNumberOfMediaSources", "", "prepareUri", "", "placementIndex", "reset", "restoreAfterBehindLiveException", "setMediaSourceWrapper", "Companion", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.m.d */
/* compiled from: SingleSourceManager.kt */
public final class C1736d implements C1735c {

    /* renamed from: b */
    public static final Function<MediaSource, MediaSource> f6022b = C1737a.f6024c;

    /* renamed from: a */
    private final C1708g f6023a;

    /* renamed from: com.bamtech.player.exo.m.d$a */
    /* compiled from: SingleSourceManager.kt */
    static final class C1737a<T, R> implements Function<MediaSource, MediaSource> {

        /* renamed from: c */
        public static final C1737a f6024c = new C1737a();

        C1737a() {
        }

        /* renamed from: a */
        public final MediaSource mo7756a(MediaSource mediaSource) {
            return mediaSource;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            MediaSource mediaSource = (MediaSource) obj;
            mo7756a(mediaSource);
            return mediaSource;
        }
    }

    /* renamed from: com.bamtech.player.exo.m.d$b */
    /* compiled from: SingleSourceManager.kt */
    public static final class C1738b {
        private C1738b() {
        }

        public /* synthetic */ C1738b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1738b(null);
    }

    public C1736d(C1708g gVar, C1732d dVar, C5300m mVar) {
        this.f6023a = gVar;
    }

    /* renamed from: a */
    public void mo7753a() {
        this.f6023a.mo7649c();
    }

    /* renamed from: a */
    public void mo7754a(Function<MediaSource, MediaSource> function) {
    }

    public void reset() {
    }
}
