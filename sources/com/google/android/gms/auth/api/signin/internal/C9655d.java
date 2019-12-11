package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class C9655d implements Creator<C9652a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 != 3) {
                C9919b.m30910o(parcel, a);
            } else {
                bundle = C9919b.m30890a(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9652a(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9652a[i];
    }
}
