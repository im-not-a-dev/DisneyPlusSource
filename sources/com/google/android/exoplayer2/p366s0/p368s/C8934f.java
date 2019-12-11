package com.google.android.exoplayer2.p366s0.p368s;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p368s.C8932e.C8933a;
import com.google.android.exoplayer2.util.C9568u;
import com.google.android.exoplayer2.util.C9572w;
import com.google.android.exoplayer2.p394w0.C9585h;

/* renamed from: com.google.android.exoplayer2.s0.s.f */
/* compiled from: VideoTagPayloadReader */
final class C8934f extends C8932e {

    /* renamed from: b */
    private final C9572w f19220b = new C9572w(C9568u.f22309a);

    /* renamed from: c */
    private final C9572w f19221c = new C9572w(4);

    /* renamed from: d */
    private int f19222d;

    /* renamed from: e */
    private boolean f19223e;

    /* renamed from: f */
    private boolean f19224f;

    /* renamed from: g */
    private int f19225g;

    public C8934f(C8924q qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23326a(C9572w wVar) throws C8933a {
        int v = wVar.mo24711v();
        int i = (v >> 4) & 15;
        int i2 = v & 15;
        if (i2 == 7) {
            this.f19225g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new C8933a(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo23327b(C9572w wVar, long j) throws C8723g0 {
        C9572w wVar2 = wVar;
        int v = wVar.mo24711v();
        long j2 = j + (((long) wVar.mo24699j()) * 1000);
        if (v == 0 && !this.f19223e) {
            C9572w wVar3 = new C9572w(new byte[wVar.mo24679a()]);
            wVar2.mo24685a(wVar3.f22333a, 0, wVar.mo24679a());
            C9585h b = C9585h.m29615b(wVar3);
            this.f19222d = b.f22371b;
            this.f19219a.mo23304a(Format.m24871a((String) null, "video/avc", (String) null, -1, -1, b.f22372c, b.f22373d, -1.0f, b.f22370a, -1, b.f22374e, (DrmInitData) null));
            this.f19223e = true;
            return false;
        } else if (v != 1 || !this.f19223e) {
            return false;
        } else {
            int i = this.f19225g == 1 ? 1 : 0;
            if (!this.f19224f && i == 0) {
                return false;
            }
            byte[] bArr = this.f19221c.f22333a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.f19222d;
            int i3 = 0;
            while (wVar.mo24679a() > 0) {
                wVar2.mo24685a(this.f19221c.f22333a, i2, this.f19222d);
                this.f19221c.mo24693e(0);
                int z = this.f19221c.mo24715z();
                this.f19220b.mo24693e(0);
                this.f19219a.mo23305a(this.f19220b, 4);
                int i4 = i3 + 4;
                this.f19219a.mo23305a(wVar2, z);
                i3 = i4 + z;
            }
            this.f19219a.mo23303a(j2, i, i3, 0, null);
            this.f19224f = true;
            return true;
        }
    }
}
