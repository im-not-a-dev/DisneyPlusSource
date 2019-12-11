package p163g.p174d.p178b.p185g0;

import android.view.View;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.e4 */
/* compiled from: FastForwardViewDelegate */
public class C4995e4 extends C5170v3 {

    /* renamed from: X */
    private final C5300m f12261X;

    /* renamed from: Y */
    private final View f12262Y;

    public C4995e4(View view, C5300m mVar) {
        super(view, mVar);
        this.f12262Y = view;
        this.f12261X = mVar;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5062m1<Object>(this));
            mVar.mo17030f().mo16897d(this.f12488V);
            mVar.mo17046i0().mo30192f((Consumer<? super T>) new C4973b3<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16496a(float f) {
        this.f12262Y.setActivated(f > 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16497b(Object obj) {
        this.f12261X.mo17044i();
    }
}
