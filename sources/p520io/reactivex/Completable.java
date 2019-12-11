package p520io.reactivex;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.C14313b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12055d;
import p520io.reactivex.p531y.p535d.C12056e;
import p520io.reactivex.p531y.p535d.C12060i;
import p520io.reactivex.p531y.p536e.p537a.C12063a;
import p520io.reactivex.p531y.p536e.p537a.C12066b;
import p520io.reactivex.p531y.p536e.p537a.C12068c;
import p520io.reactivex.p531y.p536e.p537a.C12070d;
import p520io.reactivex.p531y.p536e.p537a.C12071e;
import p520io.reactivex.p531y.p536e.p537a.C12073f;
import p520io.reactivex.p531y.p536e.p537a.C12075g;
import p520io.reactivex.p531y.p536e.p537a.C12076h;
import p520io.reactivex.p531y.p536e.p537a.C12077i;
import p520io.reactivex.p531y.p536e.p537a.C12078j;
import p520io.reactivex.p531y.p536e.p537a.C12079k;
import p520io.reactivex.p531y.p536e.p537a.C12081l;
import p520io.reactivex.p531y.p536e.p537a.C12082m;
import p520io.reactivex.p531y.p536e.p537a.C12085n;
import p520io.reactivex.p531y.p536e.p537a.C12087o;
import p520io.reactivex.p531y.p536e.p537a.C12089p;
import p520io.reactivex.p531y.p536e.p537a.C12090q;
import p520io.reactivex.p531y.p536e.p537a.C12092r;
import p520io.reactivex.p531y.p536e.p537a.C12093s;
import p520io.reactivex.p531y.p536e.p537a.C12095t;
import p520io.reactivex.p531y.p536e.p537a.C12097u;
import p520io.reactivex.p531y.p536e.p537a.C12099v;
import p520io.reactivex.p531y.p536e.p537a.C12101w;
import p520io.reactivex.p531y.p536e.p537a.C12103x;
import p520io.reactivex.p531y.p536e.p537a.C12107y;
import p520io.reactivex.p531y.p536e.p537a.C12109z;
import p520io.reactivex.p531y.p536e.p539c.C12236e;
import p520io.reactivex.p531y.p536e.p540d.C12286a;
import p520io.reactivex.p531y.p536e.p540d.C12288b;
import p520io.reactivex.p531y.p536e.p542f.C12435e;

/* renamed from: io.reactivex.Completable */
public abstract class Completable implements CompletableSource {
    /* renamed from: a */
    public static Completable m38153a(Iterable<? extends CompletableSource> iterable) {
        C12036b.m38663a(iterable, "sources is null");
        return C11915a.m38444a((Completable) new C12066b(iterable));
    }

    /* renamed from: b */
    public static Completable m38162b(Callable<? extends CompletableSource> callable) {
        C12036b.m38663a(callable, "completableSupplier");
        return C11915a.m38444a((Completable) new C12070d(callable));
    }

    /* renamed from: c */
    public static Completable m38166c(C11945a aVar) {
        C12036b.m38663a(aVar, "run is null");
        return C11915a.m38444a((Completable) new C12077i(aVar));
    }

    /* renamed from: h */
    public static Completable m38169h() {
        return C11915a.m38444a(C12075g.f27805c);
    }

