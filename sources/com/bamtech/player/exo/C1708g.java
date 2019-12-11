package com.bamtech.player.exo;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import p163g.p174d.p178b.C5319t;
import p163g.p174d.p178b.C5319t.C5322c;

/* renamed from: com.bamtech.player.exo.g */
/* compiled from: SimplerExoPlayer */
public class C1708g extends SimpleExoPlayer implements C5322c {

    /* renamed from: H */
    C5319t f5964H = C5319t.f12805a;

    /* renamed from: I */
    MediaSource f5965I;

    /* renamed from: J */
    boolean f5966J = false;

    protected C1708g(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, DrmSessionManager<FrameworkMediaCrypto> lVar, Looper looper) {
        super(context, renderersFactory, trackSelector, loadControl, bandwidthMeter, lVar, looper);
    }

    /* renamed from: a */
    public void mo7646a(MediaSource mediaSource, boolean z, boolean z2) {
        if (!this.f5966J) {
            mo7648b(mediaSource, z, z2);
        }
        this.f5965I = mediaSource;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7648b(MediaSource mediaSource, boolean z, boolean z2) {
        super.mo7646a(mediaSource, z, z2);
    }

    /* renamed from: c */
    public void mo7649c() {
        mo7647a(true);
    }

    /* renamed from: d */
    public void mo7650d() {
        mo7647a(false);
    }

    /* renamed from: k */
    public void mo7651k() {
        mo7655o();
        this.f5965I = null;
        this.f5966J = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo7652l() {
        if (this.f5966J) {
            this.f5966J = false;
            mo7654n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo7653m() {
        this.f5966J = true;
        stop();
    }

    /* renamed from: n */
    public void mo7654n() {
        this.f5964H.mo17096a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo7655o() {
        super.mo7651k();
    }

    public void prepare(MediaSource mediaSource) {
        mo7646a(mediaSource, true, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7647a(boolean z) {
        MediaSource mediaSource = this.f5965I;
        if (mediaSource != null) {
            mo7646a(mediaSource, z, false);
        }
    }
}
