package com.google.common.collect;

/* renamed from: com.google.common.collect.r */
/* compiled from: RegularImmutableSet */
final class C10406r<E> extends ImmutableSet<E> {

    /* renamed from: a0 */
    static final C10406r<Object> f24721a0;

    /* renamed from: V */
    final transient Object[] f24722V;

    /* renamed from: W */
    final transient Object[] f24723W;

    /* renamed from: X */
    private final transient int f24724X;

    /* renamed from: Y */
    private final transient int f24725Y;

    /* renamed from: Z */
    private final transient int f24726Z;

    static {
        C10406r rVar = new C10406r(new Object[0], 0, null, 0, 0);
        f24721a0 = rVar;
    }

    C10406r(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f24722V = objArr;
        this.f24723W = objArr2;
        this.f24724X = i2;
        this.f24725Y = i;
        this.f24726Z = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27117a(Object[] objArr, int i) {
        System.arraycopy(this.f24722V, 0, objArr, i, this.f24726Z);
        return i + this.f24726Z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object[] mo27133b() {
        return this.f24722V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo27134c() {
        return this.f24726Z;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f24723W;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C10384f.m32854a(obj);
        while (true) {
            int i = a & this.f24724X;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo27135d() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ImmutableList<E> mo27140f() {
        return ImmutableList.m32829b(this.f24722V, this.f24726Z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo27141g() {
        return true;
    }

    public int hashCode() {
        return this.f24725Y;
    }

    public int size() {
        return this.f24726Z;
    }

    public C10410v<E> iterator() {
        return mo27138e().iterator();
    }
}
