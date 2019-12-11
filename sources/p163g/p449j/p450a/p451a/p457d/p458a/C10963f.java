package p163g.p449j.p450a.p451a.p457d.p458a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.a.f */
public final class C10963f extends C10958a implements C10961d {
    C10963f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: e */
    public final boolean mo28195e() throws RemoteException {
        Parcel a = mo28192a(6, mo28194j());
        boolean a2 = C10960c.m34648a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final boolean mo28196e(boolean z) throws RemoteException {
        Parcel j = mo28194j();
        C10960c.m34647a(j, true);
        Parcel a = mo28192a(2, j);
        boolean a2 = C10960c.m34648a(a);
        a.recycle();
        return a2;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo28192a(1, mo28194j());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
