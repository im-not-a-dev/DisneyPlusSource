package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p573a0.C12683c;

/* renamed from: kotlinx.coroutines.k */
/* compiled from: CompletedExceptionally.kt */
public final class C13322k extends C13389r {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f29760c = AtomicIntegerFieldUpdater.newUpdater(C13322k.class, "_resumed");
    private volatile int _resumed;

    public C13322k(C12683c<?> cVar, Throwable th, boolean z) {
        if (th == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(cVar);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th, z);
        this._resumed = 0;
    }

    /* renamed from: c */
    public final boolean mo34503c() {
        return f29760c.compareAndSet(this, 0, 1);
    }
}
