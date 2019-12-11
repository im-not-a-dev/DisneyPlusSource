package p161f.p162a;

import com.appboy.p033s.C1557c;

/* renamed from: f.a.w2 */
public class C4613w2 implements C4384a3 {

    /* renamed from: c */
    private static final String f11492c = C1557c.m7461a(C4613w2.class);

    /* renamed from: a */
    private final C4384a3 f11493a;

    /* renamed from: b */
    private final C4419d f11494b;

    public C4613w2(C4384a3 a3Var, C4419d dVar) {
        this.f11493a = a3Var;
        this.f11494b = dVar;
    }

    /* renamed from: a */
    public C4462h1 mo15405a() {
        try {
            return this.f11493a.mo15405a();
        } catch (Exception e) {
            C1557c.m7470c(f11492c, "Failed to get the active session from the storage.", e);
            mo15889a(this.f11494b, e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo15407b(C4462h1 h1Var) {
        try {
            this.f11493a.mo15407b(h1Var);
        } catch (Exception e) {
            C1557c.m7470c(f11492c, "Failed to upsert active session in the storage.", e);
            mo15889a(this.f11494b, e);
        }
    }

    /* renamed from: a */
    public void mo15406a(C4462h1 h1Var) {
        try {
            this.f11493a.mo15406a(h1Var);
        } catch (Exception e) {
            C1557c.m7470c(f11492c, "Failed to delete the sealed session from the storage.", e);
            mo15889a(this.f11494b, e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15889a(C4419d dVar, Throwable th) {
        try {
            dVar.mo15485a(new C4618x("A storage exception has occurred. Please view the stack trace for more details.", th), C4618x.class);
        } catch (Exception e) {
            C1557c.m7470c(f11492c, "Failed to log throwable.", e);
        }
    }
}
