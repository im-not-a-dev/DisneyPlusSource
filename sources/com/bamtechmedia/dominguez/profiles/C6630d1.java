package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bamtechmedia.dominguez.profiles.d1 */
/* compiled from: ProfilesMemoryCacheImpl.kt */
public final class C6630d1 implements C6627c1 {

    /* renamed from: a */
    private final C6725m1 f14957a;

    public C6630d1(C6725m1 m1Var) {
        this.f14957a = m1Var;
    }

    /* renamed from: a */
    public boolean mo19286a() {
        C6626c0 b = mo19287b();
        if (b != null) {
            return b.mo19351O();
        }
        return false;
    }

    /* renamed from: b */
    public C6626c0 mo19287b() {
        C6726a aVar = (C6726a) this.f14957a.getCurrentState();
        Object obj = null;
        if (aVar == null) {
            return null;
        }
        List d = aVar.mo19449d();
        if (d == null) {
            return null;
        }
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C6626c0) next).mo19353Q()) {
                obj = next;
                break;
            }
        }
        return (C6626c0) obj;
    }

    /* renamed from: c */
    public List<C6653e> mo19288c() {
        C6726a aVar = (C6726a) this.f14957a.getCurrentState();
        if (aVar != null) {
            Map a = aVar.mo19446a();
            if (a != null) {
                Collection values = a.values();
                if (values != null) {
                    List<C6653e> q = C13199w.m40606q(values);
                    if (q != null) {
                        return q;
                    }
                }
            }
        }
        return C13185o.m40513a();
    }

    public void clear() {
        this.f14957a.mo19444z();
    }

    /* renamed from: d */
    public boolean mo19290d() {
        C6726a aVar = (C6726a) this.f14957a.getCurrentState();
        if (aVar != null) {
            List d = aVar.mo19449d();
            if (d != null && d.size() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C6653e mo19285a(String str) {
        C6726a aVar = (C6726a) this.f14957a.getCurrentState();
        if (aVar != null) {
            Map a = aVar.mo19446a();
            if (a != null) {
                return (C6653e) a.get(str);
            }
        }
        return null;
    }
}
