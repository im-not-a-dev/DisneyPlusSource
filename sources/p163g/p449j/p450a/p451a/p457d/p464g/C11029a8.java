package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.a8 */
public final class C11029a8 implements Cloneable {

    /* renamed from: W */
    private static final C11401z7 f26053W = new C11401z7();

    /* renamed from: U */
    private C11401z7[] f26054U;

    /* renamed from: V */
    private int f26055V;

    /* renamed from: c */
    private int[] f26056c;

    C11029a8() {
        this(10);
    }

    /* renamed from: c */
    private static int m34747c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m34748d(int i) {
        int i2 = this.f26055V - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f26056c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11401z7 mo28281a(int i) {
        int d = m34748d(i);
        if (d >= 0) {
            C11401z7[] z7VarArr = this.f26054U;
            if (z7VarArr[d] != f26053W) {
                return z7VarArr[d];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo28284b() {
        return this.f26055V;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f26055V;
        C11029a8 a8Var = new C11029a8(i);
        System.arraycopy(this.f26056c, 0, a8Var.f26056c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C11401z7[] z7VarArr = this.f26054U;
            if (z7VarArr[i2] != null) {
                a8Var.f26054U[i2] = (C11401z7) z7VarArr[i2].clone();
            }
        }
        a8Var.f26055V = i;
        return a8Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11029a8)) {
            return false;
        }
        C11029a8 a8Var = (C11029a8) obj;
        int i = this.f26055V;
        if (i != a8Var.f26055V) {
            return false;
        }
        int[] iArr = this.f26056c;
        int[] iArr2 = a8Var.f26056c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C11401z7[] z7VarArr = this.f26054U;
            C11401z7[] z7VarArr2 = a8Var.f26054U;
            int i3 = this.f26055V;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!z7VarArr[i4].equals(z7VarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f26055V; i2++) {
            i = (((i * 31) + this.f26056c[i2]) * 31) + this.f26054U[i2].hashCode();
        }
        return i;
    }

    private C11029a8(int i) {
        int c = m34747c(i);
        this.f26056c = new int[c];
        this.f26054U = new C11401z7[c];
        this.f26055V = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C11401z7 mo28285b(int i) {
        return this.f26054U[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28282a(int i, C11401z7 z7Var) {
        int d = m34748d(i);
        if (d >= 0) {
            this.f26054U[d] = z7Var;
            return;
        }
        int i2 = ~d;
        if (i2 < this.f26055V) {
            C11401z7[] z7VarArr = this.f26054U;
            if (z7VarArr[i2] == f26053W) {
                this.f26056c[i2] = i;
                z7VarArr[i2] = z7Var;
                return;
            }
        }
        int i3 = this.f26055V;
        if (i3 >= this.f26056c.length) {
            int c = m34747c(i3 + 1);
            int[] iArr = new int[c];
            C11401z7[] z7VarArr2 = new C11401z7[c];
            int[] iArr2 = this.f26056c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            C11401z7[] z7VarArr3 = this.f26054U;
            System.arraycopy(z7VarArr3, 0, z7VarArr2, 0, z7VarArr3.length);
            this.f26056c = iArr;
            this.f26054U = z7VarArr2;
        }
        int i4 = this.f26055V;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f26056c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            C11401z7[] z7VarArr4 = this.f26054U;
            System.arraycopy(z7VarArr4, i2, z7VarArr4, i5, this.f26055V - i2);
        }
        this.f26056c[i2] = i;
        this.f26054U[i2] = z7Var;
        this.f26055V++;
    }

    /* renamed from: a */
    public final boolean mo28283a() {
        return this.f26055V == 0;
    }
}
