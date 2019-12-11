package com.google.common.collect;

import com.google.common.base.C10374f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: com.google.common.collect.g */
/* compiled from: ImmutableCollection */
public abstract class C10385g<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: c */
    private static final Object[] f24691c = new Object[0];

    /* renamed from: com.google.common.collect.g$a */
    /* compiled from: ImmutableCollection */
    public static abstract class C10386a<E> {
        /* renamed from: a */
        static int m32859a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C10385g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27117a(Object[] objArr, int i) {
        C10410v it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object[] mo27133b() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo27134c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo27135d() {
        throw new UnsupportedOperationException();
    }

    public abstract C10410v<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f24691c);
    }

    public final <T> T[] toArray(T[] tArr) {
        C10374f.m32809a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b = mo27133b();
            if (b != null) {
                return C10399o.m32890a(b, mo27135d(), mo27134c(), tArr);
            }
            tArr = C10397m.m32886b(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo27117a(tArr, 0);
        return tArr;
    }
}
