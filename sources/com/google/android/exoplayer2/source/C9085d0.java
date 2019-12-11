package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.source.d0 */
/* compiled from: SampleMetadataQueue */
final class C9085d0 {

    /* renamed from: a */
    private int f20259a = 1000;

    /* renamed from: b */
    private int[] f20260b;

    /* renamed from: c */
    private long[] f20261c;

    /* renamed from: d */
    private int[] f20262d;

    /* renamed from: e */
    private int[] f20263e;

    /* renamed from: f */
    private long[] f20264f;

    /* renamed from: g */
    private C8925a[] f20265g;

    /* renamed from: h */
    private Format[] f20266h;

    /* renamed from: i */
    private int f20267i;

    /* renamed from: j */
    private int f20268j;

    /* renamed from: k */
    private int f20269k;

    /* renamed from: l */
    private int f20270l;

    /* renamed from: m */
    private long f20271m;

    /* renamed from: n */
    private long f20272n;

    /* renamed from: o */
    private boolean f20273o;

    /* renamed from: p */
    private boolean f20274p;

    /* renamed from: q */
    private boolean f20275q;

    /* renamed from: r */
    private Format f20276r;

    /* renamed from: s */
    private int f20277s;

    /* renamed from: com.google.android.exoplayer2.source.d0$a */
    /* compiled from: SampleMetadataQueue */
    public static final class C9086a {

        /* renamed from: a */
        public int f20278a;

        /* renamed from: b */
        public long f20279b;

        /* renamed from: c */
        public C8925a f20280c;
    }

    public C9085d0() {
        int i = this.f20259a;
        this.f20260b = new int[i];
        this.f20261c = new long[i];
        this.f20264f = new long[i];
        this.f20263e = new int[i];
        this.f20262d = new int[i];
        this.f20265g = new C8925a[i];
        this.f20266h = new Format[i];
        this.f20271m = Long.MIN_VALUE;
        this.f20272n = Long.MIN_VALUE;
        this.f20275q = true;
        this.f20274p = true;
    }

    /* renamed from: a */
    public void mo23588a(boolean z) {
        this.f20267i = 0;
        this.f20268j = 0;
        this.f20269k = 0;
        this.f20270l = 0;
        this.f20274p = true;
        this.f20271m = Long.MIN_VALUE;
        this.f20272n = Long.MIN_VALUE;
        this.f20273o = false;
        if (z) {
            this.f20276r = null;
            this.f20275q = true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo23593b(int i) {
        if (this.f20268j > i || i > this.f20268j + this.f20267i) {
            return false;
        }
        this.f20270l = i - this.f20268j;
        return true;
    }

    /* renamed from: c */
    public void mo23595c(int i) {
        this.f20277s = i;
    }

    /* renamed from: d */
    public int mo23596d() {
        return this.f20268j;
    }

    /* renamed from: e */
    public synchronized long mo23597e() {
        return this.f20267i == 0 ? Long.MIN_VALUE : this.f20264f[this.f20269k];
    }

    /* renamed from: f */
    public synchronized long mo23598f() {
        return this.f20272n;
    }

    /* renamed from: g */
    public int mo23599g() {
        return this.f20268j + this.f20270l;
    }

    /* renamed from: h */
    public synchronized Format mo23600h() {
        return this.f20275q ? null : this.f20276r;
    }

    /* renamed from: i */
    public int mo23601i() {
        return this.f20268j + this.f20267i;
    }

    /* renamed from: j */
    public synchronized boolean mo23602j() {
        return this.f20270l != this.f20267i;
    }

    /* renamed from: k */
    public synchronized boolean mo23603k() {
        return this.f20273o;
    }

    /* renamed from: l */
    public int mo23604l() {
        return mo23602j() ? this.f20260b[m27057f(this.f20270l)] : this.f20277s;
    }

    /* renamed from: m */
    public synchronized void mo23605m() {
        this.f20270l = 0;
    }

    /* renamed from: d */
    private long m27055d(int i) {
        this.f20271m = Math.max(this.f20271m, m27056e(i));
        this.f20267i -= i;
        this.f20268j += i;
        this.f20269k += i;
        int i2 = this.f20269k;
        int i3 = this.f20259a;
        if (i2 >= i3) {
            this.f20269k = i2 - i3;
        }
        this.f20270l -= i;
        if (this.f20270l < 0) {
            this.f20270l = 0;
        }
        if (this.f20267i != 0) {
            return this.f20261c[this.f20269k];
        }
        int i4 = this.f20269k;
        if (i4 == 0) {
            i4 = this.f20259a;
        }
        int i5 = i4 - 1;
        return this.f20261c[i5] + ((long) this.f20262d[i5]);
    }

    /* renamed from: e */
    private long m27056e(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f = m27057f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f20264f[f]);
            if ((this.f20263e[f] & 1) != 0) {
                break;
            }
            f--;
            if (f == -1) {
                f = this.f20259a - 1;
            }
        }
        return j;
    }

