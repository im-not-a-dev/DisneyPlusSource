package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13276n;

/* renamed from: kotlinx.coroutines.o0 */
/* compiled from: Builders.common.kt */
final class C13369o0<T> extends C13276n<T> {

    /* renamed from: X */
    private static final AtomicIntegerFieldUpdater f29857X = AtomicIntegerFieldUpdater.newUpdater(C13369o0.class, "_decision");
    private volatile int _decision = 0;

    public C13369o0(C12688f fVar, C12683c<? super T> cVar) {
        super(fVar, cVar);
    }

    /* renamed from: v */
    private final boolean m41084v() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f29857X.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: w */
    private final boolean m41085w() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f29857X.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34446a(Object obj, int i) {
        if (!m41084v()) {
            super.mo34446a(obj, i);
        }
    }

    /* renamed from: r */
    public int mo34337r() {
        return 1;
    }

    /* renamed from: u */
    public final Object mo34564u() {
        if (m41085w()) {
            return C12700d.m39820a();
        }
        Object b = C13397s1.m41221b(mo34596l());
        if (!(b instanceof C13389r)) {
            return b;
        }
        throw ((C13389r) b).f29880a;
    }
}
