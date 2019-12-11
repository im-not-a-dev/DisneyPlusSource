package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.internal.C9758l;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p096e.p150n.p152b.C4244a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C9658g extends C4244a<Void> implements C9758l {

    /* renamed from: o */
    private Semaphore f22677o = new Semaphore(0);

    /* renamed from: p */
    private Set<C9698f> f22678p;

    public C9658g(Context context, Set<C9698f> set) {
        super(context);
        this.f22678p = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void mo14950t() {
        int i = 0;
        for (C9698f a : this.f22678p) {
            if (a.mo25061a((C9758l) this)) {
                i++;
            }
        }
        try {
            this.f22677o.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo14970l() {
        this.f22677o.drainPermits();
        mo14965e();
    }

    public final void onComplete() {
        this.f22677o.release();
    }
}
