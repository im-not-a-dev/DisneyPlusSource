package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.o4 */
/* compiled from: LoadingIndicatorDelegate */
public class C5080o4 implements C5271z3 {

    /* renamed from: U */
    private final boolean f12372U;

    /* renamed from: V */
    private final C5326w f12373V;

    /* renamed from: c */
    private final View f12374c;

    @SuppressLint({"CheckResult"})
    public C5080o4(View view, boolean z, C5326w wVar, C5300m mVar) {
        this.f12374c = view;
        this.f12372U = z;
        this.f12373V = wVar;
        mVar.mo17029e0().mo30192f((Consumer<? super T>) new C4969b<Object>(this));
        mVar.mo17049j0().mo30192f((Consumer<? super T>) new C4990e<Object>(this));
        mVar.mo17014b0().mo30192f((Consumer<? super T>) new C4998f<Object>(this));
        mVar.mo17024d0().mo30192f((Consumer<? super T>) new C5117r<Object>(this));
        mVar.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C4976c<Object>(this));
    }

    /* renamed from: a */
    public void mo16559a(boolean z) {
        C5311f.m17965a(this.f12374c, 8);
    }

    /* renamed from: b */
    public void mo16561b(boolean z) {
        if (z) {
            C5311f.m17965a(this.f12374c, 0);
        }
    }

    /* renamed from: c */
    public void mo16562c(Object obj) {
        if (this.f12372U) {
            C5311f.m17965a(this.f12374c, 0);
        }
    }

    /* renamed from: a */
    public void mo16558a(Object obj) {
        C5311f.m17965a(this.f12374c, 8);
    }

    /* renamed from: b */
    public void mo16560b(Object obj) {
        if (!this.f12373V.mo7609a()) {
            C5311f.m17965a(this.f12374c, 0);
        }
    }
}
