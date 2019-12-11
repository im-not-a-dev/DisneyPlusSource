package com.google.android.exoplayer2.p361p0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p361p0.C8842n.C8843a;
import com.google.android.exoplayer2.p361p0.C8844o.C8845a;
import com.google.android.exoplayer2.p361p0.C8844o.C8847c;
import com.google.android.exoplayer2.p361p0.C8844o.C8848d;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p381t0.C9270a;
import com.google.android.exoplayer2.p381t0.C9271b;
import com.google.android.exoplayer2.p381t0.C9273c;
import com.google.android.exoplayer2.p381t0.C9275d.C9278c;
import com.google.android.exoplayer2.p381t0.C9284e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9565s;
import com.google.android.exoplayer2.p393v0.C9566t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.p0.x */
/* compiled from: MediaCodecAudioRenderer */
public class C8867x extends C9271b implements C9565s {

    /* renamed from: i1 */
    private final Context f18968i1;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public final C8843a f18969j1;

    /* renamed from: k1 */
    private final C8844o f18970k1;

    /* renamed from: l1 */
    private final long[] f18971l1 = new long[10];

    /* renamed from: m1 */
    private int f18972m1;

    /* renamed from: n1 */
    private boolean f18973n1;

    /* renamed from: o1 */
    private boolean f18974o1;

    /* renamed from: p1 */
    private boolean f18975p1;

    /* renamed from: q1 */
    private MediaFormat f18976q1;

    /* renamed from: r1 */
    private int f18977r1;

    /* renamed from: s1 */
    private int f18978s1;

    /* renamed from: t1 */
    private int f18979t1;

    /* renamed from: u1 */
    private int f18980u1;

    /* renamed from: v1 */
    private long f18981v1;

    /* renamed from: w1 */
    private boolean f18982w1;
    /* access modifiers changed from: private */

    /* renamed from: x1 */
    public boolean f18983x1;

    /* renamed from: y1 */
    private long f18984y1 = -9223372036854775807L;

    /* renamed from: z1 */
    private int f18985z1;

    /* renamed from: com.google.android.exoplayer2.p0.x$b */
    /* compiled from: MediaCodecAudioRenderer */
    private final class C8869b implements C8847c {
        private C8869b() {
        }

        /* renamed from: a */
        public void mo23126a(int i) {
            C8867x.this.f18969j1.mo23093a(i);
            C8867x.this.mo23192b(i);
        }

        /* renamed from: a */
        public void mo23125a() {
            C8867x.this.mo23173G();
            C8867x.this.f18983x1 = true;
        }

        /* renamed from: a */
        public void mo23127a(int i, long j, long j2) {
            C8867x.this.f18969j1.mo23094a(i, j, j2);
            C8867x.this.mo23182a(i, j, j2);
        }
    }

