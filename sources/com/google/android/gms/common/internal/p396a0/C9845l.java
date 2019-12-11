package com.google.android.gms.common.internal.p396a0;

import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p461d.C10991b;

/* renamed from: com.google.android.gms.common.internal.a0.l */
public abstract class C9845l extends C10991b implements C9844k {
    public C9845l() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25301a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo25300f(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
