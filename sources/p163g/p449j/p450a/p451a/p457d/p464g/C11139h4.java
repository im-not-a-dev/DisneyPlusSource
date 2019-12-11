package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.h4 */
final class C11139h4 extends C11256p2<Integer> implements C11181k4, C11027a6, RandomAccess {

    /* renamed from: W */
    private static final C11139h4 f26228W;

    /* renamed from: U */
    private int[] f26229U;

    /* renamed from: V */
    private int f26230V;

    static {
        C11139h4 h4Var = new C11139h4(new int[0], 0);
        f26228W = h4Var;
        h4Var.mo28708g0();
    }

    C11139h4() {
        this(new int[10], 0);
    }

    /* renamed from: a */
    private final void m35260a(int i, int i2) {
        mo28823b();
        if (i >= 0) {
            int i3 = this.f26230V;
            if (i <= i3) {
                int[] iArr = this.f26229U;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f26229U, i, iArr2, i + 1, this.f26230V - i);
                    this.f26229U = iArr2;
                }
                this.f26229U[i] = i2;
                this.f26230V++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m35263i(i));
    }

    /* renamed from: c */
    public static C11139h4 m35261c() {
        return f26228W;
    }

    /* renamed from: h */
    private final void m35262h(int i) {
        if (i < 0 || i >= this.f26230V) {
            throw new IndexOutOfBoundsException(m35263i(i));
        }
    }

    /* renamed from: i */
    private final String m35263i(int i) {
        int i2 = this.f26230V;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m35260a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo28823b();
        C11111f4.m35151a(collection);
        if (!(collection instanceof C11139h4)) {
            return super.addAll(collection);
        }
        C11139h4 h4Var = (C11139h4) collection;
        int i = h4Var.f26230V;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26230V;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f26229U;
            if (i3 > iArr.length) {
                this.f26229U = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(h4Var.f26229U, 0, this.f26229U, this.f26230V, h4Var.f26230V);
            this.f26230V = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final C11181k4 mo28257a(int i) {
        if (i >= this.f26230V) {
            return new C11139h4(Arrays.copyOf(this.f26229U, i), this.f26230V);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11139h4)) {
            return super.equals(obj);
        }
        C11139h4 h4Var = (C11139h4) obj;
        if (this.f26230V != h4Var.f26230V) {
            return false;
        }
        int[] iArr = h4Var.f26229U;
        for (int i = 0; i < this.f26230V; i++) {
            if (this.f26229U[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo28534f(int i) {
        m35262h(i);
        return this.f26229U[i];
    }

    /* renamed from: g */
    public final void mo28535g(int i) {
        m35260a(this.f26230V, i);
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo28534f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26230V; i2++) {
            i = (i * 31) + this.f26229U[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo28823b();
        for (int i = 0; i < this.f26230V; i++) {
            if (obj.equals(Integer.valueOf(this.f26229U[i]))) {
                int[] iArr = this.f26229U;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f26230V - i) - 1);
                this.f26230V--;
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
            int[] iArr = this.f26229U;
            System.arraycopy(iArr, i2, iArr, i, this.f26230V - i2);
            this.f26230V -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo28823b();
        m35262h(i);
        int[] iArr = this.f26229U;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f26230V;
    }

    private C11139h4(int[] iArr, int i) {
        this.f26229U = iArr;
        this.f26230V = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        m35262h(i);
        int[] iArr = this.f26229U;
        int i2 = iArr[i];
        int i3 = this.f26230V;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f26230V--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
