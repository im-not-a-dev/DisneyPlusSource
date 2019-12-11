package p163g.p413f.p414a.p417r;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.r.a */
/* compiled from: ActivityFragmentLifecycle */
class C10686a implements C10695h {

    /* renamed from: a */
    private final Set<C10696i> f25291a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f25292b;

    /* renamed from: c */
    private boolean f25293c;

    C10686a() {
    }

    /* renamed from: a */
    public void mo27622a(C10696i iVar) {
        this.f25291a.add(iVar);
        if (this.f25293c) {
            iVar.mo27570b();
        } else if (this.f25292b) {
            iVar.mo27566a();
        } else {
            iVar.mo27572c();
        }
    }

    /* renamed from: b */
    public void mo27624b(C10696i iVar) {
        this.f25291a.remove(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo27625c() {
        this.f25292b = false;
        for (C10696i c : C10775k.m34027a((Collection<T>) this.f25291a)) {
            c.mo27572c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27623b() {
        this.f25292b = true;
        for (C10696i a : C10775k.m34027a((Collection<T>) this.f25291a)) {
            a.mo27566a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27621a() {
        this.f25293c = true;
        for (C10696i b : C10775k.m34027a((Collection<T>) this.f25291a)) {
            b.mo27570b();
        }
    }
}
