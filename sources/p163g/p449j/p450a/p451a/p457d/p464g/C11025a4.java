package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.a4 */
final class C11025a4 extends C11256p2<Float> implements C11216m4<Float>, C11027a6, RandomAccess {

    /* renamed from: U */
    private float[] f26048U;

    /* renamed from: V */
    private int f26049V;

    static {
        new C11025a4(new float[0], 0).mo28708g0();
    }

    C11025a4() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final void m34739f(int i) {
        if (i < 0 || i >= this.f26049V) {
            throw new IndexOutOfBoundsException(m34740g(i));
        }
    }

    /* renamed from: g */
    private final String m34740g(int i) {
        int i2 = this.f26049V;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28258a(float f) {
        m34738a(this.f26049V, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m34738a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo28823b();
        C11111f4.m35151a(collection);
        if (!(collection instanceof C11025a4)) {
            return super.addAll(collection);
        }
        C11025a4 a4Var = (C11025a4) collection;
        int i = a4Var.f26049V;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26049V;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f26048U;
            if (i3 > fArr.length) {
                this.f26048U = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(a4Var.f26048U, 0, this.f26048U, this.f26049V, a4Var.f26049V);
            this.f26049V = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11025a4)) {
            return super.equals(obj);
        }
        C11025a4 a4Var = (C11025a4) obj;
        if (this.f26049V != a4Var.f26049V) {
            return false;
        }
        float[] fArr = a4Var.f26048U;
        for (int i = 0; i < this.f26049V; i++) {
            if (Float.floatToIntBits(this.f26048U[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m34739f(i);
        return Float.valueOf(this.f26048U[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26049V; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f26048U[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo28823b();
        for (int i = 0; i < this.f26049V; i++) {
            if (obj.equals(Float.valueOf(this.f26048U[i]))) {
                float[] fArr = this.f26048U;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f26049V - i) - 1);
                this.f26049V--;
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
            float[] fArr = this.f26048U;
            System.arraycopy(fArr, i2, fArr, i, this.f26049V - i2);
            this.f26049V -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo28823b();
        m34739f(i);
        float[] fArr = this.f26048U;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f26049V;
    }

    private C11025a4(float[] fArr, int i) {
        this.f26048U = fArr;
        this.f26049V = i;
    }

    /* renamed from: a */
    private final void m34738a(int i, float f) {
        mo28823b();
        if (i >= 0) {
            int i2 = this.f26049V;
            if (i <= i2) {
                float[] fArr = this.f26048U;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f26048U, i, fArr2, i + 1, this.f26049V - i);
                    this.f26048U = fArr2;
                }
                this.f26048U[i] = f;
                this.f26049V++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m34740g(i));
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        m34739f(i);
        float[] fArr = this.f26048U;
        float f = fArr[i];
        int i2 = this.f26049V;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f26049V--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: a */
    public final /* synthetic */ C11216m4 mo28257a(int i) {
        if (i >= this.f26049V) {
            return new C11025a4(Arrays.copyOf(this.f26048U, i), this.f26049V);
        }
        throw new IllegalArgumentException();
    }
}
