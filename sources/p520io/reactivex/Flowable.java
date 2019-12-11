package p520io.reactivex;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11951g;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12049l;
import p520io.reactivex.p531y.p536e.p538b.C12122b0;
import p520io.reactivex.p531y.p536e.p538b.C12125c0;
import p520io.reactivex.p531y.p536e.p538b.C12129d;
import p520io.reactivex.p531y.p536e.p538b.C12138d0;
import p520io.reactivex.p531y.p536e.p538b.C12140e;
import p520io.reactivex.p531y.p536e.p538b.C12144f;
import p520io.reactivex.p531y.p536e.p538b.C12148g;
import p520io.reactivex.p531y.p536e.p538b.C12151g0;
import p520io.reactivex.p531y.p536e.p538b.C12153h;
import p520io.reactivex.p531y.p536e.p538b.C12155h0;
import p520io.reactivex.p531y.p536e.p538b.C12161j;
import p520io.reactivex.p531y.p536e.p538b.C12165k;
import p520io.reactivex.p531y.p536e.p538b.C12166k0;
import p520io.reactivex.p531y.p536e.p538b.C12169l;
import p520io.reactivex.p531y.p536e.p538b.C12172l0;
import p520io.reactivex.p531y.p536e.p538b.C12174m;
import p520io.reactivex.p531y.p536e.p538b.C12177m0;
import p520io.reactivex.p531y.p536e.p538b.C12184o;
import p520io.reactivex.p531y.p536e.p538b.C12187o0;
import p520io.reactivex.p531y.p536e.p538b.C12189p;
import p520io.reactivex.p531y.p536e.p538b.C12192p0;
import p520io.reactivex.p531y.p536e.p538b.C12195q;
import p520io.reactivex.p531y.p536e.p538b.C12198q0;
import p520io.reactivex.p531y.p536e.p538b.C12201r;
import p520io.reactivex.p531y.p536e.p538b.C12207t;
import p520io.reactivex.p531y.p536e.p538b.C12208u;
import p520io.reactivex.p531y.p536e.p538b.C12209v;
import p520io.reactivex.p531y.p536e.p538b.C12210w;
import p520io.reactivex.p531y.p536e.p538b.C12213x;
import p520io.reactivex.p531y.p536e.p538b.C12217y;
import p520io.reactivex.p531y.p536e.p538b.C12219z;
import p520io.reactivex.p531y.p545h.C12531c;
import p520io.reactivex.p531y.p545h.C12532d;

/* renamed from: io.reactivex.Flowable */
public abstract class Flowable<T> implements C14313b<T> {

    /* renamed from: c */
    static final int f27562c = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static <T> Flowable<T> m38201a(C11953g<T> gVar, C11907a aVar) {
        C12036b.m38663a(gVar, "source is null");
        C12036b.m38663a(aVar, "mode is null");
        return C11915a.m38446a((Flowable<T>) new C12129d<T>(gVar, aVar));
    }

    /* renamed from: b */
    public static <T> Flowable<T> m38207b(C14313b<? extends T> bVar) {
        if (bVar instanceof Flowable) {
            return C11915a.m38446a((Flowable) bVar);
        }
        C12036b.m38663a(bVar, "source is null");
        return C11915a.m38446a((Flowable<T>) new C12207t<T>(bVar));
    }

    /* renamed from: h */
    public static int m38208h() {
        return f27562c;
    }

