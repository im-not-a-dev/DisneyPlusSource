package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.j0 */
/* compiled from: TrackGroup */
public final class C9199j0 implements Parcelable {
    public static final Creator<C9199j0> CREATOR = new C9200a();

    /* renamed from: U */
    private final Format[] f20831U;

    /* renamed from: V */
    private int f20832V;

    /* renamed from: c */
    public final int f20833c;

    /* renamed from: com.google.android.exoplayer2.source.j0$a */
    /* compiled from: TrackGroup */
    static class C9200a implements Creator<C9199j0> {
        C9200a() {
        }

        public C9199j0 createFromParcel(Parcel parcel) {
            return new C9199j0(parcel);
        }

        public C9199j0[] newArray(int i) {
            return new C9199j0[i];
        }
    }

    public C9199j0(Format... formatArr) {
        C9537e.m29301b(formatArr.length > 0);
        this.f20831U = formatArr;
        this.f20833c = formatArr.length;
    }

    /* renamed from: a */
    public Format mo23902a(int i) {
        return this.f20831U[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9199j0.class != obj.getClass()) {
            return false;
        }
        C9199j0 j0Var = (C9199j0) obj;
        if (this.f20833c != j0Var.f20833c || !Arrays.equals(this.f20831U, j0Var.f20831U)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f20832V == 0) {
            this.f20832V = 527 + Arrays.hashCode(this.f20831U);
        }
        return this.f20832V;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20833c);
        for (int i2 = 0; i2 < this.f20833c; i2++) {
            parcel.writeParcelable(this.f20831U[i2], 0);
        }
    }

    /* renamed from: a */
    public int mo23901a(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f20831U;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    C9199j0(Parcel parcel) {
        this.f20833c = parcel.readInt();
        this.f20831U = new Format[this.f20833c];
        for (int i = 0; i < this.f20833c; i++) {
            this.f20831U[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
