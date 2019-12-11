package com.google.android.exoplayer2.p393v0;

/* renamed from: com.google.android.exoplayer2.v0.h0 */
/* compiled from: TimestampAdjuster */
public final class C9545h0 {

    /* renamed from: a */
    private long f22265a;

    /* renamed from: b */
    private long f22266b;

    /* renamed from: c */
    private volatile long f22267c = -9223372036854775807L;

    public C9545h0(long j) {
        mo24634c(j);
    }

    /* renamed from: a */
    public long mo24629a() {
        return this.f22265a;
    }

    /* renamed from: b */
    public long mo24631b() {
        if (this.f22267c != -9223372036854775807L) {
            return this.f22266b + this.f22267c;
        }
        long j = this.f22265a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public synchronized void mo24634c(long j) {
        Assertions.checkState(this.f22267c == -9223372036854775807L);
        this.f22265a = j;
    }

    /* renamed from: d */
    public void mo24635d() {
        this.f22267c = -9223372036854775807L;
    }

    /* renamed from: e */
    public synchronized void mo24636e() throws InterruptedException {
        while (this.f22267c == -9223372036854775807L) {
            wait();
        }
    }

    /* renamed from: d */
    public static long m29343d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: a */
    public long mo24630a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f22267c != -9223372036854775807L) {
            this.f22267c = j;
        } else {
            long j2 = this.f22265a;
            if (j2 != Long.MAX_VALUE) {
                this.f22266b = j2 - j;
            }
            synchronized (this) {
                this.f22267c = j;
                notifyAll();
            }
        }
        return j + this.f22266b;
    }

    /* renamed from: b */
    public long mo24632b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f22267c != -9223372036854775807L) {
            long e = m29344e(this.f22267c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return mo24630a(m29343d(j));
    }

    /* renamed from: e */
    public static long m29344e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: c */
    public long mo24633c() {
        if (this.f22265a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f22267c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f22266b;
    }
}
