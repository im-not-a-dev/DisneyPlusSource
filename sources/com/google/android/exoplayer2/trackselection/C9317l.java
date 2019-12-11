package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;

/* renamed from: com.google.android.exoplayer2.trackselection.l */
/* compiled from: TrackSelectionUtil */
public final class C9317l {
    /* renamed from: a */
    public static int[] m28324a(Format[] formatArr, int[] iArr) {
        int length = formatArr.length;
        if (iArr == null) {
            iArr = new int[length];
        }
        for (int i = 0; i < length; i++) {
            iArr[i] = formatArr[i].f18345X;
        }
        return iArr;
    }
}
