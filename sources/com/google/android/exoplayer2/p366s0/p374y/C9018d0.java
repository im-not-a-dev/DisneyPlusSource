package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.d0 */
/* compiled from: SpliceInfoSectionReader */
public final class C9018d0 implements C9012a0 {

    /* renamed from: a */
    private C9545h0 f19802a;

    /* renamed from: b */
    private C8924q f19803b;

    /* renamed from: c */
    private boolean f19804c;

    /* renamed from: a */
    public void mo23423a(C9545h0 h0Var, C8914i iVar, C9033d dVar) {
        this.f19802a = h0Var;
        dVar.mo23441a();
        this.f19803b = iVar.mo23311a(dVar.mo23443c(), 4);
        this.f19803b.mo23304a(Format.m24879a(dVar.mo23442b(), "application/x-scte35", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: a */
    public void mo23424a(C9572w wVar) {
        if (!this.f19804c) {
            if (this.f19802a.mo24633c() != -9223372036854775807L) {
                this.f19803b.mo23304a(Format.m24870a(null, "application/x-scte35", this.f19802a.mo24633c()));
                this.f19804c = true;
            } else {
                return;
            }
        }
        int a = wVar.mo24679a();
        this.f19803b.mo23305a(wVar, a);
        this.f19803b.mo23303a(this.f19802a.mo24631b(), 1, a, 0, null);
    }
}
