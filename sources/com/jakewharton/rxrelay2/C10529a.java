package com.jakewharton.rxrelay2;

import p520io.reactivex.functions.C11952h;

/* renamed from: com.jakewharton.rxrelay2.a */
/* compiled from: AppendOnlyLinkedArrayList */
class C10529a<T> {

    /* renamed from: a */
    private final int f24952a;

    /* renamed from: b */
    private final Object[] f24953b;

    /* renamed from: c */
    private Object[] f24954c = this.f24953b;

    /* renamed from: d */
    private int f24955d;

    /* renamed from: com.jakewharton.rxrelay2.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C10530a<T> extends C11952h<T> {
        boolean test(T t);
    }

    C10529a(int i) {
        this.f24952a = i;
        this.f24953b = new Object[(i + 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27415a(T t) {
        int i = this.f24952a;
        int i2 = this.f24955d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f24954c[i] = objArr;
            this.f24954c = objArr;
            i2 = 0;
        }
        this.f24954c[i2] = t;
        this.f24955d = i2 + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27414a(C10530a<? super T> aVar) {
        int i = this.f24952a;
        for (Object[] objArr = this.f24953b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null || aVar.test(objArr2)) {
                    break;
                }
            }
        }
    }
}
