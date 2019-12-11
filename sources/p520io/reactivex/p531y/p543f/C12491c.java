package p520io.reactivex.p531y.p543f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p547j.C12556l;

/* renamed from: io.reactivex.y.f.c */
/* compiled from: SpscLinkedArrayQueue */
public final class C12491c<T> implements C12050m<T> {

    /* renamed from: b0 */
    static final int f28923b0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: c0 */
    private static final Object f28924c0 = new Object();

    /* renamed from: U */
    int f28925U;

    /* renamed from: V */
    long f28926V;

    /* renamed from: W */
    final int f28927W;

    /* renamed from: X */
    AtomicReferenceArray<Object> f28928X;

    /* renamed from: Y */
    final int f28929Y;

    /* renamed from: Z */
    AtomicReferenceArray<Object> f28930Z;

    /* renamed from: a0 */
    final AtomicLong f28931a0 = new AtomicLong();

    /* renamed from: c */
    final AtomicLong f28932c = new AtomicLong();

    public C12491c(int i) {
        int a = C12556l.m39375a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f28928X = atomicReferenceArray;
        this.f28927W = i2;
        m39224a(a);
        this.f28930Z = atomicReferenceArray;
        this.f28929Y = i2;
        this.f28926V = (long) (i2 - 1);
        m39233b(0);
    }

    /* renamed from: a */
    private boolean m39229a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m39226a(atomicReferenceArray, i, (Object) t);
        m39233b(j + 1);
        return true;
    }

    /* renamed from: b */
    private static int m39230b(int i) {
        return i;
    }

    /* renamed from: b */
    private AtomicReferenceArray<Object> m39232b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m39230b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m39222a(atomicReferenceArray, i);
        m39226a(atomicReferenceArray, i, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: c */
    private long m39234c() {
        return this.f28931a0.get();
    }

    /* renamed from: d */
    private long m39235d() {
        return this.f28932c.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m39235d() == m39234c();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f28928X;
            long b = m39231b();
            int i = this.f28927W;
            int a = m39220a(b, i);
            if (b < this.f28926V) {
                return m39229a(atomicReferenceArray, t, b, a);
            }
            long j = ((long) this.f28925U) + b;
            if (m39222a(atomicReferenceArray, m39220a(j, i)) == null) {
                this.f28926V = j - 1;
                return m39229a(atomicReferenceArray, t, b, a);
            } else if (m39222a(atomicReferenceArray, m39220a(1 + b, i)) == null) {
                return m39229a(atomicReferenceArray, t, b, a);
            } else {
                m39227a(atomicReferenceArray, b, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f28930Z;
        long a = m39221a();
        int i = this.f28929Y;
        int a2 = m39220a(a, i);
        T a3 = m39222a(atomicReferenceArray, a2);
        boolean z = a3 == f28924c0;
        if (a3 != null && !z) {
            m39226a(atomicReferenceArray, a2, (Object) null);
            m39225a(a + 1);
            return a3;
        } else if (z) {
            return m39223a(m39232b(atomicReferenceArray, i + 1), a, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private void m39227a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f28928X = atomicReferenceArray2;
        this.f28926V = (j2 + j) - 1;
        m39226a(atomicReferenceArray2, i, (Object) t);
        m39228a(atomicReferenceArray, atomicReferenceArray2);
        m39226a(atomicReferenceArray, i, f28924c0);
        m39233b(j + 1);
    }

    /* renamed from: b */
    private long m39231b() {
        return this.f28932c.get();
    }

    /* renamed from: b */
    private void m39233b(long j) {
        this.f28932c.lazySet(j);
    }

    /* renamed from: a */
    private void m39228a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m39230b(length);
        m39226a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private T m39223a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f28930Z = atomicReferenceArray;
        int a = m39220a(j, i);
        T a2 = m39222a(atomicReferenceArray, a);
        if (a2 != null) {
            m39226a(atomicReferenceArray, a, (Object) null);
            m39225a(j + 1);
        }
        return a2;
    }

    /* renamed from: a */
    private void m39224a(int i) {
        this.f28925U = Math.min(i / 4, f28923b0);
    }

    /* renamed from: a */
    private long m39221a() {
        return this.f28931a0.get();
    }

    /* renamed from: a */
    private void m39225a(long j) {
        this.f28931a0.lazySet(j);
    }

    /* renamed from: a */
    private static int m39220a(long j, int i) {
        int i2 = ((int) j) & i;
        m39230b(i2);
        return i2;
    }

    /* renamed from: a */
    private static void m39226a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m39222a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }
}
