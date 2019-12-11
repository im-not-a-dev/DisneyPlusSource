package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
public final class C10028d9 extends C9918a {
    public static final Creator<C10028d9> CREATOR = new C10017c9();

    /* renamed from: U */
    public final String f23371U;

    /* renamed from: V */
    public final String f23372V;

    /* renamed from: W */
    public final String f23373W;

    /* renamed from: X */
    public final long f23374X;

    /* renamed from: Y */
    public final long f23375Y;

    /* renamed from: Z */
    public final String f23376Z;

    /* renamed from: a0 */
    public final boolean f23377a0;

    /* renamed from: b0 */
    public final boolean f23378b0;

    /* renamed from: c */
    public final String f23379c;

    /* renamed from: c0 */
    public final long f23380c0;

    /* renamed from: d0 */
    public final String f23381d0;

    /* renamed from: e0 */
    public final long f23382e0;

    /* renamed from: f0 */
    public final long f23383f0;

    /* renamed from: g0 */
    public final int f23384g0;

    /* renamed from: h0 */
    public final boolean f23385h0;

    /* renamed from: i0 */
    public final boolean f23386i0;

    /* renamed from: j0 */
    public final boolean f23387j0;

    /* renamed from: k0 */
    public final String f23388k0;

    /* renamed from: l0 */
    public final Boolean f23389l0;

    /* renamed from: m0 */
    public final long f23390m0;

    /* renamed from: n0 */
    public final List<String> f23391n0;

    C10028d9(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list) {
        C9908u.m30863b(str);
        this.f23379c = str;
        this.f23371U = TextUtils.isEmpty(str2) ? null : str2;
        this.f23372V = str3;
        this.f23380c0 = j;
        this.f23373W = str4;
        this.f23374X = j2;
        this.f23375Y = j3;
        this.f23376Z = str5;
        this.f23377a0 = z;
        this.f23378b0 = z2;
        this.f23381d0 = str6;
        this.f23382e0 = j4;
        this.f23383f0 = j5;
        this.f23384g0 = i;
        this.f23385h0 = z3;
        this.f23386i0 = z4;
        this.f23387j0 = z5;
        this.f23388k0 = str7;
        this.f23389l0 = bool;
        this.f23390m0 = j6;
        this.f23391n0 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 2, this.f23379c, false);
        C9921c.m30922a(parcel, 3, this.f23371U, false);
        C9921c.m30922a(parcel, 4, this.f23372V, false);
        C9921c.m30922a(parcel, 5, this.f23373W, false);
        C9921c.m30914a(parcel, 6, this.f23374X);
        C9921c.m30914a(parcel, 7, this.f23375Y);
        C9921c.m30922a(parcel, 8, this.f23376Z, false);
        C9921c.m30924a(parcel, 9, this.f23377a0);
        C9921c.m30924a(parcel, 10, this.f23378b0);
        C9921c.m30914a(parcel, 11, this.f23380c0);
        C9921c.m30922a(parcel, 12, this.f23381d0, false);
        C9921c.m30914a(parcel, 13, this.f23382e0);
        C9921c.m30914a(parcel, 14, this.f23383f0);
        C9921c.m30913a(parcel, 15, this.f23384g0);
        C9921c.m30924a(parcel, 16, this.f23385h0);
        C9921c.m30924a(parcel, 17, this.f23386i0);
        C9921c.m30924a(parcel, 18, this.f23387j0);
        C9921c.m30922a(parcel, 19, this.f23388k0, false);
        C9921c.m30918a(parcel, 21, this.f23389l0, false);
        C9921c.m30914a(parcel, 22, this.f23390m0);
        C9921c.m30923a(parcel, 23, this.f23391n0, false);
        C9921c.m30912a(parcel, a);
    }

    C10028d9(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list) {
        this.f23379c = str;
        this.f23371U = str2;
        this.f23372V = str3;
        this.f23380c0 = j3;
        this.f23373W = str4;
        this.f23374X = j;
        this.f23375Y = j2;
        this.f23376Z = str5;
        this.f23377a0 = z;
        this.f23378b0 = z2;
        this.f23381d0 = str6;
        this.f23382e0 = j4;
        this.f23383f0 = j5;
        this.f23384g0 = i;
        this.f23385h0 = z3;
        this.f23386i0 = z4;
        this.f23387j0 = z5;
        this.f23388k0 = str7;
        this.f23389l0 = bool;
        this.f23390m0 = j6;
        this.f23391n0 = list;
    }
}
