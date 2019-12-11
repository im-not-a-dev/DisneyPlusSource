package com.google.android.exoplayer2.p366s0.p371v;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.v.h */
/* compiled from: MdtaMetadataEntry */
public final class C8975h implements C8737b {
    public static final Creator<C8975h> CREATOR = new C8976a();

    /* renamed from: U */
    public final byte[] f19598U;

    /* renamed from: V */
    public final int f19599V;

    /* renamed from: W */
    public final int f19600W;

    /* renamed from: c */
    public final String f19601c;

    /* renamed from: com.google.android.exoplayer2.s0.v.h$a */
    /* compiled from: MdtaMetadataEntry */
    static class C8976a implements Creator<C8975h> {
        C8976a() {
        }

        public C8975h createFromParcel(Parcel parcel) {
            return new C8975h(parcel, null);
        }

        public C8975h[] newArray(int i) {
            return new C8975h[i];
        }
    }

    /* synthetic */ C8975h(Parcel parcel, C8976a aVar) {
        this(parcel);
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
        if (obj == null || C8975h.class != obj.getClass()) {
            return false;
        }
        C8975h hVar = (C8975h) obj;
        if (!this.f19601c.equals(hVar.f19601c) || !Arrays.equals(this.f19598U, hVar.f19598U) || this.f19599V != hVar.f19599V || this.f19600W != hVar.f19600W) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f19601c.hashCode()) * 31) + Arrays.hashCode(this.f19598U)) * 31) + this.f19599V) * 31) + this.f19600W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mdta: key=");
        sb.append(this.f19601c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19601c);
        parcel.writeInt(this.f19598U.length);
        parcel.writeByteArray(this.f19598U);
        parcel.writeInt(this.f19599V);
        parcel.writeInt(this.f19600W);
    }

    public C8975h(String str, byte[] bArr, int i, int i2) {
        this.f19601c = str;
        this.f19598U = bArr;
        this.f19599V = i;
        this.f19600W = i2;
    }

    private C8975h(Parcel parcel) {
        String readString = parcel.readString();
        C9554k0.m29394a(readString);
        this.f19601c = readString;
        this.f19598U = new byte[parcel.readInt()];
        parcel.readByteArray(this.f19598U);
        this.f19599V = parcel.readInt();
        this.f19600W = parcel.readInt();
    }
}
