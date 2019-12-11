package p520io.reactivex.p523c0;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11949e;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p530x.C12005d;
import p520io.reactivex.p530x.C12007f;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12548h;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.c0.a */
/* compiled from: RxJavaPlugins */
public final class C11915a {

    /* renamed from: a */
    static volatile Consumer<? super Throwable> f27577a;

    /* renamed from: b */
    static volatile Function<? super Runnable, ? extends Runnable> f27578b;

    /* renamed from: c */
    static volatile Function<? super Callable<C11969r>, ? extends C11969r> f27579c;

    /* renamed from: d */
    static volatile Function<? super Callable<C11969r>, ? extends C11969r> f27580d;

    /* renamed from: e */
    static volatile Function<? super Callable<C11969r>, ? extends C11969r> f27581e;

    /* renamed from: f */
    static volatile Function<? super Callable<C11969r>, ? extends C11969r> f27582f;

    /* renamed from: g */
    static volatile Function<? super C11969r, ? extends C11969r> f27583g;

    /* renamed from: h */
    static volatile Function<? super C11969r, ? extends C11969r> f27584h;

    /* renamed from: i */
    static volatile Function<? super C11969r, ? extends C11969r> f27585i;

    /* renamed from: j */
    static volatile Function<? super Flowable, ? extends Flowable> f27586j;

    /* renamed from: k */
    static volatile Function<? super Observable, ? extends Observable> f27587k;

    /* renamed from: l */
    static volatile Function<? super C12557a, ? extends C12557a> f27588l;

    /* renamed from: m */
    static volatile Function<? super Maybe, ? extends Maybe> f27589m;

    /* renamed from: n */
    static volatile Function<? super Single, ? extends Single> f27590n;

    /* renamed from: o */
    static volatile Function<? super Completable, ? extends Completable> f27591o;

    /* renamed from: p */
    static volatile C11947c<? super Flowable, ? super Subscriber, ? extends Subscriber> f27592p;

    /* renamed from: q */
    static volatile C11947c<? super Maybe, ? super C11958l, ? extends C11958l> f27593q;

    /* renamed from: r */
    static volatile C11947c<? super Observable, ? super C11968q, ? extends C11968q> f27594r;

    /* renamed from: s */
    static volatile C11947c<? super Single, ? super C11987u, ? extends C11987u> f27595s;

    /* renamed from: t */
    static volatile C11947c<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> f27596t;

    /* renamed from: u */
    static volatile C11949e f27597u;

    /* renamed from: v */
    static volatile boolean f27598v;

    /* renamed from: w */
    static volatile boolean f27599w;

    /* renamed from: a */
    public static boolean m38462a() {
        return f27599w;
    }

    /* renamed from: b */
    public static C11969r m38465b(Callable<C11969r> callable) {
        C12036b.m38663a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C11969r>, ? extends C11969r> function = f27579c;
        if (function == null) {
            return m38454a(callable);
        }
        return m38452a(function, callable);
    }

    /* renamed from: c */
    public static C11969r m38469c(Callable<C11969r> callable) {
        C12036b.m38663a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C11969r>, ? extends C11969r> function = f27581e;
        if (function == null) {
            return m38454a(callable);
        }
        return m38452a(function, callable);
    }

    /* renamed from: d */
    public static C11969r m38471d(Callable<C11969r> callable) {
        C12036b.m38663a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C11969r>, ? extends C11969r> function = f27582f;
        if (function == null) {
            return m38454a(callable);
        }
        return m38452a(function, callable);
    }

    /* renamed from: e */
    public static C11969r m38472e(Callable<C11969r> callable) {
        C12036b.m38663a(callable, "Scheduler Callable can't be null");
        Function<? super Callable<C11969r>, ? extends C11969r> function = f27580d;
        if (function == null) {
            return m38454a(callable);
        }
        return m38452a(function, callable);
    }

    /* renamed from: a */
    public static C11969r m38453a(C11969r rVar) {
        Function<? super C11969r, ? extends C11969r> function = f27583g;
        if (function == null) {
            return rVar;
        }
        return (C11969r) m38457a(function, (T) rVar);
    }

