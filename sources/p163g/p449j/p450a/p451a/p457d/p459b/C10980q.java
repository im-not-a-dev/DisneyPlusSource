package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: g.j.a.a.d.b.q */
public abstract class C10980q extends C10965b implements C10979p {
    public C10980q() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24973a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo28203a((Status) C10966c.m34657a(parcel, Status.CREATOR), (Credential) C10966c.m34657a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo28206e((Status) C10966c.m34657a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo28204a((Status) C10966c.m34657a(parcel, Status.CREATOR), parcel.readString());
            throw null;
        }
        parcel2.writeNoException();
        return true;
    }
}
