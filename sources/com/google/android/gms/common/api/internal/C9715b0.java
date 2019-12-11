package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.internal.C9850c.C9853c;
import com.google.android.gms.common.internal.C9884l;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
final class C9715b0 extends C9747i0 {

    /* renamed from: U */
    private final Map<C9689f, C9710a0> f22768U;

    /* renamed from: V */
    final /* synthetic */ C9802y f22769V;

    public C9715b0(C9802y yVar, Map<C9689f, C9710a0> map) {
        this.f22769V = yVar;
        super(yVar, null);
        this.f22768U = map;
    }

    /* renamed from: a */
    public final void mo25116a() {
        C9884l lVar = new C9884l(this.f22769V.f22994d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C9689f fVar : this.f22768U.keySet()) {
            if (!fVar.mo25033h() || ((C9710a0) this.f22768U.get(fVar)).f22759c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = lVar.mo25405a(this.f22769V.f22993c, (C9689f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = lVar.mo25405a(this.f22769V.f22993c, (C9689f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f22769V.f22991a.mo25240a((C9791u0) new C9719c0(this, this.f22769V, new C9820b(i, null)));
            return;
        }
        if (this.f22769V.f23003m && this.f22769V.f23001k != null) {
            this.f22769V.f23001k.mo29224b();
        }
        for (C9689f fVar2 : this.f22768U.keySet()) {
            C9853c cVar = (C9853c) this.f22768U.get(fVar2);
            if (!fVar2.mo25033h() || lVar.mo25405a(this.f22769V.f22993c, fVar2) == 0) {
                fVar2.mo25026a(cVar);
            } else {
                this.f22769V.f22991a.mo25240a((C9791u0) new C9723d0(this, this.f22769V, cVar));
            }
        }
    }
}
