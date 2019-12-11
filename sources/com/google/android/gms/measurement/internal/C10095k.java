package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C10095k implements Creator<C10073i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            if (C9919b.m30888a(a) != 2) {
                C9919b.m30910o(parcel, a);
            } else {
                bundle = C9919b.m30890a(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C10073i(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10073i[i];
    }
}
