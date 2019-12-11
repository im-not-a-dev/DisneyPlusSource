package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p185g0.p187w5.C5186a;
import p163g.p174d.p178b.p185g0.p187w5.C5187b;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.f4 */
/* compiled from: FullScreenViewDelegate */
public class C5003f4 extends C5170v3 {

    /* renamed from: X */
    WeakReference<Activity> f12271X;

    /* renamed from: Y */
    private View f12272Y;

    /* renamed from: Z */
    private C5186a f12273Z;

    /* renamed from: a0 */
    private C5300m f12274a0;

    /* renamed from: b0 */
    private final boolean f12275b0;

    @SuppressLint({"CheckResult"})
    public C5003f4(View view, boolean z, C5186a aVar, Activity activity, C5300m mVar) {
        super(view, mVar);
        this.f12272Y = view;
        this.f12273Z = aVar;
        this.f12274a0 = mVar;
        this.f12275b0 = z;
        if (view != null) {
            this.f12271X = new WeakReference<>(activity);
            this.f12488V.mo30192f((Consumer<? super T>) new C5035j0<Object>(this));
            mVar.mo17030f().mo16899e(this.f12488V.mo30193g(new C5027i0(this)));
            C5311f.m17966a(view, C5187b.m17511a((Context) this.f12271X.get()));
            mVar.mo16978X().mo30192f((Consumer<? super T>) new C5034j<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16500a(int i) {
        C5311f.m17966a(this.f12272Y, i == 2);
    }

    /* renamed from: b */
    public /* synthetic */ void mo16502b(Object obj) throws Exception {
        mo16501b();
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo16503c(Object obj) throws Exception {
        return Boolean.valueOf(!C5187b.m17511a((Context) this.f12271X.get()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16501b() {
        C5187b.m17510a((Activity) this.f12271X.get(), this.f12274a0, this.f12275b0, this.f12273Z);
    }
}
