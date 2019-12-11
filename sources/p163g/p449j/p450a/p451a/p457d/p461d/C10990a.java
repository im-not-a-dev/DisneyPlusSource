package p163g.p449j.p450a.p451a.p457d.p461d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.d.a */
public class C10990a implements IInterface {

    /* renamed from: a */
    private final IBinder f26025a;

    /* renamed from: b */
    private final String f26026b;

    protected C10990a(IBinder iBinder, String str) {
        this.f26025a = iBinder;
        this.f26026b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28217a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26025a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26025a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28219b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f26025a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo28220j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26026b);
        return obtain;
    }
}
