package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.k */
/* compiled from: MlltFrame */
public final class C8776k extends C8773i {
    public static final Creator<C8776k> CREATOR = new C8777a();

    /* renamed from: U */
    public final int f18630U;

    /* renamed from: V */
    public final int f18631V;

    /* renamed from: W */
    public final int f18632W;

    /* renamed from: X */
    public final int[] f18633X;

    /* renamed from: Y */
    public final int[] f18634Y;

    /* renamed from: com.google.android.exoplayer2.metadata.j.k$a */
    /* compiled from: MlltFrame */
    static class C8777a implements Creator<C8776k> {
        C8777a() {
        }

        public C8776k createFromParcel(Parcel parcel) {
            return new C8776k(parcel);
        }

        public C8776k[] newArray(int i) {
            return new C8776k[i];
        }
    }

    public C8776k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f18630U = i;
        this.f18631V = i2;
        this.f18632W = i3;
        this.f18633X = iArr;
        this.f18634Y = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8776k.class != obj.getClass()) {
            return false;
        }
        C8776k kVar = (C8776k) obj;
        if (!(this.f18630U == kVar.f18630U && this.f18631V == kVar.f18631V && this.f18632W == kVar.f18632W && Arrays.equals(this.f18633X, kVar.f18633X) && Arrays.equals(this.f18634Y, kVar.f18634Y))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f18630U) * 31) + this.f18631V) * 31) + this.f18632W) * 31) + Arrays.hashCode(this.f18633X)) * 31) + Arrays.hashCode(this.f18634Y);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18630U);
        parcel.writeInt(this.f18631V);
        parcel.writeInt(this.f18632W);
        parcel.writeIntArray(this.f18633X);
        parcel.writeIntArray(this.f18634Y);
    }

    C8776k(Parcel parcel) {
        super("MLLT");
        this.f18630U = parcel.readInt();
        this.f18631V = parcel.readInt();
        this.f18632W = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        C9554k0.m29394a(createIntArray);
        this.f18633X = createIntArray;
        int[] createIntArray2 = parcel.createIntArray();
        C9554k0.m29394a(createIntArray2);
        this.f18634Y = createIntArray2;
    }
}
