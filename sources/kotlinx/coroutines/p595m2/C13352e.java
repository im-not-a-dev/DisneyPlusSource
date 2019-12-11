package kotlinx.coroutines.p595m2;

import kotlinx.coroutines.internal.C13270j;
import kotlinx.coroutines.internal.C13271k;
import kotlinx.coroutines.internal.C13271k.C13272a;
import kotlinx.coroutines.internal.C13271k.C13273b;

/* renamed from: kotlinx.coroutines.m2.e */
/* compiled from: Tasks.kt */
public class C13352e extends C13270j<C13356i> {
    public C13352e() {
        super(false);
    }

    /* renamed from: a */
    public final C13356i mo34545a(C13359l lVar) {
        Object obj;
        Object obj2;
        while (true) {
            C13271k kVar = (C13271k) this._cur$internal;
            while (true) {
                long j = kVar._state$internal;
                obj = null;
                if ((1152921504606846976L & j) == 0) {
                    C13272a aVar = C13271k.f29703h;
                    boolean z = false;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((kVar.f29704a & ((int) ((1152921503533105152L & j) >> 30))) != (kVar.f29704a & i)) {
                        obj2 = kVar.f29705b.get(kVar.f29704a & i);
                        if (obj2 != null) {
                            if (obj2 instanceof C13273b) {
                                break;
                            }
                            if (((C13356i) obj2).mo34550a() == lVar) {
                                z = true;
                            }
                            if (z) {
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
                    obj = C13271k.f29702g;
                    break;
                }
            }
            obj = obj2;
            if (obj != C13271k.f29702g) {
                return (C13356i) obj;
            }
            C13270j.f29699a.compareAndSet(this, kVar, kVar.mo34439d());
        }
    }
}
