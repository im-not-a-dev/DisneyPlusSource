package p520io.reactivex;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12041d;
import p520io.reactivex.p531y.p535d.C12055d;
import p520io.reactivex.p531y.p536e.p539c.C12222a0;
import p520io.reactivex.p531y.p536e.p539c.C12225b;
import p520io.reactivex.p531y.p536e.p539c.C12226b0;
import p520io.reactivex.p531y.p536e.p539c.C12229c;
import p520io.reactivex.p531y.p536e.p539c.C12231c0;
import p520io.reactivex.p531y.p536e.p539c.C12233d;
import p520io.reactivex.p531y.p536e.p539c.C12234d0;
import p520io.reactivex.p531y.p536e.p539c.C12239e0;
import p520io.reactivex.p531y.p536e.p539c.C12241f;
import p520io.reactivex.p531y.p536e.p539c.C12243f0;
import p520io.reactivex.p531y.p536e.p539c.C12245g;
import p520io.reactivex.p531y.p536e.p539c.C12247h;
import p520io.reactivex.p531y.p536e.p539c.C12248i;
import p520io.reactivex.p531y.p536e.p539c.C12249j;
import p520io.reactivex.p531y.p536e.p539c.C12253l;
import p520io.reactivex.p531y.p536e.p539c.C12255m;
import p520io.reactivex.p531y.p536e.p539c.C12258n;
import p520io.reactivex.p531y.p536e.p539c.C12261o;
import p520io.reactivex.p531y.p536e.p539c.C12264p;
import p520io.reactivex.p531y.p536e.p539c.C12269s;
import p520io.reactivex.p531y.p536e.p539c.C12271t;
import p520io.reactivex.p531y.p536e.p539c.C12272u;
import p520io.reactivex.p531y.p536e.p539c.C12274v;
import p520io.reactivex.p531y.p536e.p539c.C12276w;
import p520io.reactivex.p531y.p536e.p539c.C12278x;
import p520io.reactivex.p531y.p536e.p539c.C12281y;
import p520io.reactivex.p531y.p536e.p539c.C12283z;
import p520io.reactivex.p531y.p536e.p540d.C12290c;

/* renamed from: io.reactivex.Maybe */
public abstract class Maybe<T> implements MaybeSource<T> {
    /* renamed from: a */
    public static <T> Flowable<T> m38251a(MaybeSource<? extends T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        C12036b.m38663a(maybeSource, "source1 is null");
        C12036b.m38663a(maybeSource2, "source2 is null");
        return m38252a((MaybeSource<? extends T>[]) new MaybeSource[]{maybeSource, maybeSource2});
    }

    /* renamed from: b */
    public static <T> Maybe<T> m38257b(Callable<? extends T> callable) {
        C12036b.m38663a(callable, "callable is null");
        return C11915a.m38447a((Maybe<T>) new C12264p<T>(callable));
    }

    /* renamed from: c */
    public static <T> Maybe<T> m38258c(T t) {
        C12036b.m38663a(t, "item is null");
        return C11915a.m38447a((Maybe<T>) new C12271t<T>(t));
    }

