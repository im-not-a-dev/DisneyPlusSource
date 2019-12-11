package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.metadata.j.m */
/* compiled from: TextInformationFrame */
public final class C8780m extends C8773i {
    public static final Creator<C8780m> CREATOR = new C8781a();

    /* renamed from: U */
    public final String f18637U;

    /* renamed from: V */
    public final String f18638V;

    /* renamed from: com.google.android.exoplayer2.metadata.j.m$a */
    /* compiled from: TextInformationFrame */
    static class C8781a implements Creator<C8780m> {
        C8781a() {
        }

        public C8780m createFromParcel(Parcel parcel) {
            return new C8780m(parcel);
        }

        public C8780m[] newArray(int i) {
            return new C8780m[i];
        }
    }

    public C8780m(String str, String str2, String str3) {
        super(str);
        this.f18637U = str2;
        this.f18638V = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8780m.class != obj.getClass()) {
            return false;
        }
        C8780m mVar = (C8780m) obj;
        if (!this.f18626c.equals(mVar.f18626c) || !C9554k0.m29414a((Object) this.f18637U, (Object) mVar.f18637U) || !C9554k0.m29414a((Object) this.f18638V, (Object) mVar.f18638V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (527 + this.f18626c.hashCode()) * 31;
        String str = this.f18637U;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18638V;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": description=");
        sb.append(this.f18637U);
        sb.append(": value=");
        sb.append(this.f18638V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18626c);
        parcel.writeString(this.f18637U);
        parcel.writeString(this.f18638V);
    }

    C8780m(Parcel parcel) {
        String readString = parcel.readString();
        C9554k0.m29394a(readString);
        super(readString);
        this.f18637U = parcel.readString();
        String readString2 = parcel.readString();
        C9554k0.m29394a(readString2);
        this.f18638V = readString2;
    }
}
