package com.google.common.collect;

import com.google.common.base.C10374f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableSet<E> extends C10385g<E> implements Set<E> {

    /* renamed from: U */
    private transient ImmutableList<E> f24685U;

    ImmutableSet() {
    }

    /* renamed from: a */
    public static <E> ImmutableSet<E> m32838a(E e) {
        return new C10408t(e);
    }

    /* renamed from: a */
    private static boolean m32843a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: f */
    static int m32844f(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C10374f.m32813a(z, (Object) "collection too large");
        return 1073741824;
    }

    /* renamed from: h */
    public static <E> ImmutableSet<E> m32845h() {
        return C10406r.f24721a0;
    }

    /* renamed from: e */
    public ImmutableList<E> mo27138e() {
        ImmutableList<E> immutableList = this.f24685U;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> f = mo27140f();
        this.f24685U = f;
        return f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !mo27141g() || !((ImmutableSet) obj).mo27141g() || hashCode() == obj.hashCode()) {
            return C10407s.m32916a(this, obj);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo27141g() {
        return false;
    }

    public int hashCode() {
        return C10407s.m32915a(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: a */
    public static <E> ImmutableSet<E> m32839a(E e, E e2) {
        return m32837a(2, e, e2);
    }

    /* renamed from: a */
    public static <E> ImmutableSet<E> m32840a(E e, E e2, E e3) {
        return m32837a(3, e, e2, e3);
    }

    /* renamed from: a */
    public static <E> ImmutableSet<E> m32841a(E e, E e2, E e3, E e4) {
        return m32837a(4, e, e2, e3, e4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ImmutableList<E> mo27140f() {
        return ImmutableList.m32827a(toArray());
    }

    @SafeVarargs
    /* renamed from: a */
    public static <E> ImmutableSet<E> m32842a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C10374f.m32813a(eArr.length <= 2147483641, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m32837a(objArr.length, objArr);
    }

    /* renamed from: a */
    private static <E> ImmutableSet<E> m32837a(int i, Object... objArr) {
        if (i == 0) {
            return m32845h();
        }
        if (i == 1) {
            return m32838a(objArr[0]);
        }
        int f = m32844f(i);
        Object[] objArr2 = new Object[f];
        int i2 = f - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C10397m.m32883a(obj, i5);
            int hashCode = obj.hashCode();
            int a = C10384f.m32853a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    int i7 = i4 + 1;
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4 = i7;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, null);
        if (i4 == 1) {
            return new C10408t(objArr[0], i3);
        }
        if (m32844f(i4) < f / 2) {
            return m32837a(i4, objArr);
        }
        if (m32843a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        C10406r rVar = new C10406r(objArr, i3, objArr2, i2, i4);
        return rVar;
    }
}
