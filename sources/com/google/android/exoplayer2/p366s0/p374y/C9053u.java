package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8918m;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.u */
/* compiled from: MpegAudioReader */
public final class C9053u implements C9042o {

    /* renamed from: a */
    private final C9572w f20073a;

    /* renamed from: b */
    private final C8918m f20074b;

    /* renamed from: c */
    private final String f20075c;

    /* renamed from: d */
    private String f20076d;

    /* renamed from: e */
    private C8924q f20077e;

    /* renamed from: f */
    private int f20078f;

    /* renamed from: g */
    private int f20079g;

    /* renamed from: h */
    private boolean f20080h;

    /* renamed from: i */
    private boolean f20081i;

    /* renamed from: j */
    private long f20082j;

    /* renamed from: k */
    private int f20083k;

    /* renamed from: l */
    private long f20084l;

    public C9053u() {
        this(null);
    }

    /* renamed from: b */
    private void m26845b(C9572w wVar) {
        byte[] bArr = wVar.f22333a;
        int d = wVar.mo24690d();
        for (int c = wVar.mo24688c(); c < d; c++) {
            boolean z = (bArr[c] & 255) == 255;
            boolean z2 = this.f20081i && (bArr[c] & 224) == 224;
            this.f20081i = z;
            if (z2) {
                wVar.mo24693e(c + 1);
                this.f20081i = false;
                this.f20073a.f22333a[1] = bArr[c];
                this.f20079g = 2;
                this.f20078f = 1;
                return;
            }
        }
        wVar.mo24693e(d);
    }

    /* renamed from: c */
    private void m26846c(C9572w wVar) {
        int min = Math.min(wVar.mo24679a(), this.f20083k - this.f20079g);
        this.f20077e.mo23305a(wVar, min);
        this.f20079g += min;
        int i = this.f20079g;
        int i2 = this.f20083k;
        if (i >= i2) {
            this.f20077e.mo23303a(this.f20084l, 1, i2, 0, null);
            this.f20084l += this.f20082j;
            this.f20079g = 0;
            this.f20078f = 0;
        }
    }

    /* renamed from: d */
    private void m26847d(C9572w wVar) {
        int min = Math.min(wVar.mo24679a(), 4 - this.f20079g);
        wVar.mo24685a(this.f20073a.f22333a, this.f20079g, min);
        this.f20079g += min;
        if (this.f20079g >= 4) {
            this.f20073a.mo24693e(0);
            if (!C8918m.m26173a(this.f20073a.mo24698i(), this.f20074b)) {
                this.f20079g = 0;
                this.f20078f = 1;
                return;
            }
            C8918m mVar = this.f20074b;
            this.f20083k = mVar.f19158c;
            if (!this.f20080h) {
                long j = ((long) mVar.f19162g) * 1000000;
                int i = mVar.f19159d;
                this.f20082j = j / ((long) i);
                this.f20077e.mo23304a(Format.m24875a(this.f20076d, mVar.f19157b, (String) null, -1, 4096, mVar.f19160e, i, null, (DrmInitData) null, 0, this.f20075c));
                this.f20080h = true;
            }
            this.f20073a.mo24693e(0);
            this.f20077e.mo23305a(this.f20073a, 4);
            this.f20078f = 2;
        }
    }

    /* renamed from: a */
    public void mo23434a() {
        this.f20078f = 0;
        this.f20079g = 0;
        this.f20081i = false;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    public C9053u(String str) {
        this.f20078f = 0;
        this.f20073a = new C9572w(4);
        this.f20073a.f22333a[0] = -1;
        this.f20074b = new C8918m();
        this.f20075c = str;
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f20076d = dVar.mo23442b();
        this.f20077e = iVar.mo23311a(dVar.mo23443c(), 1);
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f20084l = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        while (wVar.mo24679a() > 0) {
            int i = this.f20078f;
            if (i == 0) {
                m26845b(wVar);
            } else if (i == 1) {
                m26847d(wVar);
            } else if (i == 2) {
                m26846c(wVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
