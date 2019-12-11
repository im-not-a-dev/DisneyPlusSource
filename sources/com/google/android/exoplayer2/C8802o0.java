package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.Player.AudioComponent;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.MetadataComponent;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C8673a;
import com.google.android.exoplayer2.analytics.C8673a.C8674a;
import com.google.android.exoplayer2.drm.C8709k;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.metadata.C8743e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p361p0.C8831i;
import com.google.android.exoplayer2.p361p0.C8835k;
import com.google.android.exoplayer2.p361p0.C8835k.C8838c;
import com.google.android.exoplayer2.p361p0.C8839l;
import com.google.android.exoplayer2.p361p0.C8842n;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9542g;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9575z;
import com.google.android.exoplayer2.p394w0.C9597n;
import com.google.android.exoplayer2.p394w0.C9602q;
import com.google.android.exoplayer2.p394w0.C9603r;
import com.google.android.exoplayer2.p394w0.p395s.C9605a;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.o0 */
/* compiled from: SimpleExoPlayer */
public class C8802o0 extends C8812p implements ExoPlayer, AudioComponent, VideoComponent, TextComponent, MetadataComponent {

    /* renamed from: A */
    private MediaSource f18684A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public List<C9322b> f18685B;

    /* renamed from: C */
    private C9597n f18686C;

    /* renamed from: D */
    private C9605a f18687D;

    /* renamed from: E */
    private boolean f18688E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C9575z f18689F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f18690G;

    /* renamed from: b */
    protected final C8733l0[] f18691b;

    /* renamed from: c */
    private final C9613y f18692c;

    /* renamed from: d */
    private final Handler f18693d;

    /* renamed from: e */
    private final C8804b f18694e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CopyOnWriteArraySet<C9602q> f18695f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final CopyOnWriteArraySet<C8839l> f18696g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<C9332k> f18697h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CopyOnWriteArraySet<C8743e> f18698i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final CopyOnWriteArraySet<C9603r> f18699j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final CopyOnWriteArraySet<C8842n> f18700k;

    /* renamed from: l */
    private final BandwidthMeter f18701l;

    /* renamed from: m */
    private final C8673a f18702m;

    /* renamed from: n */
    private final C8835k f18703n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Format f18704o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Format f18705p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Surface f18706q;

    /* renamed from: r */
    private boolean f18707r;

    /* renamed from: s */
    private SurfaceHolder f18708s;

    /* renamed from: t */
    private TextureView f18709t;

    /* renamed from: u */
    private int f18710u;

    /* renamed from: v */
    private int f18711v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C8878d f18712w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C8878d f18713x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f18714y;

    /* renamed from: z */
    private float f18715z;

    /* renamed from: com.google.android.exoplayer2.o0$b */
    /* compiled from: SimpleExoPlayer */
    private final class C8804b implements C9603r, C8842n, C9332k, C8743e, Callback, SurfaceTextureListener, C8838c, EventListener {
        private C8804b() {
        }

