package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.l5 */
final class C11204l5 implements C11154i5 {
    C11204l5() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo28577a(Object obj) {
        return (C11168j5) obj;
    }

    /* renamed from: b */
    public final Map<?, ?> mo28578b(Object obj) {
        return (C11168j5) obj;
    }

    /* renamed from: c */
    public final C11126g5<?, ?> mo28579c(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final Object mo28580d(Object obj) {
        return C11168j5.m35400d().mo28590c();
    }

    /* renamed from: e */
    public final Object mo28581e(Object obj) {
        ((C11168j5) obj).mo28589b();
        return obj;
    }

    /* renamed from: f */
    public final boolean mo28582f(Object obj) {
        return !((C11168j5) obj).mo28588a();
    }

    /* renamed from: a */
    public final Object mo28576a(Object obj, Object obj2) {
        C11168j5 j5Var = (C11168j5) obj;
        C11168j5 j5Var2 = (C11168j5) obj2;
        if (!j5Var2.isEmpty()) {
            if (!j5Var.mo28588a()) {
                j5Var = j5Var.mo28590c();
            }
            j5Var.mo28587a(j5Var2);
        }
        return j5Var;
    }

    /* renamed from: a */
    public final int mo28575a(int i, Object obj, Object obj2) {
        C11168j5 j5Var = (C11168j5) obj;
        if (j5Var.isEmpty()) {
            return 0;
        }
        Iterator it = j5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
