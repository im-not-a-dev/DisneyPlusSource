package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9810l;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
public final class C9751j0 implements C9785s0 {

    /* renamed from: a */
    private final C9788t0 f22861a;

    public C9751j0(C9788t0 t0Var) {
        this.f22861a = t0Var;
    }

    /* renamed from: a */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25194a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo25195a(C9820b bVar, C9678a<?> aVar, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo25196a() {
        return true;
    }

    /* renamed from: b */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25197b(T t) {
        this.f22861a.f22971n.f22873i.add(t);
        return t;
    }

    /* renamed from: b */
    public final void mo25199b(int i) {
    }

    /* renamed from: b */
    public final void mo25200b(Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo25201c() {
        for (C9689f a : this.f22861a.f22963f.values()) {
            a.mo25025a();
        }
        this.f22861a.f22971n.f22881q = Collections.emptySet();
    }

    /* renamed from: b */
    public final void mo25198b() {
        this.f22861a.mo25244h();
    }
}
