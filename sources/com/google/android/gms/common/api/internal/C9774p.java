package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9693c;
import java.util.Collections;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p467f.C11428c;
import p163g.p449j.p450a.p451a.p467f.C11435h;

/* renamed from: com.google.android.gms.common.api.internal.p */
final class C9774p implements C11428c<Map<C9717b2<?>, String>> {

    /* renamed from: a */
    private C9758l f22932a;

    /* renamed from: b */
    private final /* synthetic */ C9769n2 f22933b;

    C9774p(C9769n2 n2Var, C9758l lVar) {
        this.f22933b = n2Var;
        this.f22932a = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25227a() {
        this.f22932a.onComplete();
    }

    /* renamed from: a */
    public final void mo25228a(C11435h<Map<C9717b2<?>, String>> hVar) {
        this.f22933b.f22918f.lock();
        try {
            if (!this.f22933b.f22926n) {
                this.f22932a.onComplete();
                return;
            }
            if (hVar.mo29268e()) {
                this.f22933b.f22928p = new C3926a(this.f22933b.f22914b.size());
                for (C9765m2 g : this.f22933b.f22914b.values()) {
                    this.f22933b.f22928p.put(g.mo25055g(), C9820b.f23019X);
                }
            } else if (hVar.mo29258a() instanceof C9693c) {
                C9693c cVar = (C9693c) hVar.mo29258a();
                if (this.f22933b.f22924l) {
                    this.f22933b.f22928p = new C3926a(this.f22933b.f22914b.size());
                    for (C9765m2 m2Var : this.f22933b.f22914b.values()) {
                        C9717b2 g2 = m2Var.mo25055g();
                        C9820b a = cVar.mo25042a(m2Var);
                        if (this.f22933b.m30413a(m2Var, a)) {
                            this.f22933b.f22928p.put(g2, new C9820b(16));
                        } else {
                            this.f22933b.f22928p.put(g2, a);
                        }
                    }
                } else {
                    this.f22933b.f22928p = cVar.mo25043a();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", hVar.mo29258a());
                this.f22933b.f22928p = Collections.emptyMap();
            }
            if (this.f22933b.mo25181c()) {
                this.f22933b.f22927o.putAll(this.f22933b.f22928p);
                if (this.f22933b.m30431k() == null) {
                    this.f22933b.m30426i();
                    this.f22933b.m30428j();
                    this.f22933b.f22921i.signalAll();
                }
            }
            this.f22932a.onComplete();
            this.f22933b.f22918f.unlock();
        } finally {
            this.f22933b.f22918f.unlock();
        }
    }
}
