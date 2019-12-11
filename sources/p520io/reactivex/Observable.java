package p520io.reactivex;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
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
import p520io.reactivex.p531y.p534c.C12049l;
import p520io.reactivex.p531y.p535d.C12061j;
import p520io.reactivex.p531y.p536e.p538b.C12112a0;
import p520io.reactivex.p531y.p536e.p538b.C12205s;
import p520io.reactivex.p531y.p536e.p541e.C12295a0;
import p520io.reactivex.p531y.p536e.p541e.C12297a1;
import p520io.reactivex.p531y.p536e.p541e.C12304c0;
import p520io.reactivex.p531y.p536e.p541e.C12306d;
import p520io.reactivex.p531y.p536e.p541e.C12308d0;
import p520io.reactivex.p531y.p536e.p541e.C12310e;
import p520io.reactivex.p531y.p536e.p541e.C12315e0;
import p520io.reactivex.p531y.p536e.p541e.C12317f;
import p520io.reactivex.p531y.p536e.p541e.C12319f0;
import p520io.reactivex.p531y.p536e.p541e.C12320g;
import p520io.reactivex.p531y.p536e.p541e.C12325g0;
import p520io.reactivex.p531y.p536e.p541e.C12327h;
import p520io.reactivex.p531y.p536e.p541e.C12329h0;
import p520io.reactivex.p531y.p536e.p541e.C12331i;
import p520io.reactivex.p531y.p536e.p541e.C12333i0;
import p520io.reactivex.p531y.p536e.p541e.C12335j;
import p520io.reactivex.p531y.p536e.p541e.C12337j0;
import p520io.reactivex.p531y.p536e.p541e.C12339k;
import p520io.reactivex.p531y.p536e.p541e.C12341k0;
import p520io.reactivex.p531y.p536e.p541e.C12345l;
import p520io.reactivex.p531y.p536e.p541e.C12352n;
import p520io.reactivex.p531y.p536e.p541e.C12357o;
import p520io.reactivex.p531y.p536e.p541e.C12359o0;
import p520io.reactivex.p531y.p536e.p541e.C12371p;
import p520io.reactivex.p531y.p536e.p541e.C12372p0;
import p520io.reactivex.p531y.p536e.p541e.C12375q;
import p520io.reactivex.p531y.p536e.p541e.C12377q0;
import p520io.reactivex.p531y.p536e.p541e.C12379r;
import p520io.reactivex.p531y.p536e.p541e.C12382r0;
import p520io.reactivex.p531y.p536e.p541e.C12386s0;
import p520io.reactivex.p531y.p536e.p541e.C12388t;
import p520io.reactivex.p531y.p536e.p541e.C12391t0;
import p520io.reactivex.p531y.p536e.p541e.C12393u;
import p520io.reactivex.p531y.p536e.p541e.C12396u0;
import p520io.reactivex.p531y.p536e.p541e.C12399v;
import p520io.reactivex.p531y.p536e.p541e.C12402v0;
import p520io.reactivex.p531y.p536e.p541e.C12405w;
import p520io.reactivex.p531y.p536e.p541e.C12407w0;
import p520io.reactivex.p531y.p536e.p541e.C12409x;
import p520io.reactivex.p531y.p536e.p541e.C12410x0;
import p520io.reactivex.p531y.p536e.p541e.C12412y;
import p520io.reactivex.p531y.p536e.p541e.C12414y0;
import p520io.reactivex.p531y.p536e.p541e.C12416z;
import p520io.reactivex.p531y.p547j.C12547g;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.Observable */
public abstract class Observable<T> implements ObservableSource<T> {

