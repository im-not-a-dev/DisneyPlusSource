package p163g.p174d.p178b.p185g0;

import android.app.Activity;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.w3 */
/* compiled from: CloseViewDelegate */
public class C5183w3 extends C5170v3 {

    /* renamed from: X */
    private final Activity f12509X;

    public C5183w3(View view, Activity activity, C5300m mVar) {
        super(view, mVar);
        this.f12509X = activity;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C4972b2<Object>(this));
            mVar.mo17030f().mo16893b(this.f12488V);
        }
    }

    /* renamed from: b */
    public void mo16682b(Object obj) {
        this.f12509X.finish();
    }
}
