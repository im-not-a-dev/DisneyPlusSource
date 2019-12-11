package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.trackselection.k */
/* compiled from: TrackSelectionParameters */
public class C9314k implements Parcelable {
    public static final Creator<C9314k> CREATOR = new C9315a();

    /* renamed from: Y */
    public static final C9314k f21299Y = new C9314k();

    /* renamed from: U */
    public final String f21300U;

    /* renamed from: V */
    public final int f21301V;

    /* renamed from: W */
    public final boolean f21302W;

    /* renamed from: X */
    public final int f21303X;

    /* renamed from: c */
    public final String f21304c;

    /* renamed from: com.google.android.exoplayer2.trackselection.k$a */
    /* compiled from: TrackSelectionParameters */
    static class C9315a implements Creator<C9314k> {
        C9315a() {
        }

        public C9314k createFromParcel(Parcel parcel) {
            return new C9314k(parcel);
        }

        public C9314k[] newArray(int i) {
            return new C9314k[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.k$b */
    /* compiled from: TrackSelectionParameters */
    public static class C9316b {

        /* renamed from: a */
        String f21305a;

        /* renamed from: b */
        String f21306b;

        /* renamed from: c */
        int f21307c;

        /* renamed from: d */
        boolean f21308d;

        /* renamed from: e */
        int f21309e;

        C9316b(C9314k kVar) {
            this.f21305a = kVar.f21304c;
            this.f21306b = kVar.f21300U;
            this.f21307c = kVar.f21301V;
            this.f21308d = kVar.f21302W;
            this.f21309e = kVar.f21303X;
        }

        /* renamed from: a */
        public C9316b mo24107a(String str) {
            this.f21305a = str;
            return this;
        }

        /* renamed from: b */
        public C9316b mo24110b(String str) {
            this.f21306b = str;
            return this;
        }

        /* renamed from: a */
        public C9316b mo24108a(boolean z) {
            this.f21308d = z;
            return this;
        }
    }

    C9314k() {
        this(null, null, 0, false, 0);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9314k kVar = (C9314k) obj;
        if (!(TextUtils.equals(this.f21304c, kVar.f21304c) && TextUtils.equals(this.f21300U, kVar.f21300U) && this.f21301V == kVar.f21301V && this.f21302W == kVar.f21302W && this.f21303X == kVar.f21303X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f21304c;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f21300U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.f21301V) * 31) + (this.f21302W ? 1 : 0)) * 31) + this.f21303X;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21304c);
        parcel.writeString(this.f21300U);
        parcel.writeInt(this.f21301V);
        Util.m29403a(parcel, this.f21302W);
        parcel.writeInt(this.f21303X);
    }

    C9314k(String str, String str2, int i, boolean z, int i2) {
        this.f21304c = Util.m29451f(str);
        this.f21300U = Util.m29451f(str2);
        this.f21301V = i;
        this.f21302W = z;
        this.f21303X = i2;
    }

    C9314k(Parcel parcel) {
        this.f21304c = parcel.readString();
        this.f21300U = parcel.readString();
        this.f21301V = parcel.readInt();
        this.f21302W = Util.m29412a(parcel);
        this.f21303X = parcel.readInt();
    }
}