    /* renamed from: io.reactivex.Observable$a */
    static /* synthetic */ class C11906a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27563a = new int[C11907a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.reactivex.a[] r0 = p520io.reactivex.C11907a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27563a = r0
                int[] r0 = f27563a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.a r1 = p520io.reactivex.C11907a.DROP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27563a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.a r1 = p520io.reactivex.C11907a.LATEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27563a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.reactivex.a r1 = p520io.reactivex.C11907a.MISSING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27563a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.reactivex.a r1 = p520io.reactivex.C11907a.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.Observable.C11906a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static <T> Observable<T> m38299a(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C12036b.m38663a(observableSource, "source1 is null");
        C12036b.m38663a(observableSource2, "source2 is null");
        return m38304a((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, observableSource2});
    }

    /* renamed from: b */
    public static Observable<Long> m38306b(long j, TimeUnit timeUnit) {
        return m38298a(j, j, timeUnit, C11934b.m38498a());
    }

    /* renamed from: c */
    public static Observable<Long> m38310c(long j, TimeUnit timeUnit) {
        return m38311c(j, timeUnit, C11934b.m38498a());
    }

    /* renamed from: d */
    public static <T> Observable<T> m38312d(ObservableSource<T> observableSource) {
        C12036b.m38663a(observableSource, "source is null");
        if (observableSource instanceof Observable) {
            return C11915a.m38448a((Observable) observableSource);
        }
        return C11915a.m38448a((Observable<T>) new C12416z<T>(observableSource));
    }

    /* renamed from: l */
    public static int m38313l() {
        return Flowable.m38208h();
    }

    /* renamed from: m */
    public static <T> Observable<T> m38314m() {
        return C11915a.m38448a(C12371p.f28612c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo27408b(C11968q<? super T> qVar);

    /* renamed from: e */
    public final Observable<T> mo30188e(Consumer<? super Disposable> consumer) {
        return mo30142a(consumer, C12015a.f27744c);
    }

    /* renamed from: f */
    public final <R> Observable<R> mo30191f(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return mo30185d(function, false);
    }

    /* renamed from: g */
    public final <R> Observable<R> mo30193g(Function<? super T, ? extends R> function) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12325g0<T>(this, function));
    }

    /* renamed from: h */
    public final Observable<T> mo30196h(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        C12036b.m38663a(function, "resumeFunction is null");
        return C11915a.m38448a((Observable<T>) new C12333i0<T>(this, function, false));
    }

    /* renamed from: i */
    public final Observable<T> mo30198i(Function<? super Throwable, ? extends T> function) {
        C12036b.m38663a(function, "valueSupplier is null");
        return C11915a.m38448a((Observable<T>) new C12337j0<T>(this, function));
    }

    /* renamed from: j */
    public final Disposable mo30200j() {
        return mo30159a(C12015a.m38648b(), C12015a.f27746e, C12015a.f27744c, C12015a.m38648b());
    }

    /* renamed from: k */
    public final Single<List<T>> mo30201k() {
        return mo30172b(16);
    }

    /* renamed from: b */
    public static Observable<Long> m38307b(long j, TimeUnit timeUnit, C11969r rVar) {
        return m38298a(j, j, timeUnit, rVar);
    }

    /* renamed from: c */
    public static Observable<Long> m38311c(long j, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38448a((Observable<T>) new C12414y0<T>(Math.max(j, 0), timeUnit, rVar));
    }

    /* renamed from: e */
    public final <R> Observable<R> mo30189e(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return mo30179c(function, false);
    }

    /* renamed from: f */
    public final Completable mo30190f() {
        return C11915a.m38444a((Completable) new C12304c0(this));
    }

    /* renamed from: j */
    public final <R> Observable<R> mo30199j(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo30168b(function, m38313l());
    }

    /* renamed from: b */
    public static <T> Observable<T> m38309b(T t) {
        C12036b.m38663a(t, "item is null");
        return C11915a.m38448a((Observable<T>) new C12319f0<T>(t));
    }

    /* renamed from: e */
    public final Observable<T> mo30187e() {
        return C11915a.m38448a((Observable<T>) new C12295a0<T>(this));
    }

    /* renamed from: f */
    public final Disposable mo30192f(Consumer<? super T> consumer) {
        return mo30159a(consumer, C12015a.f27746e, C12015a.f27744c, C12015a.m38648b());
    }

    /* renamed from: g */
    public final C12557a<T> mo30194g() {
        return C12341k0.m39028e(this);
    }

    /* renamed from: h */
    public final Observable<T> mo30195h() {
        return C11915a.m38448a((Observable<T>) new C12382r0<T>(this));
    }

    /* renamed from: i */
    public final Observable<T> mo30197i() {
        return mo30194g().mo30684n();
    }

    /* renamed from: a */
    public static <T> Observable<T> m38304a(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return m38314m();
        }
        if (observableSourceArr.length == 1) {
            return m38312d(observableSourceArr[0]);
        }
        return C11915a.m38448a((Observable<T>) new C12310e<T>(m38305a((T[]) observableSourceArr), C12015a.m38652c(), m38313l(), C12547g.BOUNDARY));
    }

