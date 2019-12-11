package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p163g.p449j.p450a.p451a.p457d.p459b.C10964a;
import p163g.p449j.p450a.p451a.p457d.p459b.C10966c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C9671t extends C10964a implements C9670s {
    C9671t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo24974a(C9668q qVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel j = mo28200j();
        C10966c.m34658a(j, (IInterface) qVar);
        C10966c.m34659a(j, (Parcelable) googleSignInOptions);
        mo28198a(103, j);
    }
}
