package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10999b;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.common.internal.s0 */
public abstract class C9903s0 extends C10999b implements C9900r0 {
    public C9903s0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C9900r0 m30843a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C9900r0) {
            return (C9900r0) queryLocalInterface;
        }
        return new C9907t0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25414a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C10954a g = mo25434g();
            parcel2.writeNoException();
            C11000c.m34714a(parcel2, (IInterface) g);
        } else if (i != 2) {
            return false;
        } else {
            int e = mo25433e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
