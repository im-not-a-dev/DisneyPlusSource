package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.credentials.j */
public final class C9639j implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                z = C9919b.m30901f(parcel, a);
            } else if (a2 == 2) {
                z2 = C9919b.m30901f(parcel, a);
            } else if (a2 == 3) {
                z3 = C9919b.m30901f(parcel, a);
            } else if (a2 == 4) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 != 1000) {
                C9919b.m30910o(parcel, a);
            } else {
                i = C9919b.m30906k(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(i, z, z2, z3, i2);
        return credentialPickerConfig;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
