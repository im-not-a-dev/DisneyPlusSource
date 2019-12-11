package p096e.p113e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.e.b */
/* compiled from: ArraySet */
public final class C3928b<E> implements Collection<E>, Set<E> {

    /* renamed from: X */
    private static final int[] f9711X = new int[0];

    /* renamed from: Y */
    private static final Object[] f9712Y = new Object[0];

    /* renamed from: Z */
    private static Object[] f9713Z;

    /* renamed from: a0 */
    private static int f9714a0;

    /* renamed from: b0 */
    private static Object[] f9715b0;

    /* renamed from: c0 */
    private static int f9716c0;

    /* renamed from: U */
    Object[] f9717U;

    /* renamed from: V */
    int f9718V;

    /* renamed from: W */
    private C3935h<E, E> f9719W;

    /* renamed from: c */
    private int[] f9720c;

    /* renamed from: e.e.b$a */
    /* compiled from: ArraySet */
    class C3929a extends C3935h<E, E> {
        C3929a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo14016a(int i, int i2) {
            return C3928b.this.f9717U[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo14021b(Object obj) {
            return C3928b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo14023c() {
            return C3928b.this.f9718V;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo14015a(Object obj) {
            return C3928b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo14022b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14020a(E e, E e2) {
            C3928b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo14017a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14019a(int i) {
            C3928b.this.mo14031g(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14018a() {
            C3928b.this.clear();
        }
    }

    public C3928b() {
        this(0);
    }

    /* renamed from: a */
    private int m13159a(Object obj, int i) {
        int i2 = this.f9718V;
        if (i2 == 0) {
            return -1;
        }
        int a = C3932e.m13192a(this.f9720c, i2, i);
        if (a < 0 || obj.equals(this.f9717U[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f9720c[i3] == i) {
            if (obj.equals(this.f9717U[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f9720c[i4] == i) {
            if (obj.equals(this.f9717U[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: b */
    private C3935h<E, E> m13161b() {
        if (this.f9719W == null) {
            this.f9719W = new C3929a();
        }
        return this.f9719W;
    }

    /* renamed from: c */
    private int m13162c() {
        int i = this.f9718V;
        if (i == 0) {
            return -1;
        }
        int a = C3932e.m13192a(this.f9720c, i, 0);
        if (a < 0 || this.f9717U[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f9720c[i2] == 0) {
            if (this.f9717U[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f9720c[i3] == 0) {
            if (this.f9717U[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: i */
    private void m13163i(int i) {
        if (i == 8) {
            synchronized (C3928b.class) {
                if (f9715b0 != null) {
                    Object[] objArr = f9715b0;
                    this.f9717U = objArr;
                    f9715b0 = (Object[]) objArr[0];
                    this.f9720c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9716c0--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3928b.class) {
                if (f9713Z != null) {
                    Object[] objArr2 = f9713Z;
                    this.f9717U = objArr2;
                    f9713Z = (Object[]) objArr2[0];
                    this.f9720c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9714a0--;
                    return;
                }
            }
        }
        this.f9720c = new int[i];
        this.f9717U = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m13162c();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m13159a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f9718V;
        if (i4 >= this.f9720c.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f9720c;
            Object[] objArr = this.f9717U;
            m13163i(i5);
            int[] iArr2 = this.f9720c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9717U, 0, objArr.length);
            }
            m13160a(iArr, objArr, this.f9718V);
        }
        int i6 = this.f9718V;
        if (i3 < i6) {
            int[] iArr3 = this.f9720c;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f9717U;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f9718V - i3);
        }
        this.f9720c[i3] = i;
        this.f9717U[i3] = e;
        this.f9718V++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo14030f(this.f9718V + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f9718V;
        if (i != 0) {
            m13160a(this.f9720c, this.f9717U, i);
            this.f9720c = f9711X;
            this.f9717U = f9712Y;
            this.f9718V = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f9718V) {
                try {
                    if (!set.contains(mo14032h(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo14030f(int i) {
        int[] iArr = this.f9720c;
        if (iArr.length < i) {
            Object[] objArr = this.f9717U;
            m13163i(i);
            int i2 = this.f9718V;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f9720c, 0, i2);
                System.arraycopy(objArr, 0, this.f9717U, 0, this.f9718V);
            }
            m13160a(iArr, objArr, this.f9718V);
        }
    }

    /* renamed from: g */
    public E mo14031g(int i) {
        E[] eArr = this.f9717U;
        E e = eArr[i];
        int i2 = this.f9718V;
        if (i2 <= 1) {
            m13160a(this.f9720c, eArr, i2);
            this.f9720c = f9711X;
            this.f9717U = f9712Y;
            this.f9718V = 0;
        } else {
            int[] iArr = this.f9720c;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f9718V--;
                int i4 = this.f9718V;
                if (i < i4) {
                    int[] iArr2 = this.f9720c;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f9717U;
                    System.arraycopy(objArr, i5, objArr, i, this.f9718V - i);
                }
                this.f9717U[this.f9718V] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f9720c;
                Object[] objArr2 = this.f9717U;
                m13163i(i3);
                this.f9718V--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f9720c, 0, i);
                    System.arraycopy(objArr2, 0, this.f9717U, 0, i);
                }
                int i6 = this.f9718V;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f9720c, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f9717U, i, this.f9718V - i);
                }
            }
        }
        return e;
    }

    /* renamed from: h */
    public E mo14032h(int i) {
        return this.f9717U[i];
    }

    public int hashCode() {
        int[] iArr = this.f9720c;
        int i = 0;
        for (int i2 = 0; i2 < this.f9718V; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? m13162c() : m13159a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f9718V <= 0;
    }

    public Iterator<E> iterator() {
        return m13161b().mo14087e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo14031g(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f9718V - 1; i >= 0; i--) {
            if (!collection.contains(this.f9717U[i])) {
                mo14031g(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f9718V;
    }

    public Object[] toArray() {
        int i = this.f9718V;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f9717U, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9718V * 14);
        sb.append('{');
        for (int i = 0; i < this.f9718V; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = mo14032h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3928b(int i) {
        if (i == 0) {
            this.f9720c = f9711X;
            this.f9717U = f9712Y;
        } else {
            m13163i(i);
        }
        this.f9718V = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f9718V) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9718V);
        }
        System.arraycopy(this.f9717U, 0, tArr, 0, this.f9718V);
        int length = tArr.length;
        int i = this.f9718V;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    private static void m13160a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3928b.class) {
                if (f9716c0 < 10) {
                    objArr[0] = f9715b0;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f9715b0 = objArr;
                    f9716c0++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3928b.class) {
                if (f9714a0 < 10) {
                    objArr[0] = f9713Z;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f9713Z = objArr;
                    f9714a0++;
                }
            }
        }
    }
}
