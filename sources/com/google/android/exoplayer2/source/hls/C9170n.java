package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.n */
/* compiled from: HlsTrackMetadataEntry */
public final class C9170n implements C8737b {
    public static final Creator<C9170n> CREATOR = new C9171a();

    /* renamed from: U */
    public final String f20681U;

    /* renamed from: V */
    public final List<C9172b> f20682V;

    /* renamed from: c */
    public final String f20683c;

    /* renamed from: com.google.android.exoplayer2.source.hls.n$a */
    /* compiled from: HlsTrackMetadataEntry */
    static class C9171a implements Creator<C9170n> {
        C9171a() {
        }

        public C9170n createFromParcel(Parcel parcel) {
            return new C9170n(parcel);
        }

        public C9170n[] newArray(int i) {
            return new C9170n[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.n$b */
    /* compiled from: HlsTrackMetadataEntry */
    public static final class C9172b implements Parcelable {
        public static final Creator<C9172b> CREATOR = new C9173a();

        /* renamed from: U */
        public final String f20684U;

        /* renamed from: V */
        public final String f20685V;

        /* renamed from: W */
        public final String f20686W;

        /* renamed from: X */
        public final String f20687X;

        /* renamed from: c */
        public final long f20688c;

        /* renamed from: com.google.android.exoplayer2.source.hls.n$b$a */
        /* compiled from: HlsTrackMetadataEntry */
        static class C9173a implements Creator<C9172b> {
            C9173a() {
            }

            public C9172b createFromParcel(Parcel parcel) {
                return new C9172b(parcel);
            }

            public C9172b[] newArray(int i) {
                return new C9172b[i];
            }
        }

        public C9172b(long j, String str, String str2, String str3, String str4) {
            this.f20688c = j;
            this.f20684U = str;
            this.f20685V = str2;
            this.f20686W = str3;
            this.f20687X = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9172b.class != obj.getClass()) {
                return false;
            }
            C9172b bVar = (C9172b) obj;
            if (this.f20688c != bVar.f20688c || !TextUtils.equals(this.f20684U, bVar.f20684U) || !TextUtils.equals(this.f20685V, bVar.f20685V) || !TextUtils.equals(this.f20686W, bVar.f20686W) || !TextUtils.equals(this.f20687X, bVar.f20687X)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            long j = this.f20688c;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f20684U;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20685V;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f20686W;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f20687X;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f20688c);
            parcel.writeString(this.f20684U);
            parcel.writeString(this.f20685V);
            parcel.writeString(this.f20686W);
            parcel.writeString(this.f20687X);
        }

        C9172b(Parcel parcel) {
            this.f20688c = parcel.readLong();
            this.f20684U = parcel.readString();
            this.f20685V = parcel.readString();
            this.f20686W = parcel.readString();
            this.f20687X = parcel.readString();
        }
    }

    public C9170n(String str, String str2, List<C9172b> list) {
        this.f20683c = str;
        this.f20681U = str2;
        this.f20682V = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || C9170n.class != obj.getClass()) {
            return false;
        }
        C9170n nVar = (C9170n) obj;
        if (!TextUtils.equals(this.f20683c, nVar.f20683c) || !TextUtils.equals(this.f20681U, nVar.f20681U) || !this.f20682V.equals(nVar.f20682V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f20683c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20681U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f20682V.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20683c);
        parcel.writeString(this.f20681U);
        int size = this.f20682V.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.f20682V.get(i2), 0);
        }
    }

    C9170n(Parcel parcel) {
        this.f20683c = parcel.readString();
        this.f20681U = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(parcel.readParcelable(C9172b.class.getClassLoader()));
        }
        this.f20682V = Collections.unmodifiableList(arrayList);
    }
}
