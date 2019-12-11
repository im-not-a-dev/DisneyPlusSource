package p520io.reactivex.p527w.p528b;

import java.util.concurrent.Callable;
import p520io.reactivex.C11969r;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.w.b.a */
/* compiled from: RxAndroidPlugins */
public final class C11991a {

    /* renamed from: a */
    private static volatile Function<Callable<C11969r>, C11969r> f27718a;

    /* renamed from: b */
    private static volatile Function<C11969r, C11969r> f27719b;

    /* renamed from: a */
    public static C11969r m38596a(C11969r rVar) {
        if (rVar != null) {
            Function<C11969r, C11969r> function = f27719b;
            if (function == null) {
                return rVar;
            }
            return (C11969r) m38598a(function, (T) rVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: b */
    public static C11969r m38599b(Callable<C11969r> callable) {
        if (callable != null) {
            Function<Callable<C11969r>, C11969r> function = f27718a;
            if (function == null) {
                return m38597a(callable);
            }
            return m38595a(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    static C11969r m38597a(Callable<C11969r> callable) {
        try {
            C11969r rVar = (C11969r) callable.call();
            if (rVar != null) {
                return rVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C12003b.m38613a(th);
            throw null;
        }
    }

    /* renamed from: a */
    static C11969r m38595a(Function<Callable<C11969r>, C11969r> function, Callable<C11969r> callable) {
        C11969r rVar = (C11969r) m38598a(function, (T) callable);
        if (rVar != null) {
            return rVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    static <T, R> R m38598a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            C12003b.m38613a(th);
            throw null;
        }
    }
}
