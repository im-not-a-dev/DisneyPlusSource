package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
class C10443m {

    /* renamed from: com.google.firebase.components.m$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C10445b {

        /* renamed from: a */
        private final C10429d<?> f24773a;

        /* renamed from: b */
        private final Set<C10445b> f24774b = new HashSet();

        /* renamed from: c */
        private final Set<C10445b> f24775c = new HashSet();

        C10445b(C10429d<?> dVar) {
            this.f24773a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27241a(C10445b bVar) {
            this.f24774b.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27243b(C10445b bVar) {
            this.f24775c.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo27244c(C10445b bVar) {
            this.f24775c.remove(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo27246d() {
            return this.f24775c.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10429d<?> mo27240a() {
            return this.f24773a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<C10445b> mo27242b() {
            return this.f24774b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo27245c() {
            return this.f24774b.isEmpty();
        }
    }

    /* renamed from: com.google.firebase.components.m$c */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C10446c {

        /* renamed from: a */
        private final Class<?> f24776a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f24777b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C10446c)) {
                return false;
            }
            C10446c cVar = (C10446c) obj;
            if (!cVar.f24776a.equals(this.f24776a) || cVar.f24777b != this.f24777b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f24776a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f24777b).hashCode();
        }

        private C10446c(Class<?> cls, boolean z) {
            this.f24776a = cls;
            this.f24777b = z;
        }
    }

    /* renamed from: a */
    static void m33001a(List<C10429d<?>> list) {
        Set<C10445b> b = m33002b(list);
        Set a = m33000a(b);
        int i = 0;
        while (!a.isEmpty()) {
            C10445b bVar = (C10445b) a.iterator().next();
            a.remove(bVar);
            i++;
            for (C10445b bVar2 : bVar.mo27242b()) {
                bVar2.mo27244c(bVar);
                if (bVar2.mo27246d()) {
                    a.add(bVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C10445b bVar3 : b) {
                if (!bVar3.mo27246d() && !bVar3.mo27245c()) {
                    arrayList.add(bVar3.mo27240a());
                }
            }
            throw new C10448o(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C10445b> m33002b(List<C10429d<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (C10429d dVar : list) {
            C10445b bVar = new C10445b(dVar);
            Iterator it = dVar.mo27222c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C10446c cVar = new C10446c(cls, !dVar.mo27226g());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(cVar);
                    if (set.isEmpty() || cVar.f24777b) {
                        set.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C10445b> it2 : hashMap.values()) {
            for (C10445b bVar2 : it2) {
                for (C10447n nVar : bVar2.mo27240a().mo27220a()) {
                    if (nVar.mo27250b()) {
                        Set<C10445b> set2 = (Set) hashMap.get(new C10446c(nVar.mo27249a(), nVar.mo27252d()));
                        if (set2 != null) {
                            for (C10445b bVar3 : set2) {
                                bVar2.mo27241a(bVar3);
                                bVar3.mo27243b(bVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C10445b> m33000a(Set<C10445b> set) {
        HashSet hashSet = new HashSet();
        for (C10445b bVar : set) {
            if (bVar.mo27246d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }
}
