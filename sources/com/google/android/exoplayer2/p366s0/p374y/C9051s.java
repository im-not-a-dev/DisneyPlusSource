package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.s */
/* compiled from: Id3Reader */
public final class C9051s implements C9042o {

    /* renamed from: a */
    private final C9572w f20047a = new C9572w(10);

    /* renamed from: b */
    private C8924q f20048b;

    /* renamed from: c */
    private boolean f20049c;

    /* renamed from: d */
    private long f20050d;

    /* renamed from: e */
    private int f20051e;

    /* renamed from: f */
    private int f20052f;

    /* renamed from: a */
    public void mo23434a() {
        this.f20049c = false;
    }

    /* renamed from: b */
    public void mo23438b() {
        if (this.f20049c) {
            int i = this.f20051e;
            if (i != 0 && this.f20052f == i) {
                this.f20048b.mo23303a(this.f20050d, 1, i, 0, null);
                this.f20049c = false;
            }
        }
    }

    /* renamed from: a */
    public void mo23436a(C8914i iVar, C9033d dVar) {
        dVar.mo23441a();
        this.f20048b = iVar.mo23311a(dVar.mo23443c(), 4);
        this.f20048b.mo23304a(Format.m24879a(dVar.mo23442b(), "application/id3", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: a */
    public void mo23435a(long j, int i) {
        if ((i & 4) != 0) {
            this.f20049c = true;
            this.f20050d = j;
            this.f20051e = 0;
            this.f20052f = 0;
        }
    }

    /* renamed from: a */
    public void mo23437a(C9572w wVar) {
        if (this.f20049c) {
            int a = wVar.mo24679a();
            int i = this.f20052f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(wVar.f22333a, wVar.mo24688c(), this.f20047a.f22333a, this.f20052f, min);
                if (this.f20052f + min == 10) {
                    this.f20047a.mo24693e(0);
                    if (73 == this.f20047a.mo24711v() && 68 == this.f20047a.mo24711v() && 51 == this.f20047a.mo24711v()) {
                        this.f20047a.mo24695f(3);
                        this.f20051e = this.f20047a.mo24710u() + 10;
                    } else {
                        Log.m29500d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f20049c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f20051e - this.f20052f);
            this.f20048b.mo23305a(wVar, min2);
            this.f20052f += min2;
        }
    }
}
