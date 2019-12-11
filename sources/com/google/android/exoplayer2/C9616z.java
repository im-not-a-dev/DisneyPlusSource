package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C9525v.C9526a;
import com.google.android.exoplayer2.PlayerMessage.C8667a;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9542g;
import com.google.android.exoplayer2.p393v0.C9547i0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9562p;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.C9067a;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.trackselection.C9318m;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector.C9285a;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.exoplayer2.z */
/* compiled from: ExoPlayerImplInternal */
final class C9616z implements Callback, C9073a, C9285a, C9067a, C9526a, C8667a {

    /* renamed from: U */
    private final C8735m0[] f22522U;

    /* renamed from: V */
    private final TrackSelector f22523V;

    /* renamed from: W */
    private final C9318m f22524W;

    /* renamed from: X */
    private final LoadControl f22525X;

    /* renamed from: Y */
    private final BandwidthMeter f22526Y;

    /* renamed from: Z */
    private final C9562p f22527Z;

    /* renamed from: a0 */
    private final HandlerThread f22528a0;

    /* renamed from: b0 */
    private final Handler f22529b0;

    /* renamed from: c */
    private final C8733l0[] f22530c;

    /* renamed from: c0 */
    private final C8670c f22531c0;

    /* renamed from: d0 */
    private final C8669b f22532d0;

    /* renamed from: e0 */
    private final long f22533e0;

    /* renamed from: f0 */
    private final boolean f22534f0;

    /* renamed from: g0 */
    private final C9525v f22535g0;

    /* renamed from: h0 */
    private final C9620d f22536h0;

    /* renamed from: i0 */
    private final ArrayList<C9619c> f22537i0;

    /* renamed from: j0 */
    private final C9542g f22538j0;

    /* renamed from: k0 */
    private final C8721f0 f22539k0 = new C8721f0();

    /* renamed from: l0 */
    private SeekParameters f22540l0;

    /* renamed from: m0 */
    private C8725h0 f22541m0;

    /* renamed from: n0 */
    private MediaSource f22542n0;

    /* renamed from: o0 */
    private C8733l0[] f22543o0;

    /* renamed from: p0 */
    private boolean f22544p0;

    /* renamed from: q0 */
    private boolean f22545q0;

    /* renamed from: r0 */
    private boolean f22546r0;

    /* renamed from: s0 */
    private int f22547s0;

    /* renamed from: t0 */
    private boolean f22548t0;

    /* renamed from: u0 */
    private boolean f22549u0;

    /* renamed from: v0 */
    private int f22550v0;

    /* renamed from: w0 */
    private C9621e f22551w0;

    /* renamed from: x0 */
    private long f22552x0;

    /* renamed from: y0 */
    private int f22553y0;

