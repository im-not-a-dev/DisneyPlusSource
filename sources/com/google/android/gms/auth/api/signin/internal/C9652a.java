package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C9652a extends C9918a {
    public static final Creator<C9652a> CREATOR = new C9655d();

    /* renamed from: U */
    private int f22665U;

    /* renamed from: V */
    private Bundle f22666V;

    /* renamed from: c */
    private final int f22667c;

    C9652a(int i, int i2, Bundle bundle) {
        this.f22667c = i;
        this.f22665U = i2;
        this.f22666V = bundle;
    }

    /* renamed from: c */
    public int mo24942c() {
        return this.f22665U;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f22667c);
        C9921c.m30913a(parcel, 2, mo24942c());
        C9921c.m30915a(parcel, 3, this.f22666V, false);
        C9921c.m30912a(parcel, a);
    }
}
