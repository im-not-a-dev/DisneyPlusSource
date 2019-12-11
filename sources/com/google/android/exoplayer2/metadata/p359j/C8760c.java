package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.c */
/* compiled from: BinaryFrame */
public final class C8760c extends C8773i {
    public static final Creator<C8760c> CREATOR = new C8761a();

    /* renamed from: U */
    public final byte[] f18602U;

    /* renamed from: com.google.android.exoplayer2.metadata.j.c$a */
    /* compiled from: BinaryFrame */
    static class C8761a implements Creator<C8760c> {
        C8761a() {
        }

        public C8760c createFromParcel(Parcel parcel) {
            return new C8760c(parcel);
        }

        public C8760c[] newArray(int i) {
            return new C8760c[i];
        }
    }

    public C8760c(String str, byte[] bArr) {
        super(str);
        this.f18602U = bArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8760c.class != obj.getClass()) {
            return false;
        }
        C8760c cVar = (C8760c) obj;
        if (!this.f18626c.equals(cVar.f18626c) || !Arrays.equals(this.f18602U, cVar.f18602U)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f18626c.hashCode()) * 31) + Arrays.hashCode(this.f18602U);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18626c);
        parcel.writeByteArray(this.f18602U);
    }

    C8760c(Parcel parcel) {
        String readString = parcel.readString();
        Util.castNonNull(readString);
        super(readString);
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18602U = createByteArray;
    }
}
