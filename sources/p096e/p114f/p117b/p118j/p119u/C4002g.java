package p096e.p114f.p117b.p118j.p119u;

/* renamed from: e.f.b.j.u.g */
/* compiled from: DimensionDependency */
class C4002g extends C4000f {

    /* renamed from: m */
    public int f10198m;

    public C4002g(C4010m mVar) {
        super(mVar);
        if (mVar instanceof C4005j) {
            this.f10181e = C4001a.HORIZONTAL_DIMENSION;
        } else {
            this.f10181e = C4001a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: a */
    public void mo14523a(int i) {
        if (!this.f10186j) {
            this.f10186j = true;
            this.f10183g = i;
            for (C3998d dVar : this.f10187k) {
                dVar.mo14508a(dVar);
            }
        }
    }
}
