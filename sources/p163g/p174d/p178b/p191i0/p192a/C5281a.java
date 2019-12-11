package p163g.p174d.p178b.p191i0.p192a;

import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p193j0.C5290d;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: g.d.b.i0.a.a */
/* compiled from: MediaSourceEvents */
public class C5281a {

    /* renamed from: a */
    private CompositeDisposable f12638a;

    /* renamed from: b */
    private PublishSubject<C5283b> f12639b = PublishSubject.m38553q();

    /* renamed from: c */
    private PublishSubject<C5283b> f12640c = PublishSubject.m38553q();

    /* renamed from: d */
    private PublishSubject<C5283b> f12641d = PublishSubject.m38553q();

    /* renamed from: e */
    private PublishSubject<C5283b> f12642e = PublishSubject.m38553q();

    /* renamed from: f */
    private PublishSubject<C5283b> f12643f = PublishSubject.m38553q();

    /* renamed from: g.d.b.i0.a.a$a */
    /* compiled from: MediaSourceEvents */
    public enum C5282a {
        Unknown,
        Initial,
        Manual,
        Adaptive,
        TrickPlay
    }

    /* renamed from: g.d.b.i0.a.a$b */
    /* compiled from: MediaSourceEvents */
    public static class C5283b {

        /* renamed from: a */
        public final C5290d f12650a;

        /* renamed from: b */
        public final C5282a f12651b;

        public C5283b(C5290d dVar, C5282a aVar) {
            this.f12650a = dVar;
            this.f12651b = aVar;
        }
    }

    public C5281a(CompositeDisposable compositeDisposable) {
        this.f12638a = compositeDisposable;
    }

    /* renamed from: a */
    public Observable<C5283b> mo16848a() {
        return C5300m.m17796a((Observable<T>) this.f12641d, this.f12638a);
    }

    /* renamed from: b */
    public Observable<C5283b> mo16850b() {
        return C5300m.m17796a((Observable<T>) this.f12642e, this.f12638a);
    }

    /* renamed from: c */
    public Observable<C5283b> mo16852c() {
        return C5300m.m17796a((Observable<T>) this.f12640c, this.f12638a);
    }

    /* renamed from: d */
    public Observable<C5283b> mo16854d() {
        return C5300m.m17796a((Observable<T>) this.f12639b, this.f12638a);
    }

    /* renamed from: e */
    public Observable<C5283b> mo16856e() {
        return C5300m.m17796a((Observable<T>) this.f12643f, this.f12638a);
    }

    /* renamed from: a */
    public void mo16849a(C5290d dVar, C5282a aVar) {
        this.f12641d.onNext(new C5283b(dVar, aVar));
    }

    /* renamed from: b */
    public void mo16851b(C5290d dVar, C5282a aVar) {
        this.f12642e.onNext(new C5283b(dVar, aVar));
    }

    /* renamed from: c */
    public void mo16853c(C5290d dVar, C5282a aVar) {
        this.f12640c.onNext(new C5283b(dVar, aVar));
    }

    /* renamed from: d */
    public void mo16855d(C5290d dVar, C5282a aVar) {
        this.f12643f.onNext(new C5283b(dVar, aVar));
    }

    /* renamed from: e */
    public void mo16857e(C5290d dVar, C5282a aVar) {
        this.f12639b.onNext(new C5283b(dVar, aVar));
    }
}
