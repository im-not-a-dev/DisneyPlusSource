package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p382u0.p383m.C9348g;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9572w;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.j0 */
/* compiled from: UserDataReader */
final class C9037j0 {

    /* renamed from: a */
    private final List<Format> f19906a;

    /* renamed from: b */
    private final C8924q[] f19907b;

    public C9037j0(List<Format> list) {
        this.f19906a = list;
        this.f19907b = new C8924q[list.size()];
    }

    /* renamed from: a */
    public void mo23445a(C8914i iVar, C9033d dVar) {
        for (int i = 0; i < this.f19907b.length; i++) {
            dVar.mo23441a();
            C8924q a = iVar.mo23311a(dVar.mo23443c(), 3);
            Format format = (Format) this.f19906a.get(i);
            String str = format.f18349b0;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption mime type provided: ");
            sb.append(str);
            Assertions.m29300a(z, (Object) sb.toString());
            a.mo23304a(Format.m24876a(dVar.mo23442b(), str, (String) null, -1, format.f18343V, format.f18368t0, format.f18369u0, (DrmInitData) null, Long.MAX_VALUE, format.f18352d0));
            this.f19907b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo23444a(long j, C9572w wVar) {
        if (wVar.mo24679a() >= 9) {
            int i = wVar.mo24698i();
            int i2 = wVar.mo24698i();
            int v = wVar.mo24711v();
            if (i == 434 && i2 == C9348g.f21469a && v == 3) {
                C9348g.m28498b(j, wVar, this.f19907b);
            }
        }
    }
}
