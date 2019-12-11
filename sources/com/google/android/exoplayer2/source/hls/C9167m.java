package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8778l;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p366s0.C8911f;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9566t;
import com.google.android.exoplayer2.source.C9137e0;
import com.google.android.exoplayer2.source.C9137e0.C9139b;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9143g0;
import com.google.android.exoplayer2.source.C9143g0.C9144a;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C9156g.C9159c;
import com.google.android.exoplayer2.source.p379m0.C9212d;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.C9444b;
import com.google.android.exoplayer2.upstream.Loader.C9445c;
import com.google.android.exoplayer2.upstream.Loader.C9448f;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.m */
/* compiled from: HlsSampleStreamWrapper */
final class C9167m implements C9444b<C9212d>, C9448f, C9143g0, C8914i, C9139b {

    /* renamed from: A0 */
    private int f20636A0;

    /* renamed from: B0 */
    private boolean f20637B0;

    /* renamed from: C0 */
    private boolean[] f20638C0 = new boolean[0];

    /* renamed from: D0 */
    private boolean[] f20639D0 = new boolean[0];

    /* renamed from: E0 */
    private long f20640E0;

    /* renamed from: F0 */
    private long f20641F0;

    /* renamed from: G0 */
    private boolean f20642G0;

    /* renamed from: H0 */
    private boolean f20643H0;

    /* renamed from: I0 */
    private boolean f20644I0;

    /* renamed from: J0 */
    private boolean f20645J0;

    /* renamed from: K0 */
    private long f20646K0;

    /* renamed from: L0 */
    private int f20647L0;

    /* renamed from: U */
    private final C9168a f20648U;

    /* renamed from: V */
    private final C9156g f20649V;

    /* renamed from: W */
    private final C9491f f20650W;

    /* renamed from: X */
    private final Format f20651X;

    /* renamed from: Y */
    private final LoadErrorHandlingPolicy f20652Y;

    /* renamed from: Z */
    private final Loader f20653Z = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: a0 */
    private final C9068a f20654a0;

    /* renamed from: b0 */
    private final C9159c f20655b0 = new C9159c();

    /* renamed from: c */
    private final int f20656c;

    /* renamed from: c0 */
    private final ArrayList<C9164j> f20657c0 = new ArrayList<>();

    /* renamed from: d0 */
    private final List<C9164j> f20658d0 = Collections.unmodifiableList(this.f20657c0);

    /* renamed from: e0 */
    private final Runnable f20659e0 = new C9151b(this);

    /* renamed from: f0 */
    private final Runnable f20660f0 = new C9152c(this);

    /* renamed from: g0 */
    private final Handler f20661g0 = new Handler();

    /* renamed from: h0 */
    private final ArrayList<C9166l> f20662h0 = new ArrayList<>();

    /* renamed from: i0 */
    private final Map<String, DrmInitData> f20663i0;

    /* renamed from: j0 */
    private C9137e0[] f20664j0 = new C9137e0[0];

    /* renamed from: k0 */
    private int[] f20665k0 = new int[0];

    /* renamed from: l0 */
    private boolean f20666l0;

    /* renamed from: m0 */
    private int f20667m0 = -1;

    /* renamed from: n0 */
    private boolean f20668n0;

    /* renamed from: o0 */
    private int f20669o0 = -1;

    /* renamed from: p0 */
    private int f20670p0;

    /* renamed from: q0 */
    private int f20671q0;

    /* renamed from: r0 */
    private boolean f20672r0;

    /* renamed from: s0 */
    private boolean f20673s0;

    /* renamed from: t0 */
    private int f20674t0;

    /* renamed from: u0 */
    private Format f20675u0;

    /* renamed from: v0 */
    private Format f20676v0;

    /* renamed from: w0 */
    private boolean f20677w0;

    /* renamed from: x0 */
    private TrackGroupArray f20678x0;

    /* renamed from: y0 */
    private TrackGroupArray f20679y0;

    /* renamed from: z0 */
    private int[] f20680z0;

