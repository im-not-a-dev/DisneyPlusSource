package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public final class Scope extends C9918a implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C9818t();

    /* renamed from: U */
    private final String f22693U;

    /* renamed from: c */
    private final int f22694c;

    Scope(int i, String str) {
        C9908u.m30855a(str, (Object) "scopeUri must not be null or empty");
        this.f22694c = i;
        this.f22693U = str;
    }

    /* renamed from: c */
    public final String mo25000c() {
        return this.f22693U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f22693U.equals(((Scope) obj).f22693U);
    }

    public final int hashCode() {
        return this.f22693U.hashCode();
    }

    public final String toString() {
        return this.f22693U;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f22694c);
        C9921c.m30922a(parcel, 2, mo25000c(), false);
        C9921c.m30912a(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
