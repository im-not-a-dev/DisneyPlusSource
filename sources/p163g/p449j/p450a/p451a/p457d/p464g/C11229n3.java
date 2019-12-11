package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.n3 */
final class C11229n3 extends C11256p2<Double> implements C11216m4<Double>, C11027a6, RandomAccess {

    /* renamed from: U */
    private double[] f26371U;

    /* renamed from: V */
    private int f26372V;

    static {
        new C11229n3(new double[0], 0).mo28708g0();
    }

    C11229n3() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final void m35779f(int i) {
        if (i < 0 || i >= this.f26372V) {
            throw new IndexOutOfBoundsException(m35780g(i));
        }
    }

    /* renamed from: g */
    private final String m35780g(int i) {
        int i2 = this.f26372V;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28730a(double d) {
        m35778a(this.f26372V, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m35778a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo28823b();
        C11111f4.m35151a(collection);
        if (!(collection instanceof C11229n3)) {
            return super.addAll(collection);
        }
        C11229n3 n3Var = (C11229n3) collection;
        int i = n3Var.f26372V;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26372V;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f26371U;
            if (i3 > dArr.length) {
                this.f26371U = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(n3Var.f26371U, 0, this.f26371U, this.f26372V, n3Var.f26372V);
            this.f26372V = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11229n3)) {
            return super.equals(obj);
        }
        C11229n3 n3Var = (C11229n3) obj;
        if (this.f26372V != n3Var.f26372V) {
            return false;
        }
        double[] dArr = n3Var.f26371U;
        for (int i = 0; i < this.f26372V; i++) {
            if (Double.doubleToLongBits(this.f26371U[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m35779f(i);
        return Double.valueOf(this.f26371U[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26372V; i2++) {
            i = (i * 31) + C11111f4.m35148a(Double.doubleToLongBits(this.f26371U[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo28823b();
        for (int i = 0; i < this.f26372V; i++) {
            if (obj.equals(Double.valueOf(this.f26371U[i]))) {
                double[] dArr = this.f26371U;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f26372V - i) - 1);
                this.f26372V--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo28823b();
        if (i2 >= i) {
            double[] dArr = this.f26371U;
            System.arraycopy(dArr, i2, dArr, i, this.f26372V - i2);
            this.f26372V -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo28823b();
        m35779f(i);
        double[] dArr = this.f26371U;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f26372V;
    }

    private C11229n3(double[] dArr, int i) {
        this.f26371U = dArr;
        this.f26372V = i;
    }

    /* renamed from: a */
    private final void m35778a(int i, double d) {
        mo28823b();
        if (i >= 0) {
            int i2 = this.f26372V;
            if (i <= i2) {
                double[] dArr = this.f26371U;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f26371U, i, dArr2, i + 1, this.f26372V - i);
                    this.f26371U = dArr2;
                }
                this.f26371U[i] = d;
                this.f26372V++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m35780g(i));
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        m35779f(i);
        double[] dArr = this.f26371U;
        double d = dArr[i];
        int i2 = this.f26372V;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f26372V--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: a */
    public final /* synthetic */ C11216m4 mo28257a(int i) {
        if (i >= this.f26372V) {
            return new C11229n3(Arrays.copyOf(this.f26371U, i), this.f26372V);
        }
        throw new IllegalArgumentException();
    }
}
