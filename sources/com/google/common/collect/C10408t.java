package com.google.common.collect;

import com.google.common.base.C10374f;

/* renamed from: com.google.common.collect.t */
/* compiled from: SingletonImmutableSet */
final class C10408t<E> extends ImmutableSet<E> {

    /* renamed from: V */
    final transient E f24727V;

    /* renamed from: W */
    private transient int f24728W;

    C10408t(E e) {
        C10374f.m32809a(e);
        this.f24727V = e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27117a(Object[] objArr, int i) {
        objArr[i] = this.f24727V;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.f24727V.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ImmutableList<E> mo27140f() {
        return ImmutableList.m32826a(this.f24727V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo27141g() {
        return this.f24728W != 0;
    }

    public final int hashCode() {
        int i = this.f24728W;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f24727V.hashCode();
        this.f24728W = hashCode;
        return hashCode;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.f24727V.toString());
        sb.append(']');
        return sb.toString();
    }

    public C10410v<E> iterator() {
        return C10389i.m32871a(this.f24727V);
    }

    C10408t(E e, int i) {
        this.f24727V = e;
        this.f24728W = i;
    }
}
