package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.t2 */
final class C11313t2 extends C11256p2<Boolean> implements C11216m4<Boolean>, C11027a6, RandomAccess {

    /* renamed from: U */
    private boolean[] f26528U;

    /* renamed from: V */
    private int f26529V;

    static {
        new C11313t2(new boolean[0], 0).mo28708g0();
    }

    C11313t2() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final void m36358f(int i) {
        if (i < 0 || i >= this.f26529V) {
            throw new IndexOutOfBoundsException(m36359g(i));
        }
    }

    /* renamed from: g */
    private final String m36359g(int i) {
        int i2 = this.f26529V;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo29015a(boolean z) {
        m36357a(this.f26529V, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m36357a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo28823b();
        C11111f4.m35151a(collection);
        if (!(collection instanceof C11313t2)) {
            return super.addAll(collection);
        }
        C11313t2 t2Var = (C11313t2) collection;
        int i = t2Var.f26529V;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26529V;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f26528U;
            if (i3 > zArr.length) {
                this.f26528U = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(t2Var.f26528U, 0, this.f26528U, this.f26529V, t2Var.f26529V);
            this.f26529V = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11313t2)) {
            return super.equals(obj);
        }
        C11313t2 t2Var = (C11313t2) obj;
        if (this.f26529V != t2Var.f26529V) {
            return false;
        }
        boolean[] zArr = t2Var.f26528U;
        for (int i = 0; i < this.f26529V; i++) {
            if (this.f26528U[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m36358f(i);
        return Boolean.valueOf(this.f26528U[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26529V; i2++) {
            i = (i * 31) + C11111f4.m35149a(this.f26528U[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo28823b();
        for (int i = 0; i < this.f26529V; i++) {
            if (obj.equals(Boolean.valueOf(this.f26528U[i]))) {
                boolean[] zArr = this.f26528U;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f26529V - i) - 1);
                this.f26529V--;
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
            boolean[] zArr = this.f26528U;
            System.arraycopy(zArr, i2, zArr, i, this.f26529V - i2);
            this.f26529V -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo28823b();
        m36358f(i);
        boolean[] zArr = this.f26528U;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f26529V;
    }

    private C11313t2(boolean[] zArr, int i) {
        this.f26528U = zArr;
        this.f26529V = i;
    }

    /* renamed from: a */
    private final void m36357a(int i, boolean z) {
        mo28823b();
        if (i >= 0) {
            int i2 = this.f26529V;
            if (i <= i2) {
                boolean[] zArr = this.f26528U;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f26528U, i, zArr2, i + 1, this.f26529V - i);
                    this.f26528U = zArr2;
                }
                this.f26528U[i] = z;
                this.f26529V++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m36359g(i));
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        m36358f(i);
        boolean[] zArr = this.f26528U;
        boolean z = zArr[i];
        int i2 = this.f26529V;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f26529V--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final /* synthetic */ C11216m4 mo28257a(int i) {
        if (i >= this.f26529V) {
            return new C11313t2(Arrays.copyOf(this.f26528U, i), this.f26529V);
        }
        throw new IllegalArgumentException();
    }
}
