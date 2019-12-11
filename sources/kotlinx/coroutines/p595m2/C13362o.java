package kotlinx.coroutines.p595m2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.m2.o */
/* compiled from: WorkQueue.kt */
public final class C13362o {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f29846b;

    /* renamed from: c */
    static final AtomicIntegerFieldUpdater f29847c;

    /* renamed from: d */
    static final AtomicIntegerFieldUpdater f29848d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AtomicReferenceArray<C13356i> f29849a = new AtomicReferenceArray<>(128);
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    static {
        Class<C13362o> cls = C13362o.class;
        f29846b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f29847c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f29848d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    /* renamed from: b */
    public final C13356i mo34557b() {
        C13356i iVar = (C13356i) f29846b.getAndSet(this, null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C13356i) this.f29849a.get(i2)) != null && f29848d.compareAndSet(this, i, i + 1)) {
                return (C13356i) this.f29849a.getAndSet(i2, null);
            }
        }
    }

    /* renamed from: c */
    public final int mo34559c() {
        return this.lastScheduledTask != null ? mo34553a() + 1 : mo34553a();
    }

    /* renamed from: a */
    public final int mo34553a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: a */
    public final boolean mo34555a(C13356i iVar, C13352e eVar) {
        C13356i iVar2 = (C13356i) f29846b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return mo34558b(iVar2, eVar);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo34556a(C13362o oVar, C13352e eVar) {
        C13356i iVar;
        C13362o oVar2 = oVar;
        C13352e eVar2 = eVar;
        long a = C13360m.f29845f.mo34549a();
        int a2 = oVar.mo34553a();
        if (a2 == 0) {
            return m41062a(a, oVar2, eVar2);
        }
        int a3 = C12762h.m39913a(a2 / 2, 1);
        int i = 0;
        boolean z = false;
        while (i < a3) {
            while (true) {
                int i2 = oVar2.consumerIndex;
                iVar = null;
                if (i2 - oVar2.producerIndex != 0) {
                    int i3 = i2 & 127;
                    C13356i iVar2 = (C13356i) oVar.f29849a.get(i3);
                    if (iVar2 != null) {
                        if (!(a - iVar2.f29835c >= C13360m.f29840a || oVar.mo34553a() > C13360m.f29841b)) {
                            break;
                        } else if (f29848d.compareAndSet(oVar2, i2, i2 + 1)) {
                            iVar = (C13356i) oVar.f29849a.getAndSet(i3, null);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if (iVar == null) {
                break;
            }
            mo34555a(iVar, eVar2);
            i++;
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo34558b(C13356i iVar, C13352e eVar) {
        boolean z = true;
        while (!m41063a(iVar)) {
            m41064b(eVar);
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private final void m41064b(C13352e eVar) {
        C13356i iVar;
        int a = C12762h.m39913a(mo34553a() / 2, 1);
        int i = 0;
        while (i < a) {
            while (true) {
                int i2 = this.consumerIndex;
                iVar = null;
                if (i2 - this.producerIndex != 0) {
                    int i3 = i2 & 127;
                    if (((C13356i) this.f29849a.get(i3)) != null && f29848d.compareAndSet(this, i2, i2 + 1)) {
                        iVar = (C13356i) this.f29849a.getAndSet(i3, null);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                m41061a(eVar, iVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m41062a(long j, C13362o oVar, C13352e eVar) {
        C13356i iVar = (C13356i) oVar.lastScheduledTask;
        if (iVar == null || j - iVar.f29835c < C13360m.f29840a || !f29846b.compareAndSet(oVar, iVar, null)) {
            return false;
        }
        mo34555a(iVar, eVar);
        return true;
    }

    /* renamed from: a */
    private final void m41061a(C13352e eVar, C13356i iVar) {
        if (!eVar.mo34432a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: a */
    public final void mo34554a(C13352e eVar) {
        C13356i iVar;
        C13356i iVar2 = (C13356i) f29846b.getAndSet(this, null);
        if (iVar2 != null) {
            m41061a(eVar, iVar2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                iVar = null;
            } else {
                int i2 = i & 127;
                if (((C13356i) this.f29849a.get(i2)) != null && f29848d.compareAndSet(this, i, i + 1)) {
                    iVar = (C13356i) this.f29849a.getAndSet(i2, null);
                }
            }
            if (iVar != null) {
                m41061a(eVar, iVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m41063a(C13356i iVar) {
        if (mo34553a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f29849a.get(i) != null) {
            return false;
        }
        this.f29849a.lazySet(i, iVar);
        f29847c.incrementAndGet(this);
        return true;
    }
}
