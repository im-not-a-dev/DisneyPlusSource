package com.google.android.exoplayer2.p361p0;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* renamed from: com.google.android.exoplayer2.p0.q */
/* compiled from: AudioTrackPositionTracker */
final class C8851q {

    /* renamed from: a */
    private final C8852a f18861a;

    /* renamed from: b */
    private final long[] f18862b;

    /* renamed from: c */
    private AudioTrack f18863c;

    /* renamed from: d */
    private int f18864d;

    /* renamed from: e */
    private int f18865e;

    /* renamed from: f */
    private C8849p f18866f;

    /* renamed from: g */
    private int f18867g;

    /* renamed from: h */
    private boolean f18868h;

    /* renamed from: i */
    private long f18869i;

    /* renamed from: j */
    private long f18870j;

    /* renamed from: k */
    private long f18871k;

    /* renamed from: l */
    private Method f18872l;

    /* renamed from: m */
    private long f18873m;

    /* renamed from: n */
    private boolean f18874n;

    /* renamed from: o */
    private boolean f18875o;

    /* renamed from: p */
    private long f18876p;

    /* renamed from: q */
    private long f18877q;

    /* renamed from: r */
    private long f18878r;

    /* renamed from: s */
    private long f18879s;

    /* renamed from: t */
    private int f18880t;

    /* renamed from: u */
    private int f18881u;

    /* renamed from: v */
    private long f18882v;

    /* renamed from: w */
    private long f18883w;

    /* renamed from: x */
    private long f18884x;

    /* renamed from: y */
    private long f18885y;

    /* renamed from: com.google.android.exoplayer2.p0.q$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface C8852a {
        /* renamed from: a */
        void mo23150a(int i, long j);

        /* renamed from: a */
        void mo23151a(long j);

