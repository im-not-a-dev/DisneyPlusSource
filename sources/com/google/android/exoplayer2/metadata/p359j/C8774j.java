package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.metadata.j.j */
/* compiled from: InternalFrame */
public final class C8774j extends C8773i {
    public static final Creator<C8774j> CREATOR = new C8775a();

    /* renamed from: U */
    public final String f18627U;

    /* renamed from: V */
    public final String f18628V;

    /* renamed from: W */
    public final String f18629W;

    /* renamed from: com.google.android.exoplayer2.metadata.j.j$a */
    /* compiled from: InternalFrame */
    static class C8775a implements Creator<C8774j> {
        C8775a() {
        }

        public C8774j createFromParcel(Parcel parcel) {
            return new C8774j(parcel);
        }

        public C8774j[] newArray(int i) {
            return new C8774j[i];
        }
    }

    public C8774j(String str, String str2, String str3) {
        super("----");
        this.f18627U = str;
        this.f18628V = str2;
        this.f18629W = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8774j.class != obj.getClass()) {
            return false;
        }
        C8774j jVar = (C8774j) obj;
        if (!Util.m29414a((Object) this.f18628V, (Object) jVar.f18628V) || !Util.m29414a((Object) this.f18627U, (Object) jVar.f18627U) || !Util.m29414a((Object) this.f18629W, (Object) jVar.f18629W)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f18627U;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18628V;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18629W;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": domain=");
        sb.append(this.f18627U);
        sb.append(", description=");
        sb.append(this.f18628V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18626c);
        parcel.writeString(this.f18627U);
        parcel.writeString(this.f18629W);
    }

    C8774j(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18627U = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18628V = readString2;
        String readString3 = parcel.readString();
        Util.castNonNull(readString3);
        this.f18629W = readString3;
    }
}
