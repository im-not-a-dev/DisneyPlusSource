package p096e.p114f.p117b.p118j.p119u;

import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3980j;

/* renamed from: e.f.b.j.u.h */
/* compiled from: GuidelineReference */
class C4003h extends C4010m {
    public C4003h(C3973f fVar) {
        super(fVar);
        fVar.f10006d.mo14510c();
        fVar.f10008e.mo14510c();
        this.f10213f = ((C3980j) fVar).mo14286R();
    }

    /* renamed from: a */
    private void m13744a(C4000f fVar) {
        this.f10215h.f10187k.add(fVar);
        fVar.f10188l.add(this.f10215h);
    }

    /* renamed from: b */
    public void mo14509b() {
        if (((C3980j) this.f10209b).mo14286R() == 1) {
            this.f10209b.mo14380k(this.f10215h.f10183g);
        } else {
            this.f10209b.mo14382l(this.f10215h.f10183g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14510c() {
        this.f10215h.mo14522a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo14512e() {
        return false;
    }

    /* renamed from: a */
    public void mo14508a(C3998d dVar) {
        C4000f fVar = this.f10215h;
        if (fVar.f10179c && !fVar.f10186j) {
            this.f10215h.mo14523a((int) ((((float) ((C4000f) fVar.f10188l.get(0)).f10183g) * ((C3980j) this.f10209b).mo14462U()) + 0.5f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14507a() {
        C3980j jVar = (C3980j) this.f10209b;
        int S = jVar.mo14460S();
        int T = jVar.mo14461T();
        jVar.mo14462U();
        if (jVar.mo14286R() == 1) {
            if (S != -1) {
                this.f10215h.f10188l.add(this.f10209b.f9986M.f10006d.f10215h);
                this.f10209b.f9986M.f10006d.f10215h.f10187k.add(this.f10215h);
                this.f10215h.f10182f = S;
            } else if (T != -1) {
                this.f10215h.f10188l.add(this.f10209b.f9986M.f10006d.f10216i);
                this.f10209b.f9986M.f10006d.f10216i.f10187k.add(this.f10215h);
                this.f10215h.f10182f = -T;
            } else {
                C4000f fVar = this.f10215h;
                fVar.f10178b = true;
                fVar.f10188l.add(this.f10209b.f9986M.f10006d.f10216i);
                this.f10209b.f9986M.f10006d.f10216i.f10187k.add(this.f10215h);
            }
            m13744a(this.f10209b.f10006d.f10215h);
            m13744a(this.f10209b.f10006d.f10216i);
            return;
        }
        if (S != -1) {
            this.f10215h.f10188l.add(this.f10209b.f9986M.f10008e.f10215h);
            this.f10209b.f9986M.f10008e.f10215h.f10187k.add(this.f10215h);
            this.f10215h.f10182f = S;
        } else if (T != -1) {
            this.f10215h.f10188l.add(this.f10209b.f9986M.f10008e.f10216i);
            this.f10209b.f9986M.f10008e.f10216i.f10187k.add(this.f10215h);
            this.f10215h.f10182f = -T;
        } else {
            C4000f fVar2 = this.f10215h;
            fVar2.f10178b = true;
            fVar2.f10188l.add(this.f10209b.f9986M.f10008e.f10216i);
            this.f10209b.f9986M.f10008e.f10216i.f10187k.add(this.f10215h);
        }
        m13744a(this.f10209b.f10008e.f10215h);
        m13744a(this.f10209b.f10008e.f10216i);
    }
}
