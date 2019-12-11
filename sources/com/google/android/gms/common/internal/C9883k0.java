package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.internal.k0 */
public final class C9883k0 extends C9918a {
    public static final Creator<C9883k0> CREATOR = new C9885l0();

    /* renamed from: U */
    C9824d[] f23153U;

    /* renamed from: c */
    Bundle f23154c;

    C9883k0(Bundle bundle, C9824d[] dVarArr) {
        this.f23154c = bundle;
        this.f23153U = dVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30915a(parcel, 1, this.f23154c, false);
        C9921c.m30925a(parcel, 2, (T[]) this.f23153U, i, false);
        C9921c.m30912a(parcel, a);
    }

    public C9883k0() {
    }
}
