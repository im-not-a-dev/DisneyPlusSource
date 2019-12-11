package com.google.firebase.components;

import java.util.Set;
import p163g.p449j.p482b.p484f.C11523a;

/* renamed from: com.google.firebase.components.a */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
abstract class C10426a implements C10432e {
    C10426a() {
    }

    /* renamed from: c */
    public <T> Set<T> mo27218c(Class<T> cls) {
        return (Set) mo27234b(cls).get();
    }

    public <T> T get(Class<T> cls) {
        C11523a a = mo27233a(cls);
        if (a == null) {
            return null;
        }
        return a.get();
    }
}
