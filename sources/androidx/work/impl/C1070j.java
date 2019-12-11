package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1025b;
import androidx.work.C1033g;
import androidx.work.C1034h;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker.Result.C1012a;
import androidx.work.ListenableWorker.Result.C1013b;
import androidx.work.ListenableWorker.Result.C1014c;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters;
import androidx.work.WorkerParameters.C1023a;
import androidx.work.impl.p011m.C1099b;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.p011m.C1115k;
import androidx.work.impl.p011m.C1127n;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.j */
/* compiled from: WorkerWrapper */
public class C1070j implements Runnable {

    /* renamed from: l0 */
    static final String f4191l0 = C1034h.m5551a("WorkerWrapper");

    /* renamed from: U */
    private String f4192U;

    /* renamed from: V */
    private List<C1060d> f4193V;

    /* renamed from: W */
    private C1023a f4194W;

    /* renamed from: X */
    C1111j f4195X;

    /* renamed from: Y */
    ListenableWorker f4196Y;

    /* renamed from: Z */
    Result f4197Z = Result.m5467a();

    /* renamed from: a0 */
    private C1025b f4198a0;

    /* renamed from: b0 */
    private TaskExecutor f4199b0;

    /* renamed from: c */
    private Context f4200c;

    /* renamed from: c0 */
    private WorkDatabase f4201c0;

    /* renamed from: d0 */
    private C1115k f4202d0;

    /* renamed from: e0 */
    private C1099b f4203e0;

    /* renamed from: f0 */
    private C1127n f4204f0;

    /* renamed from: g0 */
    private List<String> f4205g0;

    /* renamed from: h0 */
    private String f4206h0;

    /* renamed from: i0 */
    private SettableFuture<Boolean> f4207i0 = SettableFuture.m5920d();

    /* renamed from: j0 */
    ListenableFuture<Result> f4208j0 = null;

    /* renamed from: k0 */
    private volatile boolean f4209k0;

    /* renamed from: androidx.work.impl.j$a */
    /* compiled from: WorkerWrapper */
    class C1071a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ SettableFuture f4211c;

        C1071a(SettableFuture settableFuture) {
            this.f4211c = settableFuture;
        }

