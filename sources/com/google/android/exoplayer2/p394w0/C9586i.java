package com.google.android.exoplayer2.p394w0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.w0.i */
/* compiled from: ColorInfo */
public final class C9586i implements Parcelable {
    public static final Creator<C9586i> CREATOR = new C9587a();

    /* renamed from: U */
    public final int f22375U;

    /* renamed from: V */
    public final int f22376V;

    /* renamed from: W */
    public final byte[] f22377W;

    /* renamed from: X */
    private int f22378X;

    /* renamed from: c */
    public final int f22379c;

    /* renamed from: com.google.android.exoplayer2.w0.i$a */
    /* compiled from: ColorInfo */
    static class C9587a implements Creator<C9586i> {
        C9587a() {
        }

        public C9586i createFromParcel(Parcel parcel) {
            return new C9586i(parcel);
        }

        public C9586i[] newArray(int i) {
            return new C9586i[i];
        }
    }

    public C9586i(int i, int i2, int i3, byte[] bArr) {
        this.f22379c = i;
        this.f22375U = i2;
        this.f22376V = i3;
        this.f22377W = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9586i.class != obj.getClass()) {
            return false;
        }
        C9586i iVar = (C9586i) obj;
        if (!(this.f22379c == iVar.f22379c && this.f22375U == iVar.f22375U && this.f22376V == iVar.f22376V && Arrays.equals(this.f22377W, iVar.f22377W))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f22378X == 0) {
            this.f22378X = ((((((527 + this.f22379c) * 31) + this.f22375U) * 31) + this.f22376V) * 31) + Arrays.hashCode(this.f22377W);
        }
        return this.f22378X;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f22379c);
        String str = ", ";
        sb.append(str);
        sb.append(this.f22375U);
        sb.append(str);
        sb.append(this.f22376V);
        sb.append(str);
        sb.append(this.f22377W != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22379c);
        parcel.writeInt(this.f22375U);
        parcel.writeInt(this.f22376V);
        Util.m29403a(parcel, this.f22377W != null);
        byte[] bArr = this.f22377W;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    C9586i(Parcel parcel) {
        this.f22379c = parcel.readInt();
        this.f22375U = parcel.readInt();
        this.f22376V = parcel.readInt();
        this.f22377W = Util.m29412a(parcel) ? parcel.createByteArray() : null;
    }
}