    /* renamed from: i */
    public static Completable m38170i() {
        return C11915a.m38444a(C12092r.f27836c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29934a(CompletableObserver completableObserver);

    /* renamed from: d */
    public final void mo30053d() {
        C12055d dVar = new C12055d();
        subscribe(dVar);
        dVar.mo30370a();
    }

    /* renamed from: e */
    public final Throwable mo30054e() {
        C12055d dVar = new C12055d();
        subscribe(dVar);
        return dVar.mo30371b();
    }

    /* renamed from: f */
    public final Completable mo30055f() {
        return mo30039a(C12015a.m38645a());
    }

    /* renamed from: g */
    public final Disposable mo30056g() {
        C12060i iVar = new C12060i();
        subscribe(iVar);
        return iVar;
    }

    public final void subscribe(CompletableObserver completableObserver) {
        C12036b.m38663a(completableObserver, "observer is null");
        try {
            CompletableObserver a = C11915a.m38445a(this, completableObserver);
            C12036b.m38663a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29934a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
            throw m38165b(th);
        }
    }

    /* renamed from: a */
    public static Completable m38151a(C11914c cVar) {
        C12036b.m38663a(cVar, "source is null");
        return C11915a.m38444a((Completable) new C12068c(cVar));
    }

    /* renamed from: b */
    public static <T> Completable m38160b(SingleSource<T> singleSource) {
        C12036b.m38663a(singleSource, "single is null");
        return C11915a.m38444a((Completable) new C12079k(singleSource));
    }

    /* renamed from: c */
    public static Completable m38168c(Callable<?> callable) {
        C12036b.m38663a(callable, "callable is null");
        return C11915a.m38444a((Completable) new C12078j(callable));
    }

    /* renamed from: a */
    public static Completable m38154a(Throwable th) {
        C12036b.m38663a(th, "error is null");
        return C11915a.m38444a((Completable) new C12076h(th));
    }

    /* renamed from: b */
    public static Completable m38161b(Iterable<? extends CompletableSource> iterable) {
        C12036b.m38663a(iterable, "sources is null");
        return C11915a.m38444a((Completable) new C12090q(iterable));
    }

    /* renamed from: c */
    public static Completable m38167c(Iterable<? extends CompletableSource> iterable) {
        C12036b.m38663a(iterable, "sources is null");
        return C11915a.m38444a((Completable) new C12089p(iterable));
    }

    /* renamed from: a */
    public static Completable m38155a(Future<?> future) {
        C12036b.m38663a(future, "future is null");
        return m38166c(C12015a.m38644a(future));
    }

    /* renamed from: b */
    public static Completable m38164b(CompletableSource... completableSourceArr) {
        C12036b.m38663a(completableSourceArr, "sources is null");
        return C11915a.m38444a((Completable) new C12087o(completableSourceArr));
    }

    /* renamed from: c */
    public final Completable mo30052c(Consumer<? super Disposable> consumer) {
        Consumer b = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        return m38152a(consumer, b, aVar, aVar, aVar, aVar);
    }

    /* renamed from: a */
    public static Completable m38157a(CompletableSource... completableSourceArr) {
        C12036b.m38663a(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return m38169h();
        }
        if (completableSourceArr.length == 1) {
            return m38159b(completableSourceArr[0]);
        }
        return C11915a.m38444a((Completable) new C12085n(completableSourceArr));
    }

    /* renamed from: b */
    public static Completable m38163b(C14313b<? extends CompletableSource> bVar) {
        return m38156a(bVar, Integer.MAX_VALUE, true);
    }

    /* renamed from: b */
    public static Completable m38158b(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38444a((Completable) new C12107y(j, timeUnit, rVar));
    }

    /* renamed from: b */
    private static NullPointerException m38165b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: a */
    private static Completable m38156a(C14313b<? extends CompletableSource> bVar, int i, boolean z) {
        C12036b.m38663a(bVar, "sources is null");
        C12036b.m38660a(i, "maxConcurrency");
        return C11915a.m38444a((Completable) new C12082m(bVar, i, z));
    }

    /* renamed from: b */
    public static Completable m38159b(CompletableSource completableSource) {
        C12036b.m38663a(completableSource, "source is null");
        if (completableSource instanceof Completable) {
            return C11915a.m38444a((Completable) completableSource);
        }
        return C11915a.m38444a((Completable) new C12081l(completableSource));
    }

    /* renamed from: a */
    public final <T> Observable<T> mo30043a(ObservableSource<T> observableSource) {
        C12036b.m38663a(observableSource, "next is null");
        return C11915a.m38448a((Observable<T>) new C12286a<T>(this, observableSource));
    }

    /* renamed from: b */
    public final Completable mo30050b(C11945a aVar) {
        Consumer b = C12015a.m38648b();
        Consumer b2 = C12015a.m38648b();
        C11945a aVar2 = C12015a.f27744c;
        return m38152a(b, b2, aVar, aVar2, aVar2, aVar2);
    }

    /* renamed from: a */
    public final <T> Flowable<T> mo30041a(C14313b<T> bVar) {
        C12036b.m38663a(bVar, "next is null");
        return C11915a.m38446a((Flowable<T>) new C12288b<T>(this, bVar));
    }

    /* renamed from: b */
    public final Completable mo30049b(Consumer<? super Throwable> consumer) {
        C12036b.m38663a(consumer, "onEvent is null");
        return C11915a.m38444a((Completable) new C12073f(this, consumer));
    }

    /* renamed from: a */
    public final <T> Single<T> mo30044a(SingleSource<T> singleSource) {
        C12036b.m38663a(singleSource, "next is null");
        return C11915a.m38449a((Single<T>) new C12435e<T>(singleSource, this));
    }

    /* renamed from: b */
    public final Completable mo30051b(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38444a((Completable) new C12101w(this, rVar));
    }

    /* renamed from: a */
    public final <T> Maybe<T> mo30042a(MaybeSource<T> maybeSource) {
        C12036b.m38663a(maybeSource, "next is null");
        return C11915a.m38447a((Maybe<T>) new C12236e<T>(maybeSource, this));
    }

    /* renamed from: a */
    public final Completable mo30034a(CompletableSource completableSource) {
        C12036b.m38663a(completableSource, "next is null");
        return C11915a.m38444a((Completable) new C12063a(this, completableSource));
    }

    /* renamed from: a */
    public final <R> R mo30048a(C11912b<? extends R> bVar) {
        C12036b.m38663a(bVar, "converter is null");
        return bVar.apply(this);
    }

    /* renamed from: a */
    public final Completable mo30035a(CompletableTransformer completableTransformer) {
        C12036b.m38663a(completableTransformer, "transformer is null");
        return m38159b(completableTransformer.apply(this));
    }

    /* renamed from: a */
    public final Completable mo30036a(Consumer<? super Throwable> consumer) {
        Consumer b = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        return m38152a(b, consumer, aVar, aVar, aVar, aVar);
    }

    /* renamed from: a */
    private Completable m38152a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2, C11945a aVar3, C11945a aVar4) {
        C12036b.m38663a(consumer, "onSubscribe is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12036b.m38663a(aVar2, "onTerminate is null");
        C12036b.m38663a(aVar3, "onAfterTerminate is null");
        C12036b.m38663a(aVar4, "onDispose is null");
        C12097u uVar = new C12097u(this, consumer, consumer2, aVar, aVar2, aVar3, aVar4);
        return C11915a.m38444a((Completable) uVar);
    }

    /* renamed from: a */
    public final Completable mo30038a(C11945a aVar) {
        C12036b.m38663a(aVar, "onFinally is null");
        return C11915a.m38444a((Completable) new C12071e(this, aVar));
    }

    /* renamed from: a */
    public final Completable mo30040a(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38444a((Completable) new C12093s(this, rVar));
    }

    /* renamed from: a */
    public final Completable mo30039a(C11952h<? super Throwable> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38444a((Completable) new C12095t(this, hVar));
    }

    /* renamed from: a */
    public final Completable mo30037a(Function<? super Throwable, ? extends CompletableSource> function) {
        C12036b.m38663a(function, "errorMapper is null");
        return C11915a.m38444a((Completable) new C12099v(this, function));
    }

    /* renamed from: a */
    public final Disposable mo30047a(C11945a aVar, Consumer<? super Throwable> consumer) {
        C12036b.m38663a(consumer, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12056e eVar = new C12056e(consumer, aVar);
        subscribe(eVar);
        return eVar;
    }

    /* renamed from: a */
    public final Completable mo30033a(long j, TimeUnit timeUnit, C11969r rVar) {
        return m38150a(j, timeUnit, rVar, null);
    }

    /* renamed from: a */
    private Completable m38150a(long j, TimeUnit timeUnit, C11969r rVar, CompletableSource completableSource) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        C12103x xVar = new C12103x(this, j, timeUnit, rVar, completableSource);
        return C11915a.m38444a((Completable) xVar);
    }

    /* renamed from: a */
    public final <T> Single<T> mo30046a(Callable<? extends T> callable) {
        C12036b.m38663a(callable, "completionValueSupplier is null");
        return C11915a.m38449a((Single<T>) new C12109z<T>(this, callable, null));
    }

    /* renamed from: a */
    public final <T> Single<T> mo30045a(T t) {
        C12036b.m38663a(t, "completionValue is null");
        return C11915a.m38449a((Single<T>) new C12109z<T>(this, null, t));
    }
}
