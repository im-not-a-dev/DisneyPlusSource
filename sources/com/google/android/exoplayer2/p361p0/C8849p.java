package com.google.android.exoplayer2.p361p0;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.p0.p */
/* compiled from: AudioTimestampPoller */
final class C8849p {

    /* renamed from: a */
    private final C8850a f18850a;

    /* renamed from: b */
    private int f18851b;

    /* renamed from: c */
    private long f18852c;

    /* renamed from: d */
    private long f18853d;

    /* renamed from: e */
    private long f18854e;

    /* renamed from: f */
    private long f18855f;

    @TargetApi(19)
    /* renamed from: com.google.android.exoplayer2.p0.p$a */
    /* compiled from: AudioTimestampPoller */
    private static final class C8850a {

        /* renamed from: a */
        private final AudioTrack f18856a;

        /* renamed from: b */
        private final AudioTimestamp f18857b = new AudioTimestamp();

        /* renamed from: c */
        private long f18858c;

        /* renamed from: d */
        private long f18859d;

        /* renamed from: e */
        private long f18860e;

        public C8850a(AudioTrack audioTrack) {
            this.f18856a = audioTrack;
        }

        /* renamed from: a */
        public long mo23136a() {
            return this.f18860e;
        }

        /* renamed from: b */
        public long mo23137b() {
            return this.f18857b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo23138c() {
            boolean timestamp = this.f18856a.getTimestamp(this.f18857b);
            if (timestamp) {
                long j = this.f18857b.framePosition;
                if (this.f18859d > j) {
                    this.f18858c++;
                }
                this.f18859d = j;
                this.f18860e = j + (this.f18858c << 32);
            }
            return timestamp;
        }
    }

    public C8849p(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.f18850a = new C8850a(audioTrack);
            mo23135g();
            return;
        }
        this.f18850a = null;
        m25689a(3);
    }

    /* renamed from: a */
    public boolean mo23129a(long j) {
        C8850a aVar = this.f18850a;
        if (aVar == null || j - this.f18854e < this.f18853d) {
            return false;
        }
        this.f18854e = j;
        boolean c = aVar.mo23138c();
        int i = this.f18851b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo23135g();
                    }
                } else if (!c) {
                    mo23135g();
                }
            } else if (!c) {
                mo23135g();
            } else if (this.f18850a.mo23136a() > this.f18855f) {
                m25689a(2);
            }
        } else if (c) {
            if (this.f18850a.mo23137b() >= this.f18852c) {
                this.f18855f = this.f18850a.mo23136a();
                m25689a(1);
            } else {
                c = false;
            }
        } else if (j - this.f18852c > 500000) {
            m25689a(3);
        }
        return c;
    }

    /* renamed from: b */
    public long mo23130b() {
        C8850a aVar = this.f18850a;
        if (aVar != null) {
            return aVar.mo23136a();
        }
        return -1;
    }

    /* renamed from: c */
    public long mo23131c() {
        C8850a aVar = this.f18850a;
        if (aVar != null) {
            return aVar.mo23137b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean mo23132d() {
        int i = this.f18851b;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    public boolean mo23133e() {
        return this.f18851b == 2;
    }

    /* renamed from: f */
    public void mo23134f() {
        m25689a(4);
    }

    /* renamed from: g */
    public void mo23135g() {
        if (this.f18850a != null) {
            m25689a(0);
        }
    }

    /* renamed from: a */
    public void mo23128a() {
        if (this.f18851b == 4) {
            mo23135g();
        }
    }

    /* renamed from: a */
    private void m25689a(int i) {
        this.f18851b = i;
        if (i == 0) {
            this.f18854e = 0;
            this.f18855f = -1;
            this.f18852c = System.nanoTime() / 1000;
            this.f18853d = 5000;
        } else if (i == 1) {
            this.f18853d = 5000;
        } else if (i == 2 || i == 3) {
            this.f18853d = 10000000;
        } else if (i == 4) {
            this.f18853d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