        /* renamed from: a */
        public void mo7739a(String str, long j, long j2) {
            Iterator it = C8802o0.this.f18699j.iterator();
            while (it.hasNext()) {
                ((C9603r) it.next()).mo7739a(str, j, j2);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo7578a(boolean z) {
            C8729j0.m25320a((EventListener) this, z);
        }

        /* renamed from: b */
        public void mo7741b(C8878d dVar) {
            C8802o0.this.f18713x = dVar;
            Iterator it = C8802o0.this.f18700k.iterator();
            while (it.hasNext()) {
                ((C8842n) it.next()).mo7741b(dVar);
            }
        }

        /* renamed from: c */
        public void mo7743c(C8878d dVar) {
            C8802o0.this.f18712w = dVar;
            Iterator it = C8802o0.this.f18699j.iterator();
            while (it.hasNext()) {
                ((C9603r) it.next()).mo7743c(dVar);
            }
        }

        /* renamed from: d */
        public void mo7744d(C8878d dVar) {
            Iterator it = C8802o0.this.f18699j.iterator();
            while (it.hasNext()) {
                ((C9603r) it.next()).mo7744d(dVar);
            }
            C8802o0.this.f18704o = null;
            C8802o0.this.f18712w = null;
        }

        public void onLoadingChanged(boolean z) {
            if (C8802o0.this.f18689F == null) {
                return;
            }
            if (z && !C8802o0.this.f18690G) {
                C8802o0.this.f18689F.mo24725a(0);
                C8802o0.this.f18690G = true;
            } else if (!z && C8802o0.this.f18690G) {
                C8802o0.this.f18689F.mo24728d(0);
                C8802o0.this.f18690G = false;
            }
        }

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C8729j0.m25317a((EventListener) this, playbackParameters);
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C8729j0.m25316a((EventListener) this, exoPlaybackException);
        }

        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C8729j0.m25321a((EventListener) this, z, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C8729j0.m25315a((EventListener) this, i);
        }

        public /* synthetic */ void onRepeatModeChanged(int i) {
            C8729j0.m25322b((EventListener) this, i);
        }

        public /* synthetic */ void onSeekProcessed() {
            C8729j0.m25314a(this);
        }

        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C8729j0.m25324c(this, z);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C8802o0.this.m25452a(new Surface(surfaceTexture), true);
            C8802o0.this.m25451a(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C8802o0.this.m25452a((Surface) null, true);
            C8802o0.this.m25451a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C8802o0.this.m25451a(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C8729j0.m25318a(this, timeline, obj, i);
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C8729j0.m25319a((EventListener) this, trackGroupArray, trackSelectionArray);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C8802o0.this.m25451a(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C8802o0.this.m25452a(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C8802o0.this.m25452a((Surface) null, false);
            C8802o0.this.m25451a(0, 0);
        }

        /* renamed from: a */
        public void mo7737a(Format format) {
            C8802o0.this.f18704o = format;
            Iterator it = C8802o0.this.f18699j.iterator();
            while (it.hasNext()) {
                ((C9603r) it.next()).mo7737a(format);
            }
        }

        /* renamed from: b */
        public void mo7742b(String str, long j, long j2) {
            Iterator it = C8802o0.this.f18700k.iterator();
            while (it.hasNext()) {
                ((C8842n) it.next()).mo7742b(str, j, j2);
            }
        }

        /* renamed from: a */
        public void mo7734a(int i, long j) {
            Iterator it = C8802o0.this.f18699j.iterator();
            while (it.hasNext()) {
                ((C9603r) it.next()).mo7734a(i, j);
            }
        }

        /* renamed from: b */
        public void mo7740b(Format format) {
            C8802o0.this.f18705p = format;
            Iterator it = C8802o0.this.f18700k.iterator();
            while (it.hasNext()) {
                ((C8842n) it.next()).mo7740b(format);
            }
        }

        /* renamed from: a */
        public void mo7733a(int i, int i2, int i3, float f) {
            Iterator it = C8802o0.this.f18695f.iterator();
            while (it.hasNext()) {
                C9602q qVar = (C9602q) it.next();
                if (!C8802o0.this.f18699j.contains(qVar)) {
                    qVar.mo7573a(i, i2, i3, f);
                }
            }
            Iterator it2 = C8802o0.this.f18699j.iterator();
            while (it2.hasNext()) {
                ((C9603r) it2.next()).mo7733a(i, i2, i3, f);
            }
        }

        /* renamed from: b */
        public void mo23011b(int i) {
            C8802o0 o0Var = C8802o0.this;
            o0Var.m25456a(o0Var.getPlayWhenReady(), i);
        }

        /* renamed from: a */
        public void mo7736a(Surface surface) {
            if (C8802o0.this.f18706q == surface) {
                Iterator it = C8802o0.this.f18695f.iterator();
                while (it.hasNext()) {
                    ((C9602q) it.next()).mo7571a();
                }
            }
            Iterator it2 = C8802o0.this.f18699j.iterator();
            while (it2.hasNext()) {
                ((C9603r) it2.next()).mo7736a(surface);
            }
        }

        /* renamed from: a */
        public void mo7732a(int i) {
            if (C8802o0.this.f18714y != i) {
                C8802o0.this.f18714y = i;
                Iterator it = C8802o0.this.f18696g.iterator();
                while (it.hasNext()) {
                    C8839l lVar = (C8839l) it.next();
                    if (!C8802o0.this.f18700k.contains(lVar)) {
                        lVar.mo7732a(i);
                    }
                }
                Iterator it2 = C8802o0.this.f18700k.iterator();
                while (it2.hasNext()) {
                    ((C8842n) it2.next()).mo7732a(i);
                }
            }
        }

        /* renamed from: a */
        public void mo7735a(int i, long j, long j2) {
            Iterator it = C8802o0.this.f18700k.iterator();
            while (it.hasNext()) {
                ((C8842n) it.next()).mo7735a(i, j, j2);
            }
        }

        /* renamed from: a */
        public void mo7738a(C8878d dVar) {
            Iterator it = C8802o0.this.f18700k.iterator();
            while (it.hasNext()) {
                ((C8842n) it.next()).mo7738a(dVar);
            }
            C8802o0.this.f18705p = null;
            C8802o0.this.f18713x = null;
            C8802o0.this.f18714y = 0;
        }

        /* renamed from: a */
        public void mo7574a(List<C9322b> list) {
            C8802o0.this.f18685B = list;
            Iterator it = C8802o0.this.f18697h.iterator();
            while (it.hasNext()) {
                ((C9332k) it.next()).mo7574a(list);
            }
        }

        /* renamed from: a */
        public void mo7577a(Metadata metadata) {
            Iterator it = C8802o0.this.f18698i.iterator();
            while (it.hasNext()) {
                ((C8743e) it.next()).mo7577a(metadata);
            }
        }

        /* renamed from: a */
        public void mo23010a(float f) {
            C8802o0.this.mo7653m();
        }
    }

    protected C8802o0(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, C8710l<C8713o> lVar, Looper looper) {
        this(context, renderersFactory, trackSelector, loadControl, lVar, bandwidthMeter, new C8674a(), looper);
    }

    /* renamed from: l */
    private void mo7652l() {
        TextureView textureView = this.f18709t;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f18694e) {
                C9563q.m29500d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f18709t.setSurfaceTextureListener(null);
            }
            this.f18709t = null;
        }
        SurfaceHolder surfaceHolder = this.f18708s;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f18694e);
            this.f18708s = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void mo7653m() {
        C8733l0[] l0VarArr;
        float a = this.f18715z * this.f18703n.mo23088a();
        for (C8733l0 l0Var : this.f18691b) {
            if (l0Var.mo22847f() == 1) {
                PlayerMessage a2 = this.f18692c.mo24799a((Target) l0Var);
                a2.mo22634a(2);
                a2.mo22635a((Object) Float.valueOf(a));
                a2.mo22647k();
            }
        }
    }

    /* renamed from: n */
    private void mo7654n() {
        if (Looper.myLooper() != getApplicationLooper()) {
            C9563q.m29498b("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.f18688E ? null : new IllegalStateException());
            this.f18688E = true;
        }
    }

    public void addListener(EventListener eventListener) {
        mo7654n();
        this.f18692c.addListener(eventListener);
    }

    public Looper getApplicationLooper() {
        return this.f18692c.getApplicationLooper();
    }

    public long getBufferedPosition() {
        mo7654n();
        return this.f18692c.getBufferedPosition();
    }

    public long getContentBufferedPosition() {
        mo7654n();
        return this.f18692c.getContentBufferedPosition();
    }

    public long getContentPosition() {
        mo7654n();
        return this.f18692c.getContentPosition();
    }

    public int getCurrentAdGroupIndex() {
        mo7654n();
        return this.f18692c.getCurrentAdGroupIndex();
    }

    public int getCurrentAdIndexInAdGroup() {
        mo7654n();
        return this.f18692c.getCurrentAdIndexInAdGroup();
    }

    public long getCurrentPosition() {
        mo7654n();
        return this.f18692c.getCurrentPosition();
    }

    public Timeline getCurrentTimeline() {
        mo7654n();
        return this.f18692c.getCurrentTimeline();
    }

    public TrackGroupArray getCurrentTrackGroups() {
        mo7654n();
        return this.f18692c.getCurrentTrackGroups();
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        mo7654n();
        return this.f18692c.getCurrentTrackSelections();
    }

    public int getCurrentWindowIndex() {
        mo7654n();
        return this.f18692c.getCurrentWindowIndex();
    }

    public long getDuration() {
        mo7654n();
        return this.f18692c.getDuration();
    }

    public boolean getPlayWhenReady() {
        mo7654n();
        return this.f18692c.getPlayWhenReady();
    }

    public ExoPlaybackException getPlaybackError() {
        mo7654n();
        return this.f18692c.getPlaybackError();
    }

    public PlaybackParameters getPlaybackParameters() {
        mo7654n();
        return this.f18692c.getPlaybackParameters();
    }

    public int getPlaybackState() {
        mo7654n();
        return this.f18692c.getPlaybackState();
    }

    public int getRendererType(int i) {
        mo7654n();
        return this.f18692c.getRendererType(i);
    }

    public int getRepeatMode() {
        mo7654n();
        return this.f18692c.getRepeatMode();
    }

    public boolean getShuffleModeEnabled() {
        mo7654n();
        return this.f18692c.getShuffleModeEnabled();
    }

    public TextComponent getTextComponent() {
        return this;
    }

    public long getTotalBufferedDuration() {
        mo7654n();
        return this.f18692c.getTotalBufferedDuration();
    }

    public VideoComponent getVideoComponent() {
        return this;
    }

    public boolean isPlayingAd() {
        mo7654n();
        return this.f18692c.isPlayingAd();
    }

    public void prepare(MediaSource mediaSource) {
        mo7646a(mediaSource, true, true);
    }

    public void removeListener(EventListener eventListener) {
        mo7654n();
        this.f18692c.removeListener(eventListener);
    }

    public void seekTo(int i, long j) {
        mo7654n();
        this.f18702m.mo22700d();
        this.f18692c.seekTo(i, j);
    }

    public void setPlayWhenReady(boolean z) {
        mo7654n();
        m25456a(z, this.f18703n.mo23090a(z, getPlaybackState()));
    }

    public void setRepeatMode(int i) {
        mo7654n();
        this.f18692c.setRepeatMode(i);
    }

    public void setShuffleModeEnabled(boolean z) {
        mo7654n();
        this.f18692c.setShuffleModeEnabled(z);
    }

    public void stop(boolean z) {
        mo7654n();
        this.f18692c.stop(z);
        MediaSource mediaSource = this.f18684A;
        if (mediaSource != null) {
            mediaSource.mo23491a((MediaSourceEventListener) this.f18702m);
            this.f18702m.mo22701e();
            if (z) {
                this.f18684A = null;
            }
        }
        this.f18703n.mo23091b();
        this.f18685B = Collections.emptyList();
    }

    protected C8802o0(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, C8710l<C8713o> lVar, BandwidthMeter bandwidthMeter, C8674a aVar, Looper looper) {
        this(context, renderersFactory, trackSelector, loadControl, lVar, bandwidthMeter, aVar, C9542g.f22257a, looper);
    }

    /* renamed from: f */
    public C8878d mo23005f() {
        return this.f18713x;
    }

    /* renamed from: g */
    public Format mo23006g() {
        return this.f18705p;
    }

    /* renamed from: h */
    public C8878d mo23007h() {
        return this.f18712w;
    }

    /* renamed from: i */
    public Format mo23008i() {
        return this.f18704o;
    }

    /* renamed from: j */
    public float mo23009j() {
        return this.f18715z;
    }

    /* renamed from: k */
    public void mo7651k() {
        mo7654n();
        this.f18703n.mo23091b();
        this.f18692c.mo24804g();
        mo7652l();
        Surface surface = this.f18706q;
        if (surface != null) {
            if (this.f18707r) {
                surface.release();
            }
            this.f18706q = null;
        }
        MediaSource mediaSource = this.f18684A;
        if (mediaSource != null) {
            mediaSource.mo23491a((MediaSourceEventListener) this.f18702m);
            this.f18684A = null;
        }
        if (this.f18690G) {
            C9575z zVar = this.f18689F;
            C9537e.m29296a(zVar);
            zVar.mo24728d(0);
            this.f18690G = false;
        }
        this.f18701l.mo24446a(this.f18702m);
        this.f18685B = Collections.emptyList();
    }

    protected C8802o0(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, C8710l<C8713o> lVar, BandwidthMeter bandwidthMeter, C8674a aVar, C9542g gVar, Looper looper) {
        C8710l<C8713o> lVar2 = lVar;
        BandwidthMeter bandwidthMeter2 = bandwidthMeter;
        this.f18701l = bandwidthMeter2;
        this.f18694e = new C8804b();
        this.f18695f = new CopyOnWriteArraySet<>();
        this.f18696g = new CopyOnWriteArraySet<>();
        this.f18697h = new CopyOnWriteArraySet<>();
        this.f18698i = new CopyOnWriteArraySet<>();
        this.f18699j = new CopyOnWriteArraySet<>();
        this.f18700k = new CopyOnWriteArraySet<>();
        this.f18693d = new Handler(looper);
        Handler handler = this.f18693d;
        C8804b bVar = this.f18694e;
        this.f18691b = renderersFactory.mo22650a(handler, bVar, bVar, bVar, bVar, lVar);
        this.f18715z = 1.0f;
        this.f18714y = 0;
        C8831i iVar = C8831i.f18825e;
        this.f18685B = Collections.emptyList();
        C9613y yVar = new C9613y(this.f18691b, trackSelector, loadControl, bandwidthMeter, gVar, looper);
        this.f18692c = yVar;
        this.f18702m = aVar.mo22702a(this.f18692c, gVar);
        addListener(this.f18702m);
        addListener(this.f18694e);
        this.f18699j.add(this.f18702m);
        this.f18695f.add(this.f18702m);
        this.f18700k.add(this.f18702m);
        this.f18696g.add(this.f18702m);
        mo22997a((C8743e) this.f18702m);
        bandwidthMeter2.mo24445a(this.f18693d, this.f18702m);
        if (lVar2 instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) lVar2).mo22744a(this.f18693d, (C8709k) this.f18702m);
        }
        Context context2 = context;
        this.f18703n = new C8835k(context, this.f18694e);
    }

