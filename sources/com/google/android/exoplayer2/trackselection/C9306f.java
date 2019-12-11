package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.C8735m0;
import com.google.android.exoplayer2.C8800n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.trackselection.f */
/* compiled from: MappingTrackSelector */
public abstract class C9306f extends TrackSelector {

    /* renamed from: c */
    private C9307a f21286c;

    /* renamed from: com.google.android.exoplayer2.trackselection.f$a */
    /* compiled from: MappingTrackSelector */
    public static final class C9307a {
        @Deprecated

        /* renamed from: a */
        public final int f21287a = this.f21288b;

        /* renamed from: b */
        private final int f21288b;

        /* renamed from: c */
        private final int[] f21289c;

        /* renamed from: d */
        private final TrackGroupArray[] f21290d;

        /* renamed from: e */
        private final int[] f21291e;

        /* renamed from: f */
        private final int[][][] f21292f;

        /* renamed from: g */
        private final TrackGroupArray f21293g;

        C9307a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f21289c = iArr;
            this.f21290d = trackGroupArrayArr;
            this.f21292f = iArr3;
            this.f21291e = iArr2;
            this.f21293g = trackGroupArray;
            this.f21288b = iArr.length;
        }

        /* renamed from: a */
        public int mo24123a() {
            return this.f21288b;
        }

        /* renamed from: b */
        public TrackGroupArray mo24130b(int i) {
            return this.f21290d[i];
        }

        /* renamed from: c */
        public TrackGroupArray mo24131c() {
            return this.f21293g;
        }

        /* renamed from: a */
        public int mo24124a(int i) {
            return this.f21289c[i];
        }

        /* renamed from: b */
        public int mo24128b(int i, int i2, int i3) {
            return this.f21292f[i][i2][i3] & 7;
        }

        @Deprecated
        /* renamed from: a */
        public int mo24125a(int i, int i2, int i3) {
            return mo24128b(i, i2, i3);
        }

        @Deprecated
        /* renamed from: b */
        public TrackGroupArray mo24129b() {
            return mo24131c();
        }

        /* renamed from: a */
        public int mo24126a(int i, int i2, boolean z) {
            int i3 = this.f21290d[i].mo23531a(i2).f20833c;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int b = mo24128b(i, i2, i5);
                if (b == 4 || (z && b == 3)) {
                    int i6 = i4 + 1;
                    iArr[i4] = i5;
                    i4 = i6;
                }
            }
            return mo24127a(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: a */
        public int mo24127a(int i, int i2, int[] iArr) {
            int i3 = 0;
            Object obj = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str = this.f21290d[i].mo23531a(i2).mo23902a(iArr[i3]).f18349b0;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    obj = str;
                } else {
                    z |= !Util.m29414a(obj, (Object) str);
                }
                i5 = Math.min(i5, this.f21292f[i][i2][i3] & 24);
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.f21291e[i]) : i5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Pair<C8800n0[], C9311j[]> mo24082a(C9307a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    /* renamed from: a */
    public final void mo24047a(Object obj) {
        this.f21286c = (C9307a) obj;
    }

    /* renamed from: c */
    public final C9307a mo24122c() {
        return this.f21286c;
    }

    /* renamed from: a */
    public final C9318m mo24044a(C8735m0[] m0VarArr, TrackGroupArray trackGroupArray, MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        int[] iArr;
        int[] iArr2 = new int[(m0VarArr.length + 1)];
        C9199j0[][] j0VarArr = new C9199j0[(m0VarArr.length + 1)][];
        int[][][] iArr3 = new int[(m0VarArr.length + 1)][][];
        for (int i = 0; i < j0VarArr.length; i++) {
            int i2 = trackGroupArray.f20170c;
            j0VarArr[i] = new C9199j0[i2];
            iArr3[i] = new int[i2][];
        }
        int[] a = m28283a(m0VarArr);
        for (int i3 = 0; i3 < trackGroupArray.f20170c; i3++) {
            C9199j0 a2 = trackGroupArray.mo23531a(i3);
            int a3 = m28281a(m0VarArr, a2);
            if (a3 == m0VarArr.length) {
                iArr = new int[a2.f20833c];
            } else {
                iArr = m28282a(m0VarArr[a3], a2);
            }
            int i4 = iArr2[a3];
            j0VarArr[a3][i4] = a2;
            iArr3[a3][i4] = iArr;
            iArr2[a3] = iArr2[a3] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[m0VarArr.length];
        int[] iArr4 = new int[m0VarArr.length];
        for (int i5 = 0; i5 < m0VarArr.length; i5++) {
            int i6 = iArr2[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((C9199j0[]) Util.m29420a((T[]) j0VarArr[i5], i6));
            iArr3[i5] = (int[][]) Util.m29420a((T[]) iArr3[i5], i6);
            iArr4[i5] = m0VarArr[i5].mo22860f();
        }
        int[] iArr5 = a;
        int[][][] iArr6 = iArr3;
        C9307a aVar = new C9307a(iArr4, trackGroupArrayArr, iArr5, iArr6, new TrackGroupArray((C9199j0[]) Util.m29420a((T[]) j0VarArr[m0VarArr.length], iArr2[m0VarArr.length])));
        Pair a4 = mo24082a(aVar, iArr3, a);
        return new C9318m((C8800n0[]) a4.first, (C9311j[]) a4.second, aVar);
    }

    /* renamed from: a */
    private static int m28281a(C8735m0[] m0VarArr, C9199j0 j0Var) throws ExoPlaybackException {
        int length = m0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < m0VarArr.length) {
            C8735m0 m0Var = m0VarArr[i];
            int i3 = i2;
            int i4 = length;
            for (int i5 = 0; i5 < j0Var.f20833c; i5++) {
                int a = m0Var.mo22859a(j0Var.mo23902a(i5)) & 7;
                if (a > i3) {
                    if (a == 4) {
                        return i;
                    }
                    i4 = i;
                    i3 = a;
                }
            }
            i++;
            length = i4;
            i2 = i3;
        }
        return length;
    }

    /* renamed from: a */
    private static int[] m28282a(C8735m0 m0Var, C9199j0 j0Var) throws ExoPlaybackException {
        int[] iArr = new int[j0Var.f20833c];
        for (int i = 0; i < j0Var.f20833c; i++) {
            iArr[i] = m0Var.mo22859a(j0Var.mo23902a(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m28283a(C8735m0[] m0VarArr) throws ExoPlaybackException {
        int[] iArr = new int[m0VarArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = m0VarArr[i].mo22861o();
        }
        return iArr;
    }
}
