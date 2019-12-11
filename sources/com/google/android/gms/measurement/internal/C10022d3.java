package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11109f2;
import p163g.p449j.p450a.p451a.p457d.p464g.C11266q;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
public final class C10022d3 extends C11266q implements C10000b3 {
    C10022d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo25621a(C10084j jVar, C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) jVar);
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(1, j);
    }

    /* renamed from: b */
    public final void mo25625b(C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(18, j);
    }

    /* renamed from: c */
    public final void mo25626c(C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(4, j);
    }

    /* renamed from: d */
    public final void mo25627d(C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(6, j);
    }

    /* renamed from: a */
    public final void mo25623a(C10201t8 t8Var, C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) t8Var);
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(2, j);
    }

    /* renamed from: a */
    public final void mo25622a(C10084j jVar, String str, String str2) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) jVar);
        j.writeString(str);
        j.writeString(str2);
        mo28836b(5, j);
    }

    /* renamed from: a */
    public final byte[] mo25624a(C10084j jVar, String str) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) jVar);
        j.writeString(str);
        Parcel a = mo28834a(9, j);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo25618a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel j2 = mo28837j();
        j2.writeLong(j);
        j2.writeString(str);
        j2.writeString(str2);
        j2.writeString(str3);
        mo28836b(10, j2);
    }

    /* renamed from: a */
    public final String mo25612a(C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) d9Var);
        Parcel a = mo28834a(11, j);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo25620a(C10061g9 g9Var, C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) g9Var);
        C11109f2.m35134a(j, (Parcelable) d9Var);
        mo28836b(12, j);
    }

    /* renamed from: a */
    public final void mo25619a(C10061g9 g9Var) throws RemoteException {
        Parcel j = mo28837j();
        C11109f2.m35134a(j, (Parcelable) g9Var);
        mo28836b(13, j);
    }

    /* renamed from: a */
    public final List<C10201t8> mo25617a(String str, String str2, boolean z, C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        C11109f2.m35135a(j, z);
        C11109f2.m35134a(j, (Parcelable) d9Var);
        Parcel a = mo28834a(14, j);
        ArrayList createTypedArrayList = a.createTypedArrayList(C10201t8.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C10201t8> mo25616a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        C11109f2.m35135a(j, z);
        Parcel a = mo28834a(15, j);
        ArrayList createTypedArrayList = a.createTypedArrayList(C10201t8.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C10061g9> mo25614a(String str, String str2, C10028d9 d9Var) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        C11109f2.m35134a(j, (Parcelable) d9Var);
        Parcel a = mo28834a(16, j);
        ArrayList createTypedArrayList = a.createTypedArrayList(C10061g9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C10061g9> mo25615a(String str, String str2, String str3) throws RemoteException {
        Parcel j = mo28837j();
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        Parcel a = mo28834a(17, j);
        ArrayList createTypedArrayList = a.createTypedArrayList(C10061g9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
