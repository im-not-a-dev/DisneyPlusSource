package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: g.j.a.a.d.g.ic */
public final class C11161ic extends C9918a {
    public static final Creator<C11161ic> CREATOR = new C11147hc();

    /* renamed from: U */
    public final long f26253U;

    /* renamed from: V */
    public final boolean f26254V;

    /* renamed from: W */
    public final String f26255W;

    /* renamed from: X */
    public final String f26256X;

    /* renamed from: Y */
    public final String f26257Y;

    /* renamed from: Z */
    public final Bundle f26258Z;

    /* renamed from: c */
    public final long f26259c;

    public C11161ic(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f26259c = j;
        this.f26253U = j2;
        this.f26254V = z;
        this.f26255W = str;
        this.f26256X = str2;
        this.f26257Y = str3;
        this.f26258Z = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30914a(parcel, 1, this.f26259c);
        C9921c.m30914a(parcel, 2, this.f26253U);
        C9921c.m30924a(parcel, 3, this.f26254V);
        C9921c.m30922a(parcel, 4, this.f26255W, false);
        C9921c.m30922a(parcel, 5, this.f26256X, false);
        C9921c.m30922a(parcel, 6, this.f26257Y, false);
        C9921c.m30915a(parcel, 7, this.f26258Z, false);
        C9921c.m30912a(parcel, a);
    }
}
