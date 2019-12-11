package com.google.android.exoplayer2.p394w0;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.util.C9568u;
import com.google.android.exoplayer2.util.C9572w;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.w0.l */
/* compiled from: HevcConfig */
public final class C9592l {

    /* renamed from: a */
    public final List<byte[]> f22391a;

    /* renamed from: b */
    public final int f22392b;

    private C9592l(List<byte[]> list, int i) {
        this.f22391a = list;
        this.f22392b = i;
    }

    /* renamed from: a */
    public static C9592l m29625a(C9572w wVar) throws C8723g0 {
        List list;
        try {
            wVar.mo24695f(21);
            int v = wVar.mo24711v() & 3;
            int v2 = wVar.mo24711v();
            int c = wVar.mo24688c();
            int i = 0;
            int i2 = 0;
            while (i < v2) {
                wVar.mo24695f(1);
                int B = wVar.mo24676B();
                int i3 = i2;
                for (int i4 = 0; i4 < B; i4++) {
                    int B2 = wVar.mo24676B();
                    i3 += B2 + 4;
                    wVar.mo24695f(B2);
                }
                i++;
                i2 = i3;
            }
            wVar.mo24693e(c);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < v2) {
                wVar.mo24695f(1);
                int B3 = wVar.mo24676B();
                int i7 = i6;
                for (int i8 = 0; i8 < B3; i8++) {
                    int B4 = wVar.mo24676B();
                    System.arraycopy(C9568u.f22309a, 0, bArr, i7, C9568u.f22309a.length);
                    int length = i7 + C9568u.f22309a.length;
                    System.arraycopy(wVar.f22333a, wVar.mo24688c(), bArr, length, B4);
                    i7 = length + B4;
                    wVar.mo24695f(B4);
                }
                i5++;
                i6 = i7;
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C9592l(list, v + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8723g0("Error parsing HEVC config", e);
        }
    }
}
