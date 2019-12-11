package com.google.android.exoplayer2.p366s0.p374y;

import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9544h;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.s0.y.t */
/* compiled from: LatmReader */
public final class C9052t implements C9042o {

    /* renamed from: a */
    private final String f20053a;

    /* renamed from: b */
    private final C9572w f20054b = new C9572w(1024);

    /* renamed from: c */
    private final C9571v f20055c = new C9571v(this.f20054b.f22333a);

    /* renamed from: d */
    private C8924q f20056d;

    /* renamed from: e */
    private Format f20057e;

    /* renamed from: f */
    private String f20058f;

    /* renamed from: g */
    private int f20059g;

    /* renamed from: h */
    private int f20060h;

    /* renamed from: i */
    private int f20061i;

    /* renamed from: j */
    private int f20062j;

    /* renamed from: k */
    private long f20063k;

    /* renamed from: l */
    private boolean f20064l;

    /* renamed from: m */
    private int f20065m;

    /* renamed from: n */
    private int f20066n;

    /* renamed from: o */
    private int f20067o;

    /* renamed from: p */
    private boolean f20068p;

    /* renamed from: q */
    private long f20069q;

    /* renamed from: r */
    private int f20070r;

    /* renamed from: s */
    private long f20071s;

    /* renamed from: t */
    private int f20072t;

    public C9052t(String str) {
        this.f20053a = str;
    }

    /* renamed from: b */
    private void m26835b(C9571v vVar) throws C8723g0 {
        if (!vVar.mo24673e()) {
            this.f20064l = true;
            m26839f(vVar);
        } else if (!this.f20064l) {
            return;
        }
        if (this.f20065m != 0) {
            throw new C8723g0();
        } else if (this.f20066n == 0) {
            m26834a(vVar, m26838e(vVar));
            if (this.f20068p) {
                vVar.mo24670c((int) this.f20069q);
            }
        } else {
            throw new C8723g0();
        }
    }

    /* renamed from: c */
    private int m26836c(C9571v vVar) throws C8723g0 {
        int a = vVar.mo24659a();
        Pair a2 = C9544h.m29333a(vVar, true);
        this.f20070r = ((Integer) a2.first).intValue();
        this.f20072t = ((Integer) a2.second).intValue();
        return a - vVar.mo24659a();
    }

    /* renamed from: d */
    private void m26837d(C9571v vVar) {
        this.f20067o = vVar.mo24660a(3);
        int i = this.f20067o;
        if (i == 0) {
            vVar.mo24670c(8);
        } else if (i == 1) {
            vVar.mo24670c(9);
        } else if (i == 3 || i == 4 || i == 5) {
            vVar.mo24670c(6);
        } else if (i == 6 || i == 7) {
            vVar.mo24670c(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    private int m26838e(C9571v vVar) throws C8723g0 {
        int a;
        if (this.f20067o == 0) {
            int i = 0;
            do {
                a = vVar.mo24660a(8);
                i += a;
            } while (a == 255);
            return i;
        }
        throw new C8723g0();
    }

    /* renamed from: f */
    private void m26839f(C9571v vVar) throws C8723g0 {
        boolean e;
        C9571v vVar2 = vVar;
        int a = vVar2.mo24660a(1);
        this.f20065m = a == 1 ? vVar2.mo24660a(1) : 0;
        if (this.f20065m == 0) {
            if (a == 1) {
                m26832a(vVar);
            }
            if (vVar.mo24673e()) {
                this.f20066n = vVar2.mo24660a(6);
                int a2 = vVar2.mo24660a(4);
                int a3 = vVar2.mo24660a(3);
                if (a2 == 0 && a3 == 0) {
                    if (a == 0) {
                        int d = vVar.mo24671d();
                        int c = m26836c(vVar);
                        vVar2.mo24667b(d);
                        byte[] bArr = new byte[((c + 7) / 8)];
                        vVar2.mo24665a(bArr, 0, c);
                        Format a4 = Format.m24875a(this.f20058f, "audio/mp4a-latm", (String) null, -1, -1, this.f20072t, this.f20070r, Collections.singletonList(bArr), (DrmInitData) null, 0, this.f20053a);
                        if (!a4.equals(this.f20057e)) {
                            this.f20057e = a4;
                            this.f20071s = 1024000000 / ((long) a4.f18364p0);
                            this.f20056d.mo23304a(a4);
                        }
                    } else {
                        vVar2.mo24670c(((int) m26832a(vVar)) - m26836c(vVar));
                    }
                    m26837d(vVar);
                    this.f20068p = vVar.mo24673e();
                    this.f20069q = 0;
                    if (this.f20068p) {
                        if (a == 1) {
                            this.f20069q = m26832a(vVar);
                        } else {
                            do {
                                e = vVar.mo24673e();
                                this.f20069q = (this.f20069q << 8) + ((long) vVar2.mo24660a(8));
                            } while (e);
                        }
                    }
                    if (vVar.mo24673e()) {
                        vVar2.mo24670c(8);
                        return;
                    }
                    return;
                }
                throw new C8723g0();
            }
            throw new C8723g0();
        }
        throw new C8723g0();
    }

    /* renamed from: a */
    public void mo23434a() {
        this.f20059g = 0;
        this.f20064l = false;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f20056d = iVar.mo23311a(dVar.mo23443c(), 1);
        this.f20058f = dVar.mo23442b();
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f20063k = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) throws C8723g0 {
        while (wVar.mo24679a() > 0) {
            int i = this.f20059g;
            if (i != 0) {
                if (i == 1) {
                    int v = wVar.mo24711v();
                    if ((v & 224) == 224) {
                        this.f20062j = v;
                        this.f20059g = 2;
                    } else if (v != 86) {
                        this.f20059g = 0;
                    }
                } else if (i == 2) {
                    this.f20061i = ((this.f20062j & -225) << 8) | wVar.mo24711v();
                    int i2 = this.f20061i;
                    if (i2 > this.f20054b.f22333a.length) {
                        m26833a(i2);
                    }
                    this.f20060h = 0;
                    this.f20059g = 3;
                } else if (i == 3) {
                    int min = Math.min(wVar.mo24679a(), this.f20061i - this.f20060h);
                    wVar.mo24685a(this.f20055c.f22329a, this.f20060h, min);
                    this.f20060h += min;
                    if (this.f20060h == this.f20061i) {
                        this.f20055c.mo24667b(0);
                        m26835b(this.f20055c);
                        this.f20059g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (wVar.mo24711v() == 86) {
                this.f20059g = 1;
            }
        }
    }

    /* renamed from: a */
    private void m26834a(C9571v vVar, int i) {
        int d = vVar.mo24671d();
        if ((d & 7) == 0) {
            this.f20054b.mo24693e(d >> 3);
        } else {
            vVar.mo24665a(this.f20054b.f22333a, 0, i * 8);
            this.f20054b.mo24693e(0);
        }
        this.f20056d.mo23305a(this.f20054b, i);
        this.f20056d.mo23303a(this.f20063k, 1, i, 0, null);
        this.f20063k += this.f20071s;
    }

    /* renamed from: a */
    private void m26833a(int i) {
        this.f20054b.mo24689c(i);
        this.f20055c.mo24663a(this.f20054b.f22333a);
    }

    /* renamed from: a */
    private static long m26832a(C9571v vVar) {
        return (long) vVar.mo24660a((vVar.mo24660a(2) + 1) * 8);
    }
}
