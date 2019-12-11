package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.internal.v */
public class C9910v extends C9918a {
    public static final Creator<C9910v> CREATOR = new C9878i0();

    /* renamed from: U */
    private final Account f23180U;

    /* renamed from: V */
    private final int f23181V;

    /* renamed from: W */
    private final GoogleSignInAccount f23182W;

    /* renamed from: c */
    private final int f23183c;

    C9910v(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f23183c = i;
        this.f23180U = account;
        this.f23181V = i2;
        this.f23182W = googleSignInAccount;
    }

    /* renamed from: c */
    public Account mo25438c() {
        return this.f23180U;
    }

    /* renamed from: d */
    public int mo25439d() {
        return this.f23181V;
    }

    /* renamed from: e */
    public GoogleSignInAccount mo25440e() {
        return this.f23182W;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f23183c);
        C9921c.m30917a(parcel, 2, (Parcelable) mo25438c(), i, false);
        C9921c.m30913a(parcel, 3, mo25439d());
        C9921c.m30917a(parcel, 4, (Parcelable) mo25440e(), i, false);
        C9921c.m30912a(parcel, a);
    }

    public C9910v(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