    /* renamed from: a */
    static boolean m38463a(Throwable th) {
        if (!(th instanceof C12005d) && !(th instanceof C12004c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C11998a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m38466b(Throwable th) {
        Consumer<? super Throwable> consumer = f27577a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m38463a(th)) {
            th = new C12007f(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m38470c(th2);
            }
        }
        th.printStackTrace();
        m38470c(th);
    }

    /* renamed from: c */
    static void m38470c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: c */
    public static C11969r m38468c(C11969r rVar) {
        Function<? super C11969r, ? extends C11969r> function = f27584h;
        if (function == null) {
            return rVar;
        }
        return (C11969r) m38457a(function, (T) rVar);
    }

    /* renamed from: a */
    public static Runnable m38459a(Runnable runnable) {
        C12036b.m38663a(runnable, "run is null");
        Function<? super Runnable, ? extends Runnable> function = f27578b;
        if (function == null) {
            return runnable;
        }
        return (Runnable) m38457a(function, (T) runnable);
    }

    /* renamed from: a */
    public static void m38461a(Consumer<? super Throwable> consumer) {
        if (!f27598v) {
            f27577a = consumer;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: b */
    public static C11969r m38464b(C11969r rVar) {
        Function<? super C11969r, ? extends C11969r> function = f27585i;
        if (function == null) {
            return rVar;
        }
        return (C11969r) m38457a(function, (T) rVar);
    }

    /* renamed from: a */
    public static <T> Subscriber<? super T> m38460a(Flowable<T> flowable, Subscriber<? super T> subscriber) {
        C11947c<? super Flowable, ? super Subscriber, ? extends Subscriber> cVar = f27592p;
        return cVar != null ? (Subscriber) m38458a(cVar, flowable, subscriber) : subscriber;
    }

    /* renamed from: b */
    public static boolean m38467b() {
        C11949e eVar = f27597u;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo29931a();
        } catch (Throwable th) {
            throw C12548h.m39353b(th);
        }
    }

    /* renamed from: a */
    public static <T> C11968q<? super T> m38451a(Observable<T> observable, C11968q<? super T> qVar) {
        C11947c<? super Observable, ? super C11968q, ? extends C11968q> cVar = f27594r;
        return cVar != null ? (C11968q) m38458a(cVar, observable, qVar) : qVar;
    }

    /* renamed from: a */
    public static <T> C11987u<? super T> m38455a(Single<T> single, C11987u<? super T> uVar) {
        C11947c<? super Single, ? super C11987u, ? extends C11987u> cVar = f27595s;
        return cVar != null ? (C11987u) m38458a(cVar, single, uVar) : uVar;
    }

    /* renamed from: a */
    public static CompletableObserver m38445a(Completable completable, CompletableObserver completableObserver) {
        C11947c<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> cVar = f27596t;
        return cVar != null ? (CompletableObserver) m38458a(cVar, completable, completableObserver) : completableObserver;
    }

    /* renamed from: a */
    public static <T> C11958l<? super T> m38450a(Maybe<T> maybe, C11958l<? super T> lVar) {
        C11947c<? super Maybe, ? super C11958l, ? extends C11958l> cVar = f27593q;
        return cVar != null ? (C11958l) m38458a(cVar, maybe, lVar) : lVar;
    }

    /* renamed from: a */
    public static <T> Maybe<T> m38447a(Maybe<T> maybe) {
        Function<? super Maybe, ? extends Maybe> function = f27589m;
        return function != null ? (Maybe) m38457a(function, (T) maybe) : maybe;
    }

    /* renamed from: a */
    public static <T> Flowable<T> m38446a(Flowable<T> flowable) {
        Function<? super Flowable, ? extends Flowable> function = f27586j;
        return function != null ? (Flowable) m38457a(function, (T) flowable) : flowable;
    }

    /* renamed from: a */
    public static <T> Observable<T> m38448a(Observable<T> observable) {
        Function<? super Observable, ? extends Observable> function = f27587k;
        return function != null ? (Observable) m38457a(function, (T) observable) : observable;
    }

    /* renamed from: a */
    public static <T> C12557a<T> m38456a(C12557a<T> aVar) {
        Function<? super C12557a, ? extends C12557a> function = f27588l;
        return function != null ? (C12557a) m38457a(function, (T) aVar) : aVar;
    }

    /* renamed from: a */
    public static <T> Single<T> m38449a(Single<T> single) {
        Function<? super Single, ? extends Single> function = f27590n;
        return function != null ? (Single) m38457a(function, (T) single) : single;
    }

    /* renamed from: a */
    public static Completable m38444a(Completable completable) {
        Function<? super Completable, ? extends Completable> function = f27591o;
        return function != null ? (Completable) m38457a(function, (T) completable) : completable;
    }

    /* renamed from: a */
    static <T, R> R m38457a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw C12548h.m39353b(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m38458a(C11947c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.apply(t, u);
        } catch (Throwable th) {
            throw C12548h.m39353b(th);
        }
    }

    /* renamed from: a */
    static C11969r m38454a(Callable<C11969r> callable) {
        try {
            Object call = callable.call();
            C12036b.m38663a(call, "Scheduler Callable result can't be null");
            return (C11969r) call;
        } catch (Throwable th) {
            throw C12548h.m39353b(th);
        }
    }

    /* renamed from: a */
    static C11969r m38452a(Function<? super Callable<C11969r>, ? extends C11969r> function, Callable<C11969r> callable) {
        Object a = m38457a(function, (T) callable);
        C12036b.m38663a(a, "Scheduler Callable result can't be null");
        return (C11969r) a;
    }
}
