package com.bamtechmedia.dominguez.purchase;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2436p.C2437a;
import com.bamtechmedia.dominguez.purchase.p273a0.C7028b.C7030b;
import kotlin.C12898l;

/* renamed from: com.bamtechmedia.dominguez.purchase.z */
/* compiled from: PurchaseAnalytics.kt */
public final class C7112z {

    /* renamed from: a */
    private final C2348e f15739a;

    /* renamed from: b */
    private final C2436p f15740b;

    public C7112z(C2348e eVar, C2436p pVar) {
        this.f15739a = eVar;
        this.f15740b = pVar;
    }

    /* renamed from: c */
    private final String m21508c(C7030b bVar) {
        int i = C7111y.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            return "Complete";
        }
        if (i == 2) {
            return "Restart";
        }
        throw new C12898l();
    }

    /* renamed from: a */
    public final void mo19903a(C7030b bVar) {
        C2348e eVar = this.f15739a;
        StringBuilder sb = new StringBuilder();
        sb.append(m21508c(bVar));
        String str = " Subscription : Continue Click";
        sb.append(str);
        C2349a.m8853a(eVar, sb.toString(), null, false, 6, null);
        C2436p pVar = this.f15740b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m21508c(bVar));
        sb2.append(str);
        C2437a.m8999a(pVar, sb2.toString(), null, 2, null);
    }

    /* renamed from: b */
    public final void mo19904b(C7030b bVar) {
        C2348e eVar = this.f15739a;
        StringBuilder sb = new StringBuilder();
        sb.append(m21508c(bVar));
        String str = " Subscription : Log Out Click";
        sb.append(str);
        C2349a.m8853a(eVar, sb.toString(), null, false, 6, null);
        C2436p pVar = this.f15740b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m21508c(bVar));
        sb2.append(str);
        C2437a.m8999a(pVar, sb2.toString(), null, 2, null);
    }
}
