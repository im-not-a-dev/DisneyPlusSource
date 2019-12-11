package p161f.p162a;

import com.appboy.p033s.C1557c;

/* renamed from: f.a.k2 */
public class C4488k2 implements C4479j2 {

    /* renamed from: b */
    private static final String f11130b = C1557c.m7461a(C4488k2.class);

    /* renamed from: a */
    private final C4419d f11131a;

    public C4488k2(C4419d dVar) {
        this.f11131a = dVar;
    }

    /* renamed from: c */
    private void m15538c(C4471i2 i2Var) {
        C1557c.m7468b(f11130b, "Short circuiting execution of network request and immediately marking it as succeeded.", false);
        i2Var.mo15458a(this.f11131a, null);
        i2Var.mo15623a(this.f11131a);
        this.f11131a.mo15485a(new C4438f((C4463h2) i2Var), C4438f.class);
    }

    /* renamed from: a */
    public void mo15635a(C4471i2 i2Var) {
        m15538c(i2Var);
    }

    /* renamed from: b */
    public void mo15636b(C4471i2 i2Var) {
        m15538c(i2Var);
    }
}
