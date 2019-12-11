package kotlin.p590y;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.c */
/* compiled from: AbstractIterator.kt */
public abstract class C13153c<T> implements Iterator<T>, C12872a {

    /* renamed from: U */
    private T f29595U;

    /* renamed from: c */
    private C13195s0 f29596c = C13195s0.NotReady;

    /* renamed from: d */
    private final boolean m40255d() {
        this.f29596c = C13195s0.Failed;
        mo34201b();
        return this.f29596c == C13195s0.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34201b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34202b(T t) {
        this.f29595U = t;
        this.f29596c = C13195s0.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo34203c() {
        this.f29596c = C13195s0.Done;
    }

    public boolean hasNext() {
        if (this.f29596c != C13195s0.Failed) {
            int i = C13151b.$EnumSwitchMapping$0[this.f29596c.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m40255d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f29596c = C13195s0.NotReady;
            return this.f29595U;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
