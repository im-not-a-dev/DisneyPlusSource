package com.google.android.exoplayer2.p394w0.p395s;

import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.p394w0.p395s.C9608d.C9609a;
import com.google.android.exoplayer2.p394w0.p395s.C9608d.C9610b;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* renamed from: com.google.android.exoplayer2.w0.s.e */
/* compiled from: ProjectionDecoder */
public final class C9611e {

    /* renamed from: a */
    private static final int f22479a = Util.m29428b("ytmp");

    /* renamed from: b */
    private static final int f22480b = Util.m29428b("mshp");

    /* renamed from: c */
    private static final int f22481c = Util.m29428b("raw ");

    /* renamed from: d */
    private static final int f22482d = Util.m29428b("dfl8");

    /* renamed from: e */
    private static final int f22483e = Util.m29428b("mesh");

    /* renamed from: f */
    private static final int f22484f = Util.m29428b("proj");

    /* renamed from: a */
    private static int m29747a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: a */
    public static C9608d m29748a(byte[] bArr, int i) {
        ArrayList arrayList;
        C9572w wVar = new C9572w(bArr);
        try {
            arrayList = m29749a(wVar) ? m29752d(wVar) : m29751c(wVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C9608d((C9609a) arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new C9608d((C9609a) arrayList.get(0), (C9609a) arrayList.get(1), i);
    }

    /* renamed from: b */
    private static C9609a m29750b(C9572w wVar) {
        int i = wVar.mo24698i();
        if (i > 10000) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = wVar.mo24697h();
        }
        int i3 = wVar.mo24698i();
        if (i3 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) i) * 2.0d) / log);
        C9571v vVar = new C9571v(wVar.f22333a);
        int i4 = 8;
        vVar.mo24667b(wVar.mo24688c() * 8);
        float[] fArr2 = new float[(i3 * 5)];
        int i5 = 5;
        int[] iArr = new int[5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = 0;
            while (i8 < i5) {
                int a = iArr[i8] + m29747a(vVar.mo24660a(ceil));
                if (a >= i || a < 0) {
                    return null;
                }
                int i9 = i7 + 1;
                fArr2[i7] = fArr[a];
                iArr[i8] = a;
                i8++;
                i7 = i9;
                i5 = 5;
            }
            i6++;
            i5 = 5;
        }
        vVar.mo24667b((vVar.mo24671d() + 7) & -8);
        int i10 = 32;
        int a2 = vVar.mo24660a(32);
        C9610b[] bVarArr = new C9610b[a2];
        int i11 = 0;
        while (i11 < a2) {
            int a3 = vVar.mo24660a(i4);
            int a4 = vVar.mo24660a(i4);
            int a5 = vVar.mo24660a(i10);
            if (a5 > 128000) {
                return null;
            }
            int i12 = a3;
            int ceil2 = (int) Math.ceil(Math.log(((double) i3) * d) / log);
            float[] fArr3 = new float[(a5 * 3)];
            float[] fArr4 = new float[(a5 * 2)];
            int i13 = 0;
            for (int i14 = 0; i14 < a5; i14++) {
                i13 += m29747a(vVar.mo24660a(ceil2));
                if (i13 < 0 || i13 >= i3) {
                    return null;
                }
                int i15 = i14 * 3;
                int i16 = i13 * 5;
                fArr3[i15] = fArr2[i16];
                fArr3[i15 + 1] = fArr2[i16 + 1];
                fArr3[i15 + 2] = fArr2[i16 + 2];
                int i17 = i14 * 2;
                fArr4[i17] = fArr2[i16 + 3];
                fArr4[i17 + 1] = fArr2[i16 + 4];
            }
            bVarArr[i11] = new C9610b(i12, fArr3, fArr4, a4);
            i11++;
            i10 = 32;
            d = 2.0d;
            i4 = 8;
        }
        return new C9609a(bVarArr);
    }

    /* renamed from: c */
    private static ArrayList<C9609a> m29751c(C9572w wVar) {
        if (wVar.mo24711v() != 0) {
            return null;
        }
        wVar.mo24695f(7);
        int i = wVar.mo24698i();
        if (i == f22482d) {
            C9572w wVar2 = new C9572w();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.m29413a(wVar, wVar2, inflater)) {
                    return null;
                }
                inflater.end();
                wVar = wVar2;
            } finally {
                inflater.end();
            }
        } else if (i != f22481c) {
            return null;
        }
        return m29753e(wVar);
    }

    /* renamed from: d */
    private static ArrayList<C9609a> m29752d(C9572w wVar) {
        wVar.mo24695f(8);
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        while (c < d) {
            int i = wVar.mo24698i() + c;
            if (i <= c || i > d) {
                break;
            }
            int i2 = wVar.mo24698i();
            if (i2 == f22479a || i2 == f22480b) {
                wVar.mo24691d(i);
                return m29751c(wVar);
            }
            wVar.mo24693e(i);
            c = i;
        }
        return null;
    }

    /* renamed from: e */
    private static ArrayList<C9609a> m29753e(C9572w wVar) {
        ArrayList<C9609a> arrayList = new ArrayList<>();
        int c = wVar.mo24688c();
        int d = wVar.mo24690d();
        while (c < d) {
            int i = wVar.mo24698i() + c;
            if (i <= c || i > d) {
                return null;
            }
            if (wVar.mo24698i() == f22483e) {
                C9609a b = m29750b(wVar);
                if (b == null) {
                    return null;
                }
                arrayList.add(b);
            }
            wVar.mo24693e(i);
            c = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m29749a(C9572w wVar) {
        wVar.mo24695f(4);
        int i = wVar.mo24698i();
        wVar.mo24693e(0);
        if (i == f22484f) {
            return true;
        }
        return false;
    }
}
