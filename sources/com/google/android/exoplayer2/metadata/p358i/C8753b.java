package com.google.android.exoplayer2.metadata.p358i;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.metadata.i.b */
/* compiled from: IcyHeaders */
public final class C8753b implements C8737b {
    public static final Creator<C8753b> CREATOR = new C8754a();

    /* renamed from: U */
    public final String f18589U;

    /* renamed from: V */
    public final String f18590V;

    /* renamed from: W */
    public final String f18591W;

    /* renamed from: X */
    public final boolean f18592X;

    /* renamed from: Y */
    public final int f18593Y;

    /* renamed from: c */
    public final int f18594c;

    /* renamed from: com.google.android.exoplayer2.metadata.i.b$a */
    /* compiled from: IcyHeaders */
    static class C8754a implements Creator<C8753b> {
        C8754a() {
        }

        public C8753b createFromParcel(Parcel parcel) {
            return new C8753b(parcel);
        }

        public C8753b[] newArray(int i) {
            return new C8753b[i];
        }
    }

    public C8753b(int i, String str, String str2, String str3, boolean z, int i2) {
        Assertions.m29299a(i2 == -1 || i2 > 0);
        this.f18594c = i;
        this.f18589U = str;
        this.f18590V = str2;
        this.f18591W = str3;
        this.f18592X = z;
        this.f18593Y = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.p358i.C8753b m25387a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = 0
            r6 = -1
        L_0x0037:
            r7 = r6
            goto L_0x0053
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0053
        L_0x0051:
            r1 = 0
            r7 = -1
        L_0x0053:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0066
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            goto L_0x0068
        L_0x0066:
            r6 = r1
            r1 = r8
        L_0x0068:
            java.lang.String r9 = "icy-name"
            java.lang.Object r9 = r13.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x007b
            java.lang.Object r6 = r9.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r9 = r6
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r9 = r8
        L_0x007c:
            java.lang.String r10 = "icy-url"
            java.lang.Object r10 = r13.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x008f
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r10 = r6
            r6 = 1
            goto L_0x0090
        L_0x008f:
            r10 = r8
        L_0x0090:
            java.lang.String r11 = "icy-pub"
            java.lang.Object r11 = r13.get(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x00a9
            java.lang.Object r6 = r11.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "1"
            boolean r6 = r6.equals(r11)
            r11 = r6
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            java.lang.String r12 = "icy-metaint"
            java.lang.Object r13 = r13.get(r12)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00eb
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            if (r5 <= 0) goto L_0x00c3
            r3 = r5
            r6 = 1
            goto L_0x00e9
        L_0x00c3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d6 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d6 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d6 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d6 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d6 }
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r4)     // Catch:{ NumberFormatException -> 0x00d6 }
            goto L_0x00e9
        L_0x00d6:
            r3 = r5
        L_0x00d7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r13)
        L_0x00e9:
            r12 = r3
            goto L_0x00ec
        L_0x00eb:
            r12 = -1
        L_0x00ec:
            if (r6 == 0) goto L_0x00f6
            com.google.android.exoplayer2.metadata.i.b r13 = new com.google.android.exoplayer2.metadata.i.b
            r6 = r13
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x00f7
        L_0x00f6:
            r13 = r8
        L_0x00f7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.p358i.C8753b.m25387a(java.util.Map):com.google.android.exoplayer2.metadata.i.b");
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
        if (obj == null || C8753b.class != obj.getClass()) {
            return false;
        }
        C8753b bVar = (C8753b) obj;
        if (this.f18594c != bVar.f18594c || !Util.m29414a((Object) this.f18589U, (Object) bVar.f18589U) || !Util.m29414a((Object) this.f18590V, (Object) bVar.f18590V) || !Util.m29414a((Object) this.f18591W, (Object) bVar.f18591W) || this.f18592X != bVar.f18592X || this.f18593Y != bVar.f18593Y) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (527 + this.f18594c) * 31;
        String str = this.f18589U;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18590V;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18591W;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f18592X ? 1 : 0)) * 31) + this.f18593Y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IcyHeaders: name=\"");
        sb.append(this.f18590V);
        sb.append("\", genre=\"");
        sb.append(this.f18589U);
        sb.append("\", bitrate=");
        sb.append(this.f18594c);
        sb.append(", metadataInterval=");
        sb.append(this.f18593Y);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18594c);
        parcel.writeString(this.f18589U);
        parcel.writeString(this.f18590V);
        parcel.writeString(this.f18591W);
        Util.m29403a(parcel, this.f18592X);
        parcel.writeInt(this.f18593Y);
    }

    C8753b(Parcel parcel) {
        this.f18594c = parcel.readInt();
        this.f18589U = parcel.readString();
        this.f18590V = parcel.readString();
        this.f18591W = parcel.readString();
        this.f18592X = Util.m29412a(parcel);
        this.f18593Y = parcel.readInt();
    }
}
