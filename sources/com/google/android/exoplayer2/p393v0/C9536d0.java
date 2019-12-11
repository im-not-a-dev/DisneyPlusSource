package com.google.android.exoplayer2.p393v0;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;

/* renamed from: com.google.android.exoplayer2.v0.d0 */
/* compiled from: StandaloneMediaClock */
public final class C9536d0 implements C9565s {

    /* renamed from: U */
    private boolean f22247U;

    /* renamed from: V */
    private long f22248V;

    /* renamed from: W */
    private long f22249W;

    /* renamed from: X */
    private PlaybackParameters f22250X = PlaybackParameters.f18371e;

    /* renamed from: c */
    private final C9542g f22251c;

    public C9536d0(C9542g gVar) {
        this.f22251c = gVar;
    }

    /* renamed from: a */
    public void mo24602a(long j) {
        this.f22248V = j;
        if (this.f22247U) {
            this.f22249W = this.f22251c.mo24605a();
        }
    }

    /* renamed from: b */
    public void mo24603b() {
        if (!this.f22247U) {
            this.f22249W = this.f22251c.mo24605a();
            this.f22247U = true;
        }
    }

    /* renamed from: c */
    public void mo24604c() {
        if (this.f22247U) {
            mo24602a(mo23178a());
            this.f22247U = false;
        }
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.f22250X;
    }

    /* renamed from: a */
    public long mo23178a() {
        long j;
        long j2 = this.f22248V;
        if (!this.f22247U) {
            return j2;
        }
        long a = this.f22251c.mo24605a() - this.f22249W;
        PlaybackParameters playbackParameters = this.f22250X;
        if (playbackParameters.f18372a == 1.0f) {
            j = C.msToUs(a);
        } else {
            j = playbackParameters.mo22615a(a);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public PlaybackParameters mo23180a(PlaybackParameters playbackParameters) {
        if (this.f22247U) {
            mo24602a(mo23178a());
        }
        this.f22250X = playbackParameters;
        return playbackParameters;
    }
}
