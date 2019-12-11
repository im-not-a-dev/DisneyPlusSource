package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.b */
/* compiled from: ApicFrame */
public final class C8758b extends C8773i {
    public static final Creator<C8758b> CREATOR = new C8759a();

    /* renamed from: U */
    public final String f18598U;

    /* renamed from: V */
    public final String f18599V;

    /* renamed from: W */
    public final int f18600W;

    /* renamed from: X */
    public final byte[] f18601X;

    /* renamed from: com.google.android.exoplayer2.metadata.j.b$a */
    /* compiled from: ApicFrame */
    static class C8759a implements Creator<C8758b> {
        C8759a() {
        }

        public C8758b createFromParcel(Parcel parcel) {
            return new C8758b(parcel);
        }

        public C8758b[] newArray(int i) {
            return new C8758b[i];
        }
    }

    public C8758b(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f18598U = str;
        this.f18599V = str2;
        this.f18600W = i;
        this.f18601X = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8758b.class != obj.getClass()) {
            return false;
        }
        C8758b bVar = (C8758b) obj;
        if (this.f18600W != bVar.f18600W || !Util.m29414a((Object) this.f18598U, (Object) bVar.f18598U) || !Util.m29414a((Object) this.f18599V, (Object) bVar.f18599V) || !Arrays.equals(this.f18601X, bVar.f18601X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (527 + this.f18600W) * 31;
        String str = this.f18598U;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18599V;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f18601X);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": mimeType=");
        sb.append(this.f18598U);
        sb.append(", description=");
        sb.append(this.f18599V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18598U);
        parcel.writeString(this.f18599V);
        parcel.writeInt(this.f18600W);
        parcel.writeByteArray(this.f18601X);
    }

    C8758b(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18598U = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18599V = readString2;
        this.f18600W = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18601X = createByteArray;
    }
}
