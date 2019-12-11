package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8899a;
import com.google.android.exoplayer2.p366s0.C8899a.C8901b;
import com.google.android.exoplayer2.p366s0.C8899a.C8902c;
import com.google.android.exoplayer2.p366s0.C8899a.C8905f;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.y.e0 */
/* compiled from: TsBinarySearchSeeker */
final class C9020e0 extends C8899a {

    /* renamed from: com.google.android.exoplayer2.s0.y.e0$a */
    /* compiled from: TsBinarySearchSeeker */
    private static final class C9021a implements C8906g {

        /* renamed from: a */
        private final C9545h0 f19806a;

        /* renamed from: b */
        private final C9572w f19807b = new C9572w();

        /* renamed from: c */
        private final int f19808c;

        public C9021a(int i, C9545h0 h0Var) {
            this.f19808c = i;
            this.f19806a = h0Var;
        }

        /* renamed from: a */
        public C8905f mo23282a(C8913h hVar, long j, C8902c cVar) throws IOException, InterruptedException {
            long position = hVar.getPosition();
            int min = (int) Math.min(112800, hVar.mo23287a() - position);
            this.f19807b.mo24689c(min);
            hVar.mo23294b(this.f19807b.f22333a, 0, min);
            return m26633a(this.f19807b, j, position);
        }

        /* renamed from: a */
        private C8905f m26633a(C9572w wVar, long j, long j2) {
            C9572w wVar2 = wVar;
            long j3 = j2;
            int d = wVar.mo24690d();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (wVar.mo24679a() >= 188) {
                int a = C9035i0.m26717a(wVar2.f22333a, wVar.mo24688c(), d);
                int i = a + 188;
                if (i > d) {
                    break;
                }
                long a2 = C9035i0.m26718a(wVar2, a, this.f19808c);
                if (a2 != -9223372036854775807L) {
                    long b = this.f19806a.mo24632b(a2);
                    if (b > j) {
                        if (j6 == -9223372036854775807L) {
                            return C8905f.m26107a(b, j3);
                        }
                        return C8905f.m26106a(j3 + j5);
                    } else if (100000 + b > j) {
                        return C8905f.m26106a(j3 + ((long) a));
                    } else {
                        j5 = (long) a;
                        j6 = b;
                    }
                }
                wVar2.mo24693e(i);
                j4 = (long) i;
            }
            if (j6 != -9223372036854775807L) {
                return C8905f.m26109b(j6, j3 + j4);
            }
            return C8905f.f19112d;
        }

        /* renamed from: a */
        public void mo23283a() {
            this.f19807b.mo24683a(C9554k0.f22286f);
        }
    }

    public C9020e0(C9545h0 h0Var, long j, long j2, int i) {
        long j3 = j;
        super(new C8901b(), new C9021a(i, h0Var), j3, 0, j + 1, 0, j2, 188, 940);
    }
}
