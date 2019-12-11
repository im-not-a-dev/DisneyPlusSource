package com.google.android.gms.common.internal.p396a0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9722d;

/* renamed from: com.google.android.gms.common.internal.a0.g */
final class C9840g extends C9835b {

    /* renamed from: a */
    private final C9722d<Status> f23049a;

    public C9840g(C9722d<Status> dVar) {
        this.f23049a = dVar;
    }

    /* renamed from: f */
    public final void mo25300f(int i) throws RemoteException {
        this.f23049a.mo25121a(new Status(i));
    }
}
