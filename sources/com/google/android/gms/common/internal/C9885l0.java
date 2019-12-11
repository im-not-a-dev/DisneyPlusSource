package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.internal.l0 */
public final class C9885l0 implements Creator<C9883k0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        Bundle bundle = null;
        C9824d[] dVarArr = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                bundle = C9919b.m30890a(parcel, a);
            } else if (a2 != 2) {
                C9919b.m30910o(parcel, a);
            } else {
                dVarArr = (C9824d[]) C9919b.m30896b(parcel, a, C9824d.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9883k0(bundle, dVarArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9883k0[i];
    }
}
