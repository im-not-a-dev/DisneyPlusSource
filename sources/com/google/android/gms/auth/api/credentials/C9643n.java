package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.credentials.n */
public final class C9643n implements Creator<IdToken> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 != 2) {
                C9919b.m30910o(parcel, a);
            } else {
                str2 = C9919b.m30895b(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new IdToken(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IdToken[i];
    }
}
