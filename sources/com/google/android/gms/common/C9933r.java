package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.r */
public final class C9933r implements Creator<C9820b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C9919b.m30891a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                C9919b.m30910o(parcel, a);
            } else {
                str = C9919b.m30895b(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9820b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9820b[i];
    }
}
