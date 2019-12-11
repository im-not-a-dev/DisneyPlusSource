package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10954a.C10955a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C9980l extends C10998a implements C9979k {
    C9980l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C10954a mo25492a(C10954a aVar, String str, int i, C10954a aVar2) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        j.writeInt(i);
        C11000c.m34714a(j, (IInterface) aVar2);
        Parcel a = mo28225a(2, j);
        C10954a a2 = C10955a.m34642a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C10954a mo25493b(C10954a aVar, String str, int i, C10954a aVar2) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        j.writeInt(i);
        C11000c.m34714a(j, (IInterface) aVar2);
        Parcel a = mo28225a(3, j);
        C10954a a2 = C10955a.m34642a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
