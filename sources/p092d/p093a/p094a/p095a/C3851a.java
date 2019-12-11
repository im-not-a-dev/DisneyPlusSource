package p092d.p093a.p094a.p095a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d.a.a.a.a */
/* compiled from: IResultReceiver */
public interface C3851a extends IInterface {

    /* renamed from: d.a.a.a.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C3852a extends Binder implements C3851a {

        /* renamed from: d.a.a.a.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C3853a implements C3851a {

            /* renamed from: a */
            private IBinder f9527a;

            C3853a(IBinder iBinder) {
                this.f9527a = iBinder;
            }

            public IBinder asBinder() {
                return this.f9527a;
            }
        }

        public C3852a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C3851a m12939a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3851a)) {
                return new C3853a(iBinder);
            }
            return (C3851a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "android.support.v4.os.IResultReceiver";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo13769a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo13769a(int i, Bundle bundle) throws RemoteException;
}
