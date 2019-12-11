package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.metadata.j.f */
/* compiled from: CommentFrame */
public final class C8766f extends C8773i {
    public static final Creator<C8766f> CREATOR = new C8767a();

    /* renamed from: U */
    public final String f18614U;

    /* renamed from: V */
    public final String f18615V;

    /* renamed from: W */
    public final String f18616W;

    /* renamed from: com.google.android.exoplayer2.metadata.j.f$a */
    /* compiled from: CommentFrame */
    static class C8767a implements Creator<C8766f> {
        C8767a() {
        }

        public C8766f createFromParcel(Parcel parcel) {
            return new C8766f(parcel);
        }

        public C8766f[] newArray(int i) {
            return new C8766f[i];
        }
    }

    public C8766f(String str, String str2, String str3) {
        super("COMM");
        this.f18614U = str;
        this.f18615V = str2;
        this.f18616W = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8766f.class != obj.getClass()) {
            return false;
        }
        C8766f fVar = (C8766f) obj;
        if (!Util.m29414a((Object) this.f18615V, (Object) fVar.f18615V) || !Util.m29414a((Object) this.f18614U, (Object) fVar.f18614U) || !Util.m29414a((Object) this.f18616W, (Object) fVar.f18616W)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f18614U;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18615V;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18616W;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": language=");
        sb.append(this.f18614U);
        sb.append(", description=");
        sb.append(this.f18615V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18626c);
        parcel.writeString(this.f18614U);
        parcel.writeString(this.f18616W);
    }

    C8766f(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18614U = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18615V = readString2;
        String readString3 = parcel.readString();
        Util.castNonNull(readString3);
        this.f18616W = readString3;
    }
}
