package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.internal.C9886m.C9887a;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.internal.w */
public class C9912w extends C9918a {
    public static final Creator<C9912w> CREATOR = new C9881j0();

    /* renamed from: U */
    private IBinder f23184U;

    /* renamed from: V */
    private C9820b f23185V;

    /* renamed from: W */
    private boolean f23186W;

    /* renamed from: X */
    private boolean f23187X;

    /* renamed from: c */
    private final int f23188c;

    C9912w(int i, IBinder iBinder, C9820b bVar, boolean z, boolean z2) {
        this.f23188c = i;
        this.f23184U = iBinder;
        this.f23185V = bVar;
        this.f23186W = z;
        this.f23187X = z2;
    }

    /* renamed from: c */
    public C9886m mo25442c() {
        return C9887a.m30805a(this.f23184U);
    }

    /* renamed from: d */
    public C9820b mo25443d() {
        return this.f23185V;
    }

    /* renamed from: e */
    public boolean mo25444e() {
        return this.f23186W;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9912w)) {
            return false;
        }
        C9912w wVar = (C9912w) obj;
        return this.f23185V.equals(wVar.f23185V) && mo25442c().equals(wVar.mo25442c());
    }

    /* renamed from: f */
    public boolean mo25446f() {
        return this.f23187X;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f23188c);
        C9921c.m30916a(parcel, 2, this.f23184U, false);
        C9921c.m30917a(parcel, 3, (Parcelable) mo25443d(), i, false);
        C9921c.m30924a(parcel, 4, mo25444e());
        C9921c.m30924a(parcel, 5, mo25446f());
        C9921c.m30912a(parcel, a);
    }
}
