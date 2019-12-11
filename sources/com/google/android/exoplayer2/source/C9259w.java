package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p366s0.C8910e;
import com.google.android.exoplayer2.p366s0.C8915j;
import com.google.android.exoplayer2.source.MediaSource.C9067a;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.p378l0.C9207c;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9518u;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

@Deprecated
/* renamed from: com.google.android.exoplayer2.source.w */
/* compiled from: ExtractorMediaSource */
public final class C9259w extends C9229o implements C9067a {

    /* renamed from: Y */
    private final C9083c0 f21061Y;

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.source.w$b */
    /* compiled from: ExtractorMediaSource */
    public interface C9261b {
    }

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.source.w$c */
    /* compiled from: ExtractorMediaSource */
    public static final class C9262c implements C9207c {

        /* renamed from: a */
        private final DataSource f21062a;

        /* renamed from: b */
        private C8915j f21063b;

        /* renamed from: c */
        private String f21064c;

        /* renamed from: d */
        private Object f21065d;

        /* renamed from: e */
        private LoadErrorHandlingPolicy f21066e = new C9518u();

        /* renamed from: f */
        private int f21067f = 1048576;

        public C9262c(DataSource aVar) {
            this.f21062a = aVar;
        }

        /* renamed from: a */
        public C9259w mo24004a(Uri uri) {
            if (this.f21063b == null) {
                this.f21063b = new C8910e();
            }
            C9259w wVar = new C9259w(uri, this.f21062a, this.f21063b, this.f21066e, this.f21064c, this.f21067f, this.f21065d);
            return wVar;
        }
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f21061Y.mo23490a((C9067a) this, transferListener);
    }

    /* renamed from: b */
    public void mo23581b() {
        this.f21061Y.mo23489a((C9067a) this);
    }

    private C9259w(Uri uri, DataSource aVar, C8915j jVar, LoadErrorHandlingPolicy zVar, String str, int i, Object obj) {
        C9083c0 c0Var = new C9083c0(uri, aVar, jVar, zVar, str, i, obj);
        this.f21061Y = c0Var;
    }

    /* renamed from: a */
    public void mo23487a() throws IOException {
        this.f21061Y.mo23487a();
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        return this.f21061Y.mo23486a(mediaPeriodId, fVar, j);
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        this.f21061Y.mo23492a(a0Var);
    }

    /* renamed from: a */
    public void mo23497a(MediaSource mediaSource, Timeline timeline, Object obj) {
        mo23961a(timeline, obj);
    }
}
