package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p361p0.C8825g;
import com.google.android.exoplayer2.p361p0.C8825g.C8827b;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.g */
/* compiled from: Ac3Reader */
public final class C9024g implements C9042o {

    /* renamed from: a */
    private final C9571v f19822a;

    /* renamed from: b */
    private final C9572w f19823b;

    /* renamed from: c */
    private final String f19824c;

    /* renamed from: d */
    private String f19825d;

    /* renamed from: e */
    private C8924q f19826e;

    /* renamed from: f */
    private int f19827f;

    /* renamed from: g */
    private int f19828g;

    /* renamed from: h */
    private boolean f19829h;

    /* renamed from: i */
    private long f19830i;

    /* renamed from: j */
    private Format f19831j;

    /* renamed from: k */
    private int f19832k;

    /* renamed from: l */
    private long f19833l;

    public C9024g() {
        this(null);
    }

    /* renamed from: b */
    private boolean m26652b(C9572w wVar) {
        while (true) {
            boolean z = false;
            if (wVar.mo24679a() <= 0) {
                return false;
            }
            if (!this.f19829h) {
                if (wVar.mo24711v() == 11) {
                    z = true;
                }
                this.f19829h = z;
            } else {
                int v = wVar.mo24711v();
                if (v == 119) {
                    this.f19829h = false;
                    return true;
                }
                if (v == 11) {
                    z = true;
                }
                this.f19829h = z;
            }
        }
    }

    /* renamed from: c */
    private void m26653c() {
        this.f19822a.mo24667b(0);
        C8827b a = C8825g.m25601a(this.f19822a);
        Format format = this.f19831j;
        if (!(format != null && a.f18817c == format.f18363o0 && a.f18816b == format.f18364p0 && a.f18815a == format.f18349b0)) {
            this.f19831j = Format.m24875a(this.f19825d, a.f18815a, (String) null, -1, -1, a.f18817c, a.f18816b, null, (DrmInitData) null, 0, this.f19824c);
            this.f19826e.mo23304a(this.f19831j);
        }
        this.f19832k = a.f18818d;
        this.f19830i = (((long) a.f18819e) * 1000000) / ((long) this.f19831j.f18364p0);
    }

    /* renamed from: a */
    public void mo23434a() {
        this.f19827f = 0;
        this.f19828g = 0;
        this.f19829h = false;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    public C9024g(String str) {
        this.f19822a = new C9571v(new byte[128]);
        this.f19823b = new C9572w(this.f19822a.f22329a);
        this.f19827f = 0;
        this.f19824c = str;
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f19825d = dVar.mo23442b();
        this.f19826e = iVar.mo23311a(dVar.mo23443c(), 1);
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f19833l = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        while (wVar.mo24679a() > 0) {
            int i = this.f19827f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(wVar.mo24679a(), this.f19832k - this.f19828g);
                        this.f19826e.mo23305a(wVar, min);
                        this.f19828g += min;
                        int i2 = this.f19828g;
                        int i3 = this.f19832k;
                        if (i2 == i3) {
                            this.f19826e.mo23303a(this.f19833l, 1, i3, 0, null);
                            this.f19833l += this.f19830i;
                            this.f19827f = 0;
                        }
                    }
                } else if (m26651a(wVar, this.f19823b.f22333a, 128)) {
                    m26653c();
                    this.f19823b.mo24693e(0);
                    this.f19826e.mo23305a(this.f19823b, 128);
                    this.f19827f = 2;
                }
            } else if (m26652b(wVar)) {
                this.f19827f = 1;
                byte[] bArr = this.f19823b.f22333a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f19828g = 2;
            }
        }
    }

    /* renamed from: a */
    private boolean m26651a(C9572w wVar, byte[] bArr, int i) {
        int min = Math.min(wVar.mo24679a(), i - this.f19828g);
        wVar.mo24685a(bArr, this.f19828g, min);
        this.f19828g += min;
        return this.f19828g == i;
    }
}
