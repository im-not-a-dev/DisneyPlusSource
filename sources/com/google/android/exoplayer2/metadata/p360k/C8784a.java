package com.google.android.exoplayer2.metadata.p360k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.metadata.k.a */
/* compiled from: PrivateCommand */
public final class C8784a extends C8786b {
    public static final Creator<C8784a> CREATOR = new C8785a();

    /* renamed from: U */
    public final long f18641U;

    /* renamed from: V */
    public final byte[] f18642V;

    /* renamed from: c */
    public final long f18643c;

    /* renamed from: com.google.android.exoplayer2.metadata.k.a$a */
    /* compiled from: PrivateCommand */
    static class C8785a implements Creator<C8784a> {
        C8785a() {
        }

        public C8784a createFromParcel(Parcel parcel) {
            return new C8784a(parcel, null);
        }

        public C8784a[] newArray(int i) {
            return new C8784a[i];
        }
    }

    /* synthetic */ C8784a(Parcel parcel, C8785a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C8784a m25425a(C9572w wVar, int i, long j) {
        long x = wVar.mo24713x();
        byte[] bArr = new byte[(i - 4)];
        wVar.mo24685a(bArr, 0, bArr.length);
        C8784a aVar = new C8784a(x, bArr, j);
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f18643c);
        parcel.writeLong(this.f18641U);
        parcel.writeInt(this.f18642V.length);
        parcel.writeByteArray(this.f18642V);
    }

    private C8784a(long j, byte[] bArr, long j2) {
        this.f18643c = j2;
        this.f18641U = j;
        this.f18642V = bArr;
    }

    private C8784a(Parcel parcel) {
        this.f18643c = parcel.readLong();
        this.f18641U = parcel.readLong();
        this.f18642V = new byte[parcel.readInt()];
        parcel.readByteArray(this.f18642V);
    }
}