        public void run() {
            try {
                C1034h.m5550a().mo5697a(C1070j.f4191l0, String.format("Starting work for %s", new Object[]{C1070j.this.f4195X.f4282c}), new Throwable[0]);
                C1070j.this.f4208j0 = C1070j.this.f4196Y.startWork();
                this.f4211c.mo5909a(C1070j.this.f4208j0);
            } catch (Throwable th) {
                this.f4211c.mo5911a(th);
            }
        }
    }

    /* renamed from: androidx.work.impl.j$b */
    /* compiled from: WorkerWrapper */
    class C1072b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f4212U;

        /* renamed from: c */
        final /* synthetic */ SettableFuture f4214c;

        C1072b(SettableFuture settableFuture, String str) {
            this.f4214c = settableFuture;
            this.f4212U = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                Result result = (Result) this.f4214c.get();
                if (result == null) {
                    C1034h.m5550a().mo5698b(C1070j.f4191l0, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C1070j.this.f4195X.f4282c}), new Throwable[0]);
                } else {
                    C1034h.m5550a().mo5697a(C1070j.f4191l0, String.format("%s returned a %s result.", new Object[]{C1070j.this.f4195X.f4282c, result}), new Throwable[0]);
                    C1070j.this.f4197Z = result;
                }
            } catch (CancellationException e) {
                C1034h.m5550a().mo5699c(C1070j.f4191l0, String.format("%s was cancelled", new Object[]{this.f4212U}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C1034h.m5550a().mo5698b(C1070j.f4191l0, String.format("%s failed because it threw an exception/error", new Object[]{this.f4212U}), e2);
            } catch (Throwable th) {
                C1070j.this.mo5785b();
                throw th;
            }
            C1070j.this.mo5785b();
        }
    }

    /* renamed from: androidx.work.impl.j$c */
    /* compiled from: WorkerWrapper */
    public static class C1073c {

        /* renamed from: a */
        Context f4215a;

        /* renamed from: b */
        ListenableWorker f4216b;

        /* renamed from: c */
        TaskExecutor f4217c;

        /* renamed from: d */
        C1025b f4218d;

        /* renamed from: e */
        WorkDatabase f4219e;

        /* renamed from: f */
        String f4220f;

        /* renamed from: g */
        List<C1060d> f4221g;

        /* renamed from: h */
        C1023a f4222h = new C1023a();

        public C1073c(Context context, C1025b bVar, TaskExecutor taskExecutor, WorkDatabase workDatabase, String str) {
            this.f4215a = context.getApplicationContext();
            this.f4217c = taskExecutor;
            this.f4218d = bVar;
            this.f4219e = workDatabase;
            this.f4220f = str;
        }

        /* renamed from: a */
        public C1073c mo5791a(List<C1060d> list) {
            this.f4221g = list;
            return this;
        }

        /* renamed from: a */
        public C1073c mo5790a(C1023a aVar) {
            if (aVar != null) {
                this.f4222h = aVar;
            }
            return this;
        }

        /* renamed from: a */
        public C1070j mo5792a() {
            return new C1070j(this);
        }
    }

    C1070j(C1073c cVar) {
        this.f4200c = cVar.f4215a;
        this.f4199b0 = cVar.f4217c;
        this.f4192U = cVar.f4220f;
        this.f4193V = cVar.f4221g;
        this.f4194W = cVar.f4222h;
        this.f4196Y = cVar.f4216b;
        this.f4198a0 = cVar.f4218d;
        this.f4201c0 = cVar.f4219e;
        this.f4202d0 = this.f4201c0.mo5705d();
        this.f4203e0 = this.f4201c0.mo5702a();
        this.f4204f0 = this.f4201c0.mo5706e();
    }

    /* renamed from: d */
    private void m5704d() {
        if (this.f4199b0.mo5938a() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be executed on the Background executor thread.");
        }
    }

    /* renamed from: e */
    private void m5705e() {
        this.f4201c0.beginTransaction();
        try {
            this.f4202d0.mo5866a(State.ENQUEUED, this.f4192U);
            this.f4202d0.mo5875b(this.f4192U, System.currentTimeMillis());
            if (VERSION.SDK_INT < 23) {
                this.f4202d0.mo5867a(this.f4192U, -1);
            }
            this.f4201c0.setTransactionSuccessful();
        } finally {
            this.f4201c0.endTransaction();
            m5703b(true);
        }
    }

    /* renamed from: f */
    private void m5706f() {
        this.f4201c0.beginTransaction();
        try {
            this.f4202d0.mo5875b(this.f4192U, System.currentTimeMillis());
            this.f4202d0.mo5866a(State.ENQUEUED, this.f4192U);
            this.f4202d0.mo5882g(this.f4192U);
            if (VERSION.SDK_INT < 23) {
                this.f4202d0.mo5867a(this.f4192U, -1);
            }
            this.f4201c0.setTransactionSuccessful();
        } finally {
            this.f4201c0.endTransaction();
            m5703b(false);
        }
    }

    /* renamed from: g */
    private void m5707g() {
        State e = this.f4202d0.mo5880e(this.f4192U);
        if (e == State.RUNNING) {
            C1034h.m5550a().mo5697a(f4191l0, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f4192U}), new Throwable[0]);
            m5703b(true);
            return;
        }
        C1034h.m5550a().mo5697a(f4191l0, String.format("Status for %s is %s; not doing any work", new Object[]{this.f4192U, e}), new Throwable[0]);
        m5703b(false);
    }

    /* renamed from: h */
    private void m5708h() {
        Data a;
        if (!m5710j()) {
            this.f4201c0.beginTransaction();
            try {
                this.f4195X = this.f4202d0.mo5881f(this.f4192U);
                if (this.f4195X == null) {
                    C1034h.m5550a().mo5698b(f4191l0, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f4192U}), new Throwable[0]);
                    m5703b(false);
                } else if (this.f4195X.f4281b != State.ENQUEUED) {
                    m5707g();
                    this.f4201c0.setTransactionSuccessful();
                    C1034h.m5550a().mo5697a(f4191l0, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f4195X.f4282c}), new Throwable[0]);
                    this.f4201c0.endTransaction();
                } else {
                    if (this.f4195X.mo5855d() || this.f4195X.mo5854c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(VERSION.SDK_INT < 23 && this.f4195X.f4287h != this.f4195X.f4288i && this.f4195X.f4293n == 0) && currentTimeMillis < this.f4195X.mo5849a()) {
                            C1034h.m5550a().mo5697a(f4191l0, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f4195X.f4282c}), new Throwable[0]);
                            m5703b(true);
                            this.f4201c0.endTransaction();
                            return;
                        }
                    }
                    this.f4201c0.setTransactionSuccessful();
                    this.f4201c0.endTransaction();
                    if (this.f4195X.mo5855d()) {
                        a = this.f4195X.f4284e;
                    } else {
                        C1033g a2 = C1033g.m5548a(this.f4195X.f4283d);
                        if (a2 == null) {
                            C1034h.m5550a().mo5698b(f4191l0, String.format("Could not create Input Merger %s", new Object[]{this.f4195X.f4283d}), new Throwable[0]);
                            mo5786c();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f4195X.f4284e);
                        arrayList.addAll(this.f4202d0.mo5884i(this.f4192U));
                        a = a2.mo5572a((List<Data>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f4192U), a, this.f4205g0, this.f4194W, this.f4195X.f4290k, this.f4198a0.mo5655a(), this.f4199b0, this.f4198a0.mo5660f());
                    if (this.f4196Y == null) {
                        this.f4196Y = this.f4198a0.mo5660f().mo5649b(this.f4200c, this.f4195X.f4282c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f4196Y;
                    if (listenableWorker == null) {
                        C1034h.m5550a().mo5698b(f4191l0, String.format("Could not create Worker %s", new Object[]{this.f4195X.f4282c}), new Throwable[0]);
                        mo5786c();
                    } else if (listenableWorker.isUsed()) {
                        C1034h.m5550a().mo5698b(f4191l0, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f4195X.f4282c}), new Throwable[0]);
                        mo5786c();
                    } else {
                        this.f4196Y.setUsed();
                        if (!m5711k()) {
                            m5707g();
                        } else if (!m5710j()) {
                            SettableFuture d = SettableFuture.m5920d();
                            this.f4199b0.mo5940b().execute(new C1071a(d));
                            d.mo5913a((Runnable) new C1072b(d, this.f4206h0), this.f4199b0.mo5941c());
                        }
                    }
                }
            } finally {
                this.f4201c0.endTransaction();
            }
        }
    }

    /* renamed from: i */
    private void m5709i() {
        this.f4201c0.beginTransaction();
        try {
            this.f4202d0.mo5866a(State.SUCCEEDED, this.f4192U);
            this.f4202d0.mo5872a(this.f4192U, ((C1014c) this.f4197Z).mo5612d());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f4203e0.mo5836a(this.f4192U)) {
                if (this.f4202d0.mo5880e(str) == State.BLOCKED && this.f4203e0.mo5838b(str)) {
                    C1034h.m5550a().mo5699c(f4191l0, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                    this.f4202d0.mo5866a(State.ENQUEUED, str);
                    this.f4202d0.mo5875b(str, currentTimeMillis);
                }
            }
            this.f4201c0.setTransactionSuccessful();
        } finally {
            this.f4201c0.endTransaction();
            m5703b(false);
        }
    }

    /* renamed from: j */
    private boolean m5710j() {
        if (!this.f4209k0) {
            return false;
        }
        C1034h.m5550a().mo5697a(f4191l0, String.format("Work interrupted for %s", new Object[]{this.f4206h0}), new Throwable[0]);
        State e = this.f4202d0.mo5880e(this.f4192U);
        if (e == null) {
            m5703b(false);
        } else {
            m5703b(!e.mo5635a());
        }
        return true;
    }

    /* renamed from: k */
    private boolean m5711k() {
        this.f4201c0.beginTransaction();
        try {
            boolean z = true;
            if (this.f4202d0.mo5880e(this.f4192U) == State.ENQUEUED) {
                this.f4202d0.mo5866a(State.RUNNING, this.f4192U);
                this.f4202d0.mo5885j(this.f4192U);
            } else {
                z = false;
            }
            this.f4201c0.setTransactionSuccessful();
            return z;
        } finally {
            this.f4201c0.endTransaction();
        }
    }

    /* renamed from: a */
    public ListenableFuture<Boolean> mo5783a() {
        return this.f4207i0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5785b() {
        m5704d();
        boolean z = false;
        if (!m5710j()) {
            try {
                this.f4201c0.beginTransaction();
                State e = this.f4202d0.mo5880e(this.f4192U);
                if (e == null) {
                    m5703b(false);
                    z = true;
                } else if (e == State.RUNNING) {
                    m5701a(this.f4197Z);
                    z = this.f4202d0.mo5880e(this.f4192U).mo5635a();
                } else if (!e.mo5635a()) {
                    m5705e();
                }
                this.f4201c0.setTransactionSuccessful();
            } finally {
                this.f4201c0.endTransaction();
            }
        }
        List<C1060d> list = this.f4193V;
        if (list != null) {
            if (z) {
                for (C1060d a : list) {
                    a.mo5737a(this.f4192U);
                }
            }
            C1061e.m5661a(this.f4198a0, this.f4201c0, this.f4193V);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5786c() {
        this.f4201c0.beginTransaction();
        try {
            m5702a(this.f4192U);
            this.f4202d0.mo5872a(this.f4192U, ((C1012a) this.f4197Z).mo5605d());
            this.f4201c0.setTransactionSuccessful();
        } finally {
            this.f4201c0.endTransaction();
            m5703b(false);
        }
    }

    public void run() {
        this.f4205g0 = this.f4204f0.mo5888a(this.f4192U);
        this.f4206h0 = m5700a(this.f4205g0);
        m5708h();
    }

    /* renamed from: a */
    public void mo5784a(boolean z) {
        this.f4209k0 = true;
        m5710j();
        ListenableFuture<Result> listenableFuture = this.f4208j0;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        ListenableWorker listenableWorker = this.f4196Y;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    /* renamed from: a */
    private void m5701a(Result result) {
        if (result instanceof C1014c) {
            C1034h.m5550a().mo5699c(f4191l0, String.format("Worker result SUCCESS for %s", new Object[]{this.f4206h0}), new Throwable[0]);
            if (this.f4195X.mo5855d()) {
                m5706f();
            } else {
                m5709i();
            }
        } else if (result instanceof C1013b) {
            C1034h.m5550a().mo5699c(f4191l0, String.format("Worker result RETRY for %s", new Object[]{this.f4206h0}), new Throwable[0]);
            m5705e();
        } else {
            C1034h.m5550a().mo5699c(f4191l0, String.format("Worker result FAILURE for %s", new Object[]{this.f4206h0}), new Throwable[0]);
            if (this.f4195X.mo5855d()) {
                m5706f();
            } else {
                mo5786c();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[Catch:{ all -> 0x0039 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5703b(boolean r4) {
        /*
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.f4201c0     // Catch:{ all -> 0x0039 }
            r0.beginTransaction()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.f4201c0     // Catch:{ all -> 0x0039 }
            androidx.work.impl.m.k r0 = r0.mo5705d()     // Catch:{ all -> 0x0039 }
            java.util.List r0 = r0.mo5876c()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r3.f4200c     // Catch:{ all -> 0x0039 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.C1137d.m5916a(r0, r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            androidx.work.impl.WorkDatabase r0 = r3.f4201c0     // Catch:{ all -> 0x0039 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.f4201c0
            r0.endTransaction()
            androidx.work.impl.utils.futures.SettableFuture<java.lang.Boolean> r0 = r3.f4207i0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.mo5910a(r4)
            return
        L_0x0039:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.f4201c0
            r0.endTransaction()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1070j.m5703b(boolean):void");
    }

    /* renamed from: a */
    private void m5702a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4202d0.mo5880e(str2) != State.CANCELLED) {
                this.f4202d0.mo5866a(State.FAILED, str2);
            }
            linkedList.addAll(this.f4203e0.mo5836a(str2));
        }
    }

    /* renamed from: a */
    private String m5700a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f4192U);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }
}
