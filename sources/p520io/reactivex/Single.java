package p520io.reactivex;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.C14313b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12039b;
import p520io.reactivex.p531y.p534c.C12040c;
import p520io.reactivex.p531y.p534c.C12041d;
import p520io.reactivex.p531y.p535d.C12055d;
import p520io.reactivex.p531y.p535d.C12057f;
import p520io.reactivex.p531y.p536e.p537a.C12079k;
import p520io.reactivex.p531y.p536e.p538b.C12124c;
import p520io.reactivex.p531y.p536e.p538b.C12163j0;
import p520io.reactivex.p531y.p536e.p539c.C12251k;
import p520io.reactivex.p531y.p536e.p539c.C12265q;
import p520io.reactivex.p531y.p536e.p540d.C12292d;
import p520io.reactivex.p531y.p536e.p542f.C12419a;
import p520io.reactivex.p531y.p536e.p542f.C12421a0;
import p520io.reactivex.p531y.p536e.p542f.C12423b;
import p520io.reactivex.p531y.p536e.p542f.C12425b0;
import p520io.reactivex.p531y.p536e.p542f.C12427c;
import p520io.reactivex.p531y.p536e.p542f.C12429c0;
import p520io.reactivex.p531y.p536e.p542f.C12431d;
import p520io.reactivex.p531y.p536e.p542f.C12432d0;
import p520io.reactivex.p531y.p536e.p542f.C12437e0;
import p520io.reactivex.p531y.p536e.p542f.C12439f;
import p520io.reactivex.p531y.p536e.p542f.C12441f0;
import p520io.reactivex.p531y.p536e.p542f.C12443g;
import p520io.reactivex.p531y.p536e.p542f.C12445g0;
import p520io.reactivex.p531y.p536e.p542f.C12447h;
import p520io.reactivex.p531y.p536e.p542f.C12449h0;
import p520io.reactivex.p531y.p536e.p542f.C12453i;
import p520io.reactivex.p531y.p536e.p542f.C12455i0;
import p520io.reactivex.p531y.p536e.p542f.C12457j;
import p520io.reactivex.p531y.p536e.p542f.C12459k;
import p520io.reactivex.p531y.p536e.p542f.C12461l;
import p520io.reactivex.p531y.p536e.p542f.C12463m;
import p520io.reactivex.p531y.p536e.p542f.C12465n;
import p520io.reactivex.p531y.p536e.p542f.C12466o;
import p520io.reactivex.p531y.p536e.p542f.C12469p;
import p520io.reactivex.p531y.p536e.p542f.C12471q;
import p520io.reactivex.p531y.p536e.p542f.C12473r;
import p520io.reactivex.p531y.p536e.p542f.C12476s;
import p520io.reactivex.p531y.p536e.p542f.C12478t;
import p520io.reactivex.p531y.p536e.p542f.C12479u;
import p520io.reactivex.p531y.p536e.p542f.C12480v;
import p520io.reactivex.p531y.p536e.p542f.C12482w;
import p520io.reactivex.p531y.p536e.p542f.C12483x;
import p520io.reactivex.p531y.p536e.p542f.C12485y;
import p520io.reactivex.p531y.p536e.p542f.C12486z;
import p520io.reactivex.p531y.p547j.C12547g;

/* renamed from: io.reactivex.Single */
public abstract class Single<T> implements SingleSource<T> {
    /* renamed from: a */
    public static <T> Single<T> m38393a(Iterable<? extends SingleSource<? extends T>> iterable) {
        C12036b.m38663a(iterable, "sources is null");
        return C11915a.m38449a((Single<T>) new C12419a<T>(null, iterable));
    }

    /* renamed from: b */
    public static <T> Single<T> m38400b(Callable<? extends Throwable> callable) {
        C12036b.m38663a(callable, "errorSupplier is null");
        return C11915a.m38449a((Single<T>) new C12465n<T>(callable));
    }

