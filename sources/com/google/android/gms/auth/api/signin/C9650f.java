package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C9650f implements Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 4) {
                str = C9919b.m30895b(parcel, a);
            } else if (a2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) C9919b.m30891a(parcel, a, GoogleSignInAccount.CREATOR);
            } else if (a2 != 8) {
                C9919b.m30910o(parcel, a);
            } else {
                str2 = C9919b.m30895b(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
