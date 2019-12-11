package okhttp3.p688d0.p690h;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy.Type;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C14232e;
import okhttp3.C14266z;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p695m.C14225e;

/* renamed from: okhttp3.d0.h.g */
/* compiled from: RealConnectionPool */
public final class C14150g {

    /* renamed from: g */
    private static final Executor f31448g;

    /* renamed from: a */
    private final int f31449a;

    /* renamed from: b */
    private final long f31450b;

    /* renamed from: c */
    private final Runnable f31451c = new C14142a(this);

    /* renamed from: d */
    private final Deque<C14149f> f31452d = new ArrayDeque();

    /* renamed from: e */
    final C14151h f31453e = new C14151h();

    /* renamed from: f */
    boolean f31454f;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14126e.m44827a("OkHttp ConnectionPool", true));
        f31448g = threadPoolExecutor;
    }

    public C14150g(int i, long j, TimeUnit timeUnit) {
        this.f31449a = i;
        this.f31450b = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo35971a() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.mo35970a(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14150g.mo35971a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35975b(C14149f fVar) {
        if (!this.f31454f) {
            this.f31454f = true;
            f31448g.execute(this.f31451c);
        }
        this.f31452d.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35974a(C14232e eVar, C14155k kVar, List<C14266z> list, boolean z) {
        for (C14149f fVar : this.f31452d) {
            if ((!z || fVar.mo35965d()) && fVar.mo35961a(eVar, list)) {
                kVar.mo35992a(fVar);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35973a(C14149f fVar) {
        if (fVar.f31441k || this.f31449a == 0) {
            this.f31452d.remove(fVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo35970a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C14149f fVar = null;
            int i = 0;
            int i2 = 0;
            for (C14149f fVar2 : this.f31452d) {
                if (m44958a(fVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - fVar2.f31447q;
                    if (j3 > j2) {
                        fVar = fVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f31450b) {
                if (i <= this.f31449a) {
                    if (i > 0) {
                        long j4 = this.f31450b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f31450b;
                        return j5;
                    } else {
                        this.f31454f = false;
                        return -1;
                    }
                }
            }
            this.f31452d.remove(fVar);
            C14126e.m44832a(fVar.mo35968g());
            return 0;
        }
    }

    /* renamed from: a */
    private int m44958a(C14149f fVar, long j) {
        List<Reference<C14155k>> list = fVar.f31446p;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C14157b bVar = (C14157b) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(fVar.mo35967f().mo36280a().mo36176k());
                sb.append(" was leaked. Did you forget to close a response body?");
                C14225e.m45335d().mo36134a(sb.toString(), bVar.f31484a);
                list.remove(i);
                fVar.f31441k = true;
                if (list.isEmpty()) {
                    fVar.f31447q = j - this.f31450b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo35972a(C14266z zVar, IOException iOException) {
        if (zVar.mo36281b().type() != Type.DIRECT) {
            C14232e a = zVar.mo36280a();
            a.mo36172h().connectFailed(a.mo36176k().mo35765p(), zVar.mo36281b().address(), iOException);
        }
        this.f31453e.mo35977b(zVar);
    }
}
