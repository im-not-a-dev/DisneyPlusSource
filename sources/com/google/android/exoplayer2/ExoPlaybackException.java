package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p393v0.Assertions;
import java.io.IOException;

public final class ExoPlaybackException extends Exception {

    /* renamed from: U */
    private final Throwable f18340U;

    /* renamed from: c */
    public final int f18341c;

    private ExoPlaybackException(int i, Throwable th, int i2) {
        super(th);
        this.f18341c = i;
        this.f18340U = th;
    }

    /* renamed from: a */
    public static ExoPlaybackException m24861a(IOException iOException) {
        return new ExoPlaybackException(0, iOException, -1);
    }

    /* renamed from: b */
    public IOException mo22595b() {
        Assertions.checkState(this.f18341c == 0);
        Throwable th = this.f18340U;
        Assertions.checkNotNull(th);
        return (IOException) th;
    }

    /* renamed from: c */
    public RuntimeException mo22596c() {
        Assertions.checkState(this.f18341c == 2);
        Throwable th = this.f18340U;
        Assertions.checkNotNull(th);
        return (RuntimeException) th;
    }

    /* renamed from: a */
    public static ExoPlaybackException m24862a(Exception exc, int i) {
        return new ExoPlaybackException(1, exc, i);
    }

    /* renamed from: a */
    public static ExoPlaybackException m24864a(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException, -1);
    }

    /* renamed from: a */
    public static ExoPlaybackException m24863a(OutOfMemoryError outOfMemoryError) {
        return new ExoPlaybackException(4, outOfMemoryError, -1);
    }

    /* renamed from: a */
    public Exception mo22594a() {
        boolean z = true;
        if (this.f18341c != 1) {
            z = false;
        }
        Assertions.checkState(z);
        Throwable th = this.f18340U;
        Assertions.checkNotNull(th);
        return (Exception) th;
    }
}
