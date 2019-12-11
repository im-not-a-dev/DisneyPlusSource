package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.impl.utils.C1157i;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p525e0.C11934b;

public abstract class RxWorker extends ListenableWorker {

    /* renamed from: b */
    static final Executor f4006b = new C1157i();

    /* renamed from: a */
    private C1020a<Result> f4007a;

    /* renamed from: androidx.work.RxWorker$a */
    static class C1020a<T> implements C11987u<T>, Runnable {

        /* renamed from: U */
        private Disposable f4008U;

        /* renamed from: c */
        final SettableFuture<T> f4009c = SettableFuture.m5920d();

        C1020a() {
            this.f4009c.mo5913a((Runnable) this, RxWorker.f4006b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5625a() {
            Disposable disposable = this.f4008U;
            if (disposable != null) {
                disposable.dispose();
            }
        }

        public void onError(Throwable th) {
            this.f4009c.mo5911a(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f4008U = disposable;
        }

        public void onSuccess(T t) {
            this.f4009c.mo5910a(t);
        }

        public void run() {
            if (this.f4009c.isCancelled()) {
                mo5625a();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public abstract Single<Result> mo5623a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11969r mo5624b() {
        return C11934b.m38499a(getBackgroundExecutor());
    }

    public void onStopped() {
        super.onStopped();
        C1020a<Result> aVar = this.f4007a;
        if (aVar != null) {
            aVar.mo5625a();
            this.f4007a = null;
        }
    }

    public ListenableFuture<Result> startWork() {
        this.f4007a = new C1020a<>();
        mo5623a().mo30220b(mo5624b()).mo30211a(C11934b.m38499a(getTaskExecutor().mo5941c())).mo30216a((C11987u<? super T>) this.f4007a);
        return this.f4007a.f4009c;
    }
}
