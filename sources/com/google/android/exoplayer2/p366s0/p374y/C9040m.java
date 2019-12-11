package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p361p0.C8865v;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.m */
/* compiled from: DtsReader */
public final class C9040m implements C9042o {

    /* renamed from: a */
    private final C9572w f19932a = new C9572w(new byte[18]);

    /* renamed from: b */
    private final String f19933b;

    /* renamed from: c */
    private String f19934c;

    /* renamed from: d */
    private C8924q f19935d;

    /* renamed from: e */
    private int f19936e = 0;

    /* renamed from: f */
    private int f19937f;

    /* renamed from: g */
    private int f19938g;

    /* renamed from: h */
    private long f19939h;

    /* renamed from: i */
    private Format f19940i;

    /* renamed from: j */
    private int f19941j;

    /* renamed from: k */
    private long f19942k;

    public C9040m(String str) {
        this.f19933b = str;
    }

    /* renamed from: b */
    private boolean m26762b(C9572w wVar) {
        while (wVar.mo24679a() > 0) {
            this.f19938g <<= 8;
            this.f19938g |= wVar.mo24711v();
            if (C8865v.m25815a(this.f19938g)) {
                byte[] bArr = this.f19932a.f22333a;
                int i = this.f19938g;
                bArr[0] = (byte) ((i >> 24) & 255);
                bArr[1] = (byte) ((i >> 16) & 255);
                bArr[2] = (byte) ((i >> 8) & 255);
                bArr[3] = (byte) (i & 255);
                this.f19937f = 4;
                this.f19938g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m26763c() {
        byte[] bArr = this.f19932a.f22333a;
        if (this.f19940i == null) {
            this.f19940i = C8865v.m25814a(bArr, this.f19934c, this.f19933b, null);
            this.f19935d.mo23304a(this.f19940i);
        }
        this.f19941j = C8865v.m25813a(bArr);
        this.f19939h = (long) ((int) ((((long) C8865v.m25818d(bArr)) * 1000000) / ((long) this.f19940i.f18364p0)));
    }

    /* renamed from: a */
    public void mo23434a() {
        this.f19936e = 0;
        this.f19937f = 0;
        this.f19938g = 0;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f19934c = dVar.mo23442b();
        this.f19935d = iVar.mo23311a(dVar.mo23443c(), 1);
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f19942k = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        while (wVar.mo24679a() > 0) {
            int i = this.f19936e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(wVar.mo24679a(), this.f19941j - this.f19937f);
                        this.f19935d.mo23305a(wVar, min);
                        this.f19937f += min;
                        int i2 = this.f19937f;
                        int i3 = this.f19941j;
                        if (i2 == i3) {
                            this.f19935d.mo23303a(this.f19942k, 1, i3, 0, null);
                            this.f19942k += this.f19939h;
                            this.f19936e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m26761a(wVar, this.f19932a.f22333a, 18)) {
                    m26763c();
                    this.f19932a.mo24693e(0);
                    this.f19935d.mo23305a(this.f19932a, 18);
                    this.f19936e = 2;
                }
            } else if (m26762b(wVar)) {
                this.f19936e = 1;
            }
        }
    }

    /* renamed from: a */
    private boolean m26761a(C9572w wVar, byte[] bArr, int i) {
        int min = Math.min(wVar.mo24679a(), i - this.f19937f);
        wVar.mo24685a(bArr, this.f19937f, min);
        this.f19937f += min;
        return this.f19937f == i;
    }
}
