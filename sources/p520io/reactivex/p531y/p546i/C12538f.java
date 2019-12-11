package p520io.reactivex.p531y.p546i;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.i.f */
/* compiled from: SubscriptionArbiter */
public class C12538f extends AtomicInteger implements C14314c {

    /* renamed from: U */
    long f29061U;

    /* renamed from: V */
    final AtomicReference<C14314c> f29062V = new AtomicReference<>();

    /* renamed from: W */
    final AtomicLong f29063W = new AtomicLong();

    /* renamed from: X */
    final AtomicLong f29064X = new AtomicLong();

    /* renamed from: Y */
    final boolean f29065Y;

    /* renamed from: Z */
    volatile boolean f29066Z;

    /* renamed from: a0 */
    protected boolean f29067a0;

    /* renamed from: c */
    C14314c f29068c;

    public C12538f(boolean z) {
        this.f29065Y = z;
    }

    /* renamed from: a */
    public final void mo30657a(long j) {
        if (!this.f29067a0) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12544d.m39341a(this.f29064X, j);
                mo30656a();
                return;
            }
            long j2 = this.f29061U;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    C12539g.m39324a(j3);
                } else {
                    j4 = j3;
                }
                this.f29061U = j4;
            }
            if (decrementAndGet() != 0) {
                mo30658b();
            }
        }
    }

    /* renamed from: b */
    public final void mo30659b(C14314c cVar) {
        if (this.f29066Z) {
            cVar.cancel();
            return;
        }
        C12036b.m38663a(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C14314c cVar2 = (C14314c) this.f29062V.getAndSet(cVar);
            if (cVar2 != null && this.f29065Y) {
                cVar2.cancel();
            }
            mo30656a();
            return;
        }
        C14314c cVar3 = this.f29068c;
        if (cVar3 != null && this.f29065Y) {
            cVar3.cancel();
        }
        this.f29068c = cVar;
        long j = this.f29061U;
        if (decrementAndGet() != 0) {
            mo30658b();
        }
        if (j != 0) {
            cVar.mo29946b(j);
        }
    }

    /* renamed from: c */
    public final boolean mo30660c() {
        return this.f29066Z;
    }

    public void cancel() {
        if (!this.f29066Z) {
            this.f29066Z = true;
            mo30656a();
        }
    }

    /* renamed from: d */
    public final boolean mo30661d() {
        return this.f29067a0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30656a() {
        if (getAndIncrement() == 0) {
            mo30658b();
        }
    }

    /* renamed from: b */
    public final void mo29946b(long j) {
        if (C12539g.m39330c(j) && !this.f29067a0) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12544d.m39341a(this.f29063W, j);
                mo30656a();
                return;
            }
            long j2 = this.f29061U;
            if (j2 != Long.MAX_VALUE) {
                long a = C12544d.m39340a(j2, j);
                this.f29061U = a;
                if (a == Long.MAX_VALUE) {
                    this.f29067a0 = true;
                }
            }
            C14314c cVar = this.f29068c;
            if (decrementAndGet() != 0) {
                mo30658b();
            }
            if (cVar != null) {
                cVar.mo29946b(j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30658b() {
        C14314c cVar = null;
        long j = 0;
        int i = 1;
        do {
            C14314c cVar2 = (C14314c) this.f29062V.get();
            if (cVar2 != null) {
                cVar2 = (C14314c) this.f29062V.getAndSet(null);
            }
            long j2 = this.f29063W.get();
            if (j2 != 0) {
                j2 = this.f29063W.getAndSet(0);
            }
            long j3 = this.f29064X.get();
            if (j3 != 0) {
                j3 = this.f29064X.getAndSet(0);
            }
            C14314c cVar3 = this.f29068c;
            if (this.f29066Z) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f29068c = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j4 = this.f29061U;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C12544d.m39340a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            C12539g.m39324a(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.f29061U = j4;
                }
                if (cVar2 != null) {
                    if (cVar3 != null && this.f29065Y) {
                        cVar3.cancel();
                    }
                    this.f29068c = cVar2;
                    if (j4 != 0) {
                        j = C12544d.m39340a(j, j4);
                        cVar = cVar2;
                    }
                } else if (!(cVar3 == null || j2 == 0)) {
                    j = C12544d.m39340a(j, j2);
                    cVar = cVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            cVar.mo29946b(j);
        }
    }
}
