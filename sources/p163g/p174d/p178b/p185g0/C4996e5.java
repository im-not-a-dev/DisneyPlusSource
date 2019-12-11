package p163g.p174d.p178b.p185g0;

import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.e5 */
/* compiled from: SeekToLiveViewDelegate */
public class C4996e5 extends C5170v3 {

    /* renamed from: X */
    private C5326w f12263X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f12264Y;

    /* renamed from: g.d.b.g0.e5$a */
    /* compiled from: SeekToLiveViewDelegate */
    class C4997a implements Consumer<Object> {
        C4997a() {
        }

        public void accept(Object obj) throws Exception {
            C4996e5.this.f12264Y = false;
        }
    }

    public C4996e5(View view, C5326w wVar, C5300m mVar) {
        super(view, mVar);
        this.f12263X = wVar;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5070n1<Object>(this));
            mVar.mo17030f().mo16913l(this.f12488V);
            mVar.mo16939D().mo30192f((Consumer<? super T>) new C4997a<Object>());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo16499b(Object obj) throws Exception {
        mo16498b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16498b() {
        if (!this.f12264Y) {
            this.f12263X.mo7635p();
            this.f12264Y = true;
        }
    }
}
