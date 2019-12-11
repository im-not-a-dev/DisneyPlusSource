package com.google.android.exoplayer2.metadata.p360k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.k.d */
/* compiled from: SpliceInsertCommand */
public final class C8788d extends C8786b {
    public static final Creator<C8788d> CREATOR = new C8789a();

    /* renamed from: U */
    public final boolean f18647U;

    /* renamed from: V */
    public final boolean f18648V;

    /* renamed from: W */
    public final boolean f18649W;

    /* renamed from: X */
    public final boolean f18650X;

    /* renamed from: Y */
    public final long f18651Y;

    /* renamed from: Z */
    public final long f18652Z;

    /* renamed from: a0 */
    public final List<C8790b> f18653a0;

    /* renamed from: b0 */
    public final boolean f18654b0;

    /* renamed from: c */
    public final long f18655c;

    /* renamed from: c0 */
    public final long f18656c0;

    /* renamed from: d0 */
    public final int f18657d0;

    /* renamed from: e0 */
    public final int f18658e0;

    /* renamed from: f0 */
    public final int f18659f0;

    /* renamed from: com.google.android.exoplayer2.metadata.k.d$a */
    /* compiled from: SpliceInsertCommand */
    static class C8789a implements Creator<C8788d> {
        C8789a() {
        }

        public C8788d createFromParcel(Parcel parcel) {
            return new C8788d(parcel, null);
        }

        public C8788d[] newArray(int i) {
            return new C8788d[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.k.d$b */
    /* compiled from: SpliceInsertCommand */
    public static final class C8790b {

        /* renamed from: a */
        public final int f18660a;

        /* renamed from: b */
        public final long f18661b;

        /* renamed from: c */
        public final long f18662c;

        /* synthetic */ C8790b(int i, long j, long j2, C8789a aVar) {
            this(i, j, j2);
        }

        /* renamed from: b */
        public static C8790b m25430b(Parcel parcel) {
            C8790b bVar = new C8790b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            return bVar;
        }

        /* renamed from: a */
        public void mo22980a(Parcel parcel) {
            parcel.writeInt(this.f18660a);
            parcel.writeLong(this.f18661b);
            parcel.writeLong(this.f18662c);
        }

        private C8790b(int i, long j, long j2) {
            this.f18660a = i;
            this.f18661b = j;
            this.f18662c = j2;
        }
    }

    /* synthetic */ C8788d(Parcel parcel, C8789a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C8788d m25429a(C9572w wVar, long j, C9545h0 h0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        List list2;
        boolean z5;
        long j4;
        C9545h0 h0Var2 = h0Var;
        long x = wVar.mo24713x();
        boolean z6 = (wVar.mo24711v() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int v = wVar.mo24711v();
            boolean z7 = (v & 128) != 0;
            boolean z8 = (v & 64) != 0;
            boolean z9 = (v & 32) != 0;
            boolean z10 = (v & 16) != 0;
            long a = (!z8 || z10) ? -9223372036854775807L : C8797g.m25443a(wVar, j);
            if (!z8) {
                int v2 = wVar.mo24711v();
                list2 = new ArrayList(v2);
                for (int i4 = 0; i4 < v2; i4++) {
                    int v3 = wVar.mo24711v();
                    long a2 = !z10 ? C8797g.m25443a(wVar, j) : -9223372036854775807L;
                    C8790b bVar = new C8790b(v3, a2, h0Var2.mo24632b(a2), null);
                    list2.add(bVar);
                }
            } else {
                list2 = emptyList;
            }
            if (z9) {
                long v4 = (long) wVar.mo24711v();
                z5 = (128 & v4) != 0;
                j4 = ((((v4 & 1) << 32) | wVar.mo24713x()) * 1000) / 90;
            } else {
                j4 = -9223372036854775807L;
                z5 = false;
            }
            int B = wVar.mo24676B();
            i2 = wVar.mo24711v();
            i = wVar.mo24711v();
            z4 = z7;
            z = z8;
            list = list2;
            boolean z11 = z5;
            i3 = B;
            long j5 = j4;
            z3 = z10;
            j3 = a;
            z2 = z11;
            j2 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        C8788d dVar = new C8788d(x, z6, z4, z, z3, j3, h0Var2.mo24632b(j3), list, z2, j2, i3, i2, i);
        return dVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f18655c);
        parcel.writeByte(this.f18647U ? (byte) 1 : 0);
        parcel.writeByte(this.f18648V ? (byte) 1 : 0);
        parcel.writeByte(this.f18649W ? (byte) 1 : 0);
        parcel.writeByte(this.f18650X ? (byte) 1 : 0);
        parcel.writeLong(this.f18651Y);
        parcel.writeLong(this.f18652Z);
        int size = this.f18653a0.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C8790b) this.f18653a0.get(i2)).mo22980a(parcel);
        }
        parcel.writeByte(this.f18654b0 ? (byte) 1 : 0);
        parcel.writeLong(this.f18656c0);
        parcel.writeInt(this.f18657d0);
        parcel.writeInt(this.f18658e0);
        parcel.writeInt(this.f18659f0);
    }

    private C8788d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C8790b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f18655c = j;
        this.f18647U = z;
        this.f18648V = z2;
        this.f18649W = z3;
        this.f18650X = z4;
        this.f18651Y = j2;
        this.f18652Z = j3;
        this.f18653a0 = Collections.unmodifiableList(list);
        this.f18654b0 = z5;
        this.f18656c0 = j4;
        this.f18657d0 = i;
        this.f18658e0 = i2;
        this.f18659f0 = i3;
    }

    private C8788d(Parcel parcel) {
        this.f18655c = parcel.readLong();
        boolean z = false;
        this.f18647U = parcel.readByte() == 1;
        this.f18648V = parcel.readByte() == 1;
        this.f18649W = parcel.readByte() == 1;
        this.f18650X = parcel.readByte() == 1;
        this.f18651Y = parcel.readLong();
        this.f18652Z = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C8790b.m25430b(parcel));
        }
        this.f18653a0 = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f18654b0 = z;
        this.f18656c0 = parcel.readLong();
        this.f18657d0 = parcel.readInt();
        this.f18658e0 = parcel.readInt();
        this.f18659f0 = parcel.readInt();
    }
}
