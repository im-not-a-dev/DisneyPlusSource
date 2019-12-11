package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.h */
public final class C9637h implements Creator<Credential> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    str = C9919b.m30895b(parcel, a);
                    break;
                case 2:
                    str2 = C9919b.m30895b(parcel, a);
                    break;
                case 3:
                    uri = (Uri) C9919b.m30891a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = C9919b.m30897c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C9919b.m30895b(parcel, a);
                    break;
                case 6:
                    str4 = C9919b.m30895b(parcel, a);
                    break;
                case 9:
                    str5 = C9919b.m30895b(parcel, a);
                    break;
                case 10:
                    str6 = C9919b.m30895b(parcel, a);
                    break;
                default:
                    C9919b.m30910o(parcel, a);
                    break;
            }
        }
        C9919b.m30900e(parcel, b);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
