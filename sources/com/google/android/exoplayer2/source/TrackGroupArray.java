package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Creator<TrackGroupArray> CREATOR = new C9070a();

    /* renamed from: W */
    public static final TrackGroupArray f20167W = new TrackGroupArray(new C9199j0[0]);

    /* renamed from: U */
    private final C9199j0[] f20168U;

    /* renamed from: V */
    private int f20169V;

    /* renamed from: c */
    public final int f20170c;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    static class C9070a implements Creator<TrackGroupArray> {
        C9070a() {
        }

        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(C9199j0... j0VarArr) {
        this.f20168U = j0VarArr;
        this.f20170c = j0VarArr.length;
    }

    /* renamed from: X */
    public boolean mo23529X() {
        return this.f20170c == 0;
    }

    /* renamed from: a */
    public C9199j0 mo23531a(int i) {
        return this.f20168U[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f20170c != trackGroupArray.f20170c || !Arrays.equals(this.f20168U, trackGroupArray.f20168U)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f20169V == 0) {
            this.f20169V = Arrays.hashCode(this.f20168U);
        }
        return this.f20169V;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20170c);
        for (int i2 = 0; i2 < this.f20170c; i2++) {
            parcel.writeParcelable(this.f20168U[i2], 0);
        }
    }

    /* renamed from: a */
    public int mo23530a(C9199j0 j0Var) {
        for (int i = 0; i < this.f20170c; i++) {
            if (this.f20168U[i] == j0Var) {
                return i;
            }
        }
        return -1;
    }

    TrackGroupArray(Parcel parcel) {
        this.f20170c = parcel.readInt();
        this.f20168U = new C9199j0[this.f20170c];
        for (int i = 0; i < this.f20170c; i++) {
            this.f20168U[i] = (C9199j0) parcel.readParcelable(C9199j0.class.getClassLoader());
        }
    }
}
