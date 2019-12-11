package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5301a;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.a4 */
/* compiled from: ControlsTimerDelegate */
public class C4965a4 implements C5271z3 {

    /* renamed from: U */
    private final C5300m f12200U;

    /* renamed from: V */
    Disposable f12201V;

    /* renamed from: c */
    private final int f12202c;

    @SuppressLint({"CheckResult"})
    public C4965a4(int i, C5300m mVar) {
        this.f12202c = i;
        this.f12200U = mVar;
        if (i > 0) {
            mVar.mo17014b0().mo30192f((Consumer<? super T>) new C5026i<Object>(this));
            mVar.mo17076x().mo30192f((Consumer<? super T>) new C5030i3<Object>(this));
            mVar.mo17030f().mo16914m().mo30192f((Consumer<? super T>) new C5127s2<Object>(this));
            mVar.mo16957M().mo30192f((Consumer<? super T>) new C5042k0<Object>(this));
            mVar.mo17074w().mo30192f((Consumer<? super T>) new C5086p2<Object>(this));
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5219y0<Object>(this));
            mVar.mo16998a(C4974b4.f12212d0);
            mVar.mo16934A0().mo30192f((Consumer<? super T>) new C5182w2<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16440a(C5301a aVar) {
        if (aVar.f12782b) {
            mo16447c();
        } else {
            mo16444b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16445b(Object obj) {
        mo16444b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16448c(Object obj) {
        mo16444b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16446b(boolean z) {
        if (z) {
            mo16444b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16447c() {
        Disposable disposable = this.f12201V;
        if (disposable != null) {
            this.f12200U.mo17009b(disposable);
            this.f12201V.dispose();
            this.f12201V = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16444b() {
        mo16447c();
        this.f12201V = Observable.m38310c((long) this.f12202c, TimeUnit.SECONDS).mo30192f((Consumer<? super T>) new C5179w<Object>(this));
        this.f12200U.mo16994a(this.f12201V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16443a(boolean z) {
        if (z) {
            mo16444b();
        } else {
            mo16447c();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo16441a(Long l) throws Exception {
        mo16438a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16442a(Object obj) {
        mo16447c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16438a() {
        this.f12200U.mo16970S0();
        mo16447c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16439a(int i) {
        if (C4974b4.f12212d0.contains(Integer.valueOf(i))) {
            mo16444b();
        }
    }
}
