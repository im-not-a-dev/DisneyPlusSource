package com.google.firebase.components;

import com.google.android.gms.common.internal.C9908u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import p163g.p449j.p482b.p483e.C11521c;
import p163g.p449j.p482b.p483e.C11522d;
import p163g.p449j.p482b.p484f.C11523a;

/* renamed from: com.google.firebase.components.l */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C10442l extends C10426a {

    /* renamed from: e */
    private static final C11523a<Set<Object>> f24768e = C10441k.m32991a();

    /* renamed from: a */
    private final Map<C10429d<?>, C10452s<?>> f24769a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C10452s<?>> f24770b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C10452s<Set<?>>> f24771c = new HashMap();

    /* renamed from: d */
    private final C10451r f24772d;

    public C10442l(Executor executor, Iterable<C10438h> iterable, C10429d<?>... dVarArr) {
        this.f24772d = new C10451r(executor);
        ArrayList<C10429d> arrayList = new ArrayList<>();
        arrayList.add(C10429d.m32958a(this.f24772d, C10451r.class, C11522d.class, C11521c.class));
        for (C10438h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, dVarArr);
        C10443m.m33001a((List<C10429d<?>>) arrayList);
        for (C10429d dVar : arrayList) {
            this.f24769a.put(dVar, new C10452s(C10439i.m32989a(this, dVar)));
        }
        m32994a();
        m32995b();
    }

    /* renamed from: b */
    private void m32995b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f24769a.entrySet()) {
            C10429d dVar = (C10429d) entry.getKey();
            if (!dVar.mo27226g()) {
                C10452s sVar = (C10452s) entry.getValue();
                for (Class cls : dVar.mo27222c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(sVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.f24771c.put((Class) entry2.getKey(), new C10452s(C10440j.m32990a((Set) entry2.getValue())));
        }
    }

    /* renamed from: a */
    private void m32994a() {
        for (Entry entry : this.f24769a.entrySet()) {
            C10429d dVar = (C10429d) entry.getKey();
            if (dVar.mo27226g()) {
                C10452s sVar = (C10452s) entry.getValue();
                for (Class put : dVar.mo27222c()) {
                    this.f24770b.put(put, sVar);
                }
            }
        }
        m32996c();
    }

    /* renamed from: c */
    private void m32996c() {
        for (C10429d dVar : this.f24769a.keySet()) {
            Iterator it = dVar.mo27220a().iterator();
            while (true) {
                if (it.hasNext()) {
                    C10447n nVar = (C10447n) it.next();
                    if (nVar.mo27251c() && !this.f24770b.containsKey(nVar.mo27249a())) {
                        throw new C10453t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{dVar, nVar.mo27249a()}));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<com.google.firebase.components.s>, for r2v0, types: [java.util.Set<com.google.firebase.components.s>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.Set m32993a(java.util.Set<com.google.firebase.components.C10452s> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            com.google.firebase.components.s r1 = (com.google.firebase.components.C10452s) r1
            java.lang.Object r1 = r1.get()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C10442l.m32993a(java.util.Set):java.util.Set");
    }

    /* renamed from: a */
    public <T> C11523a<T> mo27233a(Class<T> cls) {
        C9908u.m30854a(cls, (Object) "Null interface requested.");
        return (C11523a) this.f24770b.get(cls);
    }

    /* renamed from: a */
    public void mo27239a(boolean z) {
        for (Entry entry : this.f24769a.entrySet()) {
            C10429d dVar = (C10429d) entry.getKey();
            C10452s sVar = (C10452s) entry.getValue();
            if (dVar.mo27224e() || (dVar.mo27225f() && z)) {
                sVar.get();
            }
        }
        this.f24772d.mo27257a();
    }

    /* renamed from: b */
    public <T> C11523a<Set<T>> mo27234b(Class<T> cls) {
        C10452s sVar = (C10452s) this.f24771c.get(cls);
        if (sVar != null) {
            return sVar;
        }
        return f24768e;
    }
}
