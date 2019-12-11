package p520io.reactivex.p531y.p533b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11959m;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11951g;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12005d;

/* renamed from: io.reactivex.y.b.a */
/* compiled from: Functions */
public final class C12015a {

    /* renamed from: a */
    static final Function<Object, Object> f27742a = new C12026k();

    /* renamed from: b */
    public static final Runnable f27743b = new C12022g();

    /* renamed from: c */
    public static final C11945a f27744c = new C12019d();

    /* renamed from: d */
    static final Consumer<Object> f27745d = new C12020e();

    /* renamed from: e */
    public static final Consumer<Throwable> f27746e = new C12034s();

    /* renamed from: f */
    public static final C11951g f27747f = new C12021f();

    /* renamed from: g */
    static final C11952h<Object> f27748g = new C12035t();

    /* renamed from: io.reactivex.y.b.a$a */
    /* compiled from: Functions */
    static final class C12016a<T1, T2, R> implements Function<Object[], R> {

        /* renamed from: c */
        final C11947c<? super T1, ? super T2, ? extends R> f27749c;

        C12016a(C11947c<? super T1, ? super T2, ? extends R> cVar) {
            this.f27749c = cVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f27749c.apply(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.y.b.a$b */
    /* compiled from: Functions */
    static final class C12017b<T> implements Callable<List<T>> {

        /* renamed from: c */
        final int f27750c;

        C12017b(int i) {
            this.f27750c = i;
        }

        public List<T> call() throws Exception {
            return new ArrayList(this.f27750c);
        }
    }

    /* renamed from: io.reactivex.y.b.a$c */
    /* compiled from: Functions */
    static final class C12018c<T, U> implements Function<T, U> {

        /* renamed from: c */
        final Class<U> f27751c;

        C12018c(Class<U> cls) {
            this.f27751c = cls;
        }

        public U apply(T t) throws Exception {
            return this.f27751c.cast(t);
        }
    }

    /* renamed from: io.reactivex.y.b.a$d */
    /* compiled from: Functions */
    static final class C12019d implements C11945a {
        C12019d() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.y.b.a$e */
    /* compiled from: Functions */
    static final class C12020e implements Consumer<Object> {
        C12020e() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.y.b.a$f */
    /* compiled from: Functions */
    static final class C12021f implements C11951g {
        C12021f() {
        }

        /* renamed from: a */
        public void mo30265a(long j) {
        }
    }

    /* renamed from: io.reactivex.y.b.a$g */
    /* compiled from: Functions */
    static final class C12022g implements Runnable {
        C12022g() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.y.b.a$h */
    /* compiled from: Functions */
    static final class C12023h implements Consumer<Throwable> {
        C12023h() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C11915a.m38466b(th);
        }
    }

    /* renamed from: io.reactivex.y.b.a$i */
    /* compiled from: Functions */
    static final class C12024i implements C11952h<Object> {
        C12024i() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: io.reactivex.y.b.a$j */
    /* compiled from: Functions */
    static final class C12025j implements C11945a {

        /* renamed from: a */
        final Future<?> f27752a;

        C12025j(Future<?> future) {
            this.f27752a = future;
        }

        public void run() throws Exception {
            this.f27752a.get();
        }
    }

    /* renamed from: io.reactivex.y.b.a$k */
    /* compiled from: Functions */
    static final class C12026k implements Function<Object, Object> {
        C12026k() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.y.b.a$l */
    /* compiled from: Functions */
    static final class C12027l<T, U> implements Callable<U>, Function<T, U> {

        /* renamed from: c */
        final U f27753c;

        C12027l(U u) {
            this.f27753c = u;
        }

        public U apply(T t) throws Exception {
            return this.f27753c;
        }

        public U call() throws Exception {
            return this.f27753c;
        }
    }

    /* renamed from: io.reactivex.y.b.a$m */
    /* compiled from: Functions */
    static final class C12028m implements Consumer<C14314c> {
        C12028m() {
        }

        /* renamed from: a */
        public void accept(C14314c cVar) throws Exception {
            cVar.mo29946b(Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.y.b.a$n */
    /* compiled from: Functions */
    static final class C12029n implements Comparator<Object> {
        C12029n() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.y.b.a$o */
    /* compiled from: Functions */
    static final class C12030o<T> implements C11945a {

        /* renamed from: a */
        final Consumer<? super C11959m<T>> f27754a;

        C12030o(Consumer<? super C11959m<T>> consumer) {
            this.f27754a = consumer;
        }

        public void run() throws Exception {
            this.f27754a.accept(C11959m.m38516b());
        }
    }

    /* renamed from: io.reactivex.y.b.a$p */
    /* compiled from: Functions */
    static final class C12031p<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final Consumer<? super C11959m<T>> f27755c;

        C12031p(Consumer<? super C11959m<T>> consumer) {
            this.f27755c = consumer;
        }

        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f27755c.accept(C11959m.m38515a(th));
        }
    }

    /* renamed from: io.reactivex.y.b.a$q */
    /* compiled from: Functions */
    static final class C12032q<T> implements Consumer<T> {

        /* renamed from: c */
        final Consumer<? super C11959m<T>> f27756c;

        C12032q(Consumer<? super C11959m<T>> consumer) {
            this.f27756c = consumer;
        }

        public void accept(T t) throws Exception {
            this.f27756c.accept(C11959m.m38514a(t));
        }
    }

    /* renamed from: io.reactivex.y.b.a$r */
    /* compiled from: Functions */
    static final class C12033r implements Callable<Object> {
        C12033r() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: io.reactivex.y.b.a$s */
    /* compiled from: Functions */
    static final class C12034s implements Consumer<Throwable> {
        C12034s() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C11915a.m38466b((Throwable) new C12005d(th));
        }
    }

    /* renamed from: io.reactivex.y.b.a$t */
    /* compiled from: Functions */
    static final class C12035t implements C11952h<Object> {
        C12035t() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    static {
        new C12023h();
        new C12024i();
        new C12033r();
        new C12029n();
        new C12028m();
    }

    /* renamed from: a */
    public static <T1, T2, R> Function<Object[], R> m38641a(C11947c<? super T1, ? super T2, ? extends R> cVar) {
        C12036b.m38663a(cVar, "f is null");
        return new C12016a(cVar);
    }

    /* renamed from: b */
    public static <T> Consumer<T> m38648b() {
        return f27745d;
    }

    /* renamed from: c */
    public static <T> Function<T, T> m38652c() {
        return f27742a;
    }

    /* renamed from: b */
    public static <T, U> Function<T, U> m38650b(U u) {
        return new C12027l(u);
    }

    /* renamed from: c */
    public static <T> Consumer<T> m38651c(Consumer<? super C11959m<T>> consumer) {
        return new C12032q(consumer);
    }

    /* renamed from: a */
    public static <T> C11952h<T> m38645a() {
        return f27748g;
    }

    /* renamed from: b */
    public static <T> Consumer<Throwable> m38649b(Consumer<? super C11959m<T>> consumer) {
        return new C12031p(consumer);
    }

    /* renamed from: a */
    public static C11945a m38644a(Future<?> future) {
        return new C12025j(future);
    }

    /* renamed from: a */
    public static <T> Callable<T> m38647a(T t) {
        return new C12027l(t);
    }

    /* renamed from: a */
    public static <T, U> Function<T, U> m38642a(Class<U> cls) {
        return new C12018c(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m38646a(int i) {
        return new C12017b(i);
    }

    /* renamed from: a */
    public static <T> C11945a m38643a(Consumer<? super C11959m<T>> consumer) {
        return new C12030o(consumer);
    }
}
