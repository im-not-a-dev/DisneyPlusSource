package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.internal.C9717b2;
import com.google.android.gms.common.internal.C9908u;
import java.util.ArrayList;
import p096e.p113e.C3926a;

/* renamed from: com.google.android.gms.common.api.c */
public class C9693c extends Exception {

    /* renamed from: c */
    private final C3926a<C9717b2<?>, C9820b> f22708c;

    public C9693c(C3926a<C9717b2<?>, C9820b> aVar) {
        this.f22708c = aVar;
    }

    /* renamed from: a */
    public C9820b mo25042a(C9695e<? extends C9682d> eVar) {
        C9717b2 g = eVar.mo25055g();
        C9908u.m30861a(this.f22708c.get(g) != null, (Object) "The given API was not part of the availability request.");
        return (C9820b) this.f22708c.get(g);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C9717b2 b2Var : this.f22708c.keySet()) {
            C9820b bVar = (C9820b) this.f22708c.get(b2Var);
            if (bVar.mo25275g()) {
                z = false;
            }
            String a = b2Var.mo25118a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    /* renamed from: a */
    public final C3926a<C9717b2<?>, C9820b> mo25043a() {
        return this.f22708c;
    }
}
