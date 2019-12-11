package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.credentials.l */
public final class C9641l implements Creator<C9628a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = C9919b.m30901f(parcel, a);
                        break;
                    case 2:
                        strArr = C9919b.m30898c(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C9919b.m30891a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C9919b.m30891a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = C9919b.m30901f(parcel, a);
                        break;
                    case 6:
                        str = C9919b.m30895b(parcel, a);
                        break;
                    case 7:
                        str2 = C9919b.m30895b(parcel, a);
                        break;
                    case 8:
                        z3 = C9919b.m30901f(parcel, a);
                        break;
                    default:
                        C9919b.m30910o(parcel, a);
                        break;
                }
            } else {
                i = C9919b.m30906k(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        C9628a aVar = new C9628a(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return aVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9628a[i];
    }
}
