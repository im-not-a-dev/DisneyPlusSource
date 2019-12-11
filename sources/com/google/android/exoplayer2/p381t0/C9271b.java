package com.google.android.exoplayer2.p381t0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p381t0.C9275d.C9278c;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9543g0;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9568u;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.t0.b */
/* compiled from: MediaCodecRenderer */
public abstract class C9271b extends C8872q {

    /* renamed from: h1 */
    private static final byte[] f21090h1 = Util.m29416a("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A0 */
    private C9270a f21091A0;

    /* renamed from: B0 */
    private int f21092B0;

    /* renamed from: C0 */
    private boolean f21093C0;

    /* renamed from: D0 */
    private boolean f21094D0;

    /* renamed from: E0 */
    private boolean f21095E0;

    /* renamed from: F0 */
    private boolean f21096F0;

    /* renamed from: G0 */
    private boolean f21097G0;

    /* renamed from: H0 */
    private boolean f21098H0;

    /* renamed from: I0 */
    private boolean f21099I0;

    /* renamed from: J0 */
    private boolean f21100J0;

    /* renamed from: K0 */
    private boolean f21101K0;

    /* renamed from: L0 */
    private ByteBuffer[] f21102L0;

    /* renamed from: M0 */
    private ByteBuffer[] f21103M0;

    /* renamed from: N0 */
    private long f21104N0;

    /* renamed from: O0 */
    private int f21105O0;

    /* renamed from: P0 */
    private int f21106P0;

    /* renamed from: Q0 */
    private ByteBuffer f21107Q0;

    /* renamed from: R0 */
    private boolean f21108R0;

    /* renamed from: S0 */
    private boolean f21109S0;

    /* renamed from: T0 */
    private boolean f21110T0;

    /* renamed from: U0 */
    private int f21111U0 = 0;

    /* renamed from: V0 */
    private int f21112V0 = 0;

    /* renamed from: W0 */
    private int f21113W0 = 0;

    /* renamed from: X0 */
    private boolean f21114X0;

    /* renamed from: Y0 */
    private boolean f21115Y0;

    /* renamed from: Z0 */
    private long f21116Z0;

    /* renamed from: a1 */
    private long f21117a1;

    /* renamed from: b1 */
    private boolean f21118b1;

    /* renamed from: c0 */
    private final C9273c f21119c0;

    /* renamed from: c1 */
    private boolean f21120c1;

    /* renamed from: d0 */
    private final DrmSessionManager<FrameworkMediaCrypto> f21121d0;

    /* renamed from: d1 */
    private boolean f21122d1;

    /* renamed from: e0 */
    private final boolean f21123e0;

    /* renamed from: e1 */
    private boolean f21124e1;

    /* renamed from: f0 */
    private final boolean f21125f0;

    /* renamed from: f1 */
    private boolean f21126f1;

    /* renamed from: g0 */
    private final float f21127g0;

    /* renamed from: g1 */
    protected C8878d f21128g1;

    /* renamed from: h0 */
    private final C8879e f21129h0 = new C8879e(0);

    /* renamed from: i0 */
    private final C8879e f21130i0 = C8879e.m25938i();

    /* renamed from: j0 */
    private final C8679b0 f21131j0 = new C8679b0();

    /* renamed from: k0 */
    private final C9543g0<Format> f21132k0 = new C9543g0<>();

    /* renamed from: l0 */
    private final ArrayList<Long> f21133l0 = new ArrayList<>();

    /* renamed from: m0 */
    private final BufferInfo f21134m0 = new BufferInfo();

    /* renamed from: n0 */
    private Format f21135n0;

    /* renamed from: o0 */
    private Format f21136o0;

    /* renamed from: p0 */
    private DrmSession<FrameworkMediaCrypto> f21137p0;

    /* renamed from: q0 */
    private DrmSession<FrameworkMediaCrypto> f21138q0;

    /* renamed from: r0 */
    private MediaCrypto f21139r0;

    /* renamed from: s0 */
    private boolean f21140s0;

    /* renamed from: t0 */
    private long f21141t0 = -9223372036854775807L;

    /* renamed from: u0 */
    private float f21142u0 = 1.0f;

    /* renamed from: v0 */
    private MediaCodec f21143v0;

    /* renamed from: w0 */
    private Format f21144w0;

    /* renamed from: x0 */
    private float f21145x0 = -1.0f;

    /* renamed from: y0 */
    private ArrayDeque<C9270a> f21146y0;

    /* renamed from: z0 */
    private C9272a f21147z0;

    /* renamed from: com.google.android.exoplayer2.t0.b$a */
    /* compiled from: MediaCodecRenderer */
    public static class C9272a extends Exception {

        /* renamed from: U */
        public final boolean f21148U;

        /* renamed from: V */
        public final String f21149V;

        /* renamed from: W */
        public final String f21150W;

        /* renamed from: c */
        public final String f21151c;

        public C9272a(Format format, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(format);
            this(sb.toString(), th, format.f18349b0, z, null, m28122a(i), null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C9272a m28120a(C9272a aVar) {
            C9272a aVar2 = new C9272a(getMessage(), getCause(), this.f21151c, this.f21148U, this.f21149V, this.f21150W, aVar);
            return aVar2;
        }

        public C9272a(Format format, Throwable th, boolean z, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(format);
            this(sb.toString(), th, format.f18349b0, z, str, Util.SDK_INT >= 21 ? m28123a(th) : null, null);
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m28123a(Throwable th) {
            if (th instanceof CodecException) {
                return ((CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private C9272a(String str, Throwable th, String str2, boolean z, String str3, String str4, C9272a aVar) {
            super(str, th);
            this.f21151c = str2;
            this.f21148U = z;
            this.f21149V = str3;
            this.f21150W = str4;
        }

        /* renamed from: a */
        private static String m28122a(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder sb = new StringBuilder();
            sb.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            sb.append(str);
            sb.append(Math.abs(i));
            return sb.toString();
        }
    }

    public C9271b(int i, C9273c cVar, DrmSessionManager<FrameworkMediaCrypto> lVar, boolean z, boolean z2, float f) {
        super(i);
        Assertions.checkNotNull(cVar);
        this.f21119c0 = cVar;
        this.f21121d0 = lVar;
        this.f21123e0 = z;
        this.f21125f0 = z2;
        this.f21127g0 = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("AFTB".equals(com.google.android.exoplayer2.util.Util.MODEL) != false) goto L_0x001e;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo23173G() {
        /*
            r2 = this;
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.mo23173G():boolean");
    }

    /* renamed from: H */
    private void m28049H() {
        if (this.f21114X0) {
            this.f21112V0 = 1;
            this.f21113W0 = 1;
        }
    }

    /* renamed from: I */
    private void m28050I() throws ExoPlaybackException {
        if (this.f21114X0) {
            this.f21112V0 = 1;
            this.f21113W0 = 3;
            return;
        }
        m28057P();
    }

    /* renamed from: J */
    private void m28051J() throws ExoPlaybackException {
        if (Util.SDK_INT < 23) {
            m28050I();
            return;
        }
        if (this.f21114X0) {
            this.f21112V0 = 1;
            this.f21113W0 = 2;
        } else {
            m28062U();
        }
    }

    /* renamed from: K */
    private boolean m28052K() throws ExoPlaybackException {
        int i;
        int i2;
        MediaCodec mediaCodec = this.f21143v0;
        if (mediaCodec == null || this.f21112V0 == 2 || this.f21118b1) {
            return false;
        }
        if (this.f21105O0 < 0) {
            this.f21105O0 = mediaCodec.dequeueInputBuffer(0);
            int i3 = this.f21105O0;
            if (i3 < 0) {
                return false;
            }
            this.f21129h0.f19023V = mo23192b(i3);
            this.f21129h0.mo23207b();
        }
        if (this.f21112V0 == 1) {
            if (!this.f21101K0) {
                this.f21115Y0 = true;
                this.f21143v0.queueInputBuffer(this.f21105O0, 0, 0, 0, 4);
                m28059R();
            }
            this.f21112V0 = 2;
            return false;
        } else if (this.f21099I0) {
            this.f21099I0 = false;
            this.f21129h0.f19023V.put(f21090h1);
            this.f21143v0.queueInputBuffer(this.f21105O0, 0, f21090h1.length, 0, 0);
            m28059R();
            this.f21114X0 = true;
            return true;
        } else {
            if (this.f21122d1) {
                i2 = -4;
                i = 0;
            } else {
                if (this.f21111U0 == 1) {
                    for (int i4 = 0; i4 < this.f21144w0.f18352d0.size(); i4++) {
                        this.f21129h0.f19023V.put((byte[]) this.f21144w0.f18352d0.get(i4));
                    }
                    this.f21111U0 = 2;
                }
                int position = this.f21129h0.f19023V.position();
                i = position;
                i2 = mo23201a(this.f21131j0, this.f21129h0, false);
            }
            if (mo22848g()) {
                this.f21116Z0 = this.f21117a1;
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.f21111U0 == 2) {
                    this.f21129h0.mo23207b();
                    this.f21111U0 = 1;
                }
                mo23193b(this.f21131j0.f18427a);
                return true;
            } else if (this.f21129h0.mo23211d()) {
                if (this.f21111U0 == 2) {
                    this.f21129h0.mo23207b();
                    this.f21111U0 = 1;
                }
                this.f21118b1 = true;
                if (!this.f21114X0) {
                    m28054M();
                    return false;
                }
                try {
                    if (!this.f21101K0) {
                        this.f21115Y0 = true;
                        this.f21143v0.queueInputBuffer(this.f21105O0, 0, 0, 0, 4);
                        m28059R();
                    }
                    return false;
                } catch (CryptoException e) {
                    throw ExoPlaybackException.m24862a(e, mo23204q());
                }
            } else if (!this.f21124e1 || this.f21129h0.mo23214e()) {
                this.f21124e1 = false;
                boolean g = this.f21129h0.mo23225g();
                this.f21122d1 = m28082d(g);
                if (this.f21122d1) {
                    return false;
                }
                if (this.f21094D0 && !g) {
                    C9568u.m29524a(this.f21129h0.f19023V);
                    if (this.f21129h0.f19023V.position() == 0) {
                        return true;
                    }
                    this.f21094D0 = false;
                }
                try {
                    long j = this.f21129h0.f19024W;
                    if (this.f21129h0.mo23210c()) {
                        this.f21133l0.add(Long.valueOf(j));
                    }
                    if (this.f21126f1) {
                        this.f21132k0.mo24627a(j, this.f21135n0);
                        this.f21126f1 = false;
                    }
                    this.f21117a1 = Math.max(this.f21117a1, j);
                    this.f21129h0.mo23223f();
                    mo23184a(this.f21129h0);
                    if (g) {
                        this.f21143v0.queueSecureInputBuffer(this.f21105O0, 0, m28064a(this.f21129h0, i), j, 0);
                    } else {
                        this.f21143v0.queueInputBuffer(this.f21105O0, 0, this.f21129h0.f19023V.limit(), j, 0);
                    }
                    m28059R();
                    this.f21114X0 = true;
                    this.f21111U0 = 0;
                    this.f21128g1.f19015c++;
                    return true;
                } catch (CryptoException e2) {
                    throw ExoPlaybackException.m24862a(e2, mo23204q());
                }
            } else {
                this.f21129h0.mo23207b();
                if (this.f21111U0 == 2) {
                    this.f21111U0 = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: L */
    private boolean m28053L() {
        return this.f21106P0 >= 0;
    }

    /* renamed from: M */
    private void m28054M() throws ExoPlaybackException {
        int i = this.f21113W0;
        if (i == 1) {
            mo24024x();
        } else if (i == 2) {
            m28062U();
        } else if (i != 3) {
            this.f21120c1 = true;
            mo23172F();
        } else {
            m28057P();
        }
    }

    /* renamed from: N */
    private void m28055N() {
        if (Util.SDK_INT < 21) {
            this.f21103M0 = this.f21143v0.getOutputBuffers();
        }
    }

    /* renamed from: O */
    private void m28056O() throws ExoPlaybackException {
        MediaFormat outputFormat = this.f21143v0.getOutputFormat();
        if (this.f21092B0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f21100J0 = true;
            return;
        }
        if (this.f21098H0) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo23183a(this.f21143v0, outputFormat);
    }

    /* renamed from: P */
    private void m28057P() throws ExoPlaybackException {
        mo24021E();
        mo24020D();
    }

    /* renamed from: Q */
    private void m28058Q() {
        if (Util.SDK_INT < 21) {
            this.f21102L0 = null;
            this.f21103M0 = null;
        }
    }

    /* renamed from: R */
    private void m28059R() {
        this.f21105O0 = -1;
        this.f21129h0.f19023V = null;
    }

    /* renamed from: S */
    private void m28060S() {
        this.f21106P0 = -1;
        this.f21107Q0 = null;
    }

    /* renamed from: T */
    private void m28061T() throws ExoPlaybackException {
        if (Util.SDK_INT >= 23) {
            float a = mo23174a(this.f21142u0, this.f21144w0, mo23205r());
            float f = this.f21145x0;
            if (f != a) {
                if (a == -1.0f) {
                    m28050I();
                } else if (f != -1.0f || a > this.f21127g0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", a);
                    this.f21143v0.setParameters(bundle);
                    this.f21145x0 = a;
                }
            }
        }
    }

    @TargetApi(23)
    /* renamed from: U */
    private void m28062U() throws ExoPlaybackException {
        FrameworkMediaCrypto oVar = (FrameworkMediaCrypto) this.f21138q0.getMediaCrypto();
        if (oVar == null) {
            m28057P();
        } else if (C.PLAYREADY_UUID.equals(oVar.f18506a)) {
            m28057P();
        } else if (!mo24024x()) {
            try {
                this.f21139r0.setMediaDrmSession(oVar.f18507b);
                m28072b(this.f21138q0);
                this.f21112V0 = 0;
                this.f21113W0 = 0;
            } catch (MediaCryptoException e) {
                throw ExoPlaybackException.m24862a(e, mo23204q());
            }
        }
    }

    /* renamed from: b */
    private List<C9270a> m28071b(boolean z) throws C9278c {
        List<C9270a> a = mo23181a(this.f21119c0, this.f21135n0, z);
        if (a.isEmpty() && z) {
            a = mo23181a(this.f21119c0, this.f21135n0, false);
            if (!a.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Drm session requires secure decoder for ");
                sb.append(this.f21135n0.f18349b0);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(a);
                sb.append(".");
                Log.m29500d("MediaCodecRenderer", sb.toString());
            }
        }
        return a;
    }

    /* renamed from: c */
    private boolean m28080c(boolean z) throws ExoPlaybackException {
        this.f21130i0.mo23207b();
        int a = mo23201a(this.f21131j0, this.f21130i0, z);
        if (a == -5) {
            mo23193b(this.f21131j0.f18427a);
            return true;
        }
        if (a == -4 && this.f21130i0.mo23211d()) {
            this.f21118b1 = true;
            m28054M();
        }
        return false;
    }

    /* renamed from: e */
    private boolean mo24765e(long j) {
        int size = this.f21133l0.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f21133l0.get(i)).longValue() == j) {
                this.f21133l0.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m28085f(long j) {
        return this.f21141t0 == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f21141t0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C9270a mo24017A() {
        return this.f21091A0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo24018B() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public long mo24019C() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo24020D() throws ExoPlaybackException {
        if (this.f21143v0 == null && this.f21135n0 != null) {
            m28072b(this.f21138q0);
            String str = this.f21135n0.f18349b0;
            DrmSession<FrameworkMediaCrypto> drmSession = this.f21137p0;
            if (drmSession != null) {
                if (this.f21139r0 == null) {
                    FrameworkMediaCrypto oVar = (FrameworkMediaCrypto) drmSession.getMediaCrypto();
                    if (oVar != null) {
                        try {
                            this.f21139r0 = new MediaCrypto(oVar.f18506a, oVar.f18507b);
                            this.f21140s0 = !oVar.f18508c && this.f21139r0.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e) {
                            throw ExoPlaybackException.m24862a(e, mo23204q());
                        }
                    } else if (this.f21137p0.getError() == null) {
                        return;
                    }
                }
                if (mo23173G()) {
                    int d = this.f21137p0.getState();
                    if (d == 1) {
                        throw ExoPlaybackException.m24862a(this.f21137p0.getError(), mo23204q());
                    } else if (d != 4) {
                        return;
                    }
                }
            }
            try {
                m28066a(this.f21139r0, this.f21140s0);
            } catch (C9272a e2) {
                throw ExoPlaybackException.m24862a(e2, mo23204q());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo24021E() {
        this.f21146y0 = null;
        this.f21091A0 = null;
        this.f21144w0 = null;
        m28059R();
        m28060S();
        m28058Q();
        this.f21122d1 = false;
        this.f21104N0 = -9223372036854775807L;
        this.f21133l0.clear();
        this.f21117a1 = -9223372036854775807L;
        this.f21116Z0 = -9223372036854775807L;
        try {
            if (this.f21143v0 != null) {
                this.f21128g1.f19014b++;
                this.f21143v0.stop();
                this.f21143v0.release();
            }
            this.f21143v0 = null;
            try {
                if (this.f21139r0 != null) {
                    this.f21139r0.release();
                }
            } finally {
                this.f21139r0 = null;
                this.f21140s0 = false;
                m28072b(null);
            }
        } catch (Throwable th) {
            this.f21143v0 = null;
            try {
                if (this.f21139r0 != null) {
                    this.f21139r0.release();
                }
                throw th;
            } finally {
                this.f21139r0 = null;
                this.f21140s0 = false;
                m28072b(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo23172F() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo23174a(float f, Format format, Format[] formatArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo23175a(MediaCodec mediaCodec, C9270a aVar, Format format, Format format2);

    /* renamed from: a */
    public final int mo22859a(Format format) throws ExoPlaybackException {
        try {
            return mo23177a(this.f21119c0, this.f21121d0, format);
        } catch (C9278c e) {
            throw ExoPlaybackException.m24862a(e, mo23204q());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo23177a(C9273c cVar, DrmSessionManager<FrameworkMediaCrypto> lVar, Format format) throws C9278c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<C9270a> mo23181a(C9273c cVar, Format format, boolean z) throws C9278c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23183a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23184a(C8879e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23185a(C9270a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23186a(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23189a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24022a(C9270a aVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo23194c(long j);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Format mo24023d(long j) {
        Format format = (Format) this.f21132k0.mo24628b(j);
        if (format != null) {
            this.f21136o0 = format;
        }
        return format;
    }

    /* renamed from: o */
    public final int mo22861o() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        this.f21135n0 = null;
        if (this.f21138q0 == null && this.f21137p0 == null) {
            mo24025y();
        } else {
            mo23196u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo23196u() {
        try {
            mo24021E();
        } finally {
            m28078c(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo23197v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo23198w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo24024x() throws ExoPlaybackException {
        boolean y = mo24025y();
        if (y) {
            mo24020D();
        }
        return y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo24025y() {
        if (this.f21143v0 == null) {
            return false;
        }
        if (this.f21113W0 == 3 || this.f21095E0 || (this.f21096F0 && this.f21115Y0)) {
            mo24021E();
            return true;
        }
        this.f21143v0.flush();
        m28059R();
        m28060S();
        this.f21104N0 = -9223372036854775807L;
        this.f21115Y0 = false;
        this.f21114X0 = false;
        this.f21124e1 = true;
        this.f21099I0 = false;
        this.f21100J0 = false;
        this.f21108R0 = false;
        this.f21109S0 = false;
        this.f21122d1 = false;
        this.f21133l0.clear();
        this.f21117a1 = -9223372036854775807L;
        this.f21116Z0 = -9223372036854775807L;
        this.f21112V0 = 0;
        this.f21113W0 = 0;
        this.f21111U0 = this.f21110T0 ? 1 : 0;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final MediaCodec mo24026z() {
        return this.f21143v0;
    }

    /* renamed from: d */
    private boolean m28082d(boolean z) throws ExoPlaybackException {
        if (this.f21137p0 == null || (!z && this.f21123e0)) {
            return false;
        }
        int d = this.f21137p0.getState();
        boolean z2 = true;
        if (d != 1) {
            if (d == 4) {
                z2 = false;
            }
            return z2;
        }
        throw ExoPlaybackException.m24862a(this.f21137p0.getError(), mo23204q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23187a(boolean z) throws ExoPlaybackException {
        this.f21128g1 = new C8878d();
    }

    /* renamed from: e */
    private static boolean m28084e(String str) {
        return Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) throws ExoPlaybackException {
        this.f21118b1 = false;
        this.f21120c1 = false;
        mo24024x();
        this.f21132k0.mo24626a();
    }

    /* renamed from: d */
    private static boolean m28081d(String str) {
        int i = Util.SDK_INT;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: c */
    private ByteBuffer m28077c(int i) {
        if (Util.SDK_INT >= 21) {
            return this.f21143v0.getOutputBuffer(i);
        }
        return this.f21103M0[i];
    }

    /* renamed from: b */
    private ByteBuffer mo23192b(int i) {
        if (Util.SDK_INT >= 21) {
            return this.f21143v0.getInputBuffer(i);
        }
        return this.f21102L0[i];
    }

    /* renamed from: a */
    public final void mo22837a(float f) throws ExoPlaybackException {
        this.f21142u0 = f;
        if (this.f21143v0 != null && this.f21113W0 != 3 && mo22845d() != 0) {
            m28061T();
        }
    }

    /* renamed from: c */
    private void m28078c(DrmSession<FrameworkMediaCrypto> drmSession) {
        DrmSession<FrameworkMediaCrypto> drmSession2 = this.f21138q0;
        this.f21138q0 = drmSession;
        m28067a(drmSession2);
    }

    /* renamed from: b */
    private void m28072b(DrmSession<FrameworkMediaCrypto> drmSession) {
        DrmSession<FrameworkMediaCrypto> drmSession2 = this.f21137p0;
        this.f21137p0 = drmSession;
        m28067a(drmSession2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22840a(long r4, long r6) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r3 = this;
            boolean r0 = r3.f21120c1
            if (r0 == 0) goto L_0x0008
            r3.mo23172F()
            return
        L_0x0008:
            com.google.android.exoplayer2.Format r0 = r3.f21135n0
            if (r0 != 0) goto L_0x0014
            r0 = 1
            boolean r0 = r3.m28080c(r0)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            r3.mo24020D()
            android.media.MediaCodec r0 = r3.f21143v0
            if (r0 == 0) goto L_0x003c
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = "drainAndFeed"
            com.google.android.exoplayer2.util.TraceUtil.m29359a(r2)
        L_0x0024:
            boolean r2 = r3.mo24762b(r4, r6)
            if (r2 == 0) goto L_0x002b
            goto L_0x0024
        L_0x002b:
            boolean r4 = r3.m28052K()
            if (r4 == 0) goto L_0x0038
            boolean r4 = r3.m28085f(r0)
            if (r4 == 0) goto L_0x0038
            goto L_0x002b
        L_0x0038:
            com.google.android.exoplayer2.util.TraceUtil.m29358a()
            goto L_0x004b
        L_0x003c:
            com.google.android.exoplayer2.q0.d r6 = r3.f21128g1
            int r7 = r6.f19016d
            int r4 = r3.mo23202b(r4)
            int r7 = r7 + r4
            r6.f19016d = r7
            r4 = 0
            r3.m28080c(r4)
        L_0x004b:
            com.google.android.exoplayer2.q0.d r4 = r3.f21128g1
            r4.mo23222a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.mo22840a(long, long):void");
    }

    /* renamed from: c */
    public boolean mo22844c() {
        return this.f21120c1;
    }

    /* renamed from: c */
    private static boolean m28079c(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c6, code lost:
        if (r5.f18356h0 == r2.f18356h0) goto L_0x00ca;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23193b(com.google.android.exoplayer2.Format r5) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r4 = this;
            com.google.android.exoplayer2.Format r0 = r4.f21135n0
            r4.f21135n0 = r5
            r1 = 1
            r4.f21126f1 = r1
            com.google.android.exoplayer2.drm.DrmInitData r2 = r5.f18353e0
            r3 = 0
            if (r0 != 0) goto L_0x000e
            r0 = r3
            goto L_0x0010
        L_0x000e:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r0.f18353e0
        L_0x0010:
            boolean r0 = com.google.android.exoplayer2.util.Util.m29414a(r2, r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x004d
            com.google.android.exoplayer2.drm.DrmInitData r0 = r5.f18353e0
            if (r0 == 0) goto L_0x004a
            com.google.android.exoplayer2.drm.l<com.google.android.exoplayer2.drm.o> r0 = r4.f21121d0
            if (r0 == 0) goto L_0x003a
            android.os.Looper r2 = android.os.Looper.myLooper()
            com.google.android.exoplayer2.drm.DrmInitData r3 = r5.f18353e0
            com.google.android.exoplayer2.drm.DrmSession r0 = r0.acquireSession(r2, r3)
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r2 = r4.f21138q0
            if (r0 == r2) goto L_0x0031
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r2 = r4.f21137p0
            if (r0 != r2) goto L_0x0036
        L_0x0031:
            com.google.android.exoplayer2.drm.l<com.google.android.exoplayer2.drm.o> r2 = r4.f21121d0
            r2.releaseSession(r0)
        L_0x0036:
            r4.m28078c(r0)
            goto L_0x004d
        L_0x003a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.mo23204q()
            com.google.android.exoplayer2.ExoPlaybackException r5 = com.google.android.exoplayer2.ExoPlaybackException.m24862a(r5, r0)
            throw r5
        L_0x004a:
            r4.m28078c(r3)
        L_0x004d:
            android.media.MediaCodec r0 = r4.f21143v0
            if (r0 != 0) goto L_0x0055
            r4.mo24020D()
            return
        L_0x0055:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21138q0
            if (r0 != 0) goto L_0x005d
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21137p0
            if (r0 != 0) goto L_0x007b
        L_0x005d:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21138q0
            if (r0 == 0) goto L_0x0065
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21137p0
            if (r0 == 0) goto L_0x007b
        L_0x0065:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21138q0
            if (r0 == 0) goto L_0x006f
            com.google.android.exoplayer2.t0.a r0 = r4.f21091A0
            boolean r0 = r0.f21087f
            if (r0 == 0) goto L_0x007b
        L_0x006f:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x007f
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21138q0
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r2 = r4.f21137p0
            if (r0 == r2) goto L_0x007f
        L_0x007b:
            r4.m28050I()
            return
        L_0x007f:
            android.media.MediaCodec r0 = r4.f21143v0
            com.google.android.exoplayer2.t0.a r2 = r4.f21091A0
            com.google.android.exoplayer2.Format r3 = r4.f21144w0
            int r0 = r4.mo23175a(r0, r2, r3, r5)
            if (r0 == 0) goto L_0x00ee
            if (r0 == r1) goto L_0x00db
            r2 = 2
            if (r0 == r2) goto L_0x00a8
            r1 = 3
            if (r0 != r1) goto L_0x00a2
            r4.f21144w0 = r5
            r4.m28061T()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r5 = r4.f21138q0
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21137p0
            if (r5 == r0) goto L_0x00f1
            r4.m28051J()
            goto L_0x00f1
        L_0x00a2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x00a8:
            boolean r0 = r4.f21093C0
            if (r0 == 0) goto L_0x00b0
            r4.m28050I()
            goto L_0x00f1
        L_0x00b0:
            r4.f21110T0 = r1
            r4.f21111U0 = r1
            int r0 = r4.f21092B0
            if (r0 == r2) goto L_0x00ca
            if (r0 != r1) goto L_0x00c9
            int r0 = r5.f18355g0
            com.google.android.exoplayer2.Format r2 = r4.f21144w0
            int r3 = r2.f18355g0
            if (r0 != r3) goto L_0x00c9
            int r0 = r5.f18356h0
            int r2 = r2.f18356h0
            if (r0 != r2) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            r4.f21099I0 = r1
            r4.f21144w0 = r5
            r4.m28061T()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r5 = r4.f21138q0
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21137p0
            if (r5 == r0) goto L_0x00f1
            r4.m28051J()
            goto L_0x00f1
        L_0x00db:
            r4.f21144w0 = r5
            r4.m28061T()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r5 = r4.f21138q0
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.o> r0 = r4.f21137p0
            if (r5 == r0) goto L_0x00ea
            r4.m28051J()
            goto L_0x00f1
        L_0x00ea:
            r4.m28049H()
            goto L_0x00f1
        L_0x00ee:
            r4.m28050I()
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.mo23193b(com.google.android.exoplayer2.Format):void");
    }

    /* renamed from: a */
    private void m28066a(MediaCrypto mediaCrypto, boolean z) throws C9272a {
        if (this.f21146y0 == null) {
            try {
                List b = m28071b(z);
                this.f21146y0 = new ArrayDeque<>();
                if (this.f21125f0) {
                    this.f21146y0.addAll(b);
                } else if (!b.isEmpty()) {
                    this.f21146y0.add(b.get(0));
                }
                this.f21147z0 = null;
            } catch (C9278c e) {
                throw new C9272a(this.f21135n0, (Throwable) e, z, -49998);
            }
        }
        if (!this.f21146y0.isEmpty()) {
            while (this.f21143v0 == null) {
                C9270a aVar = (C9270a) this.f21146y0.peekFirst();
                if (mo24022a(aVar)) {
                    try {
                        m28068a(aVar, mediaCrypto);
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to initialize decoder: ");
                        sb.append(aVar);
                        Log.m29498b("MediaCodecRenderer", sb.toString(), e2);
                        this.f21146y0.removeFirst();
                        C9272a aVar2 = new C9272a(this.f21135n0, (Throwable) e2, z, aVar.f21082a);
                        C9272a aVar3 = this.f21147z0;
                        if (aVar3 == null) {
                            this.f21147z0 = aVar2;
                        } else {
                            this.f21147z0 = aVar3.m28120a(aVar2);
                        }
                        if (this.f21146y0.isEmpty()) {
                            throw this.f21147z0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f21146y0 = null;
            return;
        }
        throw new C9272a(this.f21135n0, (Throwable) null, z, -49999);
    }

    /* renamed from: a */
    private void m28068a(C9270a aVar, MediaCrypto mediaCrypto) throws Exception {
        float f;
        String str = aVar.f21082a;
        if (Util.SDK_INT < 23) {
            f = -1.0f;
        } else {
            f = mo23174a(this.f21142u0, this.f21135n0, mo23205r());
        }
        if (f <= this.f21127g0) {
            f = -1.0f;
        }
        MediaCodec mediaCodec = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append("createCodec:");
            sb.append(str);
            TraceUtil.m29359a(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            TraceUtil.m29358a();
            TraceUtil.m29359a("configureCodec");
            mo23185a(aVar, mediaCodec, this.f21135n0, mediaCrypto, f);
            TraceUtil.m29358a();
            TraceUtil.m29359a("startCodec");
            mediaCodec.start();
            TraceUtil.m29358a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            m28065a(mediaCodec);
            this.f21143v0 = mediaCodec;
            this.f21091A0 = aVar;
            this.f21145x0 = f;
            this.f21144w0 = this.f21135n0;
            this.f21092B0 = mo24759a(str);
            this.f21093C0 = m28084e(str);
            this.f21094D0 = m28069a(str, this.f21144w0);
            this.f21095E0 = m28081d(str);
            this.f21096F0 = m28075b(str);
            this.f21097G0 = m28079c(str);
            this.f21098H0 = m28076b(str, this.f21144w0);
            this.f21101K0 = m28074b(aVar) || mo24018B();
            m28059R();
            m28060S();
            this.f21104N0 = mo22845d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.f21110T0 = false;
            this.f21111U0 = 0;
            this.f21115Y0 = false;
            this.f21114X0 = false;
            this.f21112V0 = 0;
            this.f21113W0 = 0;
            this.f21099I0 = false;
            this.f21100J0 = false;
            this.f21108R0 = false;
            this.f21109S0 = false;
            this.f21124e1 = true;
            this.f21128g1.f19013a++;
            mo23186a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e) {
            if (mediaCodec != null) {
                m28058Q();
                mediaCodec.release();
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean mo22843b() {
        return this.f21135n0 != null && !this.f21122d1 && (mo23206s() || m28053L() || (this.f21104N0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f21104N0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo24762b(long r19, long r21) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r18 = this;
            r14 = r18
            boolean r0 = r18.m28053L()
            r15 = 1
            r13 = 0
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r14.f21097G0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r14.f21115Y0
            if (r0 == 0) goto L_0x002b
            android.media.MediaCodec r0 = r14.f21143v0     // Catch:{ IllegalStateException -> 0x001f }
            android.media.MediaCodec$BufferInfo r1 = r14.f21134m0     // Catch:{ IllegalStateException -> 0x001f }
            long r2 = r18.mo24019C()     // Catch:{ IllegalStateException -> 0x001f }
            int r0 = r0.dequeueOutputBuffer(r1, r2)     // Catch:{ IllegalStateException -> 0x001f }
            goto L_0x0037
        L_0x001f:
            r18.m28054M()
            boolean r0 = r14.f21120c1
            if (r0 == 0) goto L_0x002a
            r18.mo24021E()
        L_0x002a:
            return r13
        L_0x002b:
            android.media.MediaCodec r0 = r14.f21143v0
            android.media.MediaCodec$BufferInfo r1 = r14.f21134m0
            long r2 = r18.mo24019C()
            int r0 = r0.dequeueOutputBuffer(r1, r2)
        L_0x0037:
            if (r0 >= 0) goto L_0x0058
            r1 = -2
            if (r0 != r1) goto L_0x0040
            r18.m28056O()
            return r15
        L_0x0040:
            r1 = -3
            if (r0 != r1) goto L_0x0047
            r18.m28055N()
            return r15
        L_0x0047:
            boolean r0 = r14.f21101K0
            if (r0 == 0) goto L_0x0057
            boolean r0 = r14.f21118b1
            if (r0 != 0) goto L_0x0054
            int r0 = r14.f21112V0
            r1 = 2
            if (r0 != r1) goto L_0x0057
        L_0x0054:
            r18.m28054M()
        L_0x0057:
            return r13
        L_0x0058:
            boolean r1 = r14.f21100J0
            if (r1 == 0) goto L_0x0064
            r14.f21100J0 = r13
            android.media.MediaCodec r1 = r14.f21143v0
            r1.releaseOutputBuffer(r0, r13)
            return r15
        L_0x0064:
            android.media.MediaCodec$BufferInfo r1 = r14.f21134m0
            int r2 = r1.size
            if (r2 != 0) goto L_0x0074
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0074
            r18.m28054M()
            return r13
        L_0x0074:
            r14.f21106P0 = r0
            java.nio.ByteBuffer r0 = r14.m28077c(r0)
            r14.f21107Q0 = r0
            java.nio.ByteBuffer r0 = r14.f21107Q0
            if (r0 == 0) goto L_0x0093
            android.media.MediaCodec$BufferInfo r1 = r14.f21134m0
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r14.f21107Q0
            android.media.MediaCodec$BufferInfo r1 = r14.f21134m0
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0093:
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0
            long r0 = r0.presentationTimeUs
            boolean r0 = r14.mo24765e(r0)
            r14.f21108R0 = r0
            long r0 = r14.f21116Z0
            android.media.MediaCodec$BufferInfo r2 = r14.f21134m0
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r14.f21109S0 = r0
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0
            long r0 = r0.presentationTimeUs
            r14.mo24023d(r0)
        L_0x00b3:
            boolean r0 = r14.f21097G0
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r14.f21115Y0
            if (r0 == 0) goto L_0x00ef
            android.media.MediaCodec r5 = r14.f21143v0     // Catch:{ IllegalStateException -> 0x00e2 }
            java.nio.ByteBuffer r6 = r14.f21107Q0     // Catch:{ IllegalStateException -> 0x00e2 }
            int r7 = r14.f21106P0     // Catch:{ IllegalStateException -> 0x00e2 }
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0     // Catch:{ IllegalStateException -> 0x00e2 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00e2 }
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0     // Catch:{ IllegalStateException -> 0x00e2 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00e2 }
            boolean r11 = r14.f21108R0     // Catch:{ IllegalStateException -> 0x00e2 }
            boolean r12 = r14.f21109S0     // Catch:{ IllegalStateException -> 0x00e2 }
            com.google.android.exoplayer2.Format r3 = r14.f21136o0     // Catch:{ IllegalStateException -> 0x00e2 }
            r0 = r18
            r1 = r19
            r16 = r3
            r3 = r21
            r17 = 0
            r13 = r16
            boolean r0 = r0.mo23189a(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x00e0 }
            goto L_0x010d
        L_0x00e0:
            goto L_0x00e4
        L_0x00e2:
            r17 = 0
        L_0x00e4:
            r18.m28054M()
            boolean r0 = r14.f21120c1
            if (r0 == 0) goto L_0x00ee
            r18.mo24021E()
        L_0x00ee:
            return r17
        L_0x00ef:
            r17 = 0
            android.media.MediaCodec r5 = r14.f21143v0
            java.nio.ByteBuffer r6 = r14.f21107Q0
            int r7 = r14.f21106P0
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r14.f21108R0
            boolean r12 = r14.f21109S0
            com.google.android.exoplayer2.Format r13 = r14.f21136o0
            r0 = r18
            r1 = r19
            r3 = r21
            boolean r0 = r0.mo23189a(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)
        L_0x010d:
            if (r0 == 0) goto L_0x012a
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0
            long r0 = r0.presentationTimeUs
            r14.mo23194c(r0)
            android.media.MediaCodec$BufferInfo r0 = r14.f21134m0
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0120
            r0 = 1
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            r18.m28060S()
            if (r0 != 0) goto L_0x0127
            return r15
        L_0x0127:
            r18.m28054M()
        L_0x012a:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.mo24762b(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r3.f21087f != false) goto L_0x0036;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m28074b(com.google.android.exoplayer2.p381t0.C9270a r3) {
        /*
            java.lang.String r0 = r3.f21082a
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 25
            if (r1 > r2) goto L_0x0010
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0036
        L_0x0010:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 17
            if (r1 > r2) goto L_0x001e
            java.lang.String r1 = "OMX.allwinner.video.decoder.avc"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0036
        L_0x001e:
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            boolean r3 = r3.f21087f
            if (r3 == 0) goto L_0x0038
        L_0x0036:
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.m28074b(com.google.android.exoplayer2.t0.a):boolean");
    }

    /* renamed from: a */
    private void m28065a(MediaCodec mediaCodec) {
        if (Util.SDK_INT < 21) {
            this.f21102L0 = mediaCodec.getInputBuffers();
            this.f21103M0 = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("stvm8".equals(com.google.android.exoplayer2.util.Util.DEVICE) != false) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m28075b(java.lang.String r2) {
        /*
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 > r1) goto L_0x000e
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0038
        L_0x000e:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 19
            if (r0 > r1) goto L_0x003a
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "hb2000"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "stvm8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003a
        L_0x0028:
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x003a
        L_0x0038:
            r2 = 1
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.m28075b(java.lang.String):boolean");
    }

    /* renamed from: a */
    private void m28067a(DrmSession<FrameworkMediaCrypto> drmSession) {
        if (drmSession != null && drmSession != this.f21138q0 && drmSession != this.f21137p0) {
            this.f21121d0.releaseSession(drmSession);
        }
    }

    /* renamed from: a */
    private static CryptoInfo m28064a(C8879e eVar, int i) {
        CryptoInfo a = eVar.f19022U.mo23215a();
        if (i == 0) {
            return a;
        }
        if (a.numBytesOfClearData == null) {
            a.numBytesOfClearData = new int[1];
        }
        int[] iArr = a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a;
    }

    /* renamed from: b */
    private static boolean m28076b(String str, Format format) {
        if (Util.SDK_INT > 18 || format.f18363o0 != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if ("tilapia".equals(com.google.android.exoplayer2.util.Util.DEVICE) != false) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo24759a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 25
            if (r0 > r1) goto L_0x0038
            java.lang.String r0 = "OMX.Exynos.avc.dec.secure"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-T585"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-A510"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-A520"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "SM-J700"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0038
        L_0x0036:
            r3 = 2
            return r3
        L_0x0038:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L_0x0078
            java.lang.String r0 = "OMX.Nvidia.h264.decode"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "OMX.Nvidia.h264.decode.secure"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0078
        L_0x004e:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "flounder"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "flounder_lte"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "grouper"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r0 = "tilapia"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0078
        L_0x0076:
            r3 = 1
            return r3
        L_0x0078:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9271b.mo24759a(java.lang.String):int");
    }

    /* renamed from: a */
    private static boolean m28069a(String str, Format format) {
        return Util.SDK_INT < 21 && format.f18352d0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
