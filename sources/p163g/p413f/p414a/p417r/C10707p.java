package p163g.p413f.p414a.p417r;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.r.p */
/* compiled from: TargetTracker */
public final class C10707p implements C10696i {

    /* renamed from: c */
    private final Set<C10747i<?>> f25326c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo27663a(C10747i<?> iVar) {
        this.f25326c.add(iVar);
    }

    /* renamed from: b */
    public void mo27664b(C10747i<?> iVar) {
        this.f25326c.remove(iVar);
    }

    /* renamed from: c */
    public void mo27572c() {
        for (C10747i c : C10775k.m34027a((Collection<T>) this.f25326c)) {
            c.mo27572c();
        }
    }

    /* renamed from: e */
    public void mo27665e() {
        this.f25326c.clear();
    }

    /* renamed from: f */
    public List<C10747i<?>> mo27666f() {
        return C10775k.m34027a((Collection<T>) this.f25326c);
    }

    /* renamed from: a */
    public void mo27566a() {
        for (C10747i a : C10775k.m34027a((Collection<T>) this.f25326c)) {
            a.mo27566a();
        }
    }

    /* renamed from: b */
    public void mo27570b() {
        for (C10747i b : C10775k.m34027a((Collection<T>) this.f25326c)) {
            b.mo27570b();
        }
    }
}
