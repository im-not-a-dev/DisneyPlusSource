package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9718c;
import com.google.android.gms.common.api.internal.C9726e.C9727a;

/* renamed from: com.google.android.gms.common.api.internal.z1 */
public final class C9807z1<A extends C9718c<? extends C9810l, C9680b>> extends C9771o0 {

    /* renamed from: a */
    private final A f23016a;

    public C9807z1(int i, A a) {
        super(i);
        this.f23016a = a;
    }

    /* renamed from: a */
    public final void mo25224a(C9727a<?> aVar) throws DeadObjectException {
        try {
            this.f23016a.mo25122b(aVar.mo25153f());
        } catch (RuntimeException e) {
            mo25225a(e);
        }
    }

    /* renamed from: a */
    public final void mo25223a(Status status) {
        this.f23016a.mo25124c(status);
    }

    /* renamed from: a */
    public final void mo25225a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f23016a.mo25124c(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo25098a(C9778q qVar, boolean z) {
        qVar.mo25231a((BasePendingResult<? extends C9810l>) this.f23016a, z);
    }
}
