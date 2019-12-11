package p163g.p413f.p414a.p420u;

/* renamed from: g.f.a.u.k */
/* compiled from: ThumbnailRequestCoordinator */
public class C10736k implements C10727e, C10726d {

    /* renamed from: U */
    private C10726d f25422U;

    /* renamed from: V */
    private C10726d f25423V;

    /* renamed from: W */
    private boolean f25424W;

    /* renamed from: c */
    private final C10727e f25425c;

    C10736k() {
        this(null);
    }

    /* renamed from: h */
    private boolean m33868h() {
        C10727e eVar = this.f25425c;
        return eVar == null || eVar.mo27724c(this);
    }

    /* renamed from: i */
    private boolean m33869i() {
        C10727e eVar = this.f25425c;
        return eVar == null || eVar.mo27726d(this);
    }

    /* renamed from: j */
    private boolean m33870j() {
        C10727e eVar = this.f25425c;
        return eVar != null && eVar.mo27722b();
    }

    /* renamed from: a */
    public void mo27752a(C10726d dVar, C10726d dVar2) {
        this.f25422U = dVar;
        this.f25423V = dVar2;
    }

    /* renamed from: b */
    public boolean mo27722b() {
        return m33870j() || mo27728e();
    }

    /* renamed from: c */
    public boolean mo27724c(C10726d dVar) {
        return m33868h() && dVar.equals(this.f25422U) && !mo27722b();
    }

    public void clear() {
        this.f25424W = false;
        this.f25423V.clear();
        this.f25422U.clear();
    }

    /* renamed from: d */
    public boolean mo27726d(C10726d dVar) {
        return m33869i() && (dVar.equals(this.f25422U) || !this.f25422U.mo27728e());
    }

    /* renamed from: e */
    public void mo27727e(C10726d dVar) {
        if (!dVar.equals(this.f25423V)) {
            C10727e eVar = this.f25425c;
            if (eVar != null) {
                eVar.mo27727e(this);
            }
            if (!this.f25423V.isComplete()) {
                this.f25423V.clear();
            }
        }
    }

    /* renamed from: f */
    public boolean mo27730f(C10726d dVar) {
        return m33867d() && dVar.equals(this.f25422U);
    }

    /* renamed from: g */
    public boolean mo27731g() {
        return this.f25422U.mo27731g();
    }

    public boolean isComplete() {
        return this.f25422U.isComplete() || this.f25423V.isComplete();
    }

    public boolean isRunning() {
        return this.f25422U.isRunning();
    }

    public C10736k(C10727e eVar) {
        this.f25425c = eVar;
    }

    /* renamed from: d */
    private boolean m33867d() {
        C10727e eVar = this.f25425c;
        return eVar == null || eVar.mo27730f(this);
    }

    /* renamed from: b */
    public void mo27721b(C10726d dVar) {
        if (dVar.equals(this.f25422U)) {
            C10727e eVar = this.f25425c;
            if (eVar != null) {
                eVar.mo27721b(this);
            }
        }
    }

    /* renamed from: c */
    public void mo27723c() {
        this.f25424W = true;
        if (!this.f25422U.isComplete() && !this.f25423V.isRunning()) {
            this.f25423V.mo27723c();
        }
        if (this.f25424W && !this.f25422U.isRunning()) {
            this.f25422U.mo27723c();
        }
    }

    /* renamed from: f */
    public boolean mo27729f() {
        return this.f25422U.mo27729f();
    }

    /* renamed from: a */
    public void mo27718a() {
        this.f25422U.mo27718a();
        this.f25423V.mo27718a();
    }

    /* renamed from: a */
    public boolean mo27720a(C10726d dVar) {
        if (!(dVar instanceof C10736k)) {
            return false;
        }
        C10736k kVar = (C10736k) dVar;
        C10726d dVar2 = this.f25422U;
        if (dVar2 == null) {
            if (kVar.f25422U != null) {
                return false;
            }
        } else if (!dVar2.mo27720a(kVar.f25422U)) {
            return false;
        }
        C10726d dVar3 = this.f25423V;
        C10726d dVar4 = kVar.f25423V;
        if (dVar3 == null) {
            if (dVar4 != null) {
                return false;
            }
        } else if (!dVar3.mo27720a(dVar4)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo27728e() {
        return this.f25422U.mo27728e() || this.f25423V.mo27728e();
    }
}
