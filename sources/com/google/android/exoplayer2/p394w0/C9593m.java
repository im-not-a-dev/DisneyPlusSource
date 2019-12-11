package com.google.android.exoplayer2.p394w0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p381t0.C9270a;
import com.google.android.exoplayer2.p381t0.C9271b;
import com.google.android.exoplayer2.p381t0.C9273c;
import com.google.android.exoplayer2.p381t0.C9275d;
import com.google.android.exoplayer2.p381t0.C9275d.C9278c;
import com.google.android.exoplayer2.p381t0.C9284e;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9566t;
import com.google.android.exoplayer2.p394w0.C9603r.C9604a;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* renamed from: com.google.android.exoplayer2.w0.m */
/* compiled from: MediaCodecVideoRenderer */
public class C9593m extends C9271b {

    /* renamed from: U1 */
    private static final int[] f22393U1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* renamed from: V1 */
    private static boolean f22394V1;

    /* renamed from: W1 */
    private static boolean f22395W1;

    /* renamed from: A1 */
    private int f22396A1;

    /* renamed from: B1 */
    private int f22397B1;

    /* renamed from: C1 */
    private long f22398C1;

    /* renamed from: D1 */
    private int f22399D1;

    /* renamed from: E1 */
    private float f22400E1;

    /* renamed from: F1 */
    private int f22401F1;

    /* renamed from: G1 */
    private int f22402G1;

    /* renamed from: H1 */
    private int f22403H1;

    /* renamed from: I1 */
    private float f22404I1;

    /* renamed from: J1 */
    private int f22405J1;

    /* renamed from: K1 */
    private int f22406K1;

    /* renamed from: L1 */
    private int f22407L1;

    /* renamed from: M1 */
    private float f22408M1;

    /* renamed from: N1 */
    private boolean f22409N1;

    /* renamed from: O1 */
    private int f22410O1;

    /* renamed from: P1 */
    C9596c f22411P1;

    /* renamed from: Q1 */
    private long f22412Q1;

    /* renamed from: R1 */
    private long f22413R1;

    /* renamed from: S1 */
    private int f22414S1;

    /* renamed from: T1 */
    private C9597n f22415T1;

    /* renamed from: i1 */
    private final Context f22416i1;

    /* renamed from: j1 */
    private final C9598o f22417j1 = new C9598o(this.f22416i1);

    /* renamed from: k1 */
    private final C9604a f22418k1;

    /* renamed from: l1 */
    private final long f22419l1;

    /* renamed from: m1 */
    private final int f22420m1;

    /* renamed from: n1 */
    private final boolean f22421n1;

    /* renamed from: o1 */
    private final long[] f22422o1;

    /* renamed from: p1 */
    private final long[] f22423p1;

    /* renamed from: q1 */
    private C9595b f22424q1;

    /* renamed from: r1 */
    private boolean f22425r1;

    /* renamed from: s1 */
    private Surface f22426s1;

    /* renamed from: t1 */
    private Surface f22427t1;

    /* renamed from: u1 */
    private int f22428u1;

    /* renamed from: v1 */
    private boolean f22429v1;

    /* renamed from: w1 */
    private long f22430w1;

    /* renamed from: x1 */
    private long f22431x1;

    /* renamed from: y1 */
    private long f22432y1;

    /* renamed from: z1 */
    private int f22433z1;

    /* renamed from: com.google.android.exoplayer2.w0.m$b */
    /* compiled from: MediaCodecVideoRenderer */
    protected static final class C9595b {

        /* renamed from: a */
        public final int f22434a;

        /* renamed from: b */
        public final int f22435b;

        /* renamed from: c */
        public final int f22436c;

