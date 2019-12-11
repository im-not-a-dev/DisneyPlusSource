package com.google.android.exoplayer2.p366s0.p374y;

import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8911f;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9544h;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.Arrays;
import java.util.Collections;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.y.k */
/* compiled from: AdtsReader */
public final class C9038k implements C9042o {

    /* renamed from: v */
    private static final byte[] f19908v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f19909a;

    /* renamed from: b */
    private final C9571v f19910b;

    /* renamed from: c */
    private final C9572w f19911c;

    /* renamed from: d */
    private final String f19912d;

    /* renamed from: e */
    private String f19913e;

    /* renamed from: f */
    private C8924q f19914f;

    /* renamed from: g */
    private C8924q f19915g;

    /* renamed from: h */
    private int f19916h;

    /* renamed from: i */
    private int f19917i;

    /* renamed from: j */
    private int f19918j;

    /* renamed from: k */
    private boolean f19919k;

    /* renamed from: l */
    private boolean f19920l;

    /* renamed from: m */
    private int f19921m;

    /* renamed from: n */
    private int f19922n;

    /* renamed from: o */
    private int f19923o;

    /* renamed from: p */
    private boolean f19924p;

    /* renamed from: q */
    private long f19925q;

    /* renamed from: r */
    private int f19926r;

    /* renamed from: s */
    private long f19927s;

    /* renamed from: t */
    private C8924q f19928t;

    /* renamed from: u */
    private long f19929u;

    public C9038k(boolean z) {
        this(z, null);
    }

    /* renamed from: a */
    public static boolean m26735a(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: b */
    private void m26738b(C9572w wVar) {
        if (wVar.mo24679a() != 0) {
            this.f19910b.f22329a[0] = wVar.f22333a[wVar.mo24688c()];
            this.f19910b.mo24667b(2);
            int a = this.f19910b.mo24660a(4);
            int i = this.f19922n;
            if (i == -1 || a == i) {
                if (!this.f19920l) {
                    this.f19920l = true;
                    this.f19921m = this.f19923o;
                    this.f19922n = a;
                }
                m26747i();
                return;
            }
            m26744f();
        }
    }

    /* renamed from: d */
    private void m26741d() throws C8723g0 {
        this.f19910b.mo24667b(0);
        if (!this.f19924p) {
            int a = this.f19910b.mo24660a(2) + 1;
            if (a != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(a);
                sb.append(", but assuming AAC LC.");
                C9563q.m29500d("AdtsReader", sb.toString());
                a = 2;
            }
            this.f19910b.mo24670c(5);
            byte[] a2 = C9544h.m29337a(a, this.f19922n, this.f19910b.mo24660a(3));
            Pair a3 = C9544h.m29334a(a2);
            Format a4 = Format.m24875a(this.f19913e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), Collections.singletonList(a2), (DrmInitData) null, 0, this.f19912d);
            this.f19925q = 1024000000 / ((long) a4.f18364p0);
            this.f19914f.mo23304a(a4);
            this.f19924p = true;
        } else {
            this.f19910b.mo24670c(10);
        }
        this.f19910b.mo24670c(4);
        int a5 = (this.f19910b.mo24660a(13) - 2) - 5;
        if (this.f19919k) {
            a5 -= 2;
        }
        int i = a5;
        m26733a(this.f19914f, this.f19925q, 0, i);
    }

    /* renamed from: e */
    private void m26743e() {
        this.f19915g.mo23305a(this.f19911c, 10);
        this.f19911c.mo24693e(6);
        m26733a(this.f19915g, 0, 10, this.f19911c.mo24710u() + 10);
    }

    /* renamed from: f */
    private void m26744f() {
        this.f19920l = false;
        m26746h();
    }

    /* renamed from: g */
    private void m26745g() {
        this.f19916h = 1;
        this.f19917i = 0;
    }

    /* renamed from: h */
    private void m26746h() {
        this.f19916h = 0;
        this.f19917i = 0;
        this.f19918j = 256;
    }

    /* renamed from: i */
    private void m26747i() {
        this.f19916h = 3;
        this.f19917i = 0;
    }

    /* renamed from: j */
    private void m26748j() {
        this.f19916h = 2;
        this.f19917i = f19908v.length;
        this.f19926r = 0;
        this.f19911c.mo24693e(0);
    }

