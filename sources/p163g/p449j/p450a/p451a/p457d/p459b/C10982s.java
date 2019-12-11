package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C9628a;

/* renamed from: g.j.a.a.d.b.s */
public final class C10982s extends C10964a implements C10981r {
    C10982s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: a */
    public final void mo28210a(C10979p pVar, C9628a aVar) throws RemoteException {
        Parcel j = mo28200j();
        C10966c.m34658a(j, (IInterface) pVar);
        C10966c.m34659a(j, (Parcelable) aVar);
        mo28198a(1, j);
    }

    /* renamed from: a */
    public final void mo28212a(C10979p pVar, C10983t tVar) throws RemoteException {
        Parcel j = mo28200j();
        C10966c.m34658a(j, (IInterface) pVar);
        C10966c.m34659a(j, (Parcelable) tVar);
        mo28198a(2, j);
    }

    /* renamed from: a */
    public final void mo28211a(C10979p pVar, C10977n nVar) throws RemoteException {
        Parcel j = mo28200j();
        C10966c.m34658a(j, (IInterface) pVar);
        C10966c.m34659a(j, (Parcelable) nVar);
        mo28198a(3, j);
    }
}
