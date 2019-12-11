package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.h5 */
public final class C11140h5 extends C11266q implements C11125g4 {
    C11140h5(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: d */
    public final Bundle mo28521d(Bundle bundle) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) bundle);
        Parcel a = mo28834a(1, j);
        Bundle bundle2 = (Bundle) C11109f2.m35132a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
