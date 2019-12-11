package com.google.android.exoplayer2.metadata.p356g;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.g.a */
/* compiled from: EventMessage */
public final class C8746a implements C8737b {
    public static final Creator<C8746a> CREATOR = new C8747a();

    /* renamed from: Z */
    private static final Format f18570Z = Format.m24870a(null, "application/id3", Long.MAX_VALUE);

    /* renamed from: a0 */
    private static final Format f18571a0 = Format.m24870a(null, "application/x-scte35", Long.MAX_VALUE);

    /* renamed from: U */
    public final String f18572U;

    /* renamed from: V */
    public final long f18573V;

    /* renamed from: W */
    public final long f18574W;

    /* renamed from: X */
    public final byte[] f18575X;

    /* renamed from: Y */
    private int f18576Y;

    /* renamed from: c */
    public final String f18577c;

    /* renamed from: com.google.android.exoplayer2.metadata.g.a$a */
    /* compiled from: EventMessage */
    static class C8747a implements Creator<C8746a> {
        C8747a() {
        }

        public C8746a createFromParcel(Parcel parcel) {
            return new C8746a(parcel);
        }

        public C8746a[] newArray(int i) {
            return new C8746a[i];
        }
    }

    public C8746a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f18577c = str;
        this.f18572U = str2;
        this.f18573V = j;
        this.f18574W = j2;
        this.f18575X = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Format mo22873H() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f18577c
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            com.google.android.exoplayer2.Format r0 = f18571a0
            return r0
        L_0x0042:
            com.google.android.exoplayer2.Format r0 = f18570Z
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.p356g.C8746a.mo22873H():com.google.android.exoplayer2.Format");
    }

    /* renamed from: K */
    public byte[] mo22874K() {
        if (mo22873H() != null) {
            return this.f18575X;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8746a.class != obj.getClass()) {
            return false;
        }
        C8746a aVar = (C8746a) obj;
        if (this.f18573V != aVar.f18573V || this.f18574W != aVar.f18574W || !Util.m29414a((Object) this.f18577c, (Object) aVar.f18577c) || !Util.m29414a((Object) this.f18572U, (Object) aVar.f18572U) || !Arrays.equals(this.f18575X, aVar.f18575X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f18576Y == 0) {
            String str = this.f18577c;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f18572U;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            long j = this.f18573V;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f18574W;
            this.f18576Y = ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f18575X);
        }
        return this.f18576Y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.f18577c);
        sb.append(", id=");
        sb.append(this.f18574W);
        sb.append(", durationMs=");
        sb.append(this.f18573V);
        sb.append(", value=");
        sb.append(this.f18572U);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18577c);
        parcel.writeString(this.f18572U);
        parcel.writeLong(this.f18573V);
        parcel.writeLong(this.f18574W);
        parcel.writeByteArray(this.f18575X);
    }

    C8746a(Parcel parcel) {
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18577c = readString;
        String readString2 = parcel.readString();
        Util.castNonNull(readString2);
        this.f18572U = readString2;
        this.f18573V = parcel.readLong();
        this.f18574W = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        Util.castNonNull(createByteArray);
        this.f18575X = createByteArray;
    }
}
