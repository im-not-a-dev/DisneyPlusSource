package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C0919b.C0920a;

/* renamed from: androidx.room.c */
/* compiled from: IMultiInstanceInvalidationService */
public interface C0922c extends IInterface {

    /* renamed from: androidx.room.c$a */
    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class C0923a extends Binder implements C0922c {

        /* renamed from: androidx.room.c$a$a */
        /* compiled from: IMultiInstanceInvalidationService */
        private static class C0924a implements C0922c {

            /* renamed from: a */
            private IBinder f3723a;

            C0924a(IBinder iBinder) {
                this.f3723a = iBinder;
            }

            /* renamed from: a */
            public int mo5202a(C0919b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f3723a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3723a;
            }

            /* renamed from: a */
            public void mo5204a(C0919b bVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f3723a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo5203a(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f3723a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0923a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: a */
        public static C0922c m5129a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0922c)) {
                return new C0924a(iBinder);
            }
            return (C0922c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "androidx.room.IMultiInstanceInvalidationService";
            if (i == 1) {
                parcel.enforceInterface(str);
                int a = mo5202a(C0920a.m5124a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                mo5204a(C0920a.m5124a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                mo5203a(parcel.readInt(), parcel.createStringArray());
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
    int mo5202a(C0919b bVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo5203a(int i, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo5204a(C0919b bVar, int i) throws RemoteException;
}
