package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.d */
public class C9824d extends C9918a {
    public static final Creator<C9824d> CREATOR = new C9934s();
    @Deprecated

    /* renamed from: U */
    private final int f23030U;

    /* renamed from: V */
    private final long f23031V;

    /* renamed from: c */
    private final String f23032c;

    public C9824d(String str, int i, long j) {
        this.f23032c = str;
        this.f23030U = i;
        this.f23031V = j;
    }

    /* renamed from: c */
    public String mo25285c() {
        return this.f23032c;
    }

    /* renamed from: d */
    public long mo25286d() {
        long j = this.f23031V;
        return j == -1 ? (long) this.f23030U : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9824d) {
            C9824d dVar = (C9824d) obj;
            if (((mo25285c() != null && mo25285c().equals(dVar.mo25285c())) || (mo25285c() == null && dVar.mo25285c() == null)) && mo25286d() == dVar.mo25286d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C9901s.m30839a(mo25285c(), Long.valueOf(mo25286d()));
    }

    public String toString() {
        C9902a a = C9901s.m30840a((Object) this);
        a.mo25435a("name", mo25285c());
        a.mo25435a("version", Long.valueOf(mo25286d()));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 1, mo25285c(), false);
        C9921c.m30913a(parcel, 2, this.f23030U);
        C9921c.m30914a(parcel, 3, mo25286d());
        C9921c.m30912a(parcel, a);
    }
}
