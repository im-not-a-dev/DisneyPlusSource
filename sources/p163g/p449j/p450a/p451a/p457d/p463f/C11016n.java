package p163g.p449j.p450a.p451a.p457d.p463f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.j.a.a.d.f.n */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C11016n extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f26036a;

    public C11016n(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f26036a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C11016n.class) {
            if (this == obj) {
                return true;
            }
            C11016n nVar = (C11016n) obj;
            return this.f26036a == nVar.f26036a && get() == nVar.get();
        }
    }

    public final int hashCode() {
        return this.f26036a;
    }
}
