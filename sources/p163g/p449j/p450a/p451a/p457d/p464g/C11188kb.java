package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p456c.C10954a;

/* renamed from: g.j.a.a.d.g.kb */
public final class C11188kb extends C11266q implements C11158i9 {
    C11188kb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeString(str);
        j2.writeLong(j);
        mo28836b(23, j2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        C11109f2.m35134a(j, (Parcelable) bundle);
        mo28836b(9, j);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeString(str);
        j2.writeLong(j);
        mo28836b(24, j2);
    }

    public final void generateEventId(C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(22, j);
    }

    public final void getCachedAppInstanceId(C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(19, j);
    }

    public final void getConditionalUserProperties(String str, String str2, C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(10, j);
    }

    public final void getCurrentScreenClass(C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(17, j);
    }

    public final void getCurrentScreenName(C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(16, j);
    }

    public final void getGmpAppId(C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(21, j);
    }

    public final void getMaxUserProperties(String str, C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(6, j);
    }

    public final void getUserProperties(String str, String str2, boolean z, C11048bc bcVar) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        C11109f2.m35135a(j, z);
        C11109f2.m35133a(j, (IInterface) bcVar);
        mo28836b(5, j);
    }

    public final void initialize(C10954a aVar, C11161ic icVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        C11109f2.m35134a(j2, (Parcelable) icVar);
        j2.writeLong(j);
        mo28836b(1, j2);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeString(str);
        j2.writeString(str2);
        C11109f2.m35134a(j2, (Parcelable) bundle);
        C11109f2.m35135a(j2, z);
        C11109f2.m35135a(j2, z2);
        j2.writeLong(j);
        mo28836b(2, j2);
    }

    public final void logHealthData(int i, String str, C10954a aVar, C10954a aVar2, C10954a aVar3) throws RemoteException {
        Parcel j = mo28837j();
        j.writeInt(i);
        j.writeString(str);
        C11109f2.m35133a(j, (IInterface) aVar);
        C11109f2.m35133a(j, (IInterface) aVar2);
        C11109f2.m35133a(j, (IInterface) aVar3);
        mo28836b(33, j);
    }

    public final void onActivityCreated(C10954a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        C11109f2.m35134a(j2, (Parcelable) bundle);
        j2.writeLong(j);
        mo28836b(27, j2);
    }

    public final void onActivityDestroyed(C10954a aVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeLong(j);
        mo28836b(28, j2);
    }

    public final void onActivityPaused(C10954a aVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeLong(j);
        mo28836b(29, j2);
    }

    public final void onActivityResumed(C10954a aVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeLong(j);
        mo28836b(30, j2);
    }

    public final void onActivitySaveInstanceState(C10954a aVar, C11048bc bcVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        C11109f2.m35133a(j2, (IInterface) bcVar);
        j2.writeLong(j);
        mo28836b(31, j2);
    }

    public final void onActivityStarted(C10954a aVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeLong(j);
        mo28836b(25, j2);
    }

    public final void onActivityStopped(C10954a aVar, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeLong(j);
        mo28836b(26, j2);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35134a(j2, (Parcelable) bundle);
        j2.writeLong(j);
        mo28836b(8, j2);
    }

    public final void setCurrentScreen(C10954a aVar, String str, String str2, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        C11109f2.m35133a(j2, (IInterface) aVar);
        j2.writeString(str);
        j2.writeString(str2);
        j2.writeLong(j);
        mo28836b(15, j2);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35135a(j, z);
        mo28836b(39, j);
    }

    public final void setUserProperty(String str, String str2, C10954a aVar, boolean z, long j) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeString(str);
        j2.writeString(str2);
        C11109f2.m35133a(j2, (IInterface) aVar);
        C11109f2.m35135a(j2, z);
        j2.writeLong(j);
        mo28836b(4, j2);
    }
}
