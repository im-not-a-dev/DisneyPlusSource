package p161f.p162a;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f.a.y */
public class C4627y implements ThreadFactory {

    /* renamed from: U */
    private final String f11547U;

    /* renamed from: V */
    private UncaughtExceptionHandler f11548V;

    /* renamed from: c */
    private final AtomicInteger f11549c;

    public C4627y() {
        this.f11549c = new AtomicInteger(1);
        this.f11547U = C4627y.class.getSimpleName();
    }

    /* renamed from: a */
    public void mo15914a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11548V = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable) {
        if (this.f11548V != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11547U);
            sb.append(" #");
            sb.append(this.f11549c.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setUncaughtExceptionHandler(this.f11548V);
            return thread;
        }
        throw new IllegalStateException("No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread");
    }

    public C4627y(String str) {
        this.f11549c = new AtomicInteger(1);
        this.f11547U = str;
    }
}
