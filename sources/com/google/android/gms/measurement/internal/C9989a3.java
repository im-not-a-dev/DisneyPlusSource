package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11020a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11109f2;

/* renamed from: com.google.android.gms.measurement.internal.a3 */
public abstract class C9989a3 extends C11020a implements C10000b3 {
    public C9989a3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25579a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo25621a((C10084j) C11109f2.m35132a(parcel, C10084j.CREATOR), (C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo25623a((C10201t8) C11109f2.m35132a(parcel, C10201t8.CREATOR), (C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo25626c((C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo25622a((C10084j) C11109f2.m35132a(parcel, C10084j.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo25627d((C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = mo25613a((C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR), C11109f2.m35136a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = mo25624a((C10084j) C11109f2.m35132a(parcel, C10084j.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                mo25618a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String a3 = mo25612a((C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(a3);
                break;
            case 12:
                mo25620a((C10061g9) C11109f2.m35132a(parcel, C10061g9.CREATOR), (C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo25619a((C10061g9) C11109f2.m35132a(parcel, C10061g9.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a4 = mo25617a(parcel.readString(), parcel.readString(), C11109f2.m35136a(parcel), (C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 15:
                List a5 = mo25616a(parcel.readString(), parcel.readString(), parcel.readString(), C11109f2.m35136a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 16:
                List a6 = mo25614a(parcel.readString(), parcel.readString(), (C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 17:
                List a7 = mo25615a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a7);
                break;
            case 18:
                mo25625b((C10028d9) C11109f2.m35132a(parcel, C10028d9.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
