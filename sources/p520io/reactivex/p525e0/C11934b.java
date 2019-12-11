package p520io.reactivex.p525e0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p520io.reactivex.C11969r;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p544g.C12493b;
import p520io.reactivex.p531y.p544g.C12498d;
import p520io.reactivex.p531y.p544g.C12506f;
import p520io.reactivex.p531y.p544g.C12510g;
import p520io.reactivex.p531y.p544g.C12522p;
import p520io.reactivex.p531y.p544g.C12524q;

/* renamed from: io.reactivex.e0.b */
/* compiled from: Schedulers */
public final class C11934b {

    /* renamed from: a */
    static final C11969r f27613a = C11915a.m38472e(new C11942h());

    /* renamed from: b */
    static final C11969r f27614b = C11915a.m38465b((Callable<C11969r>) new C11936b<C11969r>());

    /* renamed from: c */
    static final C11969r f27615c = C11915a.m38469c((Callable<C11969r>) new C11937c<C11969r>());

    /* renamed from: d */
    static final C11969r f27616d = C12524q.m39283b();

    /* renamed from: io.reactivex.e0.b$a */
    /* compiled from: Schedulers */
    static final class C11935a {

        /* renamed from: a */
        static final C11969r f27617a = new C12493b();
    }

    /* renamed from: io.reactivex.e0.b$b */
    /* compiled from: Schedulers */
    static final class C11936b implements Callable<C11969r> {
        C11936b() {
        }

        public C11969r call() throws Exception {
            return C11935a.f27617a;
        }
    }

    /* renamed from: io.reactivex.e0.b$c */
    /* compiled from: Schedulers */
    static final class C11937c implements Callable<C11969r> {
        C11937c() {
        }

        public C11969r call() throws Exception {
            return C11938d.f27618a;
        }
    }

    /* renamed from: io.reactivex.e0.b$d */
    /* compiled from: Schedulers */
    static final class C11938d {

        /* renamed from: a */
        static final C11969r f27618a = new C12506f();
    }

    /* renamed from: io.reactivex.e0.b$e */
    /* compiled from: Schedulers */
    static final class C11939e {

        /* renamed from: a */
        static final C11969r f27619a = new C12510g();
    }

    /* renamed from: io.reactivex.e0.b$f */
    /* compiled from: Schedulers */
    static final class C11940f implements Callable<C11969r> {
        C11940f() {
        }

        public C11969r call() throws Exception {
            return C11939e.f27619a;
        }
    }

    /* renamed from: io.reactivex.e0.b$g */
    /* compiled from: Schedulers */
    static final class C11941g {

        /* renamed from: a */
        static final C11969r f27620a = new C12522p();
    }

    /* renamed from: io.reactivex.e0.b$h */
    /* compiled from: Schedulers */
    static final class C11942h implements Callable<C11969r> {
        C11942h() {
        }

        public C11969r call() throws Exception {
            return C11941g.f27620a;
        }
    }

    static {
        C11915a.m38471d(new C11940f());
    }

    /* renamed from: a */
    public static C11969r m38498a() {
        return C11915a.m38453a(f27614b);
    }

    /* renamed from: b */
    public static C11969r m38500b() {
        return C11915a.m38464b(f27615c);
    }

    /* renamed from: c */
    public static C11969r m38501c() {
        return C11915a.m38468c(f27613a);
    }

    /* renamed from: d */
    public static C11969r m38502d() {
        return f27616d;
    }

    /* renamed from: a */
    public static C11969r m38499a(Executor executor) {
        return new C12498d(executor, false);
    }
}
