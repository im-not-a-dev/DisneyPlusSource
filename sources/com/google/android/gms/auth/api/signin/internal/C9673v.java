package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C9673v implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 2) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 != 5) {
                C9919b.m30910o(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C9919b.m30891a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
