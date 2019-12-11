package com.google.android.gms.common.internal.p396a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p461d.C10990a;
import p163g.p449j.p450a.p451a.p457d.p461d.C10992c;

/* renamed from: com.google.android.gms.common.internal.a0.n */
public final class C9847n extends C10990a implements C9846m {
    C9847n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo25302a(C9844k kVar) throws RemoteException {
        Parcel j = mo28220j();
        C10992c.m34704a(j, (IInterface) kVar);
        mo28219b(1, j);
    }
}
