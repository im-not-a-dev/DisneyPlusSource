package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public class SignInAccount extends C9918a implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C9650f();

    /* renamed from: U */
    private GoogleSignInAccount f22652U;
    @Deprecated

    /* renamed from: V */
    private String f22653V;
    @Deprecated

    /* renamed from: c */
    private String f22654c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f22652U = googleSignInAccount;
        C9908u.m30855a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f22654c = str;
        C9908u.m30855a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.f22653V = str2;
    }

    /* renamed from: c */
    public final GoogleSignInAccount mo24926c() {
        return this.f22652U;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 4, this.f22654c, false);
        C9921c.m30917a(parcel, 7, (Parcelable) this.f22652U, i, false);
        C9921c.m30922a(parcel, 8, this.f22653V, false);
        C9921c.m30912a(parcel, a);
    }
}
