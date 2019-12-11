package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.C9652a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p397z.C9919b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final class C9649e implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    i = C9919b.m30906k(parcel, a);
                    break;
                case 2:
                    arrayList = C9919b.m30897c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C9919b.m30891a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = C9919b.m30901f(parcel, a);
                    break;
                case 5:
                    z2 = C9919b.m30901f(parcel, a);
                    break;
                case 6:
                    z3 = C9919b.m30901f(parcel, a);
                    break;
                case 7:
                    str = C9919b.m30895b(parcel, a);
                    break;
                case 8:
                    str2 = C9919b.m30895b(parcel, a);
                    break;
                case 9:
                    arrayList2 = C9919b.m30897c(parcel, a, C9652a.CREATOR);
                    break;
                default:
                    C9919b.m30910o(parcel, a);
                    break;
            }
        }
        C9919b.m30900e(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
