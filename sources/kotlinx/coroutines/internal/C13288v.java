package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C12880j;
import kotlinx.coroutines.C13292j0;
import kotlinx.coroutines.internal.C13289w;

/* renamed from: kotlinx.coroutines.internal.v */
/* compiled from: ThreadSafeHeap.kt */
public class C13288v<T extends C13289w & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f29724a;

    /* renamed from: d */
    private final void m40845d(int i) {
        while (i > 0) {
            T[] tArr = this.f29724a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C12880j.m40220a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m40842a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private final T[] m40846f() {
        T[] tArr = this.f29724a;
        if (tArr == null) {
            T[] tArr2 = new C13289w[4];
            this.f29724a = tArr2;
            return tArr2;
        } else if (mo34456b() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo34456b() * 2);
            C12880j.m40222a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C13289w[]) copyOf;
            this.f29724a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: a */
    public final T mo34453a() {
        T[] tArr = this.f29724a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: b */
    public final int mo34456b() {
        return this._size;
    }

    /* renamed from: c */
    public final boolean mo34458c() {
        return mo34456b() == 0;
    }

    /* renamed from: e */
    public final T mo34460e() {
        T a;
        synchronized (this) {
            a = mo34456b() > 0 ? mo34454a(0) : null;
        }
        return a;
    }

    /* renamed from: b */
    private final void m40843b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m40844c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo34456b()) {
                T[] tArr = this.f29724a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo34456b()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C12880j.m40220a();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C12880j.m40220a();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C12880j.m40220a();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m40842a(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C12880j.m40220a();
                        throw null;
                    }
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo34454a(int i) {
        boolean z = false;
        if (C13292j0.m40863a()) {
            if (!(mo34456b() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f29724a;
        if (tArr != null) {
            m40843b(mo34456b() - 1);
            if (i < mo34456b()) {
                m40842a(i, mo34456b());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C12880j.m40220a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m40842a(i, i2);
                            m40845d(i2);
                        }
                    } else {
                        C12880j.m40220a();
                        throw null;
                    }
                }
                m40844c(i);
            }
            T t3 = tArr[mo34456b()];
            if (t3 != null) {
                if (C13292j0.m40863a()) {
                    if (t3.mo34461a() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.mo34463a(null);
                t3.mo34462a(-1);
                tArr[mo34456b()] = null;
                return t3;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    /* renamed from: b */
    public final boolean mo34457b(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo34461a() == null) {
                z = false;
            } else {
                int index = t.getIndex();
                if (C13292j0.m40863a()) {
                    if (index >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo34454a(index);
            }
        }
        return z;
    }

    /* renamed from: d */
    public final T mo34459d() {
        T a;
        synchronized (this) {
            a = mo34453a();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo34455a(T t) {
        if (C13292j0.m40863a()) {
            if (!(t.mo34461a() == null)) {
                throw new AssertionError();
            }
        }
        t.mo34463a(this);
        C13289w[] f = m40846f();
        int b = mo34456b();
        m40843b(b + 1);
        f[b] = t;
        t.mo34462a(b);
        m40845d(b);
    }

    /* renamed from: a */
    private final void m40842a(int i, int i2) {
        T[] tArr = this.f29724a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo34462a(i);
                    t2.mo34462a(i2);
                    return;
                }
                C12880j.m40220a();
                throw null;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }
}
