package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8111g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.s */
/* compiled from: Jobs */
final class C8254s {

    /* renamed from: a */
    private final Map<C8111g, C8240l<?>> f17691a = new HashMap();

    /* renamed from: b */
    private final Map<C8111g, C8240l<?>> f17692b = new HashMap();

    C8254s() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8240l<?> mo21432a(C8111g gVar, boolean z) {
        return (C8240l) m23986a(z).get(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21434b(C8111g gVar, C8240l<?> lVar) {
        Map a = m23986a(lVar.mo21391f());
        if (lVar.equals(a.get(gVar))) {
            a.remove(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21433a(C8111g gVar, C8240l<?> lVar) {
        m23986a(lVar.mo21391f()).put(gVar, lVar);
    }

    /* renamed from: a */
    private Map<C8111g, C8240l<?>> m23986a(boolean z) {
        return z ? this.f17692b : this.f17691a;
    }
}
