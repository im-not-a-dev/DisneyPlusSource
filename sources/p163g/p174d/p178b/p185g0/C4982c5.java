package p163g.p174d.p178b.p185g0;

import android.view.View;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.c5 */
/* compiled from: RewindViewDelegate */
public class C4982c5 extends C5170v3 {

    /* renamed from: X */
    private final C5300m f12237X;

    /* renamed from: Y */
    private final View f12238Y;

    public C4982c5(View view, C5300m mVar) {
        super(view, mVar);
        this.f12238Y = view;
        this.f12237X = mVar;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5011g2<Object>(this));
            mVar.mo17030f().mo16911k(this.f12488V);
            mVar.mo17046i0().mo30192f((Consumer<? super T>) new C5120r2<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16479a(float f) {
        this.f12238Y.setActivated(f < 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16480b(Object obj) {
        this.f12237X.mo16964P0();
    }
}
