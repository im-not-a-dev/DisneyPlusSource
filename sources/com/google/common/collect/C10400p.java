package com.google.common.collect;

import com.google.common.base.C10374f;

/* renamed from: com.google.common.collect.p */
/* compiled from: RegularImmutableList */
class C10400p<E> extends ImmutableList<E> {

    /* renamed from: X */
    static final ImmutableList<Object> f24704X = new C10400p(new Object[0], 0);

    /* renamed from: V */
    final transient Object[] f24705V;

    /* renamed from: W */
    private final transient int f24706W;

    C10400p(Object[] objArr, int i) {
        this.f24705V = objArr;
        this.f24706W = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27117a(Object[] objArr, int i) {
        System.arraycopy(this.f24705V, 0, objArr, i, this.f24706W);
        return i + this.f24706W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object[] mo27133b() {
        return this.f24705V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo27134c() {
        return this.f24706W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo27135d() {
        return 0;
    }

    public E get(int i) {
        C10374f.m32808a(i, this.f24706W);
        return this.f24705V[i];
    }

    public int size() {
        return this.f24706W;
    }
}
