package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.c0 */
public final class C9823c0 implements Creator<C9821b0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 == 2) {
                iBinder = C9919b.m30905j(parcel, a);
            } else if (a2 == 3) {
                z = C9919b.m30901f(parcel, a);
            } else if (a2 != 4) {
                C9919b.m30910o(parcel, a);
            } else {
                z2 = C9919b.m30901f(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9821b0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9821b0[i];
    }
}
