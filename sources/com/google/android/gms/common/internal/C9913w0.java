package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.C9821b0;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.common.internal.w0 */
public final class C9913w0 extends C10998a implements C9909u0 {
    C9913w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo25437a(C9821b0 b0Var, C10954a aVar) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34715a(j, (Parcelable) b0Var);
        C11000c.m34714a(j, (IInterface) aVar);
        Parcel a = mo28225a(5, j);
        boolean a2 = C11000c.m34717a(a);
        a.recycle();
        return a2;
    }
}
