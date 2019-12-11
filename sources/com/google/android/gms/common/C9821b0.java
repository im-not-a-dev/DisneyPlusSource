package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C9903s0;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10957b;

/* renamed from: com.google.android.gms.common.b0 */
public final class C9821b0 extends C9918a {
    public static final Creator<C9821b0> CREATOR = new C9823c0();

    /* renamed from: U */
    private final C9958v f23024U;

    /* renamed from: V */
    private final boolean f23025V;

    /* renamed from: W */
    private final boolean f23026W;

    /* renamed from: c */
    private final String f23027c;

    C9821b0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f23027c = str;
        this.f23024U = m30596a(iBinder);
        this.f23025V = z;
        this.f23026W = z2;
    }

    /* renamed from: a */
    private static C9958v m30596a(IBinder iBinder) {
        byte[] bArr;
        String str = "Could not unwrap certificate";
        String str2 = "GoogleCertificatesQuery";
        C9959w wVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C10954a g = C9903s0.m30843a(iBinder).mo25434g();
            if (g == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C10957b.m34644a(g);
            }
            if (bArr != null) {
                wVar = new C9959w(bArr);
            } else {
                Log.e(str2, str);
            }
            return wVar;
        } catch (RemoteException e) {
            Log.e(str2, str, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 1, this.f23027c, false);
        C9958v vVar = this.f23024U;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        } else {
            vVar.asBinder();
        }
        C9921c.m30916a(parcel, 2, (IBinder) vVar, false);
        C9921c.m30924a(parcel, 3, this.f23025V);
        C9921c.m30924a(parcel, 4, this.f23026W);
        C9921c.m30912a(parcel, a);
    }

    C9821b0(String str, C9958v vVar, boolean z, boolean z2) {
        this.f23027c = str;
        this.f23024U = vVar;
        this.f23025V = z;
        this.f23026W = z2;
    }
}
