package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C13271k.C13272a;
import kotlinx.coroutines.internal.C13271k.C13273b;

/* renamed from: kotlinx.coroutines.internal.j */
/* compiled from: LockFreeTaskQueue.kt */
public class C13270j<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29699a = AtomicReferenceFieldUpdater.newUpdater(C13270j.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public C13270j(boolean z) {
        this._cur$internal = new C13271k(8, z);
    }

    /* renamed from: a */
    public final void mo34431a() {
        while (true) {
            C13271k kVar = (C13271k) this._cur$internal;
            if (!kVar.mo34436a()) {
                f29699a.compareAndSet(this, kVar, kVar.mo34439d());
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final int mo34433b() {
        return ((C13271k) this._cur$internal).mo34437b();
    }

    /* renamed from: c */
    public final E mo34434c() {
        E e;
        E e2;
        while (true) {
            C13271k kVar = (C13271k) this._cur$internal;
            while (true) {
                long j = kVar._state$internal;
                e = null;
                if ((1152921504606846976L & j) == 0) {
                    C13272a aVar = C13271k.f29703h;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((kVar.f29704a & ((int) ((1152921503533105152L & j) >> 30))) != (kVar.f29704a & i)) {
                        e2 = kVar.f29705b.get(kVar.f29704a & i);
                        if (e2 != null) {
                            if (!(e2 instanceof C13273b)) {
                                int i2 = (i + 1) & 1073741823;
                                if (!C13271k.f29701f.compareAndSet(kVar, j, C13271k.f29703h.mo34442a(j, i2))) {
                                    if (kVar.f29707d) {
                                        C13271k kVar2 = kVar;
                                        do {
                                            kVar2 = kVar2.m40784a(i, i2);
                                        } while (kVar2 != null);
                                        break;
                                    }
                                } else {
                                    kVar.f29705b.set(kVar.f29704a & i, null);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (kVar.f29707d) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    e = C13271k.f29702g;
                    break;
                }
            }
            e = e2;
            if (e != C13271k.f29702g) {
                return e;
            }
            f29699a.compareAndSet(this, kVar, kVar.mo34439d());
        }
    }

    /* renamed from: a */
    public final boolean mo34432a(E e) {
        while (true) {
            C13271k kVar = (C13271k) this._cur$internal;
            int a = kVar.mo34435a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f29699a.compareAndSet(this, kVar, kVar.mo34439d());
            } else if (a == 2) {
                return false;
            }
        }
    }
}
