package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p462e.C10999b;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C9892o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C9893a extends C10999b implements C9892o {
        public C9893a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo25414a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                mo25348a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C11000c.m34713a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo25350b(parcel.readInt(), (Bundle) C11000c.m34713a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo25349a(parcel.readInt(), parcel.readStrongBinder(), (C9883k0) C11000c.m34713a(parcel, C9883k0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo25348a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo25349a(int i, IBinder iBinder, C9883k0 k0Var) throws RemoteException;

    /* renamed from: b */
    void mo25350b(int i, Bundle bundle) throws RemoteException;
}
