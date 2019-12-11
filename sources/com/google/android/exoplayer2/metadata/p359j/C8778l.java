package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.l */
/* compiled from: PrivFrame */
public final class C8778l extends C8773i {
    public static final Creator<C8778l> CREATOR = new C8779a();

    /* renamed from: U */
    public final String f18635U;

    /* renamed from: V */
    public final byte[] f18636V;

    /* renamed from: com.google.android.exoplayer2.metadata.j.l$a */
    /* compiled from: PrivFrame */
    static class C8779a implements Creator<C8778l> {
        C8779a() {
        }

        public C8778l createFromParcel(Parcel parcel) {
            return new C8778l(parcel);
        }

        public C8778l[] newArray(int i) {
            return new C8778l[i];
        }
    }

    public C8778l(String str, byte[] bArr) {
        super("PRIV");
        this.f18635U = str;
        this.f18636V = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8778l.class != obj.getClass()) {
            return false;
        }
        C8778l lVar = (C8778l) obj;
        if (!Util.m29414a((Object) this.f18635U, (Object) lVar.f18635U) || !Arrays.equals(this.f18636V, lVar.f18636V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f18635U;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f18636V);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18626c);
        sb.append(": owner=");
        sb.append(this.f18635U);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18635U);
        parcel.writeByteArray(this.f18636V);
    }

    C8778l(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18635U = readString;
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18636V = createByteArray;
    }
}
