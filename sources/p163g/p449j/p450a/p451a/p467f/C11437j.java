package p163g.p449j.p450a.p451a.p467f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.j */
public final class C11437j {

    /* renamed from: a */
    public static final Executor f26774a = new C11438a();

    /* renamed from: b */
    static final Executor f26775b = new C11427b0();

    /* renamed from: g.j.a.a.f.j$a */
    private static final class C11438a implements Executor {

        /* renamed from: c */
        private final Handler f26776c = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f26776c.post(runnable);
        }
    }
}
