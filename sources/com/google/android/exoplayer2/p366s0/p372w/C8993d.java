package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.w.d */
/* compiled from: OggExtractor */
public class C8993d implements C8912g {

    /* renamed from: a */
    private C8914i f19726a;

    /* renamed from: b */
    private C8998i f19727b;

    /* renamed from: c */
    private boolean f19728c;

    static {
        C8987a aVar = C8987a.f19705a;
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26549b() {
        return new C8912g[]{new C8993d()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        try {
            return m26548b(hVar);
        } catch (C8723g0 unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m26548b(C8913h hVar) throws IOException, InterruptedException {
        C8995f fVar = new C8995f();
        if (fVar.mo23411a(hVar, true) && (fVar.f19736b & 2) == 2) {
            int min = Math.min(fVar.f19740f, 8);
            C9572w wVar = new C9572w(min);
            hVar.mo23294b(wVar.f22333a, 0, min);
            m26547a(wVar);
            if (C8991c.m26535c(wVar)) {
                this.f19727b = new C8991c();
            } else {
                m26547a(wVar);
                if (C9003k.m26594c(wVar)) {
                    this.f19727b = new C9003k();
                } else {
                    m26547a(wVar);
                    if (C8997h.m26568b(wVar)) {
                        this.f19727b = new C8997h();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19726a = iVar;
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        C8998i iVar = this.f19727b;
        if (iVar != null) {
            iVar.mo23414a(j, j2);
        }
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        if (this.f19727b == null) {
            if (m26548b(hVar)) {
                hVar.mo23297c();
            } else {
                throw new C8723g0("Failed to determine bitstream type");
            }
        }
        if (!this.f19728c) {
            C8924q a = this.f19726a.mo23311a(0, 1);
            this.f19726a.mo23312a();
            this.f19727b.mo23415a(this.f19726a, a);
            this.f19728c = true;
        }
        return this.f19727b.mo23412a(hVar, nVar);
    }

    /* renamed from: a */
    private static C9572w m26547a(C9572w wVar) {
        wVar.mo24693e(0);
        return wVar;
    }
}
