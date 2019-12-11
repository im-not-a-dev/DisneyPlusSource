package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9886m.C9887a;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.internal.g */
public class C9872g extends C9918a {
    public static final Creator<C9872g> CREATOR = new C9889m0();

    /* renamed from: U */
    private final int f23121U;

    /* renamed from: V */
    private int f23122V;

    /* renamed from: W */
    String f23123W;

    /* renamed from: X */
    IBinder f23124X;

    /* renamed from: Y */
    Scope[] f23125Y;

    /* renamed from: Z */
    Bundle f23126Z;

    /* renamed from: a0 */
    Account f23127a0;

    /* renamed from: b0 */
    C9824d[] f23128b0;

    /* renamed from: c */
    private final int f23129c;

    /* renamed from: c0 */
    C9824d[] f23130c0;

    /* renamed from: d0 */
    private boolean f23131d0;

    public C9872g(int i) {
        this.f23129c = 4;
        this.f23122V = C9826e.f23037a;
        this.f23121U = i;
        this.f23131d0 = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f23129c);
        C9921c.m30913a(parcel, 2, this.f23121U);
        C9921c.m30913a(parcel, 3, this.f23122V);
        C9921c.m30922a(parcel, 4, this.f23123W, false);
        C9921c.m30916a(parcel, 5, this.f23124X, false);
        C9921c.m30925a(parcel, 6, (T[]) this.f23125Y, i, false);
        C9921c.m30915a(parcel, 7, this.f23126Z, false);
        C9921c.m30917a(parcel, 8, (Parcelable) this.f23127a0, i, false);
        C9921c.m30925a(parcel, 10, (T[]) this.f23128b0, i, false);
        C9921c.m30925a(parcel, 11, (T[]) this.f23130c0, i, false);
        C9921c.m30924a(parcel, 12, this.f23131d0);
        C9921c.m30912a(parcel, a);
    }

    C9872g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C9824d[] dVarArr, C9824d[] dVarArr2, boolean z) {
        this.f23129c = i;
        this.f23121U = i2;
        this.f23122V = i3;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.f23123W = str2;
        } else {
            this.f23123W = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C9833a.m30637a(C9887a.m30805a(iBinder));
            }
            this.f23127a0 = account2;
        } else {
            this.f23124X = iBinder;
            this.f23127a0 = account;
        }
        this.f23125Y = scopeArr;
        this.f23126Z = bundle;
        this.f23128b0 = dVarArr;
        this.f23130c0 = dVarArr2;
        this.f23131d0 = z;
    }
}
