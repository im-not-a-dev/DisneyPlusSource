package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p394w0.C9586i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new C8666a();

    /* renamed from: U */
    public final String f18342U;

    /* renamed from: V */
    public final int f18343V;

    /* renamed from: W */
    public final int f18344W;

    /* renamed from: X */
    public final int f18345X;

    /* renamed from: Y */
    public final String f18346Y;

    /* renamed from: Z */
    public final Metadata f18347Z;

    /* renamed from: a0 */
    public final String f18348a0;

    /* renamed from: b0 */
    public final String f18349b0;

    /* renamed from: c */
    public final String f18350c;

    /* renamed from: c0 */
    public final int f18351c0;

    /* renamed from: d0 */
    public final List<byte[]> f18352d0;

    /* renamed from: e0 */
    public final DrmInitData f18353e0;

    /* renamed from: f0 */
    public final long f18354f0;

    /* renamed from: g0 */
    public final int f18355g0;

    /* renamed from: h0 */
    public final int f18356h0;

    /* renamed from: i0 */
    public final float f18357i0;

    /* renamed from: j0 */
    public final int f18358j0;

    /* renamed from: k0 */
    public final float f18359k0;

    /* renamed from: l0 */
    public final int f18360l0;

    /* renamed from: m0 */
    public final byte[] f18361m0;

    /* renamed from: n0 */
    public final C9586i f18362n0;

    /* renamed from: o0 */
    public final int f18363o0;

    /* renamed from: p0 */
    public final int f18364p0;

    /* renamed from: q0 */
    public final int f18365q0;

    /* renamed from: r0 */
    public final int f18366r0;

    /* renamed from: s0 */
    public final int f18367s0;

    /* renamed from: t0 */
    public final String f18368t0;

    /* renamed from: u0 */
    public final int f18369u0;

    /* renamed from: v0 */
    private int f18370v0;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    static class C8666a implements Creator<Format> {
        C8666a() {
        }

        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    Format(String str, String str2, int i, int i2, int i3, String str3, Metadata metadata, String str4, String str5, int i4, List<byte[]> list, DrmInitData drmInitData, long j, int i5, int i6, float f, int i7, float f2, byte[] bArr, int i8, C9586i iVar, int i9, int i10, int i11, int i12, int i13, String str6, int i14) {
        this.f18350c = str;
        this.f18342U = str2;
        this.f18343V = i;
        this.f18344W = i2;
        this.f18345X = i3;
        this.f18346Y = str3;
        this.f18347Z = metadata;
        this.f18348a0 = str4;
        this.f18349b0 = str5;
        this.f18351c0 = i4;
        this.f18352d0 = list == null ? Collections.emptyList() : list;
        this.f18353e0 = drmInitData;
        this.f18354f0 = j;
        this.f18355g0 = i5;
        this.f18356h0 = i6;
        this.f18357i0 = f;
        int i15 = i7;
        if (i15 == -1) {
            i15 = 0;
        }
        this.f18358j0 = i15;
        this.f18359k0 = f2 == -1.0f ? 1.0f : f2;
        this.f18361m0 = bArr;
        this.f18360l0 = i8;
        this.f18362n0 = iVar;
        this.f18363o0 = i9;
        this.f18364p0 = i10;
        this.f18365q0 = i11;
        int i16 = i12;
        if (i16 == -1) {
            i16 = 0;
        }
        this.f18366r0 = i16;
        int i17 = i13;
        if (i17 == -1) {
            i17 = 0;
        }
        this.f18367s0 = i17;
        this.f18368t0 = C9554k0.m29451f(str6);
        this.f18369u0 = i14;
    }

    /* renamed from: a */
    public static Format m24882a(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i, int i2, int i3, float f, List<byte[]> list, int i4, int i5) {
        int i6 = i;
        int i7 = i4;
        int i8 = i5;
        Format format = new Format(str, str2, i7, i8, i6, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    /* renamed from: b */
    public static Format m24884b(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return m24881a(str, str2, str3, str4, str5, i, i2, i3, str6, -1);
    }

    /* renamed from: c */
    public static String m24885c(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f18350c);
        sb.append(", mimeType=");
        sb.append(format.f18349b0);
        if (format.f18345X != -1) {
            sb.append(", bitrate=");
            sb.append(format.f18345X);
        }
        if (format.f18346Y != null) {
            sb.append(", codecs=");
            sb.append(format.f18346Y);
        }
        if (!(format.f18355g0 == -1 || format.f18356h0 == -1)) {
            sb.append(", res=");
            sb.append(format.f18355g0);
            sb.append("x");
            sb.append(format.f18356h0);
        }
        if (format.f18357i0 != -1.0f) {
            sb.append(", fps=");
            sb.append(format.f18357i0);
        }
        if (format.f18363o0 != -1) {
            sb.append(", channels=");
            sb.append(format.f18363o0);
        }
        if (format.f18364p0 != -1) {
            sb.append(", sample_rate=");
            sb.append(format.f18364p0);
        }
        if (format.f18368t0 != null) {
            sb.append(", language=");
            sb.append(format.f18368t0);
        }
        if (format.f18342U != null) {
            sb.append(", label=");
            sb.append(format.f18342U);
        }
        return sb.toString();
    }

    /* renamed from: X */
    public int mo22597X() {
        int i = this.f18355g0;
        if (i == -1) {
            return -1;
        }
        int i2 = this.f18356h0;
        if (i2 == -1) {
            return -1;
        }
        return i * i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i = this.f18370v0;
        if (i != 0) {
            int i2 = format.f18370v0;
            if (!(i2 == 0 || i == i2)) {
                return false;
            }
        }
        if (!(this.f18343V == format.f18343V && this.f18344W == format.f18344W && this.f18345X == format.f18345X && this.f18351c0 == format.f18351c0 && this.f18354f0 == format.f18354f0 && this.f18355g0 == format.f18355g0 && this.f18356h0 == format.f18356h0 && this.f18358j0 == format.f18358j0 && this.f18360l0 == format.f18360l0 && this.f18363o0 == format.f18363o0 && this.f18364p0 == format.f18364p0 && this.f18365q0 == format.f18365q0 && this.f18366r0 == format.f18366r0 && this.f18367s0 == format.f18367s0 && this.f18369u0 == format.f18369u0 && Float.compare(this.f18357i0, format.f18357i0) == 0 && Float.compare(this.f18359k0, format.f18359k0) == 0 && C9554k0.m29414a((Object) this.f18350c, (Object) format.f18350c) && C9554k0.m29414a((Object) this.f18342U, (Object) format.f18342U) && C9554k0.m29414a((Object) this.f18346Y, (Object) format.f18346Y) && C9554k0.m29414a((Object) this.f18348a0, (Object) format.f18348a0) && C9554k0.m29414a((Object) this.f18349b0, (Object) format.f18349b0) && C9554k0.m29414a((Object) this.f18368t0, (Object) format.f18368t0) && Arrays.equals(this.f18361m0, format.f18361m0) && C9554k0.m29414a((Object) this.f18347Z, (Object) format.f18347Z) && C9554k0.m29414a((Object) this.f18362n0, (Object) format.f18362n0) && C9554k0.m29414a((Object) this.f18353e0, (Object) format.f18353e0) && mo22607b(format))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f18370v0 == 0) {
            String str = this.f18350c;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18342U;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f18343V) * 31) + this.f18344W) * 31) + this.f18345X) * 31;
            String str3 = this.f18346Y;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.f18347Z;
            int hashCode4 = (hashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.f18348a0;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f18349b0;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f18351c0) * 31) + ((int) this.f18354f0)) * 31) + this.f18355g0) * 31) + this.f18356h0) * 31) + Float.floatToIntBits(this.f18357i0)) * 31) + this.f18358j0) * 31) + Float.floatToIntBits(this.f18359k0)) * 31) + this.f18360l0) * 31) + this.f18363o0) * 31) + this.f18364p0) * 31) + this.f18365q0) * 31) + this.f18366r0) * 31) + this.f18367s0) * 31;
            String str6 = this.f18368t0;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.f18370v0 = ((hashCode6 + i) * 31) + this.f18369u0;
        }
        return this.f18370v0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.f18350c);
        String str = ", ";
        sb.append(str);
        sb.append(this.f18342U);
        sb.append(str);
        sb.append(this.f18348a0);
        sb.append(str);
        sb.append(this.f18349b0);
        sb.append(str);
        sb.append(this.f18346Y);
        sb.append(str);
        sb.append(this.f18345X);
        sb.append(str);
        sb.append(this.f18368t0);
        sb.append(", [");
        sb.append(this.f18355g0);
        sb.append(str);
        sb.append(this.f18356h0);
        sb.append(str);
        sb.append(this.f18357i0);
        sb.append("], [");
        sb.append(this.f18363o0);
        sb.append(str);
        sb.append(this.f18364p0);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18350c);
        parcel.writeString(this.f18342U);
        parcel.writeInt(this.f18343V);
        parcel.writeInt(this.f18344W);
        parcel.writeInt(this.f18345X);
        parcel.writeString(this.f18346Y);
        boolean z = false;
        parcel.writeParcelable(this.f18347Z, 0);
        parcel.writeString(this.f18348a0);
        parcel.writeString(this.f18349b0);
        parcel.writeInt(this.f18351c0);
        int size = this.f18352d0.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f18352d0.get(i2));
        }
        parcel.writeParcelable(this.f18353e0, 0);
        parcel.writeLong(this.f18354f0);
        parcel.writeInt(this.f18355g0);
        parcel.writeInt(this.f18356h0);
        parcel.writeFloat(this.f18357i0);
        parcel.writeInt(this.f18358j0);
        parcel.writeFloat(this.f18359k0);
        if (this.f18361m0 != null) {
            z = true;
        }
        C9554k0.m29403a(parcel, z);
        byte[] bArr = this.f18361m0;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f18360l0);
        parcel.writeParcelable(this.f18362n0, i);
        parcel.writeInt(this.f18363o0);
        parcel.writeInt(this.f18364p0);
        parcel.writeInt(this.f18365q0);
        parcel.writeInt(this.f18366r0);
        parcel.writeInt(this.f18367s0);
        parcel.writeString(this.f18368t0);
        parcel.writeInt(this.f18369u0);
    }

    /* renamed from: a */
    public static Format m24871a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m24872a(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C9586i) null, drmInitData);
    }

    /* renamed from: b */
    public Format mo22605b(int i) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, i, this.f18352d0, this.f18353e0, this.f18354f0, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public static Format m24872a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C9586i iVar, DrmInitData drmInitData) {
        int i7 = i;
        Format format = new Format(str, null, 0, 0, i7, str3, null, null, str2, i2, list, drmInitData, Long.MAX_VALUE, i3, i4, f, i5, f2, bArr, i6, iVar, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    /* renamed from: b */
    public Format mo22606b(long j) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, this.f18353e0, j, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public static Format m24883a(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i, int i2, int i3, List<byte[]> list, int i4, int i5, String str6) {
        int i6 = i;
        int i7 = i4;
        int i8 = i5;
        Format format = new Format(str, str2, i7, i8, i6, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1);
        return format;
    }

    /* renamed from: b */
    public boolean mo22607b(Format format) {
        if (this.f18352d0.size() != format.f18352d0.size()) {
            return false;
        }
        for (int i = 0; i < this.f18352d0.size(); i++) {
            if (!Arrays.equals((byte[]) this.f18352d0.get(i), (byte[]) format.f18352d0.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Format m24875a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return m24874a(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: a */
    public static Format m24874a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m24873a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, (Metadata) null);
    }

    /* renamed from: a */
    public static Format m24873a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        int i9 = i;
        int i10 = i8;
        Metadata metadata2 = metadata;
        Format format = new Format(str, null, i10, 0, i9, str3, metadata2, null, str2, i2, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str4, -1);
        return format;
    }

    /* renamed from: a */
    public static Format m24881a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Format format = new Format(str, str2, i6, i7, i5, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4);
        return format;
    }

    /* renamed from: a */
    public static Format m24868a(String str, String str2, int i, String str3) {
        return m24869a(str, str2, i, str3, (DrmInitData) null);
    }

    /* renamed from: a */
    public static Format m24869a(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return m24876a(str, str2, (String) null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m24877a(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData, long j) {
        return m24876a(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m24876a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        int i4 = i;
        int i5 = i2;
        List<byte[]> list2 = list;
        Format format = new Format(str, null, i5, 0, i4, str3, null, null, str2, -1, list2, drmInitData, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i3);
        return format;
    }

    /* renamed from: a */
    public static Format m24878a(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData) {
        int i3 = i;
        int i4 = i2;
        Format format = new Format(str, null, i4, 0, i3, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1);
        return format;
    }

    /* renamed from: a */
    public static Format m24880a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        Format format = new Format(str, str2, i5, i6, i4, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1);
        return format;
    }

    /* renamed from: a */
    public static Format m24870a(String str, String str2, long j) {
        Format format = new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    /* renamed from: a */
    public static Format m24879a(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        int i2 = i;
        Format format = new Format(str, null, 0, 0, i2, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
        return format;
    }

    /* renamed from: a */
    public Format mo22604a(String str, String str2, String str3, String str4, Metadata metadata, int i, int i2, int i3, int i4, int i5, String str5) {
        Metadata metadata2 = this.f18347Z;
        Metadata metadata3 = metadata;
        Format format = new Format(str, str2, i5, this.f18344W, i, str4, metadata2 != null ? metadata2.mo22864a(metadata3) : metadata3, this.f18348a0, str3, this.f18351c0, this.f18352d0, this.f18353e0, this.f18354f0, i2, i3, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, i4, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, str5, this.f18369u0);
        return format;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Format mo22601a(com.google.android.exoplayer2.Format r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.f18349b0
            int r2 = com.google.android.exoplayer2.p393v0.C9566t.m29513f(r2)
            java.lang.String r4 = r1.f18350c
            java.lang.String r3 = r1.f18342U
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.f18342U
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.f18368t0
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.f18368t0
            if (r6 == 0) goto L_0x0026
            r31 = r6
            goto L_0x0028
        L_0x0026:
            r31 = r3
        L_0x0028:
            int r3 = r0.f18345X
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.f18345X
        L_0x002f:
            r8 = r3
            java.lang.String r3 = r0.f18346Y
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.f18346Y
            java.lang.String r6 = com.google.android.exoplayer2.p393v0.C9554k0.m29396a(r6, r2)
            java.lang.String[] r9 = com.google.android.exoplayer2.p393v0.C9554k0.m29456j(r6)
            int r9 = r9.length
            if (r9 != r7) goto L_0x0043
            r9 = r6
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            com.google.android.exoplayer2.metadata.Metadata r3 = r0.f18347Z
            if (r3 != 0) goto L_0x004b
            com.google.android.exoplayer2.metadata.Metadata r3 = r1.f18347Z
            goto L_0x0051
        L_0x004b:
            com.google.android.exoplayer2.metadata.Metadata r6 = r1.f18347Z
            com.google.android.exoplayer2.metadata.Metadata r3 = r3.mo22864a(r6)
        L_0x0051:
            r10 = r3
            float r3 = r0.f18357i0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            r6 = 2
            if (r2 != r6) goto L_0x0062
            float r2 = r1.f18357i0
            r20 = r2
            goto L_0x0064
        L_0x0062:
            r20 = r3
        L_0x0064:
            int r2 = r0.f18343V
            int r3 = r1.f18343V
            r6 = r2 | r3
            int r2 = r0.f18344W
            int r3 = r1.f18344W
            r7 = r2 | r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = r1.f18353e0
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.f18353e0
            com.google.android.exoplayer2.drm.DrmInitData r15 = com.google.android.exoplayer2.drm.DrmInitData.m25158a(r1, r2)
            com.google.android.exoplayer2.Format r1 = new com.google.android.exoplayer2.Format
            r3 = r1
            java.lang.String r11 = r0.f18348a0
            java.lang.String r12 = r0.f18349b0
            int r13 = r0.f18351c0
            java.util.List<byte[]> r14 = r0.f18352d0
            r34 = r1
            long r1 = r0.f18354f0
            r16 = r1
            int r1 = r0.f18355g0
            r18 = r1
            int r1 = r0.f18356h0
            r19 = r1
            int r1 = r0.f18358j0
            r21 = r1
            float r1 = r0.f18359k0
            r22 = r1
            byte[] r1 = r0.f18361m0
            r23 = r1
            int r1 = r0.f18360l0
            r24 = r1
            com.google.android.exoplayer2.w0.i r1 = r0.f18362n0
            r25 = r1
            int r1 = r0.f18363o0
            r26 = r1
            int r1 = r0.f18364p0
            r27 = r1
            int r1 = r0.f18365q0
            r28 = r1
            int r1 = r0.f18366r0
            r29 = r1
            int r1 = r0.f18367s0
            r30 = r1
            int r1 = r0.f18369u0
            r32 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.mo22601a(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    Format(Parcel parcel) {
        this.f18350c = parcel.readString();
        this.f18342U = parcel.readString();
        this.f18343V = parcel.readInt();
        this.f18344W = parcel.readInt();
        this.f18345X = parcel.readInt();
        this.f18346Y = parcel.readString();
        this.f18347Z = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f18348a0 = parcel.readString();
        this.f18349b0 = parcel.readString();
        this.f18351c0 = parcel.readInt();
        int readInt = parcel.readInt();
        this.f18352d0 = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f18352d0.add(parcel.createByteArray());
        }
        this.f18353e0 = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f18354f0 = parcel.readLong();
        this.f18355g0 = parcel.readInt();
        this.f18356h0 = parcel.readInt();
        this.f18357i0 = parcel.readFloat();
        this.f18358j0 = parcel.readInt();
        this.f18359k0 = parcel.readFloat();
        this.f18361m0 = C9554k0.m29412a(parcel) ? parcel.createByteArray() : null;
        this.f18360l0 = parcel.readInt();
        this.f18362n0 = (C9586i) parcel.readParcelable(C9586i.class.getClassLoader());
        this.f18363o0 = parcel.readInt();
        this.f18364p0 = parcel.readInt();
        this.f18365q0 = parcel.readInt();
        this.f18366r0 = parcel.readInt();
        this.f18367s0 = parcel.readInt();
        this.f18368t0 = parcel.readString();
        this.f18369u0 = parcel.readInt();
    }

    /* renamed from: a */
    public Format mo22600a(int i, int i2) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, this.f18353e0, this.f18354f0, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, i, i2, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public Format mo22598a(float f) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, this.f18353e0, this.f18354f0, this.f18355g0, this.f18356h0, f, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public Format mo22602a(DrmInitData drmInitData) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, drmInitData, this.f18354f0, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public Format mo22603a(Metadata metadata) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, this.f18345X, this.f18346Y, metadata, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, this.f18353e0, this.f18354f0, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }

    /* renamed from: a */
    public Format mo22599a(int i) {
        Format format = new Format(this.f18350c, this.f18342U, this.f18343V, this.f18344W, i, this.f18346Y, this.f18347Z, this.f18348a0, this.f18349b0, this.f18351c0, this.f18352d0, this.f18353e0, this.f18354f0, this.f18355g0, this.f18356h0, this.f18357i0, this.f18358j0, this.f18359k0, this.f18361m0, this.f18360l0, this.f18362n0, this.f18363o0, this.f18364p0, this.f18365q0, this.f18366r0, this.f18367s0, this.f18368t0, this.f18369u0);
        return format;
    }
}
