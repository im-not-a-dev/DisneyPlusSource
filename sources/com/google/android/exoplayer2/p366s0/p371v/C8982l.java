package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.v.l */
/* compiled from: Sniffer */
final class C8982l {

    /* renamed from: a */
    private static final int[] f19661a = {Util.m29428b("isom"), Util.m29428b("iso2"), Util.m29428b("iso3"), Util.m29428b("iso4"), Util.m29428b("iso5"), Util.m29428b("iso6"), Util.m29428b("avc1"), Util.m29428b("hvc1"), Util.m29428b("hev1"), Util.m29428b("av01"), Util.m29428b("mp41"), Util.m29428b("mp42"), Util.m29428b("3g2a"), Util.m29428b("3g2b"), Util.m29428b("3gr6"), Util.m29428b("3gs6"), Util.m29428b("3ge6"), Util.m29428b("3gg6"), Util.m29428b("M4V "), Util.m29428b("M4A "), Util.m29428b("f4v "), Util.m29428b("kddi"), Util.m29428b("M4VP"), Util.m29428b("qt  "), Util.m29428b("MSNV"), Util.m29428b("dby1")};

    /* renamed from: a */
    public static boolean m26501a(C8913h hVar) throws IOException, InterruptedException {
        return m26502a(hVar, true);
    }

    /* renamed from: b */
    public static boolean m26503b(C8913h hVar) throws IOException, InterruptedException {
        return m26502a(hVar, false);
    }

    /* renamed from: a */
    private static boolean m26502a(C8913h hVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        boolean z4;
        C8913h hVar2 = hVar;
        long a = hVar.mo23287a();
        long j = 4096;
        long j2 = -1;
        int i = (a > -1 ? 1 : (a == -1 ? 0 : -1));
        if (i != 0 && a <= 4096) {
            j = a;
        }
        int i2 = (int) j;
        C9572w wVar = new C9572w(64);
        boolean z5 = false;
        int i3 = i2;
        int i4 = 0;
        boolean z6 = false;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            wVar.mo24689c(8);
            hVar2.mo23294b(wVar.f22333a, z5 ? 1 : 0, 8);
            long x = wVar.mo24713x();
            int i5 = wVar.mo24698i();
            int i6 = 16;
            if (x == 1) {
                hVar2.mo23294b(wVar.f22333a, 8, 8);
                wVar.mo24691d(16);
                x = wVar.mo24707r();
            } else {
                if (x == 0) {
                    long a2 = hVar.mo23287a();
                    if (a2 != j2) {
                        x = (a2 - hVar.mo23293b()) + ((long) 8);
                    }
                }
                i6 = 8;
            }
            if (i != 0 && ((long) i4) + x > a) {
                return z5;
            }
            long j3 = (long) i6;
            if (x < j3) {
                return z5;
            }
            i4 += i6;
            if (i5 == C8958c.f19424R) {
                i3 += (int) x;
                if (i != 0 && ((long) i3) > a) {
                    i3 = (int) a;
                }
                j2 = -1;
            } else if (i5 == C8958c.f19438Y || i5 == C8958c.f19442a0) {
                z2 = false;
                z3 = true;
            } else {
                long j4 = x;
                int i7 = i3;
                if ((((long) i4) + x) - j3 >= ((long) i7)) {
                    break;
                }
                int i8 = (int) (j4 - j3);
                i4 += i8;
                if (i5 == C8958c.f19444b) {
                    if (i8 < 8) {
                        return false;
                    }
                    wVar.mo24689c(i8);
                    hVar2.mo23294b(wVar.f22333a, 0, i8);
                    int i9 = i8 / 4;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            z4 = z6;
                            break;
                        }
                        z4 = true;
                        if (i10 == 1) {
                            wVar.mo24695f(4);
                        } else if (m26500a(wVar.mo24698i())) {
                            break;
                        }
                        i10++;
                    }
                    if (!z4) {
                        return false;
                    }
                    z6 = z4;
                } else if (i8 != 0) {
                    hVar2.mo23288a(i8);
                }
                i3 = i7;
                j2 = -1;
                z5 = false;
            }
        }
        z2 = false;
        z3 = false;
        if (z6 && z == z3) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    private static boolean m26500a(int i) {
        if ((i >>> 8) == Util.m29428b("3gp")) {
            return true;
        }
        for (int i2 : f19661a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
