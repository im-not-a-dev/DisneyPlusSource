package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.p688d0.p690h.C14150g;

/* renamed from: okhttp3.l */
/* compiled from: ConnectionPool */
public final class C14241l {

    /* renamed from: a */
    final C14150g f31775a;

    public C14241l() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C14241l(int i, long j, TimeUnit timeUnit) {
        this.f31775a = new C14150g(i, j, timeUnit);
    }
}
