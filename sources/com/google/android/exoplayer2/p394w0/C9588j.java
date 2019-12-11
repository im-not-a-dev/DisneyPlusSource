package com.google.android.exoplayer2.p394w0;

import com.google.android.exoplayer2.util.C9572w;

/* renamed from: com.google.android.exoplayer2.w0.j */
/* compiled from: DolbyVisionConfig */
public final class C9588j {

    /* renamed from: a */
    public final int f22380a;

    /* renamed from: b */
    public final String f22381b;

    private C9588j(int i, int i2, String str) {
        this.f22380a = i;
        this.f22381b = str;
    }

    /* renamed from: a */
    public static C9588j m29616a(C9572w wVar) {
        String str;
        wVar.mo24695f(2);
        int v = wVar.mo24711v();
        int i = v >> 1;
        int v2 = ((wVar.mo24711v() >> 3) & 31) | ((v & 1) << 5);
        if (i == 4 || i == 5) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        sb.append(str2);
        sb.append(v2);
        return new C9588j(i, v2, sb.toString());
    }
}
