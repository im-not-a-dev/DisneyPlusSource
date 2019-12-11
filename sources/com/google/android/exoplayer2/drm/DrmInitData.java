package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator<C8692b>, Parcelable {
    public static final Creator<DrmInitData> CREATOR = new C8691a();

    /* renamed from: U */
    private int f18459U;

    /* renamed from: V */
    public final String f18460V;

    /* renamed from: W */
    public final int f18461W;

    /* renamed from: c */
    private final C8692b[] f18462c;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    static class C8691a implements Creator<DrmInitData> {
        C8691a() {
        }

        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$b */
    public static final class C8692b implements Parcelable {
        public static final Creator<C8692b> CREATOR = new C8693a();
        /* access modifiers changed from: private */

        /* renamed from: U */
        public final UUID f18463U;

        /* renamed from: V */
        public final String f18464V;

        /* renamed from: W */
        public final String f18465W;

        /* renamed from: X */
        public final byte[] f18466X;

        /* renamed from: Y */
        public final boolean f18467Y;

        /* renamed from: c */
        private int f18468c;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$b$a */
        static class C8693a implements Creator<C8692b> {
            C8693a() {
            }

            public C8692b createFromParcel(Parcel parcel) {
                return new C8692b(parcel);
            }

            public C8692b[] newArray(int i) {
                return new C8692b[i];
            }
        }

        public C8692b(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        /* renamed from: X */
        public boolean mo22760X() {
            return this.f18466X != null;
        }

        /* renamed from: a */
        public boolean mo22763a(UUID uuid) {
            return C8883r.f19042a.equals(this.f18463U) || uuid.equals(this.f18463U);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8692b)) {
                return false;
            }
            boolean z = true;
            if (obj == this) {
                return true;
            }
            C8692b bVar = (C8692b) obj;
            if (!C9554k0.m29414a((Object) this.f18464V, (Object) bVar.f18464V) || !C9554k0.m29414a((Object) this.f18465W, (Object) bVar.f18465W) || !C9554k0.m29414a((Object) this.f18463U, (Object) bVar.f18463U) || !Arrays.equals(this.f18466X, bVar.f18466X)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.f18468c == 0) {
                int hashCode = this.f18463U.hashCode() * 31;
                String str = this.f18464V;
                this.f18468c = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f18465W.hashCode()) * 31) + Arrays.hashCode(this.f18466X);
            }
            return this.f18468c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f18463U.getMostSignificantBits());
            parcel.writeLong(this.f18463U.getLeastSignificantBits());
            parcel.writeString(this.f18464V);
            parcel.writeString(this.f18465W);
            parcel.writeByteArray(this.f18466X);
            parcel.writeByte(this.f18467Y ? (byte) 1 : 0);
        }

        public C8692b(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        /* renamed from: a */
        public boolean mo22762a(C8692b bVar) {
            return mo22760X() && !bVar.mo22760X() && mo22763a(bVar.f18463U);
        }

        public C8692b(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            C9537e.m29296a(uuid);
            this.f18463U = uuid;
            this.f18464V = str;
            C9537e.m29296a(str2);
            this.f18465W = str2;
            this.f18466X = bArr;
            this.f18467Y = z;
        }

        /* renamed from: a */
        public C8692b mo22761a(byte[] bArr) {
            C8692b bVar = new C8692b(this.f18463U, this.f18464V, this.f18465W, bArr, this.f18467Y);
            return bVar;
        }

        C8692b(Parcel parcel) {
            this.f18463U = new UUID(parcel.readLong(), parcel.readLong());
            this.f18464V = parcel.readString();
            String readString = parcel.readString();
            C9554k0.m29394a(readString);
            this.f18465W = readString;
            this.f18466X = parcel.createByteArray();
            this.f18467Y = parcel.readByte() != 0;
        }
    }

    public DrmInitData(List<C8692b> list) {
        this(null, false, (C8692b[]) list.toArray(new C8692b[0]));
    }

    /* renamed from: a */
    public static DrmInitData m25158a(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        C8692b[] bVarArr;
        C8692b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f18460V;
            for (C8692b bVar : drmInitData.f18462c) {
                if (bVar.mo22760X()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f18460V;
            }
            int size = arrayList.size();
            for (C8692b bVar2 : drmInitData2.f18462c) {
                if (bVar2.mo22760X() && !m25159a(arrayList, size, bVar2.f18463U)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<C8692b>) arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!C9554k0.m29414a((Object) this.f18460V, (Object) drmInitData.f18460V) || !Arrays.equals(this.f18462c, drmInitData.f18462c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f18459U == 0) {
            String str = this.f18460V;
            this.f18459U = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18462c);
        }
        return this.f18459U;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18460V);
        parcel.writeTypedArray(this.f18462c, 0);
    }

    public DrmInitData(String str, List<C8692b> list) {
        this(str, false, (C8692b[]) list.toArray(new C8692b[0]));
    }

    public DrmInitData(C8692b... bVarArr) {
        this((String) null, bVarArr);
    }

    public DrmInitData(String str, C8692b... bVarArr) {
        this(str, true, bVarArr);
    }

    private DrmInitData(String str, boolean z, C8692b... bVarArr) {
        this.f18460V = str;
        if (z) {
            bVarArr = (C8692b[]) bVarArr.clone();
        }
        this.f18462c = bVarArr;
        this.f18461W = bVarArr.length;
        Arrays.sort(this.f18462c, this);
    }

    DrmInitData(Parcel parcel) {
        this.f18460V = parcel.readString();
        Object[] createTypedArray = parcel.createTypedArray(C8692b.CREATOR);
        C9554k0.m29394a(createTypedArray);
        this.f18462c = (C8692b[]) createTypedArray;
        this.f18461W = this.f18462c.length;
    }

    /* renamed from: a */
    public C8692b mo22750a(int i) {
        return this.f18462c[i];
    }

    /* renamed from: a */
    public DrmInitData mo22752a(String str) {
        if (C9554k0.m29414a((Object) this.f18460V, (Object) str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f18462c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.DrmInitData mo22751a(com.google.android.exoplayer2.drm.DrmInitData r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f18460V
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.f18460V
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            com.google.android.exoplayer2.p393v0.C9537e.m29301b(r0)
            java.lang.String r0 = r2.f18460V
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.f18460V
        L_0x001c:
            com.google.android.exoplayer2.drm.DrmInitData$b[] r1 = r2.f18462c
            com.google.android.exoplayer2.drm.DrmInitData$b[] r3 = r3.f18462c
            java.lang.Object[] r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29421a((T[]) r1, (T[]) r3)
            com.google.android.exoplayer2.drm.DrmInitData$b[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.C8692b[]) r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.mo22751a(com.google.android.exoplayer2.drm.DrmInitData):com.google.android.exoplayer2.drm.DrmInitData");
    }

    /* renamed from: a */
    public int compare(C8692b bVar, C8692b bVar2) {
        if (C8883r.f19042a.equals(bVar.f18463U)) {
            return C8883r.f19042a.equals(bVar2.f18463U) ? 0 : 1;
        }
        return bVar.f18463U.compareTo(bVar2.f18463U);
    }

    /* renamed from: a */
    private static boolean m25159a(ArrayList<C8692b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((C8692b) arrayList.get(i2)).f18463U.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
