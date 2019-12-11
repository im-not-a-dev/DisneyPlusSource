package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.api.internal.g2 */
public final class C9740g2 implements C9700b, C9701c {

    /* renamed from: a */
    public final C9678a<?> f22839a;

    /* renamed from: b */
    private final boolean f22840b;

    /* renamed from: c */
    private C9744h2 f22841c;

    public C9740g2(C9678a<?> aVar, boolean z) {
        this.f22839a = aVar;
        this.f22840b = z;
    }

    /* renamed from: a */
    public final void mo25078a(C9820b bVar) {
        m30280a();
        this.f22841c.mo25147a(bVar, this.f22839a, this.f22840b);
    }

    /* renamed from: b */
    public final void mo25077b(Bundle bundle) {
        m30280a();
        this.f22841c.mo25077b(bundle);
    }

    /* renamed from: a */
    public final void mo25174a(C9744h2 h2Var) {
        this.f22841c = h2Var;
    }

    /* renamed from: b */
    public final void mo25076b(int i) {
        m30280a();
        this.f22841c.mo25076b(i);
    }

    /* renamed from: a */
    private final void m30280a() {
        C9908u.m30854a(this.f22841c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