    /* renamed from: b */
    public void mo22628b(Surface surface) {
        mo7654n();
        if (surface != null && surface == this.f18706q) {
            mo22622a((Surface) null);
        }
    }

    /* renamed from: b */
    public void mo23000b(SurfaceHolder surfaceHolder) {
        mo7654n();
        mo7652l();
        this.f18708s = surfaceHolder;
        if (surfaceHolder == null) {
            m25452a((Surface) null, false);
            m25451a(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f18694e);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m25452a((Surface) null, false);
            m25451a(0, 0);
            return;
        }
        m25452a(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m25451a(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: a */
    public void mo22622a(Surface surface) {
        mo7654n();
        mo7652l();
        int i = 0;
        m25452a(surface, false);
        if (surface != null) {
            i = -1;
        }
        m25451a(i, i);
    }

    /* renamed from: a */
    public void mo22994a(SurfaceHolder surfaceHolder) {
        mo7654n();
        if (surfaceHolder != null && surfaceHolder == this.f18708s) {
            mo23000b((SurfaceHolder) null);
        }
    }

    /* renamed from: a */
    public void mo22623a(SurfaceView surfaceView) {
        mo23000b(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: a */
    public void mo22624a(TextureView textureView) {
        mo7654n();
        if (textureView != null && textureView == this.f18709t) {
            mo22630b((TextureView) null);
        }
    }

    /* renamed from: b */
    public void mo22629b(SurfaceView surfaceView) {
        mo22994a(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: a */
    public void mo22993a(float f) {
        mo7654n();
        float a = C9554k0.m29379a(f, 0.0f, 1.0f);
        if (this.f18715z != a) {
            this.f18715z = a;
            mo7653m();
            Iterator it = this.f18696g.iterator();
            while (it.hasNext()) {
                ((C8839l) it.next()).mo22696a(a);
            }
        }
    }

    /* renamed from: b */
    public void mo22630b(TextureView textureView) {
        mo7654n();
        mo7652l();
        this.f18709t = textureView;
        if (textureView == null) {
            m25452a((Surface) null, true);
            m25451a(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            C9563q.m29500d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f18694e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m25452a((Surface) null, true);
            m25451a(0, 0);
            return;
        }
        m25452a(new Surface(surfaceTexture), true);
        m25451a(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: a */
    public void mo22996a(AnalyticsListener analyticsListener) {
        mo7654n();
        this.f18702m.mo22697a(analyticsListener);
    }

    /* renamed from: a */
    public void mo22626a(C9602q qVar) {
        this.f18695f.add(qVar);
    }

    /* renamed from: a */
    public void mo22625a(C9597n nVar) {
        C8733l0[] l0VarArr;
        mo7654n();
        this.f18686C = nVar;
        for (C8733l0 l0Var : this.f18691b) {
            if (l0Var.mo22847f() == 2) {
                PlayerMessage a = this.f18692c.mo24799a((Target) l0Var);
                a.mo22634a(6);
                a.mo22635a((Object) nVar);
                a.mo22647k();
            }
        }
    }

    /* renamed from: b */
    public void mo23001b(AnalyticsListener analyticsListener) {
        mo7654n();
        this.f18702m.mo22699b(analyticsListener);
    }

    /* renamed from: b */
    public void mo22632b(C9602q qVar) {
        this.f18695f.remove(qVar);
    }

    /* renamed from: b */
    public void mo22631b(C9597n nVar) {
        C8733l0[] l0VarArr;
        mo7654n();
        if (this.f18686C == nVar) {
            for (C8733l0 l0Var : this.f18691b) {
                if (l0Var.mo22847f() == 2) {
                    PlayerMessage a = this.f18692c.mo24799a((Target) l0Var);
                    a.mo22634a(6);
                    a.mo22635a((Object) null);
                    a.mo22647k();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo22627a(C9605a aVar) {
        C8733l0[] l0VarArr;
        mo7654n();
        this.f18687D = aVar;
        for (C8733l0 l0Var : this.f18691b) {
            if (l0Var.mo22847f() == 5) {
                PlayerMessage a = this.f18692c.mo24799a((Target) l0Var);
                a.mo22634a(7);
                a.mo22635a((Object) aVar);
                a.mo22647k();
            }
        }
    }

    /* renamed from: b */
    public void mo22633b(C9605a aVar) {
        C8733l0[] l0VarArr;
        mo7654n();
        if (this.f18687D == aVar) {
            for (C8733l0 l0Var : this.f18691b) {
                if (l0Var.mo22847f() == 5) {
                    PlayerMessage a = this.f18692c.mo24799a((Target) l0Var);
                    a.mo22634a(7);
                    a.mo22635a((Object) null);
                    a.mo22647k();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo22620a(C9332k kVar) {
        this.f18697h.remove(kVar);
    }

    /* renamed from: a */
    public void mo22997a(C8743e eVar) {
        this.f18698i.add(eVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo22999a(C9603r rVar) {
        this.f18699j.add(rVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo22998a(C8842n nVar) {
        this.f18700k.add(nVar);
    }

    /* renamed from: a */
    public void mo7646a(MediaSource mediaSource, boolean z, boolean z2) {
        mo7654n();
        MediaSource mediaSource2 = this.f18684A;
        if (mediaSource2 != null) {
            mediaSource2.mo23491a((MediaSourceEventListener) this.f18702m);
            this.f18702m.mo22701e();
        }
        this.f18684A = mediaSource;
        mediaSource.mo23488a(this.f18693d, (MediaSourceEventListener) this.f18702m);
        m25456a(getPlayWhenReady(), this.f18703n.mo23089a(getPlayWhenReady()));
        this.f18692c.mo24802a(mediaSource, z, z2);
    }

    /* renamed from: b */
    public void mo22621b(C9332k kVar) {
        if (!this.f18685B.isEmpty()) {
            kVar.mo7574a(this.f18685B);
        }
        this.f18697h.add(kVar);
    }

    /* renamed from: b */
    public void mo23002b(C8743e eVar) {
        this.f18698i.remove(eVar);
    }

    @Deprecated
    /* renamed from: b */
    public void mo23004b(C9603r rVar) {
        this.f18699j.retainAll(Collections.singleton(this.f18702m));
        if (rVar != null) {
            mo22999a(rVar);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo23003b(C8842n nVar) {
        this.f18700k.retainAll(Collections.singleton(this.f18702m));
        if (nVar != null) {
            mo22998a(nVar);
        }
    }

    /* renamed from: a */
    public void mo22995a(PlaybackParameters playbackParameters) {
        mo7654n();
        this.f18692c.mo24801a(playbackParameters);
    }

    /* renamed from: b */
    public int mo22619b() {
        mo7654n();
        return this.f18692c.mo22619b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25452a(Surface surface, boolean z) {
        C8733l0[] l0VarArr;
        ArrayList<PlayerMessage> arrayList = new ArrayList<>();
        for (C8733l0 l0Var : this.f18691b) {
            if (l0Var.mo22847f() == 2) {
                PlayerMessage a = this.f18692c.mo24799a((Target) l0Var);
                a.mo22634a(1);
                a.mo22635a((Object) surface);
                a.mo22647k();
                arrayList.add(a);
            }
        }
        Surface surface2 = this.f18706q;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (PlayerMessage a2 : arrayList) {
                    a2.mo22637a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f18707r) {
                this.f18706q.release();
            }
        }
        this.f18706q = surface;
        this.f18707r = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25451a(int i, int i2) {
        if (i != this.f18710u || i2 != this.f18711v) {
            this.f18710u = i;
            this.f18711v = i2;
            Iterator it = this.f18695f.iterator();
            while (it.hasNext()) {
                ((C9602q) it.next()).mo7572a(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25456a(boolean z, int i) {
        boolean z2 = false;
        int i2 = i == 1 ? 0 : 1;
        C9613y yVar = this.f18692c;
        if (z && i != -1) {
            z2 = true;
        }
        yVar.mo24803a(z2, i2);
    }
}
