package p163g.p174d.p178b.p195l0;

import p163g.p174d.p178b.C5300m;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.subjects.C11976a;

/* renamed from: g.d.b.l0.b */
/* compiled from: UpNextTimeEvents */
public class C5299b {

    /* renamed from: a */
    private final C11976a<Long> f12702a = C11976a.m38563p();

    /* renamed from: b */
    private final C11976a<Boolean> f12703b = C11976a.m38563p();

    /* renamed from: c */
    private final C11976a<C5298a> f12704c = C11976a.m38563p();

    /* renamed from: d */
    private final CompositeDisposable f12705d;

    public C5299b(CompositeDisposable compositeDisposable) {
        this.f12705d = compositeDisposable;
    }

    /* renamed from: a */
    public void mo16928a(long j) {
        this.f12702a.onNext(Long.valueOf(j));
    }

    /* renamed from: b */
    public Observable<C5298a> mo16931b() {
        return C5300m.m17796a((Observable<T>) this.f12704c, this.f12705d);
    }

    /* renamed from: c */
    public Observable<Boolean> mo16932c() {
        return C5300m.m17796a((Observable<T>) this.f12703b, this.f12705d);
    }

    /* renamed from: a */
    public void mo16929a(C5298a aVar) {
        this.f12704c.onNext(aVar);
    }

    /* renamed from: a */
    public Observable<Long> mo16927a() {
        return C5300m.m17796a((Observable<T>) this.f12702a, this.f12705d);
    }

    /* renamed from: a */
    public void mo16930a(boolean z) {
        this.f12703b.onNext(Boolean.valueOf(z));
    }
}