    /* renamed from: i */
    public static <T> Flowable<T> m38209i() {
        return C11915a.m38446a(C12165k.f28038U);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29935a(Subscriber<? super T> subscriber);

    /* renamed from: c */
    public final Flowable<T> mo30089c(Consumer<? super C14314c> consumer) {
        return mo30065a(consumer, C12015a.f27747f, C12015a.f27744c);
    }

    /* renamed from: d */
    public final <R> Flowable<R> mo30094d(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return mo30095d(function, false, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public final <R> Flowable<R> mo30097e(Function<? super T, ? extends R> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38446a((Flowable<T>) new C12210w<T>(this, function));
    }

    /* renamed from: f */
    public final Flowable<T> mo30098f() {
        return mo30082b(Long.MAX_VALUE);
    }

    /* renamed from: g */
    public final Single<List<T>> mo30100g() {
        return C11915a.m38449a((Single<T>) new C12187o0<T>(this));
    }

    public final void subscribe(Subscriber<? super T> subscriber) {
        if (subscriber instanceof C11955i) {
            mo30080a((C11955i) subscriber);
            return;
        }
        C12036b.m38663a(subscriber, "s is null");
        mo30080a((C11955i<? super T>) new C12532d<Object>(subscriber));
    }

    /* renamed from: c */
    public final <R> Flowable<R> mo30090c(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return mo30091c(function, false, Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public final <R> Flowable<R> mo30095d(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "maxConcurrency");
        return C11915a.m38446a((Flowable<T>) new C12195q<T>(this, function, z, i));
    }

    /* renamed from: f */
    public final Flowable<T> mo30099f(Function<? super Flowable<Throwable>, ? extends C14313b<?>> function) {
        C12036b.m38663a(function, "handler is null");
        return C11915a.m38446a((Flowable<T>) new C12151g0<T>(this, function));
    }

    /* renamed from: c */
    public final <R> Flowable<R> mo30091c(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "maxConcurrency");
        return C11915a.m38446a((Flowable<T>) new C12189p<T>(this, function, z, i));
    }

    /* renamed from: e */
    public final Flowable<T> mo30096e() {
        return C11915a.m38446a((Flowable<T>) new C12122b0<T>(this));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38204a(T... tArr) {
        C12036b.m38663a(tArr, "items is null");
        if (tArr.length == 0) {
            return m38209i();
        }
        if (tArr.length == 1) {
            return m38206b(tArr[0]);
        }
        return C11915a.m38446a((Flowable<T>) new C12201r<T>(tArr));
    }

    /* renamed from: b */
    public static <T> Flowable<T> m38206b(T t) {
        C12036b.m38663a(t, "item is null");
        return C11915a.m38446a((Flowable<T>) new C12209v<T>(t));
    }

    /* renamed from: d */
    public final Flowable<T> mo30093d() {
        return C11915a.m38446a((Flowable<T>) new C12219z<T>(this));
    }

    /* renamed from: c */
    public final Flowable<T> mo30088c() {
        return mo30062a(m38208h(), false, true);
    }

    /* renamed from: b */
    public static Flowable<Long> m38205b(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38446a((Flowable<T>) new C12177m0<T>(Math.max(0, j), timeUnit, rVar));
    }

    /* renamed from: c */
    public final Flowable<T> mo30092c(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38446a((Flowable<T>) new C12192p0<T>(this, rVar));
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38202a(C14313b<? extends T> bVar, C14313b<? extends T> bVar2) {
        C12036b.m38663a(bVar, "source1 is null");
        C12036b.m38663a(bVar2, "source2 is null");
        return m38204a((T[]) new C14313b[]{bVar, bVar2}).mo30067a(C12015a.m38652c(), false, 2);
    }

    /* renamed from: b */
    public final Flowable<T> mo30083b(Consumer<? super T> consumer) {
        Consumer b = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        return m38199a(consumer, b, aVar, aVar);
    }

    /* renamed from: b */
    public final Single<T> mo30087b() {
        return mo30076a(0);
    }

    /* renamed from: b */
    public final <R> Flowable<R> mo30084b(Function<? super T, ? extends C14313b<? extends R>> function) {
        return mo30068a(function, false, m38208h(), m38208h());
    }

    /* renamed from: a */
    public static Flowable<Integer> m38197a(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return m38209i();
        } else {
            if (i2 == 1) {
                return m38206b((T) Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C11915a.m38446a((Flowable<T>) new C12125c0<T>(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    /* renamed from: b */
    public final Completable mo30081b(Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "maxConcurrency");
        return C11915a.m38444a((Completable) new C12184o(this, function, z, i));
    }

    /* renamed from: b */
    public final Flowable<T> mo30082b(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return m38209i();
        } else {
            return C11915a.m38446a((Flowable<T>) new C12138d0<T>(this, j));
        }
    }

    /* renamed from: a */
    public static Flowable<Long> m38198a(long j, TimeUnit timeUnit) {
        return m38205b(j, timeUnit, C11934b.m38498a());
    }

    /* renamed from: a */
    public static <T1, T2, R> Flowable<R> m38203a(C14313b<? extends T1> bVar, C14313b<? extends T2> bVar2, C11947c<? super T1, ? super T2, ? extends R> cVar) {
        C12036b.m38663a(bVar, "source1 is null");
        C12036b.m38663a(bVar2, "source2 is null");
        return m38200a(C12015a.m38641a(cVar), false, m38208h(), (C14313b<? extends T>[]) new C14313b[]{bVar, bVar2});
    }

    /* renamed from: b */
    public final Flowable<T> mo30086b(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return mo30072a(rVar, !(this instanceof C12129d));
    }

    /* renamed from: b */
    public final Flowable<T> mo30085b(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38446a((Flowable<T>) new C12172l0<T>(this, hVar));
    }

    /* renamed from: a */
    public static <T, R> Flowable<R> m38200a(Function<? super Object[], ? extends R> function, boolean z, int i, C14313b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m38209i();
        }
        C12036b.m38663a(function, "zipper is null");
        C12036b.m38660a(i, "bufferSize");
        C12198q0 q0Var = new C12198q0(bVarArr, null, function, i, z);
        return C11915a.m38446a((Flowable<T>) q0Var);
    }

    /* renamed from: a */
    public final <R> R mo30079a(C11932e<T, ? extends R> eVar) {
        C12036b.m38663a(eVar, "converter is null");
        return eVar.mo29922a(this);
    }

    /* renamed from: a */
    public final <R> Flowable<R> mo30070a(C11956j<? super T, ? extends R> jVar) {
        C12036b.m38663a(jVar, "composer is null");
        return m38207b(jVar.mo30026a(this));
    }

    /* renamed from: a */
    public final Flowable<T> mo30063a(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        C12140e eVar = new C12140e(this, j, timeUnit, rVar);
        return C11915a.m38446a((Flowable<T>) eVar);
    }

    /* renamed from: a */
    public final Flowable<T> mo30061a() {
        return mo30066a(C12015a.m38652c());
    }

    /* renamed from: a */
    public final <K> Flowable<T> mo30066a(Function<? super T, K> function) {
        C12036b.m38663a(function, "keySelector is null");
        return C11915a.m38446a((Flowable<T>) new C12144f<T>(this, function, C12036b.m38662a()));
    }

    /* renamed from: a */
    private Flowable<T> m38199a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
        C12036b.m38663a(consumer, "onNext is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12036b.m38663a(aVar2, "onAfterTerminate is null");
        C12148g gVar = new C12148g(this, consumer, consumer2, aVar, aVar2);
        return C11915a.m38446a((Flowable<T>) gVar);
    }

    /* renamed from: a */
    public final Flowable<T> mo30064a(Consumer<? super C11959m<T>> consumer) {
        C12036b.m38663a(consumer, "onNotification is null");
        return m38199a(C12015a.m38651c(consumer), C12015a.m38649b(consumer), C12015a.m38643a(consumer), C12015a.f27744c);
    }

    /* renamed from: a */
    public final Flowable<T> mo30065a(Consumer<? super C14314c> consumer, C11951g gVar, C11945a aVar) {
        C12036b.m38663a(consumer, "onSubscribe is null");
        C12036b.m38663a(gVar, "onRequest is null");
        C12036b.m38663a(aVar, "onCancel is null");
        return C11915a.m38446a((Flowable<T>) new C12153h<T>(this, consumer, gVar, aVar));
    }

    /* renamed from: a */
    public final Single<T> mo30076a(long j) {
        if (j >= 0) {
            return C11915a.m38449a((Single<T>) new C12161j<T>(this, j, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final Flowable<T> mo30069a(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38446a((Flowable<T>) new C12169l<T>(this, hVar));
    }

    /* renamed from: a */
    public final <R> Flowable<R> mo30067a(Function<? super T, ? extends C14313b<? extends R>> function, boolean z, int i) {
        return mo30068a(function, z, i, m38208h());
    }

    /* renamed from: a */
    public final <R> Flowable<R> mo30068a(Function<? super T, ? extends C14313b<? extends R>> function, boolean z, int i, int i2) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "maxConcurrency");
        C12036b.m38660a(i2, "bufferSize");
        if (this instanceof C12049l) {
            Object call = ((C12049l) this).call();
            if (call == null) {
                return m38209i();
            }
            return C12155h0.m38804a(call, function);
        }
        C12174m mVar = new C12174m(this, function, z, i, i2);
        return C11915a.m38446a((Flowable<T>) mVar);
    }

    /* renamed from: a */
    public final Flowable<T> mo30074a(C14313b<? extends T> bVar) {
        C12036b.m38663a(bVar, "other is null");
        return m38202a((C14313b<? extends T>) this, bVar);
    }

    /* renamed from: a */
    public final Flowable<T> mo30071a(C11969r rVar) {
        return mo30073a(rVar, false, m38208h());
    }

    /* renamed from: a */
    public final Flowable<T> mo30073a(C11969r rVar, boolean z, int i) {
        C12036b.m38663a(rVar, "scheduler is null");
        C12036b.m38660a(i, "bufferSize");
        return C11915a.m38446a((Flowable<T>) new C12213x<T>(this, rVar, z, i));
    }

    /* renamed from: a */
    public final Flowable<T> mo30062a(int i, boolean z, boolean z2) {
        C12036b.m38660a(i, "capacity");
        C12217y yVar = new C12217y(this, i, z2, z, C12015a.f27744c);
        return C11915a.m38446a((Flowable<T>) yVar);
    }

    /* renamed from: a */
    public final Disposable mo30077a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo30078a(consumer, consumer2, C12015a.f27744c, (Consumer<? super C14314c>) C12208u.INSTANCE);
    }

    /* renamed from: a */
    public final Disposable mo30078a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, Consumer<? super C14314c> consumer3) {
        C12036b.m38663a(consumer, "onNext is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12036b.m38663a(consumer3, "onSubscribe is null");
        C12531c cVar = new C12531c(consumer, consumer2, aVar, consumer3);
        mo30080a((C11955i<? super T>) cVar);
        return cVar;
    }

    /* renamed from: a */
    public final void mo30080a(C11955i<? super T> iVar) {
        C12036b.m38663a(iVar, "s is null");
        try {
            Subscriber a = C11915a.m38460a(this, (Subscriber<? super T>) iVar);
            C12036b.m38663a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29935a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final Flowable<T> mo30072a(C11969r rVar, boolean z) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38446a((Flowable<T>) new C12166k0<T>(this, rVar, z));
    }

    /* renamed from: a */
    public final <U, R> Flowable<R> mo30075a(C14313b<? extends U> bVar, C11947c<? super T, ? super U, ? extends R> cVar) {
        C12036b.m38663a(bVar, "other is null");
        return m38203a((C14313b<? extends T1>) this, bVar, cVar);
    }
}
