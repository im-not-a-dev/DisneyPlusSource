package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9231q;
import com.google.android.exoplayer2.source.C9258v;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.trackselection.C9318m;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.C9491f;

/* renamed from: com.google.android.exoplayer2.d0 */
/* compiled from: MediaPeriodHolder */
final class C8683d0 {

    /* renamed from: a */
    public final C9072a0 f18430a;

    /* renamed from: b */
    public final Object f18431b;

    /* renamed from: c */
    public final C9141f0[] f18432c;

    /* renamed from: d */
    public boolean f18433d;

    /* renamed from: e */
    public boolean f18434e;

    /* renamed from: f */
    public C8719e0 f18435f;

    /* renamed from: g */
    private final boolean[] f18436g;

    /* renamed from: h */
    private final C8735m0[] f18437h;

    /* renamed from: i */
    private final TrackSelector f18438i;

    /* renamed from: j */
    private final MediaSource f18439j;

    /* renamed from: k */
    private C8683d0 f18440k;

    /* renamed from: l */
    private TrackGroupArray f18441l;

    /* renamed from: m */
    private C9318m f18442m;

    /* renamed from: n */
    private long f18443n;

    public C8683d0(C8735m0[] m0VarArr, long j, TrackSelector trackSelector, C9491f fVar, MediaSource mediaSource, C8719e0 e0Var) {
        this.f18437h = m0VarArr;
        this.f18443n = j;
        this.f18438i = trackSelector;
        this.f18439j = mediaSource;
        MediaPeriodId mediaPeriodId = e0Var.f18510a;
        this.f18431b = mediaPeriodId.f20147a;
        this.f18435f = e0Var;
        this.f18432c = new C9141f0[m0VarArr.length];
        this.f18436g = new boolean[m0VarArr.length];
        this.f18430a = m25115a(mediaPeriodId, mediaSource, fVar, e0Var.f18511b, e0Var.f18513d);
    }

    /* renamed from: j */
    private void m25119j() {
        C9318m mVar = this.f18442m;
        if (m25121l() && mVar != null) {
            for (int i = 0; i < mVar.f21310a; i++) {
                boolean a = mVar.mo24134a(i);
                C9311j a2 = mVar.f21312c.mo24040a(i);
                if (a && a2 != null) {
                    a2.mo24074e();
                }
            }
        }
    }

    /* renamed from: k */
    private void m25120k() {
        C9318m mVar = this.f18442m;
        if (m25121l() && mVar != null) {
            for (int i = 0; i < mVar.f21310a; i++) {
                boolean a = mVar.mo24134a(i);
                C9311j a2 = mVar.f21312c.mo24040a(i);
                if (a && a2 != null) {
                    a2.mo24058c();
                }
            }
        }
    }

    /* renamed from: l */
    private boolean m25121l() {
        return this.f18440k == null;
    }

    /* renamed from: a */
    public long mo22718a() {
        if (!this.f18433d) {
            return this.f18435f.f18511b;
        }
        long g = this.f18434e ? this.f18430a.mo23549g() : Long.MIN_VALUE;
        if (g == Long.MIN_VALUE) {
            g = this.f18435f.f18514e;
        }
        return g;
    }

    /* renamed from: b */
    public void mo22726b(long j) {
        C9537e.m29301b(m25121l());
        if (this.f18433d) {
            this.f18430a.mo23545c(mo22730d(j));
        }
    }

    /* renamed from: c */
    public void mo22728c(long j) {
        this.f18443n = j;
    }

    /* renamed from: d */
    public long mo22730d(long j) {
        return j - mo22729d();
    }

    /* renamed from: e */
    public long mo22732e(long j) {
        return j + mo22729d();
    }

    /* renamed from: f */
    public TrackGroupArray mo22733f() {
        TrackGroupArray trackGroupArray = this.f18441l;
        C9537e.m29296a(trackGroupArray);
        return trackGroupArray;
    }

    /* renamed from: g */
    public C9318m mo22734g() {
        C9318m mVar = this.f18442m;
        C9537e.m29296a(mVar);
        return mVar;
    }

    /* renamed from: h */
    public boolean mo22735h() {
        return this.f18433d && (!this.f18434e || this.f18430a.mo23549g() == Long.MIN_VALUE);
    }

    /* renamed from: i */
    public void mo22736i() {
        m25119j();
        this.f18442m = null;
        m25116a(this.f18435f.f18513d, this.f18439j, this.f18430a);
    }

    /* renamed from: c */
    public long mo22727c() {
        if (!this.f18433d) {
            return 0;
        }
        return this.f18430a.mo23544c();
    }

