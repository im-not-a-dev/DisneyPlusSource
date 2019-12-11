package com.google.android.exoplayer2.metadata.p360k;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.k.f */
/* compiled from: SpliceScheduleCommand */
public final class C8793f extends C8786b {
    public static final Creator<C8793f> CREATOR = new C8794a();

    /* renamed from: c */
    public final List<C8796c> f18663c;

    /* renamed from: com.google.android.exoplayer2.metadata.k.f$a */
    /* compiled from: SpliceScheduleCommand */
    static class C8794a implements Creator<C8793f> {
        C8794a() {
        }

        public C8793f createFromParcel(Parcel parcel) {
            return new C8793f(parcel, null);
        }

        public C8793f[] newArray(int i) {
            return new C8793f[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.k.f$b */
    /* compiled from: SpliceScheduleCommand */
    public static final class C8795b {

        /* renamed from: a */
        public final int f18664a;

        /* renamed from: b */
        public final long f18665b;

        /* synthetic */ C8795b(int i, long j, C8794a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C8795b m25435b(Parcel parcel) {
            return new C8795b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m25436c(Parcel parcel) {
            parcel.writeInt(this.f18664a);
            parcel.writeLong(this.f18665b);
        }

        private C8795b(int i, long j) {
            this.f18664a = i;
            this.f18665b = j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.k.f$c */
    /* compiled from: SpliceScheduleCommand */
    public static final class C8796c {

        /* renamed from: a */
        public final long f18666a;

        /* renamed from: b */
        public final boolean f18667b;

        /* renamed from: c */
        public final boolean f18668c;

        /* renamed from: d */
        public final boolean f18669d;

        /* renamed from: e */
        public final long f18670e;

        /* renamed from: f */
        public final List<C8795b> f18671f;

        /* renamed from: g */
        public final boolean f18672g;

        /* renamed from: h */
        public final long f18673h;

        /* renamed from: i */
        public final int f18674i;

        /* renamed from: j */
        public final int f18675j;

        /* renamed from: k */
        public final int f18676k;

        private C8796c(long j, boolean z, boolean z2, boolean z3, List<C8795b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f18666a = j;
            this.f18667b = z;
            this.f18668c = z2;
            this.f18669d = z3;
            this.f18671f = Collections.unmodifiableList(list);
            this.f18670e = j2;
            this.f18672g = z4;
            this.f18673h = j3;
            this.f18674i = i;
            this.f18675j = i2;
            this.f18676k = i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C8796c m25441b(C9572w wVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long x = wVar.mo24713x();
            boolean z5 = (wVar.mo24711v() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int v = wVar.mo24711v();
                boolean z6 = (v & 128) != 0;
                boolean z7 = (v & 64) != 0;
                boolean z8 = (v & 32) != 0;
                long x2 = z7 ? wVar.mo24713x() : -9223372036854775807L;
                if (!z7) {
                    int v2 = wVar.mo24711v();
                    ArrayList arrayList3 = new ArrayList(v2);
                    for (int i4 = 0; i4 < v2; i4++) {
                        arrayList3.add(new C8795b(wVar.mo24711v(), wVar.mo24713x(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long v3 = (long) wVar.mo24711v();
                    z4 = (128 & v3) != 0;
                    j3 = ((((v3 & 1) << 32) | wVar.mo24713x()) * 1000) / 90;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int B = wVar.mo24676B();
                int v4 = wVar.mo24711v();
                i = wVar.mo24711v();
                z = z7;
                j2 = x2;
                j = j3;
                arrayList = arrayList2;
                i3 = B;
                i2 = v4;
                z3 = z6;
                z2 = z4;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            C8796c cVar = new C8796c(x, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m25442c(Parcel parcel) {
            parcel.writeLong(this.f18666a);
            parcel.writeByte(this.f18667b ? (byte) 1 : 0);
            parcel.writeByte(this.f18668c ? (byte) 1 : 0);
            parcel.writeByte(this.f18669d ? (byte) 1 : 0);
            int size = this.f18671f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C8795b) this.f18671f.get(i)).m25436c(parcel);
            }
            parcel.writeLong(this.f18670e);
            parcel.writeByte(this.f18672g ? (byte) 1 : 0);
            parcel.writeLong(this.f18673h);
            parcel.writeInt(this.f18674i);
            parcel.writeInt(this.f18675j);
            parcel.writeInt(this.f18676k);
        }

        private C8796c(Parcel parcel) {
            this.f18666a = parcel.readLong();
            boolean z = false;
            this.f18667b = parcel.readByte() == 1;
            this.f18668c = parcel.readByte() == 1;
            this.f18669d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C8795b.m25435b(parcel));
            }
            this.f18671f = Collections.unmodifiableList(arrayList);
            this.f18670e = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            }
            this.f18672g = z;
            this.f18673h = parcel.readLong();
            this.f18674i = parcel.readInt();
            this.f18675j = parcel.readInt();
            this.f18676k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C8796c m25440b(Parcel parcel) {
            return new C8796c(parcel);
        }
    }

    /* synthetic */ C8793f(Parcel parcel, C8794a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C8793f m25432a(C9572w wVar) {
        int v = wVar.mo24711v();
        ArrayList arrayList = new ArrayList(v);
        for (int i = 0; i < v; i++) {
            arrayList.add(C8796c.m25441b(wVar));
        }
        return new C8793f((List<C8796c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f18663c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C8796c) this.f18663c.get(i2)).m25442c(parcel);
        }
    }

    private C8793f(List<C8796c> list) {
        this.f18663c = Collections.unmodifiableList(list);
    }

    private C8793f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C8796c.m25440b(parcel));
        }
        this.f18663c = Collections.unmodifiableList(arrayList);
    }
}
