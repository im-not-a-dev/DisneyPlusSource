package com.google.android.exoplayer2.p366s0.p369t;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.t.f */
/* compiled from: Sniffer */
final class C8946f {

    /* renamed from: a */
    private final C9572w f19348a = new C9572w(8);

    /* renamed from: b */
    private int f19349b;

    /* renamed from: b */
    private long m26305b(C8913h hVar) throws IOException, InterruptedException {
        int i = 0;
        hVar.mo23294b(this.f19348a.f22333a, 0, 1);
        byte b = this.f19348a.f22333a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        hVar.mo23294b(this.f19348a.f22333a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f19348a.f22333a[i] & 255) + (i4 << 8);
        }
        this.f19349b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public boolean mo23356a(C8913h hVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        long a = hVar.mo23287a();
        long j = 1024;
        int i = (a > -1 ? 1 : (a == -1 ? 0 : -1));
        if (i != 0 && a <= 1024) {
            j = a;
        }
        int i2 = (int) j;
        hVar2.mo23294b(this.f19348a.f22333a, 0, 4);
        long x = this.f19348a.mo24713x();
        this.f19349b = 4;
        while (true) {
            boolean z = true;
            if (x != 440786851) {
                int i3 = this.f19349b + 1;
                this.f19349b = i3;
                if (i3 == i2) {
                    return false;
                }
                hVar2.mo23294b(this.f19348a.f22333a, 0, 1);
                x = ((x << 8) & -256) | ((long) (this.f19348a.f22333a[0] & 255));
            } else {
                long b = m26305b(hVar);
                long j2 = (long) this.f19349b;
                if (b == Long.MIN_VALUE || (i != 0 && j2 + b >= a)) {
                    return false;
                }
                while (true) {
                    int i4 = this.f19349b;
                    long j3 = j2 + b;
                    if (((long) i4) >= j3) {
                        if (((long) i4) != j3) {
                            z = false;
                        }
                        return z;
                    } else if (m26305b(hVar) == Long.MIN_VALUE) {
                        return false;
                    } else {
                        long b2 = m26305b(hVar);
                        int i5 = (b2 > 0 ? 1 : (b2 == 0 ? 0 : -1));
                        if (i5 < 0 || b2 > 2147483647L) {
                            return false;
                        }
                        if (i5 != 0) {
                            int i6 = (int) b2;
                            hVar2.mo23288a(i6);
                            this.f19349b += i6;
                        }
                    }
                }
                return false;
            }
        }
    }
}
