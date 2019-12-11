package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9566t;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.q */
/* compiled from: ClippingMediaPeriod */
public final class C9231q implements C9072a0, C9073a {

    /* renamed from: U */
    private C9073a f20933U;

    /* renamed from: V */
    private C9232a[] f20934V = new C9232a[0];

    /* renamed from: W */
    private long f20935W;

    /* renamed from: X */
    long f20936X;

    /* renamed from: Y */
    long f20937Y;

    /* renamed from: c */
    public final C9072a0 f20938c;

    /* renamed from: com.google.android.exoplayer2.source.q$a */
    /* compiled from: ClippingMediaPeriod */
    private final class C9232a implements C9141f0 {

        /* renamed from: U */
        private boolean f20939U;

        /* renamed from: c */
        public final C9141f0 f20941c;

        public C9232a(C9141f0 f0Var) {
            this.f20941c = f0Var;
        }

        /* renamed from: a */
        public void mo23574a() throws IOException {
            this.f20941c.mo23574a();
        }

        /* renamed from: b */
        public boolean mo23575b() {
            return !C9231q.this.mo23962a() && this.f20941c.mo23575b();
        }

        /* renamed from: c */
        public void mo23964c() {
            this.f20939U = false;
        }

        /* renamed from: d */
        public int mo23576d(long j) {
            if (C9231q.this.mo23962a()) {
                return -3;
            }
            return this.f20941c.mo23576d(j);
        }

        /* renamed from: a */
        public int mo23573a(C8679b0 b0Var, C8879e eVar, boolean z) {
            if (C9231q.this.mo23962a()) {
                return -3;
            }
            if (this.f20939U) {
                eVar.mo23213e(4);
                return -4;
            }
            int a = this.f20941c.mo23573a(b0Var, eVar, z);
            if (a == -5) {
                Format format = b0Var.f18427a;
                if (!(format.f18366r0 == 0 && format.f18367s0 == 0)) {
                    int i = 0;
                    int i2 = C9231q.this.f20936X != 0 ? 0 : format.f18366r0;
                    if (C9231q.this.f20937Y == Long.MIN_VALUE) {
                        i = format.f18367s0;
                    }
                    b0Var.f18427a = format.mo22600a(i2, i);
                }
                return -5;
            }
            long j = C9231q.this.f20937Y;
            if (j == Long.MIN_VALUE || ((a != -4 || eVar.f19024W < j) && (a != -3 || C9231q.this.mo23549g() != Long.MIN_VALUE))) {
                return a;
            }
            eVar.mo23207b();
            eVar.mo23213e(4);
            this.f20939U = true;
            return -4;
        }
    }

    public C9231q(C9072a0 a0Var, boolean z, long j, long j2) {
        this.f20938c = a0Var;
        this.f20935W = z ? j : -9223372036854775807L;
        this.f20936X = j;
        this.f20937Y = j2;
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        return this.f20938c.mo23543b(j);
    }

    /* renamed from: c */
    public void mo23545c(long j) {
        this.f20938c.mo23545c(j);
    }

    /* renamed from: d */
    public void mo23546d() throws IOException {
        this.f20938c.mo23546d();
    }

