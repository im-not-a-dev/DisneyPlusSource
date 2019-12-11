package p163g.p174d.p178b.p199y;

import android.annotation.SuppressLint;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.subjects.C11976a;

/* renamed from: g.d.b.y.i */
/* compiled from: AdEvents */
public class C5338i {

    /* renamed from: a */
    private final C11976a<C5339a> f12815a = C11976a.m38563p();

    /* renamed from: b */
    private final CompositeDisposable f12816b;

    /* renamed from: g.d.b.y.i$a */
    /* compiled from: AdEvents */
    private enum C5339a {
        Playing,
        Paused,
        End,
        AllAdsComplete
    }

    public C5338i(CompositeDisposable compositeDisposable) {
        this.f12816b = compositeDisposable;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m18071e(C5339a aVar) throws Exception {
        return aVar == C5339a.Paused;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m18073g(C5339a aVar) throws Exception {
        return aVar == C5339a.Playing;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public Observable<Object> mo17098a() {
        return m18070e().mo30150a((C11952h<? super T>) C5333d.f12810c).mo30193g(C5331b.f12808c);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: b */
    public Observable<Object> mo17099b() {
        return m18070e().mo30150a((C11952h<? super T>) C5336g.f12813c).mo30193g(C5335f.f12812c);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: c */
    public Observable<Object> mo17100c() {
        return m18070e().mo30150a((C11952h<? super T>) C5334e.f12811c).mo30193g(C5332c.f12809c);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    public Observable<Object> mo17101d() {
        return m18070e().mo30150a((C11952h<? super T>) C5330a.f12807c).mo30193g(C5337h.f12814c);
    }

    /* renamed from: e */
    private Observable<C5339a> m18070e() {
        return C5300m.m17796a((Observable<T>) this.f12815a, this.f12816b);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m18066a(C5339a aVar) throws Exception {
        return aVar == C5339a.AllAdsComplete;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m18068c(C5339a aVar) throws Exception {
        return aVar == C5339a.End;
    }
}
