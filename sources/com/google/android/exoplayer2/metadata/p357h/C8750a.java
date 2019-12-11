package com.google.android.exoplayer2.metadata.p357h;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.h.a */
/* compiled from: PictureFrame */
public final class C8750a implements C8737b {
    public static final Creator<C8750a> CREATOR = new C8751a();

    /* renamed from: U */
    public final String f18580U;

    /* renamed from: V */
    public final String f18581V;

    /* renamed from: W */
    public final int f18582W;

    /* renamed from: X */
    public final int f18583X;

    /* renamed from: Y */
    public final int f18584Y;

    /* renamed from: Z */
    public final int f18585Z;

    /* renamed from: a0 */
    public final byte[] f18586a0;

    /* renamed from: c */
    public final int f18587c;

    /* renamed from: com.google.android.exoplayer2.metadata.h.a$a */
    /* compiled from: PictureFrame */
    static class C8751a implements Creator<C8750a> {
        C8751a() {
        }

        public C8750a createFromParcel(Parcel parcel) {
            return new C8750a(parcel);
        }

        public C8750a[] newArray(int i) {
            return new C8750a[i];
        }
    }

    C8750a(Parcel parcel) {
        this.f18587c = parcel.readInt();
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18580U = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18581V = readString2;
        this.f18582W = parcel.readInt();
        this.f18583X = parcel.readInt();
        this.f18584Y = parcel.readInt();
        this.f18585Z = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18586a0 = createByteArray;
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
        if (obj == null || C8750a.class != obj.getClass()) {
            return false;
        }
        C8750a aVar = (C8750a) obj;
        if (!(this.f18587c == aVar.f18587c && this.f18580U.equals(aVar.f18580U) && this.f18581V.equals(aVar.f18581V) && this.f18582W == aVar.f18582W && this.f18583X == aVar.f18583X && this.f18584Y == aVar.f18584Y && this.f18585Z == aVar.f18585Z && Arrays.equals(this.f18586a0, aVar.f18586a0))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f18587c) * 31) + this.f18580U.hashCode()) * 31) + this.f18581V.hashCode()) * 31) + this.f18582W) * 31) + this.f18583X) * 31) + this.f18584Y) * 31) + this.f18585Z) * 31) + Arrays.hashCode(this.f18586a0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Picture: mimeType=");
        sb.append(this.f18580U);
        sb.append(", description=");
        sb.append(this.f18581V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18587c);
        parcel.writeString(this.f18580U);
        parcel.writeString(this.f18581V);
        parcel.writeInt(this.f18582W);
        parcel.writeInt(this.f18583X);
        parcel.writeInt(this.f18584Y);
        parcel.writeInt(this.f18585Z);
        parcel.writeByteArray(this.f18586a0);
    }
}
