package p520io.reactivex.p531y.p543f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p547j.C12556l;

/* renamed from: io.reactivex.y.f.b */
/* compiled from: SpscArrayQueue */
public final class C12490b<E> extends AtomicReferenceArray<E> implements C12050m<E> {

    /* renamed from: Y */
    private static final Integer f28917Y = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: U */
    final AtomicLong f28918U = new AtomicLong();

    /* renamed from: V */
    long f28919V;

    /* renamed from: W */
    final AtomicLong f28920W = new AtomicLong();

    /* renamed from: X */
    final int f28921X;

    /* renamed from: c */
    final int f28922c = (length() - 1);

    public C12490b(int i) {
        super(C12556l.m39375a(i));
        this.f28921X = Math.min(i / 4, f28917Y.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo30594a(long j) {
        return this.f28922c & ((int) j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo30595a(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30598b(long j) {
        this.f28920W.lazySet(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30599c(long j) {
        this.f28918U.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f28918U.get() == this.f28920W.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f28922c;
            long j = this.f28918U.get();
            int a = mo30595a(j, i);
            if (j >= this.f28919V) {
                long j2 = ((long) this.f28921X) + j;
                if (mo30596a(mo30595a(j2, i)) == null) {
                    this.f28919V = j2;
                } else if (mo30596a(a) != null) {
                    return false;
                }
            }
            mo30597a(a, e);
            mo30599c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f28920W.get();
        int a = mo30594a(j);
        E a2 = mo30596a(a);
        if (a2 == null) {
            return null;
        }
        mo30598b(j + 1);
        mo30597a(a, (E) null);
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30597a(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo30596a(int i) {
        return get(i);
    }
}
