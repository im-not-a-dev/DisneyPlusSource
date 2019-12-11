package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10999b;
import p163g.p449j.p450a.p451a.p457d.p462e.C11000c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C9886m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C9887a extends C10999b implements C9886m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a */
        public static class C9888a extends C10998a implements C9886m {
            C9888a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account getAccount() throws RemoteException {
                Parcel a = mo28225a(2, mo28227j());
                Account account = (Account) C11000c.m34713a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C9886m m30805a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C9886m) {
                return (C9886m) queryLocalInterface;
            }
            return new C9888a(iBinder);
        }
    }

    Account getAccount() throws RemoteException;
}
