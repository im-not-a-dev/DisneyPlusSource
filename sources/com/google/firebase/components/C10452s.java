package com.google.firebase.components;

import p163g.p449j.p482b.p484f.C11523a;

/* renamed from: com.google.firebase.components.s */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C10452s<T> implements C11523a<T> {

    /* renamed from: c */
    private static final Object f24786c = new Object();

    /* renamed from: a */
    private volatile Object f24787a = f24786c;

    /* renamed from: b */
    private volatile C11523a<T> f24788b;

    public C10452s(C11523a<T> aVar) {
        this.f24788b = aVar;
    }

    public T get() {
        T t = this.f24787a;
        if (t == f24786c) {
            synchronized (this) {
                t = this.f24787a;
                if (t == f24786c) {
                    t = this.f24788b.get();
                    this.f24787a = t;
                    this.f24788b = null;
                }
            }
        }
        return t;
    }
}
