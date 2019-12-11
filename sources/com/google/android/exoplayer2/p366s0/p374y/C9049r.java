package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9568u;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.p393v0.C9573x;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.s0.y.r */
/* compiled from: H265Reader */
public final class C9049r implements C9042o {

    /* renamed from: a */
    private final C9016c0 f20020a;

    /* renamed from: b */
    private String f20021b;

    /* renamed from: c */
    private C8924q f20022c;

    /* renamed from: d */
    private C9050a f20023d;

    /* renamed from: e */
    private boolean f20024e;

    /* renamed from: f */
    private final boolean[] f20025f = new boolean[3];

    /* renamed from: g */
    private final C9054v f20026g = new C9054v(32, 128);

    /* renamed from: h */
    private final C9054v f20027h = new C9054v(33, 128);

    /* renamed from: i */
    private final C9054v f20028i = new C9054v(34, 128);

    /* renamed from: j */
    private final C9054v f20029j = new C9054v(39, 128);

    /* renamed from: k */
    private final C9054v f20030k = new C9054v(40, 128);

    /* renamed from: l */
    private long f20031l;

    /* renamed from: m */
    private long f20032m;

    /* renamed from: n */
    private final C9572w f20033n = new C9572w();

    /* renamed from: com.google.android.exoplayer2.s0.y.r$a */
    /* compiled from: H265Reader */
    private static final class C9050a {

        /* renamed from: a */
        private final C8924q f20034a;

        /* renamed from: b */
        private long f20035b;

        /* renamed from: c */
        private boolean f20036c;

        /* renamed from: d */
        private int f20037d;

        /* renamed from: e */
        private long f20038e;

        /* renamed from: f */
        private boolean f20039f;

        /* renamed from: g */
        private boolean f20040g;

        /* renamed from: h */
        private boolean f20041h;

        /* renamed from: i */
        private boolean f20042i;

        /* renamed from: j */
        private boolean f20043j;

        /* renamed from: k */
        private long f20044k;

        /* renamed from: l */
        private long f20045l;

        /* renamed from: m */
        private boolean f20046m;

        public C9050a(C8924q qVar) {
            this.f20034a = qVar;
        }

        /* renamed from: a */
        public void mo23461a() {
            this.f20039f = false;
            this.f20040g = false;
            this.f20041h = false;
            this.f20042i = false;
            this.f20043j = false;
        }

        /* renamed from: a */
        public void mo23463a(long j, int i, int i2, long j2) {
            this.f20040g = false;
            this.f20041h = false;
            this.f20038e = j2;
            this.f20037d = 0;
            this.f20035b = j;
            boolean z = true;
            if (i2 >= 32) {
                if (!this.f20043j && this.f20042i) {
                    m26822a(i);
                    this.f20042i = false;
                }
                if (i2 <= 34) {
                    this.f20041h = !this.f20043j;
                    this.f20043j = true;
                }
            }
            this.f20036c = i2 >= 16 && i2 <= 21;
            if (!this.f20036c && i2 > 9) {
                z = false;
            }
            this.f20039f = z;
        }

        /* renamed from: a */
        public void mo23464a(byte[] bArr, int i, int i2) {
            if (this.f20039f) {
                int i3 = i + 2;
                int i4 = this.f20037d;
                int i5 = i3 - i4;
                if (i5 < i2) {
                    this.f20040g = (bArr[i5] & 128) != 0;
                    this.f20039f = false;
                    return;
                }
                this.f20037d = i4 + (i2 - i);
            }
        }

        /* renamed from: a */
        public void mo23462a(long j, int i) {
            if (this.f20043j && this.f20040g) {
                this.f20046m = this.f20036c;
                this.f20043j = false;
            } else if (this.f20041h || this.f20040g) {
                if (this.f20042i) {
                    m26822a(i + ((int) (j - this.f20035b)));
                }
                this.f20044k = this.f20035b;
                this.f20045l = this.f20038e;
                this.f20042i = true;
                this.f20046m = this.f20036c;
            }
        }

        /* renamed from: a */
        private void m26822a(int i) {
            int i2 = (int) (this.f20035b - this.f20044k);
            int i3 = i;
            this.f20034a.mo23303a(this.f20045l, this.f20046m ? 1 : 0, i2, i3, null);
        }
    }

