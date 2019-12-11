package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker.Result;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class Worker extends ListenableWorker {
    SettableFuture<Result> mFuture;

    /* renamed from: androidx.work.Worker$a */
    class C1021a implements Runnable {
        C1021a() {
        }

        public void run() {
            try {
                Worker.this.mFuture.mo5910a(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo5911a(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract Result doWork();

    public final ListenableFuture<Result> startWork() {
        this.mFuture = SettableFuture.m5920d();
        getBackgroundExecutor().execute(new C1021a());
        return this.mFuture;
    }
}
