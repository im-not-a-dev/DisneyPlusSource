package p163g.p449j.p450a.p451a.p467f;

import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: g.j.a.a.f.k */
public final class C11439k {

    /* renamed from: g.j.a.a.f.k$a */
    private static final class C11440a implements C11441b {

        /* renamed from: a */
        private final CountDownLatch f26777a;

        private C11440a() {
            this.f26777a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo15690a(Exception exc) {
            this.f26777a.countDown();
        }

        /* renamed from: b */
        public final void mo29278b() throws InterruptedException {
            this.f26777a.await();
        }

        public final void onSuccess(Object obj) {
            this.f26777a.countDown();
        }

        /* renamed from: a */
        public final void mo29246a() {
            this.f26777a.countDown();
        }

        /* synthetic */ C11440a(C11431d0 d0Var) {
            this();
        }

        /* renamed from: a */
        public final boolean mo29277a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f26777a.await(j, timeUnit);
        }
    }

    /* renamed from: g.j.a.a.f.k$b */
    interface C11441b extends C11426b, C11430d, C11432e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C11435h<TResult> m36959a(TResult tresult) {
        C11429c0 c0Var = new C11429c0();
        c0Var.mo29261a(tresult);
        return c0Var;
    }

    /* renamed from: b */
    private static <TResult> TResult m36964b(C11435h<TResult> hVar) throws ExecutionException {
        if (hVar.mo29268e()) {
            return hVar.mo29263b();
        }
        if (hVar.mo29266c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo29258a());
    }

    /* renamed from: a */
    public static <TResult> C11435h<TResult> m36960a(Executor executor, Callable<TResult> callable) {
        C9908u.m30854a(executor, (Object) "Executor must not be null");
        C9908u.m30854a(callable, (Object) "Callback must not be null");
        C11429c0 c0Var = new C11429c0();
        executor.execute(new C11431d0(c0Var, callable));
        return c0Var;
    }

    /* renamed from: a */
    public static <TResult> TResult m36961a(C11435h<TResult> hVar) throws ExecutionException, InterruptedException {
        C9908u.m30856a();
        C9908u.m30854a(hVar, (Object) "Task must not be null");
        if (hVar.mo29267d()) {
            return m36964b(hVar);
        }
        C11440a aVar = new C11440a(null);
        m36963a(hVar, (C11441b) aVar);
        aVar.mo29278b();
        return m36964b(hVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m36962a(C11435h<TResult> hVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C9908u.m30856a();
        C9908u.m30854a(hVar, (Object) "Task must not be null");
        C9908u.m30854a(timeUnit, (Object) "TimeUnit must not be null");
        if (hVar.mo29267d()) {
            return m36964b(hVar);
        }
        C11440a aVar = new C11440a(null);
        m36963a(hVar, (C11441b) aVar);
        if (aVar.mo29277a(j, timeUnit)) {
            return m36964b(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m36963a(C11435h<?> hVar, C11441b bVar) {
        hVar.mo29256a(C11437j.f26775b, (C11432e<? super TResult>) bVar);
        hVar.mo29255a(C11437j.f26775b, (C11430d) bVar);
        hVar.mo29253a(C11437j.f26775b, (C11426b) bVar);
    }
}
