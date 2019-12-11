package p163g.p174d.p178b.p190h0;

import p163g.p174d.p178b.C5300m;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: g.d.b.h0.a */
/* compiled from: Id3Observable */
public class C5274a extends C5276c implements Consumer<C5275b> {

    /* renamed from: U */
    private final PublishSubject<C5277d> f12628U = PublishSubject.m38553q();

    /* renamed from: V */
    private final PublishSubject<C5279f> f12629V = PublishSubject.m38553q();

    /* renamed from: W */
    private final PublishSubject<C5278e> f12630W = PublishSubject.m38553q();

    /* renamed from: X */
    private final PublishSubject<C5275b> f12631X = PublishSubject.m38553q();

    /* renamed from: c */
    private final CompositeDisposable f12632c;

    public C5274a(CompositeDisposable compositeDisposable) {
        this.f12632c = compositeDisposable;
    }

    /* renamed from: a */
    public Observable<C5275b> mo16832a() {
        return C5300m.m17796a((Observable<T>) this.f12631X, this.f12632c);
    }

    /* renamed from: b */
    public Observable<C5277d> mo16837b() {
        return C5300m.m17796a((Observable<T>) this.f12628U, this.f12632c);
    }

    /* renamed from: c */
    public Observable<C5278e> mo16839c() {
        return C5300m.m17796a((Observable<T>) this.f12630W, this.f12632c);
    }

    /* renamed from: d */
    public Observable<C5279f> mo16840d() {
        return C5300m.m17796a((Observable<T>) this.f12629V, this.f12632c);
    }

    /* renamed from: a */
    public void mo16834a(C5277d dVar) {
        this.f12628U.onNext(dVar);
    }

    /* renamed from: b */
    public void accept(C5275b bVar) {
        bVar.mo16842a(this);
    }

    /* renamed from: a */
    public void mo16836a(C5279f fVar) {
        this.f12629V.onNext(fVar);
    }

    /* renamed from: a */
    public void mo16835a(C5278e eVar) {
        this.f12630W.onNext(eVar);
    }

    /* renamed from: a */
    public void mo16833a(C5275b bVar) {
        this.f12631X.onNext(bVar);
    }
}
