package p163g.p426g.p432d.p433a;

import java.util.concurrent.ScheduledFuture;
import p163g.p426g.p427a.p429j.C10828b;

/* renamed from: g.g.d.a.g */
/* compiled from: AndroidSystemTimer */
public class C10846g implements C10828b {

    /* renamed from: a */
    private ScheduledFuture<?> f25634a = null;

    public C10846g(ScheduledFuture<?> scheduledFuture) {
        this.f25634a = scheduledFuture;
    }

    public boolean cancel() {
        this.f25634a.cancel(true);
        return true;
    }
}
