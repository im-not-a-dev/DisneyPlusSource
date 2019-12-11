package p520io.reactivex.p531y.p547j;

/* renamed from: io.reactivex.y.j.k */
/* compiled from: OpenHashSet */
public final class C12555k<T> {

    /* renamed from: a */
    final float f29087a;

    /* renamed from: b */
    int f29088b;

    /* renamed from: c */
    int f29089c;

    /* renamed from: d */
    int f29090d;

    /* renamed from: e */
    T[] f29091e;

    public C12555k() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    static int m39369a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo30678a(T t) {
        T t2;
        T[] tArr = this.f29091e;
        int i = this.f29088b;
        int a = m39369a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f29089c + 1;
        this.f29089c = i2;
        if (i2 >= this.f29090d) {
            mo30680b();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo30681b(T t) {
        T t2;
        T[] tArr = this.f29091e;
        int i = this.f29088b;
        int a = m39369a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo30677a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo30677a(a, tArr, i);
    }

    public C12555k(int i, float f) {
        this.f29087a = f;
        int a = C12556l.m39375a(i);
        this.f29088b = a - 1;
        this.f29090d = (int) (f * ((float) a));
        this.f29091e = new Object[a];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30680b() {
        T[] tArr = this.f29091e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f29089c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m39369a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f29088b = i2;
                this.f29090d = (int) (((float) i) * this.f29087a);
                this.f29091e = tArr2;
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30677a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f29089c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m39369a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public Object[] mo30679a() {
        return this.f29091e;
    }
}