    /* renamed from: b */
    public static <T> Observable<T> m38308b(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C12036b.m38663a(observableSource, "source1 is null");
        C12036b.m38663a(observableSource2, "source2 is null");
        return m38305a((T[]) new ObservableSource[]{observableSource, observableSource2}).mo30146a(C12015a.m38652c(), false, 2);
    }

    /* renamed from: c */
    public final Observable<T> mo30180c(C11945a aVar) {
        return mo30142a(C12015a.m38648b(), aVar);
    }

    /* renamed from: d */
    public final Observable<T> mo30184d(Consumer<? super T> consumer) {
        Consumer b = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        return m38300a(consumer, b, aVar, aVar);
    }

    /* renamed from: c */
    public final Observable<T> mo30177c(Consumer<? super Throwable> consumer) {
        Consumer b = C12015a.m38648b();
        C11945a aVar = C12015a.f27744c;
        return m38300a(b, consumer, aVar, aVar);
    }

    /* renamed from: d */
    public final Single<T> mo30186d() {
        return mo30173b(0);
    }

    /* renamed from: c */
    public final Maybe<T> mo30174c() {
        return mo30136a(0);
    }

    /* renamed from: d */
    public final Completable mo30182d(Function<? super T, ? extends CompletableSource> function) {
        return mo30163b(function, false);
    }

    /* renamed from: b */
    public final Observable<T> mo30164b() {
        return mo30167b(C12015a.m38652c());
    }

    /* renamed from: c */
    public final <R> Observable<R> mo30178c(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo30145a(function, false);
    }

