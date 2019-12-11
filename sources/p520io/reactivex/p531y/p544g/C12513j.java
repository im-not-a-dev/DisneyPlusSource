package p520io.reactivex.p531y.p544g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.y.g.j */
/* compiled from: RxThreadFactory */
public final class C12513j extends AtomicLong implements ThreadFactory {

    /* renamed from: U */
    final int f29001U;

    /* renamed from: V */
    final boolean f29002V;

    /* renamed from: c */
    final String f29003c;

    /* renamed from: io.reactivex.y.g.j$a */
    /* compiled from: RxThreadFactory */
    static final class C12514a extends Thread implements C12512i {
        C12514a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C12513j(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f29003c);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.f29002V ? new C12514a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.f29001U);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.f29003c);
        sb.append("]");
        return sb.toString();
    }

    public C12513j(String str, int i) {
        this(str, i, false);
    }

    public C12513j(String str, int i, boolean z) {
        this.f29003c = str;
        this.f29001U = i;
        this.f29002V = z;
    }
}
