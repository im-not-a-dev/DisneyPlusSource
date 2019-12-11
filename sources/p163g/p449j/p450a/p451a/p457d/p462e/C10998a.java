package p163g.p449j.p450a.p451a.p457d.p462e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.e.a */
public class C10998a implements IInterface {

    /* renamed from: a */
    private final IBinder f26028a;

    /* renamed from: b */
    private final String f26029b;

    protected C10998a(IBinder iBinder, String str) {
        this.f26028a = iBinder;
        this.f26029b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28225a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f26028a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26028a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo28227j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26029b);
        return obtain;
    }
}
