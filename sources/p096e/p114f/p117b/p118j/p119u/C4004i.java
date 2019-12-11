package p096e.p114f.p117b.p118j.p119u;

import p096e.p114f.p117b.p118j.C3965b;
import p096e.p114f.p117b.p118j.C3973f;

/* renamed from: e.f.b.j.u.i */
/* compiled from: HelperReferences */
class C4004i extends C4010m {
    public C4004i(C3973f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    private void m13750a(C4000f fVar) {
        this.f10215h.f10187k.add(fVar);
        fVar.f10188l.add(this.f10215h);
    }

    /* renamed from: b */
    public void mo14509b() {
        int S = ((C3965b) this.f10209b).mo14287S();
        if (S == 0 || S == 1) {
            this.f10209b.mo14380k(this.f10215h.f10183g);
        } else {
            this.f10209b.mo14382l(this.f10215h.f10183g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14510c() {
        this.f10210c = null;
        this.f10215h.mo14522a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo14512e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14507a() {
        C3973f fVar = this.f10209b;
        if (fVar instanceof C3965b) {
            this.f10215h.f10178b = true;
            C3965b bVar = (C3965b) fVar;
            int S = bVar.mo14287S();
            boolean R = bVar.mo14286R();
            int i = 0;
            if (S == 0) {
                this.f10215h.f10181e = C4001a.LEFT;
                while (i < bVar.f10125K0) {
                    C3973f fVar2 = bVar.f10124J0[i];
                    if (R || fVar2.mo14315A() != 8) {
                        C4000f fVar3 = fVar2.f10006d.f10215h;
                        fVar3.f10187k.add(this.f10215h);
                        this.f10215h.f10188l.add(fVar3);
                    }
                    i++;
                }
                m13750a(this.f10209b.f10006d.f10215h);
                m13750a(this.f10209b.f10006d.f10216i);
            } else if (S == 1) {
                this.f10215h.f10181e = C4001a.RIGHT;
                while (i < bVar.f10125K0) {
                    C3973f fVar4 = bVar.f10124J0[i];
                    if (R || fVar4.mo14315A() != 8) {
                        C4000f fVar5 = fVar4.f10006d.f10216i;
                        fVar5.f10187k.add(this.f10215h);
                        this.f10215h.f10188l.add(fVar5);
                    }
                    i++;
                }
                m13750a(this.f10209b.f10006d.f10215h);
                m13750a(this.f10209b.f10006d.f10216i);
            } else if (S == 2) {
                this.f10215h.f10181e = C4001a.TOP;
                while (i < bVar.f10125K0) {
                    C3973f fVar6 = bVar.f10124J0[i];
                    if (R || fVar6.mo14315A() != 8) {
                        C4000f fVar7 = fVar6.f10008e.f10215h;
                        fVar7.f10187k.add(this.f10215h);
                        this.f10215h.f10188l.add(fVar7);
                    }
                    i++;
                }
                m13750a(this.f10209b.f10008e.f10215h);
                m13750a(this.f10209b.f10008e.f10216i);
            } else if (S == 3) {
                this.f10215h.f10181e = C4001a.BOTTOM;
                while (i < bVar.f10125K0) {
                    C3973f fVar8 = bVar.f10124J0[i];
                    if (R || fVar8.mo14315A() != 8) {
                        C4000f fVar9 = fVar8.f10008e.f10216i;
                        fVar9.f10187k.add(this.f10215h);
                        this.f10215h.f10188l.add(fVar9);
                    }
                    i++;
                }
                m13750a(this.f10209b.f10008e.f10215h);
                m13750a(this.f10209b.f10008e.f10216i);
            }
        }
    }

    /* renamed from: a */
    public void mo14508a(C3998d dVar) {
        C3965b bVar = (C3965b) this.f10209b;
        int S = bVar.mo14287S();
        int i = -1;
        int i2 = 0;
        for (C4000f fVar : this.f10215h.f10188l) {
            int i3 = fVar.f10183g;
            if (i == -1 || i3 < i) {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
        }
        if (S == 0 || S == 2) {
            this.f10215h.mo14523a(i + bVar.mo14288T());
        } else {
            this.f10215h.mo14523a(i2 + bVar.mo14288T());
        }
    }
}