    /* renamed from: d */
    public long mo22729d() {
        return this.f18443n;
    }

    /* renamed from: e */
    public long mo22731e() {
        return this.f18435f.f18511b + this.f18443n;
    }

    /* renamed from: b */
    public C9318m mo22725b(float f, Timeline timeline) throws ExoPlaybackException {
        C9311j[] a;
        C9318m a2 = this.f18438i.mo24044a(this.f18437h, mo22733f(), this.f18435f.f18510a, timeline);
        if (a2.mo24135a(this.f18442m)) {
            return null;
        }
        for (C9311j jVar : a2.f21312c.mo24041a()) {
            if (jVar != null) {
                jVar.mo24052a(f);
            }
        }
        return a2;
    }

    /* renamed from: a */
    public void mo22721a(float f, Timeline timeline) throws ExoPlaybackException {
        this.f18433d = true;
        this.f18441l = this.f18430a.mo23548f();
        C9318m b = mo22725b(f, timeline);
        C9537e.m29296a(b);
        long a = mo22719a(b, this.f18435f.f18511b, false);
        long j = this.f18443n;
        C8719e0 e0Var = this.f18435f;
        this.f18443n = j + (e0Var.f18511b - a);
        this.f18435f = e0Var.mo22805b(a);
    }

    /* renamed from: b */
    public C8683d0 mo22724b() {
        return this.f18440k;
    }

    /* renamed from: b */
    private void m25118b(C9141f0[] f0VarArr) {
        int i = 0;
        while (true) {
            C8735m0[] m0VarArr = this.f18437h;
            if (i < m0VarArr.length) {
                if (m0VarArr[i].mo22860f() == 6) {
                    f0VarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo22722a(long j) {
        C9537e.m29301b(m25121l());
        this.f18430a.mo23543b(mo22730d(j));
    }

    /* renamed from: a */
    public long mo22719a(C9318m mVar, long j, boolean z) {
        return mo22720a(mVar, j, z, new boolean[this.f18437h.length]);
    }

    /* renamed from: a */
    public long mo22720a(C9318m mVar, long j, boolean z, boolean[] zArr) {
        C9318m mVar2 = mVar;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= mVar2.f21310a) {
                break;
            }
            boolean[] zArr2 = this.f18436g;
            if (z || !mVar.mo24136a(this.f18442m, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m25118b(this.f18432c);
        m25119j();
        this.f18442m = mVar2;
        m25120k();
        TrackSelectionArray trackSelectionArray = mVar2.f21312c;
        long a = this.f18430a.mo23540a(trackSelectionArray.mo24041a(), this.f18436g, this.f18432c, zArr, j);
        m25117a(this.f18432c);
        this.f18434e = false;
        int i2 = 0;
        while (true) {
            C9141f0[] f0VarArr = this.f18432c;
            if (i2 >= f0VarArr.length) {
                return a;
            }
            if (f0VarArr[i2] != null) {
                C9537e.m29301b(mVar.mo24134a(i2));
                if (this.f18437h[i2].mo22860f() != 6) {
                    this.f18434e = true;
                }
            } else {
                C9537e.m29301b(trackSelectionArray.mo24040a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public void mo22723a(C8683d0 d0Var) {
        if (d0Var != this.f18440k) {
            m25119j();
            this.f18440k = d0Var;
            m25120k();
        }
    }

    /* renamed from: a */
    private void m25117a(C9141f0[] f0VarArr) {
        C9318m mVar = this.f18442m;
        C9537e.m29296a(mVar);
        C9318m mVar2 = mVar;
        int i = 0;
        while (true) {
            C8735m0[] m0VarArr = this.f18437h;
            if (i < m0VarArr.length) {
                if (m0VarArr[i].mo22860f() == 6 && mVar2.mo24134a(i)) {
                    f0VarArr[i] = new C9258v();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static C9072a0 m25115a(MediaPeriodId mediaPeriodId, MediaSource mediaSource, C9491f fVar, long j, long j2) {
        C9072a0 a = mediaSource.mo23486a(mediaPeriodId, fVar, j);
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            return a;
        }
        C9231q qVar = new C9231q(a, true, 0, j2);
        return qVar;
    }

    /* renamed from: a */
    private static void m25116a(long j, MediaSource mediaSource, C9072a0 a0Var) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            mediaSource.mo23492a(a0Var);
            return;
        }
        try {
            mediaSource.mo23492a(((C9231q) a0Var).f20938c);
        } catch (RuntimeException e) {
            C9563q.m29496a("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}
