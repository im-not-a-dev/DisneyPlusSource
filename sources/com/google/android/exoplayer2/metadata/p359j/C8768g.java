package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.g */
/* compiled from: GeobFrame */
public final class C8768g extends C8773i {
    public static final Creator<C8768g> CREATOR = new C8769a();

    /* renamed from: U */
    public final String f18617U;

    /* renamed from: V */
    public final String f18618V;

    /* renamed from: W */
    public final String f18619W;

    /* renamed from: X */
    public final byte[] f18620X;

    /* renamed from: com.google.android.exoplayer2.metadata.j.g$a */
    /* compiled from: GeobFrame */
    static class C8769a implements Creator<C8768g> {
        C8769a() {
        }

        public C8768g createFromParcel(Parcel parcel) {
            return new C8768g(parcel);
        }

        public C8768g[] newArray(int i) {
            return new C8768g[i];
        }
    }

    public C8768g(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f18617U = str;
        this.f18618V = str2;
        this.f18619W = str3;
        this.f18620X = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8768g.class != obj.getClass()) {
            return false;
        }
        C8768g gVar = (C8768g) obj;
        if (!Util.m29414a((Object) this.f18617U, (Object) gVar.f18617U) || !Util.m29414a((Object) this.f18618V, (Object) gVar.f18618V) || !Util.m29414a((Object) this.f18619W, (Object) gVar.f18619W) || !Arrays.equals(this.f18620X, gVar.f18620X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f18617U;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18618V;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18619W;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f18620X);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": mimeType=");
        sb.append(this.f18617U);
        sb.append(", filename=");
        sb.append(this.f18618V);
        sb.append(", description=");
        sb.append(this.f18619W);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18617U);
        parcel.writeString(this.f18618V);
        parcel.writeString(this.f18619W);
        parcel.writeByteArray(this.f18620X);
    }

    C8768g(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18617U = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18618V = readString2;
        String readString3 = parcel.readString();
        Util.castNonNull(readString3);
        this.f18619W = readString3;
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18620X = createByteArray;
    }
}
