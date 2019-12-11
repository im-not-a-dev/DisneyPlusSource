package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.q */
public class C11266q implements IInterface {

    /* renamed from: a */
    private final IBinder f26441a;

    /* renamed from: b */
    private final String f26442b;

    protected C11266q(IBinder iBinder, String str) {
        this.f26441a = iBinder;
        this.f26442b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28834a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f26441a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26441a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28836b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26441a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo28837j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26442b);
        return obtain;
    }
}
