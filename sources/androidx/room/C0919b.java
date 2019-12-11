package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.b */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C0919b extends IInterface {

    /* renamed from: androidx.room.b$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C0920a extends Binder implements C0919b {

        /* renamed from: androidx.room.b$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0921a implements C0919b {

            /* renamed from: a */
            private IBinder f3722a;

            C0921a(IBinder iBinder) {
                this.f3722a = iBinder;
            }

            /* renamed from: a */
            public void mo5248a(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f3722a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3722a;
            }
        }

        public C0920a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: a */
        public static C0919b m5124a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0919b)) {
                return new C0921a(iBinder);
            }
            return (C0919b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "androidx.room.IMultiInstanceInvalidationCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo5248a(parcel.createStringArray());
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
    void mo5248a(String[] strArr) throws RemoteException;
}
