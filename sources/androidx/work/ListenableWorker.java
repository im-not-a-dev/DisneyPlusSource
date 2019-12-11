package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class Result {

        /* renamed from: androidx.work.ListenableWorker$Result$a */
        public static final class C1012a extends Result {

            /* renamed from: a */
            private final Data f4001a;

            public C1012a() {
                this(Data.f3998c);
            }

            /* renamed from: d */
            public Data mo5605d() {
                return this.f4001a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1012a.class != obj.getClass()) {
                    return false;
                }
                return this.f4001a.equals(((C1012a) obj).f4001a);
            }

            public int hashCode() {
                return (C1012a.class.getName().hashCode() * 31) + this.f4001a.hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Failure {mOutputData=");
                sb.append(this.f4001a);
                sb.append('}');
                return sb.toString();
            }

            public C1012a(Data data) {
                this.f4001a = data;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$Result$b */
        public static final class C1013b extends Result {
            public boolean equals(Object obj) {
                boolean z = true;
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1013b.class != obj.getClass()) {
                    z = false;
                }
                return z;
            }

            public int hashCode() {
                return C1013b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$Result$c */
        public static final class C1014c extends Result {

            /* renamed from: a */
            private final Data f4002a;

            public C1014c() {
                this(Data.f3998c);
            }

            /* renamed from: d */
            public Data mo5612d() {
                return this.f4002a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1014c.class != obj.getClass()) {
                    return false;
                }
                return this.f4002a.equals(((C1014c) obj).f4002a);
            }

            public int hashCode() {
                return (C1014c.class.getName().hashCode() * 31) + this.f4002a.hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Success {mOutputData=");
                sb.append(this.f4002a);
                sb.append('}');
                return sb.toString();
            }

            public C1014c(Data data) {
                this.f4002a = data;
            }
        }

        Result() {
        }

        /* renamed from: a */
        public static Result m5468a(Data data) {
            return new C1014c(data);
        }

        /* renamed from: b */
        public static Result m5469b() {
            return new C1013b();
        }

        /* renamed from: c */
        public static Result m5470c() {
            return new C1014c();
        }

        /* renamed from: a */
        public static Result m5467a() {
            return new C1012a();
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.mo5650a();
    }

    public final UUID getId() {
        return this.mWorkerParams.mo5651b();
    }

    public final Data getInputData() {
        return this.mWorkerParams.mo5652c();
    }

    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.mo5653d();
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.mo5654e();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture<Result> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
