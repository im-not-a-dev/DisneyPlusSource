package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import p163g.p174d.p178b.C5300m;
import p163g.p494k.p495a.p497b.C11692a;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.v3 */
/* compiled from: ClickableDelegate */
public abstract class C5170v3 implements C5271z3 {

    /* renamed from: U */
    protected final C5300m f12487U;

    /* renamed from: V */
    protected Observable<Object> f12488V = this.f12490c;

    /* renamed from: W */
    protected View f12489W;

    /* renamed from: c */
    private final Observable<Object> f12490c = Observable.m38314m();

    @SuppressLint({"CheckResult"})
    public C5170v3(View view, C5300m mVar) {
        this.f12489W = view;
        this.f12487U = mVar;
        if (view != null) {
            Observable i = C11692a.m37643a(view).mo30197i();
            mVar.getClass();
            this.f12488V = i.mo30188e((Consumer<? super Disposable>) new C5071n2<Object>(mVar));
            this.f12488V.mo30192f((Consumer<? super T>) new C5166v<Object>(this));
        }
    }

    /* renamed from: a */
    public void mo16567a() {
    }

    /* renamed from: a */
    public /* synthetic */ void mo16661a(Object obj) throws Exception {
        mo16567a();
    }
}