    /* renamed from: e */
    public long mo23547e() {
        if (mo23962a()) {
            long j = this.f20935W;
            this.f20935W = -9223372036854775807L;
            long e = mo23547e();
            if (e != -9223372036854775807L) {
                j = e;
            }
            return j;
        }
        long e2 = this.f20938c.mo23547e();
        if (e2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        Assertions.checkState(e2 >= this.f20936X);
        long j2 = this.f20937Y;
        if (j2 != Long.MIN_VALUE && e2 > j2) {
            z = false;
        }
        Assertions.checkState(z);
        return e2;
    }

    /* renamed from: f */
    public TrackGroupArray mo23548f() {
        return this.f20938c.mo23548f();
    }

    /* renamed from: g */
    public long mo23549g() {
        long g = this.f20938c.mo23549g();
        if (g != Long.MIN_VALUE) {
            long j = this.f20937Y;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: a */
    public void mo23542a(C9073a aVar, long j) {
        this.f20933U = aVar;
        this.f20938c.mo23542a((C9073a) this, j);
    }

    /* renamed from: b */
    public void mo23631a(C9072a0 a0Var) {
        this.f20933U.mo23631a(this);
    }

    /* renamed from: c */
    public long mo23544c() {
        long c = this.f20938c.mo23544c();
        if (c != Long.MIN_VALUE) {
            long j = this.f20937Y;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    private SeekParameters m27846b(long j, SeekParameters seekParameters) {
        long b = Util.m29431b(seekParameters.f18391a, 0, j - this.f20936X);
        long j2 = seekParameters.f18392b;
        long j3 = this.f20937Y;
        long b2 = Util.m29431b(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (b == seekParameters.f18391a && b2 == seekParameters.f18392b) {
            return seekParameters;
        }
        return new SeekParameters(b, b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo23540a(com.google.android.exoplayer2.trackselection.TrackSelection[] r13, boolean[] r14, com.google.android.exoplayer2.source.C9141f0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.q$a[] r2 = new com.google.android.exoplayer2.source.C9231q.C9232a[r2]
            r0.f20934V = r2
            int r2 = r1.length
            com.google.android.exoplayer2.source.f0[] r9 = new com.google.android.exoplayer2.source.C9141f0[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            com.google.android.exoplayer2.source.q$a[] r3 = r0.f20934V
            r4 = r1[r2]
            com.google.android.exoplayer2.source.q$a r4 = (com.google.android.exoplayer2.source.C9231q.C9232a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            com.google.android.exoplayer2.source.f0 r11 = r3.f20941c
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            com.google.android.exoplayer2.source.a0 r2 = r0.f20938c
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo23540a(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo23962a()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f20936X
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = m27845a(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f20935W = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f20936X
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f20937Y
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0099
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            com.google.android.exoplayer2.source.q$a[] r4 = r0.f20934V
            r4[r10] = r11
            goto L_0x0090
        L_0x0077:
            r4 = r1[r10]
            if (r4 == 0) goto L_0x0085
            com.google.android.exoplayer2.source.q$a[] r4 = r0.f20934V
            r4 = r4[r10]
            com.google.android.exoplayer2.source.f0 r4 = r4.f20941c
            r5 = r9[r10]
            if (r4 == r5) goto L_0x0090
        L_0x0085:
            com.google.android.exoplayer2.source.q$a[] r4 = r0.f20934V
            com.google.android.exoplayer2.source.q$a r5 = new com.google.android.exoplayer2.source.q$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x0090:
            com.google.android.exoplayer2.source.q$a[] r4 = r0.f20934V
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9231q.mo23540a(com.google.android.exoplayer2.trackselection.j[], boolean[], com.google.android.exoplayer2.source.f0[], boolean[], long):long");
    }

    /* renamed from: a */
    public void mo23541a(long j, boolean z) {
        this.f20938c.mo23541a(j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo23538a(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f20935W = r0
            com.google.android.exoplayer2.source.q$a[] r0 = r6.f20934V
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo23964c()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.exoplayer2.source.a0 r0 = r6.f20938c
            long r0 = r0.mo23538a(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f20936X
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f20937Y
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C9231q.mo23538a(long):long");
    }

    /* renamed from: a */
    public long mo23539a(long j, SeekParameters seekParameters) {
        long j2 = this.f20936X;
        if (j == j2) {
            return j2;
        }
        return this.f20938c.mo23539a(j, m27846b(j, seekParameters));
    }

    /* renamed from: a */
    public void mo23550a(C9072a0 a0Var) {
        this.f20933U.mo23550a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23962a() {
        return this.f20935W != -9223372036854775807L;
    }

    /* renamed from: a */
    private static boolean m27845a(long j, TrackSelection[] jVarArr) {
        if (j != 0) {
            for (TrackSelection jVar : jVarArr) {
                if (jVar != null && !C9566t.m29517j(jVar.mo24076f().f18349b0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
