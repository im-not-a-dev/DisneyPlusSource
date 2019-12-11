package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.s0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10498s0 implements C10492p0 {

    /* renamed from: a */
    private final IBinder f24879a;

    C10498s0(IBinder iBinder) {
        this.f24879a = iBinder;
    }

    /* renamed from: a */
    public final void mo27331a(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f24879a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f24879a;
    }
}
