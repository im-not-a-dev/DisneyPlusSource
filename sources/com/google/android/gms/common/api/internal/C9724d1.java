package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.d1 */
final class C9724d1 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9729c f22781U;

    /* renamed from: c */
    private final /* synthetic */ C9820b f22782c;

    C9724d1(C9729c cVar, C9820b bVar) {
        this.f22781U = cVar;
        this.f22782c = bVar;
    }

    public final void run() {
        if (this.f22782c.mo25275g()) {
            this.f22781U.f22824e = true;
            if (this.f22781U.f22820a.mo25035l()) {
                this.f22781U.m30256a();
                return;
            }
            try {
                this.f22781U.f22820a.mo25028a(null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C9727a) C9726e.this.f22799b0.get(this.f22781U.f22821b)).mo25078a(new C9820b(10));
            }
        } else {
            ((C9727a) C9726e.this.f22799b0.get(this.f22781U.f22821b)).mo25078a(this.f22782c);
        }
    }
}
