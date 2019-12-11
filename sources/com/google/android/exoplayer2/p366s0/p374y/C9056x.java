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

/* renamed from: com.google.android.exoplayer2.s0.y.x */
/* compiled from: PsBinarySearchSeeker */
final class C9056x extends C8899a {

    /* renamed from: com.google.android.exoplayer2.s0.y.x$b */
    /* compiled from: PsBinarySearchSeeker */
    private static final class C9058b implements C8906g {

        /* renamed from: a */
        private final C9545h0 f20102a;

        /* renamed from: b */
        private final C9572w f20103b;

        /* renamed from: a */
        public C8905f mo23282a(C8913h hVar, long j, C8902c cVar) throws IOException, InterruptedException {
            long position = hVar.getPosition();
            int min = (int) Math.min(20000, hVar.mo23287a() - position);
            this.f20103b.mo24689c(min);
            hVar.mo23294b(this.f20103b.f22333a, 0, min);
            return m26867a(this.f20103b, j, position);
        }

        private C9058b(C9545h0 h0Var) {
            this.f20102a = h0Var;
            this.f20103b = new C9572w();
        }

        /* renamed from: a */
        public void mo23283a() {
            this.f20103b.mo24683a(C9554k0.f22286f);
        }

        /* renamed from: a */
        private C8905f m26867a(C9572w wVar, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (wVar.mo24679a() >= 4) {
                if (C9056x.m26866b(wVar.f22333a, wVar.mo24688c()) != 442) {
                    wVar.mo24695f(1);
                } else {
                    wVar.mo24695f(4);
                    long c = C9059y.m26879c(wVar);
                    if (c != -9223372036854775807L) {
                        long b = this.f20102a.mo24632b(c);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return C8905f.m26107a(b, j2);
                            }
                            return C8905f.m26106a(j2 + ((long) i2));
                        } else if (100000 + b > j) {
                            return C8905f.m26106a(j2 + ((long) wVar.mo24688c()));
                        } else {
                            i2 = wVar.mo24688c();
                            j3 = b;
                        }
                    }
                    m26868a(wVar);
                    i = wVar.mo24688c();
                }
            }
            if (j3 != -9223372036854775807L) {
                return C8905f.m26109b(j3, j2 + ((long) i));
            }
            return C8905f.f19112d;
        }

        /* renamed from: a */
        private static void m26868a(C9572w wVar) {
            int d = wVar.mo24690d();
            if (wVar.mo24679a() < 10) {
                wVar.mo24693e(d);
                return;
            }
            wVar.mo24695f(9);
            int v = wVar.mo24711v() & 7;
            if (wVar.mo24679a() < v) {
                wVar.mo24693e(d);
                return;
            }
            wVar.mo24695f(v);
            if (wVar.mo24679a() < 4) {
                wVar.mo24693e(d);
                return;
            }
            if (C9056x.m26866b(wVar.f22333a, wVar.mo24688c()) == 443) {
                wVar.mo24695f(4);
                int B = wVar.mo24676B();
                if (wVar.mo24679a() < B) {
                    wVar.mo24693e(d);
                    return;
                }
                wVar.mo24695f(B);
            }
            while (wVar.mo24679a() >= 4) {
                int a = C9056x.m26866b(wVar.f22333a, wVar.mo24688c());
                if (a == 442 || a == 441 || (a >>> 8) != 1) {
                    break;
                }
                wVar.mo24695f(4);
                if (wVar.mo24679a() < 2) {
                    wVar.mo24693e(d);
                    return;
                } else {
                    wVar.mo24693e(Math.min(wVar.mo24690d(), wVar.mo24688c() + wVar.mo24676B()));
                }
            }
        }
    }

    public C9056x(C9545h0 h0Var, long j, long j2) {
        super(new C8901b(), new C9058b(h0Var), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m26866b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
