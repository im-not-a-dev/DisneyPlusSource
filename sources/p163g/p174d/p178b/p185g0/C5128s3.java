package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.s3 */
/* compiled from: ActivityLifecycleDelegate */
public class C5128s3 implements C5271z3 {

    /* renamed from: U */
    private Activity f12436U;

    /* renamed from: c */
    private C5326w f12437c;

    @SuppressLint({"CheckResult"})
    public C5128s3(C5326w wVar, Activity activity, C5300m mVar) {
        this.f12437c = wVar;
        this.f12436U = activity;
        mVar.mo16955L().mo30192f((Consumer<? super T>) new C5064m3<Object>(this));
        mVar.mo16957M().mo30192f((Consumer<? super T>) new C5021h2<Object>(this));
        mVar.mo17055m0().mo30192f((Consumer<? super T>) new C5069n0<Object>(this));
    }

    /* renamed from: a */
    public void mo16613a(Object obj) {
        this.f12437c.mo7641v();
    }

    /* renamed from: b */
    public void mo16614b(Object obj) {
        this.f12437c.mo7640u();
    }

    /* renamed from: c */
    public void mo16615c(Object obj) {
        this.f12436U.finish();
    }
}
