package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9693c;
import com.google.android.gms.common.api.C9695e;
import java.util.Map;
import java.util.Set;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.api.internal.d2 */
public final class C9725d2 {

    /* renamed from: a */
    private final C3926a<C9717b2<?>, C9820b> f22783a = new C3926a<>();

    /* renamed from: b */
    private final C3926a<C9717b2<?>, String> f22784b = new C3926a<>();

    /* renamed from: c */
    private final C11436i<Map<C9717b2<?>, String>> f22785c = new C11436i<>();

    /* renamed from: d */
    private int f22786d;

    /* renamed from: e */
    private boolean f22787e = false;

    public C9725d2(Iterable<? extends C9695e<?>> iterable) {
        for (C9695e g : iterable) {
            this.f22783a.put(g.mo25055g(), null);
        }
        this.f22786d = this.f22783a.keySet().size();
    }

    /* renamed from: a */
    public final C11435h<Map<C9717b2<?>, String>> mo25130a() {
        return this.f22785c.mo29271a();
    }

    /* renamed from: b */
    public final Set<C9717b2<?>> mo25132b() {
        return this.f22783a.keySet();
    }

    /* renamed from: a */
    public final void mo25131a(C9717b2<?> b2Var, C9820b bVar, String str) {
        this.f22783a.put(b2Var, bVar);
        this.f22784b.put(b2Var, str);
        this.f22786d--;
        if (!bVar.mo25275g()) {
            this.f22787e = true;
        }
        if (this.f22786d == 0) {
            if (this.f22787e) {
                this.f22785c.mo29272a((Exception) new C9693c(this.f22783a));
                return;
            }
            this.f22785c.mo29273a(this.f22784b);
        }
    }
}
