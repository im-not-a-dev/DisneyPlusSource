package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.y.y */
/* compiled from: PsDurationReader */
final class C9059y {

    /* renamed from: a */
    private final C9545h0 f20104a = new C9545h0(0);

    /* renamed from: b */
    private final C9572w f20105b = new C9572w();

    /* renamed from: c */
    private boolean f20106c;

    /* renamed from: d */
    private boolean f20107d;

    /* renamed from: e */
    private boolean f20108e;

    /* renamed from: f */
    private long f20109f = -9223372036854775807L;

    /* renamed from: g */
    private long f20110g = -9223372036854775807L;

    /* renamed from: h */
    private long f20111h = -9223372036854775807L;

    C9059y() {
    }

    /* renamed from: a */
    public int mo23470a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        if (!this.f20108e) {
            return m26878c(hVar, nVar);
        }
        if (this.f20110g == -9223372036854775807L) {
            return m26871a(hVar);
        }
        if (!this.f20107d) {
            return m26875b(hVar, nVar);
        }
        long j = this.f20109f;
        if (j == -9223372036854775807L) {
            return m26871a(hVar);
        }
        this.f20111h = this.f20104a.mo24632b(this.f20110g) - this.f20104a.mo24632b(j);
        return m26871a(hVar);
    }

    /* renamed from: b */
    public C9545h0 mo23472b() {
        return this.f20104a;
    }

    /* renamed from: c */
    public boolean mo23473c() {
        return this.f20106c;
    }

    /* renamed from: b */
    private int m26875b(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        int min = (int) Math.min(20000, hVar.mo23287a());
        long j = (long) 0;
        if (hVar.getPosition() != j) {
            nVar.f19163a = j;
            return 1;
        }
        this.f20105b.mo24689c(min);
        hVar.mo23297c();
        hVar.mo23294b(this.f20105b.f22333a, 0, min);
        this.f20109f = m26873a(this.f20105b);
        this.f20107d = true;
        return 0;
    }

    /* renamed from: c */
    public static long m26879c(C9572w wVar) {
        int c = wVar.mo24688c();
        if (wVar.mo24679a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.mo24685a(bArr, 0, bArr.length);
        wVar.mo24693e(c);
        if (!m26874a(bArr)) {
            return -9223372036854775807L;
        }
        return m26877b(bArr);
    }

    /* renamed from: c */
    private int m26878c(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        long a = hVar.mo23287a();
        int min = (int) Math.min(20000, a);
        long j = a - ((long) min);
        if (hVar.getPosition() != j) {
            nVar.f19163a = j;
            return 1;
        }
        this.f20105b.mo24689c(min);
        hVar.mo23297c();
        hVar.mo23294b(this.f20105b.f22333a, 0, min);
        this.f20110g = m26876b(this.f20105b);
        this.f20108e = true;
        return 0;
    }

    /* renamed from: b */
    private long m26876b(C9572w wVar) {
        int c = wVar.mo24688c();
        for (int d = wVar.mo24690d() - 4; d >= c; d--) {
            if (m26872a(wVar.f22333a, d) == 442) {
                wVar.mo24693e(d + 4);
                long c2 = m26879c(wVar);
                if (c2 != -9223372036854775807L) {
                    return c2;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public long mo23471a() {
        return this.f20111h;
    }

    /* renamed from: a */
    private int m26871a(C8913h hVar) {
        this.f20105b.mo24683a(Util.EMPTY_BYTE_ARRAY);
        this.f20106c = true;
        hVar.mo23297c();
        return 0;
    }

    /* renamed from: b */
    private static long m26877b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: a */
    private long m26873a(C9572w wVar) {
        int d = wVar.mo24690d();
        for (int c = wVar.mo24688c(); c < d - 3; c++) {
            if (m26872a(wVar.f22333a, c) == 442) {
                wVar.mo24693e(c + 4);
                long c2 = m26879c(wVar);
                if (c2 != -9223372036854775807L) {
                    return c2;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private int m26872a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    private static boolean m26874a(byte[] bArr) {
        boolean z = false;
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1) {
            return false;
        }
        if ((bArr[8] & 3) == 3) {
            z = true;
        }
        return z;
    }
}
