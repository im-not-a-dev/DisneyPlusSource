package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C8800n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9287b.C9291d;
import com.google.android.exoplayer2.trackselection.C9306f.C9307a;
import com.google.android.exoplayer2.trackselection.C9311j.C9312a;
import com.google.android.exoplayer2.trackselection.C9311j.C9313b;
import com.google.android.exoplayer2.trackselection.C9314k.C9316b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.exoplayer2.trackselection.d */
/* compiled from: DefaultTrackSelector */
public class C9295d extends C9306f {

    /* renamed from: g */
    private static final int[] f21208g = new int[0];

    /* renamed from: d */
    private final C9313b f21209d;

    /* renamed from: e */
    private final AtomicReference<C9299d> f21210e;

    /* renamed from: f */
    private boolean f21211f;

    /* renamed from: com.google.android.exoplayer2.trackselection.d$b */
    /* compiled from: DefaultTrackSelector */
    private static final class C9297b {

        /* renamed from: a */
        public final int f21212a;

        /* renamed from: b */
        public final int f21213b;

        /* renamed from: c */
        public final String f21214c;

        public C9297b(int i, int i2, String str) {
            this.f21212a = i;
            this.f21213b = i2;
            this.f21214c = str;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9297b.class != obj.getClass()) {
                return false;
            }
            C9297b bVar = (C9297b) obj;
            if (!(this.f21212a == bVar.f21212a && this.f21213b == bVar.f21213b && TextUtils.equals(this.f21214c, bVar.f21214c))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = ((this.f21212a * 31) + this.f21213b) * 31;
            String str = this.f21214c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.d$c */
    /* compiled from: DefaultTrackSelector */
    protected static final class C9298c implements Comparable<C9298c> {

        /* renamed from: U */
        private final String f21215U;

        /* renamed from: V */
        private final C9299d f21216V;

        /* renamed from: W */
        private final boolean f21217W;

        /* renamed from: X */
        private final int f21218X;

        /* renamed from: Y */
        private final int f21219Y;

        /* renamed from: Z */
        private final int f21220Z;

        /* renamed from: a0 */
        private final boolean f21221a0;

        /* renamed from: b0 */
        private final int f21222b0;

        /* renamed from: c */
        public final boolean f21223c;

        /* renamed from: c0 */
        private final int f21224c0;

        /* renamed from: d0 */
        private final int f21225d0;

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
            if (r7 > r6.f21237j0) goto L_0x0043;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:20:0x005f ?: BREAK  
        EDGE_INSN: B:23:0x005f->B:20:0x005f ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9298c(com.google.android.exoplayer2.Format r5, com.google.android.exoplayer2.trackselection.C9295d.C9299d r6, int r7) {
            /*
                r4 = this;
                r4.<init>()
                r4.f21216V = r6
                java.lang.String r0 = r5.f18368t0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.C9295d.m28227a(r0)
                r4.f21215U = r0
                r0 = 0
                boolean r7 = com.google.android.exoplayer2.trackselection.C9295d.m28231a(r7, r0)
                r4.f21217W = r7
                java.lang.String r7 = r6.f21304c
                int r7 = com.google.android.exoplayer2.trackselection.C9295d.m28222a(r5, r7, r0)
                r4.f21218X = r7
                int r7 = r5.f18343V
                r1 = 1
                r7 = r7 & r1
                if (r7 == 0) goto L_0x0024
                r7 = 1
                goto L_0x0025
            L_0x0024:
                r7 = 0
            L_0x0025:
                r4.f21221a0 = r7
                int r7 = r5.f18363o0
                r4.f21222b0 = r7
                int r7 = r5.f18364p0
                r4.f21224c0 = r7
                int r7 = r5.f18345X
                r4.f21225d0 = r7
                r2 = -1
                if (r7 == r2) goto L_0x003a
                int r3 = r6.f21238k0
                if (r7 > r3) goto L_0x0043
            L_0x003a:
                int r7 = r5.f18363o0
                if (r7 == r2) goto L_0x0044
                int r6 = r6.f21237j0
                if (r7 > r6) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                r4.f21223c = r1
                java.lang.String[] r6 = com.google.android.exoplayer2.p393v0.C9554k0.m29443c()
                r7 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
            L_0x004e:
                int r2 = r6.length
                if (r1 >= r2) goto L_0x005f
                r2 = r6[r1]
                int r2 = com.google.android.exoplayer2.trackselection.C9295d.m28222a(r5, r2, r0)
                if (r2 <= 0) goto L_0x005c
                r7 = r1
                r0 = r2
                goto L_0x005f
            L_0x005c:
                int r1 = r1 + 1
                goto L_0x004e
            L_0x005f:
                r4.f21219Y = r7
                r4.f21220Z = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C9295d.C9298c.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.d$d, int):void");
        }

        /* renamed from: a */
        public int compareTo(C9298c cVar) {
            int a;
            boolean z = this.f21217W;
            int i = 1;
            if (z != cVar.f21217W) {
                if (!z) {
                    i = -1;
                }
                return i;
            }
            int i2 = this.f21218X;
            int i3 = cVar.f21218X;
            if (i2 != i3) {
                return C9295d.m28240d(i2, i3);
            }
            boolean z2 = this.f21223c;
            if (z2 != cVar.f21223c) {
                if (!z2) {
                    i = -1;
                }
                return i;
            }
            if (this.f21216V.f21243p0) {
                int b = C9295d.mo7785c(this.f21225d0, cVar.f21225d0);
                if (b != 0) {
                    if (b > 0) {
                        i = -1;
                    }
                    return i;
                }
            }
            boolean z3 = this.f21221a0;
            if (z3 != cVar.f21221a0) {
                if (!z3) {
                    i = -1;
                }
                return i;
            }
            int i4 = this.f21219Y;
            int i5 = cVar.f21219Y;
            if (i4 != i5) {
                return -C9295d.m28240d(i4, i5);
            }
            int i6 = this.f21220Z;
            int i7 = cVar.f21220Z;
            if (i6 != i7) {
                return C9295d.m28240d(i6, i7);
            }
            if (!this.f21223c || !this.f21217W) {
                i = -1;
            }
            int i8 = this.f21222b0;
            int i9 = cVar.f21222b0;
            if (i8 != i9) {
                a = C9295d.m28240d(i8, i9);
            } else {
                int i10 = this.f21224c0;
                int i11 = cVar.f21224c0;
                if (i10 != i11) {
                    a = C9295d.m28240d(i10, i11);
                } else if (!C9554k0.m29414a((Object) this.f21215U, (Object) cVar.f21215U)) {
                    return 0;
                } else {
                    a = C9295d.m28240d(this.f21225d0, cVar.f21225d0);
                }
            }
            return i * a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.d$d */
    /* compiled from: DefaultTrackSelector */
    public static final class C9299d extends C9314k {
        public static final Creator<C9299d> CREATOR = new C9300a();

        /* renamed from: v0 */
        public static final C9299d f21226v0 = new C9299d();

        /* renamed from: Z */
        public final int f21227Z;

        /* renamed from: a0 */
        public final int f21228a0;

        /* renamed from: b0 */
        public final int f21229b0;

        /* renamed from: c0 */
        public final int f21230c0;

        /* renamed from: d0 */
        public final boolean f21231d0;

        /* renamed from: e0 */
        public final boolean f21232e0;

        /* renamed from: f0 */
        public final boolean f21233f0;

        /* renamed from: g0 */
        public final int f21234g0;

        /* renamed from: h0 */
        public final int f21235h0;

        /* renamed from: i0 */
        public final boolean f21236i0;

        /* renamed from: j0 */
        public final int f21237j0;

        /* renamed from: k0 */
        public final int f21238k0;

        /* renamed from: l0 */
        public final boolean f21239l0;

        /* renamed from: m0 */
        public final boolean f21240m0;

        /* renamed from: n0 */
        public final boolean f21241n0;

        /* renamed from: o0 */
        public final boolean f21242o0;

        /* renamed from: p0 */
        public final boolean f21243p0;

        /* renamed from: q0 */
        public final boolean f21244q0;

        /* renamed from: r0 */
        public final boolean f21245r0;

        /* renamed from: s0 */
        public final int f21246s0;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public final SparseArray<Map<TrackGroupArray, C9302f>> f21247t0;
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public final SparseBooleanArray f21248u0;

        /* renamed from: com.google.android.exoplayer2.trackselection.d$d$a */
        /* compiled from: DefaultTrackSelector */
        static class C9300a implements Creator<C9299d> {
            C9300a() {
            }

            public C9299d createFromParcel(Parcel parcel) {
                return new C9299d(parcel);
            }

            public C9299d[] newArray(int i) {
                return new C9299d[i];
            }
        }

        private C9299d() {
            C9314k kVar = C9314k.f21299Y;
            String str = kVar.f21304c;
            String str2 = kVar.f21300U;
            int i = kVar.f21301V;
            boolean z = kVar.f21302W;
            int i2 = kVar.f21303X;
            SparseArray sparseArray = r1;
            SparseArray sparseArray2 = new SparseArray();
            SparseBooleanArray sparseBooleanArray = r1;
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            this(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, str, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, false, false, str2, i, z, i2, false, false, true, 0, sparseArray, sparseBooleanArray);
        }

        /* renamed from: X */
        public C9301e mo24092X() {
            return new C9301e(this);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9299d.class != obj.getClass()) {
                return false;
            }
            C9299d dVar = (C9299d) obj;
            if (!(super.equals(obj) && this.f21227Z == dVar.f21227Z && this.f21228a0 == dVar.f21228a0 && this.f21229b0 == dVar.f21229b0 && this.f21230c0 == dVar.f21230c0 && this.f21231d0 == dVar.f21231d0 && this.f21232e0 == dVar.f21232e0 && this.f21233f0 == dVar.f21233f0 && this.f21236i0 == dVar.f21236i0 && this.f21234g0 == dVar.f21234g0 && this.f21235h0 == dVar.f21235h0 && this.f21237j0 == dVar.f21237j0 && this.f21238k0 == dVar.f21238k0 && this.f21239l0 == dVar.f21239l0 && this.f21240m0 == dVar.f21240m0 && this.f21241n0 == dVar.f21241n0 && this.f21242o0 == dVar.f21242o0 && this.f21243p0 == dVar.f21243p0 && this.f21244q0 == dVar.f21244q0 && this.f21245r0 == dVar.f21245r0 && this.f21246s0 == dVar.f21246s0 && m28256a(this.f21248u0, dVar.f21248u0) && m28255a(this.f21247t0, dVar.f21247t0))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f21227Z) * 31) + this.f21228a0) * 31) + this.f21229b0) * 31) + this.f21230c0) * 31) + (this.f21231d0 ? 1 : 0)) * 31) + (this.f21232e0 ? 1 : 0)) * 31) + (this.f21233f0 ? 1 : 0)) * 31) + (this.f21236i0 ? 1 : 0)) * 31) + this.f21234g0) * 31) + this.f21235h0) * 31) + this.f21237j0) * 31) + this.f21238k0) * 31) + (this.f21239l0 ? 1 : 0)) * 31) + (this.f21240m0 ? 1 : 0)) * 31) + (this.f21241n0 ? 1 : 0)) * 31) + (this.f21242o0 ? 1 : 0)) * 31) + (this.f21243p0 ? 1 : 0)) * 31) + (this.f21244q0 ? 1 : 0)) * 31) + (this.f21245r0 ? 1 : 0)) * 31) + this.f21246s0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f21227Z);
            parcel.writeInt(this.f21228a0);
            parcel.writeInt(this.f21229b0);
            parcel.writeInt(this.f21230c0);
            C9554k0.m29403a(parcel, this.f21231d0);
            C9554k0.m29403a(parcel, this.f21232e0);
            C9554k0.m29403a(parcel, this.f21233f0);
            parcel.writeInt(this.f21234g0);
            parcel.writeInt(this.f21235h0);
            C9554k0.m29403a(parcel, this.f21236i0);
            parcel.writeInt(this.f21237j0);
            parcel.writeInt(this.f21238k0);
            C9554k0.m29403a(parcel, this.f21239l0);
            C9554k0.m29403a(parcel, this.f21240m0);
            C9554k0.m29403a(parcel, this.f21241n0);
            C9554k0.m29403a(parcel, this.f21242o0);
            C9554k0.m29403a(parcel, this.f21243p0);
            C9554k0.m29403a(parcel, this.f21244q0);
            C9554k0.m29403a(parcel, this.f21245r0);
            parcel.writeInt(this.f21246s0);
            m28254a(parcel, this.f21247t0);
            parcel.writeSparseBooleanArray(this.f21248u0);
        }

        C9299d(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, int i6, boolean z4, String str, int i7, int i8, boolean z5, boolean z6, boolean z7, boolean z8, String str2, int i9, boolean z9, int i10, boolean z10, boolean z11, boolean z12, int i11, SparseArray<Map<TrackGroupArray, C9302f>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, i9, z9, i10);
            this.f21227Z = i;
            this.f21228a0 = i2;
            this.f21229b0 = i3;
            this.f21230c0 = i4;
            this.f21231d0 = z;
            this.f21232e0 = z2;
            this.f21233f0 = z3;
            this.f21234g0 = i5;
            this.f21235h0 = i6;
            this.f21236i0 = z4;
            this.f21237j0 = i7;
            this.f21238k0 = i8;
            this.f21239l0 = z5;
            this.f21240m0 = z6;
            this.f21241n0 = z7;
            this.f21242o0 = z8;
            this.f21243p0 = z10;
            this.f21244q0 = z11;
            this.f21245r0 = z12;
            this.f21246s0 = i11;
            this.f21247t0 = sparseArray;
            this.f21248u0 = sparseBooleanArray;
        }

        /* renamed from: a */
        public final boolean mo24094a(int i) {
            return this.f21248u0.get(i);
        }

        /* renamed from: b */
        public final boolean mo24095b(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.f21247t0.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        /* renamed from: a */
        public final C9302f mo24093a(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.f21247t0.get(i);
            if (map != null) {
                return (C9302f) map.get(trackGroupArray);
            }
            return null;
        }

        /* renamed from: a */
        private static SparseArray<Map<TrackGroupArray, C9302f>> m28252a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, C9302f>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (C9302f) parcel.readParcelable(C9302f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: a */
        private static void m28254a(Parcel parcel, SparseArray<Map<TrackGroupArray, C9302f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map map = (Map) sparseArray.valueAt(i);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        /* renamed from: a */
        private static boolean m28256a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        C9299d(Parcel parcel) {
            super(parcel);
            this.f21227Z = parcel.readInt();
            this.f21228a0 = parcel.readInt();
            this.f21229b0 = parcel.readInt();
            this.f21230c0 = parcel.readInt();
            this.f21231d0 = C9554k0.m29412a(parcel);
            this.f21232e0 = C9554k0.m29412a(parcel);
            this.f21233f0 = C9554k0.m29412a(parcel);
            this.f21234g0 = parcel.readInt();
            this.f21235h0 = parcel.readInt();
            this.f21236i0 = C9554k0.m29412a(parcel);
            this.f21237j0 = parcel.readInt();
            this.f21238k0 = parcel.readInt();
            this.f21239l0 = C9554k0.m29412a(parcel);
            this.f21240m0 = C9554k0.m29412a(parcel);
            this.f21241n0 = C9554k0.m29412a(parcel);
            this.f21242o0 = C9554k0.m29412a(parcel);
            this.f21243p0 = C9554k0.m29412a(parcel);
            this.f21244q0 = C9554k0.m29412a(parcel);
            this.f21245r0 = C9554k0.m29412a(parcel);
            this.f21246s0 = parcel.readInt();
            this.f21247t0 = m28252a(parcel);
            SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
            C9554k0.m29394a(readSparseBooleanArray);
            this.f21248u0 = readSparseBooleanArray;
        }

        /* renamed from: a */
        private static boolean m28255a(SparseArray<Map<TrackGroupArray, C9302f>> sparseArray, SparseArray<Map<TrackGroupArray, C9302f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m28257a((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static boolean m28257a(Map<TrackGroupArray, C9302f> map, Map<TrackGroupArray, C9302f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Entry entry : map.entrySet()) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                if (map2.containsKey(trackGroupArray)) {
                    if (!C9554k0.m29414a(entry.getValue(), map2.get(trackGroupArray))) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.d$e */
    /* compiled from: DefaultTrackSelector */
    public static final class C9301e extends C9316b {

        /* renamed from: A */
        private final SparseBooleanArray f21249A;

        /* renamed from: f */
        private int f21250f;

        /* renamed from: g */
        private int f21251g;

        /* renamed from: h */
        private int f21252h;

        /* renamed from: i */
        private int f21253i;

        /* renamed from: j */
        private boolean f21254j;

        /* renamed from: k */
        private boolean f21255k;

        /* renamed from: l */
        private boolean f21256l;

        /* renamed from: m */
        private int f21257m;

        /* renamed from: n */
        private int f21258n;

        /* renamed from: o */
        private boolean f21259o;

        /* renamed from: p */
        private int f21260p;

        /* renamed from: q */
        private int f21261q;

        /* renamed from: r */
        private boolean f21262r;

        /* renamed from: s */
        private boolean f21263s;

        /* renamed from: t */
        private boolean f21264t;

        /* renamed from: u */
        private boolean f21265u;

        /* renamed from: v */
        private boolean f21266v;

        /* renamed from: w */
        private boolean f21267w;

        /* renamed from: x */
        private boolean f21268x;

        /* renamed from: y */
        private int f21269y;

        /* renamed from: z */
        private final SparseArray<Map<TrackGroupArray, C9302f>> f21270z;

        /* renamed from: a */
        public C9301e mo24104a(int i, int i2) {
            this.f21250f = i;
            this.f21251g = i2;
            return this;
        }

        /* renamed from: b */
        public C9301e mo24109b(int i) {
            this.f21253i = i;
            return this;
        }

        /* renamed from: c */
        public C9301e mo24112c(int i) {
            this.f21269y = i;
            return this;
        }

        public C9301e() {
            this(C9299d.f21226v0);
        }

        /* renamed from: b */
        public C9301e mo24111b(boolean z) {
            this.f21254j = z;
            return this;
        }

        private C9301e(C9299d dVar) {
            super(dVar);
            this.f21250f = dVar.f21227Z;
            this.f21251g = dVar.f21228a0;
            this.f21252h = dVar.f21229b0;
            this.f21253i = dVar.f21230c0;
            this.f21254j = dVar.f21231d0;
            this.f21255k = dVar.f21232e0;
            this.f21256l = dVar.f21233f0;
            this.f21257m = dVar.f21234g0;
            this.f21258n = dVar.f21235h0;
            this.f21259o = dVar.f21236i0;
            this.f21260p = dVar.f21237j0;
            this.f21261q = dVar.f21238k0;
            this.f21262r = dVar.f21239l0;
            this.f21263s = dVar.f21240m0;
            this.f21264t = dVar.f21241n0;
            this.f21265u = dVar.f21242o0;
            this.f21266v = dVar.f21243p0;
            this.f21267w = dVar.f21244q0;
            this.f21268x = dVar.f21245r0;
            this.f21269y = dVar.f21246s0;
            this.f21270z = m28263a(dVar.f21247t0);
            this.f21249A = dVar.f21248u0.clone();
        }

        /* renamed from: a */
        public C9301e mo24106a(Context context, boolean z) {
            Point c = C9554k0.m29440c(context);
            mo24105a(c.x, c.y, z);
            return this;
        }

        /* renamed from: b */
        public C9301e mo24110b(String str) {
            super.mo24110b(str);
            return this;
        }

        /* renamed from: a */
        public C9301e mo24105a(int i, int i2, boolean z) {
            this.f21257m = i;
            this.f21258n = i2;
            this.f21259o = z;
            return this;
        }

        /* renamed from: a */
        public C9301e mo24107a(String str) {
            super.mo24107a(str);
            return this;
        }

        /* renamed from: a */
        public C9301e mo24103a(int i) {
            this.f21260p = i;
            return this;
        }

        /* renamed from: a */
        public C9301e mo24108a(boolean z) {
            super.mo24108a(z);
            return this;
        }

        /* renamed from: a */
        public C9299d mo24102a() {
            C9299d dVar = new C9299d(this.f21250f, this.f21251g, this.f21252h, this.f21253i, this.f21254j, this.f21255k, this.f21256l, this.f21257m, this.f21258n, this.f21259o, this.f21305a, this.f21260p, this.f21261q, this.f21262r, this.f21263s, this.f21264t, this.f21265u, this.f21306b, this.f21307c, this.f21308d, this.f21309e, this.f21266v, this.f21267w, this.f21268x, this.f21269y, this.f21270z, this.f21249A);
            return dVar;
        }

        /* renamed from: a */
        private static SparseArray<Map<TrackGroupArray, C9302f>> m28263a(SparseArray<Map<TrackGroupArray, C9302f>> sparseArray) {
            SparseArray<Map<TrackGroupArray, C9302f>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.d$f */
    /* compiled from: DefaultTrackSelector */
    public static final class C9302f implements Parcelable {
        public static final Creator<C9302f> CREATOR = new C9303a();

        /* renamed from: U */
        public final int[] f21271U;

        /* renamed from: V */
        public final int f21272V;

        /* renamed from: W */
        public final int f21273W;

        /* renamed from: X */
        public final int f21274X;

        /* renamed from: c */
        public final int f21275c;

        /* renamed from: com.google.android.exoplayer2.trackselection.d$f$a */
        /* compiled from: DefaultTrackSelector */
        static class C9303a implements Creator<C9302f> {
            C9303a() {
            }

            public C9302f createFromParcel(Parcel parcel) {
                return new C9302f(parcel);
            }

            public C9302f[] newArray(int i) {
                return new C9302f[i];
            }
        }

        public C9302f(int i, int... iArr) {
            this(i, iArr, 2, 0);
        }

        /* renamed from: a */
        public boolean mo24113a(int i) {
            for (int i2 : this.f21271U) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9302f.class != obj.getClass()) {
                return false;
            }
            C9302f fVar = (C9302f) obj;
            if (!(this.f21275c == fVar.f21275c && Arrays.equals(this.f21271U, fVar.f21271U) && this.f21273W == fVar.f21273W && this.f21274X == fVar.f21274X)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f21275c * 31) + Arrays.hashCode(this.f21271U)) * 31) + this.f21273W) * 31) + this.f21274X;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f21275c);
            parcel.writeInt(this.f21271U.length);
            parcel.writeIntArray(this.f21271U);
            parcel.writeInt(this.f21273W);
            parcel.writeInt(this.f21274X);
        }

        public C9302f(int i, int[] iArr, int i2, int i3) {
            this.f21275c = i;
            this.f21271U = Arrays.copyOf(iArr, iArr.length);
            this.f21272V = iArr.length;
            this.f21273W = i2;
            this.f21274X = i3;
            Arrays.sort(this.f21271U);
        }

        C9302f(Parcel parcel) {
            this.f21275c = parcel.readInt();
            this.f21272V = parcel.readByte();
            this.f21271U = new int[this.f21272V];
            parcel.readIntArray(this.f21271U);
            this.f21273W = parcel.readInt();
            this.f21274X = parcel.readInt();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.d$g */
    /* compiled from: DefaultTrackSelector */
    protected static final class C9304g implements Comparable<C9304g> {

        /* renamed from: U */
        private final boolean f21276U;

        /* renamed from: V */
        private final boolean f21277V;

        /* renamed from: W */
        private final boolean f21278W;

        /* renamed from: X */
        private final int f21279X;

        /* renamed from: Y */
        private final int f21280Y;

        /* renamed from: Z */
        private final int f21281Z;

        /* renamed from: a0 */
        private final boolean f21282a0;

        /* renamed from: c */
        public final boolean f21283c;

        public C9304g(Format format, C9299d dVar, int i, String str) {
            boolean z = false;
            this.f21276U = C9295d.m28231a(i, false);
            int i2 = format.f18343V & (~dVar.f21303X);
            this.f21277V = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            this.f21279X = C9295d.m28222a(format, dVar.f21300U, dVar.f21302W);
            this.f21280Y = Integer.bitCount(format.f18344W & dVar.f21301V);
            this.f21282a0 = (format.f18344W & 1088) != 0;
            this.f21278W = (this.f21279X > 0 && !z2) || (this.f21279X == 0 && z2);
            this.f21281Z = C9295d.m28222a(format, str, C9295d.m28227a(str) == null);
            if (this.f21279X > 0 || ((dVar.f21300U == null && this.f21280Y > 0) || this.f21277V || (z2 && this.f21281Z > 0))) {
                z = true;
            }
            this.f21283c = z;
        }

        /* renamed from: a */
        public int compareTo(C9304g gVar) {
            boolean z = this.f21276U;
            int i = 1;
            if (z != gVar.f21276U) {
                if (!z) {
                    i = -1;
                }
                return i;
            }
            int i2 = this.f21279X;
            int i3 = gVar.f21279X;
            if (i2 != i3) {
                return C9295d.m28240d(i2, i3);
            }
            int i4 = this.f21280Y;
            int i5 = gVar.f21280Y;
            if (i4 != i5) {
                return C9295d.m28240d(i4, i5);
            }
            boolean z2 = this.f21277V;
            if (z2 != gVar.f21277V) {
                if (!z2) {
                    i = -1;
                }
                return i;
            }
            boolean z3 = this.f21278W;
            if (z3 != gVar.f21278W) {
                if (!z3) {
                    i = -1;
                }
                return i;
            }
            int i6 = this.f21281Z;
            int i7 = gVar.f21281Z;
            if (i6 != i7) {
                return C9295d.m28240d(i6, i7);
            }
            if (i4 == 0) {
                boolean z4 = this.f21282a0;
                if (z4 != gVar.f21282a0) {
                    if (z4) {
                        i = -1;
                    }
                    return i;
                }
            }
            return 0;
        }
    }

    public C9295d() {
        this(new C9291d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m28231a(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int mo7785c(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m28240d(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: d */
    public C9301e mo24086d() {
        return mo24087e().mo24092X();
    }

    /* renamed from: e */
    public C9299d mo24087e() {
        return (C9299d) this.f21210e.get();
    }

    public C9295d(C9313b bVar) {
        this.f21209d = bVar;
        this.f21210e = new AtomicReference<>(C9299d.f21226v0);
    }

    /* renamed from: a */
    public void mo24084a(C9299d dVar) {
        C9537e.m29296a(dVar);
        if (!((C9299d) this.f21210e.getAndSet(dVar)).equals(dVar)) {
            mo24048b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9312a mo7777b(TrackGroupArray trackGroupArray, int[][] iArr, int i, C9299d dVar, boolean z) throws ExoPlaybackException {
        C9312a a = (dVar.f21244q0 || dVar.f21243p0 || !z) ? null : m28225a(trackGroupArray, iArr, i, dVar);
        return a == null ? m28226a(trackGroupArray, iArr, dVar) : a;
    }

    /* renamed from: b */
    private static int m28238b(C9199j0 j0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = ((Integer) list.get(i7)).intValue();
            C9199j0 j0Var2 = j0Var;
            if (m28233a(j0Var.mo23902a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    /* renamed from: a */
    public void mo24085a(C9301e eVar) {
        mo24084a(eVar.mo24102a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Pair<C8800n0[], C9311j[]> mo24082a(C9307a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        C9299d dVar = (C9299d) this.f21210e.get();
        int a = aVar.mo24123a();
        C9312a[] a2 = mo7774a(aVar, iArr, iArr2, dVar);
        int i = 0;
        while (true) {
            C9312a aVar2 = null;
            if (i >= a) {
                break;
            }
            if (dVar.mo24094a(i)) {
                a2[i] = null;
            } else {
                TrackGroupArray b = aVar.mo24130b(i);
                if (dVar.mo24095b(i, b)) {
                    C9302f a3 = dVar.mo24093a(i, b);
                    if (a3 != null) {
                        aVar2 = new C9312a(b.mo23531a(a3.f21275c), a3.f21271U, a3.f21273W, Integer.valueOf(a3.f21274X));
                    }
                    a2[i] = aVar2;
                }
            }
            i++;
        }
        C9311j[] a4 = this.f21209d.mo24064a(a2, mo24045a());
        C8800n0[] n0VarArr = new C8800n0[a];
        for (int i2 = 0; i2 < a; i2++) {
            n0VarArr[i2] = !dVar.mo24094a(i2) && (aVar.mo24124a(i2) == 6 || a4[i2] != null) ? C8800n0.f18680b : null;
        }
        m28230a(aVar, iArr, n0VarArr, a4, dVar.f21246s0);
        return Pair.create(n0VarArr, a4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9312a[] mo7774a(C9307a aVar, int[][][] iArr, int[] iArr2, C9299d dVar) throws ExoPlaybackException {
        int i;
        String str;
        int i2;
        String str2;
        C9298c cVar;
        int i3;
        C9307a aVar2 = aVar;
        C9299d dVar2 = dVar;
        int a = aVar.mo24123a();
        C9312a[] aVarArr = new C9312a[a];
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i5 >= a) {
                break;
            }
            if (2 == aVar2.mo24124a(i5)) {
                if (!z) {
                    aVarArr[i5] = mo7777b(aVar2.mo24130b(i5), iArr[i5], iArr2[i5], dVar, true);
                    z = aVarArr[i5] != null;
                }
                if (aVar2.mo24130b(i5).f20170c <= 0) {
                    i = 0;
                }
                i6 |= i;
            }
            i5++;
        }
        C9298c cVar2 = null;
        String str3 = null;
        int i7 = -1;
        int i8 = 0;
        while (i8 < a) {
            if (i == aVar2.mo24124a(i8)) {
                i3 = i7;
                cVar = cVar2;
                str2 = str3;
                i2 = i8;
                Pair a2 = mo7758a(aVar2.mo24130b(i8), iArr[i8], iArr2[i8], dVar, this.f21211f || i6 == 0);
                if (a2 != null && (cVar == null || ((C9298c) a2.second).compareTo(cVar) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    C9312a aVar3 = (C9312a) a2.first;
                    aVarArr[i2] = aVar3;
                    cVar2 = (C9298c) a2.second;
                    str3 = aVar3.f21295a.mo23902a(aVar3.f21296b[0]).f18368t0;
                    i7 = i2;
                    i8 = i2 + 1;
                    i = 1;
                }
            } else {
                i3 = i7;
                cVar = cVar2;
                str2 = str3;
                i2 = i8;
            }
            i7 = i3;
            cVar2 = cVar;
            str3 = str2;
            i8 = i2 + 1;
            i = 1;
        }
        String str4 = str3;
        C9304g gVar = null;
        int i9 = -1;
        while (i4 < a) {
            int a3 = aVar2.mo24124a(i4);
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 != 3) {
                        aVarArr[i4] = mo24083a(a3, aVar2.mo24130b(i4), iArr[i4], dVar2);
                    } else {
                        str = str4;
                        Pair a4 = mo7759a(aVar2.mo24130b(i4), iArr[i4], dVar2, str);
                        if (a4 != null && (gVar == null || ((C9304g) a4.second).compareTo(gVar) > 0)) {
                            if (i9 != -1) {
                                aVarArr[i9] = null;
                            }
                            aVarArr[i4] = (C9312a) a4.first;
                            gVar = (C9304g) a4.second;
                            i9 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    /* renamed from: a */
    private static C9312a m28225a(TrackGroupArray trackGroupArray, int[][] iArr, int i, C9299d dVar) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C9299d dVar2 = dVar;
        int i2 = dVar2.f21233f0 ? 24 : 16;
        boolean z = dVar2.f21232e0 && (i & i2) != 0;
        int i3 = 0;
        while (i3 < trackGroupArray2.f20170c) {
            C9199j0 a = trackGroupArray2.mo23531a(i3);
            C9199j0 j0Var = a;
            int[] a2 = m28236a(a, iArr[i3], z, i2, dVar2.f21227Z, dVar2.f21228a0, dVar2.f21229b0, dVar2.f21230c0, dVar2.f21234g0, dVar2.f21235h0, dVar2.f21236i0);
            if (a2.length > 0) {
                return new C9312a(j0Var, a2);
            }
            i3++;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    /* renamed from: a */
    private static int[] m28236a(C9199j0 j0Var, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        String str;
        C9199j0 j0Var2 = j0Var;
        if (j0Var2.f20833c < 2) {
            return f21208g;
        }
        List a = m28228a(j0Var2, i6, i7, z2);
        if (a.size() < 2) {
            return f21208g;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < a.size(); i9++) {
                String str3 = j0Var2.mo23902a(((Integer) a.get(i9)).intValue()).f18349b0;
                if (hashSet.add(str3)) {
                    String str4 = str3;
                    int b = m28238b(j0Var, iArr, i, str3, i2, i3, i4, i5, a);
                    if (b > i8) {
                        i8 = b;
                        str2 = str4;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m28229a(j0Var, iArr, i, str, i2, i3, i4, i5, a);
        return a.size() < 2 ? f21208g : C9554k0.m29417a(a);
    }

    /* renamed from: a */
    private static void m28229a(C9199j0 j0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            C9199j0 j0Var2 = j0Var;
            if (!m28233a(j0Var.mo23902a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static boolean m28233a(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!m28231a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C9554k0.m29414a((Object) format.f18349b0, (Object) str)) {
            return false;
        }
        int i7 = format.f18355g0;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = format.f18356h0;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = format.f18357i0;
        if (f != -1.0f && f > ((float) i5)) {
            return false;
        }
        int i9 = format.f18345X;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r0 < 0) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.trackselection.C9311j.C9312a m28226a(com.google.android.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.google.android.exoplayer2.trackselection.C9295d.C9299d r20) {
        /*
            r0 = r18
            r1 = r20
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000b:
            int r11 = r0.f20170c
            if (r5 >= r11) goto L_0x00e0
            com.google.android.exoplayer2.source.j0 r11 = r0.mo23531a(r5)
            int r13 = r1.f21234g0
            int r14 = r1.f21235h0
            boolean r15 = r1.f21236i0
            java.util.List r13 = m28228a(r11, r13, r14, r15)
            r14 = r19[r5]
            r15 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = 0
        L_0x0025:
            int r2 = r11.f20833c
            if (r6 >= r2) goto L_0x00d1
            r2 = r14[r6]
            boolean r12 = r1.f21245r0
            boolean r2 = m28231a(r2, r12)
            if (r2 == 0) goto L_0x00c6
            com.google.android.exoplayer2.Format r2 = r11.mo23902a(r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L_0x006a
            int r12 = r2.f18355g0
            if (r12 == r3) goto L_0x0049
            int r4 = r1.f21227Z
            if (r12 > r4) goto L_0x006a
        L_0x0049:
            int r4 = r2.f18356h0
            if (r4 == r3) goto L_0x0051
            int r12 = r1.f21228a0
            if (r4 > r12) goto L_0x006a
        L_0x0051:
            float r4 = r2.f18357i0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0060
            int r12 = r1.f21229b0
            float r12 = (float) r12
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x006a
        L_0x0060:
            int r4 = r2.f18345X
            if (r4 == r3) goto L_0x0068
            int r12 = r1.f21230c0
            if (r4 > r12) goto L_0x006a
        L_0x0068:
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            if (r4 != 0) goto L_0x0072
            boolean r12 = r1.f21231d0
            if (r12 != 0) goto L_0x0072
            goto L_0x00c6
        L_0x0072:
            if (r4 == 0) goto L_0x0076
            r12 = 2
            goto L_0x0077
        L_0x0076:
            r12 = 1
        L_0x0077:
            r3 = r14[r6]
            r0 = 0
            boolean r3 = m28231a(r3, r0)
            if (r3 == 0) goto L_0x0082
            int r12 = r12 + 1000
        L_0x0082:
            if (r12 <= r9) goto L_0x0086
            r0 = 1
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            if (r12 != r9) goto L_0x00b8
            int r0 = r2.f18345X
            int r0 = mo7785c(r0, r10)
            r17 = r7
            boolean r7 = r1.f21243p0
            if (r7 == 0) goto L_0x009d
            if (r0 == 0) goto L_0x009d
            if (r0 >= 0) goto L_0x009b
        L_0x0099:
            r0 = 1
            goto L_0x00ba
        L_0x009b:
            r0 = 0
            goto L_0x00ba
        L_0x009d:
            int r0 = r2.mo22597X()
            if (r0 == r15) goto L_0x00a8
            int r0 = mo7785c(r0, r15)
            goto L_0x00ae
        L_0x00a8:
            int r0 = r2.f18345X
            int r0 = mo7785c(r0, r10)
        L_0x00ae:
            if (r3 == 0) goto L_0x00b5
            if (r4 == 0) goto L_0x00b5
            if (r0 <= 0) goto L_0x009b
            goto L_0x0099
        L_0x00b5:
            if (r0 >= 0) goto L_0x009b
            goto L_0x0099
        L_0x00b8:
            r17 = r7
        L_0x00ba:
            if (r0 == 0) goto L_0x00c8
            int r10 = r2.f18345X
            int r15 = r2.mo22597X()
            r8 = r6
            r7 = r11
            r9 = r12
            goto L_0x00ca
        L_0x00c6:
            r17 = r7
        L_0x00c8:
            r7 = r17
        L_0x00ca:
            int r6 = r6 + 1
            r3 = -1
            r0 = r18
            goto L_0x0025
        L_0x00d1:
            r17 = r7
            int r5 = r5 + 1
            r3 = -1
            r0 = r18
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r15
            r6 = r17
            goto L_0x000b
        L_0x00e0:
            if (r6 != 0) goto L_0x00e5
            r16 = 0
            goto L_0x00f2
        L_0x00e5:
            com.google.android.exoplayer2.trackselection.j$a r2 = new com.google.android.exoplayer2.trackselection.j$a
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r7
            r2.<init>(r6, r0)
            r16 = r2
        L_0x00f2:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C9295d.m28226a(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.d$d):com.google.android.exoplayer2.trackselection.j$a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C9312a, C9298c> mo7758a(TrackGroupArray trackGroupArray, int[][] iArr, int i, C9299d dVar, boolean z) throws ExoPlaybackException {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C9299d dVar2 = dVar;
        C9312a aVar = null;
        C9298c cVar = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < trackGroupArray2.f20170c) {
            C9199j0 a = trackGroupArray2.mo23531a(i2);
            int[] iArr2 = iArr[i2];
            C9298c cVar2 = cVar;
            int i5 = i4;
            int i6 = i3;
            for (int i7 = 0; i7 < a.f20833c; i7++) {
                if (m28231a(iArr2[i7], dVar2.f21245r0)) {
                    C9298c cVar3 = new C9298c(a.mo23902a(i7), dVar2, iArr2[i7]);
                    if ((cVar3.f21223c || dVar2.f21239l0) && (cVar2 == null || cVar3.compareTo(cVar2) > 0)) {
                        i6 = i2;
                        i5 = i7;
                        cVar2 = cVar3;
                    }
                }
            }
            i2++;
            i3 = i6;
            i4 = i5;
            cVar = cVar2;
        }
        if (i3 == -1) {
            return null;
        }
        C9199j0 a2 = trackGroupArray2.mo23531a(i3);
        if (!dVar2.f21244q0 && !dVar2.f21243p0 && z) {
            int[] a3 = m28235a(a2, iArr[i3], dVar2.f21238k0, dVar2.f21240m0, dVar2.f21241n0, dVar2.f21242o0);
            if (a3.length > 0) {
                aVar = new C9312a(a2, a3);
            }
        }
        if (aVar == null) {
            aVar = new C9312a(a2, i4);
        }
        C9537e.m29296a(cVar);
        return Pair.create(aVar, cVar);
    }

    /* renamed from: a */
    private static int[] m28235a(C9199j0 j0Var, int[] iArr, int i, boolean z, boolean z2, boolean z3) {
        C9199j0 j0Var2 = j0Var;
        HashSet hashSet = new HashSet();
        C9297b bVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < j0Var2.f20833c; i3++) {
            Format a = j0Var.mo23902a(i3);
            C9297b bVar2 = new C9297b(a.f18363o0, a.f18364p0, a.f18349b0);
            if (hashSet.add(bVar2)) {
                int a2 = m28223a(j0Var, iArr, bVar2, i, z, z2, z3);
                if (a2 > i2) {
                    i2 = a2;
                    bVar = bVar2;
                }
            }
        }
        if (i2 <= 1) {
            return f21208g;
        }
        C9537e.m29296a(bVar);
        int[] iArr2 = new int[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < j0Var2.f20833c; i5++) {
            if (m28232a(j0Var.mo23902a(i5), iArr[i5], bVar, i, z, z2, z3)) {
                int i6 = i4 + 1;
                iArr2[i4] = i5;
                i4 = i6;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int m28223a(C9199j0 j0Var, int[] iArr, C9297b bVar, int i, boolean z, boolean z2, boolean z3) {
        C9199j0 j0Var2 = j0Var;
        int i2 = 0;
        for (int i3 = 0; i3 < j0Var2.f20833c; i3++) {
            if (m28232a(j0Var.mo23902a(i3), iArr[i3], bVar, i, z, z2, z3)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static boolean m28232a(Format format, int i, C9297b bVar, int i2, boolean z, boolean z2, boolean z3) {
        if (!m28231a(i, false)) {
            return false;
        }
        int i3 = format.f18345X;
        if (i3 != -1 && i3 > i2) {
            return false;
        }
        if (!z3) {
            int i4 = format.f18363o0;
            if (i4 == -1 || i4 != bVar.f21212a) {
                return false;
            }
        }
        if (!z) {
            String str = format.f18349b0;
            if (str == null || !TextUtils.equals(str, bVar.f21214c)) {
                return false;
            }
        }
        if (!z2) {
            int i5 = format.f18364p0;
            if (i5 == -1 || i5 != bVar.f21213b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C9312a, C9304g> mo7759a(TrackGroupArray trackGroupArray, int[][] iArr, C9299d dVar, String str) throws ExoPlaybackException {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C9299d dVar2 = dVar;
        C9199j0 j0Var = null;
        C9304g gVar = null;
        int i = 0;
        int i2 = -1;
        while (i < trackGroupArray2.f20170c) {
            C9199j0 a = trackGroupArray2.mo23531a(i);
            int[] iArr2 = iArr[i];
            C9304g gVar2 = gVar;
            C9199j0 j0Var2 = j0Var;
            for (int i3 = 0; i3 < a.f20833c; i3++) {
                if (m28231a(iArr2[i3], dVar2.f21245r0)) {
                    C9304g gVar3 = new C9304g(a.mo23902a(i3), dVar2, iArr2[i3], str);
                    if (gVar3.f21283c && (gVar2 == null || gVar3.compareTo(gVar2) > 0)) {
                        i2 = i3;
                        j0Var2 = a;
                        gVar2 = gVar3;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
            i++;
            j0Var = j0Var2;
            gVar = gVar2;
        }
        if (j0Var == null) {
            return null;
        }
        C9312a aVar = new C9312a(j0Var, i2);
        C9537e.m29296a(gVar);
        return Pair.create(aVar, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9312a mo24083a(int i, TrackGroupArray trackGroupArray, int[][] iArr, C9299d dVar) throws ExoPlaybackException {
        C9199j0 j0Var = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < trackGroupArray.f20170c) {
            C9199j0 a = trackGroupArray.mo23531a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            int i6 = i3;
            C9199j0 j0Var2 = j0Var;
            for (int i7 = 0; i7 < a.f20833c; i7++) {
                if (m28231a(iArr2[i7], dVar.f21245r0)) {
                    int i8 = (a.mo23902a(i7).f18343V & 1) != 0 ? 2 : 1;
                    if (m28231a(iArr2[i7], false)) {
                        i8 += 1000;
                    }
                    if (i8 > i5) {
                        i6 = i7;
                        j0Var2 = a;
                        i5 = i8;
                    }
                }
            }
            i2++;
            j0Var = j0Var2;
            i3 = i6;
            i4 = i5;
        }
        if (j0Var == null) {
            return null;
        }
        return new C9312a(j0Var, i3);
    }

    /* renamed from: a */
    private static void m28230a(C9307a aVar, int[][][] iArr, C8800n0[] n0VarArr, C9311j[] jVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= aVar.mo24123a()) {
                    z = true;
                    break;
                }
                int a = aVar.mo24124a(i2);
                C9311j jVar = jVarArr[i2];
                if ((a == 1 || a == 2) && jVar != null && m28234a(iArr[i2], aVar.mo24130b(i2), jVar)) {
                    if (a == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                C8800n0 n0Var = new C8800n0(i);
                n0VarArr[i4] = n0Var;
                n0VarArr[i3] = n0Var;
            }
        }
    }

    /* renamed from: a */
    private static boolean m28234a(int[][] iArr, TrackGroupArray trackGroupArray, C9311j jVar) {
        if (jVar == null) {
            return false;
        }
        int a = trackGroupArray.mo23530a(jVar.mo24067a());
        for (int i = 0; i < jVar.length(); i++) {
            if ((iArr[a][jVar.mo24070b(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected static String m28227a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    protected static int m28222a(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f18368t0)) {
            return 4;
        }
        String a = m28227a(str);
        String a2 = m28227a(format.f18368t0);
        int i = 0;
        if (a2 == null || a == null) {
            if (z && a2 == null) {
                i = 1;
            }
            return i;
        } else if (a2.startsWith(a) || a.startsWith(a2)) {
            return 3;
        } else {
            String str2 = "-";
            if (C9554k0.m29437b(a2, str2)[0].equals(C9554k0.m29437b(a, str2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static List<Integer> m28228a(C9199j0 j0Var, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(j0Var.f20833c);
        for (int i3 = 0; i3 < j0Var.f20833c; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < j0Var.f20833c; i5++) {
                Format a = j0Var.mo23902a(i5);
                int i6 = a.f18355g0;
                if (i6 > 0) {
                    int i7 = a.f18356h0;
                    if (i7 > 0) {
                        Point a2 = m28224a(z, i, i2, i6, i7);
                        int i8 = a.f18355g0;
                        int i9 = a.f18356h0;
                        int i10 = i8 * i9;
                        if (i8 >= ((int) (((float) a2.x) * 0.98f)) && i9 >= ((int) (((float) a2.y) * 0.98f)) && i10 < i4) {
                            i4 = i10;
                        }
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int X = j0Var.mo23902a(((Integer) arrayList.get(size)).intValue()).mo22597X();
                    if (X == -1 || X > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m28224a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.p393v0.C9554k0.m29381a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29381a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C9295d.m28224a(boolean, int, int, int, int):android.graphics.Point");
    }
}
