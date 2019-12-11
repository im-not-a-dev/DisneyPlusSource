package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public final class IdToken extends C9918a implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C9643n();

    /* renamed from: U */
    private final String f22597U;

    /* renamed from: c */
    private final String f22598c;

    public IdToken(String str, String str2) {
        C9908u.m30861a(!TextUtils.isEmpty(str), (Object) "account type string cannot be null or empty");
        C9908u.m30861a(!TextUtils.isEmpty(str2), (Object) "id token string cannot be null or empty");
        this.f22598c = str;
        this.f22597U = str2;
    }

    /* renamed from: c */
    public final String mo24862c() {
        return this.f22598c;
    }

    /* renamed from: d */
    public final String mo24863d() {
        return this.f22597U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C9901s.m30841a(this.f22598c, idToken.f22598c) && C9901s.m30841a(this.f22597U, idToken.f22597U);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 1, mo24862c(), false);
        C9921c.m30922a(parcel, 2, mo24863d(), false);
        C9921c.m30912a(parcel, a);
    }
}
