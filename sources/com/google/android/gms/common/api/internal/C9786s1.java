package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9810l;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
final class C9786s1 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9783r1 f22954U;

    /* renamed from: c */
    private final /* synthetic */ C9810l f22955c;

    C9786s1(C9783r1 r1Var, C9810l lVar) {
        this.f22954U = r1Var;
        this.f22955c = lVar;
    }

    public final void run() {
        try {
            BasePendingResult.f22740p.set(Boolean.valueOf(true));
            this.f22954U.f22953g.sendMessage(this.f22954U.f22953g.obtainMessage(0, this.f22954U.f22947a.mo25263a(this.f22955c)));
            BasePendingResult.f22740p.set(Boolean.valueOf(false));
            C9783r1.m30472b(this.f22955c);
            C9698f fVar = (C9698f) this.f22954U.f22952f.get();
            if (fVar != null) {
                fVar.mo25060a(this.f22954U);
            }
        } catch (RuntimeException e) {
            this.f22954U.f22953g.sendMessage(this.f22954U.f22953g.obtainMessage(1, e));
            BasePendingResult.f22740p.set(Boolean.valueOf(false));
            C9783r1.m30472b(this.f22955c);
            C9698f fVar2 = (C9698f) this.f22954U.f22952f.get();
            if (fVar2 != null) {
                fVar2.mo25060a(this.f22954U);
            }
        } catch (Throwable th) {
            BasePendingResult.f22740p.set(Boolean.valueOf(false));
            C9783r1.m30472b(this.f22955c);
            C9698f fVar3 = (C9698f) this.f22954U.f22952f.get();
            if (fVar3 != null) {
                fVar3.mo25060a(this.f22954U);
            }
            throw th;
        }
    }
}
