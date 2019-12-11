package com.google.android.exoplayer2.metadata.p360k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9572w;

/* renamed from: com.google.android.exoplayer2.metadata.k.g */
/* compiled from: TimeSignalCommand */
public final class C8797g extends C8786b {
    public static final Creator<C8797g> CREATOR = new C8798a();

    /* renamed from: U */
    public final long f18677U;

    /* renamed from: c */
    public final long f18678c;

    /* renamed from: com.google.android.exoplayer2.metadata.k.g$a */
    /* compiled from: TimeSignalCommand */
    static class C8798a implements Creator<C8797g> {
        C8798a() {
        }

        public C8797g createFromParcel(Parcel parcel) {
            C8797g gVar = new C8797g(parcel.readLong(), parcel.readLong(), null);
            return gVar;
        }

        public C8797g[] newArray(int i) {
            return new C8797g[i];
        }
    }

    /* synthetic */ C8797g(long j, long j2, C8798a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    static C8797g m25444a(C9572w wVar, long j, C9545h0 h0Var) {
        long a = m25443a(wVar, j);
        return new C8797g(a, h0Var.mo24632b(a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f18678c);
        parcel.writeLong(this.f18677U);
    }

    private C8797g(long j, long j2) {
        this.f18678c = j;
        this.f18677U = j2;
    }

    /* renamed from: a */
    static long m25443a(C9572w wVar, long j) {
        long v = (long) wVar.mo24711v();
        if ((128 & v) != 0) {
            return 8589934591L & ((((v & 1) << 32) | wVar.mo24713x()) + j);
        }
        return -9223372036854775807L;
    }
}
