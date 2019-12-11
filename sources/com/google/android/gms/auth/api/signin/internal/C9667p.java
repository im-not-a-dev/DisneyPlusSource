package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p459b.C10965b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.p */
public abstract class C9667p extends C10965b implements C9666o {
    public C9667p() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24973a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo24971f();
        } else if (i != 2) {
            return false;
        } else {
            mo24972i();
        }
        return true;
    }
}