    /* renamed from: a */
    public void mo23434a() {
        m26744f();
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    /* renamed from: c */
    public long mo23446c() {
        return this.f19925q;
    }

    public C9038k(boolean z, String str) {
        this.f19910b = new C9571v(new byte[7]);
        this.f19911c = new C9572w(Arrays.copyOf(f19908v, 10));
        m26746h();
        this.f19921m = -1;
        this.f19922n = -1;
        this.f19925q = -9223372036854775807L;
        this.f19909a = z;
        this.f19912d = str;
    }

    /* renamed from: c */
    private void m26740c(C9572w wVar) {
        byte[] bArr = wVar.f22333a;
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        while (c < d) {
            int i = c + 1;
            byte b = bArr[c] & 255;
            if (this.f19918j != 512 || !m26734a(-1, (byte) b) || (!this.f19920l && !m26736a(wVar, i - 2))) {
                int i2 = this.f19918j;
                byte b2 = b | i2;
                if (b2 == 329) {
                    this.f19918j = 768;
                } else if (b2 == 511) {
                    this.f19918j = DateUtils.FORMAT_NO_NOON;
                } else if (b2 == 836) {
                    this.f19918j = 1024;
                } else if (b2 == 1075) {
                    m26748j();
                    wVar.mo24693e(i);
                    return;
                } else if (i2 != 256) {
                    this.f19918j = 256;
                    i--;
                }
                c = i;
            } else {
                this.f19923o = (b & 8) >> 3;
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f19919k = z;
                if (!this.f19920l) {
                    m26745g();
                } else {
                    m26747i();
                }
                wVar.mo24693e(i);
                return;
            }
        }
        wVar.mo24693e(c);
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f19913e = dVar.mo23442b();
        this.f19914f = iVar.mo23311a(dVar.mo23443c(), 1);
        if (this.f19909a) {
            dVar.mo23441a();
            this.f19915g = iVar.mo23311a(dVar.mo23443c(), 4);
            this.f19915g.mo23304a(Format.m24879a(dVar.mo23442b(), "application/id3", (String) null, -1, (DrmInitData) null));
            return;
        }
        this.f19915g = new C8911f();
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f19927s = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) throws C8723g0 {
        while (wVar.mo24679a() > 0) {
            int i = this.f19916h;
            if (i == 0) {
                m26740c(wVar);
            } else if (i == 1) {
                m26738b(wVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (m26737a(wVar, this.f19910b.f22329a, this.f19919k ? 7 : 5)) {
                        m26741d();
                    }
                } else if (i == 4) {
                    m26742d(wVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m26737a(wVar, this.f19911c.f22333a, 10)) {
                m26743e();
            }
        }
    }

    /* renamed from: b */
    private boolean m26739b(C9572w wVar, byte[] bArr, int i) {
        if (wVar.mo24679a() < i) {
            return false;
        }
        wVar.mo24685a(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    private boolean m26737a(C9572w wVar, byte[] bArr, int i) {
        int min = Math.min(wVar.mo24679a(), i - this.f19917i);
        wVar.mo24685a(bArr, this.f19917i, min);
        this.f19917i += min;
        return this.f19917i == i;
    }

    /* renamed from: d */
    private void m26742d(C9572w wVar) {
        int min = Math.min(wVar.mo24679a(), this.f19926r - this.f19917i);
        this.f19928t.mo23305a(wVar, min);
        this.f19917i += min;
        int i = this.f19917i;
        int i2 = this.f19926r;
        if (i == i2) {
            this.f19928t.mo23303a(this.f19927s, 1, i2, 0, null);
            this.f19927s += this.f19929u;
            m26746h();
        }
    }

    /* renamed from: a */
    private void m26733a(C8924q qVar, long j, int i, int i2) {
        this.f19916h = 4;
        this.f19917i = i;
        this.f19928t = qVar;
        this.f19929u = j;
        this.f19926r = i2;
    }

    /* renamed from: a */
    private boolean m26736a(C9572w wVar, int i) {
        wVar.mo24693e(i + 1);
        boolean z = true;
        if (!m26739b(wVar, this.f19910b.f22329a, 1)) {
            return false;
        }
        this.f19910b.mo24667b(4);
        int a = this.f19910b.mo24660a(1);
        int i2 = this.f19921m;
        if (i2 != -1 && a != i2) {
            return false;
        }
        if (this.f19922n != -1) {
            if (!m26739b(wVar, this.f19910b.f22329a, 1)) {
                return true;
            }
            this.f19910b.mo24667b(2);
            if (this.f19910b.mo24660a(4) != this.f19922n) {
                return false;
            }
            wVar.mo24693e(i + 2);
        }
        if (!m26739b(wVar, this.f19910b.f22329a, 4)) {
            return true;
        }
        this.f19910b.mo24667b(14);
        int a2 = this.f19910b.mo24660a(13);
        if (a2 <= 6) {
            return false;
        }
        int i3 = i + a2;
        int i4 = i3 + 1;
        if (i4 >= wVar.mo24690d()) {
            return true;
        }
        byte[] bArr = wVar.f22333a;
        if (!m26734a(bArr[i3], bArr[i4]) || !(this.f19921m == -1 || ((wVar.f22333a[i4] & 8) >> 3) == a)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m26734a(byte b, byte b2) {
        return m26735a((int) ((b & 255) << 8) | (b2 & 255));
    }
}
