package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public final class SignInConfiguration extends C9918a implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C9673v();

    /* renamed from: U */
    private GoogleSignInOptions f22656U;

    /* renamed from: c */
    private final String f22657c;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C9908u.m30863b(str);
        this.f22657c = str;
        this.f22656U = googleSignInOptions;
    }

    /* renamed from: c */
    public final GoogleSignInOptions mo24937c() {
        return this.f22656U;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f22657c.equals(signInConfiguration.f22657c)) {
            GoogleSignInOptions googleSignInOptions = this.f22656U;
            if (googleSignInOptions != null ? googleSignInOptions.equals(signInConfiguration.f22656U) : signInConfiguration.f22656U == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C9653b bVar = new C9653b();
        bVar.mo24945a((Object) this.f22657c);
        bVar.mo24945a((Object) this.f22656U);
        return bVar.mo24944a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 2, this.f22657c, false);
        C9921c.m30917a(parcel, 5, (Parcelable) this.f22656U, i, false);
        C9921c.m30912a(parcel, a);
    }
}
