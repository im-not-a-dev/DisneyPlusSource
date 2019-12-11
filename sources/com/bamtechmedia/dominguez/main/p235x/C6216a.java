package com.bamtechmedia.dominguez.main.p235x;

import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.main.x.a */
/* compiled from: AccountStateHolderExt.kt */
public final class C6216a {
    /* renamed from: a */
    public static final void m19703a(C6234e eVar, C6219d dVar) {
        C6219d a = eVar.mo18827a();
        if (a == null || a.mo18812a(dVar)) {
            eVar.mo18829a(dVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not changing account state from '");
        sb.append(eVar.mo18827a());
        sb.append("' to '");
        sb.append(dVar);
        sb.append("' since it is not allowed");
        Timber.m44522a(sb.toString(), new Object[0]);
    }
}
