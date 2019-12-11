package com.bamnet.iap.p035c.p037d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bamnet.iap.c.d.f */
/* compiled from: Inventory */
public class C1672f {

    /* renamed from: a */
    Map<String, C1675i> f5828a = new HashMap();

    /* renamed from: b */
    Map<String, C1673g> f5829b = new HashMap();

    C1672f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<String> mo7327a(String str) {
        ArrayList arrayList = new ArrayList();
        for (C1673g gVar : this.f5829b.values()) {
            if (gVar.mo7332b().equals(str)) {
                arrayList.add(gVar.mo7336f());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C1673g> mo7330b() {
        return new ArrayList(this.f5829b.values());
    }

    /* renamed from: a */
    public List<C1675i> mo7326a() {
        return new ArrayList(this.f5828a.values());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7329a(C1675i iVar) {
        this.f5828a.put(iVar.mo7344f(), iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7328a(C1673g gVar) {
        this.f5829b.put(gVar.mo7336f(), gVar);
    }
}