        public C9595b(int i, int i2, int i3) {
            this.f22434a = i;
            this.f22435b = i2;
            this.f22436c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.google.android.exoplayer2.w0.m$c */
    /* compiled from: MediaCodecVideoRenderer */
    private final class C9596c implements OnFrameRenderedListener {
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C9593m mVar = C9593m.this;
            if (this == mVar.f22411P1) {
                mVar.mo24765e(j);
            }
        }

        private C9596c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public C9593m(Context context, C9273c cVar, long j, DrmSessionManager<FrameworkMediaCrypto> lVar, boolean z, boolean z2, Handler handler, C9603r rVar, int i) {
        super(2, cVar, lVar, z, z2, 30.0f);
        this.f22419l1 = j;
        this.f22420m1 = i;
        this.f22416i1 = context.getApplicationContext();
        this.f22418k1 = new C9604a(handler, rVar);
        this.f22421n1 = m29628J();
        this.f22422o1 = new long[10];
        this.f22423p1 = new long[10];
        this.f22413R1 = -9223372036854775807L;
        this.f22412Q1 = -9223372036854775807L;
        this.f22431x1 = -9223372036854775807L;
        this.f22401F1 = -1;
        this.f22402G1 = -1;
        this.f22404I1 = -1.0f;
        this.f22400E1 = -1.0f;
        this.f22428u1 = 1;
        m29627I();
    }

    /* renamed from: H */
    private void m29626H() {
        this.f22429v1 = false;
        if (Util.SDK_INT >= 23 && this.f22409N1) {
            MediaCodec z = mo24026z();
            if (z != null) {
                this.f22411P1 = new C9596c(z);
            }
        }
    }

    /* renamed from: I */
    private void m29627I() {
        this.f22405J1 = -1;
        this.f22406K1 = -1;
        this.f22408M1 = -1.0f;
        this.f22407L1 = -1;
    }

    /* renamed from: J */
    private static boolean m29628J() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    /* renamed from: K */
    private void m29629K() {
        if (this.f22433z1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f22418k1.mo24780a(this.f22433z1, elapsedRealtime - this.f22432y1);
            this.f22433z1 = 0;
            this.f22432y1 = elapsedRealtime;
        }
    }

    /* renamed from: L */
    private void m29630L() {
        if (this.f22401F1 != -1 || this.f22402G1 != -1) {
            if (this.f22405J1 != this.f22401F1 || this.f22406K1 != this.f22402G1 || this.f22407L1 != this.f22403H1 || this.f22408M1 != this.f22404I1) {
                this.f22418k1.mo24785b(this.f22401F1, this.f22402G1, this.f22403H1, this.f22404I1);
                this.f22405J1 = this.f22401F1;
                this.f22406K1 = this.f22402G1;
                this.f22407L1 = this.f22403H1;
                this.f22408M1 = this.f22404I1;
            }
        }
    }

    /* renamed from: M */
    private void m29631M() {
        if (this.f22429v1) {
            this.f22418k1.mo24787b(this.f22426s1);
        }
    }

    /* renamed from: N */
    private void m29632N() {
        if (this.f22405J1 != -1 || this.f22406K1 != -1) {
            this.f22418k1.mo24785b(this.f22405J1, this.f22406K1, this.f22407L1, this.f22408M1);
        }
    }

    /* renamed from: O */
    private void m29633O() {
        this.f22431x1 = this.f22419l1 > 0 ? SystemClock.elapsedRealtime() + this.f22419l1 : -9223372036854775807L;
    }

    /* renamed from: f */
    private static boolean m29643f(long j) {
        return j < -30000;
    }

    /* renamed from: g */
    private static boolean m29644g(long j) {
        return j < -500000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo24018B() {
        return this.f22409N1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo24021E() {
        try {
            super.mo24021E();
        } finally {
            this.f22397B1 = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo23173G() {
        if (!this.f22429v1) {
            this.f22429v1 = true;
            this.f22418k1.mo24787b(this.f22426s1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23177a(C9273c cVar, DrmSessionManager<FrameworkMediaCrypto> lVar, Format format) throws C9278c {
        boolean z;
        int i = 0;
        if (!C9566t.m29519l(format.f18349b0)) {
            return 0;
        }
        DrmInitData drmInitData = format.f18353e0;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.f18461W; i2++) {
                z |= drmInitData.mo22750a(i2).f18467Y;
            }
        } else {
            z = false;
        }
        List a = mo23181a(cVar, format, z);
        int i3 = 2;
        if (a.isEmpty()) {
            if (!z || cVar.mo24028a(format.f18349b0, false, false).isEmpty()) {
                i3 = 1;
            }
            return i3;
        } else if (!C8872q.m25888a(lVar, drmInitData)) {
            return 2;
        } else {
            C9270a aVar = (C9270a) a.get(0);
            boolean a2 = aVar.mo24010a(format);
            int i4 = aVar.mo24015b(format) ? 16 : 8;
            if (a2) {
                List a3 = cVar.mo24028a(format.f18349b0, z, true);
                if (!a3.isEmpty()) {
                    C9270a aVar2 = (C9270a) a3.get(0);
                    if (aVar2.mo24010a(format) && aVar2.mo24015b(format)) {
                        i = 32;
                    }
                }
            }
            return (a2 ? 4 : 3) | i4 | i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r9.f22409N1 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9.f22426s1 == r0) goto L_0x0022;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22843b() {
        /*
            r9 = this;
            boolean r0 = super.mo22843b()
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r9.f22429v1
            if (r0 != 0) goto L_0x0022
            android.view.Surface r0 = r9.f22427t1
            if (r0 == 0) goto L_0x0018
            android.view.Surface r4 = r9.f22426s1
            if (r4 == r0) goto L_0x0022
        L_0x0018:
            android.media.MediaCodec r0 = r9.mo24026z()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r9.f22409N1
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r9.f22431x1 = r2
            return r1
        L_0x0025:
            long r4 = r9.f22431x1
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x002d
            return r0
        L_0x002d:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.f22431x1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0038
            return r1
        L_0x0038:
            r9.f22431x1 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p394w0.C9593m.mo22843b():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23194c(long j) {
        this.f22397B1--;
        while (true) {
            int i = this.f22414S1;
            if (i != 0 && j >= this.f22423p1[0]) {
                long[] jArr = this.f22422o1;
                this.f22413R1 = jArr[0];
                this.f22414S1 = i - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.f22414S1);
                long[] jArr2 = this.f22423p1;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f22414S1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24765e(long j) {
        Format d = mo24023d(j);
        if (d != null) {
            m29637a(mo24026z(), d.f18355g0, d.f18356h0);
        }
        m29630L();
        mo23173G();
        mo23194c(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        this.f22412Q1 = -9223372036854775807L;
        this.f22413R1 = -9223372036854775807L;
        this.f22414S1 = 0;
        m29627I();
        m29626H();
        this.f22417j1.mo24768a();
        this.f22411P1 = null;
        try {
            super.mo22881t();
        } finally {
            this.f22418k1.mo24783a(this.f21128g1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo23196u() {
        try {
            super.mo23196u();
        } finally {
            Surface surface = this.f22427t1;
            if (surface != null) {
                if (this.f22426s1 == surface) {
                    this.f22426s1 = null;
                }
                this.f22427t1.release();
                this.f22427t1 = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo23197v() {
        super.mo23197v();
        this.f22433z1 = 0;
        this.f22432y1 = SystemClock.elapsedRealtime();
        this.f22398C1 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo23198w() {
        this.f22431x1 = -9223372036854775807L;
        m29629K();
        super.mo23198w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo24025y() {
        try {
            return super.mo24025y();
        } finally {
            this.f22397B1 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23193b(Format format) throws ExoPlaybackException {
        super.mo23193b(format);
        this.f22418k1.mo24782a(format);
        this.f22400E1 = format.f18359k0;
        this.f22399D1 = format.f18358j0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo24764c(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.m29359a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.m29358a();
        this.f21128g1.f19018f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24763b(long j, long j2, boolean z) {
        return m29643f(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24762b(long j, long j2) {
        return m29643f(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23192b(int i) {
        C8878d dVar = this.f21128g1;
        dVar.f19019g += i;
        this.f22433z1 += i;
        this.f22396A1 += i;
        dVar.f19020h = Math.max(this.f22396A1, dVar.f19020h);
        int i2 = this.f22420m1;
        if (i2 > 0 && this.f22433z1 >= i2) {
            m29629K();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24760b(MediaCodec mediaCodec, int i, long j) {
        m29630L();
        TraceUtil.m29359a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        TraceUtil.m29358a();
        this.f22398C1 = SystemClock.elapsedRealtime() * 1000;
        this.f21128g1.f19017e++;
        this.f22396A1 = 0;
        mo23173G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C9270a> mo23181a(C9273c cVar, Format format, boolean z) throws C9278c {
        return Collections.unmodifiableList(cVar.mo24028a(format.f18349b0, z, this.f22409N1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23187a(boolean z) throws ExoPlaybackException {
        super.mo23187a(z);
        int i = this.f22410O1;
        this.f22410O1 = mo23203p().f18681a;
        this.f22409N1 = this.f22410O1 != 0;
        if (this.f22410O1 != i) {
            mo24021E();
        }
        this.f22418k1.mo24789b(this.f21128g1);
        this.f22417j1.mo24769b();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    /* renamed from: b */
    public void mo24761b(MediaCodec mediaCodec, int i, long j, long j2) {
        m29630L();
        TraceUtil.m29359a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        TraceUtil.m29358a();
        this.f22398C1 = SystemClock.elapsedRealtime() * 1000;
        this.f21128g1.f19017e++;
        this.f22396A1 = 0;
        mo23173G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
        if (this.f22413R1 == -9223372036854775807L) {
            this.f22413R1 = j;
        } else {
            int i = this.f22414S1;
            if (i == this.f22422o1.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(this.f22422o1[this.f22414S1 - 1]);
                Log.m29500d("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.f22414S1 = i + 1;
            }
            long[] jArr = this.f22422o1;
            int i2 = this.f22414S1;
            jArr[i2 - 1] = j;
            this.f22423p1[i2 - 1] = this.f22412Q1;
        }
        super.mo22879a(formatArr, j);
    }

    /* renamed from: b */
    private boolean m29642b(C9270a aVar) {
        return Util.SDK_INT >= 23 && !this.f22409N1 && !mo24759a(aVar.f21082a) && (!aVar.f21087f || C9589k.m29620b(this.f22416i1));
    }

    /* renamed from: b */
    private static int m29641b(C9270a aVar, Format format) {
        if (format.f18351c0 == -1) {
            return m29634a(aVar, format.f18349b0, format.f18355g0, format.f18356h0);
        }
        int i = 0;
        for (int i2 = 0; i2 < format.f18352d0.size(); i2++) {
            i += ((byte[]) format.f18352d0.get(i2)).length;
        }
        return format.f18351c0 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) throws ExoPlaybackException {
        super.mo22878a(j, z);
        m29626H();
        this.f22430w1 = -9223372036854775807L;
        this.f22396A1 = 0;
        this.f22412Q1 = -9223372036854775807L;
        int i = this.f22414S1;
        if (i != 0) {
            this.f22413R1 = this.f22422o1[i - 1];
            this.f22414S1 = 0;
        }
        if (z) {
            m29633O();
        } else {
            this.f22431x1 = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public void mo22648a(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            m29640a((Surface) obj);
        } else if (i == 4) {
            this.f22428u1 = ((Integer) obj).intValue();
            MediaCodec z = mo24026z();
            if (z != null) {
                z.setVideoScalingMode(this.f22428u1);
            }
        } else if (i == 6) {
            this.f22415T1 = (C9597n) obj;
        } else {
            super.mo22648a(i, obj);
        }
    }

    /* renamed from: a */
    private void m29640a(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.f22427t1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C9270a A = mo24017A();
                if (A != null && m29642b(A)) {
                    this.f22427t1 = C9589k.m29619a(this.f22416i1, A.f21087f);
                    surface = this.f22427t1;
                }
            }
        }
        if (this.f22426s1 != surface) {
            this.f22426s1 = surface;
            int d = mo22845d();
            MediaCodec z = mo24026z();
            if (z != null) {
                if (Util.SDK_INT < 23 || surface == null || this.f22425r1) {
                    mo24021E();
                    mo24020D();
                } else {
                    m29638a(z, surface);
                }
            }
            if (surface == null || surface == this.f22427t1) {
                m29627I();
                m29626H();
                return;
            }
            m29632N();
            m29626H();
            if (d == 2) {
                m29633O();
            }
        } else if (surface != null && surface != this.f22427t1) {
            m29632N();
            m29631M();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24022a(C9270a aVar) {
        return this.f22426s1 != null || m29642b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23185a(C9270a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        String str = aVar.f21084c;
        this.f22424q1 = mo24755a(aVar, format, mo23205r());
        MediaFormat a = mo24754a(format, str, this.f22424q1, f, this.f22421n1, this.f22410O1);
        if (this.f22426s1 == null) {
            Assertions.checkState(m29642b(aVar));
            if (this.f22427t1 == null) {
                this.f22427t1 = C9589k.m29619a(this.f22416i1, aVar.f21087f);
            }
            this.f22426s1 = this.f22427t1;
        }
        mediaCodec.configure(a, this.f22426s1, mediaCrypto, 0);
        if (Util.SDK_INT >= 23 && this.f22409N1) {
            this.f22411P1 = new C9596c(mediaCodec);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23175a(MediaCodec mediaCodec, C9270a aVar, Format format, Format format2) {
        if (aVar.mo24011a(format, format2, true)) {
            int i = format2.f18355g0;
            C9595b bVar = this.f22424q1;
            if (i <= bVar.f22434a && format2.f18356h0 <= bVar.f22435b && m29641b(aVar, format2) <= this.f22424q1.f22436c) {
                return format.mo22607b(format2) ? 3 : 2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo23174a(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.f18357i0;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23186a(String str, long j, long j2) {
        this.f22418k1.mo24784a(str, j, j2);
        this.f22425r1 = mo24759a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23184a(C8879e eVar) {
        this.f22397B1++;
        this.f22412Q1 = Math.max(eVar.f19024W, this.f22412Q1);
        if (Util.SDK_INT < 23 && this.f22409N1) {
            mo24765e(eVar.f19024W);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23183a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        String str = "crop-right";
        String str2 = "crop-top";
        String str3 = "crop-bottom";
        String str4 = "crop-left";
        boolean z = mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2);
        if (z) {
            i = (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        m29637a(mediaCodec, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23189a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        long j4 = j;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j5 = j3;
        if (this.f22430w1 == -9223372036854775807L) {
            this.f22430w1 = j4;
        }
        long j6 = j5 - this.f22413R1;
        if (!z || z2) {
            long j7 = j5 - j4;
            if (this.f22426s1 != this.f22427t1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                boolean z3 = mo22845d() == 2;
                if (!this.f22429v1 || (z3 && mo24762b(j7, elapsedRealtime - this.f22398C1))) {
                    long nanoTime = System.nanoTime();
                    m29636a(j6, nanoTime, format);
                    if (Util.SDK_INT >= 21) {
                        mo24761b(mediaCodec, i, j6, nanoTime);
                    } else {
                        mo24760b(mediaCodec2, i3, j6);
                    }
                    return true;
                } else if (!z3 || j4 == this.f22430w1) {
                    return false;
                } else {
                    long j8 = j7 - (elapsedRealtime - j2);
                    long nanoTime2 = System.nanoTime();
                    long a = this.f22417j1.mo24767a(j5, (j8 * 1000) + nanoTime2);
                    long j9 = (a - nanoTime2) / 1000;
                    if (mo24757a(j9, j2, z2) && mo24758a(mediaCodec, i, j6, j)) {
                        return false;
                    }
                    if (mo24763b(j9, j2, z2)) {
                        mo24756a(mediaCodec2, i3, j6);
                        return true;
                    }
                    if (Util.SDK_INT >= 21) {
                        if (j9 < 50000) {
                            m29636a(j6, a, format);
                            mo24761b(mediaCodec, i, j6, a);
                            return true;
                        }
                    } else if (j9 < 30000) {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((j9 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m29636a(j6, a, format);
                        mo24760b(mediaCodec2, i3, j6);
                        return true;
                    }
                    return false;
                }
            } else if (!m29643f(j7)) {
                return false;
            } else {
                mo24764c(mediaCodec2, i3, j6);
                return true;
            }
        } else {
            mo24764c(mediaCodec2, i3, j6);
            return true;
        }
    }

    /* renamed from: a */
    private void m29637a(MediaCodec mediaCodec, int i, int i2) {
        this.f22401F1 = i;
        this.f22402G1 = i2;
        this.f22404I1 = this.f22400E1;
        if (Util.SDK_INT >= 21) {
            int i3 = this.f22399D1;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f22401F1;
                this.f22401F1 = this.f22402G1;
                this.f22402G1 = i4;
                this.f22404I1 = 1.0f / this.f22404I1;
            }
        } else {
            this.f22403H1 = this.f22399D1;
        }
        mediaCodec.setVideoScalingMode(this.f22428u1);
    }

    /* renamed from: a */
    private void m29636a(long j, long j2, Format format) {
        C9597n nVar = this.f22415T1;
        if (nVar != null) {
            nVar.mo24422a(j, j2, format);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24757a(long j, long j2, boolean z) {
        return m29644g(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24756a(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.m29359a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.m29358a();
        mo23192b(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24758a(MediaCodec mediaCodec, int i, long j, long j2) throws ExoPlaybackException {
        int b = mo23202b(j2);
        if (b == 0) {
            return false;
        }
        this.f21128g1.f19021i++;
        mo23192b(this.f22397B1 + b);
        mo24024x();
        return true;
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m29638a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m29639a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public MediaFormat mo24754a(Format format, String str, C9595b bVar, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f18355g0);
        mediaFormat.setInteger("height", format.f18356h0);
        C9284e.m28167a(mediaFormat, format.f18352d0);
        C9284e.m28164a(mediaFormat, "frame-rate", format.f18357i0);
        C9284e.m28165a(mediaFormat, "rotation-degrees", format.f18358j0);
        C9284e.m28163a(mediaFormat, format.f18362n0);
        if ("video/dolby-vision".equals(format.f18349b0)) {
            Pair b = C9275d.m28137b(format.f18346Y);
            if (b != null) {
                C9284e.m28165a(mediaFormat, "profile", ((Integer) b.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", bVar.f22434a);
        mediaFormat.setInteger("max-height", bVar.f22435b);
        C9284e.m28165a(mediaFormat, "max-input-size", bVar.f22436c);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m29639a(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9595b mo24755a(C9270a aVar, Format format, Format[] formatArr) {
        int i = format.f18355g0;
        int i2 = format.f18356h0;
        int b = m29641b(aVar, format);
        if (formatArr.length == 1) {
            if (b != -1) {
                int a = m29634a(aVar, format.f18349b0, format.f18355g0, format.f18356h0);
                if (a != -1) {
                    b = Math.min((int) (((float) b) * 1.5f), a);
                }
            }
            return new C9595b(i, i2, b);
        }
        int i3 = i2;
        int i4 = b;
        boolean z = false;
        int i5 = i;
        for (Format format2 : formatArr) {
            if (aVar.mo24011a(format, format2, false)) {
                z |= format2.f18355g0 == -1 || format2.f18356h0 == -1;
                i5 = Math.max(i5, format2.f18355g0);
                i3 = Math.max(i3, format2.f18356h0);
                i4 = Math.max(i4, m29641b(aVar, format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i5);
            String str = "x";
            sb.append(str);
            sb.append(i3);
            String str2 = "MediaCodecVideoRenderer";
            Log.m29500d(str2, sb.toString());
            Point a2 = m29635a(aVar, format);
            if (a2 != null) {
                i5 = Math.max(i5, a2.x);
                i3 = Math.max(i3, a2.y);
                i4 = Math.max(i4, m29634a(aVar, format.f18349b0, i5, i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i5);
                sb2.append(str);
                sb2.append(i3);
                Log.m29500d(str2, sb2.toString());
            }
        }
        return new C9595b(i5, i3, i4);
    }

    /* renamed from: a */
    private static Point m29635a(C9270a aVar, Format format) {
        int[] iArr;
        boolean z = format.f18356h0 > format.f18355g0;
        int i = z ? format.f18356h0 : format.f18355g0;
        int i2 = z ? format.f18355g0 : format.f18356h0;
        float f = ((float) i2) / ((float) i);
        for (int i3 : f22393U1) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point a = aVar.mo24007a(i5, i3);
                if (aVar.mo24009a(a.x, a.y, (double) format.f18357i0)) {
                    return a;
                }
            } else {
                try {
                    int a2 = Util.m29381a(i3, 16) * 16;
                    int a3 = Util.m29381a(i4, 16) * 16;
                    if (a2 * a3 <= C9275d.m28136b()) {
                        int i6 = z ? a3 : a2;
                        if (!z) {
                            a2 = a3;
                        }
                        return new Point(i6, a2);
                    }
                } catch (C9278c unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r7.f21087f != false) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m29634a(com.google.android.exoplayer2.p381t0.C9270a r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00a9
            if (r10 != r0) goto L_0x0007
            goto L_0x00a9
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            if (r8 == 0) goto L_0x00a0
            if (r8 == r3) goto L_0x00a0
            if (r8 == r6) goto L_0x0061
            if (r8 == r5) goto L_0x00a0
            if (r8 == r4) goto L_0x005e
            if (r8 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r9 = r9 * r10
            goto L_0x00a3
        L_0x0061:
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "KFSOWI"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            boolean r7 = r7.f21087f
            if (r7 == 0) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            r7 = 16
            int r8 = com.google.android.exoplayer2.util.Util.m29381a(r9, r7)
            int r9 = com.google.android.exoplayer2.util.Util.m29381a(r10, r7)
            int r8 = r8 * r9
            int r8 = r8 * 16
            int r9 = r8 * 16
            goto L_0x00a2
        L_0x009f:
            return r0
        L_0x00a0:
            int r9 = r9 * r10
        L_0x00a2:
            r4 = 2
        L_0x00a3:
            int r9 = r9 * 3
            int r4 = r4 * 2
            int r9 = r9 / r4
            return r9
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p394w0.C9593m.m29634a(com.google.android.exoplayer2.t0.a, java.lang.String, int, int):int");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x060d, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x060e, code lost:
        switch(r1) {
            case 0: goto L_0x0612;
            case 1: goto L_0x0612;
            case 2: goto L_0x0612;
            case 3: goto L_0x0612;
            case 4: goto L_0x0612;
            case 5: goto L_0x0612;
            case 6: goto L_0x0612;
            case 7: goto L_0x0612;
            case 8: goto L_0x0612;
            case 9: goto L_0x0612;
            case 10: goto L_0x0612;
            case 11: goto L_0x0612;
            case 12: goto L_0x0612;
            case 13: goto L_0x0612;
            case 14: goto L_0x0612;
            case 15: goto L_0x0612;
            case 16: goto L_0x0612;
            case 17: goto L_0x0612;
            case 18: goto L_0x0612;
            case 19: goto L_0x0612;
            case 20: goto L_0x0612;
            case 21: goto L_0x0612;
            case 22: goto L_0x0612;
            case 23: goto L_0x0612;
            case 24: goto L_0x0612;
            case 25: goto L_0x0612;
            case 26: goto L_0x0612;
            case 27: goto L_0x0612;
            case 28: goto L_0x0612;
            case 29: goto L_0x0612;
            case 30: goto L_0x0612;
            case 31: goto L_0x0612;
            case 32: goto L_0x0612;
            case 33: goto L_0x0612;
            case 34: goto L_0x0612;
            case 35: goto L_0x0612;
            case 36: goto L_0x0612;
            case 37: goto L_0x0612;
            case 38: goto L_0x0612;
            case 39: goto L_0x0612;
            case 40: goto L_0x0612;
            case 41: goto L_0x0612;
            case 42: goto L_0x0612;
            case 43: goto L_0x0612;
            case 44: goto L_0x0612;
            case 45: goto L_0x0612;
            case 46: goto L_0x0612;
            case 47: goto L_0x0612;
            case 48: goto L_0x0612;
            case 49: goto L_0x0612;
            case 50: goto L_0x0612;
            case 51: goto L_0x0612;
            case 52: goto L_0x0612;
            case 53: goto L_0x0612;
            case 54: goto L_0x0612;
            case 55: goto L_0x0612;
            case 56: goto L_0x0612;
            case 57: goto L_0x0612;
            case 58: goto L_0x0612;
            case 59: goto L_0x0612;
            case 60: goto L_0x0612;
            case 61: goto L_0x0612;
            case 62: goto L_0x0612;
            case 63: goto L_0x0612;
            case 64: goto L_0x0612;
            case 65: goto L_0x0612;
            case 66: goto L_0x0612;
            case 67: goto L_0x0612;
            case 68: goto L_0x0612;
            case 69: goto L_0x0612;
            case 70: goto L_0x0612;
            case 71: goto L_0x0612;
            case 72: goto L_0x0612;
            case 73: goto L_0x0612;
            case 74: goto L_0x0612;
            case 75: goto L_0x0612;
            case 76: goto L_0x0612;
            case 77: goto L_0x0612;
            case 78: goto L_0x0612;
            case 79: goto L_0x0612;
            case 80: goto L_0x0612;
            case 81: goto L_0x0612;
            case 82: goto L_0x0612;
            case 83: goto L_0x0612;
            case 84: goto L_0x0612;
            case 85: goto L_0x0612;
            case 86: goto L_0x0612;
            case 87: goto L_0x0612;
            case 88: goto L_0x0612;
            case 89: goto L_0x0612;
            case 90: goto L_0x0612;
            case 91: goto L_0x0612;
            case 92: goto L_0x0612;
            case 93: goto L_0x0612;
            case 94: goto L_0x0612;
            case 95: goto L_0x0612;
            case 96: goto L_0x0612;
            case 97: goto L_0x0612;
            case 98: goto L_0x0612;
            case 99: goto L_0x0612;
            case 100: goto L_0x0612;
            case 101: goto L_0x0612;
            case 102: goto L_0x0612;
            case 103: goto L_0x0612;
            case 104: goto L_0x0612;
            case 105: goto L_0x0612;
            case 106: goto L_0x0612;
            case 107: goto L_0x0612;
            case 108: goto L_0x0612;
            case 109: goto L_0x0612;
            case 110: goto L_0x0612;
            case 111: goto L_0x0612;
            case 112: goto L_0x0612;
            case 113: goto L_0x0612;
            case 114: goto L_0x0612;
            case 115: goto L_0x0612;
            case 116: goto L_0x0612;
            case 117: goto L_0x0612;
            case 118: goto L_0x0612;
            case 119: goto L_0x0612;
            case 120: goto L_0x0612;
            case 121: goto L_0x0612;
            case 122: goto L_0x0612;
            case 123: goto L_0x0612;
            case 124: goto L_0x0612;
            default: goto L_0x0611;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0612, code lost:
        f22395W1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0614, code lost:
        r1 = com.google.android.exoplayer2.util.Util.MODEL;
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x061d, code lost:
        if (r2 == 2006354) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0622, code lost:
        if (r2 == 2006367) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x062b, code lost:
        if (r1.equals("AFTN") == false) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x062d, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0635, code lost:
        if (r1.equals("AFTA") == false) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0638, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0639, code lost:
        if (r0 == 0) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x063b, code lost:
        if (r0 == 1) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x063e, code lost:
        f22395W1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24759a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            r0 = 0
            if (r7 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.exoplayer2.w0.m> r7 = com.google.android.exoplayer2.p394w0.C9593m.class
            monitor-enter(r7)
            boolean r1 = f22394V1     // Catch:{ all -> 0x0646 }
            if (r1 != 0) goto L_0x0642
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch:{ all -> 0x0646 }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x0030
            java.lang.String r1 = "dangal"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.DEVICE     // Catch:{ all -> 0x0646 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0646 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "HWEML"
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.DEVICE     // Catch:{ all -> 0x0646 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x0030
        L_0x002c:
            f22395W1 = r3     // Catch:{ all -> 0x0646 }
            goto L_0x0640
        L_0x0030:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch:{ all -> 0x0646 }
            if (r1 < r2) goto L_0x0036
            goto L_0x0640
        L_0x0036:
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.DEVICE     // Catch:{ all -> 0x0646 }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x0646 }
            r5 = -1
            switch(r4) {
                case -2144781245: goto L_0x0602;
                case -2144781185: goto L_0x05f7;
                case -2144781160: goto L_0x05ec;
                case -2097309513: goto L_0x05e1;
                case -2022874474: goto L_0x05d6;
                case -1978993182: goto L_0x05cb;
                case -1978990237: goto L_0x05c0;
                case -1936688988: goto L_0x05b5;
                case -1936688066: goto L_0x05aa;
                case -1936688065: goto L_0x059e;
                case -1931988508: goto L_0x0592;
                case -1696512866: goto L_0x0586;
                case -1680025915: goto L_0x057a;
                case -1615810839: goto L_0x056e;
                case -1554255044: goto L_0x0562;
                case -1481772737: goto L_0x0556;
                case -1481772730: goto L_0x054a;
                case -1481772729: goto L_0x053e;
                case -1320080169: goto L_0x0532;
                case -1217592143: goto L_0x0526;
                case -1180384755: goto L_0x051a;
                case -1139198265: goto L_0x050e;
                case -1052835013: goto L_0x0502;
                case -993250464: goto L_0x04f7;
                case -993250458: goto L_0x04ec;
                case -965403638: goto L_0x04e0;
                case -958336948: goto L_0x04d4;
                case -879245230: goto L_0x04c8;
                case -842500323: goto L_0x04bc;
                case -821392978: goto L_0x04b1;
                case -797483286: goto L_0x04a5;
                case -794946968: goto L_0x0499;
                case -788334647: goto L_0x048d;
                case -782144577: goto L_0x0481;
                case -575125681: goto L_0x0475;
                case -521118391: goto L_0x0469;
                case -430914369: goto L_0x045d;
                case -290434366: goto L_0x0451;
                case -282781963: goto L_0x0445;
                case -277133239: goto L_0x0439;
                case -173639913: goto L_0x042d;
                case -56598463: goto L_0x0421;
                case 2126: goto L_0x0415;
                case 2564: goto L_0x0409;
                case 2715: goto L_0x03fd;
                case 2719: goto L_0x03f1;
                case 3483: goto L_0x03e5;
                case 73405: goto L_0x03d9;
                case 75739: goto L_0x03cd;
                case 76779: goto L_0x03c1;
                case 78669: goto L_0x03b5;
                case 79305: goto L_0x03a9;
                case 80618: goto L_0x039d;
                case 88274: goto L_0x0391;
                case 98846: goto L_0x0385;
                case 98848: goto L_0x0379;
                case 99329: goto L_0x036d;
                case 101481: goto L_0x0361;
                case 1513190: goto L_0x0356;
                case 1514184: goto L_0x034b;
                case 1514185: goto L_0x0340;
                case 2436959: goto L_0x0334;
                case 2463773: goto L_0x0328;
                case 2464648: goto L_0x031c;
                case 2689555: goto L_0x0310;
                case 3154429: goto L_0x0304;
                case 3284551: goto L_0x02f8;
                case 3351335: goto L_0x02ec;
                case 3386211: goto L_0x02e0;
                case 41325051: goto L_0x02d4;
                case 55178625: goto L_0x02c8;
                case 61542055: goto L_0x02bd;
                case 65355429: goto L_0x02b1;
                case 66214468: goto L_0x02a5;
                case 66214470: goto L_0x0299;
                case 66214473: goto L_0x028d;
                case 66215429: goto L_0x0281;
                case 66215431: goto L_0x0275;
                case 66215433: goto L_0x0269;
                case 66216390: goto L_0x025d;
                case 76402249: goto L_0x0251;
                case 76404105: goto L_0x0245;
                case 76404911: goto L_0x0239;
                case 80963634: goto L_0x022d;
                case 82882791: goto L_0x0221;
                case 98715550: goto L_0x0215;
                case 102844228: goto L_0x0209;
                case 165221241: goto L_0x01fe;
                case 182191441: goto L_0x01f2;
                case 245388979: goto L_0x01e6;
                case 287431619: goto L_0x01da;
                case 307593612: goto L_0x01ce;
                case 308517133: goto L_0x01c2;
                case 316215098: goto L_0x01b6;
                case 316215116: goto L_0x01aa;
                case 316246811: goto L_0x019e;
                case 316246818: goto L_0x0192;
                case 407160593: goto L_0x0186;
                case 507412548: goto L_0x017a;
                case 793982701: goto L_0x016e;
                case 794038622: goto L_0x0162;
                case 794040393: goto L_0x0156;
                case 835649806: goto L_0x014a;
                case 917340916: goto L_0x013e;
                case 958008161: goto L_0x0132;
                case 1060579533: goto L_0x0126;
                case 1150207623: goto L_0x011a;
                case 1176899427: goto L_0x010e;
                case 1280332038: goto L_0x0102;
                case 1306947716: goto L_0x00f6;
                case 1349174697: goto L_0x00ea;
                case 1522194893: goto L_0x00de;
                case 1691543273: goto L_0x00d2;
                case 1709443163: goto L_0x00c6;
                case 1865889110: goto L_0x00ba;
                case 1906253259: goto L_0x00ae;
                case 1977196784: goto L_0x00a2;
                case 2006372676: goto L_0x0096;
                case 2029784656: goto L_0x008a;
                case 2030379515: goto L_0x007e;
                case 2033393791: goto L_0x0072;
                case 2047190025: goto L_0x0066;
                case 2047252157: goto L_0x005a;
                case 2048319463: goto L_0x004e;
                case 2048855701: goto L_0x0042;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x0646 }
        L_0x0040:
            goto L_0x060d
        L_0x0042:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 55
            goto L_0x060e
        L_0x004e:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 54
            goto L_0x060e
        L_0x005a:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 28
            goto L_0x060e
        L_0x0066:
            java.lang.String r4 = "ELUGA_Note"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 27
            goto L_0x060e
        L_0x0072:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 12
            goto L_0x060e
        L_0x007e:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 53
            goto L_0x060e
        L_0x008a:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 52
            goto L_0x060e
        L_0x0096:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 16
            goto L_0x060e
        L_0x00a2:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 58
            goto L_0x060e
        L_0x00ae:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 86
            goto L_0x060e
        L_0x00ba:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x060e
        L_0x00c6:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 57
            goto L_0x060e
        L_0x00d2:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 20
            goto L_0x060e
        L_0x00de:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x060e
        L_0x00ea:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 50
            goto L_0x060e
        L_0x00f6:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 30
            goto L_0x060e
        L_0x0102:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 51
            goto L_0x060e
        L_0x010e:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 60
            goto L_0x060e
        L_0x011a:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 66
            goto L_0x060e
        L_0x0126:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 82
            goto L_0x060e
        L_0x0132:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 61
            goto L_0x060e
        L_0x013e:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 8
            goto L_0x060e
        L_0x014a:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 68
            goto L_0x060e
        L_0x0156:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 48
            goto L_0x060e
        L_0x0162:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 47
            goto L_0x060e
        L_0x016e:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 46
            goto L_0x060e
        L_0x017a:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 100
            goto L_0x060e
        L_0x0186:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 92
            goto L_0x060e
        L_0x0192:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x060e
        L_0x019e:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x060e
        L_0x01aa:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x060e
        L_0x01b6:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x060e
        L_0x01c2:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 10
            goto L_0x060e
        L_0x01ce:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 9
            goto L_0x060e
        L_0x01da:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 49
            goto L_0x060e
        L_0x01e6:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 69
            goto L_0x060e
        L_0x01f2:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 21
            goto L_0x060e
        L_0x01fe:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 6
            goto L_0x060e
        L_0x0209:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 65
            goto L_0x060e
        L_0x0215:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 56
            goto L_0x060e
        L_0x0221:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x060e
        L_0x022d:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x060e
        L_0x0239:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 98
            goto L_0x060e
        L_0x0245:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 96
            goto L_0x060e
        L_0x0251:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 94
            goto L_0x060e
        L_0x025d:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 37
            goto L_0x060e
        L_0x0269:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 36
            goto L_0x060e
        L_0x0275:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 35
            goto L_0x060e
        L_0x0281:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 34
            goto L_0x060e
        L_0x028d:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 33
            goto L_0x060e
        L_0x0299:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 32
            goto L_0x060e
        L_0x02a5:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 31
            goto L_0x060e
        L_0x02b1:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 25
            goto L_0x060e
        L_0x02bd:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 5
            goto L_0x060e
        L_0x02c8:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 13
            goto L_0x060e
        L_0x02d4:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 70
            goto L_0x060e
        L_0x02e0:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 79
            goto L_0x060e
        L_0x02ec:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 72
            goto L_0x060e
        L_0x02f8:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 64
            goto L_0x060e
        L_0x0304:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 39
            goto L_0x060e
        L_0x0310:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x060e
        L_0x031c:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 97
            goto L_0x060e
        L_0x0328:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 95
            goto L_0x060e
        L_0x0334:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 80
            goto L_0x060e
        L_0x0340:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 2
            goto L_0x060e
        L_0x034b:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 1
            goto L_0x060e
        L_0x0356:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 0
            goto L_0x060e
        L_0x0361:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 38
            goto L_0x060e
        L_0x036d:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 24
            goto L_0x060e
        L_0x0379:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 23
            goto L_0x060e
        L_0x0385:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 22
            goto L_0x060e
        L_0x0391:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x060e
        L_0x039d:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x060e
        L_0x03a9:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 93
            goto L_0x060e
        L_0x03b5:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 81
            goto L_0x060e
        L_0x03c1:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 73
            goto L_0x060e
        L_0x03cd:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 67
            goto L_0x060e
        L_0x03d9:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 62
            goto L_0x060e
        L_0x03e5:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 71
            goto L_0x060e
        L_0x03f1:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x060e
        L_0x03fd:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x060e
        L_0x0409:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 99
            goto L_0x060e
        L_0x0415:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 17
            goto L_0x060e
        L_0x0421:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x060e
        L_0x042d:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 26
            goto L_0x060e
        L_0x0439:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x060e
        L_0x0445:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 14
            goto L_0x060e
        L_0x0451:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x060e
        L_0x045d:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 91
            goto L_0x060e
        L_0x0469:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 42
            goto L_0x060e
        L_0x0475:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 40
            goto L_0x060e
        L_0x0481:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 78
            goto L_0x060e
        L_0x048d:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x060e
        L_0x0499:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x060e
        L_0x04a5:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x060e
        L_0x04b1:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 7
            goto L_0x060e
        L_0x04bc:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 75
            goto L_0x060e
        L_0x04c8:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x060e
        L_0x04d4:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 29
            goto L_0x060e
        L_0x04e0:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x060e
        L_0x04ec:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 4
            goto L_0x060e
        L_0x04f7:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 3
            goto L_0x060e
        L_0x0502:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 74
            goto L_0x060e
        L_0x050e:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x060e
        L_0x051a:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 59
            goto L_0x060e
        L_0x0526:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 15
            goto L_0x060e
        L_0x0532:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 41
            goto L_0x060e
        L_0x053e:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 85
            goto L_0x060e
        L_0x054a:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 84
            goto L_0x060e
        L_0x0556:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 83
            goto L_0x060e
        L_0x0562:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x060e
        L_0x056e:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 90
            goto L_0x060e
        L_0x057a:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 18
            goto L_0x060e
        L_0x0586:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x060e
        L_0x0592:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 11
            goto L_0x060e
        L_0x059e:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 89
            goto L_0x060e
        L_0x05aa:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 88
            goto L_0x060e
        L_0x05b5:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 87
            goto L_0x060e
        L_0x05c0:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 77
            goto L_0x060e
        L_0x05cb:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 76
            goto L_0x060e
        L_0x05d6:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 19
            goto L_0x060e
        L_0x05e1:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 63
            goto L_0x060e
        L_0x05ec:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 45
            goto L_0x060e
        L_0x05f7:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 44
            goto L_0x060e
        L_0x0602:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x060d
            r1 = 43
            goto L_0x060e
        L_0x060d:
            r1 = -1
        L_0x060e:
            switch(r1) {
                case 0: goto L_0x0612;
                case 1: goto L_0x0612;
                case 2: goto L_0x0612;
                case 3: goto L_0x0612;
                case 4: goto L_0x0612;
                case 5: goto L_0x0612;
                case 6: goto L_0x0612;
                case 7: goto L_0x0612;
                case 8: goto L_0x0612;
                case 9: goto L_0x0612;
                case 10: goto L_0x0612;
                case 11: goto L_0x0612;
                case 12: goto L_0x0612;
                case 13: goto L_0x0612;
                case 14: goto L_0x0612;
                case 15: goto L_0x0612;
                case 16: goto L_0x0612;
                case 17: goto L_0x0612;
                case 18: goto L_0x0612;
                case 19: goto L_0x0612;
                case 20: goto L_0x0612;
                case 21: goto L_0x0612;
                case 22: goto L_0x0612;
                case 23: goto L_0x0612;
                case 24: goto L_0x0612;
                case 25: goto L_0x0612;
                case 26: goto L_0x0612;
                case 27: goto L_0x0612;
                case 28: goto L_0x0612;
                case 29: goto L_0x0612;
                case 30: goto L_0x0612;
                case 31: goto L_0x0612;
                case 32: goto L_0x0612;
                case 33: goto L_0x0612;
                case 34: goto L_0x0612;
                case 35: goto L_0x0612;
                case 36: goto L_0x0612;
                case 37: goto L_0x0612;
                case 38: goto L_0x0612;
                case 39: goto L_0x0612;
                case 40: goto L_0x0612;
                case 41: goto L_0x0612;
                case 42: goto L_0x0612;
                case 43: goto L_0x0612;
                case 44: goto L_0x0612;
                case 45: goto L_0x0612;
                case 46: goto L_0x0612;
                case 47: goto L_0x0612;
                case 48: goto L_0x0612;
                case 49: goto L_0x0612;
                case 50: goto L_0x0612;
                case 51: goto L_0x0612;
                case 52: goto L_0x0612;
                case 53: goto L_0x0612;
                case 54: goto L_0x0612;
                case 55: goto L_0x0612;
                case 56: goto L_0x0612;
                case 57: goto L_0x0612;
                case 58: goto L_0x0612;
                case 59: goto L_0x0612;
                case 60: goto L_0x0612;
                case 61: goto L_0x0612;
                case 62: goto L_0x0612;
                case 63: goto L_0x0612;
                case 64: goto L_0x0612;
                case 65: goto L_0x0612;
                case 66: goto L_0x0612;
                case 67: goto L_0x0612;
                case 68: goto L_0x0612;
                case 69: goto L_0x0612;
                case 70: goto L_0x0612;
                case 71: goto L_0x0612;
                case 72: goto L_0x0612;
                case 73: goto L_0x0612;
                case 74: goto L_0x0612;
                case 75: goto L_0x0612;
                case 76: goto L_0x0612;
                case 77: goto L_0x0612;
                case 78: goto L_0x0612;
                case 79: goto L_0x0612;
                case 80: goto L_0x0612;
                case 81: goto L_0x0612;
                case 82: goto L_0x0612;
                case 83: goto L_0x0612;
                case 84: goto L_0x0612;
                case 85: goto L_0x0612;
                case 86: goto L_0x0612;
                case 87: goto L_0x0612;
                case 88: goto L_0x0612;
                case 89: goto L_0x0612;
                case 90: goto L_0x0612;
                case 91: goto L_0x0612;
                case 92: goto L_0x0612;
                case 93: goto L_0x0612;
                case 94: goto L_0x0612;
                case 95: goto L_0x0612;
                case 96: goto L_0x0612;
                case 97: goto L_0x0612;
                case 98: goto L_0x0612;
                case 99: goto L_0x0612;
                case 100: goto L_0x0612;
                case 101: goto L_0x0612;
                case 102: goto L_0x0612;
                case 103: goto L_0x0612;
                case 104: goto L_0x0612;
                case 105: goto L_0x0612;
                case 106: goto L_0x0612;
                case 107: goto L_0x0612;
                case 108: goto L_0x0612;
                case 109: goto L_0x0612;
                case 110: goto L_0x0612;
                case 111: goto L_0x0612;
                case 112: goto L_0x0612;
                case 113: goto L_0x0612;
                case 114: goto L_0x0612;
                case 115: goto L_0x0612;
                case 116: goto L_0x0612;
                case 117: goto L_0x0612;
                case 118: goto L_0x0612;
                case 119: goto L_0x0612;
                case 120: goto L_0x0612;
                case 121: goto L_0x0612;
                case 122: goto L_0x0612;
                case 123: goto L_0x0612;
                case 124: goto L_0x0612;
                default: goto L_0x0611;
            }     // Catch:{ all -> 0x0646 }
        L_0x0611:
            goto L_0x0614
        L_0x0612:
            f22395W1 = r3     // Catch:{ all -> 0x0646 }
        L_0x0614:
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.MODEL     // Catch:{ all -> 0x0646 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0646 }
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x062f
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r0) goto L_0x0625
            goto L_0x0638
        L_0x0625:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0646 }
            if (r0 == 0) goto L_0x0638
            r0 = 1
            goto L_0x0639
        L_0x062f:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0646 }
            if (r1 == 0) goto L_0x0638
            goto L_0x0639
        L_0x0638:
            r0 = -1
        L_0x0639:
            if (r0 == 0) goto L_0x063e
            if (r0 == r3) goto L_0x063e
            goto L_0x0640
        L_0x063e:
            f22395W1 = r3     // Catch:{ all -> 0x0646 }
        L_0x0640:
            f22394V1 = r3     // Catch:{ all -> 0x0646 }
        L_0x0642:
            monitor-exit(r7)     // Catch:{ all -> 0x0646 }
            boolean r7 = f22395W1
            return r7
        L_0x0646:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0646 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p394w0.C9593m.mo24759a(java.lang.String):boolean");
    }
}
