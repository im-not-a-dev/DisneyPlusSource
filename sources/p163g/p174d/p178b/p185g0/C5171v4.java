package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.v4 */
/* compiled from: PlayPauseViewDelegate */
public class C5171v4 extends C5170v3 {

    /* renamed from: X */
    private C5326w f12491X;

    /* renamed from: Y */
    private View f12492Y;

    /* renamed from: Z */
    boolean f12493Z;

    /* renamed from: a0 */
    int f12494a0 = -1;

    /* renamed from: b0 */
    int f12495b0 = -1;

    @SuppressLint({"CheckResult", "WrongConstant"})
    public C5171v4(View view, int i, C5326w wVar, C5300m mVar) {
        super(view, mVar);
        if (view != null) {
            this.f12492Y = view;
            this.f12491X = wVar;
            this.f12495b0 = i;
            this.f12494a0 = view.getVisibility();
            this.f12488V.mo30192f((Consumer<? super T>) new C5020h1<Object>(this));
            mVar.mo17030f().mo16907i(this.f12488V.mo30193g(new C5028i1(wVar)));
            mVar.mo17014b0().mo30192f((Consumer<? super T>) new C5132t<Object>(this));
            mVar.mo17019c0().mo30192f((Consumer<? super T>) new C4984d0<Object>(this));
            mVar.mo17046i0().mo30192f((Consumer<? super T>) new C5001f2<Object>(this));
            mVar.mo17029e0().mo30192f((Consumer<? super T>) new C5133t0<Object>(this));
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5126s1<Object>(this));
            mVar.mo17000a(126, 127, 85);
            mVar.mo17049j0().mo30192f((Consumer<? super T>) new C5077o1<Object>(this));
            mVar.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5010g1<Object>(this));
            mVar.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C5000f1<Object>(this));
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo16666b(Object obj) throws Exception {
        mo16674f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo16669c(Object obj) throws Exception {
        this.f12493Z = true;
    }

    /* renamed from: d */
    public /* synthetic */ void mo16671d(Object obj) throws Exception {
        this.f12493Z = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo16673e(Object obj) {
        mo16668c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo16674f() {
        if (!this.f12493Z && this.f12491X.mo7637r() == 1) {
            if (this.f12491X.mo7609a()) {
                this.f12491X.mo7611b();
            } else {
                this.f12491X.mo7628i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16662a(float f) {
        mo16668c();
        C5311f.m17966a(this.f12492Y, f == 1.0f && this.f12491X.mo7609a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16667b(boolean z) {
        mo16668c();
        View view = this.f12492Y;
        boolean z2 = true;
        if (this.f12491X.mo7637r() != 1 || !z) {
            z2 = false;
        }
        C5311f.m17966a(view, z2);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"WrongConstant"})
    /* renamed from: c */
    public void mo16668c() {
        mo16670d();
        this.f12492Y.setEnabled(true);
        this.f12492Y.setClickable(true);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"WrongConstant"})
    /* renamed from: d */
    public void mo16670d() {
        int i = this.f12494a0;
        if (i != -1) {
            this.f12492Y.setVisibility(i);
            this.f12494a0 = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"WrongConstant"})
    /* renamed from: e */
    public void mo16672e() {
        int i = this.f12495b0;
        if (i != -1) {
            this.f12492Y.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16663a(int i) {
        if (i == 126 || i == 127 || i == 85) {
            mo16674f();
            mo16665b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16665b() {
        this.f12487U.mo17030f().mo16891a(this.f12491X.mo7609a());
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public void mo16664a(boolean z) {
        this.f12494a0 = this.f12492Y.getVisibility();
        mo16672e();
        if (this.f12495b0 != 0) {
            this.f12492Y.setEnabled(false);
            this.f12492Y.setClickable(false);
            return;
        }
        C5311f.m17966a(this.f12492Y, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo16675f(Object obj) {
        C5311f.m17966a(this.f12492Y, false);
    }
}
