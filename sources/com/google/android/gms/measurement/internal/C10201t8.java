package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
public final class C10201t8 extends C9918a {
    public static final Creator<C10201t8> CREATOR = new C10231w8();

    /* renamed from: U */
    public final String f23959U;

    /* renamed from: V */
    public final long f23960V;

    /* renamed from: W */
    public final Long f23961W;

    /* renamed from: X */
    public final String f23962X;

    /* renamed from: Y */
    public final String f23963Y;

    /* renamed from: Z */
    public final Double f23964Z;

    /* renamed from: c */
    private final int f23965c;

    C10201t8(C10221v8 v8Var) {
        this(v8Var.f24006c, v8Var.f24007d, v8Var.f24008e, v8Var.f24005b);
    }

    /* renamed from: c */
    public final Object mo26106c() {
        Long l = this.f23961W;
        if (l != null) {
            return l;
        }
        Double d = this.f23964Z;
        if (d != null) {
            return d;
        }
        String str = this.f23962X;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f23965c);
        C9921c.m30922a(parcel, 2, this.f23959U, false);
        C9921c.m30914a(parcel, 3, this.f23960V);
        C9921c.m30921a(parcel, 4, this.f23961W, false);
        C9921c.m30920a(parcel, 5, (Float) null, false);
        C9921c.m30922a(parcel, 6, this.f23962X, false);
        C9921c.m30922a(parcel, 7, this.f23963Y, false);
        C9921c.m30919a(parcel, 8, this.f23964Z, false);
        C9921c.m30912a(parcel, a);
    }

    C10201t8(String str, long j, Object obj, String str2) {
        C9908u.m30863b(str);
        this.f23965c = 2;
        this.f23959U = str;
        this.f23960V = j;
        this.f23963Y = str2;
        if (obj == null) {
            this.f23961W = null;
            this.f23964Z = null;
            this.f23962X = null;
        } else if (obj instanceof Long) {
            this.f23961W = (Long) obj;
            this.f23964Z = null;
            this.f23962X = null;
        } else if (obj instanceof String) {
            this.f23961W = null;
            this.f23964Z = null;
            this.f23962X = (String) obj;
        } else if (obj instanceof Double) {
            this.f23961W = null;
            this.f23964Z = (Double) obj;
            this.f23962X = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    C10201t8(String str, long j, String str2) {
        C9908u.m30863b(str);
        this.f23965c = 2;
        this.f23959U = str;
        this.f23960V = 0;
        this.f23961W = null;
        this.f23964Z = null;
        this.f23962X = null;
        this.f23963Y = null;
    }

    C10201t8(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f23965c = i;
        this.f23959U = str;
        this.f23960V = j;
        this.f23961W = l;
        if (i == 1) {
            this.f23964Z = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f23964Z = d;
        }
        this.f23962X = str2;
        this.f23963Y = str3;
    }
}
