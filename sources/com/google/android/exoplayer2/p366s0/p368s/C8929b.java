package com.google.android.exoplayer2.p366s0.p368s;

import android.util.Pair;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p368s.C8932e.C8933a;
import com.google.android.exoplayer2.util.C9544h;
import com.google.android.exoplayer2.util.C9572w;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.s0.s.b */
/* compiled from: AudioTagPayloadReader */
final class C8929b extends C8932e {

    /* renamed from: e */
    private static final int[] f19197e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f19198b;

    /* renamed from: c */
    private boolean f19199c;

    /* renamed from: d */
    private int f19200d;

    public C8929b(C8924q qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23326a(C9572w wVar) throws C8933a {
        if (!this.f19198b) {
            int v = wVar.mo24711v();
            this.f19200d = (v >> 4) & 15;
            int i = this.f19200d;
            if (i == 2) {
                this.f19219a.mo23304a(Format.m24875a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f19197e[(v >> 2) & 3], null, (DrmInitData) null, 0, (String) null));
                this.f19199c = true;
            } else if (i == 7 || i == 8) {
                this.f19219a.mo23304a(Format.m24874a((String) null, this.f19200d == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (v & 1) == 1 ? 2 : 3, null, (DrmInitData) null, 0, (String) null));
                this.f19199c = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Audio format not supported: ");
                sb.append(this.f19200d);
                throw new C8933a(sb.toString());
            }
            this.f19198b = true;
        } else {
            wVar.mo24695f(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo23327b(C9572w wVar, long j) throws C8723g0 {
        C9572w wVar2 = wVar;
        if (this.f19200d == 2) {
            int a = wVar.mo24679a();
            this.f19219a.mo23305a(wVar2, a);
            this.f19219a.mo23303a(j, 1, a, 0, null);
            return true;
        }
        int v = wVar.mo24711v();
        if (v == 0 && !this.f19199c) {
            byte[] bArr = new byte[wVar.mo24679a()];
            wVar2.mo24685a(bArr, 0, bArr.length);
            Pair a2 = C9544h.m29334a(bArr);
            this.f19219a.mo23304a(Format.m24875a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null));
            this.f19199c = true;
            return false;
        } else if (this.f19200d == 10 && v != 1) {
            return false;
        } else {
            int a3 = wVar.mo24679a();
            this.f19219a.mo23305a(wVar2, a3);
            this.f19219a.mo23303a(j, 1, a3, 0, null);
            return true;
        }
    }
}
