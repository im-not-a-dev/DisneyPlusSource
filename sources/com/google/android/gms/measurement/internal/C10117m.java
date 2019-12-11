package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C10117m implements Creator<C10084j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        C10073i iVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 2) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 == 3) {
                iVar = (C10073i) C9919b.m30891a(parcel, a, C10073i.CREATOR);
            } else if (a2 == 4) {
                str2 = C9919b.m30895b(parcel, a);
            } else if (a2 != 5) {
                C9919b.m30910o(parcel, a);
            } else {
                j = C9919b.m30907l(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        C10084j jVar = new C10084j(str, iVar, str2, j);
        return jVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10084j[i];
    }
}
