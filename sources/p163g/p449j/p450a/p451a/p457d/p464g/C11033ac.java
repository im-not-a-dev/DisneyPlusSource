package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.ac */
public abstract class C11033ac extends C11020a implements C11048bc {
    public C11033ac() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25579a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo28331c((Bundle) C11109f2.m35132a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
