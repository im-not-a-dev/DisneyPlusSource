package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C13292j0;

/* renamed from: kotlinx.coroutines.internal.c */
/* compiled from: Atomic.kt */
public abstract class C13255c<T> extends C13274l {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f29681a = AtomicReferenceFieldUpdater.newUpdater(C13255c.class, Object.class, "_consensus");
    private volatile Object _consensus = C13254b.f29680a;

    /* renamed from: d */
    private final Object m40741d(Object obj) {
        return mo34409c(obj) ? obj : this._consensus;
    }

    /* renamed from: a */
    public final Object mo34406a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C13254b.f29680a) {
            obj2 = m40741d(mo34408b(obj));
        }
        mo34407a(obj, obj2);
        return obj2;
    }

    /* renamed from: a */
    public abstract void mo34407a(T t, Object obj);

    /* renamed from: b */
    public abstract Object mo34408b(T t);

    /* renamed from: c */
    public final boolean mo34409c(Object obj) {
        if (C13292j0.m40863a()) {
            if (!(obj != C13254b.f29680a)) {
                throw new AssertionError();
            }
        }
        return f29681a.compareAndSet(this, C13254b.f29680a, obj);
    }
}
