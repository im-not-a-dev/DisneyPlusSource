package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p366s0.C8915j;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.c0 */
/* compiled from: ProgressiveMediaSource */
public final class C9083c0 extends C9229o implements C9078c {

    /* renamed from: Y */
    private final Uri f20245Y;

    /* renamed from: Z */
    private final DataSource f20246Z;

    /* renamed from: a0 */
    private final C8915j f20247a0;

    /* renamed from: b0 */
    private final LoadErrorHandlingPolicy f20248b0;

    /* renamed from: c0 */
    private final String f20249c0;

    /* renamed from: d0 */
    private final int f20250d0;

    /* renamed from: e0 */
    private final Object f20251e0;

    /* renamed from: f0 */
    private long f20252f0 = -9223372036854775807L;

    /* renamed from: g0 */
    private boolean f20253g0;

    /* renamed from: h0 */
    private TransferListener f20254h0;

    C9083c0(Uri uri, DataSource aVar, C8915j jVar, LoadErrorHandlingPolicy zVar, String str, int i, Object obj) {
        this.f20245Y = uri;
        this.f20246Z = aVar;
        this.f20247a0 = jVar;
        this.f20248b0 = zVar;
        this.f20249c0 = str;
        this.f20250d0 = i;
        this.f20251e0 = obj;
    }

    /* renamed from: b */
    private void m27047b(long j, boolean z) {
        this.f20252f0 = j;
        this.f20253g0 = z;
        C9197i0 i0Var = new C9197i0(this.f20252f0, this.f20253g0, false, this.f20251e0);
        mo23961a((Timeline) i0Var, (Object) null);
    }

    /* renamed from: a */
    public void mo23487a() throws IOException {
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f20254h0 = transferListener;
        m27047b(this.f20252f0, this.f20253g0);
    }

    /* renamed from: b */
    public void mo23581b() {
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        DataSource a = this.f20246Z.mo24448a();
        TransferListener transferListener = this.f20254h0;
        if (transferListener != null) {
            a.addTransferListener(transferListener);
        }
        C9075b0 b0Var = new C9075b0(this.f20245Y, a, this.f20247a0.mo23301a(), this.f20248b0, mo23959a(mediaPeriodId), this, fVar, this.f20249c0, this.f20250d0);
        return b0Var;
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        ((C9075b0) a0Var).mo23566k();
    }

    /* renamed from: a */
    public void mo23572a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f20252f0;
        }
        if (this.f20252f0 != j || this.f20253g0 != z) {
            m27047b(j, z);
        }
    }
}
