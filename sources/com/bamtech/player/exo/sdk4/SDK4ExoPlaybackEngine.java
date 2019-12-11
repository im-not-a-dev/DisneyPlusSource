package com.bamtech.player.exo.sdk4;

import android.app.Activity;
import android.net.Uri;
import com.bamtech.player.exo.C1706e;
import com.bamtech.player.exo.ExoPlaybackEngine;
import com.bamtech.player.exo.ExoPlaybackEngine.C1700a;
import com.bamtech.player.exo.ExoSurfaceView;
import com.bamtech.sdk4.media.PlaybackEndCause;
import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import com.bamtech.sdk4.media.adapters.exoplayer.DrmSessionManagerModule;
import com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter;
import com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter.Builder;
import com.bamtech.sdk4.media.adapters.exoplayer.WidevineDrmSessionManager;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.C9510p;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5312n;
import p163g.p174d.p178b.C5313o;
import p163g.p174d.p178b.C5315p;
import p163g.p174d.p178b.p183e0.C4952a;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

public class SDK4ExoPlaybackEngine extends ExoPlaybackEngine {

    /* renamed from: a0 */
    private PlaybackSession f6054a0;

    /* renamed from: b0 */
    private ExoPlayerAdapter f6055b0;

    /* renamed from: com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine$a */
    public static class C1749a extends C1700a {

        /* renamed from: E */
        private Function<MediaSource, MediaSource> f6056E = ExoPlaybackEngine.f5891Y;

        /* renamed from: F */
        private boolean f6057F = false;

        public C1749a(String str, Activity activity, C4952a aVar, C5313o oVar) {
            super(str, activity, aVar, oVar);
        }

        /* renamed from: f */
        private ExoPlayerAdapter m8103f() {
            Builder bandwidthMeter = ExoPlayerAdapter.builder(this.f5920s).eventListener(this.f5916o).drmMultiSession(this.f6057F).bandwidthMeter(this.f5909h);
            if (this.f5922u) {
                bandwidthMeter.allowChunklessPreparation();
            }
            Function<MediaSource, MediaSource> function = this.f6056E;
            if (function != null) {
                bandwidthMeter.wrapMediaSource(function);
            }
            C9435a aVar = this.f5918q;
            if (aVar instanceof Factory) {
                bandwidthMeter.dataSourceFactory((Factory) aVar);
            }
            C8710l lVar = this.f5927z;
            if (lVar != null) {
                bandwidthMeter.drmSessionManager((WidevineDrmSessionManager) lVar);
            }
            return bandwidthMeter.build();
        }

        /* renamed from: g */
        private void m8104g() {
            if (this.f5903b.mo16821p() instanceof ExoSurfaceView) {
                ExoSurfaceView exoSurfaceView = (ExoSurfaceView) this.f5903b.mo16821p();
                if (exoSurfaceView.getTextureView() != null) {
                    Timber.m44526b("TextureView is being used in ExoSurfaceView with DRMed content. Content will not display. Please make sure app:exo_surface_type is set to SURFACE_VIEW on ExoSurfaceView in your layout XML", new Object[0]);
                } else if (!exoSurfaceView.mo7559c()) {
                    Timber.m44532e("SurfaceView is not secure. It is advised to set ExoSurfaceView to be secure before playing DRM content.Please make sure app:secure is set to true in ExoSurfaceView", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        public C1749a mo7549a(C9510p pVar) {
            super.mo7549a(pVar);
            return this;
        }

        /* renamed from: b */
        public C1749a mo7552b(int i) {
            super.mo7552b(i);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ExoPlaybackEngine mo7554c() {
            ExoPlayerAdapter f = m8103f();
            f.setPlayerPreparedListener(new C1750a(this));
            SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = new SDK4ExoPlaybackEngine(this.f5903b, this.f5904c, this.f5908g, f, this.f5906e, this.f5907f, this.f5921t);
            return sDK4ExoPlaybackEngine;
        }

        /* renamed from: e */
        public C1749a mo7818e() {
            m8104g();
            mo7548a((C8710l) DrmSessionManagerModule.playbackDrmSessionManager());
            return this;
        }

        /* renamed from: a */
        public C1749a mo7550a(boolean z) {
            super.mo7550a(z);
            return this;
        }

        /* renamed from: b */
        public C1749a mo7817b(boolean z) {
            this.f6057F = z;
            return this;
        }

        /* renamed from: a */
        public C1749a mo7548a(C8710l lVar) {
            super.mo7548a(lVar);
            return this;
        }

        /* renamed from: b */
        public SDK4ExoPlaybackEngine mo7553b() {
            return (SDK4ExoPlaybackEngine) super.mo7553b();
        }

        /* renamed from: a */
        public C1749a mo7547a(int i) {
            super.mo7547a(i);
            return this;
        }

        /* renamed from: a */
        public /* synthetic */ void mo7816a(String str) throws Exception {
            this.f5908g.mo7595C();
            this.f5906e.mo16987a(Uri.parse(str));
        }
    }

    SDK4ExoPlaybackEngine(C5313o oVar, C4952a aVar, C1706e eVar, ExoPlayerAdapter exoPlayerAdapter, C5300m mVar, C5315p pVar, C5312n nVar) {
        super(oVar, aVar, eVar, mVar, pVar, nVar);
        this.f6055b0 = exoPlayerAdapter;
    }

    /* renamed from: a */
    public void mo7813a(PlaybackSession playbackSession) {
        this.f6054a0 = playbackSession;
    }

    /* renamed from: e */
    public void mo7540e() {
        PlaybackSession playbackSession = this.f6054a0;
        if (playbackSession != null) {
            playbackSession.collectStreamSample();
            this.f6054a0.release(PlaybackEndCause.applicationBackground, null);
        }
        this.f6055b0.clean();
        super.mo7540e();
    }

    /* renamed from: i */
    public PlaybackSession mo7814i() {
        return this.f6054a0;
    }

    /* renamed from: j */
    public PlayerAdapter mo7815j() {
        return this.f6055b0;
    }
}