    /* renamed from: f */
    private int m27057f(int i) {
        int i2 = this.f20269k + i;
        int i3 = this.f20259a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: c */
    public synchronized long mo23594c() {
        if (this.f20270l == 0) {
            return -1;
        }
        return m27055d(this.f20270l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo23592b(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f20267i     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.f20264f     // Catch:{ all -> 0x0038 }
            int r3 = r9.f20269k     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.f20270l     // Catch:{ all -> 0x0038 }
            int r0 = r9.f20267i     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.f20270l     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.f20267i     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.f20269k     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.m27054a(r4, r5, r6, r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.m27055d(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9085d0.mo23592b(long, boolean, boolean):long");
    }

    /* renamed from: a */
    public long mo23586a(int i) {
        int i2 = mo23601i() - i;
        boolean z = false;
        C9537e.m29299a(i2 >= 0 && i2 <= this.f20267i - this.f20270l);
        this.f20267i -= i2;
        this.f20272n = Math.max(this.f20271m, m27056e(this.f20267i));
        if (i2 == 0 && this.f20273o) {
            z = true;
        }
        this.f20273o = z;
        int i3 = this.f20267i;
        if (i3 == 0) {
            return 0;
        }
        int f = m27057f(i3 - 1);
        return this.f20261c[f] + ((long) this.f20262d[f]);
    }

    /* renamed from: b */
    public synchronized long mo23591b() {
        if (this.f20267i == 0) {
            return -1;
        }
        return m27055d(this.f20267i);
    }

    /* renamed from: a */
    public synchronized int mo23585a(C8679b0 b0Var, C8879e eVar, boolean z, boolean z2, Format format, C9086a aVar) {
        if (!mo23602j()) {
            if (!z2) {
                if (!this.f20273o) {
                    if (this.f20276r == null || (!z && this.f20276r == format)) {
                        return -3;
                    }
                    b0Var.f18427a = this.f20276r;
                    return -5;
                }
            }
            eVar.mo23213e(4);
            return -4;
        }
        int f = m27057f(this.f20270l);
        if (!z) {
            if (this.f20266h[f] == format) {
                eVar.mo23213e(this.f20263e[f]);
                eVar.f19024W = this.f20264f[f];
                if (eVar.mo23226h()) {
                    return -4;
                }
                aVar.f20278a = this.f20262d[f];
                aVar.f20279b = this.f20261c[f];
                aVar.f20280c = this.f20265g[f];
                this.f20270l++;
                return -4;
            }
        }
        b0Var.f18427a = this.f20266h[f];
        return -5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo23584a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f20270l     // Catch:{ all -> 0x0039 }
            int r2 = r8.m27057f(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.mo23602j()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.f20264f     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.f20272n     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.f20267i     // Catch:{ all -> 0x0039 }
            int r0 = r8.f20270l     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.m27054a(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.f20270l     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.f20270l = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9085d0.mo23584a(long, boolean, boolean):int");
    }

    /* renamed from: a */
    public synchronized int mo23583a() {
        int i;
        i = this.f20267i - this.f20270l;
        this.f20270l = this.f20267i;
        return i;
    }

    /* renamed from: a */
    public synchronized boolean mo23590a(Format format) {
        if (format == null) {
            this.f20275q = true;
            return false;
        }
        this.f20275q = false;
        if (C9554k0.m29414a((Object) format, (Object) this.f20276r)) {
            return false;
        }
        this.f20276r = format;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo23587a(long r6, int r8, long r9, int r11, com.google.android.exoplayer2.p366s0.C8924q.C8925a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f20274p     // Catch:{ all -> 0x00e1 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f20274p = r1     // Catch:{ all -> 0x00e1 }
        L_0x000e:
            boolean r0 = r5.f20275q     // Catch:{ all -> 0x00e1 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.exoplayer2.p393v0.C9537e.m29301b(r0)     // Catch:{ all -> 0x00e1 }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r5.f20273o = r0     // Catch:{ all -> 0x00e1 }
            long r3 = r5.f20272n     // Catch:{ all -> 0x00e1 }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00e1 }
            r5.f20272n = r3     // Catch:{ all -> 0x00e1 }
            int r0 = r5.f20267i     // Catch:{ all -> 0x00e1 }
            int r0 = r5.m27057f(r0)     // Catch:{ all -> 0x00e1 }
            long[] r3 = r5.f20264f     // Catch:{ all -> 0x00e1 }
            r3[r0] = r6     // Catch:{ all -> 0x00e1 }
            long[] r6 = r5.f20261c     // Catch:{ all -> 0x00e1 }
            r6[r0] = r9     // Catch:{ all -> 0x00e1 }
            int[] r6 = r5.f20262d     // Catch:{ all -> 0x00e1 }
            r6[r0] = r11     // Catch:{ all -> 0x00e1 }
            int[] r6 = r5.f20263e     // Catch:{ all -> 0x00e1 }
            r6[r0] = r8     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.s0.q$a[] r6 = r5.f20265g     // Catch:{ all -> 0x00e1 }
            r6[r0] = r12     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.Format[] r6 = r5.f20266h     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.Format r7 = r5.f20276r     // Catch:{ all -> 0x00e1 }
            r6[r0] = r7     // Catch:{ all -> 0x00e1 }
            int[] r6 = r5.f20260b     // Catch:{ all -> 0x00e1 }
            int r7 = r5.f20277s     // Catch:{ all -> 0x00e1 }
            r6[r0] = r7     // Catch:{ all -> 0x00e1 }
            int r6 = r5.f20267i     // Catch:{ all -> 0x00e1 }
            int r6 = r6 + r2
            r5.f20267i = r6     // Catch:{ all -> 0x00e1 }
            int r6 = r5.f20267i     // Catch:{ all -> 0x00e1 }
            int r7 = r5.f20259a     // Catch:{ all -> 0x00e1 }
            if (r6 != r7) goto L_0x00df
            int r6 = r5.f20259a     // Catch:{ all -> 0x00e1 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e1 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e1 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e1 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e1 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.s0.q$a[] r12 = new com.google.android.exoplayer2.p366s0.C8924q.C8925a[r6]     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r6]     // Catch:{ all -> 0x00e1 }
            int r2 = r5.f20259a     // Catch:{ all -> 0x00e1 }
            int r3 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            int r2 = r2 - r3
            long[] r3 = r5.f20261c     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e1 }
            long[] r3 = r5.f20264f     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e1 }
            int[] r3 = r5.f20263e     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e1 }
            int[] r3 = r5.f20262d     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.s0.q$a[] r3 = r5.f20265g     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.Format[] r3 = r5.f20266h     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e1 }
            int[] r3 = r5.f20260b     // Catch:{ all -> 0x00e1 }
            int r4 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e1 }
            int r3 = r5.f20269k     // Catch:{ all -> 0x00e1 }
            long[] r4 = r5.f20261c     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e1 }
            long[] r4 = r5.f20264f     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e1 }
            int[] r4 = r5.f20263e     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e1 }
            int[] r4 = r5.f20262d     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.s0.q$a[] r4 = r5.f20265g     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e1 }
            com.google.android.exoplayer2.Format[] r4 = r5.f20266h     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e1 }
            int[] r4 = r5.f20260b     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e1 }
            r5.f20261c = r8     // Catch:{ all -> 0x00e1 }
            r5.f20264f = r9     // Catch:{ all -> 0x00e1 }
            r5.f20263e = r10     // Catch:{ all -> 0x00e1 }
            r5.f20262d = r11     // Catch:{ all -> 0x00e1 }
            r5.f20265g = r12     // Catch:{ all -> 0x00e1 }
            r5.f20266h = r0     // Catch:{ all -> 0x00e1 }
            r5.f20260b = r7     // Catch:{ all -> 0x00e1 }
            r5.f20269k = r1     // Catch:{ all -> 0x00e1 }
            int r7 = r5.f20259a     // Catch:{ all -> 0x00e1 }
            r5.f20267i = r7     // Catch:{ all -> 0x00e1 }
            r5.f20259a = r6     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r5)
            return
        L_0x00e1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9085d0.mo23587a(long, int, long, int, com.google.android.exoplayer2.s0.q$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo23589a(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f20267i     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.f20271m     // Catch:{ all -> 0x004a }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.f20271m     // Catch:{ all -> 0x004a }
            int r0 = r7.f20270l     // Catch:{ all -> 0x004a }
            long r5 = r7.m27056e(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.f20267i     // Catch:{ all -> 0x004a }
            int r1 = r7.f20267i     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            int r1 = r7.m27057f(r1)     // Catch:{ all -> 0x004a }
        L_0x002b:
            int r3 = r7.f20270l     // Catch:{ all -> 0x004a }
            if (r0 <= r3) goto L_0x0042
            long[] r3 = r7.f20264f     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0042
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002b
            int r1 = r7.f20259a     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            goto L_0x002b
        L_0x0042:
            int r8 = r7.f20268j     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.mo23586a(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9085d0.mo23589a(long):boolean");
    }

    /* renamed from: a */
    private int m27054a(int i, int i2, long j, boolean z) {
        int i3 = i;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && this.f20264f[i3] <= j; i5++) {
            if (!z || (this.f20263e[i3] & 1) != 0) {
                i4 = i5;
            }
            i3++;
            if (i3 == this.f20259a) {
                i3 = 0;
            }
        }
        return i4;
    }
}
