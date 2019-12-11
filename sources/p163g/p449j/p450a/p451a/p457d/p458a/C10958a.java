package p163g.p449j.p450a.p451a.p457d.p458a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.a.a */
public class C10958a implements IInterface {

    /* renamed from: a */
    private final IBinder f26009a;

    /* renamed from: b */
    private final String f26010b;

    protected C10958a(IBinder iBinder, String str) {
        this.f26009a = iBinder;
        this.f26010b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28192a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f26009a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26009a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo28194j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26010b);
        return obtain;
    }
}