    /* renamed from: com.google.android.exoplayer2.source.hls.m$a */
    /* compiled from: HlsSampleStreamWrapper */
    public interface C9168a extends C9144a<C9167m> {
        /* renamed from: a */
        void mo23819a();

        /* renamed from: a */
        void mo23820a(Uri uri);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.m$b */
    /* compiled from: HlsSampleStreamWrapper */
    private static final class C9169b extends C9137e0 {
        public C9169b(C9491f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public void mo23304a(Format format) {
            super.mo23304a(format.mo22603a(m27578a(format.f18347Z)));
        }

        /* renamed from: a */
        private Metadata m27578a(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int X = metadata.mo22862X();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= X) {
                    i2 = -1;
                    break;
                }
                C8737b a = metadata.mo22863a(i2);
                if (a instanceof C8778l) {
                    if ("com.apple.streaming.transportStreamTimestamp".equals(((C8778l) a).f18635U)) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (X == 1) {
                return null;
            }
            C8737b[] bVarArr = new C8737b[(X - 1)];
            while (i < X) {
                if (i != i2) {
                    bVarArr[i < i2 ? i : i - 1] = metadata.mo22863a(i);
                }
                i++;
            }
            return new Metadata(bVarArr);
        }
    }

    public C9167m(int i, C9168a aVar, C9156g gVar, Map<String, DrmInitData> map, C9491f fVar, long j, Format format, LoadErrorHandlingPolicy zVar, C9068a aVar2) {
        this.f20656c = i;
        this.f20648U = aVar;
        this.f20649V = gVar;
        this.f20663i0 = map;
        this.f20650W = fVar;
        this.f20651X = format;
        this.f20652Y = zVar;
        this.f20654a0 = aVar2;
        this.f20640E0 = j;
        this.f20641F0 = j;
    }

