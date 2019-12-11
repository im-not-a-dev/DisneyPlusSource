package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9030a;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.util.C9572w;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.n */
/* compiled from: DvbSubtitleReader */
public final class C9041n implements C9042o {

    /* renamed from: a */
    private final List<C9030a> f19943a;

    /* renamed from: b */
    private final C8924q[] f19944b;

    /* renamed from: c */
    private boolean f19945c;

    /* renamed from: d */
    private int f19946d;

    /* renamed from: e */
    private int f19947e;

    /* renamed from: f */
    private long f19948f;

    public C9041n(List<C9030a> list) {
        this.f19943a = list;
        this.f19944b = new C8924q[list.size()];
    }

    /* renamed from: a */
    public void mo23434a() {
        this.f19945c = false;
    }

    /* renamed from: b */
    public void mo23438b() {
        if (this.f19945c) {
            for (C8924q a : this.f19944b) {
                a.mo23303a(this.f19948f, 1, this.f19947e, 0, null);
            }
            this.f19945c = false;
        }
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        for (int i = 0; i < this.f19944b.length; i++) {
            C9030a aVar = (C9030a) this.f19943a.get(i);
            dVar.mo23441a();
            C8924q a = iVar.mo23311a(dVar.mo23443c(), 3);
            a.mo23304a(Format.m24878a(dVar.mo23442b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.f19869b), aVar.f19868a, (DrmInitData) null));
            this.f19944b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        if ((i & 4) != 0) {
            this.f19945c = true;
            this.f19948f = j;
            this.f19947e = 0;
            this.f19946d = 2;
        }
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        C8924q[] qVarArr;
        if (this.f19945c && (this.f19946d != 2 || m26769a(wVar, 32))) {
            if (this.f19946d != 1 || m26769a(wVar, 0)) {
                int c = wVar.mo24688c();
                int a = wVar.mo24679a();
                for (C8924q qVar : this.f19944b) {
                    wVar.mo24693e(c);
                    qVar.mo23305a(wVar, a);
                }
                this.f19947e += a;
            }
        }
    }

    /* renamed from: a */
    private boolean m26769a(C9572w wVar, int i) {
        if (wVar.mo24679a() == 0) {
            return false;
        }
        if (wVar.mo24711v() != i) {
            this.f19945c = false;
        }
        this.f19946d--;
        return this.f19945c;
    }
}
