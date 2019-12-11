package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.C12900n.C12902b;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13237f0;
import kotlinx.coroutines.C13324k1;
import kotlinx.coroutines.C13370o1;
import kotlinx.coroutines.C13390r0;
import kotlinx.coroutines.C13418z;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0014\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo31007d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "job", "Lkotlinx/coroutines/Job;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/Job;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStopped", "", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime-ktx_release"}, mo31008k = 1, mo31009mv = {1, 1, 13})
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: a */
    private final C13324k1 f3990a = C13370o1.m41090a((C13324k1) null, 1, (Object) null);

    /* renamed from: b */
    private final SettableFuture<Result> f3991b;

    /* renamed from: c */
    private final C13418z f3992c;

    /* renamed from: androidx.work.CoroutineWorker$a */
    /* compiled from: CoroutineWorker.kt */
    static final class C1009a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ CoroutineWorker f3993c;

        C1009a(CoroutineWorker coroutineWorker) {
            this.f3993c = coroutineWorker;
        }

        public final void run() {
            if (this.f3993c.mo5575b().isCancelled()) {
                this.f3993c.mo5576c().cancel();
            }
        }
    }

    @C12706f(mo31052c = "androidx/work/CoroutineWorker$startWork$1", mo31053f = "CoroutineWorker.kt", mo31054l = {64, 67}, mo31055m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    /* compiled from: CoroutineWorker.kt */
    static final class C1010b extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f3994X;

        /* renamed from: Y */
        int f3995Y;

        /* renamed from: Z */
        final /* synthetic */ CoroutineWorker f3996Z;

        C1010b(CoroutineWorker coroutineWorker, C12683c cVar) {
            this.f3996Z = coroutineWorker;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f3995Y;
            if (i != 0) {
                if (i == 1) {
                    try {
                        if (obj instanceof C12902b) {
                            throw ((C12902b) obj).f29541c;
                        }
                    } catch (Throwable th) {
                        this.f3996Z.mo5575b().mo5911a(th);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else if (!(obj instanceof C12902b)) {
                CoroutineWorker coroutineWorker = this.f3996Z;
                this.f3995Y = 1;
                obj = coroutineWorker.mo5573a(this);
                if (obj == a) {
                    return a;
                }
            } else {
                throw ((C12902b) obj).f29541c;
            }
            this.f3996Z.mo5575b().mo5910a((Result) obj);
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C1010b bVar = new C1010b(this.f3996Z, cVar);
            bVar.f3994X = (C13233e0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1010b) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        SettableFuture<Result> d = SettableFuture.m5920d();
        C12880j.m40222a((Object) d, "SettableFuture.create()");
        this.f3991b = d;
        SettableFuture<Result> settableFuture = this.f3991b;
        C1009a aVar = new C1009a(this);
        TaskExecutor taskExecutor = getTaskExecutor();
        C12880j.m40222a((Object) taskExecutor, "taskExecutor");
        settableFuture.mo5913a((Runnable) aVar, taskExecutor.mo5941c());
        this.f3992c = C13390r0.m41147a();
    }

    /* renamed from: a */
    public abstract Object mo5573a(C12683c<? super Result> cVar);

    /* renamed from: a */
    public C13418z mo5574a() {
        return this.f3992c;
    }

    /* renamed from: b */
    public final SettableFuture<Result> mo5575b() {
        return this.f3991b;
    }

    /* renamed from: c */
    public final C13324k1 mo5576c() {
        return this.f3990a;
    }

    public final void onStopped() {
        super.onStopped();
        this.f3991b.cancel(false);
    }

    public final ListenableFuture<Result> startWork() {
        C13232e.m40677a(C13237f0.m40689a(mo5574a().plus(this.f3990a)), null, null, new C1010b(this, null), 3, null);
        return this.f3991b;
    }
}
