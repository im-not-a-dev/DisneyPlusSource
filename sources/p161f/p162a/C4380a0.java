package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: f.a.a0 */
public class C4380a0 implements UncaughtExceptionHandler {

    /* renamed from: b */
    private static final String f10907b = C1557c.m7461a(C4380a0.class);

    /* renamed from: a */
    private C4419d f10908a;

    public C4380a0() {
    }

    /* renamed from: a */
    public void mo15394a(C4419d dVar) {
        this.f10908a = dVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.f10908a != null) {
                C1557c.m7474e(f10907b, "Uncaught exception from thread. Publishing as Throwable event.", th);
                this.f10908a.mo15485a(th, Throwable.class);
            }
        } catch (Exception e) {
            C1557c.m7474e(f10907b, "Failed to log throwable.", e);
        }
    }

    public C4380a0(C4419d dVar) {
        this.f10908a = dVar;
    }
}
