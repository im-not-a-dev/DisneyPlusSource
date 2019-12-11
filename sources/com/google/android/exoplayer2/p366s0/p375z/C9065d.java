package com.google.android.exoplayer2.p366s0.p375z;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p361p0.C8822d0;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.z.d */
/* compiled from: WavHeaderReader */
final class C9065d {

    /* renamed from: com.google.android.exoplayer2.s0.z.d$a */
    /* compiled from: WavHeaderReader */
    private static final class C9066a {

        /* renamed from: a */
        public final int f20145a;

        /* renamed from: b */
        public final long f20146b;

        private C9066a(int i, long j) {
            this.f20145a = i;
            this.f20146b = j;
        }

        /* renamed from: a */
        public static C9066a m26917a(C8913h hVar, C9572w wVar) throws IOException, InterruptedException {
            hVar.mo23294b(wVar.f22333a, 0, 8);
            wVar.mo24693e(0);
            return new C9066a(wVar.mo24698i(), wVar.mo24704o());
        }
    }

    /* renamed from: a */
    public static C9064c m26915a(C8913h hVar) throws IOException, InterruptedException {
        Assertions.checkNotNull(hVar);
        C9572w wVar = new C9572w(16);
        if (C9066a.m26917a(hVar, wVar).f20145a != C8822d0.f18799a) {
            return null;
        }
        hVar.mo23294b(wVar.f22333a, 0, 4);
        wVar.mo24693e(0);
        int i = wVar.mo24698i();
        String str = "WavHeaderReader";
        if (i != C8822d0.f18800b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(i);
            Log.m29497b(str, sb.toString());
            return null;
        }
        C9066a a = C9066a.m26917a(hVar, wVar);
        while (a.f20145a != C8822d0.f18801c) {
            hVar.mo23288a((int) a.f20146b);
            a = C9066a.m26917a(hVar, wVar);
        }
        Assertions.checkState(a.f20146b >= 16);
        hVar.mo23294b(wVar.f22333a, 0, 16);
        wVar.mo24693e(0);
        int q = wVar.mo24706q();
        int q2 = wVar.mo24706q();
        int p = wVar.mo24705p();
        int p2 = wVar.mo24705p();
        int q3 = wVar.mo24706q();
        int q4 = wVar.mo24706q();
        int i2 = (q2 * q4) / 8;
        if (q3 == i2) {
            int a2 = C8822d0.m25594a(q, q4);
            if (a2 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported WAV format: ");
                sb2.append(q4);
                sb2.append(" bit/sample, type ");
                sb2.append(q);
                Log.m29497b(str, sb2.toString());
                return null;
            }
            hVar.mo23288a(((int) a.f20146b) - 16);
            C9064c cVar = new C9064c(q2, p, p2, q3, q4, a2);
            return cVar;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected block alignment: ");
        sb3.append(i2);
        sb3.append("; got: ");
        sb3.append(q3);
        throw new C8723g0(sb3.toString());
    }

    /* renamed from: a */
    public static void m26916a(C8913h hVar, C9064c cVar) throws IOException, InterruptedException {
        Assertions.checkNotNull(hVar);
        Assertions.checkNotNull(cVar);
        hVar.mo23297c();
        C9572w wVar = new C9572w(8);
        C9066a a = C9066a.m26917a(hVar, wVar);
        while (true) {
            int i = a.f20145a;
            String str = "WavHeaderReader";
            if (i != C8822d0.f18802d) {
                if (!(i == C8822d0.f18799a || i == C8822d0.f18801c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring unknown WAV chunk: ");
                    sb.append(a.f20145a);
                    Log.m29500d(str, sb.toString());
                }
                long j = a.f20146b + 8;
                if (a.f20145a == C8822d0.f18799a) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    hVar.mo23298c((int) j);
                    a = C9066a.m26917a(hVar, wVar);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(a.f20145a);
                    throw new C8723g0(sb2.toString());
                }
            } else {
                hVar.mo23298c(8);
                int position = (int) hVar.getPosition();
                long j2 = ((long) position) + a.f20146b;
                long a2 = hVar.mo23287a();
                if (a2 != -1 && j2 > a2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Data exceeds input length: ");
                    sb3.append(j2);
                    sb3.append(", ");
                    sb3.append(a2);
                    Log.m29500d(str, sb3.toString());
                    j2 = a2;
                }
                cVar.mo23478a(position, j2);
                return;
            }
        }
    }
}
