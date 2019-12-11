package p096e.p113e;

/* renamed from: e.e.c */
/* compiled from: CircularArray */
public final class C3930c<E> {

    /* renamed from: a */
    private E[] f9722a;

    /* renamed from: b */
    private int f9723b;

    /* renamed from: c */
    private int f9724c;

    /* renamed from: d */
    private int f9725d;

    public C3930c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.f9725d = i - 1;
            this.f9722a = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: c */
    private void m13176c() {
        E[] eArr = this.f9722a;
        int length = eArr.length;
        int i = this.f9723b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f9722a, 0, eArr2, i2, this.f9723b);
            this.f9722a = eArr2;
            this.f9723b = 0;
            this.f9724c = length;
            this.f9725d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo14046a(E e) {
        this.f9723b = (this.f9723b - 1) & this.f9725d;
        E[] eArr = this.f9722a;
        int i = this.f9723b;
        eArr[i] = e;
        if (i == this.f9724c) {
            m13176c();
        }
    }

    /* renamed from: b */
    public void mo14049b(E e) {
        E[] eArr = this.f9722a;
        int i = this.f9724c;
        eArr[i] = e;
        this.f9724c = this.f9725d & (i + 1);
        if (this.f9724c == this.f9723b) {
            m13176c();
        }
    }

    /* renamed from: a */
    public void mo14045a() {
        mo14050c(mo14047b());
    }

    /* renamed from: b */
    public void mo14048b(int i) {
        int i2;
        if (i > 0) {
            if (i <= mo14047b()) {
                int i3 = 0;
                int i4 = this.f9724c;
                if (i < i4) {
                    i3 = i4 - i;
                }
                int i5 = i3;
                while (true) {
                    i2 = this.f9724c;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f9722a[i5] = null;
                    i5++;
                }
                int i6 = i2 - i3;
                int i7 = i - i6;
                this.f9724c = i2 - i6;
                if (i7 > 0) {
                    this.f9724c = this.f9722a.length;
                    int i8 = this.f9724c - i7;
                    for (int i9 = i8; i9 < this.f9724c; i9++) {
                        this.f9722a[i9] = null;
                    }
                    this.f9724c = i8;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public E mo14044a(int i) {
        if (i < 0 || i >= mo14047b()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f9722a[this.f9725d & (this.f9723b + i)];
    }

    /* renamed from: c */
    public void mo14050c(int i) {
        if (i > 0) {
            if (i <= mo14047b()) {
                int length = this.f9722a.length;
                int i2 = this.f9723b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                for (int i3 = this.f9723b; i3 < length; i3++) {
                    this.f9722a[i3] = null;
                }
                int i4 = this.f9723b;
                int i5 = length - i4;
                int i6 = i - i5;
                this.f9723b = this.f9725d & (i4 + i5);
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        this.f9722a[i7] = null;
                    }
                    this.f9723b = i6;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public int mo14047b() {
        return (this.f9724c - this.f9723b) & this.f9725d;
    }
}