    /* renamed from: com.google.android.exoplayer2.z$b */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C9618b {

        /* renamed from: a */
        public final MediaSource f22554a;

        /* renamed from: b */
        public final Timeline f22555b;

        /* renamed from: c */
        public final Object f22556c;

        public C9618b(MediaSource mediaSource, Timeline timeline, Object obj) {
            this.f22554a = mediaSource;
            this.f22555b = timeline;
            this.f22556c = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.z$c */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C9619c implements Comparable<C9619c> {

        /* renamed from: U */
        public int f22557U;

        /* renamed from: V */
        public long f22558V;

        /* renamed from: W */
        public Object f22559W;

        /* renamed from: c */
        public final PlayerMessage f22560c;

        public C9619c(PlayerMessage playerMessage) {
            this.f22560c = playerMessage;
        }

        /* renamed from: a */
        public void mo24826a(int i, long j, Object obj) {
            this.f22557U = i;
            this.f22558V = j;
            this.f22559W = obj;
        }

        /* renamed from: a */
        public int compareTo(C9619c cVar) {
            int i = 1;
            if ((this.f22559W == null) != (cVar.f22559W == null)) {
                if (this.f22559W != null) {
                    i = -1;
                }
                return i;
            } else if (this.f22559W == null) {
                return 0;
            } else {
                int i2 = this.f22557U - cVar.f22557U;
                if (i2 != 0) {
                    return i2;
                }
                return Util.compareLong(this.f22558V, cVar.f22558V);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.z$d */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C9620d {

        /* renamed from: a */
        private C8725h0 f22561a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f22562b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f22563c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f22564d;

        private C9620d() {
        }

        /* renamed from: a */
        public boolean mo24829a(C8725h0 h0Var) {
            return h0Var != this.f22561a || this.f22562b > 0 || this.f22563c;
        }

        /* renamed from: b */
        public void mo24831b(C8725h0 h0Var) {
            this.f22561a = h0Var;
            this.f22562b = 0;
            this.f22563c = false;
        }

        /* renamed from: a */
        public void mo24828a(int i) {
            this.f22562b += i;
        }

        /* renamed from: b */
        public void mo24830b(int i) {
            boolean z = true;
            if (!this.f22563c || this.f22564d == 4) {
                this.f22563c = true;
                this.f22564d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C9537e.m29299a(z);
        }
    }

    /* renamed from: com.google.android.exoplayer2.z$e */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C9621e {

        /* renamed from: a */
        public final Timeline f22565a;

        /* renamed from: b */
        public final int f22566b;

        /* renamed from: c */
        public final long f22567c;

        public C9621e(Timeline timeline, int i, long j) {
            this.f22565a = timeline;
            this.f22566b = i;
            this.f22567c = j;
        }
    }

    public C9616z(C8733l0[] l0VarArr, TrackSelector trackSelector, C9318m mVar, LoadControl loadControl, BandwidthMeter bandwidthMeter, boolean z, int i, boolean z2, Handler handler, C9542g gVar) {
        this.f22530c = l0VarArr;
        this.f22523V = trackSelector;
        this.f22524W = mVar;
        this.f22525X = loadControl;
        this.f22526Y = bandwidthMeter;
        this.f22545q0 = z;
        this.f22547s0 = i;
        this.f22548t0 = z2;
        this.f22529b0 = handler;
        this.f22538j0 = gVar;
        this.f22533e0 = loadControl.mo7727c();
        this.f22534f0 = loadControl.mo7726b();
        this.f22540l0 = SeekParameters.f18390d;
        this.f22541m0 = C8725h0.m25302a(-9223372036854775807L, mVar);
        this.f22536h0 = new C9620d();
        this.f22522U = new C8735m0[l0VarArr.length];
        for (int i2 = 0; i2 < l0VarArr.length; i2++) {
            l0VarArr[i2].mo22838a(i2);
            this.f22522U[i2] = l0VarArr[i2].mo22850i();
        }
        this.f22535g0 = new C9525v(this, gVar);
        this.f22537i0 = new ArrayList<>();
        this.f22543o0 = new C8733l0[0];
        this.f22531c0 = new C8670c();
        this.f22532d0 = new C8669b();
        trackSelector.mo24046a(this, bandwidthMeter);
        this.f22528a0 = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f22528a0.start();
        this.f22527Z = gVar.mo24606a(this.f22528a0.getLooper(), this);
    }

    /* renamed from: d */
    private void m29824d() throws ExoPlaybackException, IOException {
        C8733l0[] l0VarArr;
        long b = this.f22538j0.mo24607b();
        m29850t();
        if (!this.f22539k0.mo22826g()) {
            m29841k();
            m29815b(b, 10);
            return;
        }
        C8683d0 e = this.f22539k0.mo22824e();
        C9547i0.m29359a("doSomeWork");
        m29851u();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        e.f18430a.mo23541a(this.f22541m0.f18545m - this.f22533e0, this.f22534f0);
        boolean z = true;
        boolean z2 = true;
        for (C8733l0 l0Var : this.f22543o0) {
            l0Var.mo22840a(this.f22552x0, elapsedRealtime);
            z2 = z2 && l0Var.mo22844c();
            boolean z3 = l0Var.mo22843b() || l0Var.mo22844c() || m29823c(l0Var);
            if (!z3) {
                l0Var.mo22852k();
            }
            z = z && z3;
        }
        if (!z) {
            m29841k();
        }
        long j = e.f18435f.f18514e;
        if (z2 && ((j == -9223372036854775807L || j <= this.f22541m0.f18545m) && e.f18435f.f18516g)) {
            m29819c(4);
            m29849s();
        } else if (this.f22541m0.f18538f == 2 && m29839i(z)) {
            m29819c(3);
            if (this.f22545q0) {
                m29848r();
            }
        } else if (this.f22541m0.f18538f == 3 && (this.f22543o0.length != 0 ? !z : !m29837h())) {
            this.f22546r0 = this.f22545q0;
            m29819c(2);
            m29849s();
        }
        if (this.f22541m0.f18538f == 2) {
            for (C8733l0 k : this.f22543o0) {
                k.mo22852k();
            }
        }
        if (!this.f22545q0 || this.f22541m0.f18538f != 3) {
            int i = this.f22541m0.f18538f;
            if (i != 2) {
                if (this.f22543o0.length == 0 || i == 4) {
                    this.f22527Z.mo24624b(2);
                } else {
                    m29815b(b, 1000);
                }
                C9547i0.m29358a();
            }
        }
        m29815b(b, 10);
        C9547i0.m29358a();
    }

    /* renamed from: e */
    private void m29830e(boolean z) throws ExoPlaybackException {
        MediaPeriodId mediaPeriodId = this.f22539k0.mo22824e().f18435f.f18510a;
        long a = m29794a(mediaPeriodId, this.f22541m0.f18545m, true);
        if (a != this.f22541m0.f18545m) {
            C8725h0 h0Var = this.f22541m0;
            this.f22541m0 = h0Var.mo22832a(mediaPeriodId, a, h0Var.f18537e, m29831f());
            if (z) {
                this.f22536h0.mo24830b(4);
            }
        }
    }

    /* renamed from: f */
    private void m29833f(boolean z) {
        C8725h0 h0Var = this.f22541m0;
        if (h0Var.f18539g != z) {
            this.f22541m0 = h0Var.mo22834a(z);
        }
    }

    /* renamed from: g */
    private void m29835g(boolean z) throws ExoPlaybackException {
        this.f22546r0 = false;
        this.f22545q0 = z;
        if (!z) {
            m29849s();
            m29851u();
            return;
        }
        int i = this.f22541m0.f18538f;
        if (i == 3) {
            m29848r();
            this.f22527Z.mo24622a(2);
        } else if (i == 2) {
            this.f22527Z.mo24622a(2);
        }
    }

    /* renamed from: h */
    private void m29836h(boolean z) throws ExoPlaybackException {
        this.f22548t0 = z;
        if (!this.f22539k0.mo22821b(z)) {
            m29830e(true);
        }
        m29827d(false);
    }

    /* renamed from: i */
    private boolean m29839i(boolean z) {
        if (this.f22543o0.length == 0) {
            return m29837h();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.f22541m0.f18539g) {
            return true;
        }
        C8683d0 d = this.f22539k0.mo22823d();
        if ((d.mo22735h() && d.f18435f.f18516g) || this.f22525X.mo7725a(m29831f(), this.f22535g0.getPlaybackParameters().f18372a, this.f22546r0)) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: j */
    private void m29840j() {
        if (this.f22536h0.mo24829a(this.f22541m0)) {
            this.f22529b0.obtainMessage(0, this.f22536h0.f22562b, this.f22536h0.f22563c ? this.f22536h0.f22564d : -1, this.f22541m0).sendToTarget();
            this.f22536h0.mo24831b(this.f22541m0);
        }
    }

    /* renamed from: k */
    private void m29841k() throws IOException {
        C8683d0 d = this.f22539k0.mo22823d();
        C8683d0 f = this.f22539k0.mo22825f();
        if (d != null && !d.f18433d && (f == null || f.mo22724b() == d)) {
            C8733l0[] l0VarArr = this.f22543o0;
            int length = l0VarArr.length;
            int i = 0;
            while (i < length) {
                if (l0VarArr[i].mo22848g()) {
                    i++;
                } else {
                    return;
                }
            }
            d.f18430a.mo23546d();
        }
    }

    /* renamed from: l */
    private void m29842l() throws IOException {
        if (this.f22539k0.mo22823d() != null) {
            C8733l0[] l0VarArr = this.f22543o0;
            int length = l0VarArr.length;
            int i = 0;
            while (i < length) {
                if (l0VarArr[i].mo22848g()) {
                    i++;
                } else {
                    return;
                }
            }
        }
        this.f22542n0.mo23487a();
    }

    /* renamed from: m */
    private void m29843m() throws IOException {
        this.f22539k0.mo22813a(this.f22552x0);
        if (this.f22539k0.mo22827h()) {
            C8719e0 a = this.f22539k0.mo22809a(this.f22552x0, this.f22541m0);
            if (a == null) {
                m29842l();
                return;
            }
            this.f22539k0.mo22812a(this.f22522U, this.f22523V, this.f22525X.mo7729e(), this.f22542n0, a).mo23542a((C9073a) this, a.f18511b);
            m29833f(true);
            m29827d(false);
        }
    }

    /* renamed from: n */
    private void m29844n() {
        C9311j[] a;
        for (C8683d0 c = this.f22539k0.mo22822c(); c != null; c = c.mo22724b()) {
            C9318m g = c.mo22734g();
            if (g != null) {
                for (C9311j jVar : g.f21312c.mo24041a()) {
                    if (jVar != null) {
                        jVar.mo24078i();
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private void m29845o() {
        m29808a(true, true, true, true);
        this.f22525X.mo7728d();
        m29819c(1);
        this.f22528a0.quit();
        synchronized (this) {
            this.f22544p0 = true;
            notifyAll();
        }
    }

    /* renamed from: p */
    private void m29846p() throws ExoPlaybackException {
        if (this.f22539k0.mo22826g()) {
            float f = this.f22535g0.getPlaybackParameters().f18372a;
            C8683d0 e = this.f22539k0.mo22824e();
            C8683d0 f2 = this.f22539k0.mo22825f();
            boolean z = true;
            while (e != null && e.f18433d) {
                C9318m b = e.mo22725b(f, this.f22541m0.f18533a);
                if (b != null) {
                    if (z) {
                        C8683d0 e2 = this.f22539k0.mo22824e();
                        boolean[] zArr = new boolean[this.f22530c.length];
                        long a = e2.mo22720a(b, this.f22541m0.f18545m, this.f22539k0.mo22818a(e2), zArr);
                        C8725h0 h0Var = this.f22541m0;
                        if (!(h0Var.f18538f == 4 || a == h0Var.f18545m)) {
                            C8725h0 h0Var2 = this.f22541m0;
                            this.f22541m0 = h0Var2.mo22832a(h0Var2.f18535c, a, h0Var2.f18537e, m29831f());
                            this.f22536h0.mo24830b(4);
                            m29814b(a);
                        }
                        boolean[] zArr2 = new boolean[this.f22530c.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C8733l0[] l0VarArr = this.f22530c;
                            if (i >= l0VarArr.length) {
                                break;
                            }
                            C8733l0 l0Var = l0VarArr[i];
                            zArr2[i] = l0Var.mo22845d() != 0;
                            C9141f0 f0Var = e2.f18432c[i];
                            if (f0Var != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (f0Var != l0Var.mo22851j()) {
                                    m29802a(l0Var);
                                } else if (zArr[i]) {
                                    l0Var.mo22839a(this.f22552x0);
                                }
                            }
                            i++;
                        }
                        this.f22541m0 = this.f22541m0.mo22833a(e2.mo22733f(), e2.mo22734g());
                        m29809a(zArr2, i2);
                    } else {
                        this.f22539k0.mo22818a(e);
                        if (e.f18433d) {
                            e.mo22719a(b, Math.max(e.f18435f.f18511b, e.mo22730d(this.f22552x0)), false);
                        }
                    }
                    m29827d(true);
                    if (this.f22541m0.f18538f != 4) {
                        m29838i();
                        m29851u();
                        this.f22527Z.mo24622a(2);
                    }
                    return;
                }
                if (e == f2) {
                    z = false;
                }
                e = e.mo22724b();
            }
        }
    }

    /* renamed from: q */
    private void m29847q() {
        for (int size = this.f22537i0.size() - 1; size >= 0; size--) {
            if (!m29810a((C9619c) this.f22537i0.get(size))) {
                ((C9619c) this.f22537i0.get(size)).f22560c.mo22636a(false);
                this.f22537i0.remove(size);
            }
        }
        Collections.sort(this.f22537i0);
    }

    /* renamed from: r */
    private void m29848r() throws ExoPlaybackException {
        this.f22546r0 = false;
        this.f22535g0.mo24588b();
        for (C8733l0 start : this.f22543o0) {
            start.start();
        }
    }

    /* renamed from: s */
    private void m29849s() throws ExoPlaybackException {
        this.f22535g0.mo24590c();
        for (C8733l0 b : this.f22543o0) {
            m29817b(b);
        }
    }

    /* renamed from: t */
    private void m29850t() throws ExoPlaybackException, IOException {
        MediaSource mediaSource = this.f22542n0;
        if (mediaSource != null) {
            if (this.f22550v0 > 0) {
                mediaSource.mo23487a();
                return;
            }
            m29843m();
            C8683d0 d = this.f22539k0.mo22823d();
            int i = 0;
            if (d == null || d.mo22735h()) {
                m29833f(false);
            } else if (!this.f22541m0.f18539g) {
                m29838i();
            }
            if (this.f22539k0.mo22826g()) {
                C8683d0 e = this.f22539k0.mo22824e();
                C8683d0 f = this.f22539k0.mo22825f();
                boolean z = false;
                while (this.f22545q0 && e != f && this.f22552x0 >= e.mo22724b().mo22731e()) {
                    if (z) {
                        m29840j();
                    }
                    int i2 = e.f18435f.f18515f ? 0 : 3;
                    C8683d0 a = this.f22539k0.mo22808a();
                    m29801a(e);
                    C8725h0 h0Var = this.f22541m0;
                    C8719e0 e0Var = a.f18435f;
                    this.f22541m0 = h0Var.mo22832a(e0Var.f18510a, e0Var.f18511b, e0Var.f18512c, m29831f());
                    this.f22536h0.mo24830b(i2);
                    m29851u();
                    e = a;
                    z = true;
                }
                if (f.f18435f.f18516g) {
                    while (true) {
                        C8733l0[] l0VarArr = this.f22530c;
                        if (i < l0VarArr.length) {
                            C8733l0 l0Var = l0VarArr[i];
                            C9141f0 f0Var = f.f18432c[i];
                            if (f0Var != null && l0Var.mo22851j() == f0Var && l0Var.mo22848g()) {
                                l0Var.mo22849h();
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else if (f.mo22724b() != null) {
                    int i3 = 0;
                    while (true) {
                        C8733l0[] l0VarArr2 = this.f22530c;
                        if (i3 < l0VarArr2.length) {
                            C8733l0 l0Var2 = l0VarArr2[i3];
                            C9141f0 f0Var2 = f.f18432c[i3];
                            if (l0Var2.mo22851j() == f0Var2 && (f0Var2 == null || l0Var2.mo22848g())) {
                                i3++;
                            }
                        } else if (!f.mo22724b().f18433d) {
                            m29841k();
                            return;
                        } else {
                            C9318m g = f.mo22734g();
                            C8683d0 b = this.f22539k0.mo22820b();
                            C9318m g2 = b.mo22734g();
                            boolean z2 = b.f18430a.mo23547e() != -9223372036854775807L;
                            int i4 = 0;
                            while (true) {
                                C8733l0[] l0VarArr3 = this.f22530c;
                                if (i4 < l0VarArr3.length) {
                                    C8733l0 l0Var3 = l0VarArr3[i4];
                                    if (g.mo24134a(i4)) {
                                        if (z2) {
                                            l0Var3.mo22849h();
                                        } else if (!l0Var3.mo22854m()) {
                                            C9311j a2 = g2.f21312c.mo24040a(i4);
                                            boolean a3 = g2.mo24134a(i4);
                                            boolean z3 = this.f22522U[i4].mo22860f() == 6;
                                            C8800n0 n0Var = g.f21311b[i4];
                                            C8800n0 n0Var2 = g2.f21311b[i4];
                                            if (!a3 || !n0Var2.equals(n0Var) || z3) {
                                                l0Var3.mo22849h();
                                            } else {
                                                l0Var3.mo22842a(m29811a(a2), b.f18432c[i4], b.mo22729d());
                                            }
                                        }
                                    }
                                    i4++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private void m29851u() throws ExoPlaybackException {
        if (this.f22539k0.mo22826g()) {
            C8683d0 e = this.f22539k0.mo22824e();
            long e2 = e.f18430a.mo23547e();
            if (e2 != -9223372036854775807L) {
                m29814b(e2);
                if (e2 != this.f22541m0.f18545m) {
                    C8725h0 h0Var = this.f22541m0;
                    this.f22541m0 = h0Var.mo22832a(h0Var.f18535c, e2, h0Var.f18537e, m29831f());
                    this.f22536h0.mo24830b(4);
                }
            } else {
                this.f22552x0 = this.f22535g0.mo24591d();
                long d = e.mo22730d(this.f22552x0);
                m29799a(this.f22541m0.f18545m, d);
                this.f22541m0.f18545m = d;
            }
            C8683d0 d2 = this.f22539k0.mo22823d();
            this.f22541m0.f18543k = d2.mo22718a();
            this.f22541m0.f18544l = m29831f();
        }
    }

    /* renamed from: b */
    public void mo24821b(boolean z) {
        this.f22527Z.mo24619a(13, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: c */
    public void mo24823c(boolean z) {
        this.f22527Z.mo24619a(6, z ? 1 : 0, 0).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        ExoPlaybackException exoPlaybackException;
        String str = "ExoPlayerImplInternal";
        try {
            switch (message.what) {
                case 0:
                    m29818b((MediaSource) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m29835g(message.arg1 != 0);
                    break;
                case 2:
                    m29824d();
                    break;
                case 3:
                    m29805a((C9621e) message.obj);
                    break;
                case 4:
                    m29820c((PlaybackParameters) message.obj);
                    break;
                case 5:
                    m29800a((SeekParameters) message.obj);
                    break;
                case 6:
                    m29807a(false, message.arg1 != 0, true);
                    break;
                case 7:
                    m29845o();
                    return true;
                case 8:
                    m29804a((C9618b) message.obj);
                    break;
                case 9:
                    m29826d((C9072a0) message.obj);
                    break;
                case 10:
                    m29822c((C9072a0) message.obj);
                    break;
                case 11:
                    m29846p();
                    break;
                case 12:
                    m29813b(message.arg1);
                    break;
                case 13:
                    m29836h(message.arg1 != 0);
                    break;
                case 14:
                    m29806a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    m29825d((PlayerMessage) message.obj);
                    break;
                case 16:
                    m29832f((PlayerMessage) message.obj);
                    break;
                case 17:
                    m29816b((PlaybackParameters) message.obj);
                    break;
                default:
                    return false;
            }
            m29840j();
        } catch (ExoPlaybackException e) {
            Log.m29496a(str, "Playback error.", e);
            this.f22529b0.obtainMessage(2, e).sendToTarget();
            m29807a(true, false, false);
            m29840j();
        } catch (IOException e2) {
            Log.m29496a(str, "Source error.", e2);
            this.f22529b0.obtainMessage(2, ExoPlaybackException.m24861a(e2)).sendToTarget();
            m29807a(false, false, false);
            m29840j();
        } catch (OutOfMemoryError | RuntimeException e3) {
            Log.m29496a(str, "Internal runtime error.", e3);
            if (e3 instanceof OutOfMemoryError) {
                exoPlaybackException = ExoPlaybackException.m24863a((OutOfMemoryError) e3);
            } else {
                exoPlaybackException = ExoPlaybackException.m24864a((RuntimeException) e3);
            }
            this.f22529b0.obtainMessage(2, exoPlaybackException).sendToTarget();
            m29807a(true, false, false);
            m29840j();
        }
        return true;
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f22527Z.mo24621a(17, (Object) playbackParameters).sendToTarget();
    }

    /* renamed from: a */
    public void mo24816a(MediaSource mediaSource, boolean z, boolean z2) {
        this.f22527Z.mo24620a(0, z ? 1 : 0, z2 ? 1 : 0, mediaSource).sendToTarget();
    }

    /* renamed from: b */
    public Looper mo24818b() {
        return this.f22528a0.getLooper();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo24822c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f22544p0     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            com.google.android.exoplayer2.v0.p r0 = r2.f22527Z     // Catch:{ all -> 0x0023 }
            r1 = 7
            r0.mo24622a(r1)     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x000e:
            boolean r1 = r2.f22544p0     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x000e
        L_0x0016:
            r0 = 1
            goto L_0x000e
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r0.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9616z.mo24822c():void");
    }

    /* renamed from: f */
    private void m29832f(PlayerMessage playerMessage) {
        playerMessage.mo22639c().post(new C8801o(this, playerMessage));
    }

    /* renamed from: b */
    public void mo23631a(C9072a0 a0Var) {
        this.f22527Z.mo24621a(10, (Object) a0Var).sendToTarget();
    }

    /* renamed from: b */
    private void m29818b(MediaSource mediaSource, boolean z, boolean z2) {
        this.f22550v0++;
        m29808a(false, true, z, z2);
        this.f22525X.mo7721a();
        this.f22542n0 = mediaSource;
        m29819c(2);
        mediaSource.mo23490a((C9067a) this, this.f22526Y.mo24444a());
        this.f22527Z.mo24622a(2);
    }

    /* renamed from: f */
    private long m29831f() {
        return m29792a(this.f22541m0.f18543k);
    }

    /* renamed from: h */
    private boolean m29837h() {
        C8683d0 e = this.f22539k0.mo22824e();
        C8683d0 b = e.mo22724b();
        long j = e.f18435f.f18514e;
        return j == -9223372036854775807L || this.f22541m0.f18545m < j || (b != null && (b.f18433d || b.f18435f.f18510a.mo23494a()));
    }

    /* renamed from: a */
    public void mo24817a(boolean z) {
        this.f22527Z.mo24619a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public void mo24813a(int i) {
        this.f22527Z.mo24619a(12, i, 0).sendToTarget();
    }

    /* renamed from: a */
    public void mo24815a(Timeline timeline, int i, long j) {
        this.f22527Z.mo24621a(3, (Object) new C9621e(timeline, i, j)).sendToTarget();
    }

    /* renamed from: c */
    private void m29819c(int i) {
        C8725h0 h0Var = this.f22541m0;
        if (h0Var.f18538f != i) {
            this.f22541m0 = h0Var.mo22828a(i);
        }
    }

    /* renamed from: e */
    private void m29829e(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.mo22639c().getLooper() == this.f22527Z.mo24618a()) {
            m29821c(playerMessage);
            int i = this.f22541m0.f18538f;
            if (i == 3 || i == 2) {
                this.f22527Z.mo24622a(2);
                return;
            }
            return;
        }
        this.f22527Z.mo24621a(16, (Object) playerMessage).sendToTarget();
    }

    /* renamed from: g */
    private void m29834g() {
        m29819c(4);
        m29808a(false, false, true, false);
    }

    /* renamed from: i */
    private void m29838i() {
        C8683d0 d = this.f22539k0.mo22823d();
        long c = d.mo22727c();
        if (c == Long.MIN_VALUE) {
            m29833f(false);
            return;
        }
        boolean a = this.f22525X.mo7724a(m29792a(c), this.f22535g0.getPlaybackParameters().f18372a);
        m29833f(a);
        if (a) {
            d.mo22722a(this.f22552x0);
        }
    }

    /* renamed from: a */
    public void mo24814a(PlaybackParameters playbackParameters) {
        this.f22527Z.mo24621a(4, (Object) playbackParameters).sendToTarget();
    }

    /* renamed from: a */
    public synchronized void mo22649a(PlayerMessage playerMessage) {
        if (this.f22544p0) {
            Log.m29500d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            playerMessage.mo22636a(false);
            return;
        }
        this.f22527Z.mo24621a(15, (Object) playerMessage).sendToTarget();
    }

    /* renamed from: b */
    private void m29813b(int i) throws ExoPlaybackException {
        this.f22547s0 = i;
        if (!this.f22539k0.mo22816a(i)) {
            m29830e(true);
        }
        m29827d(false);
    }

    /* renamed from: c */
    private void m29820c(PlaybackParameters playbackParameters) {
        this.f22535g0.mo23180a(playbackParameters);
    }

    /* renamed from: c */
    private void m29821c(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (!playerMessage.mo22646j()) {
            try {
                playerMessage.mo22642f().mo22648a(playerMessage.mo22644h(), playerMessage.mo22640d());
            } finally {
                playerMessage.mo22636a(true);
            }
        }
    }

    /* renamed from: e */
    private long m29828e() {
        C8683d0 f = this.f22539k0.mo22825f();
        if (f == null) {
            return 0;
        }
        long d = f.mo22729d();
        int i = 0;
        while (true) {
            C8733l0[] l0VarArr = this.f22530c;
            if (i >= l0VarArr.length) {
                return d;
            }
            if (l0VarArr[i].mo22845d() != 0 && this.f22530c[i].mo22851j() == f.f18432c[i]) {
                long l = this.f22530c[i].mo22853l();
                if (l == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                d = Math.max(l, d);
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m29815b(long j, long j2) {
        this.f22527Z.mo24624b(2);
        this.f22527Z.mo24623a(2, j + j2);
    }

    /* renamed from: c */
    private void m29822c(C9072a0 a0Var) {
        if (this.f22539k0.mo22819a(a0Var)) {
            this.f22539k0.mo22813a(this.f22552x0);
            m29838i();
        }
    }

    /* renamed from: a */
    public void mo23497a(MediaSource mediaSource, Timeline timeline, Object obj) {
        this.f22527Z.mo24621a(8, (Object) new C9618b(mediaSource, timeline, obj)).sendToTarget();
    }

    /* renamed from: b */
    private void m29814b(long j) throws ExoPlaybackException {
        if (this.f22539k0.mo22826g()) {
            j = this.f22539k0.mo22824e().mo22732e(j);
        }
        this.f22552x0 = j;
        this.f22535g0.mo24586a(this.f22552x0);
        for (C8733l0 a : this.f22543o0) {
            a.mo22839a(this.f22552x0);
        }
        m29844n();
    }

    /* renamed from: a */
    public void mo23550a(C9072a0 a0Var) {
        this.f22527Z.mo24621a(9, (Object) a0Var).sendToTarget();
    }

    /* renamed from: c */
    private boolean m29823c(C8733l0 l0Var) {
        C8683d0 b = this.f22539k0.mo22825f().mo22724b();
        return b != null && b.f18433d && l0Var.mo22848g();
    }

    /* renamed from: a */
    public void mo24049a() {
        this.f22527Z.mo24622a(11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29805a(com.google.android.exoplayer2.C9616z.C9621e r23) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            com.google.android.exoplayer2.z$d r2 = r1.f22536h0
            r3 = 1
            r2.mo24828a(r3)
            android.util.Pair r2 = r1.m29795a(r0, r3)
            r4 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r2 != 0) goto L_0x0028
            com.google.android.exoplayer2.h0 r2 = r1.f22541m0
            boolean r9 = r1.f22548t0
            com.google.android.exoplayer2.Timeline$c r10 = r1.f22531c0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mo22835a(r9, r10)
            r15 = r2
            r12 = r6
            r18 = r12
        L_0x0026:
            r2 = 1
            goto L_0x0057
        L_0x0028:
            java.lang.Object r9 = r2.first
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            com.google.android.exoplayer2.f0 r12 = r1.f22539k0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r9 = r12.mo22811a(r9, r10)
            boolean r12 = r9.mo23494a()
            if (r12 == 0) goto L_0x0043
            r12 = r4
            r15 = r9
            r18 = r10
            goto L_0x0026
        L_0x0043:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r14 = r0.f22567c
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            r2 = 1
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            r15 = r9
            r18 = r10
        L_0x0057:
            r9 = 2
            com.google.android.exoplayer2.source.MediaSource r10 = r1.f22542n0     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x00c6
            int r10 = r1.f22550v0     // Catch:{ all -> 0x00de }
            if (r10 <= 0) goto L_0x0061
            goto L_0x00c6
        L_0x0061:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            r0 = 4
            r1.m29819c(r0)     // Catch:{ all -> 0x00de }
            r1.m29808a(r8, r8, r3, r8)     // Catch:{ all -> 0x00de }
            goto L_0x00c8
        L_0x006d:
            com.google.android.exoplayer2.h0 r0 = r1.f22541m0     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.f18535c     // Catch:{ all -> 0x00de }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00b7
            com.google.android.exoplayer2.f0 r0 = r1.f22539k0     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.d0 r0 = r0.mo22824e()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x008c
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x008c
            com.google.android.exoplayer2.source.a0 r0 = r0.f18430a     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.SeekParameters r4 = r1.f22540l0     // Catch:{ all -> 0x00de }
            long r4 = r0.mo23539a(r12, r4)     // Catch:{ all -> 0x00de }
            goto L_0x008d
        L_0x008c:
            r4 = r12
        L_0x008d:
            long r6 = com.google.android.exoplayer2.C8883r.usToMs(r4)     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.h0 r0 = r1.f22541m0     // Catch:{ all -> 0x00de }
            long r10 = r0.f18545m     // Catch:{ all -> 0x00de }
            long r10 = com.google.android.exoplayer2.C8883r.usToMs(r10)     // Catch:{ all -> 0x00de }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            com.google.android.exoplayer2.h0 r0 = r1.f22541m0     // Catch:{ all -> 0x00de }
            long r3 = r0.f18545m     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.h0 r14 = r1.f22541m0
            long r20 = r22.m29831f()
            r16 = r3
            com.google.android.exoplayer2.h0 r0 = r14.mo22832a(r15, r16, r18, r20)
            r1.f22541m0 = r0
            if (r2 == 0) goto L_0x00b6
            com.google.android.exoplayer2.z$d r0 = r1.f22536h0
            r0.mo24830b(r9)
        L_0x00b6:
            return
        L_0x00b7:
            r4 = r12
        L_0x00b8:
            long r4 = r1.m29793a(r15, r4)     // Catch:{ all -> 0x00de }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            r2 = r2 | r3
            r16 = r4
            goto L_0x00ca
        L_0x00c6:
            r1.f22551w0 = r0     // Catch:{ all -> 0x00de }
        L_0x00c8:
            r16 = r12
        L_0x00ca:
            com.google.android.exoplayer2.h0 r14 = r1.f22541m0
            long r20 = r22.m29831f()
            com.google.android.exoplayer2.h0 r0 = r14.mo22832a(r15, r16, r18, r20)
            r1.f22541m0 = r0
            if (r2 == 0) goto L_0x00dd
            com.google.android.exoplayer2.z$d r0 = r1.f22536h0
            r0.mo24830b(r9)
        L_0x00dd:
            return
        L_0x00de:
            r0 = move-exception
            com.google.android.exoplayer2.h0 r14 = r1.f22541m0
            long r20 = r22.m29831f()
            r16 = r12
            com.google.android.exoplayer2.h0 r3 = r14.mo22832a(r15, r16, r18, r20)
            r1.f22541m0 = r3
            if (r2 == 0) goto L_0x00f4
            com.google.android.exoplayer2.z$d r2 = r1.f22536h0
            r2.mo24830b(r9)
        L_0x00f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9616z.m29805a(com.google.android.exoplayer2.z$e):void");
    }

    /* renamed from: b */
    public /* synthetic */ void mo24819b(PlayerMessage playerMessage) {
        try {
            m29821c(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.m29496a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private void m29817b(C8733l0 l0Var) throws ExoPlaybackException {
        if (l0Var.mo22845d() == 2) {
            l0Var.stop();
        }
    }

    /* renamed from: b */
    private Pair<Object, Long> m29812b(Timeline timeline, int i, long j) {
        return timeline.mo22658a(this.f22531c0, this.f22532d0, i, j);
    }

    /* renamed from: b */
    private void m29816b(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        C8733l0[] l0VarArr;
        this.f22529b0.obtainMessage(1, playbackParameters).sendToTarget();
        m29797a(playbackParameters.f18372a);
        for (C8733l0 l0Var : this.f22530c) {
            if (l0Var != null) {
                l0Var.mo22837a(playbackParameters.f18372a);
            }
        }
    }

    /* renamed from: d */
    private void m29825d(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.mo22641e() == -9223372036854775807L) {
            m29829e(playerMessage);
        } else if (this.f22542n0 == null || this.f22550v0 > 0) {
            this.f22537i0.add(new C9619c(playerMessage));
        } else {
            C9619c cVar = new C9619c(playerMessage);
            if (m29810a(cVar)) {
                this.f22537i0.add(cVar);
                Collections.sort(this.f22537i0);
                return;
            }
            playerMessage.mo22636a(false);
        }
    }

    /* renamed from: d */
    private void m29826d(C9072a0 a0Var) throws ExoPlaybackException {
        if (this.f22539k0.mo22819a(a0Var)) {
            C8683d0 d = this.f22539k0.mo22823d();
            d.mo22721a(this.f22535g0.getPlaybackParameters().f18372a, this.f22541m0.f18533a);
            m29803a(d.mo22733f(), d.mo22734g());
            if (!this.f22539k0.mo22826g()) {
                m29814b(this.f22539k0.mo22808a().f18435f.f18511b);
                m29801a((C8683d0) null);
            }
            m29838i();
        }
    }

    /* renamed from: a */
    private long m29793a(MediaPeriodId mediaPeriodId, long j) throws ExoPlaybackException {
        return m29794a(mediaPeriodId, j, this.f22539k0.mo22824e() != this.f22539k0.mo22825f());
    }

    /* renamed from: a */
    private long m29794a(MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
        m29849s();
        this.f22546r0 = false;
        m29819c(2);
        C8683d0 e = this.f22539k0.mo22824e();
        C8683d0 d0Var = e;
        while (true) {
            if (d0Var != null) {
                if (mediaPeriodId.equals(d0Var.f18435f.f18510a) && d0Var.f18433d) {
                    this.f22539k0.mo22818a(d0Var);
                    break;
                }
                d0Var = this.f22539k0.mo22808a();
            } else {
                break;
            }
        }
        if (z || e != d0Var || (d0Var != null && d0Var.mo22732e(j) < 0)) {
            for (C8733l0 a : this.f22543o0) {
                m29802a(a);
            }
            this.f22543o0 = new C8733l0[0];
            e = null;
            if (d0Var != null) {
                d0Var.mo22728c(0);
            }
        }
        if (d0Var != null) {
            m29801a(e);
            if (d0Var.f18434e) {
                long a2 = d0Var.f18430a.mo23538a(j);
                d0Var.f18430a.mo23541a(a2 - this.f22533e0, this.f22534f0);
                j = a2;
            }
            m29814b(j);
            m29838i();
        } else {
            this.f22539k0.mo22815a(true);
            this.f22541m0 = this.f22541m0.mo22833a(TrackGroupArray.f20167W, this.f22524W);
            m29814b(j);
        }
        m29827d(false);
        this.f22527Z.mo24622a(2);
        return j;
    }

    /* renamed from: d */
    private void m29827d(boolean z) {
        long j;
        C8683d0 d = this.f22539k0.mo22823d();
        MediaPeriodId mediaPeriodId = d == null ? this.f22541m0.f18535c : d.f18435f.f18510a;
        boolean z2 = !this.f22541m0.f18542j.equals(mediaPeriodId);
        if (z2) {
            this.f22541m0 = this.f22541m0.mo22830a(mediaPeriodId);
        }
        C8725h0 h0Var = this.f22541m0;
        if (d == null) {
            j = h0Var.f18545m;
        } else {
            j = d.mo22718a();
        }
        h0Var.f18543k = j;
        this.f22541m0.f18544l = m29831f();
        if ((z2 || z) && d != null && d.f18433d) {
            m29803a(d.mo22733f(), d.mo22734g());
        }
    }

    /* renamed from: a */
    private void m29800a(SeekParameters seekParameters) {
        this.f22540l0 = seekParameters;
    }

    /* renamed from: a */
    private void m29806a(boolean z, AtomicBoolean atomicBoolean) {
        C8733l0[] l0VarArr;
        if (this.f22549u0 != z) {
            this.f22549u0 = z;
            if (!z) {
                for (C8733l0 l0Var : this.f22530c) {
                    if (l0Var.mo22845d() == 0) {
                        l0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    private void m29807a(boolean z, boolean z2, boolean z3) {
        m29808a(z || !this.f22549u0, true, z2, z2);
        this.f22536h0.mo24828a(this.f22550v0 + (z3 ? 1 : 0));
        this.f22550v0 = 0;
        this.f22525X.mo7730f();
        m29819c(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29808a(boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r1 = r23
            com.google.android.exoplayer2.v0.p r0 = r1.f22527Z
            r2 = 2
            r0.mo24624b(r2)
            r2 = 0
            r1.f22546r0 = r2
            com.google.android.exoplayer2.v r0 = r1.f22535g0
            r0.mo24590c()
            r3 = 0
            r1.f22552x0 = r3
            com.google.android.exoplayer2.l0[] r3 = r1.f22543o0
            int r4 = r3.length
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.m29802a(r0)     // Catch:{ ExoPlaybackException -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            com.google.android.exoplayer2.p393v0.Log.m29496a(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r24 == 0) goto L_0x0045
            com.google.android.exoplayer2.l0[] r3 = r1.f22530c
            int r4 = r3.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.reset()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            com.google.android.exoplayer2.p393v0.Log.m29496a(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            com.google.android.exoplayer2.l0[] r0 = new com.google.android.exoplayer2.C8733l0[r2]
            r1.f22543o0 = r0
            r0 = 0
            if (r26 == 0) goto L_0x004f
            r1.f22551w0 = r0
            goto L_0x0086
        L_0x004f:
            if (r27 == 0) goto L_0x0086
            com.google.android.exoplayer2.z$e r3 = r1.f22551w0
            if (r3 != 0) goto L_0x0084
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            com.google.android.exoplayer2.Timeline r3 = r3.f18533a
            boolean r3 = r3.mo22671c()
            if (r3 != 0) goto L_0x0084
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            com.google.android.exoplayer2.Timeline r4 = r3.f18533a
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.f18535c
            java.lang.Object r3 = r3.f20147a
            com.google.android.exoplayer2.Timeline$b r5 = r1.f22532d0
            r4.mo22662a(r3, r5)
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            long r3 = r3.f18545m
            com.google.android.exoplayer2.Timeline$b r5 = r1.f22532d0
            long r5 = r5.mo22688f()
            long r3 = r3 + r5
            com.google.android.exoplayer2.z$e r5 = new com.google.android.exoplayer2.z$e
            com.google.android.exoplayer2.Timeline r6 = com.google.android.exoplayer2.Timeline.f18393a
            com.google.android.exoplayer2.Timeline$b r7 = r1.f22532d0
            int r7 = r7.f18395b
            r5.<init>(r6, r7, r3)
            r1.f22551w0 = r5
        L_0x0084:
            r3 = 1
            goto L_0x0088
        L_0x0086:
            r3 = r26
        L_0x0088:
            com.google.android.exoplayer2.f0 r4 = r1.f22539k0
            r5 = r3 ^ 1
            r4.mo22815a(r5)
            r1.m29833f(r2)
            if (r27 == 0) goto L_0x00ba
            com.google.android.exoplayer2.f0 r4 = r1.f22539k0
            com.google.android.exoplayer2.Timeline r5 = com.google.android.exoplayer2.Timeline.f18393a
            r4.mo22814a(r5)
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r4 = r1.f22537i0
            java.util.Iterator r4 = r4.iterator()
        L_0x00a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r4.next()
            com.google.android.exoplayer2.z$c r5 = (com.google.android.exoplayer2.C9616z.C9619c) r5
            com.google.android.exoplayer2.PlayerMessage r5 = r5.f22560c
            r5.mo22636a(r2)
            goto L_0x00a1
        L_0x00b3:
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r4 = r1.f22537i0
            r4.clear()
            r1.f22553y0 = r2
        L_0x00ba:
            if (r3 == 0) goto L_0x00c7
            com.google.android.exoplayer2.h0 r2 = r1.f22541m0
            boolean r4 = r1.f22548t0
            com.google.android.exoplayer2.Timeline$c r5 = r1.f22531c0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mo22835a(r4, r5)
            goto L_0x00cb
        L_0x00c7:
            com.google.android.exoplayer2.h0 r2 = r1.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.f18535c
        L_0x00cb:
            r16 = r2
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x00d7
            r21 = r4
            goto L_0x00dd
        L_0x00d7:
            com.google.android.exoplayer2.h0 r2 = r1.f22541m0
            long r6 = r2.f18545m
            r21 = r6
        L_0x00dd:
            if (r3 == 0) goto L_0x00e1
            r10 = r4
            goto L_0x00e6
        L_0x00e1:
            com.google.android.exoplayer2.h0 r2 = r1.f22541m0
            long r2 = r2.f18537e
            r10 = r2
        L_0x00e6:
            com.google.android.exoplayer2.h0 r2 = new com.google.android.exoplayer2.h0
            if (r27 == 0) goto L_0x00ed
            com.google.android.exoplayer2.Timeline r3 = com.google.android.exoplayer2.Timeline.f18393a
            goto L_0x00f1
        L_0x00ed:
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            com.google.android.exoplayer2.Timeline r3 = r3.f18533a
        L_0x00f1:
            r5 = r3
            if (r27 == 0) goto L_0x00f6
            r6 = r0
            goto L_0x00fb
        L_0x00f6:
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            java.lang.Object r3 = r3.f18534b
            r6 = r3
        L_0x00fb:
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            int r12 = r3.f18538f
            r13 = 0
            if (r27 == 0) goto L_0x0105
            com.google.android.exoplayer2.source.TrackGroupArray r3 = com.google.android.exoplayer2.source.TrackGroupArray.f20167W
            goto L_0x0107
        L_0x0105:
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r3.f18540h
        L_0x0107:
            r14 = r3
            if (r27 == 0) goto L_0x010d
            com.google.android.exoplayer2.trackselection.m r3 = r1.f22524W
            goto L_0x0111
        L_0x010d:
            com.google.android.exoplayer2.h0 r3 = r1.f22541m0
            com.google.android.exoplayer2.trackselection.m r3 = r3.f18541i
        L_0x0111:
            r15 = r3
            r19 = 0
            r4 = r2
            r7 = r16
            r8 = r21
            r17 = r21
            r4.<init>(r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r19, r21)
            r1.f22541m0 = r2
            if (r25 == 0) goto L_0x012b
            com.google.android.exoplayer2.source.MediaSource r2 = r1.f22542n0
            if (r2 == 0) goto L_0x012b
            r2.mo23489a(r1)
            r1.f22542n0 = r0
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9616z.m29808a(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private boolean m29810a(C9619c cVar) {
        Object obj = cVar.f22559W;
        if (obj == null) {
            Pair a = m29795a(new C9621e(cVar.f22560c.mo22643g(), cVar.f22560c.mo22645i(), C8883r.msToUs(cVar.f22560c.mo22641e())), false);
            if (a == null) {
                return false;
            }
            cVar.mo24826a(this.f22541m0.f18533a.mo22656a(a.first), ((Long) a.second).longValue(), a.first);
        } else {
            int a2 = this.f22541m0.f18533a.mo22656a(obj);
            if (a2 == -1) {
                return false;
            }
            cVar.f22557U = a2;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[LOOP:1: B:24:0x0075->B:34:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x005f A[EDGE_INSN: B:67:0x005f->B:20:0x005f ?: BREAK  
    EDGE_INSN: B:67:0x005f->B:20:0x005f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0074 A[EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
    EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
    EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0074 A[EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
    EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29799a(long r7, long r9) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r6 = this;
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r0 = r6.f22537i0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0112
            com.google.android.exoplayer2.h0 r0 = r6.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.f18535c
            boolean r0 = r0.mo23494a()
            if (r0 == 0) goto L_0x0014
            goto L_0x0112
        L_0x0014:
            com.google.android.exoplayer2.h0 r0 = r6.f22541m0
            long r0 = r0.f18536d
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x001f
            r0 = 1
            long r7 = r7 - r0
        L_0x001f:
            com.google.android.exoplayer2.h0 r0 = r6.f22541m0
            com.google.android.exoplayer2.Timeline r1 = r0.f18533a
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.f18535c
            java.lang.Object r0 = r0.f20147a
            int r0 = r1.mo22656a(r0)
            int r1 = r6.f22553y0
            r2 = 0
            if (r1 <= 0) goto L_0x003b
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r3 = r6.f22537i0
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            com.google.android.exoplayer2.z$c r1 = (com.google.android.exoplayer2.C9616z.C9619c) r1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == 0) goto L_0x005f
            int r3 = r1.f22557U
            if (r3 > r0) goto L_0x004a
            if (r3 != r0) goto L_0x005f
            long r3 = r1.f22558V
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x005f
        L_0x004a:
            int r1 = r6.f22553y0
            int r1 = r1 + -1
            r6.f22553y0 = r1
            int r1 = r6.f22553y0
            if (r1 <= 0) goto L_0x003b
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r3 = r6.f22537i0
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            com.google.android.exoplayer2.z$c r1 = (com.google.android.exoplayer2.C9616z.C9619c) r1
            goto L_0x003c
        L_0x005f:
            int r1 = r6.f22553y0
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r3 = r6.f22537i0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0074
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r1 = r6.f22537i0
            int r3 = r6.f22553y0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.exoplayer2.z$c r1 = (com.google.android.exoplayer2.C9616z.C9619c) r1
            goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r3 = r1.f22559W
            if (r3 == 0) goto L_0x00a2
            int r3 = r1.f22557U
            if (r3 < r0) goto L_0x0087
            if (r3 != r0) goto L_0x00a2
            long r3 = r1.f22558V
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00a2
        L_0x0087:
            int r1 = r6.f22553y0
            int r1 = r1 + 1
            r6.f22553y0 = r1
            int r1 = r6.f22553y0
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r3 = r6.f22537i0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0074
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r1 = r6.f22537i0
            int r3 = r6.f22553y0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.exoplayer2.z$c r1 = (com.google.android.exoplayer2.C9616z.C9619c) r1
            goto L_0x0075
        L_0x00a2:
            if (r1 == 0) goto L_0x0112
            java.lang.Object r3 = r1.f22559W
            if (r3 == 0) goto L_0x0112
            int r3 = r1.f22557U
            if (r3 != r0) goto L_0x0112
            long r3 = r1.f22558V
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0112
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0112
            com.google.android.exoplayer2.PlayerMessage r3 = r1.f22560c     // Catch:{ all -> 0x00f1 }
            r6.m29829e(r3)     // Catch:{ all -> 0x00f1 }
            com.google.android.exoplayer2.PlayerMessage r3 = r1.f22560c
            boolean r3 = r3.mo22638b()
            if (r3 != 0) goto L_0x00d3
            com.google.android.exoplayer2.PlayerMessage r1 = r1.f22560c
            boolean r1 = r1.mo22646j()
            if (r1 == 0) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            int r1 = r6.f22553y0
            int r1 = r1 + 1
            r6.f22553y0 = r1
            goto L_0x00da
        L_0x00d3:
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r1 = r6.f22537i0
            int r3 = r6.f22553y0
            r1.remove(r3)
        L_0x00da:
            int r1 = r6.f22553y0
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r3 = r6.f22537i0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00ef
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r1 = r6.f22537i0
            int r3 = r6.f22553y0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.exoplayer2.z$c r1 = (com.google.android.exoplayer2.C9616z.C9619c) r1
            goto L_0x00a2
        L_0x00ef:
            r1 = r2
            goto L_0x00a2
        L_0x00f1:
            r7 = move-exception
            com.google.android.exoplayer2.PlayerMessage r8 = r1.f22560c
            boolean r8 = r8.mo22638b()
            if (r8 != 0) goto L_0x010a
            com.google.android.exoplayer2.PlayerMessage r8 = r1.f22560c
            boolean r8 = r8.mo22646j()
            if (r8 == 0) goto L_0x0103
            goto L_0x010a
        L_0x0103:
            int r8 = r6.f22553y0
            int r8 = r8 + 1
            r6.f22553y0 = r8
            goto L_0x0111
        L_0x010a:
            java.util.ArrayList<com.google.android.exoplayer2.z$c> r8 = r6.f22537i0
            int r9 = r6.f22553y0
            r8.remove(r9)
        L_0x0111:
            throw r7
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9616z.m29799a(long, long):void");
    }

    /* renamed from: a */
    private void m29802a(C8733l0 l0Var) throws ExoPlaybackException {
        this.f22535g0.mo24587a(l0Var);
        m29817b(l0Var);
        l0Var.mo22846e();
    }

    /* renamed from: a */
    private void m29797a(float f) {
        C9311j[] a;
        C8683d0 c = this.f22539k0.mo22822c();
        while (c != null && c.f18433d) {
            for (C9311j jVar : c.mo22734g().f21312c.mo24041a()) {
                if (jVar != null) {
                    jVar.mo24052a(f);
                }
            }
            c = c.mo22724b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a A[LOOP:0: B:46:0x011a->B:58:0x011a, LOOP_START, PHI: r14 
      PHI: (r14v12 com.google.android.exoplayer2.d0) = (r14v9 com.google.android.exoplayer2.d0), (r14v13 com.google.android.exoplayer2.d0) binds: [B:45:0x0118, B:58:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29804a(com.google.android.exoplayer2.C9616z.C9618b r14) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r13 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r14.f22554a
            com.google.android.exoplayer2.source.MediaSource r1 = r13.f22542n0
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            com.google.android.exoplayer2.z$d r0 = r13.f22536h0
            int r1 = r13.f22550v0
            r0.mo24828a(r1)
            r0 = 0
            r13.f22550v0 = r0
            com.google.android.exoplayer2.h0 r1 = r13.f22541m0
            com.google.android.exoplayer2.Timeline r1 = r1.f18533a
            com.google.android.exoplayer2.Timeline r2 = r14.f22555b
            java.lang.Object r14 = r14.f22556c
            com.google.android.exoplayer2.f0 r3 = r13.f22539k0
            r3.mo22814a(r2)
            com.google.android.exoplayer2.h0 r3 = r13.f22541m0
            com.google.android.exoplayer2.h0 r14 = r3.mo22829a(r2, r14)
            r13.f22541m0 = r14
            r13.m29847q()
            com.google.android.exoplayer2.h0 r14 = r13.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r14.f18535c
            boolean r3 = r14.mo23494a()
            if (r3 == 0) goto L_0x0038
            com.google.android.exoplayer2.h0 r3 = r13.f22541m0
            long r3 = r3.f18537e
            goto L_0x003c
        L_0x0038:
            com.google.android.exoplayer2.h0 r3 = r13.f22541m0
            long r3 = r3.f18545m
        L_0x003c:
            com.google.android.exoplayer2.z$e r5 = r13.f22551w0
            if (r5 == 0) goto L_0x0062
            r14 = 1
            android.util.Pair r14 = r13.m29795a(r5, r14)
            r1 = 0
            r13.f22551w0 = r1
            if (r14 != 0) goto L_0x004e
            r13.m29834g()
            return
        L_0x004e:
            java.lang.Object r1 = r14.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.exoplayer2.f0 r5 = r13.f22539k0
            java.lang.Object r14 = r14.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r5.mo22811a(r14, r1)
        L_0x005e:
            r6 = r14
            r9 = r1
            goto L_0x00f2
        L_0x0062:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x009e
            boolean r7 = r2.mo22671c()
            if (r7 != 0) goto L_0x009e
            boolean r14 = r13.f22548t0
            int r14 = r2.mo22657a(r14)
            android.util.Pair r14 = r13.m29812b(r2, r14, r5)
            com.google.android.exoplayer2.f0 r1 = r13.f22539k0
            java.lang.Object r2 = r14.first
            java.lang.Object r5 = r14.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.mo22811a(r2, r5)
            boolean r2 = r1.mo23494a()
            if (r2 != 0) goto L_0x009a
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r5 = r14.longValue()
            goto L_0x009b
        L_0x009a:
            r5 = r3
        L_0x009b:
            r9 = r5
            r6 = r1
            goto L_0x00f2
        L_0x009e:
            java.lang.Object r7 = r14.f20147a
            int r7 = r2.mo22656a(r7)
            r8 = -1
            if (r7 != r8) goto L_0x00d0
            java.lang.Object r14 = r14.f20147a
            java.lang.Object r14 = r13.m29796a(r14, r1, r2)
            if (r14 != 0) goto L_0x00b3
            r13.m29834g()
            return
        L_0x00b3:
            com.google.android.exoplayer2.Timeline$b r1 = r13.f22532d0
            com.google.android.exoplayer2.Timeline$b r14 = r2.mo22662a(r14, r1)
            int r14 = r14.f18395b
            android.util.Pair r14 = r13.m29812b(r2, r14, r5)
            java.lang.Object r1 = r14.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.exoplayer2.f0 r5 = r13.f22539k0
            java.lang.Object r14 = r14.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r5.mo22811a(r14, r1)
            goto L_0x005e
        L_0x00d0:
            com.google.android.exoplayer2.f0 r14 = r13.f22539k0
            com.google.android.exoplayer2.h0 r1 = r13.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.f18535c
            java.lang.Object r1 = r1.f20147a
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r14.mo22811a(r1, r3)
            com.google.android.exoplayer2.h0 r1 = r13.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.f18535c
            boolean r1 = r1.mo23494a()
            if (r1 != 0) goto L_0x00f0
            boolean r1 = r14.mo23494a()
            if (r1 != 0) goto L_0x00f0
            com.google.android.exoplayer2.h0 r14 = r13.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r14.f18535c
        L_0x00f0:
            r6 = r14
            r9 = r3
        L_0x00f2:
            com.google.android.exoplayer2.h0 r14 = r13.f22541m0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r14.f18535c
            boolean r14 = r14.equals(r6)
            if (r14 == 0) goto L_0x0112
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0112
            com.google.android.exoplayer2.f0 r14 = r13.f22539k0
            long r1 = r13.f22552x0
            long r3 = r13.m29828e()
            boolean r14 = r14.mo22817a(r1, r3)
            if (r14 != 0) goto L_0x0153
            r13.m29830e(r0)
            goto L_0x0153
        L_0x0112:
            com.google.android.exoplayer2.f0 r14 = r13.f22539k0
            com.google.android.exoplayer2.d0 r14 = r14.mo22822c()
            if (r14 == 0) goto L_0x0139
        L_0x011a:
            com.google.android.exoplayer2.d0 r1 = r14.mo22724b()
            if (r1 == 0) goto L_0x0139
            com.google.android.exoplayer2.d0 r14 = r14.mo22724b()
            com.google.android.exoplayer2.e0 r1 = r14.f18435f
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.f18510a
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x011a
            com.google.android.exoplayer2.f0 r1 = r13.f22539k0
            com.google.android.exoplayer2.e0 r2 = r14.f18435f
            com.google.android.exoplayer2.e0 r1 = r1.mo22810a(r2)
            r14.f18435f = r1
            goto L_0x011a
        L_0x0139:
            boolean r14 = r6.mo23494a()
            if (r14 == 0) goto L_0x0142
            r1 = 0
            goto L_0x0143
        L_0x0142:
            r1 = r9
        L_0x0143:
            long r7 = r13.m29793a(r6, r1)
            com.google.android.exoplayer2.h0 r5 = r13.f22541m0
            long r11 = r13.m29831f()
            com.google.android.exoplayer2.h0 r14 = r5.mo22832a(r6, r7, r9, r11)
            r13.f22541m0 = r14
        L_0x0153:
            r13.m29827d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9616z.m29804a(com.google.android.exoplayer2.z$b):void");
    }

    /* renamed from: a */
    private Object m29796a(Object obj, Timeline timeline, Timeline timeline2) {
        int a = timeline.mo22656a(obj);
        int a2 = timeline.mo22653a();
        int i = a;
        int i2 = -1;
        for (int i3 = 0; i3 < a2 && i2 == -1; i3++) {
            i = timeline.mo22655a(i, this.f22532d0, this.f22531c0, this.f22547s0, this.f22548t0);
            if (i == -1) {
                break;
            }
            i2 = timeline2.mo22656a(timeline.mo22666a(i));
        }
        if (i2 == -1) {
            return null;
        }
        return timeline2.mo22666a(i2);
    }

    /* renamed from: a */
    private Pair<Object, Long> m29795a(C9621e eVar, boolean z) {
        Timeline timeline = this.f22541m0.f18533a;
        Timeline timeline2 = eVar.f22565a;
        if (timeline.mo22671c()) {
            return null;
        }
        if (timeline2.mo22671c()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> a = timeline2.mo22658a(this.f22531c0, this.f22532d0, eVar.f22566b, eVar.f22567c);
            if (timeline == timeline2) {
                return a;
            }
            int a2 = timeline.mo22656a(a.first);
            if (a2 != -1) {
                return a;
            }
            if (z && m29796a(a.first, timeline2, timeline) != null) {
                return m29812b(timeline, timeline.mo22660a(a2, this.f22532d0).f18395b, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: a */
    private void m29801a(C8683d0 d0Var) throws ExoPlaybackException {
        C8683d0 e = this.f22539k0.mo22824e();
        if (e != null && d0Var != e) {
            boolean[] zArr = new boolean[this.f22530c.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C8733l0[] l0VarArr = this.f22530c;
                if (i < l0VarArr.length) {
                    C8733l0 l0Var = l0VarArr[i];
                    zArr[i] = l0Var.mo22845d() != 0;
                    if (e.mo22734g().mo24134a(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!e.mo22734g().mo24134a(i) || (l0Var.mo22854m() && l0Var.mo22851j() == d0Var.f18432c[i]))) {
                        m29802a(l0Var);
                    }
                    i++;
                } else {
                    this.f22541m0 = this.f22541m0.mo22833a(e.mo22733f(), e.mo22734g());
                    m29809a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m29809a(boolean[] zArr, int i) throws ExoPlaybackException {
        this.f22543o0 = new C8733l0[i];
        C9318m g = this.f22539k0.mo22824e().mo22734g();
        for (int i2 = 0; i2 < this.f22530c.length; i2++) {
            if (!g.mo24134a(i2)) {
                this.f22530c[i2].reset();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f22530c.length; i4++) {
            if (g.mo24134a(i4)) {
                int i5 = i3 + 1;
                m29798a(i4, zArr[i4], i3);
                i3 = i5;
            }
        }
    }

    /* renamed from: a */
    private void m29798a(int i, boolean z, int i2) throws ExoPlaybackException {
        C8683d0 e = this.f22539k0.mo22824e();
        C8733l0 l0Var = this.f22530c[i];
        this.f22543o0[i2] = l0Var;
        if (l0Var.mo22845d() == 0) {
            C9318m g = e.mo22734g();
            C8800n0 n0Var = g.f21311b[i];
            Format[] a = m29811a(g.f21312c.mo24040a(i));
            boolean z2 = this.f22545q0 && this.f22541m0.f18538f == 3;
            l0Var.mo22841a(n0Var, a, e.f18432c[i], this.f22552x0, !z && z2, e.mo22729d());
            this.f22535g0.mo24589b(l0Var);
            if (z2) {
                l0Var.start();
            }
        }
    }

    /* renamed from: a */
    private long m29792a(long j) {
        C8683d0 d = this.f22539k0.mo22823d();
        if (d == null) {
            return 0;
        }
        return Math.max(0, j - d.mo22730d(this.f22552x0));
    }

    /* renamed from: a */
    private void m29803a(TrackGroupArray trackGroupArray, C9318m mVar) {
        this.f22525X.mo7723a(this.f22530c, trackGroupArray, mVar.f21312c);
    }

    /* renamed from: a */
    private static Format[] m29811a(C9311j jVar) {
        int length = jVar != null ? jVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = jVar.mo24066a(i);
        }
        return formatArr;
    }
}
