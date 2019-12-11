package com.google.android.exoplayer2.metadata.p359j;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.j.e */
/* compiled from: ChapterTocFrame */
public final class C8764e extends C8773i {
    public static final Creator<C8764e> CREATOR = new C8765a();

    /* renamed from: U */
    public final String f18609U;

    /* renamed from: V */
    public final boolean f18610V;

    /* renamed from: W */
    public final boolean f18611W;

    /* renamed from: X */
    public final String[] f18612X;

    /* renamed from: Y */
    private final C8773i[] f18613Y;

    /* renamed from: com.google.android.exoplayer2.metadata.j.e$a */
    /* compiled from: ChapterTocFrame */
    static class C8765a implements Creator<C8764e> {
        C8765a() {
        }

        public C8764e createFromParcel(Parcel parcel) {
            return new C8764e(parcel);
        }

        public C8764e[] newArray(int i) {
            return new C8764e[i];
        }
    }

    public C8764e(String str, boolean z, boolean z2, String[] strArr, C8773i[] iVarArr) {
        super("CTOC");
        this.f18609U = str;
        this.f18610V = z;
        this.f18611W = z2;
        this.f18612X = strArr;
        this.f18613Y = iVarArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8764e.class != obj.getClass()) {
            return false;
        }
        C8764e eVar = (C8764e) obj;
        if (this.f18610V != eVar.f18610V || this.f18611W != eVar.f18611W || !Util.m29414a((Object) this.f18609U, (Object) eVar.f18609U) || !Arrays.equals(this.f18612X, eVar.f18612X) || !Arrays.equals(this.f18613Y, eVar.f18613Y)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((true + (this.f18610V ? 1 : 0)) * 31) + (this.f18611W ? 1 : 0)) * 31;
        String str = this.f18609U;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18609U);
        parcel.writeByte(this.f18610V ? (byte) 1 : 0);
        parcel.writeByte(this.f18611W ? (byte) 1 : 0);
        parcel.writeStringArray(this.f18612X);
        parcel.writeInt(this.f18613Y.length);
        for (C8773i writeParcelable : this.f18613Y) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    C8764e(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        Util.castNonNull(readString);
        this.f18609U = readString;
        boolean z = true;
        this.f18610V = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f18611W = z;
        String[] createStringArray = parcel.createStringArray();
        Util.castNonNull(createStringArray);
        this.f18612X = createStringArray;
        int readInt = parcel.readInt();
        this.f18613Y = new C8773i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f18613Y[i] = (C8773i) parcel.readParcelable(C8773i.class.getClassLoader());
        }
    }
}
