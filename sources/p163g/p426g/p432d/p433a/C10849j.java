package p163g.p426g.p432d.p433a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p163g.p426g.p427a.p429j.C10828b;
import p163g.p426g.p427a.p429j.C10835i;

/* renamed from: g.g.d.a.j */
/* compiled from: AndroidTimerInterface */
public class C10849j implements C10835i {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f25637a;

    public C10849j() {
        this.f25637a = null;
        this.f25637a = new ScheduledThreadPoolExecutor(2);
    }

    /* renamed from: a */
    public C10828b mo27911a(Runnable runnable, int i, String str) {
        long j = (long) i;
        return new C10846g(this.f25637a.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS));
    }
}