    /* renamed from: d */
    private static int m27534d(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: e */
    private boolean m27535e(long j) {
        int length = this.f20664j0.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            C9137e0 e0Var = this.f20664j0[i];
            e0Var.mo23769n();
            if (e0Var.mo23748a(j, true, false) == -1) {
                z = false;
            }
            if (z || (!this.f20639D0[i] && this.f20637B0)) {
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m27536k() {
        int length = this.f20664j0.length;
        boolean z = false;
        int i = 0;
        int i2 = 6;
        int i3 = -1;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            String str = this.f20664j0[i].mo23763h().f18349b0;
            if (!C9566t.m29519l(str)) {
                i4 = C9566t.m29517j(str) ? 1 : C9566t.m29518k(str) ? 3 : 6;
            }
            if (m27534d(i4) > m27534d(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        C9199j0 a = this.f20649V.mo23795a();
        int i5 = a.f20833c;
        this.f20636A0 = -1;
        this.f20680z0 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f20680z0[i6] = i6;
        }
        C9199j0[] j0VarArr = new C9199j0[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format h = this.f20664j0[i7].mo23763h();
            if (i7 == i3) {
                Format[] formatArr = new Format[i5];
                if (i5 == 1) {
                    formatArr[0] = h.mo22601a(a.mo23902a(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        formatArr[i8] = m27526a(a.mo23902a(i8), h, true);
                    }
                }
                j0VarArr[i7] = new C9199j0(formatArr);
                this.f20636A0 = i7;
            } else {
                j0VarArr[i7] = new C9199j0(m27526a((i2 != 2 || !C9566t.m29517j(h.f18349b0)) ? null : this.f20651X, h, false));
            }
        }
        this.f20678x0 = new TrackGroupArray(j0VarArr);
        if (this.f20679y0 == null) {
            z = true;
        }
        Assertions.checkState(z);
        this.f20679y0 = TrackGroupArray.f20167W;
    }

    /* renamed from: l */
    private C9164j m27537l() {
        ArrayList<C9164j> arrayList = this.f20657c0;
        return (C9164j) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: m */
    private boolean m27538m() {
        return this.f20641F0 != -9223372036854775807L;
    }

    /* renamed from: n */
    private void m27539n() {
        int i = this.f20678x0.f20170c;
        this.f20680z0 = new int[i];
        Arrays.fill(this.f20680z0, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C9137e0[] e0VarArr = this.f20664j0;
                if (i3 >= e0VarArr.length) {
                    break;
                } else if (m27529a(e0VarArr[i3].mo23763h(), this.f20678x0.mo23531a(i2).mo23902a(0))) {
                    this.f20680z0[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator it = this.f20662h0.iterator();
        while (it.hasNext()) {
            ((C9166l) it.next()).mo23825c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m27540o() {
        if (!this.f20677w0 && this.f20680z0 == null && this.f20672r0) {
            C9137e0[] e0VarArr = this.f20664j0;
            int length = e0VarArr.length;
            int i = 0;
            while (i < length) {
                if (e0VarArr[i].mo23763h() != null) {
                    i++;
                } else {
                    return;
                }
            }
            if (this.f20678x0 != null) {
                m27539n();
            } else {
                m27536k();
                this.f20673s0 = true;
                this.f20648U.mo23819a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m27541p() {
        this.f20672r0 = true;
        m27540o();
    }

    /* renamed from: q */
    private void m27542q() {
        for (C9137e0 a : this.f20664j0) {
            a.mo23753a(this.f20642G0);
        }
        this.f20642G0 = false;
    }

    /* renamed from: a */
    public void mo23313a(C8920o oVar) {
    }

    /* renamed from: b */
    public void mo23839b() {
        if (!this.f20673s0) {
            mo23543b(this.f20640E0);
        }
    }

    /* renamed from: c */
    public void mo23842c(int i) {
        int i2 = this.f20680z0[i];
        Assertions.checkState(this.f20638C0[i2]);
        this.f20638C0[i2] = false;
    }

    /* renamed from: c */
    public void mo23545c(long j) {
    }

    /* renamed from: d */
    public void mo23843d() throws IOException {
        mo23846i();
    }

    /* renamed from: f */
    public TrackGroupArray mo23845f() {
        return this.f20678x0;
    }

    /* renamed from: g */
    public long mo23549g() {
        if (this.f20644I0) {
            return Long.MIN_VALUE;
        }
        if (m27538m()) {
            return this.f20641F0;
        }
        long j = this.f20640E0;
        C9164j l = m27537l();
        if (!l.mo23818g()) {
            if (this.f20657c0.size() > 1) {
                ArrayList<C9164j> arrayList = this.f20657c0;
                l = (C9164j) arrayList.get(arrayList.size() - 2);
            } else {
                l = null;
            }
        }
        if (l != null) {
            j = Math.max(j, l.f20862g);
        }
        if (this.f20672r0) {
            for (C9137e0 f : this.f20664j0) {
                j = Math.max(j, f.mo23761f());
            }
        }
        return j;
    }

    /* renamed from: h */
    public void mo23563h() {
        m27542q();
    }

    /* renamed from: i */
    public void mo23846i() throws IOException {
        this.f20653Z.maybeThrowError();
        this.f20649V.mo23804c();
    }

    /* renamed from: j */
    public void mo23847j() {
        if (this.f20673s0) {
            for (C9137e0 b : this.f20664j0) {
                b.mo23754b();
            }
        }
        this.f20653Z.mo24457a((C9448f) this);
        this.f20661g0.removeCallbacksAndMessages(null);
        this.f20677w0 = true;
        this.f20662h0.clear();
    }

    /* renamed from: d */
    public void mo23844d(long j) {
        this.f20646K0 = j;
        for (C9137e0 a : this.f20664j0) {
            a.mo23751a(j);
        }
    }

    /* renamed from: b */
    public boolean mo23841b(long j, boolean z) {
        this.f20640E0 = j;
        if (m27538m()) {
            this.f20641F0 = j;
            return true;
        } else if (this.f20672r0 && !z && m27535e(j)) {
            return false;
        } else {
            this.f20641F0 = j;
            this.f20644I0 = false;
            this.f20657c0.clear();
            if (this.f20653Z.mo24461e()) {
                this.f20653Z.mo24458b();
            } else {
                this.f20653Z.mo24459c();
                m27542q();
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo23833a(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.f20673s0 = true;
        this.f20678x0 = trackGroupArray;
        this.f20679y0 = trackGroupArray2;
        this.f20636A0 = i;
        Handler handler = this.f20661g0;
        C9168a aVar = this.f20648U;
        aVar.getClass();
        handler.post(new C9150a(aVar));
    }

    /* renamed from: c */
    public long mo23544c() {
        if (m27538m()) {
            return this.f20641F0;
        }
        return this.f20644I0 ? Long.MIN_VALUE : m27537l().f20862g;
    }

    /* renamed from: a */
    public int mo23827a(int i) {
        int i2 = this.f20680z0[i];
        int i3 = -2;
        if (i2 == -1) {
            if (this.f20679y0.mo23530a(this.f20678x0.mo23531a(i)) != -1) {
                i3 = -3;
            }
            return i3;
        }
        boolean[] zArr = this.f20638C0;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23838a(com.google.android.exoplayer2.trackselection.TrackSelection[] r20, boolean[] r21, com.google.android.exoplayer2.source.C9141f0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            boolean r3 = r0.f20673s0
            com.google.android.exoplayer2.util.Assertions.checkState(r3)
            int r3 = r0.f20674t0
            r14 = 0
            r4 = 0
        L_0x0011:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x0033
            r5 = r2[r4]
            if (r5 == 0) goto L_0x0030
            r5 = r1[r4]
            if (r5 == 0) goto L_0x0022
            boolean r5 = r21[r4]
            if (r5 != 0) goto L_0x0030
        L_0x0022:
            int r5 = r0.f20674t0
            int r5 = r5 - r15
            r0.f20674t0 = r5
            r5 = r2[r4]
            com.google.android.exoplayer2.source.hls.l r5 = (com.google.android.exoplayer2.source.hls.C9166l) r5
            r5.mo23826d()
            r2[r4] = r6
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0033:
            if (r26 != 0) goto L_0x0045
            boolean r4 = r0.f20643H0
            if (r4 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0043
            goto L_0x0045
        L_0x003c:
            long r3 = r0.f20640E0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = 0
            goto L_0x0046
        L_0x0045:
            r3 = 1
        L_0x0046:
            com.google.android.exoplayer2.source.hls.g r4 = r0.f20649V
            com.google.android.exoplayer2.trackselection.j r4 = r4.mo23803b()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x0050:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00af
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0058
            goto L_0x00ac
        L_0x0058:
            com.google.android.exoplayer2.source.TrackGroupArray r7 = r0.f20678x0
            com.google.android.exoplayer2.source.j0 r8 = r5.mo24067a()
            int r7 = r7.mo23530a(r8)
            int r8 = r0.f20636A0
            if (r7 != r8) goto L_0x006c
            com.google.android.exoplayer2.source.hls.g r8 = r0.f20649V
            r8.mo23798a(r5)
            r11 = r5
        L_0x006c:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00ac
            int r5 = r0.f20674t0
            int r5 = r5 + r15
            r0.f20674t0 = r5
            com.google.android.exoplayer2.source.hls.l r5 = new com.google.android.exoplayer2.source.hls.l
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.f20680z0
            if (r5 == 0) goto L_0x0089
            r5 = r2[r3]
            com.google.android.exoplayer2.source.hls.l r5 = (com.google.android.exoplayer2.source.hls.C9166l) r5
            r5.mo23825c()
        L_0x0089:
            boolean r5 = r0.f20672r0
            if (r5 == 0) goto L_0x00ac
            if (r16 != 0) goto L_0x00ac
            com.google.android.exoplayer2.source.e0[] r5 = r0.f20664j0
            int[] r8 = r0.f20680z0
            r7 = r8[r7]
            r5 = r5[r7]
            r5.mo23769n()
            int r7 = r5.mo23748a(r12, r15, r15)
            r8 = -1
            if (r7 != r8) goto L_0x00aa
            int r5 = r5.mo23762g()
            if (r5 == 0) goto L_0x00aa
            r16 = 1
            goto L_0x00ac
        L_0x00aa:
            r16 = 0
        L_0x00ac:
            int r3 = r3 + 1
            goto L_0x0050
        L_0x00af:
            int r1 = r0.f20674t0
            if (r1 != 0) goto L_0x00e6
            com.google.android.exoplayer2.source.hls.g r1 = r0.f20649V
            r1.mo23805d()
            r0.f20676v0 = r6
            r0.f20642G0 = r15
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.j> r1 = r0.f20657c0
            r1.clear()
            com.google.android.exoplayer2.upstream.a0 r1 = r0.f20653Z
            boolean r1 = r1.mo24461e()
            if (r1 == 0) goto L_0x00e1
            boolean r1 = r0.f20672r0
            if (r1 == 0) goto L_0x00da
            com.google.android.exoplayer2.source.e0[] r1 = r0.f20664j0
            int r3 = r1.length
        L_0x00d0:
            if (r14 >= r3) goto L_0x00da
            r4 = r1[r14]
            r4.mo23754b()
            int r14 = r14 + 1
            goto L_0x00d0
        L_0x00da:
            com.google.android.exoplayer2.upstream.a0 r1 = r0.f20653Z
            r1.mo24458b()
            goto L_0x014c
        L_0x00e1:
            r19.m27542q()
            goto L_0x014c
        L_0x00e6:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.j> r1 = r0.f20657c0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0139
            boolean r1 = com.google.android.exoplayer2.util.Util.m29414a(r11, r4)
            if (r1 != 0) goto L_0x0139
            boolean r1 = r0.f20643H0
            if (r1 != 0) goto L_0x0130
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ff
            long r3 = -r12
        L_0x00ff:
            r6 = r3
            com.google.android.exoplayer2.source.hls.j r1 = r19.m27537l()
            com.google.android.exoplayer2.source.hls.g r3 = r0.f20649V
            com.google.android.exoplayer2.source.m0.m[] r17 = r3.mo23802a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.j> r10 = r0.f20658d0
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.mo23813a(r4, r6, r8, r10, r11)
            com.google.android.exoplayer2.source.hls.g r3 = r0.f20649V
            com.google.android.exoplayer2.source.j0 r3 = r3.mo23795a()
            com.google.android.exoplayer2.Format r1 = r1.f20858c
            int r1 = r3.mo23901a(r1)
            int r3 = r18.mo24073d()
            if (r3 == r1) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r1 = 0
            goto L_0x0131
        L_0x0130:
            r1 = 1
        L_0x0131:
            if (r1 == 0) goto L_0x0139
            r0.f20642G0 = r15
            r1 = 1
            r16 = 1
            goto L_0x013b
        L_0x0139:
            r1 = r26
        L_0x013b:
            if (r16 == 0) goto L_0x014c
            r0.mo23841b(r12, r1)
        L_0x0140:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x014c
            r1 = r2[r14]
            if (r1 == 0) goto L_0x0149
            r23[r14] = r15
        L_0x0149:
            int r14 = r14 + 1
            goto L_0x0140
        L_0x014c:
            r0.m27528a(r2)
            r0.f20643H0 = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C9167m.mo23838a(com.google.android.exoplayer2.trackselection.j[], boolean[], com.google.android.exoplayer2.source.f0[], boolean[], long, boolean):boolean");
    }

    /* renamed from: b */
    public boolean mo23840b(int i) {
        return this.f20644I0 || (!m27538m() && this.f20664j0[i].mo23765j());
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        List<C9164j> list;
        long max;
        if (this.f20644I0 || this.f20653Z.mo24461e() || this.f20653Z.mo24460d()) {
            return false;
        }
        if (m27538m()) {
            list = Collections.emptyList();
            max = this.f20641F0;
        } else {
            list = this.f20658d0;
            C9164j l = m27537l();
            if (l.mo23818g()) {
                max = l.f20862g;
            } else {
                max = Math.max(this.f20640E0, l.f20861f);
            }
        }
        this.f20649V.mo23796a(j, max, list, this.f20655b0);
        C9159c cVar = this.f20655b0;
        boolean z = cVar.f20585b;
        C9212d dVar = cVar.f20584a;
        Uri uri = cVar.f20586c;
        cVar.mo23812a();
        if (z) {
            this.f20641F0 = -9223372036854775807L;
            this.f20644I0 = true;
            return true;
        } else if (dVar == null) {
            if (uri != null) {
                this.f20648U.mo23820a(uri);
            }
            return false;
        } else {
            if (m27531a(dVar)) {
                this.f20641F0 = -9223372036854775807L;
                C9164j jVar = (C9164j) dVar;
                jVar.mo23817a(this);
                this.f20657c0.add(jVar);
                this.f20675u0 = jVar.f20858c;
            }
            this.f20654a0.mo23512a(dVar.f20856a, dVar.f20857b, this.f20656c, dVar.f20858c, dVar.f20859d, dVar.f20860e, dVar.f20861f, dVar.f20862g, this.f20653Z.mo24455a(dVar, this, this.f20652Y.getMinimumLoadableRetryCount(dVar.f20857b)));
            return true;
        }
    }

    /* renamed from: b */
    private static C8911f m27532b(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.m29500d("HlsSampleStreamWrapper", sb.toString());
        return new C8911f();
    }

    /* renamed from: a */
    public void mo23832a(long j, boolean z) {
        if (this.f20672r0 && !m27538m()) {
            int length = this.f20664j0.length;
            for (int i = 0; i < length; i++) {
                this.f20664j0[i].mo23755b(j, z, this.f20638C0[i]);
            }
        }
    }

    /* renamed from: a */
    public void mo23836a(boolean z) {
        this.f20649V.mo23799a(z);
    }

    /* renamed from: a */
    public boolean mo23837a(Uri uri, long j) {
        return this.f20649V.mo23800a(uri, j);
    }

    /* renamed from: a */
    public int mo23829a(int i, C8679b0 b0Var, C8879e eVar, boolean z) {
        if (m27538m()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f20657c0.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f20657c0.size() - 1 && m27530a((C9164j) this.f20657c0.get(i3))) {
                i3++;
            }
            Util.m29409a((List<T>) this.f20657c0, 0, i3);
            C9164j jVar = (C9164j) this.f20657c0.get(0);
            Format format = jVar.f20858c;
            if (!format.equals(this.f20676v0)) {
                this.f20654a0.mo23501a(this.f20656c, format, jVar.f20859d, jVar.f20860e, jVar.f20861f);
            }
            this.f20676v0 = format;
        }
        int a = this.f20664j0[i].mo23749a(b0Var, eVar, z, this.f20644I0, this.f20640E0);
        if (a == -5) {
            Format format2 = b0Var.f18427a;
            if (i == this.f20671q0) {
                int l = this.f20664j0[i].mo23767l();
                while (i2 < this.f20657c0.size() && ((C9164j) this.f20657c0.get(i2)).f20597j != l) {
                    i2++;
                }
                format2 = format2.mo22601a(i2 < this.f20657c0.size() ? ((C9164j) this.f20657c0.get(i2)).f20858c : this.f20675u0);
            }
            DrmInitData drmInitData = format2.f18353e0;
            if (drmInitData != null) {
                DrmInitData drmInitData2 = (DrmInitData) this.f20663i0.get(drmInitData.f18460V);
                if (drmInitData2 != null) {
                    format2 = format2.mo22602a(drmInitData2);
                }
            }
            b0Var.f18427a = format2;
        }
        return a;
    }

    /* renamed from: a */
    public int mo23828a(int i, long j) {
        if (m27538m()) {
            return 0;
        }
        C9137e0 e0Var = this.f20664j0[i];
        if (this.f20644I0 && j > e0Var.mo23761f()) {
            return e0Var.mo23747a();
        }
        int a = e0Var.mo23748a(j, true, true);
        if (a == -1) {
            a = 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo23559a(C9212d dVar, long j, long j2) {
        C9212d dVar2 = dVar;
        long j3 = j;
        long j4 = j2;
        this.f20649V.mo23797a(dVar2);
        this.f20654a0.mo23523b(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20656c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j3, j4, dVar.mo23934b());
        if (!this.f20673s0) {
            mo23543b(this.f20640E0);
        } else {
            this.f20648U.mo23631a(this);
        }
    }

    /* renamed from: a */
    public void mo23560a(C9212d dVar, long j, long j2, boolean z) {
        C9212d dVar2 = dVar;
        this.f20654a0.mo23514a(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20656c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j, j2, dVar.mo23934b());
        if (!z) {
            m27542q();
            if (this.f20674t0 > 0) {
                this.f20648U.mo23631a(this);
            }
        }
    }

    /* renamed from: a */
    public C9445c mo23555a(C9212d dVar, long j, long j2, IOException iOException, int i) {
        C9445c cVar;
        C9212d dVar2 = dVar;
        long b = dVar.mo23934b();
        boolean a = m27531a(dVar);
        long blacklistDurationMsFor = this.f20652Y.getBlacklistDurationMsFor(dVar2.f20857b, j2, iOException, i);
        boolean z = false;
        boolean a2 = blacklistDurationMsFor != -9223372036854775807L ? this.f20649V.mo23801a(dVar2, blacklistDurationMsFor) : false;
        if (a2) {
            if (a && b == 0) {
                ArrayList<C9164j> arrayList = this.f20657c0;
                if (((C9164j) arrayList.remove(arrayList.size() - 1)) == dVar2) {
                    z = true;
                }
                Assertions.checkState(z);
                if (this.f20657c0.isEmpty()) {
                    this.f20641F0 = this.f20640E0;
                }
            }
            cVar = Loader.f21954d;
        } else {
            long retryDelayMsFor = this.f20652Y.getRetryDelayMsFor(dVar2.f20857b, j2, iOException, i);
            cVar = retryDelayMsFor != -9223372036854775807L ? Loader.m28955a(false, retryDelayMsFor) : Loader.f21955e;
        }
        C9445c cVar2 = cVar;
        this.f20654a0.mo23515a(dVar2.f20856a, dVar.mo23937e(), dVar.mo23936d(), dVar2.f20857b, this.f20656c, dVar2.f20858c, dVar2.f20859d, dVar2.f20860e, dVar2.f20861f, dVar2.f20862g, j, j2, b, iOException, !cVar2.mo24463a());
        if (a2) {
            if (!this.f20673s0) {
                mo23543b(this.f20640E0);
            } else {
                this.f20648U.mo23631a(this);
            }
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo23831a(int i, boolean z, boolean z2) {
        if (!z2) {
            this.f20666l0 = false;
            this.f20668n0 = false;
        }
        this.f20647L0 = i;
        for (C9137e0 c : this.f20664j0) {
            c.mo23758c(i);
        }
        if (z) {
            for (C9137e0 o : this.f20664j0) {
                o.mo23770o();
            }
        }
    }

    /* renamed from: a */
    public C8924q mo23311a(int i, int i2) {
        C8924q qVar;
        C8924q qVar2;
        C8924q[] qVarArr = this.f20664j0;
        int length = qVarArr.length;
        boolean z = false;
        if (i2 == 1) {
            int i3 = this.f20667m0;
            if (i3 != -1) {
                if (this.f20666l0) {
                    if (this.f20665k0[i3] == i) {
                        qVar2 = qVarArr[i3];
                    } else {
                        qVar2 = m27532b(i, i2);
                    }
                    return qVar2;
                }
                this.f20666l0 = true;
                this.f20665k0[i3] = i;
                return qVarArr[i3];
            } else if (this.f20645J0) {
                return m27532b(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.f20669o0;
            if (i4 != -1) {
                if (this.f20668n0) {
                    if (this.f20665k0[i4] == i) {
                        qVar = qVarArr[i4];
                    } else {
                        qVar = m27532b(i, i2);
                    }
                    return qVar;
                }
                this.f20668n0 = true;
                this.f20665k0[i4] = i;
                return qVarArr[i4];
            } else if (this.f20645J0) {
                return m27532b(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f20665k0[i5] == i) {
                    return this.f20664j0[i5];
                }
            }
            if (this.f20645J0) {
                return m27532b(i, i2);
            }
        }
        C9169b bVar = new C9169b(this.f20650W);
        bVar.mo23751a(this.f20646K0);
        bVar.mo23758c(this.f20647L0);
        bVar.mo23752a((C9139b) this);
        int i6 = length + 1;
        this.f20665k0 = Arrays.copyOf(this.f20665k0, i6);
        this.f20665k0[length] = i;
        this.f20664j0 = (C9137e0[]) Arrays.copyOf(this.f20664j0, i6);
        this.f20664j0[length] = bVar;
        this.f20639D0 = Arrays.copyOf(this.f20639D0, i6);
        boolean[] zArr = this.f20639D0;
        if (i2 == 1 || i2 == 2) {
            z = true;
        }
        zArr[length] = z;
        this.f20637B0 |= this.f20639D0[length];
        if (i2 == 1) {
            this.f20666l0 = true;
            this.f20667m0 = length;
        } else if (i2 == 2) {
            this.f20668n0 = true;
            this.f20669o0 = length;
        }
        if (m27534d(i2) > m27534d(this.f20670p0)) {
            this.f20671q0 = length;
            this.f20670p0 = i2;
        }
        this.f20638C0 = Arrays.copyOf(this.f20638C0, i6);
        return bVar;
    }

    /* renamed from: a */
    public void mo23312a() {
        this.f20645J0 = true;
        this.f20661g0.post(this.f20660f0);
    }

    /* renamed from: a */
    public void mo23556a(Format format) {
        this.f20661g0.post(this.f20659e0);
    }

    /* renamed from: a */
    private void m27528a(C9141f0[] f0VarArr) {
        this.f20662h0.clear();
        for (C9166l lVar : f0VarArr) {
            if (lVar != null) {
                this.f20662h0.add(lVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m27530a(C9164j jVar) {
        int i = jVar.f20597j;
        int length = this.f20664j0.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f20638C0[i2] && this.f20664j0[i2].mo23767l() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Format m27526a(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.f18345X : -1;
        int i2 = format.f18363o0;
        if (i2 == -1) {
            i2 = format2.f18363o0;
        }
        int i3 = i2;
        String a = Util.m29396a(format.f18346Y, C9566t.m29513f(format2.f18349b0));
        String d = C9566t.m29511d(a);
        if (d == null) {
            d = format2.f18349b0;
        }
        return format2.mo22604a(format.f18350c, format.f18342U, d, a, format.f18347Z, i, format.f18355g0, format.f18356h0, i3, format.f18343V, format.f18368t0);
    }

    /* renamed from: a */
    private static boolean m27531a(C9212d dVar) {
        return dVar instanceof C9164j;
    }

    /* renamed from: a */
    private static boolean m27529a(Format format, Format format2) {
        String str = format.f18349b0;
        String str2 = format2.f18349b0;
        int f = C9566t.m29513f(str);
        boolean z = true;
        if (f != 3) {
            if (f != C9566t.m29513f(str2)) {
                z = false;
            }
            return z;
        } else if (!Util.m29414a((Object) str, (Object) str2)) {
            return false;
        } else {
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                return true;
            }
            if (format.f18369u0 != format2.f18369u0) {
                z = false;
            }
            return z;
        }
    }
}
