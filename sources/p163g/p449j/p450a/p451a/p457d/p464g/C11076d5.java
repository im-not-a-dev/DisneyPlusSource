package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.d5 */
final class C11076d5 extends C11256p2<Long> implements C11230n4, C11027a6, RandomAccess {

    /* renamed from: W */
    private static final C11076d5 f26137W;

    /* renamed from: U */
    private long[] f26138U;

    /* renamed from: V */
    private int f26139V;

    static {
        C11076d5 d5Var = new C11076d5(new long[0], 0);
        f26137W = d5Var;
        d5Var.mo28708g0();
    }

    C11076d5() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    private final void m34964a(int i, long j) {
        mo28823b();
        if (i >= 0) {
            int i2 = this.f26139V;
            if (i <= i2) {
                long[] jArr = this.f26138U;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f26138U, i, jArr2, i + 1, this.f26139V - i);
                    this.f26138U = jArr2;
                }
                this.f26138U[i] = j;
                this.f26139V++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m34967g(i));
    }

    /* renamed from: c */
    public static C11076d5 m34965c() {
        return f26137W;
    }

    /* renamed from: f */
    private final void m34966f(int i) {
        if (i < 0 || i >= this.f26139V) {
            throw new IndexOutOfBoundsException(m34967g(i));
        }
    }

    /* renamed from: g */
    private final String m34967g(int i) {
        int i2 = this.f26139V;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34964a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo28823b();
        C11111f4.m35151a(collection);
        if (!(collection instanceof C11076d5)) {
            return super.addAll(collection);
        }
        C11076d5 d5Var = (C11076d5) collection;
        int i = d5Var.f26139V;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26139V;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f26138U;
            if (i3 > jArr.length) {
                this.f26138U = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(d5Var.f26138U, 0, this.f26138U, this.f26139V, d5Var.f26139V);
            this.f26139V = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long mo28389b(int i) {
        m34966f(i);
        return this.f26138U[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11076d5)) {
            return super.equals(obj);
        }
        C11076d5 d5Var = (C11076d5) obj;
        if (this.f26139V != d5Var.f26139V) {
            return false;
        }
        long[] jArr = d5Var.f26138U;
        for (int i = 0; i < this.f26139V; i++) {
            if (this.f26138U[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo28389b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26139V; i2++) {
            i = (i * 31) + C11111f4.m35148a(this.f26138U[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo28823b();
        for (int i = 0; i < this.f26139V; i++) {
            if (obj.equals(Long.valueOf(this.f26138U[i]))) {
                long[] jArr = this.f26138U;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f26139V - i) - 1);
                this.f26139V--;
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
            long[] jArr = this.f26138U;
            System.arraycopy(jArr, i2, jArr, i, this.f26139V - i2);
            this.f26139V -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo28823b();
        m34966f(i);
        long[] jArr = this.f26138U;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f26139V;
    }

    private C11076d5(long[] jArr, int i) {
        this.f26138U = jArr;
        this.f26139V = i;
    }

    /* renamed from: c */
    public final C11230n4 mo28257a(int i) {
        if (i >= this.f26139V) {
            return new C11076d5(Arrays.copyOf(this.f26138U, i), this.f26139V);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo28390b(long j) {
        m34964a(this.f26139V, j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        m34966f(i);
        long[] jArr = this.f26138U;
        long j = jArr[i];
        int i2 = this.f26139V;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f26139V--;
        this.modCount++;
        return Long.valueOf(j);
    }
}