    /* renamed from: h */
    public static <T> Maybe<T> m38259h() {
        return C11915a.m38447a((Maybe<T>) C12247h.f28285c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29936b(C11958l<? super T> lVar);

    /* renamed from: d */
    public final <R> Single<R> mo30128d(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38449a((Single<T>) new C12255m<T>(this, function));
    }

    /* renamed from: e */
    public final <R> Maybe<R> mo30129e(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38447a((Maybe<T>) new C12258n<T>(this, function));
    }

    /* renamed from: f */
    public final <R> Maybe<R> mo30131f(Function<? super T, ? extends R> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38447a((Maybe<T>) new C12272u<T>(this, function));
    }

    /* renamed from: g */
    public final Single<T> mo30134g() {
        return C11915a.m38449a((Single<T>) new C12243f0<T>(this, null));
    }

    /* renamed from: g */
    public final Maybe<T> mo30133g(Function<? super Throwable, ? extends MaybeSource<? extends T>> function) {
        C12036b.m38663a(function, "resumeFunction is null");
        return C11915a.m38447a((Maybe<T>) new C12278x<T>(this, function, true));
    }

    /* renamed from: b */
    public final T mo30121b() {
        C12055d dVar = new C12055d();
        mo30113a((C11958l<? super T>) dVar);
        return dVar.mo30370a();
    }

    /* renamed from: c */
    public final Maybe<T> mo30124c(C11945a aVar) {
        Consumer b = C12015a.m38648b();
        Consumer b2 = C12015a.m38648b();
        Consumer b3 = C12015a.m38648b();
        C11945a aVar2 = C12015a.f27744c;
        C12036b.m38663a(aVar, "onDispose is null");
        C12281y yVar = new C12281y(this, b, b2, b3, aVar2, aVar2, aVar);
        return C11915a.m38447a((Maybe<T>) yVar);
    }

    /* renamed from: d */
    public final Maybe<T> mo30127d() {
        return mo30118b(C12015a.m38645a());
    }

    /* renamed from: e */
    public final Disposable mo30130e() {
        return mo30111a(C12015a.m38648b(), C12015a.f27746e, C12015a.f27744c);
    }

    /* renamed from: f */
    public final Observable<T> mo30132f() {
        if (this instanceof C12041d) {
            return ((C12041d) this).mo30364a();
        }
        return C11915a.m38448a((Observable<T>) new C12239e0<T>(this));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38252a(MaybeSource<? extends T>... maybeSourceArr) {
        C12036b.m38663a(maybeSourceArr, "sources is null");
        if (maybeSourceArr.length == 0) {
            return Flowable.m38209i();
        }
        if (maybeSourceArr.length == 1) {
            return C11915a.m38446a((Flowable<T>) new C12234d0<T>(maybeSourceArr[0]));
        }
        return C11915a.m38446a((Flowable<T>) new C12229c<T>(maybeSourceArr));
    }

    /* renamed from: b */
    public final Maybe<T> mo30117b(C11945a aVar) {
        Consumer b = C12015a.m38648b();
        Consumer b2 = C12015a.m38648b();
        Consumer b3 = C12015a.m38648b();
        C12036b.m38663a(aVar, "onComplete is null");
        C11945a aVar2 = aVar;
        C11945a aVar3 = C12015a.f27744c;
        C12281y yVar = new C12281y(this, b, b2, b3, aVar2, aVar3, aVar3);
        return C11915a.m38447a((Maybe<T>) yVar);
    }

    /* renamed from: c */
    public final Maybe<T> mo30123c(Consumer<? super T> consumer) {
        Consumer b = C12015a.m38648b();
        C12036b.m38663a(consumer, "onSuccess is null");
        Consumer consumer2 = consumer;
        Consumer b2 = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        C12281y yVar = new C12281y(this, b, consumer2, b2, aVar, aVar, aVar);
        return C11915a.m38447a((Maybe<T>) yVar);
    }

    /* renamed from: a */
    public static <T> Maybe<T> m38256a(Callable<? extends MaybeSource<? extends T>> callable) {
        C12036b.m38663a(callable, "maybeSupplier is null");
        return C11915a.m38447a((Maybe<T>) new C12233d<T>(callable));
    }

    /* renamed from: a */
    public static <T> Maybe<T> m38255a(Throwable th) {
        C12036b.m38663a(th, "exception is null");
        return C11915a.m38447a((Maybe<T>) new C12248i<T>(th));
    }

    /* renamed from: b */
    public final Maybe<T> mo30116b(Consumer<? super Disposable> consumer) {
        C12036b.m38663a(consumer, "onSubscribe is null");
        Consumer consumer2 = consumer;
        Consumer b = C12015a.m38648b();
        Consumer b2 = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        C12281y yVar = new C12281y(this, consumer2, b, b2, aVar, aVar, aVar);
        return C11915a.m38447a((Maybe<T>) yVar);
    }

    /* renamed from: a */
    public static Maybe<Long> m38253a(long j, TimeUnit timeUnit) {
        return m38254a(j, timeUnit, C11934b.m38498a());
    }

    /* renamed from: c */
    public final <R> Observable<R> mo30125c(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12290c<T>(this, function));
    }

    /* renamed from: a */
    public static Maybe<Long> m38254a(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38447a((Maybe<T>) new C12231c0<T>(Math.max(0, j), timeUnit, rVar));
    }

    /* renamed from: c */
    public final Completable mo30122c() {
        return C11915a.m38444a((Completable) new C12269s(this));
    }

    /* renamed from: b */
    public final Completable mo30114b(Function<? super T, ? extends CompletableSource> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38444a((Completable) new C12253l(this, function));
    }

    /* renamed from: c */
    public final <E extends C11958l<? super T>> E mo30126c(E e) {
        mo30113a((C11958l<? super T>) e);
        return e;
    }

    /* renamed from: a */
    public final <R> R mo30112a(C11957k<T, ? extends R> kVar) {
        C12036b.m38663a(kVar, "converter is null");
        return kVar.mo29923a(this);
    }

    /* renamed from: a */
    public final Maybe<T> mo30108a(T t) {
        C12036b.m38663a(t, "defaultItem is null");
        return mo30115b((MaybeSource<? extends T>) m38258c(t));
    }

    /* renamed from: b */
    public final Single<T> mo30120b(T t) {
        C12036b.m38663a(t, "defaultValue is null");
        return C11915a.m38449a((Single<T>) new C12243f0<T>(this, t));
    }

    /* renamed from: a */
    public final Maybe<T> mo30104a(C11945a aVar) {
        C12036b.m38663a(aVar, "onFinally is null");
        return C11915a.m38447a((Maybe<T>) new C12241f<T>(this, aVar));
    }

    /* renamed from: b */
    public final Maybe<T> mo30118b(C11952h<? super Throwable> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38447a((Maybe<T>) new C12276w<T>(this, hVar));
    }

    /* renamed from: a */
    public final Maybe<T> mo30102a(Consumer<? super Throwable> consumer) {
        Consumer b = C12015a.m38648b();
        Consumer b2 = C12015a.m38648b();
        C12036b.m38663a(consumer, "onError is null");
        Consumer consumer2 = consumer;
        C11945a aVar = C12015a.f27744c;
        C12281y yVar = new C12281y(this, b, b2, consumer2, aVar, aVar, aVar);
        return C11915a.m38447a((Maybe<T>) yVar);
    }

    /* renamed from: b */
    public final Maybe<T> mo30119b(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38447a((Maybe<T>) new C12283z<T>(this, rVar));
    }

    /* renamed from: b */
    public final Maybe<T> mo30115b(MaybeSource<? extends T> maybeSource) {
        C12036b.m38663a(maybeSource, "other is null");
        return C11915a.m38447a((Maybe<T>) new C12222a0<T>(this, maybeSource));
    }

    /* renamed from: a */
    public final Maybe<T> mo30105a(C11946b<? super T, ? super Throwable> bVar) {
        C12036b.m38663a(bVar, "onEvent is null");
        return C11915a.m38447a((Maybe<T>) new C12245g<T>(this, bVar));
    }

    /* renamed from: a */
    public final Maybe<T> mo30106a(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38447a((Maybe<T>) new C12249j<T>(this, hVar));
    }

    /* renamed from: a */
    public final <R> Maybe<R> mo30103a(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38447a((Maybe<T>) new C12261o<T>(this, function));
    }

    /* renamed from: a */
    public final Maybe<T> mo30107a(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38447a((Maybe<T>) new C12274v<T>(this, rVar));
    }

    /* renamed from: a */
    public final Maybe<T> mo30101a(MaybeSource<? extends T> maybeSource) {
        C12036b.m38663a(maybeSource, "next is null");
        return mo30133g(C12015a.m38650b(maybeSource));
    }

    /* renamed from: a */
    public final Disposable mo30110a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo30111a(consumer, consumer2, C12015a.f27744c);
    }

    /* renamed from: a */
    public final Disposable mo30111a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar) {
        C12036b.m38663a(consumer, "onSuccess is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        return (Disposable) mo30126c((E) new C12225b(consumer, consumer2, aVar));
    }

    /* renamed from: a */
    public final void mo30113a(C11958l<? super T> lVar) {
        C12036b.m38663a(lVar, "observer is null");
        C11958l a = C11915a.m38450a(this, lVar);
        C12036b.m38663a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo29936b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12003b.m38614b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final Single<T> mo30109a(SingleSource<? extends T> singleSource) {
        C12036b.m38663a(singleSource, "other is null");
        return C11915a.m38449a((Single<T>) new C12226b0<T>(this, singleSource));
    }
}
