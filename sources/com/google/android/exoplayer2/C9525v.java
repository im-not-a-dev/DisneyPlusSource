package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C9536d0;
import com.google.android.exoplayer2.util.C9542g;
import com.google.android.exoplayer2.util.C9565s;

/* renamed from: com.google.android.exoplayer2.v */
/* compiled from: DefaultMediaClock */
final class C9525v implements C9565s {

    /* renamed from: U */
    private final C9526a f22225U;

    /* renamed from: V */
    private C8733l0 f22226V;

    /* renamed from: W */
    private C9565s f22227W;

    /* renamed from: c */
    private final C9536d0 f22228c;

    /* renamed from: com.google.android.exoplayer2.v$a */
    /* compiled from: DefaultMediaClock */
    public interface C9526a {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public C9525v(C9526a aVar, C9542g gVar) {
        this.f22225U = aVar;
        this.f22228c = new C9536d0(gVar);
    }

    /* renamed from: e */
    private void m29270e() {
        this.f22228c.mo24602a(this.f22227W.mo23178a());
        PlaybackParameters playbackParameters = this.f22227W.getPlaybackParameters();
        if (!playbackParameters.equals(this.f22228c.getPlaybackParameters())) {
            this.f22228c.mo23180a(playbackParameters);
            this.f22225U.onPlaybackParametersChanged(playbackParameters);
        }
    }

    /* renamed from: f */
    private boolean m29271f() {
        C8733l0 l0Var = this.f22226V;
        return l0Var != null && !l0Var.mo22844c() && (this.f22226V.mo22843b() || !this.f22226V.mo22848g());
    }

    /* renamed from: a */
    public void mo24586a(long j) {
        this.f22228c.mo24602a(j);
    }

    /* renamed from: b */
    public void mo24588b() {
        this.f22228c.mo24603b();
    }

    /* renamed from: c */
    public void mo24590c() {
        this.f22228c.mo24604c();
    }

    /* renamed from: d */
    public long mo24591d() {
        if (!m29271f()) {
            return this.f22228c.mo23178a();
        }
        m29270e();
        return this.f22227W.mo23178a();
    }

    public PlaybackParameters getPlaybackParameters() {
        C9565s sVar = this.f22227W;
        if (sVar != null) {
            return sVar.getPlaybackParameters();
        }
        return this.f22228c.getPlaybackParameters();
    }

    /* renamed from: a */
    public void mo24587a(C8733l0 l0Var) {
        if (l0Var == this.f22226V) {
            this.f22227W = null;
            this.f22226V = null;
        }
    }

    /* renamed from: b */
    public void mo24589b(C8733l0 l0Var) throws ExoPlaybackException {
        C9565s n = l0Var.mo22855n();
        if (n != null) {
            C9565s sVar = this.f22227W;
            if (n == sVar) {
                return;
            }
            if (sVar == null) {
                this.f22227W = n;
                this.f22226V = l0Var;
                this.f22227W.mo23180a(this.f22228c.getPlaybackParameters());
                m29270e();
                return;
            }
            throw ExoPlaybackException.m24864a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: a */
    public long mo23178a() {
        if (m29271f()) {
            return this.f22227W.mo23178a();
        }
        return this.f22228c.mo23178a();
    }

    /* renamed from: a */
    public PlaybackParameters mo23180a(PlaybackParameters playbackParameters) {
        C9565s sVar = this.f22227W;
        if (sVar != null) {
            playbackParameters = sVar.mo23180a(playbackParameters);
        }
        this.f22228c.mo23180a(playbackParameters);
        this.f22225U.onPlaybackParametersChanged(playbackParameters);
        return playbackParameters;
    }
}
