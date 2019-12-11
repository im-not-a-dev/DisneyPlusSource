package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.w */
/* compiled from: PesReader */
public final class C9055w implements C9029h0 {

    /* renamed from: a */
    private final C9042o f20090a;

    /* renamed from: b */
    private final C9571v f20091b = new C9571v(new byte[10]);

    /* renamed from: c */
    private int f20092c = 0;

    /* renamed from: d */
    private int f20093d;

    /* renamed from: e */
    private C9545h0 f20094e;

    /* renamed from: f */
    private boolean f20095f;

    /* renamed from: g */
    private boolean f20096g;

    /* renamed from: h */
    private boolean f20097h;

    /* renamed from: i */
    private int f20098i;

    /* renamed from: j */
    private int f20099j;

    /* renamed from: k */
    private boolean f20100k;

    /* renamed from: l */
    private long f20101l;

    public C9055w(C9042o oVar) {
        this.f20090a = oVar;
    }

    /* renamed from: b */
    private boolean m26860b() {
        this.f20091b.mo24667b(0);
        int a = this.f20091b.mo24660a(24);
        if (a != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(a);
            C9563q.m29500d("PesReader", sb.toString());
            this.f20099j = -1;
            return false;
        }
        this.f20091b.mo24670c(8);
        int a2 = this.f20091b.mo24660a(16);
        this.f20091b.mo24670c(5);
        this.f20100k = this.f20091b.mo24673e();
        this.f20091b.mo24670c(2);
        this.f20095f = this.f20091b.mo24673e();
        this.f20096g = this.f20091b.mo24673e();
        this.f20091b.mo24670c(6);
        this.f20098i = this.f20091b.mo24660a(8);
        if (a2 == 0) {
            this.f20099j = -1;
        } else {
            this.f20099j = ((a2 + 6) - 9) - this.f20098i;
        }
        return true;
    }

    /* renamed from: c */
    private void m26861c() {
        this.f20091b.mo24667b(0);
        this.f20101l = -9223372036854775807L;
        if (this.f20095f) {
            this.f20091b.mo24670c(4);
            long a = ((long) this.f20091b.mo24660a(3)) << 30;
            this.f20091b.mo24670c(1);
            long a2 = a | ((long) (this.f20091b.mo24660a(15) << 15));
            this.f20091b.mo24670c(1);
            long a3 = a2 | ((long) this.f20091b.mo24660a(15));
            this.f20091b.mo24670c(1);
            if (!this.f20097h && this.f20096g) {
                this.f20091b.mo24670c(4);
                long a4 = ((long) this.f20091b.mo24660a(3)) << 30;
                this.f20091b.mo24670c(1);
                long a5 = a4 | ((long) (this.f20091b.mo24660a(15) << 15));
                this.f20091b.mo24670c(1);
                long a6 = a5 | ((long) this.f20091b.mo24660a(15));
                this.f20091b.mo24670c(1);
                this.f20094e.mo24632b(a6);
                this.f20097h = true;
            }
            this.f20101l = this.f20094e.mo24632b(a3);
        }
    }

    /* renamed from: a */
    public void mo23426a(C9545h0 h0Var, C8914i iVar, C9033d dVar) {
        this.f20094e = h0Var;
        this.f20090a.mo23436a(iVar, dVar);
    }

    /* renamed from: a */
    public final void mo23425a() {
        this.f20092c = 0;
        this.f20093d = 0;
        this.f20097h = false;
        this.f20090a.mo23434a();
    }

    /* renamed from: a */
    public final void mo23427a(C9572w wVar, int i) throws C8723g0 {
        if ((i & 1) != 0) {
            int i2 = this.f20092c;
            if (!(i2 == 0 || i2 == 1)) {
                String str = "PesReader";
                if (i2 == 2) {
                    C9563q.m29500d(str, "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f20099j != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(this.f20099j);
                        sb.append(" more bytes");
                        C9563q.m29500d(str, sb.toString());
                    }
                    this.f20090a.mo23438b();
                } else {
                    throw new IllegalStateException();
                }
            }
            m26858a(1);
        }
        while (wVar.mo24679a() > 0) {
            int i3 = this.f20092c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m26859a(wVar, this.f20091b.f22329a, Math.min(10, this.f20098i)) && m26859a(wVar, (byte[]) null, this.f20098i)) {
                            m26861c();
                            if (this.f20100k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f20090a.mo23435a(this.f20101l, i);
                            m26858a(3);
                        }
                    } else if (i3 == 3) {
                        int a = wVar.mo24679a();
                        int i5 = this.f20099j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            wVar.mo24691d(wVar.mo24688c() + a);
                        }
                        this.f20090a.mo23437a(wVar);
                        int i6 = this.f20099j;
                        if (i6 != -1) {
                            this.f20099j = i6 - a;
                            if (this.f20099j == 0) {
                                this.f20090a.mo23438b();
                                m26858a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m26859a(wVar, this.f20091b.f22329a, 9)) {
                    if (m26860b()) {
                        i4 = 2;
                    }
                    m26858a(i4);
                }
            } else {
                wVar.mo24695f(wVar.mo24679a());
            }
        }
    }

    /* renamed from: a */
    private void m26858a(int i) {
        this.f20092c = i;
        this.f20093d = 0;
    }

    /* renamed from: a */
    private boolean m26859a(C9572w wVar, byte[] bArr, int i) {
        int min = Math.min(wVar.mo24679a(), i - this.f20093d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.mo24695f(min);
        } else {
            wVar.mo24685a(bArr, this.f20093d, min);
        }
        this.f20093d += min;
        if (this.f20093d != i) {
            z = false;
        }
        return z;
    }
}
