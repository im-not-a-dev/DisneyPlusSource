package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.d */
/* compiled from: ChapterFrame */
public final class C8762d extends C8773i {
    public static final Creator<C8762d> CREATOR = new C8763a();

    /* renamed from: U */
    public final String f18603U;

    /* renamed from: V */
    public final int f18604V;

    /* renamed from: W */
    public final int f18605W;

    /* renamed from: X */
    public final long f18606X;

    /* renamed from: Y */
    public final long f18607Y;

    /* renamed from: Z */
    private final C8773i[] f18608Z;

    /* renamed from: com.google.android.exoplayer2.metadata.j.d$a */
    /* compiled from: ChapterFrame */
    static class C8763a implements Creator<C8762d> {
        C8763a() {
        }

        public C8762d createFromParcel(Parcel parcel) {
            return new C8762d(parcel);
        }

        public C8762d[] newArray(int i) {
            return new C8762d[i];
        }
    }

    public C8762d(String str, int i, int i2, long j, long j2, C8773i[] iVarArr) {
        super("CHAP");
        this.f18603U = str;
        this.f18604V = i;
        this.f18605W = i2;
        this.f18606X = j;
        this.f18607Y = j2;
        this.f18608Z = iVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8762d.class != obj.getClass()) {
            return false;
        }
        C8762d dVar = (C8762d) obj;
        if (!(this.f18604V == dVar.f18604V && this.f18605W == dVar.f18605W && this.f18606X == dVar.f18606X && this.f18607Y == dVar.f18607Y && C9554k0.m29414a((Object) this.f18603U, (Object) dVar.f18603U) && Arrays.equals(this.f18608Z, dVar.f18608Z))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((((((527 + this.f18604V) * 31) + this.f18605W) * 31) + ((int) this.f18606X)) * 31) + ((int) this.f18607Y)) * 31;
        String str = this.f18603U;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18603U);
        parcel.writeInt(this.f18604V);
        parcel.writeInt(this.f18605W);
        parcel.writeLong(this.f18606X);
        parcel.writeLong(this.f18607Y);
        parcel.writeInt(this.f18608Z.length);
        for (C8773i writeParcelable : this.f18608Z) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    C8762d(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        C9554k0.m29394a(readString);
        this.f18603U = readString;
        this.f18604V = parcel.readInt();
        this.f18605W = parcel.readInt();
        this.f18606X = parcel.readLong();
        this.f18607Y = parcel.readLong();
        int readInt = parcel.readInt();
        this.f18608Z = new C8773i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f18608Z[i] = (C8773i) parcel.readParcelable(C8773i.class.getClassLoader());
        }
    }
}
