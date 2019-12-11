package p096e.p121h.p134r;

/* renamed from: e.h.r.g */
/* compiled from: Pools */
public class C4115g<T> implements C4114f<T> {

    /* renamed from: a */
    private final Object[] f10389a;

    /* renamed from: b */
    private int f10390b;

    public C4115g(int i) {
        if (i > 0) {
            this.f10389a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m14089b(T t) {
        for (int i = 0; i < this.f10390b; i++) {
            if (this.f10389a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo14666a() {
        int i = this.f10390b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f10389a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f10390b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo14667a(T t) {
        if (!m14089b(t)) {
            int i = this.f10390b;
            Object[] objArr = this.f10389a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f10390b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
