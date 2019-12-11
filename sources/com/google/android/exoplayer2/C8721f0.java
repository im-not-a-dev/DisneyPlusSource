package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;

/* renamed from: com.google.android.exoplayer2.f0 */
/* compiled from: MediaPeriodQueue */
final class C8721f0 {

    /* renamed from: a */
    private final C8669b f18518a = new C8669b();

    /* renamed from: b */
    private final C8670c f18519b = new C8670c();

    /* renamed from: c */
    private long f18520c;

    /* renamed from: d */
    private Timeline f18521d = Timeline.f18393a;

    /* renamed from: e */
    private int f18522e;

    /* renamed from: f */
    private boolean f18523f;

    /* renamed from: g */
    private C8683d0 f18524g;

    /* renamed from: h */
    private C8683d0 f18525h;

    /* renamed from: i */
    private C8683d0 f18526i;

    /* renamed from: j */
    private int f18527j;

    /* renamed from: k */
    private Object f18528k;

    /* renamed from: l */
    private long f18529l;

    /* renamed from: b */
    private boolean m25278b(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: i */
    private boolean m25279i() {
        C8683d0 c = mo22822c();
        boolean z = true;
        if (c == null) {
            return true;
        }
        int a = this.f18521d.mo22656a(c.f18431b);
        while (true) {
            a = this.f18521d.mo22655a(a, this.f18518a, this.f18519b, this.f18522e, this.f18523f);
            while (c.mo22724b() != null && !c.f18435f.f18515f) {
                c = c.mo22724b();
            }
            C8683d0 b = c.mo22724b();
            if (a == -1 || b == null || this.f18521d.mo22656a(b.f18431b) != a) {
                boolean a2 = mo22818a(c);
                c.f18435f = mo22810a(c.f18435f);
            } else {
                c = b;
            }
        }
        boolean a22 = mo22818a(c);
        c.f18435f = mo22810a(c.f18435f);
        if (a22 && mo22826g()) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo22814a(Timeline timeline) {
        this.f18521d = timeline;
    }

    /* renamed from: b */
    public boolean mo22821b(boolean z) {
        this.f18523f = z;
        return m25279i();
    }

    /* renamed from: c */
    public C8683d0 mo22822c() {
        return mo22826g() ? this.f18524g : this.f18526i;
    }

    /* renamed from: d */
    public C8683d0 mo22823d() {
        return this.f18526i;
    }

    /* renamed from: e */
    public C8683d0 mo22824e() {
        return this.f18524g;
    }

    /* renamed from: f */
    public C8683d0 mo22825f() {
        return this.f18525h;
    }

    /* renamed from: g */
    public boolean mo22826g() {
        return this.f18524g != null;
    }

    /* renamed from: h */
    public boolean mo22827h() {
        C8683d0 d0Var = this.f18526i;
        return d0Var == null || (!d0Var.f18435f.f18516g && d0Var.mo22735h() && this.f18526i.f18435f.f18514e != -9223372036854775807L && this.f18527j < 100);
    }

    /* renamed from: a */
    public boolean mo22816a(int i) {
        this.f18522e = i;
        return m25279i();
    }

    /* renamed from: b */
    public C8683d0 mo22820b() {
        C8683d0 d0Var = this.f18525h;
        Assertions.checkState((d0Var == null || d0Var.mo22724b() == null) ? false : true);
        this.f18525h = this.f18525h.mo22724b();
        return this.f18525h;
    }

    /* renamed from: a */
    public boolean mo22819a(C9072a0 a0Var) {
        C8683d0 d0Var = this.f18526i;
        return d0Var != null && d0Var.f18430a == a0Var;
    }

    /* renamed from: a */
    public void mo22813a(long j) {
        C8683d0 d0Var = this.f18526i;
        if (d0Var != null) {
            d0Var.mo22726b(j);
        }
    }

    /* renamed from: b */
    private MediaPeriodId m25277b(Object obj, long j, long j2) {
        this.f18521d.mo22662a(obj, this.f18518a);
        int b = this.f18518a.mo22679b(j);
        if (b == -1) {
            return new MediaPeriodId(obj, j2, this.f18518a.mo22674a(j));
        }
        MediaPeriodId mediaPeriodId = new MediaPeriodId(obj, b, this.f18518a.mo22682c(b), j2);
        return mediaPeriodId;
    }

    /* renamed from: a */
    public C8719e0 mo22809a(long j, C8725h0 h0Var) {
        C8683d0 d0Var = this.f18526i;
        if (d0Var == null) {
            return m25270a(h0Var);
        }
        return m25269a(d0Var, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 != -9223372036854775807L) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.C9072a0 mo22812a(com.google.android.exoplayer2.C8735m0[] r11, com.google.android.exoplayer2.trackselection.TrackSelector r12, com.google.android.exoplayer2.upstream.C9491f r13, com.google.android.exoplayer2.source.MediaSource r14, com.google.android.exoplayer2.C8719e0 r15) {
        /*
            r10 = this;
            com.google.android.exoplayer2.d0 r0 = r10.f18526i
            if (r0 != 0) goto L_0x001b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r15.f18510a
            boolean r0 = r0.mo23494a()
            if (r0 == 0) goto L_0x0018
            long r0 = r15.f18512c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0018
            goto L_0x0029
        L_0x0018:
            r0 = 0
            goto L_0x0029
        L_0x001b:
            long r0 = r0.mo22729d()
            com.google.android.exoplayer2.d0 r2 = r10.f18526i
            com.google.android.exoplayer2.e0 r2 = r2.f18435f
            long r2 = r2.f18514e
            long r0 = r0 + r2
            long r2 = r15.f18511b
            long r0 = r0 - r2
        L_0x0029:
            r4 = r0
            com.google.android.exoplayer2.d0 r0 = new com.google.android.exoplayer2.d0
            r2 = r0
            r3 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r2.<init>(r3, r4, r6, r7, r8, r9)
            com.google.android.exoplayer2.d0 r11 = r10.f18526i
            if (r11 == 0) goto L_0x0045
            boolean r11 = r10.mo22826g()
            com.google.android.exoplayer2.util.Assertions.checkState(r11)
            com.google.android.exoplayer2.d0 r11 = r10.f18526i
            r11.mo22723a(r0)
        L_0x0045:
            r11 = 0
            r10.f18528k = r11
            r10.f18526i = r0
            int r11 = r10.f18527j
            int r11 = r11 + 1
            r10.f18527j = r11
            com.google.android.exoplayer2.source.a0 r11 = r0.f18430a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C8721f0.mo22812a(com.google.android.exoplayer2.m0[], com.google.android.exoplayer2.trackselection.TrackSelector, com.google.android.exoplayer2.upstream.f, com.google.android.exoplayer2.source.MediaSource, com.google.android.exoplayer2.e0):com.google.android.exoplayer2.source.a0");
    }

    /* renamed from: a */
    public C8683d0 mo22808a() {
        C8683d0 d0Var = this.f18524g;
        if (d0Var != null) {
            if (d0Var == this.f18525h) {
                this.f18525h = d0Var.mo22724b();
            }
            this.f18524g.mo22736i();
            this.f18527j--;
            if (this.f18527j == 0) {
                this.f18526i = null;
                C8683d0 d0Var2 = this.f18524g;
                this.f18528k = d0Var2.f18431b;
                this.f18529l = d0Var2.f18435f.f18510a.f20150d;
            }
            this.f18524g = this.f18524g.mo22724b();
        } else {
            C8683d0 d0Var3 = this.f18526i;
            this.f18524g = d0Var3;
            this.f18525h = d0Var3;
        }
        return this.f18524g;
    }

    /* renamed from: a */
    public boolean mo22818a(C8683d0 d0Var) {
        boolean z = false;
        Assertions.checkState(d0Var != null);
        this.f18526i = d0Var;
        while (d0Var.mo22724b() != null) {
            d0Var = d0Var.mo22724b();
            if (d0Var == this.f18525h) {
                this.f18525h = this.f18524g;
                z = true;
            }
            d0Var.mo22736i();
            this.f18527j--;
        }
        this.f18526i.mo22723a((C8683d0) null);
        return z;
    }

    /* renamed from: a */
    public void mo22815a(boolean z) {
        C8683d0 c = mo22822c();
        if (c != null) {
            this.f18528k = z ? c.f18431b : null;
            this.f18529l = c.f18435f.f18510a.f20150d;
            c.mo22736i();
            mo22818a(c);
        } else if (!z) {
            this.f18528k = null;
        }
        this.f18524g = null;
        this.f18526i = null;
        this.f18525h = null;
        this.f18527j = 0;
    }

    /* renamed from: a */
    public boolean mo22817a(long j, long j2) {
        C8719e0 e0Var;
        long j3;
        C8683d0 c = mo22822c();
        C8683d0 d0Var = null;
        while (true) {
            C8683d0 d0Var2 = d0Var;
            d0Var = c;
            C8683d0 d0Var3 = d0Var2;
            boolean z = true;
            if (d0Var == null) {
                return true;
            }
            C8719e0 e0Var2 = d0Var.f18435f;
            if (d0Var3 == null) {
                e0Var = mo22810a(e0Var2);
            } else {
                C8719e0 a = m25269a(d0Var3, j);
                if (a == null) {
                    return !mo22818a(d0Var3);
                }
                if (!m25274a(e0Var2, a)) {
                    return !mo22818a(d0Var3);
                }
                e0Var = a;
            }
            d0Var.f18435f = e0Var.mo22804a(e0Var2.f18512c);
            if (!m25278b(e0Var2.f18514e, e0Var.f18514e)) {
                long j4 = e0Var.f18514e;
                if (j4 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = d0Var.mo22732e(j4);
                }
                boolean z2 = d0Var == this.f18525h && (j2 == Long.MIN_VALUE || j2 >= j3);
                if (mo22818a(d0Var) || z2) {
                    z = false;
                }
                return z;
            }
            c = d0Var.mo22724b();
        }
    }

    /* renamed from: a */
    public C8719e0 mo22810a(C8719e0 e0Var) {
        long j;
        MediaPeriodId mediaPeriodId = e0Var.f18510a;
        boolean a = m25275a(mediaPeriodId);
        boolean a2 = m25276a(mediaPeriodId, a);
        this.f18521d.mo22662a(e0Var.f18510a.f20147a, this.f18518a);
        if (mediaPeriodId.mo23494a()) {
            j = this.f18518a.mo22675a(mediaPeriodId.f20148b, mediaPeriodId.f20149c);
        } else {
            j = e0Var.f18513d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f18518a.mo22685d();
            }
        }
        C8719e0 e0Var2 = new C8719e0(mediaPeriodId, e0Var.f18511b, e0Var.f18512c, e0Var.f18513d, j, a, a2);
        return e0Var2;
    }

    /* renamed from: a */
    public MediaPeriodId mo22811a(Object obj, long j) {
        return m25277b(obj, j, m25268a(obj));
    }

    /* renamed from: a */
    private long m25268a(Object obj) {
        int i = this.f18521d.mo22662a(obj, this.f18518a).f18395b;
        Object obj2 = this.f18528k;
        if (obj2 != null) {
            int a = this.f18521d.mo22656a(obj2);
            if (a != -1 && this.f18521d.mo22660a(a, this.f18518a).f18395b == i) {
                return this.f18529l;
            }
        }
        for (C8683d0 c = mo22822c(); c != null; c = c.mo22724b()) {
            if (c.f18431b.equals(obj)) {
                return c.f18435f.f18510a.f20150d;
            }
        }
        for (C8683d0 c2 = mo22822c(); c2 != null; c2 = c2.mo22724b()) {
            int a2 = this.f18521d.mo22656a(c2.f18431b);
            if (a2 != -1 && this.f18521d.mo22660a(a2, this.f18518a).f18395b == i) {
                return c2.f18435f.f18510a.f20150d;
            }
        }
        long j = this.f18520c;
        this.f18520c = 1 + j;
        return j;
    }

    /* renamed from: a */
    private boolean m25274a(C8719e0 e0Var, C8719e0 e0Var2) {
        return e0Var.f18511b == e0Var2.f18511b && e0Var.f18510a.equals(e0Var2.f18510a);
    }

    /* renamed from: a */
    private C8719e0 m25270a(C8725h0 h0Var) {
        return m25271a(h0Var.f18535c, h0Var.f18537e, h0Var.f18536d);
    }

    /* renamed from: a */
    private C8719e0 m25269a(C8683d0 d0Var, long j) {
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        C8719e0 e0Var = d0Var.f18435f;
        long d = (d0Var.mo22729d() + e0Var.f18514e) - j;
        long j6 = 0;
        C8719e0 e0Var2 = null;
        if (e0Var.f18515f) {
            int a = this.f18521d.mo22656a(e0Var.f18510a.f20147a);
            int a2 = this.f18521d.mo22655a(a, this.f18518a, this.f18519b, this.f18522e, this.f18523f);
            if (a2 == -1) {
                return null;
            }
            int i = this.f18521d.mo22661a(a2, this.f18518a, true).f18395b;
            Object obj2 = this.f18518a.f18394a;
            long j7 = e0Var.f18510a.f20150d;
            if (this.f18521d.mo22663a(i, this.f18519b).f18401c == a2) {
                Pair a3 = this.f18521d.mo22659a(this.f18519b, this.f18518a, i, -9223372036854775807L, Math.max(0, d));
                if (a3 == null) {
                    return null;
                }
                Object obj3 = a3.first;
                long longValue = ((Long) a3.second).longValue();
                C8683d0 b = d0Var.mo22724b();
                if (b == null || !b.f18431b.equals(obj3)) {
                    j5 = this.f18520c;
                    this.f18520c = 1 + j5;
                } else {
                    j5 = b.f18435f.f18510a.f20150d;
                }
                j6 = longValue;
                j3 = -9223372036854775807L;
                j4 = j5;
                obj = obj3;
            } else {
                obj = obj2;
                j4 = j7;
                j3 = 0;
            }
            return m25271a(m25277b(obj, j6, j4), j3, j6);
        }
        MediaPeriodId mediaPeriodId = e0Var.f18510a;
        this.f18521d.mo22662a(mediaPeriodId.f20147a, this.f18518a);
        if (mediaPeriodId.mo23494a()) {
            int i2 = mediaPeriodId.f20148b;
            int a4 = this.f18518a.mo22673a(i2);
            if (a4 == -1) {
                return null;
            }
            int b2 = this.f18518a.mo22678b(i2, mediaPeriodId.f20149c);
            if (b2 < a4) {
                if (this.f18518a.mo22684c(i2, b2)) {
                    e0Var2 = m25272a(mediaPeriodId.f20147a, i2, b2, e0Var.f18512c, mediaPeriodId.f20150d);
                }
                return e0Var2;
            }
            long j8 = e0Var.f18512c;
            if (j8 == -9223372036854775807L) {
                Timeline timeline = this.f18521d;
                C8670c cVar = this.f18519b;
                C8669b bVar = this.f18518a;
                Pair a5 = timeline.mo22659a(cVar, bVar, bVar.f18395b, -9223372036854775807L, Math.max(0, d));
                if (a5 == null) {
                    return null;
                }
                j2 = ((Long) a5.second).longValue();
            } else {
                j2 = j8;
            }
            return m25273a(mediaPeriodId.f20147a, j2, mediaPeriodId.f20150d);
        }
        int b3 = this.f18518a.mo22679b(e0Var.f18513d);
        if (b3 == -1) {
            return m25273a(mediaPeriodId.f20147a, e0Var.f18514e, mediaPeriodId.f20150d);
        }
        int c = this.f18518a.mo22682c(b3);
        if (this.f18518a.mo22684c(b3, c)) {
            e0Var2 = m25272a(mediaPeriodId.f20147a, b3, c, e0Var.f18514e, mediaPeriodId.f20150d);
        }
        return e0Var2;
    }

    /* renamed from: a */
    private C8719e0 m25271a(MediaPeriodId mediaPeriodId, long j, long j2) {
        this.f18521d.mo22662a(mediaPeriodId.f20147a, this.f18518a);
        if (!mediaPeriodId.mo23494a()) {
            return m25273a(mediaPeriodId.f20147a, j2, mediaPeriodId.f20150d);
        } else if (!this.f18518a.mo22684c(mediaPeriodId.f20148b, mediaPeriodId.f20149c)) {
            return null;
        } else {
            return m25272a(mediaPeriodId.f20147a, mediaPeriodId.f20148b, mediaPeriodId.f20149c, j, mediaPeriodId.f20150d);
        }
    }

    /* renamed from: a */
    private C8719e0 m25272a(Object obj, int i, int i2, long j, long j2) {
        MediaPeriodId mediaPeriodId = new MediaPeriodId(obj, i, i2, j2);
        C8719e0 e0Var = new C8719e0(mediaPeriodId, i2 == this.f18518a.mo22682c(i) ? this.f18518a.mo22680b() : 0, j, -9223372036854775807L, this.f18521d.mo22662a(mediaPeriodId.f20147a, this.f18518a).mo22675a(mediaPeriodId.f20148b, mediaPeriodId.f20149c), false, false);
        return e0Var;
    }

    /* renamed from: a */
    private C8719e0 m25273a(Object obj, long j, long j2) {
        long j3;
        int a = this.f18518a.mo22674a(j);
        Object obj2 = obj;
        MediaPeriodId mediaPeriodId = new MediaPeriodId(obj, j2, a);
        boolean a2 = m25275a(mediaPeriodId);
        boolean a3 = m25276a(mediaPeriodId, a2);
        long b = a != -1 ? this.f18518a.mo22681b(a) : -9223372036854775807L;
        if (b == -9223372036854775807L || b == Long.MIN_VALUE) {
            j3 = this.f18518a.f18396c;
        } else {
            j3 = b;
        }
        C8719e0 e0Var = new C8719e0(mediaPeriodId, j, -9223372036854775807L, b, j3, a2, a3);
        return e0Var;
    }

    /* renamed from: a */
    private boolean m25275a(MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.mo23494a() && mediaPeriodId.f20151e == -1;
    }

    /* renamed from: a */
    private boolean m25276a(MediaPeriodId mediaPeriodId, boolean z) {
        int a = this.f18521d.mo22656a(mediaPeriodId.f20147a);
        return !this.f18521d.mo22663a(this.f18521d.mo22660a(a, this.f18518a).f18395b, this.f18519b).f18400b && this.f18521d.mo22670b(a, this.f18518a, this.f18519b, this.f18522e, this.f18523f) && z;
    }
}
