package p520io.reactivex.p527w.p529c;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: io.reactivex.w.c.b */
/* compiled from: HandlerScheduler */
final class C11995b extends C11969r {

    /* renamed from: b */
    private final Handler f27722b;

    /* renamed from: c */
    private final boolean f27723c;

    /* renamed from: io.reactivex.w.c.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C11996a extends C11972c {

        /* renamed from: U */
        private final boolean f27724U;

        /* renamed from: V */
        private volatile boolean f27725V;

        /* renamed from: c */
        private final Handler f27726c;

        C11996a(Handler handler, boolean z) {
            this.f27726c = handler;
            this.f27724U = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f27725V) {
                return C11929b.m38490a();
            } else {
                C11997b bVar = new C11997b(this.f27726c, C11915a.m38459a(runnable));
                Message obtain = Message.obtain(this.f27726c, bVar);
                obtain.obj = this;
                if (this.f27724U) {
                    obtain.setAsynchronous(true);
                }
                this.f27726c.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f27725V) {
                    return bVar;
                }
                this.f27726c.removeCallbacks(bVar);
                return C11929b.m38490a();
            }
        }

        public void dispose() {
            this.f27725V = true;
            this.f27726c.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f27725V;
        }
    }

    /* renamed from: io.reactivex.w.c.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C11997b implements Runnable, Disposable {

        /* renamed from: U */
        private final Runnable f27727U;

        /* renamed from: V */
        private volatile boolean f27728V;

        /* renamed from: c */
        private final Handler f27729c;

        C11997b(Handler handler, Runnable runnable) {
            this.f27729c = handler;
            this.f27727U = runnable;
        }

        public void dispose() {
            this.f27729c.removeCallbacks(this);
            this.f27728V = true;
        }

        public boolean isDisposed() {
            return this.f27728V;
        }

        public void run() {
            try {
                this.f27727U.run();
            } catch (Throwable th) {
                C11915a.m38466b(th);
            }
        }
    }

    C11995b(Handler handler, boolean z) {
        this.f27722b = handler;
        this.f27723c = z;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C11997b bVar = new C11997b(this.f27722b, C11915a.m38459a(runnable));
            Message obtain = Message.obtain(this.f27722b, bVar);
            if (this.f27723c) {
                obtain.setAsynchronous(true);
            }
            this.f27722b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C11996a(this.f27722b, this.f27723c);
    }
}
