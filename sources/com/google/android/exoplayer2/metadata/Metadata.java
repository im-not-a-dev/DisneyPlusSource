package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Creator<Metadata> CREATOR = new C8736a();

    /* renamed from: c */
    private final C8737b[] f18555c;

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    static class C8736a implements Creator<Metadata> {
        C8736a() {
        }

        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$b */
    public interface C8737b extends Parcelable {
        /* renamed from: H */
        Format mo22873H();

        /* renamed from: K */
        byte[] mo22874K();
    }

    public Metadata(C8737b... bVarArr) {
        if (bVarArr == null) {
            bVarArr = new C8737b[0];
        }
        this.f18555c = bVarArr;
    }

    /* renamed from: X */
    public int mo22862X() {
        return this.f18555c.length;
    }

    /* renamed from: a */
    public C8737b mo22863a(int i) {
        return this.f18555c[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18555c, ((Metadata) obj).f18555c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18555c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f18555c));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18555c.length);
        for (C8737b writeParcelable : this.f18555c) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    /* renamed from: a */
    public Metadata mo22864a(Metadata metadata) {
        return metadata == null ? this : mo22865a(metadata.f18555c);
    }

    public Metadata(List<? extends C8737b> list) {
        if (list != null) {
            this.f18555c = new C8737b[list.size()];
            list.toArray(this.f18555c);
            return;
        }
        this.f18555c = new C8737b[0];
    }

    /* renamed from: a */
    public Metadata mo22865a(C8737b... bVarArr) {
        C8737b[] bVarArr2 = this.f18555c;
        C8737b[] bVarArr3 = (C8737b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, bVarArr3, this.f18555c.length, bVarArr.length);
        C9554k0.m29419a((T[]) bVarArr3);
        return new Metadata(bVarArr3);
    }

    Metadata(Parcel parcel) {
        this.f18555c = new C8737b[parcel.readInt()];
        int i = 0;
        while (true) {
            C8737b[] bVarArr = this.f18555c;
            if (i < bVarArr.length) {
                bVarArr[i] = (C8737b) parcel.readParcelable(C8737b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
