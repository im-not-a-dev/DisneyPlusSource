package p161f.p162a;

import java.util.concurrent.Executor;

/* renamed from: f.a.m2 */
public class C4508m2 implements C4479j2 {

    /* renamed from: a */
    private final C4423d2 f11187a;

    /* renamed from: b */
    private final C4457g5 f11188b;

    /* renamed from: c */
    private final C4419d f11189c;

    /* renamed from: d */
    private final C4419d f11190d;

    /* renamed from: e */
    private final Executor f11191e;

    /* renamed from: f */
    private final C4621x2 f11192f;

    /* renamed from: g */
    private final C4424d3 f11193g;

    /* renamed from: h */
    private final C4589t2 f11194h;

    /* renamed from: i */
    private C4595u0 f11195i;

    public C4508m2(C4423d2 d2Var, C4457g5 g5Var, C4419d dVar, C4419d dVar2, Executor executor, C4621x2 x2Var, C4424d3 d3Var, C4589t2 t2Var) {
        this.f11187a = d2Var;
        this.f11188b = g5Var;
        this.f11189c = dVar;
        this.f11190d = dVar2;
        this.f11191e = executor;
        this.f11192f = x2Var;
        this.f11193g = d3Var;
        this.f11194h = t2Var;
    }

    /* renamed from: a */
    public void mo15635a(C4471i2 i2Var) {
        m15605a((C4463h2) i2Var).run();
    }

    /* renamed from: b */
    public void mo15636b(C4471i2 i2Var) {
        this.f11191e.execute(m15605a((C4463h2) i2Var));
    }

    /* renamed from: a */
    public void mo15689a(C4595u0 u0Var) {
        this.f11195i = u0Var;
    }

    /* renamed from: a */
    private C4382a2 m15605a(C4463h2 h2Var) {
        C4382a2 a2Var = new C4382a2(h2Var, this.f11187a, this.f11188b, this.f11189c, this.f11190d, this.f11192f, this.f11195i, this.f11193g, this.f11194h);
        return a2Var;
    }
}
