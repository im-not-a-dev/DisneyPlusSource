package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.n4 */
/* compiled from: LiveIndicatorViewDelegate */
public class C5073n4 implements C5271z3 {

    /* renamed from: U */
    boolean f12363U;

    /* renamed from: V */
    boolean f12364V;

    /* renamed from: c */
    private View f12365c;

    @SuppressLint({"CheckResult"})
    public C5073n4(View view, C5300m mVar) {
        this.f12365c = view;
        mVar.mo16961O().mo30192f((Consumer<? super T>) new C4977c0<Object>(this));
        mVar.mo16939D().mo30192f((Consumer<? super T>) new C5134t1<Object>(this));
        mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5068n<Object>(this));
        mVar.mo17030f().mo16908j().mo30192f((Consumer<? super T>) new C4963a2<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16554a(boolean z) {
        if (!this.f12363U) {
            C5311f.m17966a(this.f12365c, z && !this.f12364V);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16556b(boolean z) {
        this.f12364V = z;
        this.f12363U = false;
        if (z) {
            C5311f.m17966a(this.f12365c, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16553a(Object obj) {
        this.f12363U = false;
        C5311f.m17966a(this.f12365c, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16555b(Object obj) {
        this.f12363U = true;
        C5311f.m17966a(this.f12365c, true);
    }
}
