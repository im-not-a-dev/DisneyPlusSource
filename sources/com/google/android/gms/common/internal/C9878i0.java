package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.internal.i0 */
public final class C9878i0 implements Creator<C9910v> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                account = (Account) C9919b.m30891a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 != 4) {
                C9919b.m30910o(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C9919b.m30891a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C9910v(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9910v[i];
    }
}