    /* renamed from: c */
    public static <T> Single<T> m38401c(Callable<? extends T> callable) {
        C12036b.m38663a(callable, "callable is null");
        return C11915a.m38449a((Single<T>) new C12478t<T>(callable));
    }

    /* renamed from: j */
    public static <T> Single<T> m38402j() {
        return C11915a.m38449a(C12485y.f28907c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17771b(C11987u<? super T> uVar);

    /* renamed from: d */
    public final Single<T> mo30226d() {
        return C11915a.m38449a((Single<T>) new C12423b<T>(this));
    }

    /* renamed from: e */
    public final <R> Flowable<R> mo30229e(Function<? super T, ? extends C14313b<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38446a((Flowable<T>) new C12476s<T>(this, function));
    }

    /* renamed from: f */
    public final <U> Observable<U> mo30231f(Function<? super T, ? extends Iterable<? extends U>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12471q<T>(this, function));
    }

    /* renamed from: g */
    public final <R> Single<R> mo30233g(Function<? super T, ? extends R> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38449a((Single<T>) new C12483x<T>(this, function));
    }

    /* renamed from: h */
    public final Single<T> mo30235h(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        C12036b.m38663a(function, "resumeFunctionInCaseOfError is null");
        return C11915a.m38449a((Single<T>) new C12425b0<T>(this, function));
    }

    /* renamed from: i */
    public final Single<T> mo30237i(Function<Throwable, ? extends T> function) {
        C12036b.m38663a(function, "resumeFunction is null");
        return C11915a.m38449a((Single<T>) new C12421a0<T>(this, function, null));
    }

    /* renamed from: d */
    public final Single<T> mo30227d(Consumer<? super T> consumer) {
        C12036b.m38663a(consumer, "onSuccess is null");
        return C11915a.m38449a((Single<T>) new C12463m<T>(this, consumer));
    }

    /* renamed from: j */
    public final Single<T> mo30238j(Function<? super Flowable<Throwable>, ? extends C14313b<?>> function) {
        return m38388a(mo30232g().mo30099f(function));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38385a(C14313b<? extends SingleSource<? extends T>> bVar) {
        return m38386a(bVar, 2);
    }

    /* renamed from: b */
    public static <T> Single<T> m38399b(T t) {
        C12036b.m38663a(t, "item is null");
        return C11915a.m38449a((Single<T>) new C12482w<T>(t));
    }

    /* renamed from: c */
    public final Single<T> mo30222c(Consumer<? super Disposable> consumer) {
        C12036b.m38663a(consumer, "onSubscribe is null");
        return C11915a.m38449a((Single<T>) new C12461l<T>(this, consumer));
    }

    /* renamed from: e */
    public final Completable mo30228e() {
        return C11915a.m38444a((Completable) new C12079k(this));
    }

    /* renamed from: f */
    public final Flowable<T> mo30230f() {
        return mo30232g().mo30098f();
    }

    /* renamed from: g */
    public final Flowable<T> mo30232g() {
        if (this instanceof C12039b) {
            return ((C12039b) this).mo30362b();
        }
        return C11915a.m38446a((Flowable<T>) new C12441f0<T>(this));
    }

    /* renamed from: h */
    public final Maybe<T> mo30234h() {
        if (this instanceof C12040c) {
            return ((C12040c) this).mo30363c();
        }
        return C11915a.m38447a((Maybe<T>) new C12265q<T>(this));
    }

    /* renamed from: i */
    public final Observable<T> mo30236i() {
        if (this instanceof C12041d) {
            return ((C12041d) this).mo30364a();
        }
        return C11915a.m38448a((Observable<T>) new C12445g0<T>(this));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38386a(C14313b<? extends SingleSource<? extends T>> bVar, int i) {
        C12036b.m38663a(bVar, "sources is null");
        C12036b.m38660a(i, "prefetch");
        return C11915a.m38446a((Flowable<T>) new C12124c<T>(bVar, C12480v.m39198a(), i, C12547g.IMMEDIATE));
    }

    /* renamed from: d */
    public final <R> Observable<R> mo30225d(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12292d<T>(this, function));
    }

    /* renamed from: b */
    public static Single<Long> m38397b(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38449a((Single<T>) new C12437e0<T>(j, timeUnit, rVar));
    }

    /* renamed from: c */
    public final Single<T> mo30223c(C11945a aVar) {
        C12036b.m38663a(aVar, "onDispose is null");
        return C11915a.m38449a((Single<T>) new C12453i<T>(this, aVar));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38384a(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        C12036b.m38663a(singleSource, "source1 is null");
        C12036b.m38663a(singleSource2, "source2 is null");
        return m38385a((C14313b<? extends SingleSource<? extends T>>) Flowable.m38204a((T[]) new SingleSource[]{singleSource, singleSource2}));
    }

    /* renamed from: c */
    public final <R> Maybe<R> mo30221c(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38447a((Maybe<T>) new C12473r<T>(this, function));
    }

    /* renamed from: b */
    public final Single<T> mo30219b(C11945a aVar) {
        C12036b.m38663a(aVar, "onFinally is null");
        return C11915a.m38449a((Single<T>) new C12447h<T>(this, aVar));
    }

    /* renamed from: c */
    public final T mo30224c() {
        C12055d dVar = new C12055d();
        mo30216a((C11987u<? super T>) dVar);
        return dVar.mo30370a();
    }

    /* renamed from: a */
    public static <T> Single<T> m38392a(C11988v<T> vVar) {
        C12036b.m38663a(vVar, "source is null");
        return C11915a.m38449a((Single<T>) new C12427c<T>(vVar));
    }

    /* renamed from: b */
    public final Single<T> mo30218b(Consumer<? super Throwable> consumer) {
        C12036b.m38663a(consumer, "onError is null");
        return C11915a.m38449a((Single<T>) new C12457j<T>(this, consumer));
    }

    /* renamed from: a */
    public static <T> Single<T> m38396a(Callable<? extends SingleSource<? extends T>> callable) {
        C12036b.m38663a(callable, "singleSupplier is null");
        return C11915a.m38449a((Single<T>) new C12431d<T>(callable));
    }

    /* renamed from: b */
    public final Completable mo30217b(Function<? super T, ? extends CompletableSource> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38444a((Completable) new C12469p(this, function));
    }

    /* renamed from: a */
    public static <T> Single<T> m38395a(Throwable th) {
        C12036b.m38663a(th, "exception is null");
        return m38400b(C12015a.m38647a(th));
    }

    /* renamed from: b */
    public final Single<T> mo30220b(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38449a((Single<T>) new C12429c0<T>(this, rVar));
    }

    /* renamed from: a */
    public static Single<Long> m38387a(long j, TimeUnit timeUnit) {
        return m38397b(j, timeUnit, C11934b.m38498a());
    }

    /* renamed from: b */
    private Single<T> m38398b(long j, TimeUnit timeUnit, C11969r rVar, SingleSource<? extends T> singleSource) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        C12432d0 d0Var = new C12432d0(this, j, timeUnit, rVar, singleSource);
        return C11915a.m38449a((Single<T>) d0Var);
    }

    /* renamed from: a */
    public static <T> Single<T> m38389a(SingleSource<T> singleSource) {
        C12036b.m38663a(singleSource, "source is null");
        if (singleSource instanceof Single) {
            return C11915a.m38449a((Single) singleSource);
        }
        return C11915a.m38449a((Single<T>) new C12479u<T>(singleSource));
    }

    /* renamed from: a */
    public static <T, R> Single<R> m38394a(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        C12036b.m38663a(function, "zipper is null");
        C12036b.m38663a(iterable, "sources is null");
        return C11915a.m38449a((Single<T>) new C12455i0<T>(iterable, function));
    }

    /* renamed from: a */
    public static <T1, T2, R> Single<R> m38390a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, C11947c<? super T1, ? super T2, ? extends R> cVar) {
        C12036b.m38663a(singleSource, "source1 is null");
        C12036b.m38663a(singleSource2, "source2 is null");
        return m38391a(C12015a.m38641a(cVar), (SingleSource<? extends T>[]) new SingleSource[]{singleSource, singleSource2});
    }

    /* renamed from: a */
    public static <T, R> Single<R> m38391a(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        C12036b.m38663a(function, "zipper is null");
        C12036b.m38663a(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return m38395a((Throwable) new NoSuchElementException());
        }
        return C11915a.m38449a((Single<T>) new C12449h0<T>(singleSourceArr, function));
    }

    /* renamed from: a */
    public final <R> R mo30215a(C11974s<T, ? extends R> sVar) {
        C12036b.m38663a(sVar, "converter is null");
        return sVar.apply(this);
    }

    /* renamed from: a */
    public final <R> Single<R> mo30206a(SingleTransformer<? super T, ? extends R> singleTransformer) {
        C12036b.m38663a(singleTransformer, "transformer is null");
        return m38389a(singleTransformer.apply(this));
    }

    /* renamed from: a */
    public final <U> Single<U> mo30212a(Class<? extends U> cls) {
        C12036b.m38663a(cls, "clazz is null");
        return mo30233g(C12015a.m38642a(cls));
    }

    /* renamed from: a */
    public final Single<T> mo30207a(Consumer<? super T> consumer) {
        C12036b.m38663a(consumer, "onAfterSuccess is null");
        return C11915a.m38449a((Single<T>) new C12439f<T>(this, consumer));
    }

    /* renamed from: a */
    public final Single<T> mo30209a(C11945a aVar) {
        C12036b.m38663a(aVar, "onAfterTerminate is null");
        return C11915a.m38449a((Single<T>) new C12443g<T>(this, aVar));
    }

    /* renamed from: a */
    public final Single<T> mo30210a(C11946b<? super T, ? super Throwable> bVar) {
        C12036b.m38663a(bVar, "onEvent is null");
        return C11915a.m38449a((Single<T>) new C12459k<T>(this, bVar));
    }

    /* renamed from: a */
    public final Maybe<T> mo30202a(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38447a((Maybe<T>) new C12251k<T>(this, hVar));
    }

    /* renamed from: a */
    public final <R> Single<R> mo30208a(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38449a((Single<T>) new C12466o<T>(this, function));
    }

    /* renamed from: a */
    public final Single<T> mo30211a(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38449a((Single<T>) new C12486z<T>(this, rVar));
    }

    /* renamed from: a */
    public final Single<T> mo30213a(T t) {
        C12036b.m38663a(t, "value is null");
        return C11915a.m38449a((Single<T>) new C12421a0<T>(this, null, t));
    }

    /* renamed from: a */
    public final Disposable mo30214a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C12036b.m38663a(consumer, "onSuccess is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12057f fVar = new C12057f(consumer, consumer2);
        mo30216a((C11987u<? super T>) fVar);
        return fVar;
    }

    /* renamed from: a */
    public final void mo30216a(C11987u<? super T> uVar) {
        C12036b.m38663a(uVar, "observer is null");
        C11987u a = C11915a.m38455a(this, uVar);
        C12036b.m38663a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo17771b(a);
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
    public final Single<T> mo30203a(long j, TimeUnit timeUnit, C11969r rVar) {
        return m38398b(j, timeUnit, rVar, null);
    }

    /* renamed from: a */
    public final Single<T> mo30204a(long j, TimeUnit timeUnit, C11969r rVar, SingleSource<? extends T> singleSource) {
        C12036b.m38663a(singleSource, "other is null");
        return m38398b(j, timeUnit, rVar, singleSource);
    }

    /* renamed from: a */
    public final <U, R> Single<R> mo30205a(SingleSource<U> singleSource, C11947c<? super T, ? super U, ? extends R> cVar) {
        return m38390a((SingleSource<? extends T1>) this, singleSource, cVar);
    }

    /* renamed from: a */
    private static <T> Single<T> m38388a(Flowable<T> flowable) {
        return C11915a.m38449a((Single<T>) new C12163j0<T>(flowable, null));
    }
}
