package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.b.b */
public class C10965b extends Binder implements IInterface {
    protected C10965b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24973a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo24973a(i, parcel, parcel2, i2);
    }
}
