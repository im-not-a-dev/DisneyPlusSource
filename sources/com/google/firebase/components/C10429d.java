package com.google.firebase.components;

import com.google.android.gms.common.internal.C9908u;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class C10429d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f24750a;

    /* renamed from: b */
    private final Set<C10447n> f24751b;

    /* renamed from: c */
    private final int f24752c;

    /* renamed from: d */
    private final int f24753d;

    /* renamed from: e */
    private final C10437g<T> f24754e;

    /* renamed from: f */
    private final Set<Class<?>> f24755f;

    /* renamed from: com.google.firebase.components.d$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class C10431b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f24756a;

        /* renamed from: b */
        private final Set<C10447n> f24757b;

        /* renamed from: c */
        private int f24758c;

        /* renamed from: d */
        private int f24759d;

        /* renamed from: e */
        private C10437g<T> f24760e;

        /* renamed from: f */
        private Set<Class<?>> f24761f;

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C10431b<T> m32972d() {
            this.f24759d = 1;
            return this;
        }

        /* renamed from: b */
        public C10429d<T> mo27231b() {
            C9908u.m30865b(this.f24760e != null, "Missing required property: factory.");
            C10429d dVar = new C10429d(new HashSet(this.f24756a), new HashSet(this.f24757b), this.f24758c, this.f24759d, this.f24760e, this.f24761f);
            return dVar;
        }

        /* renamed from: c */
        public C10431b<T> mo27232c() {
            m32969a(2);
            return this;
        }

        @SafeVarargs
        private C10431b(Class<T> cls, Class<? super T>... clsArr) {
            this.f24756a = new HashSet();
            this.f24757b = new HashSet();
            this.f24758c = 0;
            this.f24759d = 0;
            this.f24761f = new HashSet();
            String str = "Null interface";
            C9908u.m30854a(cls, (Object) str);
            this.f24756a.add(cls);
            for (Class<? super T> a : clsArr) {
                C9908u.m30854a(a, (Object) str);
            }
            Collections.addAll(this.f24756a, clsArr);
        }

        /* renamed from: a */
        public C10431b<T> mo27230a(C10447n nVar) {
            C9908u.m30854a(nVar, (Object) "Null dependency");
            m32971a(nVar.mo27249a());
            this.f24757b.add(nVar);
            return this;
        }

        /* renamed from: a */
        public C10431b<T> mo27228a() {
            m32969a(1);
            return this;
        }

        /* renamed from: a */
        private C10431b<T> m32969a(int i) {
            C9908u.m30865b(this.f24758c == 0, "Instantiation type has already been set.");
            this.f24758c = i;
            return this;
        }

        /* renamed from: a */
        private void m32971a(Class<?> cls) {
            C9908u.m30861a(!this.f24756a.contains(cls), (Object) "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: a */
        public C10431b<T> mo27229a(C10437g<T> gVar) {
            C9908u.m30854a(gVar, (Object) "Null factory");
            this.f24760e = gVar;
            return this;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m32959a(Object obj, C10432e eVar) {
        return obj;
    }

    /* renamed from: b */
    static /* synthetic */ Object m32961b(Object obj, C10432e eVar) {
        return obj;
    }

    /* renamed from: a */
    public Set<C10447n> mo27220a() {
        return this.f24751b;
    }

    /* renamed from: b */
    public C10437g<T> mo27221b() {
        return this.f24754e;
    }

    /* renamed from: c */
    public Set<Class<? super T>> mo27222c() {
        return this.f24750a;
    }

    /* renamed from: d */
    public Set<Class<?>> mo27223d() {
        return this.f24755f;
    }

    /* renamed from: e */
    public boolean mo27224e() {
        return this.f24752c == 1;
    }

    /* renamed from: f */
    public boolean mo27225f() {
        return this.f24752c == 2;
    }

    /* renamed from: g */
    public boolean mo27226g() {
        return this.f24753d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f24750a.toArray()));
        sb.append(">{");
        sb.append(this.f24752c);
        sb.append(", type=");
        sb.append(this.f24753d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f24751b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    private C10429d(Set<Class<? super T>> set, Set<C10447n> set2, int i, int i2, C10437g<T> gVar, Set<Class<?>> set3) {
        this.f24750a = Collections.unmodifiableSet(set);
        this.f24751b = Collections.unmodifiableSet(set2);
        this.f24752c = i;
        this.f24753d = i2;
        this.f24754e = gVar;
        this.f24755f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C10431b<T> m32955a(Class<T> cls) {
        return new C10431b<>(cls, new Class[0]);
    }

    /* renamed from: b */
    public static <T> C10431b<T> m32960b(Class<T> cls) {
        C10431b<T> a = m32955a(cls);
        a.m32972d();
        return a;
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C10431b<T> m32956a(Class<T> cls, Class<? super T>... clsArr) {
        return new C10431b<>(cls, clsArr);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C10429d<T> m32958a(T t, Class<T> cls, Class<? super T>... clsArr) {
        C10431b a = m32956a(cls, clsArr);
        a.mo27229a(C10427b.m32951a((Object) t));
        return a.mo27231b();
    }

    /* renamed from: a */
    public static <T> C10429d<T> m32957a(T t, Class<T> cls) {
        C10431b b = m32960b(cls);
        b.mo27229a(C10428c.m32953a((Object) t));
        return b.mo27231b();
    }
}
