package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.p3 */
/* compiled from: AbstractJumpViewDelegate */
public abstract class C5087p3 extends C5170v3 {

    /* renamed from: X */
    private final C5300m f12385X;

    /* renamed from: Y */
    final int f12386Y;

    /* renamed from: Z */
    boolean f12387Z;

    @SuppressLint({"CheckResult"})
    public C5087p3(View view, int i, C5300m mVar) {
        super(view, mVar);
        this.f12386Y = i;
        this.f12385X = mVar;
        if (view != null) {
            mVar.mo17030f().mo16901f(this.f12488V.mo30193g(new C5075o(i)));
            mVar.mo17069t0().mo30192f((Consumer<? super T>) new C5061m0<Object>(this));
        }
    }

    /* renamed from: a */
    public void mo16567a() {
        if (this.f12387Z) {
            this.f12385X.mo17004b(this.f12386Y);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16568a(boolean z) {
        this.f12387Z = z;
    }
}
