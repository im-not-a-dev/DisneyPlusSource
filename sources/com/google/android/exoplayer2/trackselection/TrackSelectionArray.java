package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;

public final class TrackSelectionArray {

    /* renamed from: a */
    public final int f21167a;

    /* renamed from: b */
    private final TrackSelection[] f21168b;

    /* renamed from: c */
    private int f21169c;

    public TrackSelectionArray(TrackSelection... jVarArr) {
        this.f21168b = jVarArr;
        this.f21167a = jVarArr.length;
    }

    /* renamed from: a */
    public TrackSelection mo24040a(int i) {
        return this.f21168b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21168b, ((TrackSelectionArray) obj).f21168b);
    }

    public int hashCode() {
        if (this.f21169c == 0) {
            this.f21169c = 527 + Arrays.hashCode(this.f21168b);
        }
        return this.f21169c;
    }

    /* renamed from: a */
    public TrackSelection[] mo24041a() {
        return (TrackSelection[]) this.f21168b.clone();
    }
}
