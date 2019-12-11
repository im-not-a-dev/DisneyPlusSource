package p096e.p113e;

/* renamed from: e.e.j */
/* compiled from: SparseArrayCompat */
public class C3942j<E> implements Cloneable {

    /* renamed from: X */
    private static final Object f9768X = new Object();

    /* renamed from: U */
    private int[] f9769U;

    /* renamed from: V */
    private Object[] f9770V;

    /* renamed from: W */
    private int f9771W;

    /* renamed from: c */
    private boolean f9772c;

    public C3942j() {
        this(10);
    }

    /* renamed from: c */
    private void m13255c() {
        int i = this.f9771W;
        int[] iArr = this.f9769U;
        Object[] objArr = this.f9770V;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f9768X) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f9772c = false;
        this.f9771W = i2;
    }

    /* renamed from: a */
    public E mo14172a(int i) {
        return mo14177b(i, null);
    }

    /* renamed from: b */
    public E mo14177b(int i, E e) {
        int a = C3932e.m13192a(this.f9769U, this.f9771W, i);
        if (a >= 0) {
            E[] eArr = this.f9770V;
            if (eArr[a] != f9768X) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: d */
    public void mo14181d(int i) {
        int a = C3932e.m13192a(this.f9769U, this.f9771W, i);
        if (a >= 0) {
            Object[] objArr = this.f9770V;
            Object obj = objArr[a];
            Object obj2 = f9768X;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f9772c = true;
            }
        }
    }

    /* renamed from: e */
    public E mo14182e(int i) {
        if (this.f9772c) {
            m13255c();
        }
        return this.f9770V[i];
    }

    public String toString() {
        if (mo14175b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9771W * 28);
        sb.append('{');
        for (int i = 0; i < this.f9771W; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo14178c(i));
            sb.append('=');
            Object e = mo14182e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3942j(int i) {
        this.f9772c = false;
        if (i == 0) {
            this.f9769U = C3932e.f9730a;
            this.f9770V = C3932e.f9732c;
            return;
        }
        int b = C3932e.m13195b(i);
        this.f9769U = new int[b];
        this.f9770V = new Object[b];
    }

    /* renamed from: a */
    public int mo14171a(E e) {
        if (this.f9772c) {
            m13255c();
        }
        for (int i = 0; i < this.f9771W; i++) {
            if (this.f9770V[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public C3942j<E> clone() {
        try {
            C3942j<E> jVar = (C3942j) super.clone();
            jVar.f9769U = (int[]) this.f9769U.clone();
            jVar.f9770V = (Object[]) this.f9770V.clone();
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public int mo14175b() {
        if (this.f9772c) {
            m13255c();
        }
        return this.f9771W;
    }

    /* renamed from: a */
    public void mo14173a() {
        int i = this.f9771W;
        Object[] objArr = this.f9770V;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f9771W = 0;
        this.f9772c = false;
    }

    /* renamed from: b */
    public int mo14176b(int i) {
        if (this.f9772c) {
            m13255c();
        }
        return C3932e.m13192a(this.f9769U, this.f9771W, i);
    }

    /* renamed from: a */
    public void mo14174a(int i, E e) {
        int i2 = this.f9771W;
        if (i2 == 0 || i > this.f9769U[i2 - 1]) {
            if (this.f9772c && this.f9771W >= this.f9769U.length) {
                m13255c();
            }
            int i3 = this.f9771W;
            if (i3 >= this.f9769U.length) {
                int b = C3932e.m13195b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f9769U;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f9770V;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f9769U = iArr;
                this.f9770V = objArr;
            }
            this.f9769U[i3] = i;
            this.f9770V[i3] = e;
            this.f9771W = i3 + 1;
            return;
        }
        mo14179c(i, e);
    }

    /* renamed from: c */
    public void mo14179c(int i, E e) {
        int a = C3932e.m13192a(this.f9769U, this.f9771W, i);
        if (a >= 0) {
            this.f9770V[a] = e;
        } else {
            int i2 = ~a;
            if (i2 < this.f9771W) {
                Object[] objArr = this.f9770V;
                if (objArr[i2] == f9768X) {
                    this.f9769U[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f9772c && this.f9771W >= this.f9769U.length) {
                m13255c();
                i2 = ~C3932e.m13192a(this.f9769U, this.f9771W, i);
            }
            int i3 = this.f9771W;
            if (i3 >= this.f9769U.length) {
                int b = C3932e.m13195b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f9769U;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f9770V;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f9769U = iArr;
                this.f9770V = objArr2;
            }
            int i4 = this.f9771W;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f9769U;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f9770V;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f9771W - i2);
            }
            this.f9769U[i2] = i;
            this.f9770V[i2] = e;
            this.f9771W++;
        }
    }

    /* renamed from: c */
    public int mo14178c(int i) {
        if (this.f9772c) {
            m13255c();
        }
        return this.f9769U[i];
    }
}
