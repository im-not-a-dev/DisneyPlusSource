package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p397z.C9919b;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C9647c implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    i = C9919b.m30906k(parcel2, a);
                    break;
                case 2:
                    str = C9919b.m30895b(parcel2, a);
                    break;
                case 3:
                    str2 = C9919b.m30895b(parcel2, a);
                    break;
                case 4:
                    str3 = C9919b.m30895b(parcel2, a);
                    break;
                case 5:
                    str4 = C9919b.m30895b(parcel2, a);
                    break;
                case 6:
                    uri = (Uri) C9919b.m30891a(parcel2, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C9919b.m30895b(parcel2, a);
                    break;
                case 8:
                    j = C9919b.m30907l(parcel2, a);
                    break;
                case 9:
                    str6 = C9919b.m30895b(parcel2, a);
                    break;
                case 10:
                    list = C9919b.m30897c(parcel2, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C9919b.m30895b(parcel2, a);
                    break;
                case 12:
                    str8 = C9919b.m30895b(parcel2, a);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
