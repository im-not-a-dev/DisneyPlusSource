package com.google.android.exoplayer2.p382u0.p383m;

import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.u0.m.g */
/* compiled from: CeaUtil */
public final class C9348g {

    /* renamed from: a */
    public static final int f21469a = C9554k0.m29428b("GA94");

    /* renamed from: a */
    public static void m28497a(long j, C9572w wVar, C8924q[] qVarArr) {
        while (true) {
            boolean z = true;
            if (wVar.mo24679a() > 1) {
                int a = m28496a(wVar);
                int a2 = m28496a(wVar);
                int c = wVar.mo24688c() + a2;
                if (a2 == -1 || a2 > wVar.mo24679a()) {
                    C9563q.m29500d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    c = wVar.mo24690d();
                } else if (a == 4 && a2 >= 8) {
                    int v = wVar.mo24711v();
                    int B = wVar.mo24676B();
                    int i = B == 49 ? wVar.mo24698i() : 0;
                    int v2 = wVar.mo24711v();
                    if (B == 47) {
                        wVar.mo24695f(1);
                    }
                    boolean z2 = v == 181 && (B == 49 || B == 47) && v2 == 3;
                    if (B == 49) {
                        if (i != f21469a) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m28498b(j, wVar, qVarArr);
                    }
                }
                wVar.mo24693e(c);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m28498b(long j, C9572w wVar, C8924q[] qVarArr) {
        int v = wVar.mo24711v();
        if ((v & 64) != 0) {
            int i = v & 31;
            wVar.mo24695f(1);
            int i2 = i * 3;
            int c = wVar.mo24688c();
            for (C8924q qVar : qVarArr) {
                wVar.mo24693e(c);
                qVar.mo23305a(wVar, i2);
                qVar.mo23303a(j, 1, i2, 0, null);
            }
        }
    }

    /* renamed from: a */
    private static int m28496a(C9572w wVar) {
        int i = 0;
        while (wVar.mo24679a() != 0) {
            int v = wVar.mo24711v();
            i += v;
            if (v != 255) {
                return i;
            }
        }
        return -1;
    }
}
