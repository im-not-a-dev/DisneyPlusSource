package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
public final class C10061g9 extends C9918a {
    public static final Creator<C10061g9> CREATOR = new C10094j9();

    /* renamed from: U */
    public String f23494U;

    /* renamed from: V */
    public C10201t8 f23495V;

    /* renamed from: W */
    public long f23496W;

    /* renamed from: X */
    public boolean f23497X;

    /* renamed from: Y */
    public String f23498Y;

    /* renamed from: Z */
    public C10084j f23499Z;

    /* renamed from: a0 */
    public long f23500a0;

    /* renamed from: b0 */
    public C10084j f23501b0;

    /* renamed from: c */
    public String f23502c;

    /* renamed from: c0 */
    public long f23503c0;

    /* renamed from: d0 */
    public C10084j f23504d0;

    C10061g9(C10061g9 g9Var) {
        C9908u.m30853a(g9Var);
        this.f23502c = g9Var.f23502c;
        this.f23494U = g9Var.f23494U;
        this.f23495V = g9Var.f23495V;
        this.f23496W = g9Var.f23496W;
        this.f23497X = g9Var.f23497X;
        this.f23498Y = g9Var.f23498Y;
        this.f23499Z = g9Var.f23499Z;
        this.f23500a0 = g9Var.f23500a0;
        this.f23501b0 = g9Var.f23501b0;
        this.f23503c0 = g9Var.f23503c0;
        this.f23504d0 = g9Var.f23504d0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 2, this.f23502c, false);
        C9921c.m30922a(parcel, 3, this.f23494U, false);
        C9921c.m30917a(parcel, 4, (Parcelable) this.f23495V, i, false);
        C9921c.m30914a(parcel, 5, this.f23496W);
        C9921c.m30924a(parcel, 6, this.f23497X);
        C9921c.m30922a(parcel, 7, this.f23498Y, false);
        C9921c.m30917a(parcel, 8, (Parcelable) this.f23499Z, i, false);
        C9921c.m30914a(parcel, 9, this.f23500a0);
        C9921c.m30917a(parcel, 10, (Parcelable) this.f23501b0, i, false);
        C9921c.m30914a(parcel, 11, this.f23503c0);
        C9921c.m30917a(parcel, 12, (Parcelable) this.f23504d0, i, false);
        C9921c.m30912a(parcel, a);
    }

    C10061g9(String str, String str2, C10201t8 t8Var, long j, boolean z, String str3, C10084j jVar, long j2, C10084j jVar2, long j3, C10084j jVar3) {
        this.f23502c = str;
        this.f23494U = str2;
        this.f23495V = t8Var;
        this.f23496W = j;
        this.f23497X = z;
        this.f23498Y = str3;
        this.f23499Z = jVar;
        this.f23500a0 = j2;
        this.f23501b0 = jVar2;
        this.f23503c0 = j3;
        this.f23504d0 = jVar3;
    }
}
