package com.google.android.exoplayer2;

import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.p393v0.C9565s;
import com.google.android.exoplayer2.source.C9141f0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.l0 */
/* compiled from: Renderer */
public interface C8733l0 extends Target {
    /* renamed from: a */
    void mo22837a(float f) throws ExoPlaybackException;

    /* renamed from: a */
    void mo22838a(int i);

    /* renamed from: a */
    void mo22839a(long j) throws ExoPlaybackException;

    /* renamed from: a */
    void mo22840a(long j, long j2) throws ExoPlaybackException;

    /* renamed from: a */
    void mo22841a(C8800n0 n0Var, Format[] formatArr, C9141f0 f0Var, long j, boolean z, long j2) throws ExoPlaybackException;

    /* renamed from: a */
    void mo22842a(Format[] formatArr, C9141f0 f0Var, long j) throws ExoPlaybackException;

    /* renamed from: b */
    boolean mo22843b();

    /* renamed from: c */
    boolean mo22844c();

    /* renamed from: d */
    int mo22845d();

    /* renamed from: e */
    void mo22846e();

    /* renamed from: f */
    int mo22847f();

    /* renamed from: g */
    boolean mo22848g();

    /* renamed from: h */
    void mo22849h();

    /* renamed from: i */
    C8735m0 mo22850i();

    /* renamed from: j */
    C9141f0 mo22851j();

    /* renamed from: k */
    void mo22852k() throws IOException;

    /* renamed from: l */
    long mo22853l();

    /* renamed from: m */
    boolean mo22854m();

    /* renamed from: n */
    C9565s mo22855n();

    void reset();

    void start() throws ExoPlaybackException;

    void stop() throws ExoPlaybackException;
}