    public C8867x(Context context, C9273c cVar, C8710l<C8713o> lVar, boolean z, boolean z2, Handler handler, C8842n nVar, C8844o oVar) {
        super(1, cVar, lVar, z, z2, 44100.0f);
        this.f18968i1 = context.getApplicationContext();
        this.f18970k1 = oVar;
        this.f18969j1 = new C8843a(handler, nVar);
        oVar.mo23113a((C8847c) new C8869b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("AXON 7 mini".equals(com.google.android.exoplayer2.p393v0.Util.MODEL) != false) goto L_0x001a;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m25824H() {
        /*
            int r0 = com.google.android.exoplayer2.p393v0.Util.SDK_INT
            r1 = 23
            if (r0 != r1) goto L_0x001c
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.Util.MODEL
            java.lang.String r1 = "ZTE B2017G"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.Util.MODEL
            java.lang.String r1 = "AXON 7 mini"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8867x.m25824H():boolean");
    }

    /* renamed from: I */
    private void m25825I() {
        long a = this.f18970k1.mo23106a(mo22844c());
        if (a != Long.MIN_VALUE) {
            if (!this.f18983x1) {
                a = Math.max(this.f18981v1, a);
            }
            this.f18981v1 = a;
            this.f18983x1 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo23172F() throws ExoPlaybackException {
        try {
            this.f18970k1.mo23108a();
        } catch (C8848d e) {
            throw ExoPlaybackException.m24862a(e, mo23204q());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo23173G() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23182a(int i, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23192b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23193b(Format format) throws ExoPlaybackException {
        super.mo23193b(format);
        this.f18969j1.mo23095a(format);
        this.f18977r1 = "audio/raw".equals(format.f18349b0) ? format.f18365q0 : 2;
        this.f18978s1 = format.f18363o0;
        this.f18979t1 = format.f18366r0;
        this.f18980u1 = format.f18367s0;
    }

    /* renamed from: c */
    public boolean mo22844c() {
        return super.mo22844c() && this.f18970k1.mo23118c();
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.f18970k1.getPlaybackParameters();
    }

    /* renamed from: n */
    public C9565s mo22855n() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        try {
            this.f18984y1 = -9223372036854775807L;
            this.f18985z1 = 0;
            this.f18970k1.flush();
            try {
                super.mo22881t();
            } finally {
                this.f18969j1.mo23096a(this.f21128g1);
            }
        } catch (Throwable th) {
            super.mo22881t();
            throw th;
        } finally {
            this.f18969j1.mo23096a(this.f21128g1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo23196u() {
        try {
            super.mo23196u();
        } finally {
            this.f18970k1.reset();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo23197v() {
        super.mo23197v();
        this.f18970k1.mo23105Y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo23198w() {
        m25825I();
        this.f18970k1.mo23117b();
        super.mo23198w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23194c(long j) {
        while (this.f18985z1 != 0 && j >= this.f18971l1[0]) {
            this.f18970k1.mo23121f();
            this.f18985z1--;
            long[] jArr = this.f18971l1;
            System.arraycopy(jArr, 1, jArr, 0, this.f18985z1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23177a(C9273c cVar, C8710l<C8713o> lVar, Format format) throws C9278c {
        boolean z;
        String str = format.f18349b0;
        if (!C9566t.m29517j(str)) {
            return 0;
        }
        int i = Util.SDK_INT >= 21 ? 32 : 0;
        boolean a = C8872q.m25888a(lVar, format.f18353e0);
        int i2 = 4;
        int i3 = 8;
        if (a && mo23188a(format.f18363o0, str) && cVar.mo24027a() != null) {
            return i | 8 | 4;
        }
        int i4 = 1;
        if (("audio/raw".equals(str) && !this.f18970k1.mo23115a(format.f18363o0, format.f18365q0)) || !this.f18970k1.mo23115a(format.f18363o0, 2)) {
            return 1;
        }
        DrmInitData drmInitData = format.f18353e0;
        if (drmInitData != null) {
            z = false;
            for (int i5 = 0; i5 < drmInitData.f18461W; i5++) {
                z |= drmInitData.mo22750a(i5).f18467Y;
            }
        } else {
            z = false;
        }
        List a2 = cVar.mo24028a(format.f18349b0, z, false);
        if (a2.isEmpty()) {
            if (z && !cVar.mo24028a(format.f18349b0, false, false).isEmpty()) {
                i4 = 2;
            }
            return i4;
        } else if (!a) {
            return 2;
        } else {
            C9270a aVar = (C9270a) a2.get(0);
            boolean a3 = aVar.mo24010a(format);
            if (a3 && aVar.mo24015b(format)) {
                i3 = 16;
            }
            if (!a3) {
                i2 = 3;
            }
            return i3 | i | i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23191b(int i, String str) {
        String str2 = "audio/eac3-joc";
        if (str2.equals(str)) {
            if (this.f18970k1.mo23115a(i, 18)) {
                return C9566t.m29510c(str2);
            }
            str = "audio/eac3";
        }
        int c = C9566t.m29510c(str);
        if (this.f18970k1.mo23115a(i, c)) {
            return c;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo22843b() {
        return this.f18970k1.mo23119d() || super.mo22843b();
    }

    /* renamed from: b */
    private static boolean m25830b(String str) {
        if (Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str)) {
            if ("samsung".equals(Util.MANUFACTURER) && (Util.DEVICE.startsWith("baffin") || Util.DEVICE.startsWith("grand") || Util.DEVICE.startsWith("fortuna") || Util.DEVICE.startsWith("gprimelte") || Util.DEVICE.startsWith("j2y18lte") || Util.DEVICE.startsWith("ms01"))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C9270a> mo23181a(C9273c cVar, Format format, boolean z) throws C9278c {
        List list;
        if (mo23188a(format.f18363o0, format.f18349b0)) {
            C9270a a = cVar.mo24027a();
            if (a != null) {
                return Collections.singletonList(a);
            }
        }
        List a2 = cVar.mo24028a(format.f18349b0, z, false);
        if ("audio/eac3-joc".equals(format.f18349b0)) {
            list = new ArrayList(a2);
            list.addAll(cVar.mo24028a("audio/eac3", z, false));
        } else {
            list = a2;
        }
        return Collections.unmodifiableList(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23188a(int i, String str) {
        return mo23191b(i, str) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23185a(C9270a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        this.f18972m1 = mo23176a(aVar, format, mo23205r());
        this.f18974o1 = m25829a(aVar.f21082a);
        this.f18975p1 = m25830b(aVar.f21082a);
        this.f18973n1 = aVar.f21088g;
        MediaFormat a = mo23179a(format, this.f18973n1 ? "audio/raw" : aVar.f21084c, this.f18972m1, f);
        mediaCodec.configure(a, null, mediaCrypto, 0);
        if (this.f18973n1) {
            this.f18976q1 = a;
            this.f18976q1.setString("mime", format.f18349b0);
            return;
        }
        this.f18976q1 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23175a(MediaCodec mediaCodec, C9270a aVar, Format format, Format format2) {
        if (m25826a(aVar, format2) <= this.f18972m1 && format.f18366r0 == 0 && format.f18367s0 == 0 && format2.f18366r0 == 0 && format2.f18367s0 == 0) {
            if (aVar.mo24011a(format, format2, true)) {
                return 3;
            }
            if (mo23190a(format, format2)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo23174a(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.f18364p0;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23186a(String str, long j, long j2) {
        this.f18969j1.mo23097a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23183a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        int[] iArr;
        MediaFormat mediaFormat2 = this.f18976q1;
        String str = "channel-count";
        if (mediaFormat2 != null) {
            i = mo23191b(mediaFormat2.getInteger(str), mediaFormat2.getString("mime"));
        } else {
            i = this.f18977r1;
            mediaFormat2 = mediaFormat;
        }
        int integer = mediaFormat2.getInteger(str);
        int integer2 = mediaFormat2.getInteger("sample-rate");
        if (this.f18974o1 && integer == 6) {
            int i2 = this.f18978s1;
            if (i2 < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < this.f18978s1; i3++) {
                    iArr[i3] = i3;
                }
                this.f18970k1.mo23111a(i, integer, integer2, 0, iArr, this.f18979t1, this.f18980u1);
            }
        }
        iArr = null;
        try {
            this.f18970k1.mo23111a(i, integer, integer2, 0, iArr, this.f18979t1, this.f18980u1);
        } catch (C8845a e) {
            throw ExoPlaybackException.m24862a(e, mo23204q());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23187a(boolean z) throws ExoPlaybackException {
        super.mo23187a(z);
        this.f18969j1.mo23101b(this.f21128g1);
        int i = mo23203p().f18681a;
        if (i != 0) {
            this.f18970k1.mo23110a(i);
        } else {
            this.f18970k1.mo23120e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
        super.mo22879a(formatArr, j);
        if (this.f18984y1 != -9223372036854775807L) {
            int i = this.f18985z1;
            if (i == this.f18971l1.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many stream changes, so dropping change at ");
                sb.append(this.f18971l1[this.f18985z1 - 1]);
                Log.m29500d("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.f18985z1 = i + 1;
            }
            this.f18971l1[this.f18985z1 - 1] = this.f18984y1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) throws ExoPlaybackException {
        super.mo22878a(j, z);
        this.f18970k1.flush();
        this.f18981v1 = j;
        this.f18982w1 = true;
        this.f18983x1 = true;
        this.f18984y1 = -9223372036854775807L;
        this.f18985z1 = 0;
    }

    /* renamed from: a */
    public long mo23178a() {
        if (mo22845d() == 2) {
            m25825I();
        }
        return this.f18981v1;
    }

    /* renamed from: a */
    public PlaybackParameters mo23180a(PlaybackParameters playbackParameters) {
        return this.f18970k1.mo23107a(playbackParameters);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23184a(C8879e eVar) {
        if (this.f18982w1 && !eVar.mo23210c()) {
            if (Math.abs(eVar.f19024W - this.f18981v1) > 500000) {
                this.f18981v1 = eVar.f19024W;
            }
            this.f18982w1 = false;
        }
        this.f18984y1 = Math.max(eVar.f19024W, this.f18984y1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 != -9223372036854775807L) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23189a(long r1, long r3, android.media.MediaCodec r5, java.nio.ByteBuffer r6, int r7, int r8, long r9, boolean r11, boolean r12, com.google.android.exoplayer2.Format r13) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r0 = this;
            boolean r1 = r0.f18975p1
            if (r1 == 0) goto L_0x001a
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x001a
            r1 = r8 & 4
            if (r1 == 0) goto L_0x001a
            long r1 = r0.f18984y1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = r9
        L_0x001b:
            boolean r3 = r0.f18973n1
            r4 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0029
            r3 = r8 & 2
            if (r3 == 0) goto L_0x0029
            r5.releaseOutputBuffer(r7, r4)
            return r9
        L_0x0029:
            if (r11 == 0) goto L_0x003b
            r5.releaseOutputBuffer(r7, r4)
            com.google.android.exoplayer2.q0.d r1 = r0.f21128g1
            int r2 = r1.f19018f
            int r2 = r2 + r9
            r1.f19018f = r2
            com.google.android.exoplayer2.p0.o r1 = r0.f18970k1
            r1.mo23121f()
            return r9
        L_0x003b:
            com.google.android.exoplayer2.p0.o r3 = r0.f18970k1     // Catch:{ b -> 0x0051, d -> 0x004f }
            boolean r1 = r3.mo23116a(r6, r1)     // Catch:{ b -> 0x0051, d -> 0x004f }
            if (r1 == 0) goto L_0x004e
            r5.releaseOutputBuffer(r7, r4)     // Catch:{ b -> 0x0051, d -> 0x004f }
            com.google.android.exoplayer2.q0.d r1 = r0.f21128g1     // Catch:{ b -> 0x0051, d -> 0x004f }
            int r2 = r1.f19017e     // Catch:{ b -> 0x0051, d -> 0x004f }
            int r2 = r2 + r9
            r1.f19017e = r2     // Catch:{ b -> 0x0051, d -> 0x004f }
            return r9
        L_0x004e:
            return r4
        L_0x004f:
            r1 = move-exception
            goto L_0x0052
        L_0x0051:
            r1 = move-exception
        L_0x0052:
            int r2 = r0.mo23204q()
            com.google.android.exoplayer2.ExoPlaybackException r1 = com.google.android.exoplayer2.ExoPlaybackException.m24862a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8867x.mo23189a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: a */
    public void mo22648a(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f18970k1.mo23109a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f18970k1.mo23112a((C8831i) obj);
        } else if (i != 5) {
            super.mo22648a(i, obj);
        } else {
            this.f18970k1.mo23114a((C8853r) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo23176a(C9270a aVar, Format format, Format[] formatArr) {
        int a = m25826a(aVar, format);
        if (formatArr.length == 1) {
            return a;
        }
        int i = a;
        for (Format format2 : formatArr) {
            if (aVar.mo24011a(format, format2, false)) {
                i = Math.max(i, m25826a(aVar, format2));
            }
        }
        return i;
    }

    /* renamed from: a */
    private int m25826a(C9270a aVar, Format format) {
        if ("OMX.google.raw.decoder".equals(aVar.f21082a)) {
            int i = Util.SDK_INT;
            if (i < 24 && (i != 23 || !Util.m29446d(this.f18968i1))) {
                return -1;
            }
        }
        return format.f18351c0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23190a(Format format, Format format2) {
        return Util.m29414a((Object) format.f18349b0, (Object) format2.f18349b0) && format.f18363o0 == format2.f18363o0 && format.f18364p0 == format2.f18364p0 && format.mo22607b(format2);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public MediaFormat mo23179a(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f18363o0);
        mediaFormat.setInteger("sample-rate", format.f18364p0);
        C9284e.m28167a(mediaFormat, format.f18352d0);
        C9284e.m28165a(mediaFormat, "max-input-size", i);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m25824H()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (Util.SDK_INT <= 28) {
            if ("audio/ac4".equals(format.f18349b0)) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        return mediaFormat;
    }

    /* renamed from: a */
    private static boolean m25829a(String str) {
        if (Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str)) {
            if ("samsung".equals(Util.MANUFACTURER) && (Util.DEVICE.startsWith("zeroflte") || Util.DEVICE.startsWith("herolte") || Util.DEVICE.startsWith("heroqlte"))) {
                return true;
            }
        }
        return false;
    }
}
