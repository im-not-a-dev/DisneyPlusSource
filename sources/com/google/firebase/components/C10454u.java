package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p163g.p449j.p482b.p483e.C11521c;
import p163g.p449j.p482b.p484f.C11523a;

/* renamed from: com.google.firebase.components.u */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final class C10454u extends C10426a {

    /* renamed from: a */
    private final Set<Class<?>> f24789a;

    /* renamed from: b */
    private final Set<Class<?>> f24790b;

    /* renamed from: c */
    private final Set<Class<?>> f24791c;

    /* renamed from: d */
    private final Set<Class<?>> f24792d;

    /* renamed from: e */
    private final Set<Class<?>> f24793e;

    /* renamed from: f */
    private final C10432e f24794f;

    /* renamed from: com.google.firebase.components.u$a */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C10455a implements C11521c {
        public C10455a(Set<Class<?>> set, C11521c cVar) {
        }
    }

    C10454u(C10429d<?> dVar, C10432e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C10447n nVar : dVar.mo27220a()) {
            if (nVar.mo27250b()) {
                if (nVar.mo27252d()) {
                    hashSet3.add(nVar.mo27249a());
                } else {
                    hashSet.add(nVar.mo27249a());
                }
            } else if (nVar.mo27252d()) {
                hashSet4.add(nVar.mo27249a());
            } else {
                hashSet2.add(nVar.mo27249a());
            }
        }
        if (!dVar.mo27223d().isEmpty()) {
            hashSet.add(C11521c.class);
        }
        this.f24789a = Collections.unmodifiableSet(hashSet);
        this.f24790b = Collections.unmodifiableSet(hashSet2);
        this.f24791c = Collections.unmodifiableSet(hashSet3);
        this.f24792d = Collections.unmodifiableSet(hashSet4);
        this.f24793e = dVar.mo27223d();
        this.f24794f = eVar;
    }

    /* renamed from: a */
    public <T> C11523a<T> mo27233a(Class<T> cls) {
        if (this.f24790b.contains(cls)) {
            return this.f24794f.mo27233a(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C11523a<Set<T>> mo27234b(Class<T> cls) {
        if (this.f24792d.contains(cls)) {
            return this.f24794f.mo27234b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> Set<T> mo27218c(Class<T> cls) {
        if (this.f24791c.contains(cls)) {
            return this.f24794f.mo27218c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> T get(Class<T> cls) {
        if (this.f24789a.contains(cls)) {
            T t = this.f24794f.get(cls);
            if (!cls.equals(C11521c.class)) {
                return t;
            }
            return new C10455a(this.f24793e, (C11521c) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}
