package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.metadata.j.n */
/* compiled from: UrlLinkFrame */
public final class C8782n extends C8773i {
    public static final Creator<C8782n> CREATOR = new C8783a();

    /* renamed from: U */
    public final String f18639U;

    /* renamed from: V */
    public final String f18640V;

    /* renamed from: com.google.android.exoplayer2.metadata.j.n$a */
    /* compiled from: UrlLinkFrame */
    static class C8783a implements Creator<C8782n> {
        C8783a() {
        }

        public C8782n createFromParcel(Parcel parcel) {
            return new C8782n(parcel);
        }

        public C8782n[] newArray(int i) {
            return new C8782n[i];
        }
    }

    public C8782n(String str, String str2, String str3) {
        super(str);
        this.f18639U = str2;
        this.f18640V = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8782n.class != obj.getClass()) {
            return false;
        }
        C8782n nVar = (C8782n) obj;
        if (!this.f18626c.equals(nVar.f18626c) || !Util.m29414a((Object) this.f18639U, (Object) nVar.f18639U) || !Util.m29414a((Object) this.f18640V, (Object) nVar.f18640V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (527 + this.f18626c.hashCode()) * 31;
        String str = this.f18639U;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18640V;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": url=");
        sb.append(this.f18640V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18626c);
        parcel.writeString(this.f18639U);
        parcel.writeString(this.f18640V);
    }

    C8782n(Parcel parcel) {
        String readString = parcel.readString();
        Util.castNonNull(readString);
        super(readString);
        this.f18639U = parcel.readString();
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18640V = readString2;
    }
}
