package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.b.a */
public class C10964a implements IInterface {

    /* renamed from: a */
    private final IBinder f26011a;

    /* renamed from: b */
    private final String f26012b;

    protected C10964a(IBinder iBinder, String str) {
        this.f26011a = iBinder;
        this.f26012b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28198a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26011a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26011a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo28200j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26012b);
        return obtain;
    }
}
