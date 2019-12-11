package p096e.p113e;

/* renamed from: e.e.f */
/* compiled from: LongSparseArray */
public class C3933f<E> implements Cloneable {

    /* renamed from: X */
    private static final Object f9733X = new Object();

    /* renamed from: U */
    private long[] f9734U;

    /* renamed from: V */
    private Object[] f9735V;

    /* renamed from: W */
    private int f9736W;

    /* renamed from: c */
    private boolean f9737c;

    public C3933f() {
        this(10);
    }

    /* renamed from: a */
    public long mo14057a(int i) {
        if (this.f9737c) {
            m13197c();
        }
        return this.f9734U[i];
    }

    /* renamed from: b */
    public E mo14062b(long j, E e) {
        int a = C3932e.m13193a(this.f9734U, this.f9736W, j);
        if (a >= 0) {
            E[] eArr = this.f9735V;
            if (eArr[a] != f9733X) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public E mo14066c(long j) {
        return mo14062b(j, null);
    }

    /* renamed from: d */
    public int mo14069d(long j) {
        if (this.f9737c) {
            m13197c();
        }
        return C3932e.m13193a(this.f9734U, this.f9736W, j);
    }

    /* renamed from: e */
    public void mo14070e(long j) {
        int a = C3932e.m13193a(this.f9734U, this.f9736W, j);
        if (a >= 0) {
            Object[] objArr = this.f9735V;
            Object obj = objArr[a];
            Object obj2 = f9733X;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f9737c = true;
            }
        }
    }

    public String toString() {
        if (mo14061b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9736W * 28);
        sb.append('{');
        for (int i = 0; i < this.f9736W; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo14057a(i));
            sb.append('=');
            Object c = mo14065c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3933f(int i) {
        this.f9737c = false;
        if (i == 0) {
            this.f9734U = C3932e.f9731b;
            this.f9735V = C3932e.f9732c;
            return;
        }
        int c = C3932e.m13196c(i);
        this.f9734U = new long[c];
        this.f9735V = new Object[c];
    }

    /* renamed from: c */
    private void m13197c() {
        int i = this.f9736W;
        long[] jArr = this.f9734U;
        Object[] objArr = this.f9735V;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f9733X) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f9737c = false;
        this.f9736W = i2;
    }

    public C3933f<E> clone() {
        try {
            C3933f<E> fVar = (C3933f) super.clone();
            fVar.f9734U = (long[]) this.f9734U.clone();
            fVar.f9735V = (Object[]) this.f9735V.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public boolean mo14060a(long j) {
        return mo14069d(j) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public void mo14064b(long j) {
        mo14070e(j);
    }

    /* renamed from: a */
    public void mo14058a() {
        int i = this.f9736W;
        Object[] objArr = this.f9735V;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f9736W = 0;
        this.f9737c = false;
    }

    /* renamed from: b */
    public void mo14063b(int i) {
        Object[] objArr = this.f9735V;
        Object obj = objArr[i];
        Object obj2 = f9733X;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f9737c = true;
        }
    }

    /* renamed from: b */
    public int mo14061b() {
        if (this.f9737c) {
            m13197c();
        }
        return this.f9736W;
    }

    /* renamed from: a */
    public void mo14059a(long j, E e) {
        int i = this.f9736W;
        if (i == 0 || j > this.f9734U[i - 1]) {
            if (this.f9737c && this.f9736W >= this.f9734U.length) {
                m13197c();
            }
            int i2 = this.f9736W;
            if (i2 >= this.f9734U.length) {
                int c = C3932e.m13196c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f9734U;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f9735V;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f9734U = jArr;
                this.f9735V = objArr;
            }
            this.f9734U[i2] = j;
            this.f9735V[i2] = e;
            this.f9736W = i2 + 1;
            return;
        }
        mo14067c(j, e);
    }

    /* renamed from: c */
    public void mo14067c(long j, E e) {
        int a = C3932e.m13193a(this.f9734U, this.f9736W, j);
        if (a >= 0) {
            this.f9735V[a] = e;
        } else {
            int i = ~a;
            if (i < this.f9736W) {
                Object[] objArr = this.f9735V;
                if (objArr[i] == f9733X) {
                    this.f9734U[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f9737c && this.f9736W >= this.f9734U.length) {
                m13197c();
                i = ~C3932e.m13193a(this.f9734U, this.f9736W, j);
            }
            int i2 = this.f9736W;
            if (i2 >= this.f9734U.length) {
                int c = C3932e.m13196c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f9734U;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f9735V;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f9734U = jArr;
                this.f9735V = objArr2;
            }
            int i3 = this.f9736W;
            if (i3 - i != 0) {
                long[] jArr3 = this.f9734U;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f9735V;
                System.arraycopy(objArr4, i, objArr4, i4, this.f9736W - i);
            }
            this.f9734U[i] = j;
            this.f9735V[i] = e;
            this.f9736W++;
        }
    }

    /* renamed from: c */
    public E mo14065c(int i) {
        if (this.f9737c) {
            m13197c();
        }
        return this.f9735V[i];
    }
}
