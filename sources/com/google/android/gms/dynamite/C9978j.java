package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10954a.C10955a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C9978j extends C10998a implements C9977i {
    C9978j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final C10954a mo25488a(C10954a aVar, String str, int i) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        j.writeInt(i);
        Parcel a = mo28225a(2, j);
        C10954a a2 = C10955a.m34642a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo25489b(C10954a aVar, String str, boolean z) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        C11000c.m34716a(j, z);
        Parcel a = mo28225a(3, j);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: h */
    public final int mo25491h() throws RemoteException {
        Parcel a = mo28225a(6, mo28227j());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo25487a(C10954a aVar, String str, boolean z) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        C11000c.m34716a(j, z);
        Parcel a = mo28225a(5, j);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C10954a mo25490b(C10954a aVar, String str, int i) throws RemoteException {
        Parcel j = mo28227j();
        C11000c.m34714a(j, (IInterface) aVar);
        j.writeString(str);
        j.writeInt(i);
        Parcel a = mo28225a(4, j);
        C10954a a2 = C10955a.m34642a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
