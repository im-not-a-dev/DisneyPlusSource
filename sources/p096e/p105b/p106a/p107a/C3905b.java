package p096e.p105b.p106a.p107a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.b.a.a.b */
/* compiled from: DefaultTaskExecutor */
public class C3905b extends C3907c {

    /* renamed from: a */
    private final Object f9684a = new Object();

    /* renamed from: b */
    private final ExecutorService f9685b = Executors.newFixedThreadPool(4, new C3906a(this));

    /* renamed from: c */
    private volatile Handler f9686c;

    /* renamed from: e.b.a.a.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C3906a implements ThreadFactory {

        /* renamed from: c */
        private final AtomicInteger f9687c = new AtomicInteger(0);

        C3906a(C3905b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f9687c.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public void mo13971a(Runnable runnable) {
        this.f9685b.execute(runnable);
    }

    /* renamed from: b */
    public void mo13973b(Runnable runnable) {
        if (this.f9686c == null) {
            synchronized (this.f9684a) {
                if (this.f9686c == null) {
                    this.f9686c = m13116a(Looper.getMainLooper());
                }
            }
        }
        this.f9686c.post(runnable);
    }

    /* renamed from: a */
    public boolean mo13972a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    private static Handler m13116a(Looper looper) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
