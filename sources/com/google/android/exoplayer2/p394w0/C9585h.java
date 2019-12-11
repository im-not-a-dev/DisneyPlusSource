package com.google.android.exoplayer2.p394w0;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.util.C9544h;
import com.google.android.exoplayer2.util.C9568u;
import com.google.android.exoplayer2.util.C9568u.C9570b;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.w0.h */
/* compiled from: AvcConfig */
public final class C9585h {

    /* renamed from: a */
    public final List<byte[]> f22370a;

    /* renamed from: b */
    public final int f22371b;

    /* renamed from: c */
    public final int f22372c;

    /* renamed from: d */
    public final int f22373d;

    /* renamed from: e */
    public final float f22374e;

    private C9585h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f22370a = list;
        this.f22371b = i;
        this.f22372c = i2;
        this.f22373d = i3;
        this.f22374e = f;
    }

    /* renamed from: a */
    private static byte[] m29614a(C9572w wVar) {
        int B = wVar.mo24676B();
        int c = wVar.mo24688c();
        wVar.mo24695f(B);
        return C9544h.m29338a(wVar.f22333a, c, B);
    }

    /* renamed from: b */
    public static C9585h m29615b(C9572w wVar) throws C8723g0 {
        float f;
        int i;
        int i2;
        try {
            wVar.mo24695f(4);
            int v = (wVar.mo24711v() & 3) + 1;
            if (v != 3) {
                ArrayList arrayList = new ArrayList();
                int v2 = wVar.mo24711v() & 31;
                for (int i3 = 0; i3 < v2; i3++) {
                    arrayList.add(m29614a(wVar));
                }
                int v3 = wVar.mo24711v();
                for (int i4 = 0; i4 < v3; i4++) {
                    arrayList.add(m29614a(wVar));
                }
                if (v2 > 0) {
                    C9570b c = C9568u.m29530c((byte[]) arrayList.get(0), v, ((byte[]) arrayList.get(0)).length);
                    int i5 = c.f22320e;
                    int i6 = c.f22321f;
                    f = c.f22322g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                C9585h hVar = new C9585h(arrayList, v, i2, i, f);
                return hVar;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8723g0("Error parsing AVC config", e);
        }
    }
}
