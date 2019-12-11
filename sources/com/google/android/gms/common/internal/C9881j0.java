package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.internal.j0 */
public final class C9881j0 implements Creator<C9912w> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        IBinder iBinder = null;
        C9820b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                iBinder = C9919b.m30905j(parcel, a);
            } else if (a2 == 3) {
                bVar = (C9820b) C9919b.m30891a(parcel, a, C9820b.CREATOR);
            } else if (a2 == 4) {
                z = C9919b.m30901f(parcel, a);
            } else if (a2 != 5) {
                C9919b.m30910o(parcel, a);
            } else {
                z2 = C9919b.m30901f(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        C9912w wVar = new C9912w(i, iBinder, bVar, z, z2);
        return wVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9912w[i];
    }
}
