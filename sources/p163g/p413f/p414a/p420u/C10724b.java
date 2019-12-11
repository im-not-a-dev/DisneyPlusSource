package p163g.p413f.p414a.p420u;

/* renamed from: g.f.a.u.b */
/* compiled from: ErrorRequestCoordinator */
public final class C10724b implements C10727e, C10726d {

    /* renamed from: U */
    private C10726d f25371U;

    /* renamed from: V */
    private C10726d f25372V;

    /* renamed from: c */
    private final C10727e f25373c;

    public C10724b(C10727e eVar) {
        this.f25373c = eVar;
    }

    /* renamed from: h */
    private boolean m33785h() {
        C10727e eVar = this.f25373c;
        return eVar == null || eVar.mo27724c(this);
    }

    /* renamed from: i */
    private boolean m33786i() {
        C10727e eVar = this.f25373c;
        return eVar == null || eVar.mo27726d(this);
    }

    /* renamed from: j */
    private boolean m33787j() {
        C10727e eVar = this.f25373c;
        return eVar != null && eVar.mo27722b();
    }

    /* renamed from: a */
    public void mo27719a(C10726d dVar, C10726d dVar2) {
        this.f25371U = dVar;
        this.f25372V = dVar2;
    }

    /* renamed from: b */
    public boolean mo27722b() {
        return m33787j() || mo27728e();
    }

    /* renamed from: c */
    public void mo27723c() {
        if (!this.f25371U.isRunning()) {
            this.f25371U.mo27723c();
        }
    }

    public void clear() {
        this.f25371U.clear();
        if (this.f25372V.isRunning()) {
            this.f25372V.clear();
        }
    }

    /* renamed from: d */
    public boolean mo27726d(C10726d dVar) {
        return m33786i() && m33784g(dVar);
    }

    /* renamed from: e */
    public boolean mo27728e() {
        return (this.f25371U.mo27729f() ? this.f25372V : this.f25371U).mo27728e();
    }

    /* renamed from: f */
    public boolean mo27729f() {
        return this.f25371U.mo27729f() && this.f25372V.mo27729f();
    }

    /* renamed from: g */
    public boolean mo27731g() {
        return (this.f25371U.mo27729f() ? this.f25372V : this.f25371U).mo27731g();
    }

    public boolean isComplete() {
        return (this.f25371U.mo27729f() ? this.f25372V : this.f25371U).isComplete();
    }

    public boolean isRunning() {
        return (this.f25371U.mo27729f() ? this.f25372V : this.f25371U).isRunning();
    }

    /* renamed from: d */
    private boolean m33783d() {
        C10727e eVar = this.f25373c;
        return eVar == null || eVar.mo27730f(this);
    }

    /* renamed from: g */
    private boolean m33784g(C10726d dVar) {
        return dVar.equals(this.f25371U) || (this.f25371U.mo27729f() && dVar.equals(this.f25372V));
    }

    /* renamed from: b */
    public void mo27721b(C10726d dVar) {
        if (!dVar.equals(this.f25372V)) {
            if (!this.f25372V.isRunning()) {
                this.f25372V.mo27723c();
            }
            return;
        }
        C10727e eVar = this.f25373c;
        if (eVar != null) {
            eVar.mo27721b(this);
        }
    }

    /* renamed from: e */
    public void mo27727e(C10726d dVar) {
        C10727e eVar = this.f25373c;
        if (eVar != null) {
            eVar.mo27727e(this);
        }
    }

    /* renamed from: f */
    public boolean mo27730f(C10726d dVar) {
        return m33783d() && m33784g(dVar);
    }

    /* renamed from: a */
    public void mo27718a() {
        this.f25371U.mo27718a();
        this.f25372V.mo27718a();
    }

    /* renamed from: c */
    public boolean mo27724c(C10726d dVar) {
        return m33785h() && m33784g(dVar);
    }

    /* renamed from: a */
    public boolean mo27720a(C10726d dVar) {
        if (!(dVar instanceof C10724b)) {
            return false;
        }
        C10724b bVar = (C10724b) dVar;
        if (!this.f25371U.mo27720a(bVar.f25371U) || !this.f25372V.mo27720a(bVar.f25372V)) {
            return false;
        }
        return true;
    }
}
