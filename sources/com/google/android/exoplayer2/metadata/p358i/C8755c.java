package com.google.android.exoplayer2.metadata.p358i;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.metadata.i.c */
/* compiled from: IcyInfo */
public final class C8755c implements C8737b {
    public static final Creator<C8755c> CREATOR = new C8756a();

    /* renamed from: U */
    public final String f18595U;

    /* renamed from: c */
    public final String f18596c;

    /* renamed from: com.google.android.exoplayer2.metadata.i.c$a */
    /* compiled from: IcyInfo */
    static class C8756a implements Creator<C8755c> {
        C8756a() {
        }

        public C8755c createFromParcel(Parcel parcel) {
            return new C8755c(parcel);
        }

        public C8755c[] newArray(int i) {
            return new C8755c[i];
        }
    }

    public C8755c(String str, String str2) {
        this.f18596c = str;
        this.f18595U = str2;
    }

    /* renamed from: H */
    public /* synthetic */ Format mo22873H() {
        return C8738a.m25358b(this);
    }

    /* renamed from: K */
    public /* synthetic */ byte[] mo22874K() {
        return C8738a.m25357a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8755c.class != obj.getClass()) {
            return false;
        }
        C8755c cVar = (C8755c) obj;
        if (!Util.m29414a((Object) this.f18596c, (Object) cVar.f18596c) || !Util.m29414a((Object) this.f18595U, (Object) cVar.f18595U)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f18596c;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18595U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ICY: title=\"");
        sb.append(this.f18596c);
        sb.append("\", url=\"");
        sb.append(this.f18595U);
        sb.append("\"");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18596c);
        parcel.writeString(this.f18595U);
    }

    C8755c(Parcel parcel) {
        this.f18596c = parcel.readString();
        this.f18595U = parcel.readString();
    }
}
