package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.y.f0 */
/* compiled from: TsDurationReader */
final class C9023f0 {

    /* renamed from: a */
    private final C9545h0 f19814a = new C9545h0(0);

    /* renamed from: b */
    private final C9572w f19815b = new C9572w();

    /* renamed from: c */
    private boolean f19816c;

    /* renamed from: d */
    private boolean f19817d;

    /* renamed from: e */
    private boolean f19818e;

    /* renamed from: f */
    private long f19819f = -9223372036854775807L;

    /* renamed from: g */
    private long f19820g = -9223372036854775807L;

    /* renamed from: h */
    private long f19821h = -9223372036854775807L;

    C9023f0() {
    }

    /* renamed from: a */
    public int mo23430a(C8913h hVar, C8919n nVar, int i) throws IOException, InterruptedException {
        if (i <= 0) {
            return m26642a(hVar);
        }
        if (!this.f19818e) {
            return m26646c(hVar, nVar, i);
        }
        if (this.f19820g == -9223372036854775807L) {
            return m26642a(hVar);
        }
        if (!this.f19817d) {
            return m26644b(hVar, nVar, i);
        }
        long j = this.f19819f;
        if (j == -9223372036854775807L) {
            return m26642a(hVar);
        }
        this.f19821h = this.f19814a.mo24632b(this.f19820g) - this.f19814a.mo24632b(j);
        return m26642a(hVar);
    }

    /* renamed from: b */
    public C9545h0 mo23432b() {
        return this.f19814a;
    }

    /* renamed from: c */
    public boolean mo23433c() {
        return this.f19816c;
    }

    /* renamed from: b */
    private int m26644b(C8913h hVar, C8919n nVar, int i) throws IOException, InterruptedException {
        int min = (int) Math.min(112800, hVar.mo23287a());
        long j = (long) 0;
        if (hVar.getPosition() != j) {
            nVar.f19163a = j;
            return 1;
        }
        this.f19815b.mo24689c(min);
        hVar.mo23297c();
        hVar.mo23294b(this.f19815b.f22333a, 0, min);
        this.f19819f = m26643a(this.f19815b, i);
        this.f19817d = true;
        return 0;
    }

    /* renamed from: c */
    private int m26646c(C8913h hVar, C8919n nVar, int i) throws IOException, InterruptedException {
        long a = hVar.mo23287a();
        int min = (int) Math.min(112800, a);
        long j = a - ((long) min);
        if (hVar.getPosition() != j) {
            nVar.f19163a = j;
            return 1;
        }
        this.f19815b.mo24689c(min);
        hVar.mo23297c();
        hVar.mo23294b(this.f19815b.f22333a, 0, min);
        this.f19820g = m26645b(this.f19815b, i);
        this.f19818e = true;
        return 0;
    }

    /* renamed from: b */
    private long m26645b(C9572w wVar, int i) {
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        while (true) {
            d--;
            if (d < c) {
                return -9223372036854775807L;
            }
            if (wVar.f22333a[d] == 71) {
                long a = C9035i0.m26718a(wVar, d, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
    }

    /* renamed from: a */
    public long mo23431a() {
        return this.f19821h;
    }

    /* renamed from: a */
    private int m26642a(C8913h hVar) {
        this.f19815b.mo24683a(Util.EMPTY_BYTE_ARRAY);
        this.f19816c = true;
        hVar.mo23297c();
        return 0;
    }

    /* renamed from: a */
    private long m26643a(C9572w wVar, int i) {
        int d = wVar.mo24690d();
        for (int c = wVar.mo24688c(); c < d; c++) {
            if (wVar.f22333a[c] == 71) {
                long a = C9035i0.m26718a(wVar, c, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }
}
