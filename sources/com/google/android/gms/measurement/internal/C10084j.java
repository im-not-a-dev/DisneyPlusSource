package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.measurement.internal.j */
public final class C10084j extends C9918a {
    public static final Creator<C10084j> CREATOR = new C10117m();

    /* renamed from: U */
    public final C10073i f23559U;

    /* renamed from: V */
    public final String f23560V;

    /* renamed from: W */
    public final long f23561W;

    /* renamed from: c */
    public final String f23562c;

    public C10084j(String str, C10073i iVar, String str2, long j) {
        this.f23562c = str;
        this.f23559U = iVar;
        this.f23560V = str2;
        this.f23561W = j;
    }

    public final String toString() {
        String str = this.f23560V;
        String str2 = this.f23562c;
        String valueOf = String.valueOf(this.f23559U);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 2, this.f23562c, false);
        C9921c.m30917a(parcel, 3, (Parcelable) this.f23559U, i, false);
        C9921c.m30922a(parcel, 4, this.f23560V, false);
        C9921c.m30914a(parcel, 5, this.f23561W);
        C9921c.m30912a(parcel, a);
    }

    C10084j(C10084j jVar, long j) {
        C9908u.m30853a(jVar);
        this.f23562c = jVar.f23562c;
        this.f23559U = jVar.f23559U;
        this.f23560V = jVar.f23560V;
        this.f23561W = j;
    }
}
