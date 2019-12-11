package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.internal.C9850c.C9853c;
import com.google.android.gms.common.internal.C9908u;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
final class C9710a0 implements C9853c {

    /* renamed from: a */
    private final WeakReference<C9802y> f22757a;

    /* renamed from: b */
    private final C9678a<?> f22758b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f22759c;

    public C9710a0(C9802y yVar, C9678a<?> aVar, boolean z) {
        this.f22757a = new WeakReference<>(yVar);
        this.f22758b = aVar;
        this.f22759c = z;
    }

    /* renamed from: a */
    public final void mo25096a(C9820b bVar) {
        C9802y yVar = (C9802y) this.f22757a.get();
        if (yVar != null) {
            C9908u.m30865b(Looper.myLooper() == yVar.f22991a.f22971n.mo25067f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            yVar.f22992b.lock();
            try {
                if (yVar.m30541a(0)) {
                    if (!bVar.mo25275g()) {
                        yVar.m30546b(bVar, this.f22758b, this.f22759c);
                    }
                    if (yVar.m30551d()) {
                        yVar.m30552e();
                    }
                    yVar.f22992b.unlock();
                }
            } finally {
                yVar.f22992b.unlock();
            }
        }
    }
}
