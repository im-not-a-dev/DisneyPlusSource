package p096e.p113e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: e.e.i */
/* compiled from: SimpleArrayMap */
public class C3941i<K, V> {

    /* renamed from: W */
    static Object[] f9761W;

    /* renamed from: X */
    static int f9762X;

    /* renamed from: Y */
    static Object[] f9763Y;

    /* renamed from: Z */
    static int f9764Z;

    /* renamed from: U */
    Object[] f9765U;

    /* renamed from: V */
    int f9766V;

    /* renamed from: c */
    int[] f9767c;

    public C3941i() {
        this.f9767c = C3932e.f9730a;
        this.f9765U = C3932e.f9732c;
        this.f9766V = 0;
    }

    /* renamed from: a */
    private static int m13242a(int[] iArr, int i, int i2) {
        try {
            return C3932e.m13192a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private void m13244e(int i) {
        Class<C3941i> cls = C3941i.class;
        if (i == 8) {
            synchronized (cls) {
                if (f9763Y != null) {
                    Object[] objArr = f9763Y;
                    this.f9765U = objArr;
                    f9763Y = (Object[]) objArr[0];
                    this.f9767c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9764Z--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f9761W != null) {
                    Object[] objArr2 = f9761W;
                    this.f9765U = objArr2;
                    f9761W = (Object[]) objArr2[0];
                    this.f9767c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9762X--;
                    return;
                }
            }
        }
        this.f9767c = new int[i];
        this.f9765U = new Object[(i << 1)];
    }

    /* renamed from: b */
    public int mo14150b(Object obj) {
        return obj == null ? mo14145a() : mo14146a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo14152c(Object obj) {
        int i = this.f9766V * 2;
        Object[] objArr = this.f9765U;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.f9766V;
        if (i > 0) {
            int[] iArr = this.f9767c;
            Object[] objArr = this.f9765U;
            this.f9767c = C3932e.f9730a;
            this.f9765U = C3932e.f9732c;
            this.f9766V = 0;
            m13243a(iArr, objArr, i);
        }
        if (this.f9766V > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo14150b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo14152c(obj) >= 0;
    }

    /* renamed from: d */
    public V mo14157d(int i) {
        return this.f9765U[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3941i) {
            C3941i iVar = (C3941i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f9766V) {
                try {
                    Object b = mo14151b(i);
                    Object d = mo14157d(i);
                    Object obj2 = iVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !iVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f9766V) {
                try {
                    Object b2 = mo14151b(i2);
                    Object d2 = mo14157d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int b = mo14150b(obj);
        return b >= 0 ? this.f9765U[(b << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f9767c;
        Object[] objArr = this.f9765U;
        int i = this.f9766V;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f9766V <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f9766V;
        if (k == null) {
            i2 = mo14145a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo14146a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f9765U;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f9767c.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f9767c;
            Object[] objArr = this.f9765U;
            m13244e(i6);
            if (i3 == this.f9766V) {
                int[] iArr2 = this.f9767c;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f9765U, 0, objArr.length);
                }
                m13243a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f9767c;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f9765U;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f9766V - i5) << 1);
        }
        int i8 = this.f9766V;
        if (i3 == i8) {
            int[] iArr4 = this.f9767c;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f9765U;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f9766V = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int b = mo14150b(obj);
        if (b >= 0) {
            return mo14153c(b);
        }
        return null;
    }

    public V replace(K k, V v) {
        int b = mo14150b((Object) k);
        if (b >= 0) {
            return mo14147a(b, v);
        }
        return null;
    }

    public int size() {
        return this.f9766V;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9766V * 28);
        sb.append('{');
        for (int i = 0; i < this.f9766V; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo14151b(i);
            String str = "(this Map)";
            if (b != this) {
                sb.append(b);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object d = mo14157d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public K mo14151b(int i) {
        return this.f9765U[i << 1];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo14146a(Object obj, int i) {
        int i2 = this.f9766V;
        if (i2 == 0) {
            return -1;
        }
        int a = m13242a(this.f9767c, i2, i);
        if (a < 0 || obj.equals(this.f9765U[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f9767c[i3] == i) {
            if (obj.equals(this.f9765U[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f9767c[i4] == i) {
            if (obj.equals(this.f9765U[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean remove(Object obj, Object obj2) {
        int b = mo14150b(obj);
        if (b >= 0) {
            Object d = mo14157d(b);
            if (obj2 == d || (obj2 != null && obj2.equals(d))) {
                mo14153c(b);
                return true;
            }
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int b = mo14150b((Object) k);
        if (b >= 0) {
            V d = mo14157d(b);
            if (d == v || (v != null && v.equals(d))) {
                mo14147a(b, v2);
                return true;
            }
        }
        return false;
    }

    public C3941i(int i) {
        if (i == 0) {
            this.f9767c = C3932e.f9730a;
            this.f9765U = C3932e.f9732c;
        } else {
            m13244e(i);
        }
        this.f9766V = 0;
    }

    /* renamed from: c */
    public V mo14153c(int i) {
        int i2;
        V[] vArr = this.f9765U;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f9766V;
        if (i4 <= 1) {
            m13243a(this.f9767c, (Object[]) vArr, i4);
            this.f9767c = C3932e.f9730a;
            this.f9765U = C3932e.f9732c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f9767c;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f9767c;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f9765U;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f9765U;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f9767c;
                Object[] objArr3 = this.f9765U;
                m13244e(i5);
                if (i4 == this.f9766V) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f9767c, 0, i);
                        System.arraycopy(objArr3, 0, this.f9765U, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f9767c, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f9765U, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f9766V) {
            this.f9766V = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public C3941i(C3941i<K, V> iVar) {
        this();
        if (iVar != null) {
            mo14149a(iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo14145a() {
        int i = this.f9766V;
        if (i == 0) {
            return -1;
        }
        int a = m13242a(this.f9767c, i, 0);
        if (a < 0 || this.f9765U[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f9767c[i2] == 0) {
            if (this.f9765U[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f9767c[i3] == 0) {
            if (this.f9765U[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    private static void m13243a(int[] iArr, Object[] objArr, int i) {
        Class<C3941i> cls = C3941i.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f9764Z < 10) {
                    objArr[0] = f9763Y;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f9763Y = objArr;
                    f9764Z++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f9762X < 10) {
                    objArr[0] = f9761W;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f9761W = objArr;
                    f9762X++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14148a(int i) {
        int i2 = this.f9766V;
        int[] iArr = this.f9767c;
        if (iArr.length < i) {
            Object[] objArr = this.f9765U;
            m13244e(i);
            if (this.f9766V > 0) {
                System.arraycopy(iArr, 0, this.f9767c, 0, i2);
                System.arraycopy(objArr, 0, this.f9765U, 0, i2 << 1);
            }
            m13243a(iArr, objArr, i2);
        }
        if (this.f9766V != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public V mo14147a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f9765U;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo14149a(C3941i<? extends K, ? extends V> iVar) {
        int i = iVar.f9766V;
        mo14148a(this.f9766V + i);
        if (this.f9766V != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(iVar.mo14151b(i2), iVar.mo14157d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(iVar.f9767c, 0, this.f9767c, 0, i);
            System.arraycopy(iVar.f9765U, 0, this.f9765U, 0, i << 1);
            this.f9766V = i;
        }
    }
}