        /* renamed from: a */
        void mo23152a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo23153b(long j, long j2, long j3, long j4);
    }

    public C8851q(C8852a aVar) {
        Assertions.checkNotNull(aVar);
        this.f18861a = aVar;
        if (Util.SDK_INT >= 18) {
            try {
                this.f18872l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f18862b = new long[10];
    }

    /* renamed from: f */
    private long m25705f(long j) {
        return (j * 1000000) / ((long) this.f18867g);
    }

    /* renamed from: g */
    private void m25707g(long j) {
        if (this.f18875o) {
            Method method = this.f18872l;
            if (method != null && j - this.f18876p >= 500000) {
                try {
                    AudioTrack audioTrack = this.f18863c;
                    Assertions.checkNotNull(audioTrack);
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    Util.castNonNull(num);
                    this.f18873m = (((long) num.intValue()) * 1000) - this.f18869i;
                    this.f18873m = Math.max(this.f18873m, 0);
                    if (this.f18873m > 5000000) {
                        this.f18861a.mo23151a(this.f18873m);
                        this.f18873m = 0;
                    }
                } catch (Exception unused) {
                    this.f18872l = null;
                }
                this.f18876p = j;
            }
        }
    }

    /* renamed from: h */
    private void m25708h() {
        long g = m25706g();
        if (g != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f18871k >= 30000) {
                long[] jArr = this.f18862b;
                int i = this.f18880t;
                jArr[i] = g - nanoTime;
                this.f18880t = (i + 1) % 10;
                int i2 = this.f18881u;
                if (i2 < 10) {
                    this.f18881u = i2 + 1;
                }
                this.f18871k = nanoTime;
                this.f18870j = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f18881u;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f18870j += this.f18862b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f18868h) {
                m25701a(nanoTime, g);
                m25707g(nanoTime);
            }
        }
    }

    /* renamed from: i */
    private void m25709i() {
        this.f18870j = 0;
        this.f18881u = 0;
        this.f18880t = 0;
        this.f18871k = 0;
    }

    /* renamed from: a */
    public void mo23141a(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f18863c = audioTrack;
        this.f18864d = i2;
        this.f18865e = i3;
        this.f18866f = new C8849p(audioTrack);
        this.f18867g = audioTrack.getSampleRate();
        this.f18868h = m25702a(i);
        this.f18875o = Util.m29450e(i);
        this.f18869i = this.f18875o ? m25705f((long) (i3 / i2)) : -9223372036854775807L;
        this.f18877q = 0;
        this.f18878r = 0;
        this.f18879s = 0;
        this.f18874n = false;
        this.f18882v = -9223372036854775807L;
        this.f18883w = -9223372036854775807L;
        this.f18873m = 0;
    }

    /* renamed from: b */
    public void mo23143b(long j) {
        this.f18884x = m25704f();
        this.f18882v = SystemClock.elapsedRealtime() * 1000;
        this.f18885y = j;
    }

    /* renamed from: c */
    public boolean mo23146c(long j) {
        return j > m25704f() || m25703e();
    }

    /* renamed from: d */
    public void mo23147d() {
        C8849p pVar = this.f18866f;
        Assertions.checkNotNull(pVar);
        pVar.mo23135g();
    }

    /* renamed from: e */
    public boolean mo23149e(long j) {
        AudioTrack audioTrack = this.f18863c;
        Assertions.checkNotNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f18868h) {
            if (playState == 2) {
                this.f18874n = false;
                return false;
            } else if (playState == 1 && m25704f() == 0) {
                return false;
            }
        }
        boolean z = this.f18874n;
        this.f18874n = mo23146c(j);
        if (z && !this.f18874n && playState != 1) {
            C8852a aVar = this.f18861a;
            if (aVar != null) {
                aVar.mo23150a(this.f18865e, C.usToMs(this.f18869i));
            }
        }
        return true;
    }

    /* renamed from: f */
    private long m25704f() {
        AudioTrack audioTrack = this.f18863c;
        Assertions.checkNotNull(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.f18882v != -9223372036854775807L) {
            return Math.min(this.f18885y, this.f18884x + ((((SystemClock.elapsedRealtime() * 1000) - this.f18882v) * ((long) this.f18867g)) / 1000000));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack2.getPlaybackHeadPosition());
        if (this.f18868h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18879s = this.f18877q;
            }
            playbackHeadPosition += this.f18879s;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f18877q > 0 && playState == 3) {
                if (this.f18883w == -9223372036854775807L) {
                    this.f18883w = SystemClock.elapsedRealtime();
                }
                return this.f18877q;
            }
            this.f18883w = -9223372036854775807L;
        }
        if (this.f18877q > playbackHeadPosition) {
            this.f18878r++;
        }
        this.f18877q = playbackHeadPosition;
        return playbackHeadPosition + (this.f18878r << 32);
    }

    /* renamed from: d */
    public boolean mo23148d(long j) {
        return this.f18883w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f18883w >= 200;
    }

    /* renamed from: c */
    public void mo23145c() {
        m25709i();
        this.f18863c = null;
        this.f18866f = null;
    }

    /* renamed from: b */
    public boolean mo23144b() {
        m25709i();
        if (this.f18882v != -9223372036854775807L) {
            return false;
        }
        C8849p pVar = this.f18866f;
        Assertions.checkNotNull(pVar);
        pVar.mo23135g();
        return true;
    }

    /* renamed from: e */
    private boolean m25703e() {
        if (this.f18868h) {
            AudioTrack audioTrack = this.f18863c;
            Assertions.checkNotNull(audioTrack);
            if (audioTrack.getPlayState() == 2 && m25704f() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private long m25706g() {
        return m25705f(m25704f());
    }

    /* renamed from: a */
    public long mo23140a(boolean z) {
        long j;
        AudioTrack audioTrack = this.f18863c;
        Assertions.checkNotNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            m25708h();
        }
        long nanoTime = System.nanoTime() / 1000;
        C8849p pVar = this.f18866f;
        Assertions.checkNotNull(pVar);
        C8849p pVar2 = pVar;
        if (pVar2.mo23132d()) {
            long f = m25705f(pVar2.mo23130b());
            if (!pVar2.mo23133e()) {
                return f;
            }
            return f + (nanoTime - pVar2.mo23131c());
        }
        if (this.f18881u == 0) {
            j = m25706g();
        } else {
            j = nanoTime + this.f18870j;
        }
        if (!z) {
            j -= this.f18873m;
        }
        return j;
    }

    /* renamed from: a */
    public boolean mo23142a() {
        AudioTrack audioTrack = this.f18863c;
        Assertions.checkNotNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: a */
    public int mo23139a(long j) {
        return this.f18865e - ((int) (j - (m25704f() * ((long) this.f18864d))));
    }

    /* renamed from: a */
    private void m25701a(long j, long j2) {
        C8849p pVar = this.f18866f;
        Assertions.checkNotNull(pVar);
        C8849p pVar2 = pVar;
        if (pVar2.mo23129a(j)) {
            long c = pVar2.mo23131c();
            long b = pVar2.mo23130b();
            if (Math.abs(c - j) > 5000000) {
                this.f18861a.mo23153b(b, c, j, j2);
                pVar2.mo23134f();
            } else if (Math.abs(m25705f(b) - j2) > 5000000) {
                this.f18861a.mo23152a(b, c, j, j2);
                pVar2.mo23134f();
            } else {
                pVar2.mo23128a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m25702a(int i) {
        return Util.SDK_INT < 23 && (i == 5 || i == 6);
    }
}
