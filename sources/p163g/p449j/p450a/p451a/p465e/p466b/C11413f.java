package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.Status;
import p163g.p449j.p450a.p451a.p457d.p461d.C10991b;
import p163g.p449j.p450a.p451a.p457d.p461d.C10992c;

/* renamed from: g.j.a.a.e.b.f */
public abstract class C11413f extends C10991b implements C11412e {
    public C11413f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25301a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            mo29230a((C9820b) C10992c.m34703a(parcel, C9820b.CREATOR), (C11409b) C10992c.m34703a(parcel, C11409b.CREATOR));
        } else if (i == 4) {
            mo29231c((Status) C10992c.m34703a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo29232d((Status) C10992c.m34703a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo29229a((Status) C10992c.m34703a(parcel, Status.CREATOR), (GoogleSignInAccount) C10992c.m34703a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo25167a((C11418k) C10992c.m34703a(parcel, C11418k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
