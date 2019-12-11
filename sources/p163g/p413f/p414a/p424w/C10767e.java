package p163g.p413f.p414a.p424w;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g.f.a.w.e */
/* compiled from: Executors */
public final class C10767e {

    /* renamed from: a */
    private static final Executor f25477a = new C10768a();

    /* renamed from: b */
    private static final Executor f25478b = new C10769b();

    /* renamed from: g.f.a.w.e$a */
    /* compiled from: Executors */
    class C10768a implements Executor {

        /* renamed from: c */
        private final Handler f25479c = new Handler(Looper.getMainLooper());

        C10768a() {
        }

        public void execute(Runnable runnable) {
            this.f25479c.post(runnable);
        }
    }

    /* renamed from: g.f.a.w.e$b */
    /* compiled from: Executors */
    class C10769b implements Executor {
        C10769b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m33996a() {
        return f25478b;
    }

    /* renamed from: b */
    public static Executor m33997b() {
        return f25477a;
    }
}
