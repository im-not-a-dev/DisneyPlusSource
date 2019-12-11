package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Creator<StreamKey> CREATOR = new C8806a();

    /* renamed from: U */
    public final int f18722U;

    /* renamed from: V */
    public final int f18723V;

    /* renamed from: c */
    public final int f18724c;

    /* renamed from: com.google.android.exoplayer2.offline.StreamKey$a */
    static class C8806a implements Creator<StreamKey> {
        C8806a() {
        }

        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    /* renamed from: a */
    public int compareTo(StreamKey streamKey) {
        int i = this.f18724c - streamKey.f18724c;
        if (i != 0) {
            return i;
        }
        int i2 = this.f18722U - streamKey.f18722U;
        return i2 == 0 ? this.f18723V - streamKey.f18723V : i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (!(this.f18724c == streamKey.f18724c && this.f18722U == streamKey.f18722U && this.f18723V == streamKey.f18723V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.f18724c * 31) + this.f18722U) * 31) + this.f18723V;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18724c);
        String str = ".";
        sb.append(str);
        sb.append(this.f18722U);
        sb.append(str);
        sb.append(this.f18723V);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18724c);
        parcel.writeInt(this.f18722U);
        parcel.writeInt(this.f18723V);
    }

    public StreamKey(int i, int i2, int i3) {
        this.f18724c = i;
        this.f18722U = i2;
        this.f18723V = i3;
    }

    StreamKey(Parcel parcel) {
        this.f18724c = parcel.readInt();
        this.f18722U = parcel.readInt();
        this.f18723V = parcel.readInt();
    }
}
