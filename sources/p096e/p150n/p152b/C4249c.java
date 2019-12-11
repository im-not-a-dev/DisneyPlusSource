package p096e.p150n.p152b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.n.b.c */
/* compiled from: ModernAsyncTask */
abstract class C4249c<Params, Progress, Result> {

    /* renamed from: Y */
    private static final ThreadFactory f10597Y = new C4250a();

    /* renamed from: Z */
    private static final BlockingQueue<Runnable> f10598Z = new LinkedBlockingQueue(10);

    /* renamed from: a0 */
    public static final Executor f10599a0;

    /* renamed from: b0 */
    private static C4255f f10600b0;

    /* renamed from: U */
    private final FutureTask<Result> f10601U = new C4252c(this.f10605c);

    /* renamed from: V */
    private volatile C4256g f10602V = C4256g.PENDING;

    /* renamed from: W */
    final AtomicBoolean f10603W = new AtomicBoolean();

    /* renamed from: X */
    final AtomicBoolean f10604X = new AtomicBoolean();

    /* renamed from: c */
    private final C4257h<Params, Result> f10605c = new C4251b();

    /* renamed from: e.n.b.c$a */
    /* compiled from: ModernAsyncTask */
    static class C4250a implements ThreadFactory {

        /* renamed from: c */
        private final AtomicInteger f10606c = new AtomicInteger(1);

        C4250a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.f10606c.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: e.n.b.c$b */
    /* compiled from: ModernAsyncTask */
    class C4251b extends C4257h<Params, Result> {
        C4251b() {
        }

        public Result call() throws Exception {
            C4249c.this.f10604X.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C4249c.this.mo14952a(this.f10616c);
                Binder.flushPendingCommands();
                C4249c.this.mo14985d(result);
                return result;
            } catch (Throwable th) {
                C4249c.this.mo14985d(result);
                throw th;
            }
        }
    }

    /* renamed from: e.n.b.c$c */
    /* compiled from: ModernAsyncTask */
    class C4252c extends FutureTask<Result> {
        C4252c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            String str = "An error occurred while executing doInBackground()";
            try {
                C4249c.this.mo14986e(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(str, e2.getCause());
            } catch (CancellationException unused) {
                C4249c.this.mo14986e(null);
            } catch (Throwable th) {
                throw new RuntimeException(str, th);
            }
        }
    }

    /* renamed from: e.n.b.c$d */
    /* compiled from: ModernAsyncTask */
    static /* synthetic */ class C4253d {

        /* renamed from: a */
        static final /* synthetic */ int[] f10609a = new int[C4256g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                e.n.b.c$g[] r0 = p096e.p150n.p152b.C4249c.C4256g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10609a = r0
                int[] r0 = f10609a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.n.b.c$g r1 = p096e.p150n.p152b.C4249c.C4256g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10609a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.n.b.c$g r1 = p096e.p150n.p152b.C4249c.C4256g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p150n.p152b.C4249c.C4253d.<clinit>():void");
        }
    }

    /* renamed from: e.n.b.c$e */
    /* compiled from: ModernAsyncTask */
    private static class C4254e<Data> {

        /* renamed from: a */
        final C4249c f10610a;

        /* renamed from: b */
        final Data[] f10611b;

        C4254e(C4249c cVar, Data... dataArr) {
            this.f10610a = cVar;
            this.f10611b = dataArr;
        }
    }

    /* renamed from: e.n.b.c$f */
    /* compiled from: ModernAsyncTask */
    private static class C4255f extends Handler {
        C4255f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C4254e eVar = (C4254e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f10610a.mo14979a(eVar.f10611b[0]);
            } else if (i == 2) {
                eVar.f10610a.mo14983b((Progress[]) eVar.f10611b);
            }
        }
    }

    /* renamed from: e.n.b.c$g */
    /* compiled from: ModernAsyncTask */
    public enum C4256g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: e.n.b.c$h */
    /* compiled from: ModernAsyncTask */
    private static abstract class C4257h<Params, Result> implements Callable<Result> {

        /* renamed from: c */
        Params[] f10616c;

        C4257h() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f10598Z, f10597Y);
        f10599a0 = threadPoolExecutor;
    }

    C4249c() {
    }

    /* renamed from: d */
    private static Handler m14640d() {
        C4255f fVar;
        synchronized (C4249c.class) {
            if (f10600b0 == null) {
                f10600b0 = new C4255f();
            }
            fVar = f10600b0;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo14952a(Params... paramsArr);

    /* renamed from: a */
    public final boolean mo14980a() {
        return this.f10603W.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14982b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14954b(Result result) {
        mo14982b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14983b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14984c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14955c(Result result) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo14986e(Result result) {
        if (!this.f10604X.get()) {
            mo14985d(result);
        }
    }

    /* renamed from: a */
    public final boolean mo14981a(boolean z) {
        this.f10603W.set(true);
        return this.f10601U.cancel(z);
    }

    /* renamed from: a */
    public final C4249c<Params, Progress, Result> mo14978a(Executor executor, Params... paramsArr) {
        if (this.f10602V != C4256g.PENDING) {
            int i = C4253d.f10609a[this.f10602V.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f10602V = C4256g.RUNNING;
            mo14984c();
            this.f10605c.f10616c = paramsArr;
            executor.execute(this.f10601U);
            return this;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Result mo14985d(Result result) {
        m14640d().obtainMessage(1, new C4254e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14979a(Result result) {
        if (mo14980a()) {
            mo14954b(result);
        } else {
            mo14955c(result);
        }
        this.f10602V = C4256g.FINISHED;
    }
}
