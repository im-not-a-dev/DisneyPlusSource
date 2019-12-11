package p163g.p174d.p178b.p185g0;

import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.p4 */
/* compiled from: MuteViewDelegate */
public class C5088p4 extends C5170v3 {

    /* renamed from: X */
    private C5326w f12388X;

    /* renamed from: Y */
    private View f12389Y;

    public C5088p4(View view, C5326w wVar, C5300m mVar) {
        super(view, mVar);
        this.f12388X = wVar;
        this.f12389Y = view;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5167v0<Object>(this));
            mVar.mo17030f().mo16905h(this.f12488V.mo30193g(new C5192x0(wVar)));
            mVar.mo16948H0().mo30192f((Consumer<? super T>) new C5180w0<Object>(this));
            m17371a(wVar.mo7630k());
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m17370a(C5326w wVar, Object obj) throws Exception {
        return Boolean.valueOf(wVar.mo7630k() == 0.0f);
    }

    /* renamed from: b */
    public /* synthetic */ void mo16570b(Object obj) throws Exception {
        mo16569b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17371a(float f) {
        C5311f.m17966a(this.f12389Y, f <= 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16569b() {
        if (this.f12388X.mo7630k() == 0.0f) {
            this.f12388X.mo7599a(1.0f);
        } else {
            this.f12388X.mo7599a(0.0f);
        }
    }
}
