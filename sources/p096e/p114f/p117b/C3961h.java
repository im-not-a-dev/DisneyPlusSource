package p096e.p114f.p117b;

/* renamed from: e.f.b.h */
/* compiled from: Pools */
class C3961h<T> implements C3960g<T> {

    /* renamed from: a */
    private final Object[] f9894a;

    /* renamed from: b */
    private int f9895b;

    C3961h(int i) {
        if (i > 0) {
            this.f9894a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo14274a() {
        int i = this.f9895b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f9894a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f9895b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo14276a(T t) {
        int i = this.f9895b;
        Object[] objArr = this.f9894a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f9895b = i + 1;
        return true;
    }

    /* renamed from: a */
    public void mo14275a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f9895b;
            Object[] objArr = this.f9894a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f9895b = i3 + 1;
            }
        }
    }
}
