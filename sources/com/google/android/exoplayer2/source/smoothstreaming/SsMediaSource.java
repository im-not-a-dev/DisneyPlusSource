package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.offline.C8808b;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9197i0;
import com.google.android.exoplayer2.source.C9229o;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.C9257u;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.p378l0.C9207c;
import com.google.android.exoplayer2.source.smoothstreaming.C9239b.C9240a;
import com.google.android.exoplayer2.source.smoothstreaming.C9242c.C9243a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a.C9247b;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9248b;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9255c;
import com.google.android.exoplayer2.upstream.C9442a0;
import com.google.android.exoplayer2.upstream.C9442a0.C9444b;
import com.google.android.exoplayer2.upstream.C9442a0.C9445c;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.C9452b0.C9453a;
import com.google.android.exoplayer2.upstream.C9455c0;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9518u;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsMediaSource extends C9229o implements C9444b<C9455c0<C9245a>> {

    /* renamed from: Y */
    private final boolean f20952Y;

    /* renamed from: Z */
    private final Uri f20953Z;

    /* renamed from: a0 */
    private final C9435a f20954a0;

    /* renamed from: b0 */
    private final C9243a f20955b0;

    /* renamed from: c0 */
    private final C9256t f20956c0;

    /* renamed from: d0 */
    private final C9524z f20957d0;

    /* renamed from: e0 */
    private final long f20958e0;

    /* renamed from: f0 */
    private final C9068a f20959f0;

    /* renamed from: g0 */
    private final C9456a<? extends C9245a> f20960g0;

    /* renamed from: h0 */
    private final ArrayList<C9244d> f20961h0;

    /* renamed from: i0 */
    private final Object f20962i0;

    /* renamed from: j0 */
    private DataSource f20963j0;

    /* renamed from: k0 */
    private C9442a0 f20964k0;

    /* renamed from: l0 */
    private C9452b0 f20965l0;

    /* renamed from: m0 */
    private TransferListener f20966m0;

    /* renamed from: n0 */
    private long f20967n0;

    /* renamed from: o0 */
    private C9245a f20968o0;

    /* renamed from: p0 */
    private Handler f20969p0;

    public static final class Factory implements C9207c {

        /* renamed from: a */
        private final C9243a f20970a;

        /* renamed from: b */
        private final C9435a f20971b;

        /* renamed from: c */
        private C9456a<? extends C9245a> f20972c;

        /* renamed from: d */
        private List<StreamKey> f20973d;

        /* renamed from: e */
        private C9256t f20974e;

        /* renamed from: f */
        private C9524z f20975f;

        /* renamed from: g */
        private long f20976g;

        /* renamed from: h */
        private boolean f20977h;

        /* renamed from: i */
        private Object f20978i;

        public Factory(C9435a aVar) {
            this(new C9240a(aVar), aVar);
        }

        public SsMediaSource createMediaSource(Uri uri) {
            this.f20977h = true;
            if (this.f20972c == null) {
                this.f20972c = new C9248b();
            }
            List<StreamKey> list = this.f20973d;
            if (list != null) {
                this.f20972c = new C8808b(this.f20972c, list);
            }
            C9537e.m29296a(uri);
            SsMediaSource ssMediaSource = new SsMediaSource(null, uri, this.f20971b, this.f20972c, this.f20970a, this.f20974e, this.f20975f, this.f20976g, this.f20978i);
            return ssMediaSource;
        }

        public Factory setStreamKeys(List<StreamKey> list) {
            C9537e.m29301b(!this.f20977h);
            this.f20973d = list;
            return this;
        }

        public Factory(C9243a aVar, C9435a aVar2) {
            C9537e.m29296a(aVar);
            this.f20970a = aVar;
            this.f20971b = aVar2;
            this.f20975f = new C9518u();
            this.f20976g = 30000;
            this.f20974e = new C9257u();
        }
    }

    static {
        C8672a0.m24990a("goog.exo.smoothstreaming");
    }

    /* renamed from: c */
    private void m27884c() {
        C9247b[] bVarArr;
        C9197i0 i0Var;
        for (int i = 0; i < this.f20961h0.size(); i++) {
            ((C9244d) this.f20961h0.get(i)).mo23981a(this.f20968o0);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (C9247b bVar : this.f20968o0.f21007f) {
            if (bVar.f21023k > 0) {
                long min = Math.min(j2, bVar.mo23987b(0));
                j = Math.max(j, bVar.mo23987b(bVar.f21023k - 1) + bVar.mo23984a(bVar.f21023k - 1));
                j2 = min;
            }
        }
        if (j2 == Long.MAX_VALUE) {
            i0Var = new C9197i0(this.f20968o0.f21005d ? -9223372036854775807L : 0, 0, 0, 0, true, this.f20968o0.f21005d, this.f20962i0);
        } else {
            C9245a aVar = this.f20968o0;
            if (aVar.f21005d) {
                long j3 = aVar.f21009h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    j2 = Math.max(j2, j - j3);
                }
                long j4 = j2;
                long j5 = j - j4;
                long a = j5 - C8883r.msToUs(this.f20958e0);
                if (a < 5000000) {
                    a = Math.min(5000000, j5 / 2);
                }
                i0Var = new C9197i0(-9223372036854775807L, j5, j4, a, true, true, this.f20962i0);
            } else {
                long j6 = aVar.f21008g;
                long j7 = j6 != -9223372036854775807L ? j6 : j - j2;
                i0Var = new C9197i0(j2 + j7, j7, j2, 0, true, false, this.f20962i0);
            }
        }
        mo23961a((Timeline) i0Var, (Object) this.f20968o0);
    }

    /* renamed from: d */
    private void m27885d() {
        if (this.f20968o0.f21005d) {
            this.f20969p0.postDelayed(new C9238a(this), Math.max(0, (this.f20967n0 + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27886e() {
        if (!this.f20964k0.mo24460d()) {
            C9455c0 c0Var = new C9455c0(this.f20963j0, this.f20953Z, 4, this.f20960g0);
            this.f20959f0.mo23513a(c0Var.f21975a, c0Var.f21976b, this.f20964k0.mo24455a(c0Var, this, this.f20957d0.getMinimumLoadableRetryCount(c0Var.f21976b)));
        }
    }

    /* renamed from: b */
    public void mo23581b() {
        this.f20968o0 = this.f20952Y ? this.f20968o0 : null;
        this.f20963j0 = null;
        this.f20967n0 = 0;
        C9442a0 a0Var = this.f20964k0;
        if (a0Var != null) {
            a0Var.mo24462f();
            this.f20964k0 = null;
        }
        Handler handler = this.f20969p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f20969p0 = null;
        }
    }

    private SsMediaSource(C9245a aVar, Uri uri, C9435a aVar2, C9456a<? extends C9245a> aVar3, C9243a aVar4, C9256t tVar, C9524z zVar, long j, Object obj) {
        Uri uri2;
        boolean z = false;
        C9537e.m29301b(aVar == null || !aVar.f21005d);
        this.f20968o0 = aVar;
        if (uri == null) {
            uri2 = null;
        } else {
            uri2 = C9255c.m27979a(uri);
        }
        this.f20953Z = uri2;
        this.f20954a0 = aVar2;
        this.f20960g0 = aVar3;
        this.f20955b0 = aVar4;
        this.f20956c0 = tVar;
        this.f20957d0 = zVar;
        this.f20958e0 = j;
        this.f20959f0 = mo23959a((MediaPeriodId) null);
        this.f20962i0 = obj;
        if (aVar != null) {
            z = true;
        }
        this.f20952Y = z;
        this.f20961h0 = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f20966m0 = transferListener;
        if (this.f20952Y) {
            this.f20965l0 = new C9453a();
            m27884c();
            return;
        }
        this.f20963j0 = this.f20954a0.mo24448a();
        this.f20964k0 = new C9442a0("Loader:Manifest");
        this.f20965l0 = this.f20964k0;
        this.f20969p0 = new Handler();
        m27886e();
    }

    /* renamed from: a */
    public void mo23487a() throws IOException {
        this.f20965l0.mo23621a();
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        C9244d dVar = new C9244d(this.f20968o0, this.f20955b0, this.f20966m0, this.f20956c0, this.f20957d0, mo23959a(mediaPeriodId), this.f20965l0, fVar);
        this.f20961h0.add(dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        ((C9244d) a0Var).mo23982b();
        this.f20961h0.remove(a0Var);
    }

    /* renamed from: a */
    public void mo23559a(C9455c0<C9245a> c0Var, long j, long j2) {
        C9455c0<C9245a> c0Var2 = c0Var;
        this.f20959f0.mo23524b(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b());
        this.f20968o0 = (C9245a) c0Var.mo24473d();
        this.f20967n0 = j - j2;
        m27884c();
        m27885d();
    }

    /* renamed from: a */
    public void mo23560a(C9455c0<C9245a> c0Var, long j, long j2, boolean z) {
        C9455c0<C9245a> c0Var2 = c0Var;
        this.f20959f0.mo23516a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b());
    }

    /* renamed from: a */
    public C9445c mo23555a(C9455c0<C9245a> c0Var, long j, long j2, IOException iOException, int i) {
        C9445c cVar;
        C9455c0<C9245a> c0Var2 = c0Var;
        long retryDelayMsFor = this.f20957d0.getRetryDelayMsFor(4, j2, iOException, i);
        if (retryDelayMsFor == -9223372036854775807L) {
            cVar = C9442a0.f21955e;
        } else {
            cVar = C9442a0.m28955a(false, retryDelayMsFor);
        }
        this.f20959f0.mo23517a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b(), iOException, !cVar.mo24463a());
        return cVar;
    }
}
