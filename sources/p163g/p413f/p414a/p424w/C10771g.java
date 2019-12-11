package p163g.p413f.p414a.p424w;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: g.f.a.w.g */
/* compiled from: LruCache */
public class C10771g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f25481a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f25482b;

    /* renamed from: c */
    private long f25483c;

    public C10771g(long j) {
        this.f25482b = j;
    }

    /* renamed from: a */
    public synchronized Y mo27803a(T t) {
        return this.f25481a.get(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21283a(T t, Y y) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo21284b(Y y) {
        return 1;
    }

    /* renamed from: b */
    public synchronized long mo27806b() {
        return this.f25482b;
    }

    /* renamed from: c */
    public synchronized Y mo27808c(T t) {
        Y remove;
        remove = this.f25481a.remove(t);
        if (remove != null) {
            this.f25483c -= (long) mo21284b(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public void mo27804a() {
        mo27805a(0);
    }

    /* renamed from: b */
    public synchronized Y mo27807b(T t, Y y) {
        long b = (long) mo21284b(y);
        if (b >= this.f25482b) {
            mo21283a(t, y);
            return null;
        }
        if (y != null) {
            this.f25483c += b;
        }
        Y put = this.f25481a.put(t, y);
        if (put != null) {
            this.f25483c -= (long) mo21284b(put);
            if (!put.equals(y)) {
                mo21283a(t, put);
            }
        }
        m34000c();
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo27805a(long j) {
        while (this.f25483c > j) {
            Iterator it = this.f25481a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f25483c -= (long) mo21284b(value);
            Object key = entry.getKey();
            it.remove();
            mo21283a(key, value);
        }
    }

    /* renamed from: c */
    private void m34000c() {
        mo27805a(this.f25482b);
    }
}
