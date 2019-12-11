package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p163g.p449j.p450a.p451a.p457d.p459b.C10965b;
import p163g.p449j.p450a.p451a.p457d.p459b.C10966c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.r */
public abstract class C9669r extends C10965b implements C9668q {
    public C9669r() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24973a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo24955a((GoogleSignInAccount) C10966c.m34657a(parcel, GoogleSignInAccount.CREATOR), (Status) C10966c.m34657a(parcel, Status.CREATOR));
                throw null;
            case 102:
                mo24956a((Status) C10966c.m34657a(parcel, Status.CREATOR));
                throw null;
            case 103:
                mo24968b((Status) C10966c.m34657a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
