package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: g.j.a.a.d.g.ec */
public final class C11103ec extends C11266q implements C11067cc {
    C11103ec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final void mo28368a(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeString(str);
        j2.writeString(str2);
        C11109f2.m35134a(j2, (Parcelable) bundle);
        j2.writeLong(j);
        mo28836b(1, j2);
    }

    /* renamed from: id */
    public final int mo28369id() throws RemoteException {
        Parcel a = mo28834a(2, mo28837j());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
