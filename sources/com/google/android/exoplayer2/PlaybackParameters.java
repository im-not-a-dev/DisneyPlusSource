package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

public final class PlaybackParameters {

    /* renamed from: e */
    public static final PlaybackParameters f18371e = new PlaybackParameters(1.0f);

    /* renamed from: a */
    public final float f18372a;

    /* renamed from: b */
    public final float f18373b;

    /* renamed from: c */
    public final boolean f18374c;

    /* renamed from: d */
    private final int f18375d;

    public PlaybackParameters(float f) {
        this(f, 1.0f, false);
    }

    /* renamed from: a */
    public long mo22615a(long j) {
        return j * ((long) this.f18375d);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (!(this.f18372a == playbackParameters.f18372a && this.f18373b == playbackParameters.f18373b && this.f18374c == playbackParameters.f18374c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f18372a)) * 31) + Float.floatToRawIntBits(this.f18373b)) * 31) + (this.f18374c ? 1 : 0);
    }

    public PlaybackParameters(float f, float f2) {
        this(f, f2, false);
    }

    public PlaybackParameters(float f, float f2, boolean z) {
        boolean z2 = true;
        Assertions.checkArgument(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.f18372a = f;
        this.f18373b = f2;
        this.f18374c = z;
        this.f18375d = Math.round(f * 1000.0f);
    }
}
