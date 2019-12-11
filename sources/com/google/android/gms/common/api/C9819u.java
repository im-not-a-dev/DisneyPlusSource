package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.api.u */
public final class C9819u implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C9919b.m30891a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                C9919b.m30910o(parcel, a);
            } else {
                i = C9919b.m30906k(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