    public C9049r(C9016c0 c0Var) {
        this.f20020a = c0Var;
    }

    /* renamed from: b */
    private void m26815b(long j, int i, int i2, long j2) {
        if (this.f20024e) {
            this.f20023d.mo23463a(j, i, i2, j2);
        } else {
            this.f20026g.mo23469b(i2);
            this.f20027h.mo23469b(i2);
            this.f20028i.mo23469b(i2);
        }
        this.f20029j.mo23469b(i2);
        this.f20030k.mo23469b(i2);
    }

    /* renamed from: a */
    public void mo23434a() {
        C9568u.m29525a(this.f20025f);
        this.f20026g.mo23468b();
        this.f20027h.mo23468b();
        this.f20028i.mo23468b();
        this.f20029j.mo23468b();
        this.f20030k.mo23468b();
        this.f20023d.mo23461a();
        this.f20031l = 0;
    }

    /* renamed from: b */
    public void mo23438b() {
    }

    /* renamed from: b */
    private static void m26816b(C9573x xVar) {
        int d = xVar.mo24723d();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            if (i2 != 0) {
                z = xVar.mo24720b();
            }
            if (z) {
                xVar.mo24724e();
                xVar.mo24723d();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (xVar.mo24720b()) {
                        xVar.mo24724e();
                    }
                }
            } else {
                int d2 = xVar.mo24723d();
                int d3 = xVar.mo24723d();
                int i4 = d2 + d3;
                for (int i5 = 0; i5 < d2; i5++) {
                    xVar.mo24723d();
                    xVar.mo24724e();
                }
                for (int i6 = 0; i6 < d3; i6++) {
                    xVar.mo24723d();
                    xVar.mo24724e();
                }
                i = i4;
            }
        }
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f20021b = dVar.mo23442b();
        this.f20022c = iVar.mo23311a(dVar.mo23443c(), 2);
        this.f20023d = new C9050a(this.f20022c);
        this.f20020a.mo23429a(iVar, dVar);
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        this.f20032m = j;
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        C9572w wVar2 = wVar;
        while (wVar.mo24679a() > 0) {
            int c = wVar.mo24688c();
            int d = wVar.mo24690d();
            byte[] bArr = wVar2.f22333a;
            this.f20031l += (long) wVar.mo24679a();
            this.f20022c.mo23305a(wVar2, wVar.mo24679a());
            while (true) {
                if (c < d) {
                    int a = C9568u.m29522a(bArr, c, d, this.f20025f);
                    if (a == d) {
                        m26814a(bArr, c, d);
                        return;
                    }
                    int a2 = C9568u.m29520a(bArr, a);
                    int i = a - c;
                    if (i > 0) {
                        m26814a(bArr, c, a);
                    }
                    int i2 = d - a;
                    long j = this.f20031l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m26812a(j2, i4, i3, this.f20032m);
                    m26815b(j2, i4, a2, this.f20032m);
                    c = a + 3;
                }
            }
        }
    }

    /* renamed from: a */
    private void m26814a(byte[] bArr, int i, int i2) {
        if (this.f20024e) {
            this.f20023d.mo23464a(bArr, i, i2);
        } else {
            this.f20026g.mo23465a(bArr, i, i2);
            this.f20027h.mo23465a(bArr, i, i2);
            this.f20028i.mo23465a(bArr, i, i2);
        }
        this.f20029j.mo23465a(bArr, i, i2);
        this.f20030k.mo23465a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m26812a(long j, int i, int i2, long j2) {
        if (this.f20024e) {
            this.f20023d.mo23462a(j, i);
        } else {
            this.f20026g.mo23467a(i2);
            this.f20027h.mo23467a(i2);
            this.f20028i.mo23467a(i2);
            if (this.f20026g.mo23466a() && this.f20027h.mo23466a() && this.f20028i.mo23466a()) {
                this.f20022c.mo23304a(m26811a(this.f20021b, this.f20026g, this.f20027h, this.f20028i));
                this.f20024e = true;
            }
        }
        if (this.f20029j.mo23467a(i2)) {
            C9054v vVar = this.f20029j;
            this.f20033n.mo24684a(this.f20029j.f20088d, C9568u.m29529c(vVar.f20088d, vVar.f20089e));
            this.f20033n.mo24695f(5);
            this.f20020a.mo23428a(j2, this.f20033n);
        }
        if (this.f20030k.mo23467a(i2)) {
            C9054v vVar2 = this.f20030k;
            this.f20033n.mo24684a(this.f20030k.f20088d, C9568u.m29529c(vVar2.f20088d, vVar2.f20089e));
            this.f20033n.mo24695f(5);
            this.f20020a.mo23428a(j2, this.f20033n);
        }
    }

    /* renamed from: a */
    private static Format m26811a(String str, C9054v vVar, C9054v vVar2, C9054v vVar3) {
        float f;
        C9054v vVar4 = vVar;
        C9054v vVar5 = vVar2;
        C9054v vVar6 = vVar3;
        int i = vVar4.f20089e;
        byte[] bArr = new byte[(vVar5.f20089e + i + vVar6.f20089e)];
        System.arraycopy(vVar4.f20088d, 0, bArr, 0, i);
        System.arraycopy(vVar5.f20088d, 0, bArr, vVar4.f20089e, vVar5.f20089e);
        System.arraycopy(vVar6.f20088d, 0, bArr, vVar4.f20089e + vVar5.f20089e, vVar6.f20089e);
        C9573x xVar = new C9573x(vVar5.f20088d, 0, vVar5.f20089e);
        xVar.mo24722c(44);
        int b = xVar.mo24719b(3);
        xVar.mo24724e();
        xVar.mo24722c(88);
        xVar.mo24722c(8);
        int i2 = 0;
        for (int i3 = 0; i3 < b; i3++) {
            if (xVar.mo24720b()) {
                i2 += 89;
            }
            if (xVar.mo24720b()) {
                i2 += 8;
            }
        }
        xVar.mo24722c(i2);
        if (b > 0) {
            xVar.mo24722c((8 - b) * 2);
        }
        xVar.mo24723d();
        int d = xVar.mo24723d();
        if (d == 3) {
            xVar.mo24724e();
        }
        int d2 = xVar.mo24723d();
        int d3 = xVar.mo24723d();
        if (xVar.mo24720b()) {
            d2 -= ((d == 1 || d == 2) ? 2 : 1) * (xVar.mo24723d() + xVar.mo24723d());
            d3 -= (d == 1 ? 2 : 1) * (xVar.mo24723d() + xVar.mo24723d());
        }
        int i4 = d2;
        int i5 = d3;
        xVar.mo24723d();
        xVar.mo24723d();
        int d4 = xVar.mo24723d();
        for (int i6 = xVar.mo24720b() ? 0 : b; i6 <= b; i6++) {
            xVar.mo24723d();
            xVar.mo24723d();
            xVar.mo24723d();
        }
        xVar.mo24723d();
        xVar.mo24723d();
        xVar.mo24723d();
        xVar.mo24723d();
        xVar.mo24723d();
        xVar.mo24723d();
        if (xVar.mo24720b() && xVar.mo24720b()) {
            m26813a(xVar);
        }
        xVar.mo24722c(2);
        if (xVar.mo24720b()) {
            xVar.mo24722c(8);
            xVar.mo24723d();
            xVar.mo24723d();
            xVar.mo24724e();
        }
        m26816b(xVar);
        if (xVar.mo24720b()) {
            for (int i7 = 0; i7 < xVar.mo24723d(); i7++) {
                xVar.mo24722c(d4 + 4 + 1);
            }
        }
        xVar.mo24722c(2);
        float f2 = 1.0f;
        if (xVar.mo24720b() && xVar.mo24720b()) {
            int b2 = xVar.mo24719b(8);
            if (b2 == 255) {
                int b3 = xVar.mo24719b(16);
                int b4 = xVar.mo24719b(16);
                if (!(b3 == 0 || b4 == 0)) {
                    f2 = ((float) b3) / ((float) b4);
                }
                f = f2;
            } else {
                float[] fArr = C9568u.f22310b;
                if (b2 < fArr.length) {
                    f = fArr[b2];
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(b2);
                    Log.m29500d("H265Reader", sb.toString());
                }
            }
            return Format.m24871a(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
        }
        f = 1.0f;
        return Format.m24871a(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
    }

    /* renamed from: a */
    private static void m26813a(C9573x xVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!xVar.mo24720b()) {
                    xVar.mo24723d();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        xVar.mo24721c();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        xVar.mo24721c();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }
}
