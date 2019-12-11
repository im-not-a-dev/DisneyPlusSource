package p096e.p113e;

/* renamed from: e.e.d */
/* compiled from: CircularIntArray */
public final class C3931d {

    /* renamed from: a */
    private int[] f9726a;

    /* renamed from: b */
    private int f9727b;

    /* renamed from: c */
    private int f9728c;

    /* renamed from: d */
    private int f9729d;

    public C3931d() {
        this(8);
    }

    /* renamed from: e */
    private void m13184e() {
        int[] iArr = this.f9726a;
        int length = iArr.length;
        int i = this.f9727b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f9726a, 0, iArr2, i2, this.f9727b);
            this.f9726a = iArr2;
            this.f9727b = 0;
            this.f9728c = length;
            this.f9729d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo14052a(int i) {
        int[] iArr = this.f9726a;
        int i2 = this.f9728c;
        iArr[i2] = i;
        this.f9728c = this.f9729d & (i2 + 1);
        if (this.f9728c == this.f9727b) {
            m13184e();
        }
    }

    /* renamed from: b */
    public int mo14053b() {
        int i = this.f9727b;
        int i2 = this.f9728c;
        if (i != i2) {
            return this.f9726a[(i2 - 1) & this.f9729d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: c */
    public int mo14055c() {
        int i = this.f9727b;
        int i2 = this.f9728c;
        if (i != i2) {
            int i3 = this.f9729d & (i2 - 1);
            int i4 = this.f9726a[i3];
            this.f9728c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public int mo14056d() {
        return (this.f9728c - this.f9727b) & this.f9729d;
    }

    public C3931d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.f9729d = i - 1;
            this.f9726a = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: b */
    public int mo14054b(int i) {
        if (i < 0 || i >= mo14056d()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f9726a[this.f9729d & (this.f9727b + i)];
    }

    /* renamed from: a */
    public void mo14051a() {
        this.f9728c = this.f9727b;
    }
}
