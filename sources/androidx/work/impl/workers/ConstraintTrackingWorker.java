package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1034h;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p008l.C1077c;
import androidx.work.impl.p008l.C1078d;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements C1077c {

    /* renamed from: Y */
    private static final String f4390Y = C1034h.m5551a("ConstraintTrkngWrkr");

    /* renamed from: U */
    final Object f4391U = new Object();

    /* renamed from: V */
    volatile boolean f4392V = false;

    /* renamed from: W */
    SettableFuture<Result> f4393W = SettableFuture.m5920d();

    /* renamed from: X */
    private ListenableWorker f4394X;

    /* renamed from: c */
    private WorkerParameters f4395c;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C1162a implements Runnable {
        C1162a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo5948d();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C1163b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ListenableFuture f4398c;

        C1163b(ListenableFuture listenableFuture) {
            this.f4398c = listenableFuture;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4391U) {
                if (ConstraintTrackingWorker.this.f4392V) {
                    ConstraintTrackingWorker.this.mo5947c();
                } else {
                    ConstraintTrackingWorker.this.f4393W.mo5909a(this.f4398c);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4395c = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo5945a() {
        return C1068h.m5674a().mo5779g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5946b() {
        this.f4393W.mo5910a(Result.m5467a());
    }

    /* renamed from: b */
    public void mo5725b(List<String> list) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5947c() {
        this.f4393W.mo5910a(Result.m5469b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5948d() {
        String a = getInputData().mo5584a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(a)) {
            C1034h.m5550a().mo5698b(f4390Y, "No worker to delegate to.", new Throwable[0]);
            mo5946b();
            return;
        }
        this.f4394X = getWorkerFactory().mo5649b(getApplicationContext(), a, this.f4395c);
        if (this.f4394X == null) {
            C1034h.m5550a().mo5697a(f4390Y, "No worker to delegate to.", new Throwable[0]);
            mo5946b();
            return;
        }
        C1111j f = mo5945a().mo5705d().mo5881f(getId().toString());
        if (f == null) {
            mo5946b();
            return;
        }
        C1078d dVar = new C1078d(getApplicationContext(), this);
        dVar.mo5805c(Collections.singletonList(f));
        if (dVar.mo5803a(getId().toString())) {
            C1034h.m5550a().mo5697a(f4390Y, String.format("Constraints met for delegate %s", new Object[]{a}), new Throwable[0]);
            try {
                ListenableFuture startWork = this.f4394X.startWork();
                startWork.mo5913a(new C1163b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                C1034h.m5550a().mo5697a(f4390Y, String.format("Delegated worker %s threw exception in startWork.", new Object[]{a}), th);
                synchronized (this.f4391U) {
                    if (this.f4392V) {
                        C1034h.m5550a().mo5697a(f4390Y, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo5947c();
                    } else {
                        mo5946b();
                    }
                }
            }
        } else {
            C1034h.m5550a().mo5697a(f4390Y, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{a}), new Throwable[0]);
            mo5947c();
        }
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4394X;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public ListenableFuture<Result> startWork() {
        getBackgroundExecutor().execute(new C1162a());
        return this.f4393W;
    }

    /* renamed from: a */
    public void mo5724a(List<String> list) {
        C1034h.m5550a().mo5697a(f4390Y, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f4391U) {
            this.f4392V = true;
        }
    }
}
