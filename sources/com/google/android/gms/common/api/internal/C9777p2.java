package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9693c;
import java.util.Collections;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p467f.C11428c;
import p163g.p449j.p450a.p451a.p467f.C11435h;

/* renamed from: com.google.android.gms.common.api.internal.p2 */
final class C9777p2 implements C11428c<Map<C9717b2<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C9769n2 f22940a;

    private C9777p2(C9769n2 n2Var) {
        this.f22940a = n2Var;
    }

    /* renamed from: a */
    public final void mo25228a(C11435h<Map<C9717b2<?>, String>> hVar) {
        this.f22940a.f22918f.lock();
        try {
            if (this.f22940a.f22926n) {
                if (hVar.mo29268e()) {
                    this.f22940a.f22927o = new C3926a(this.f22940a.f22913a.size());
                    for (C9765m2 g : this.f22940a.f22913a.values()) {
                        this.f22940a.f22927o.put(g.mo25055g(), C9820b.f23019X);
                    }
                } else if (hVar.mo29258a() instanceof C9693c) {
                    C9693c cVar = (C9693c) hVar.mo29258a();
                    if (this.f22940a.f22924l) {
                        this.f22940a.f22927o = new C3926a(this.f22940a.f22913a.size());
                        for (C9765m2 m2Var : this.f22940a.f22913a.values()) {
                            C9717b2 g2 = m2Var.mo25055g();
                            C9820b a = cVar.mo25042a(m2Var);
                            if (this.f22940a.m30413a(m2Var, a)) {
                                this.f22940a.f22927o.put(g2, new C9820b(16));
                            } else {
                                this.f22940a.f22927o.put(g2, a);
                            }
                        }
                    } else {
                        this.f22940a.f22927o = cVar.mo25043a();
                    }
                    this.f22940a.f22930r = this.f22940a.m30431k();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", hVar.mo29258a());
                    this.f22940a.f22927o = Collections.emptyMap();
                    this.f22940a.f22930r = new C9820b(8);
                }
                if (this.f22940a.f22928p != null) {
                    this.f22940a.f22927o.putAll(this.f22940a.f22928p);
                    this.f22940a.f22930r = this.f22940a.m30431k();
                }
                if (this.f22940a.f22930r == null) {
                    this.f22940a.m30426i();
                    this.f22940a.m30428j();
                } else {
                    this.f22940a.f22926n = false;
                    this.f22940a.f22917e.mo25191a(this.f22940a.f22930r);
                }
                this.f22940a.f22921i.signalAll();
                this.f22940a.f22918f.unlock();
            }
        } finally {
            this.f22940a.f22918f.unlock();
        }
    }
}
