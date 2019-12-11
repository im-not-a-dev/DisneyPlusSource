package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.n1 */
/* compiled from: JobSupport.kt */
public class C13365n1 extends C13391r1 implements C13386q {

    /* renamed from: U */
    private final boolean f29856U = m41080r();

    public C13365n1(C13324k1 k1Var) {
        super(true);
        mo34585a(k1Var);
    }

    /* renamed from: r */
    private final boolean m41080r() {
        C13342m mVar = this.parentHandle;
        if (!(mVar instanceof C13363n)) {
            mVar = null;
        }
        C13363n nVar = (C13363n) mVar;
        if (nVar != null) {
            C13391r1 r1Var = (C13391r1) nVar.f29878W;
            if (r1Var != null) {
                while (!r1Var.mo34561j()) {
                    C13342m mVar2 = r1Var.parentHandle;
                    if (!(mVar2 instanceof C13363n)) {
                        mVar2 = null;
                    }
                    C13363n nVar2 = (C13363n) mVar2;
                    if (nVar2 != null) {
                        r1Var = (C13391r1) nVar2.f29878W;
                        if (r1Var == null) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo34561j() {
        return this.f29856U;
    }

    /* renamed from: k */
    public boolean mo34562k() {
        return true;
    }
}
