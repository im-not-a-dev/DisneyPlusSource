package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10954a.C10955a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;

/* renamed from: com.google.android.gms.common.internal.t0 */
public final class C9907t0 extends C10998a implements C9900r0 {
    C9907t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: e */
    public final int mo25433e() throws RemoteException {
        Parcel a = mo28225a(2, mo28227j());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: g */
    public final C10954a mo25434g() throws RemoteException {
        Parcel a = mo28225a(1, mo28227j());
        C10954a a2 = C10955a.m34642a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
