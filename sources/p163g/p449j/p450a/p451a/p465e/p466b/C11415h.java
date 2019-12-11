package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C9886m;
import p163g.p449j.p450a.p451a.p457d.p461d.C10990a;
import p163g.p449j.p450a.p451a.p457d.p461d.C10992c;

/* renamed from: g.j.a.a.e.b.h */
public final class C11415h extends C10990a implements C11414g {
    C11415h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo29233a(C9886m mVar, int i, boolean z) throws RemoteException {
        Parcel j = mo28220j();
        C10992c.m34704a(j, (IInterface) mVar);
        j.writeInt(i);
        C10992c.m34706a(j, z);
        mo28217a(9, j);
    }

    /* renamed from: e */
    public final void mo29235e(int i) throws RemoteException {
        Parcel j = mo28220j();
        j.writeInt(i);
        mo28217a(7, j);
    }

    /* renamed from: a */
    public final void mo29234a(C11416i iVar, C11412e eVar) throws RemoteException {
        Parcel j = mo28220j();
        C10992c.m34705a(j, (Parcelable) iVar);
        C10992c.m34704a(j, (IInterface) eVar);
        mo28217a(12, j);
    }
}