    /* renamed from: d */
    public final <R> Observable<R> mo30185d(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12399v<T>(this, function, z));
    }

    /* renamed from: a */
    public static <T> Observable<T> m38301a(C11962p<T> pVar) {
        C12036b.m38663a(pVar, "source is null");
        return C11915a.m38448a((Observable<T>) new C12317f<T>(pVar));
    }

    /* renamed from: b */
    public final <K> Observable<T> mo30167b(Function<? super T, K> function) {
        C12036b.m38663a(function, "keySelector is null");
        return C11915a.m38448a((Observable<T>) new C12327h<T>(this, function, C12036b.m38662a()));
    }

    /* renamed from: c */
    public final <R> Observable<R> mo30179c(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38448a((Observable<T>) new C12393u<T>(this, function, z));
    }

    /* renamed from: d */
    public final Observable<T> mo30183d(long j) {
        if (j >= 0) {
            return C11915a.m38448a((Observable<T>) new C12407w0<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static <T> Observable<T> m38305a(T... tArr) {
        C12036b.m38663a(tArr, "items is null");
        if (tArr.length == 0) {
            return m38314m();
        }
        if (tArr.length == 1) {
            return m38309b(tArr[0]);
        }
        return C11915a.m38448a((Observable<T>) new C12405w<T>(tArr));
    }

    /* renamed from: b */
    public final Observable<T> mo30169b(C11945a aVar) {
        return m38300a(C12015a.m38648b(), C12015a.m38648b(), aVar, C12015a.f27744c);
    }

    /* renamed from: c */
    public final Observable<T> mo30175c(long j) {
        if (j <= 0) {
            return C11915a.m38448a(this);
        }
        return C11915a.m38448a((Observable<T>) new C12386s0<T>(this, j));
    }

    /* renamed from: b */
    public final Observable<T> mo30166b(Consumer<? super C11959m<T>> consumer) {
        C12036b.m38663a(consumer, "onNotification is null");
        return m38300a(C12015a.m38651c(consumer), C12015a.m38649b(consumer), C12015a.m38643a(consumer), C12015a.f27744c);
    }

    /* renamed from: c */
    public final Observable<T> mo30176c(ObservableSource<? extends T> observableSource) {
        C12036b.m38663a(observableSource, "other is null");
        return m38304a((ObservableSource<? extends T>[]) new ObservableSource[]{observableSource, this});
    }

    /* renamed from: c */
    public final Observable<T> mo30181c(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "stopPredicate is null");
        return C11915a.m38448a((Observable<T>) new C12410x0<T>(this, hVar));
    }

    /* renamed from: a */
    public static <T> Observable<T> m38303a(Callable<? extends T> callable) {
        C12036b.m38663a(callable, "supplier is null");
        return C11915a.m38448a((Observable<T>) new C12409x<T>(callable));
    }

    /* renamed from: b */
    public final Single<T> mo30173b(long j) {
        if (j >= 0) {
            return C11915a.m38449a((Single<T>) new C12357o<T>(this, j, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public static <T> Observable<T> m38302a(Iterable<? extends T> iterable) {
        C12036b.m38663a(iterable, "source is null");
        return C11915a.m38448a((Observable<T>) new C12412y<T>(iterable));
    }

    /* renamed from: b */
    public final Completable mo30163b(Function<? super T, ? extends CompletableSource> function, boolean z) {
        C12036b.m38663a(function, "mapper is null");
        return C11915a.m38444a((Completable) new C12388t(this, function, z));
    }

    /* renamed from: a */
    public static Observable<Long> m38298a(long j, long j2, TimeUnit timeUnit, C11969r rVar) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        C12308d0 d0Var = new C12308d0(Math.max(0, j), Math.max(0, j2), timeUnit, rVar);
        return C11915a.m38448a((Observable<T>) d0Var);
    }

    /* renamed from: b */
    public final Observable<T> mo30165b(ObservableSource<? extends T> observableSource) {
        C12036b.m38663a(observableSource, "other is null");
        return m38308b((ObservableSource<? extends T>) this, observableSource);
    }

    /* renamed from: b */
    public final Observable<T> mo30170b(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38448a((Observable<T>) new C12391t0<T>(this, hVar));
    }

    /* renamed from: a */
    public static Observable<Long> m38296a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return m38297a(j, j2, j3, j4, timeUnit, C11934b.m38498a());
    }

    /* renamed from: a */
    public static Observable<Long> m38297a(long j, long j2, long j3, long j4, TimeUnit timeUnit, C11969r rVar) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C11969r rVar2 = rVar;
        int i = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return m38314m().mo30138a(j6, timeUnit2, rVar2);
        } else {
            long j7 = j + (j5 - 1);
            if (j <= 0 || j7 >= 0) {
                C12036b.m38663a(timeUnit2, "unit is null");
                C12036b.m38663a(rVar2, "scheduler is null");
                C12315e0 e0Var = new C12315e0(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, rVar);
                return C11915a.m38448a((Observable<T>) e0Var);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    /* renamed from: b */
    public final Observable<T> mo30171b(C11969r rVar) {
        C12036b.m38663a(rVar, "scheduler is null");
        return C11915a.m38448a((Observable<T>) new C12396u0<T>(this, rVar));
    }

    /* renamed from: b */
    public final <R> Observable<R> mo30168b(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "bufferSize");
        if (!(this instanceof C12049l)) {
            return C11915a.m38448a((Observable<T>) new C12402v0<T>(this, function, i, false));
        }
        Object call = ((C12049l) this).call();
        if (call == null) {
            return m38314m();
        }
        return C12372p0.m39090a(call, function);
    }

    /* renamed from: a */
    public final <R> R mo30161a(C11960n<T, ? extends R> nVar) {
        C12036b.m38663a(nVar, "converter is null");
        return nVar.mo29921a(this);
    }

    /* renamed from: a */
    public final <U> Observable<U> mo30153a(Class<U> cls) {
        C12036b.m38663a(cls, "clazz is null");
        return mo30193g(C12015a.m38642a(cls));
    }

    /* renamed from: a */
    public final <U> Single<U> mo30156a(Callable<? extends U> callable, C11946b<? super U, ? super T> bVar) {
        C12036b.m38663a(callable, "initialValueSupplier is null");
        C12036b.m38663a(bVar, "collector is null");
        return C11915a.m38449a((Single<T>) new C12306d<T>(this, callable, bVar));
    }

    /* renamed from: b */
    public final Single<List<T>> mo30172b(int i) {
        C12036b.m38660a(i, "capacityHint");
        return C11915a.m38449a((Single<T>) new C12297a1<T>(this, i));
    }

    /* renamed from: a */
    public final <U> Single<U> mo30155a(U u, C11946b<? super U, ? super T> bVar) {
        C12036b.m38663a(u, "initialValue is null");
        return mo30156a(C12015a.m38647a(u), bVar);
    }

    /* renamed from: a */
    public final <R> Observable<R> mo30143a(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return mo30144a(function, 2);
    }

    /* renamed from: a */
    public final <R> Observable<R> mo30144a(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "prefetch");
        if (!(this instanceof C12049l)) {
            return C11915a.m38448a((Observable<T>) new C12310e<T>(this, function, i, C12547g.IMMEDIATE));
        }
        Object call = ((C12049l) this).call();
        if (call == null) {
            return m38314m();
        }
        return C12372p0.m39090a(call, function);
    }

    /* renamed from: a */
    public final Observable<T> mo30140a(ObservableSource<? extends T> observableSource) {
        C12036b.m38663a(observableSource, "other is null");
        return m38299a((ObservableSource<? extends T>) this, observableSource);
    }

    /* renamed from: a */
    public final Observable<T> mo30137a(long j, TimeUnit timeUnit) {
        return mo30139a(j, timeUnit, C11934b.m38498a(), false);
    }

    /* renamed from: a */
    public final Observable<T> mo30138a(long j, TimeUnit timeUnit, C11969r rVar) {
        return mo30139a(j, timeUnit, rVar, false);
    }

    /* renamed from: a */
    public final Observable<T> mo30139a(long j, TimeUnit timeUnit, C11969r rVar, boolean z) {
        C12036b.m38663a(timeUnit, "unit is null");
        C12036b.m38663a(rVar, "scheduler is null");
        C12320g gVar = new C12320g(this, j, timeUnit, rVar, z);
        return C11915a.m38448a((Observable<T>) gVar);
    }

    /* renamed from: a */
    public final Observable<T> mo30141a(Consumer<? super T> consumer) {
        C12036b.m38663a(consumer, "onAfterNext is null");
        return C11915a.m38448a((Observable<T>) new C12331i<T>(this, consumer));
    }

    /* renamed from: a */
    public final Observable<T> mo30148a(C11945a aVar) {
        C12036b.m38663a(aVar, "onFinally is null");
        return C11915a.m38448a((Observable<T>) new C12335j<T>(this, aVar));
    }

    /* renamed from: a */
    private Observable<T> m38300a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
        C12036b.m38663a(consumer, "onNext is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12036b.m38663a(aVar2, "onAfterTerminate is null");
        C12339k kVar = new C12339k(this, consumer, consumer2, aVar, aVar2);
        return C11915a.m38448a((Observable<T>) kVar);
    }

    /* renamed from: a */
    public final Observable<T> mo30142a(Consumer<? super Disposable> consumer, C11945a aVar) {
        C12036b.m38663a(consumer, "onSubscribe is null");
        C12036b.m38663a(aVar, "onDispose is null");
        return C11915a.m38448a((Observable<T>) new C12345l<T>(this, consumer, aVar));
    }

    /* renamed from: a */
    public final Maybe<T> mo30136a(long j) {
        if (j >= 0) {
            return C11915a.m38447a((Maybe<T>) new C12352n<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final Observable<T> mo30150a(C11952h<? super T> hVar) {
        C12036b.m38663a(hVar, "predicate is null");
        return C11915a.m38448a((Observable<T>) new C12375q<T>(this, hVar));
    }

    /* renamed from: a */
    public final <R> Observable<R> mo30145a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return mo30146a(function, z, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final <R> Observable<R> mo30146a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return mo30147a(function, z, i, m38313l());
    }

    /* renamed from: a */
    public final <R> Observable<R> mo30147a(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        C12036b.m38663a(function, "mapper is null");
        C12036b.m38660a(i, "maxConcurrency");
        C12036b.m38660a(i2, "bufferSize");
        if (this instanceof C12049l) {
            Object call = ((C12049l) this).call();
            if (call == null) {
                return m38314m();
            }
            return C12372p0.m39090a(call, function);
        }
        C12379r rVar = new C12379r(this, function, z, i, i2);
        return C11915a.m38448a((Observable<T>) rVar);
    }

    /* renamed from: a */
    public final Observable<T> mo30151a(C11969r rVar) {
        return mo30152a(rVar, false, m38313l());
    }

    /* renamed from: a */
    public final Observable<T> mo30152a(C11969r rVar, boolean z, int i) {
        C12036b.m38663a(rVar, "scheduler is null");
        C12036b.m38660a(i, "bufferSize");
        return C11915a.m38448a((Observable<T>) new C12329h0<T>(this, rVar, z, i));
    }

    /* renamed from: a */
    public final C12557a<T> mo30160a(int i) {
        C12036b.m38660a(i, "bufferSize");
        return C12359o0.m39055a((ObservableSource<T>) this, i);
    }

    /* renamed from: a */
    public final Observable<T> mo30149a(C11947c<T, T, T> cVar) {
        C12036b.m38663a(cVar, "accumulator is null");
        return C11915a.m38448a((Observable<T>) new C12377q0<T>(this, cVar));
    }

    /* renamed from: a */
    public final Observable<T> mo30154a(T t) {
        C12036b.m38663a(t, "item is null");
        return m38304a((ObservableSource<? extends T>[]) new ObservableSource[]{m38309b(t), this});
    }

    /* renamed from: a */
    public final Disposable mo30157a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo30159a(consumer, consumer2, C12015a.f27744c, C12015a.m38648b());
    }

    /* renamed from: a */
    public final Disposable mo30158a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar) {
        return mo30159a(consumer, consumer2, aVar, C12015a.m38648b());
    }

    /* renamed from: a */
    public final Disposable mo30159a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, Consumer<? super Disposable> consumer3) {
        C12036b.m38663a(consumer, "onNext is null");
        C12036b.m38663a(consumer2, "onError is null");
        C12036b.m38663a(aVar, "onComplete is null");
        C12036b.m38663a(consumer3, "onSubscribe is null");
        C12061j jVar = new C12061j(consumer, consumer2, aVar, consumer3);
        mo30162a((C11968q<? super T>) jVar);
        return jVar;
    }

    /* renamed from: a */
    public final void mo30162a(C11968q<? super T> qVar) {
        C12036b.m38663a(qVar, "observer is null");
        try {
            C11968q a = C11915a.m38451a(this, qVar);
            C12036b.m38663a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo27408b(a);
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
    public final Flowable<T> mo30135a(C11907a aVar) {
        C12205s sVar = new C12205s(this);
        int i = C11906a.f27563a[aVar.ordinal()];
        if (i == 1) {
            return sVar.mo30093d();
        }
        if (i == 2) {
            return sVar.mo30096e();
        }
        if (i == 3) {
            return sVar;
        }
        if (i != 4) {
            return sVar.mo30088c();
        }
        return C11915a.m38446a((Flowable<T>) new C12112a0<T>(sVar));
    }
}
