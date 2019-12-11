package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.s */
public final class C9934s implements Creator<C9824d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 == 2) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 != 3) {
                C9919b.m30910o(parcel, a);
            } else {
                j = C9919b.m30907l(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9824d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9824d[i];
    }
}
