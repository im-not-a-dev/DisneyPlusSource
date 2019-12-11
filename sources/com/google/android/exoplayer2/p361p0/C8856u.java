package com.google.android.exoplayer2.p361p0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.p361p0.C8844o.C8845a;
import com.google.android.exoplayer2.p361p0.C8844o.C8846b;
import com.google.android.exoplayer2.p361p0.C8844o.C8847c;
import com.google.android.exoplayer2.p361p0.C8844o.C8848d;
import com.google.android.exoplayer2.p361p0.C8851q.C8852a;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.p0.u */
/* compiled from: DefaultAudioSink */
public final class C8856u implements C8844o {

    /* renamed from: S */
    public static boolean f18897S = false;

    /* renamed from: T */
    public static boolean f18898T = false;

    /* renamed from: A */
    private int f18899A;

    /* renamed from: B */
    private int f18900B;

    /* renamed from: C */
    private long f18901C;

    /* renamed from: D */
    private float f18902D;

    /* renamed from: E */
    private C8840m[] f18903E;

    /* renamed from: F */
    private ByteBuffer[] f18904F;

    /* renamed from: G */
    private ByteBuffer f18905G;

    /* renamed from: H */
    private ByteBuffer f18906H;

    /* renamed from: I */
    private byte[] f18907I;

    /* renamed from: J */
    private int f18908J;

    /* renamed from: K */
    private int f18909K;

    /* renamed from: L */
    private boolean f18910L;

    /* renamed from: M */
    private boolean f18911M;

    /* renamed from: N */
    private boolean f18912N;

    /* renamed from: O */
    private int f18913O;

    /* renamed from: P */
    private C8853r f18914P;

    /* renamed from: Q */
    private boolean f18915Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public long f18916R;

    /* renamed from: a */
    private final C8834j f18917a;

    /* renamed from: b */
    private final C8859c f18918b;

    /* renamed from: c */
    private final boolean f18919c;

    /* renamed from: d */
    private final C8855t f18920d;

    /* renamed from: e */
    private final C8820c0 f18921e;

    /* renamed from: f */
    private final C8840m[] f18922f;

    /* renamed from: g */
    private final C8840m[] f18923g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConditionVariable f18924h;

    /* renamed from: i */
    private final C8851q f18925i;

    /* renamed from: j */
    private final ArrayDeque<C8863g> f18926j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8847c f18927k;

    /* renamed from: l */
    private AudioTrack f18928l;

    /* renamed from: m */
    private C8860d f18929m;

    /* renamed from: n */
    private C8860d f18930n;

    /* renamed from: o */
    private AudioTrack f18931o;

    /* renamed from: p */
    private C8831i f18932p;

    /* renamed from: q */
    private PlaybackParameters f18933q;

    /* renamed from: r */
    private PlaybackParameters f18934r;

    /* renamed from: s */
    private long f18935s;

    /* renamed from: t */
    private long f18936t;

    /* renamed from: u */
    private ByteBuffer f18937u;

    /* renamed from: v */
    private int f18938v;

    /* renamed from: w */
    private long f18939w;

    /* renamed from: x */
    private long f18940x;

    /* renamed from: y */
    private long f18941y;

    /* renamed from: z */
    private long f18942z;

    /* renamed from: com.google.android.exoplayer2.p0.u$a */
    /* compiled from: DefaultAudioSink */
    class C8857a extends Thread {

        /* renamed from: c */
        final /* synthetic */ AudioTrack f18944c;

        C8857a(AudioTrack audioTrack) {
            this.f18944c = audioTrack;
        }

        public void run() {
            try {
                this.f18944c.flush();
                this.f18944c.release();
            } finally {
                C8856u.this.f18924h.open();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$b */
    /* compiled from: DefaultAudioSink */
    class C8858b extends Thread {

        /* renamed from: c */
        final /* synthetic */ AudioTrack f18945c;

        C8858b(C8856u uVar, AudioTrack audioTrack) {
            this.f18945c = audioTrack;
        }

        public void run() {
            this.f18945c.release();
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$c */
    /* compiled from: DefaultAudioSink */
    public interface C8859c {
        /* renamed from: a */
        long mo23163a();

        /* renamed from: a */
        long mo23164a(long j);

        /* renamed from: a */
        PlaybackParameters mo23165a(PlaybackParameters playbackParameters);

        /* renamed from: b */
        C8840m[] mo23166b();
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$d */
    /* compiled from: DefaultAudioSink */
    private static final class C8860d {

        /* renamed from: a */
        public final boolean f18946a;

        /* renamed from: b */
        public final int f18947b;

        /* renamed from: c */
        public final int f18948c;

        /* renamed from: d */
        public final int f18949d;

        /* renamed from: e */
        public final int f18950e;

        /* renamed from: f */
        public final int f18951f;

        /* renamed from: g */
        public final int f18952g;

        /* renamed from: h */
        public final int f18953h;

        /* renamed from: i */
        public final boolean f18954i;

        /* renamed from: j */
        public final boolean f18955j;

        /* renamed from: k */
        public final C8840m[] f18956k;

        public C8860d(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, C8840m[] mVarArr) {
            this.f18946a = z;
            this.f18947b = i;
            this.f18948c = i2;
            this.f18949d = i3;
            this.f18950e = i4;
            this.f18951f = i5;
            this.f18952g = i6;
            if (i7 == 0) {
                i7 = m25794a();
            }
            this.f18953h = i7;
            this.f18954i = z2;
            this.f18955j = z3;
            this.f18956k = mVarArr;
        }

        /* renamed from: a */
        public boolean mo23169a(C8860d dVar) {
            return dVar.f18952g == this.f18952g && dVar.f18950e == this.f18950e && dVar.f18951f == this.f18951f;
        }

        /* renamed from: b */
        public long mo23170b(long j) {
            return (j * 1000000) / ((long) this.f18950e);
        }

        /* renamed from: c */
        public long mo23171c(long j) {
            return (j * 1000000) / ((long) this.f18948c);
        }

        @TargetApi(21)
        /* renamed from: b */
        private AudioTrack m25795b(boolean z, C8831i iVar, int i) {
            AudioAttributes audioAttributes;
            if (z) {
                audioAttributes = new Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                audioAttributes = iVar.mo23079a();
            }
            AudioTrack audioTrack = new AudioTrack(audioAttributes, new AudioFormat.Builder().setChannelMask(this.f18951f).setEncoding(this.f18952g).setSampleRate(this.f18950e).build(), this.f18953h, 1, i != 0 ? i : 0);
            return audioTrack;
        }

        /* renamed from: a */
        public long mo23167a(long j) {
            return (j * ((long) this.f18950e)) / 1000000;
        }

        /* renamed from: a */
        public AudioTrack mo23168a(boolean z, C8831i iVar, int i) throws C8846b {
            AudioTrack audioTrack;
            if (Util.SDK_INT >= 21) {
                audioTrack = m25795b(z, iVar, i);
            } else {
                int c = Util.m29438c(iVar.f18828c);
                if (i == 0) {
                    audioTrack = new AudioTrack(c, this.f18950e, this.f18951f, this.f18952g, this.f18953h, 1);
                } else {
                    audioTrack = new AudioTrack(c, this.f18950e, this.f18951f, this.f18952g, this.f18953h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new C8846b(state, this.f18950e, this.f18951f, this.f18953h);
        }

        /* renamed from: a */
        private int m25794a() {
            if (this.f18946a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f18950e, this.f18951f, this.f18952g);
                Assertions.checkState(minBufferSize != -2);
                return Util.m29382a(minBufferSize * 4, ((int) mo23167a(250000)) * this.f18949d, (int) Math.max((long) minBufferSize, mo23167a(750000) * ((long) this.f18949d)));
            }
            int b = C8856u.m25757c(this.f18952g);
            if (this.f18952g == 5) {
                b *= 2;
            }
            return (int) ((((long) b) * 250000) / 1000000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$e */
    /* compiled from: DefaultAudioSink */
    public static class C8861e implements C8859c {

        /* renamed from: a */
        private final C8840m[] f18957a;

        /* renamed from: b */
        private final C8871z f18958b = new C8871z();

        /* renamed from: c */
        private final C8818b0 f18959c = new C8818b0();

        public C8861e(C8840m... mVarArr) {
            this.f18957a = new C8840m[(mVarArr.length + 2)];
            System.arraycopy(mVarArr, 0, this.f18957a, 0, mVarArr.length);
            C8840m[] mVarArr2 = this.f18957a;
            mVarArr2[mVarArr.length] = this.f18958b;
            mVarArr2[mVarArr.length + 1] = this.f18959c;
        }

        /* renamed from: a */
        public PlaybackParameters mo23165a(PlaybackParameters playbackParameters) {
            this.f18958b.mo23199a(playbackParameters.f18374c);
            return new PlaybackParameters(this.f18959c.mo23061b(playbackParameters.f18372a), this.f18959c.mo23056a(playbackParameters.f18373b), playbackParameters.f18374c);
        }

        /* renamed from: b */
        public C8840m[] mo23166b() {
            return this.f18957a;
        }

        /* renamed from: a */
        public long mo23164a(long j) {
            return this.f18959c.mo23057a(j);
        }

        /* renamed from: a */
        public long mo23163a() {
            return this.f18958b.mo23200l();
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$f */
    /* compiled from: DefaultAudioSink */
    public static final class C8862f extends RuntimeException {
        /* synthetic */ C8862f(String str, C8857a aVar) {
            this(str);
        }

        private C8862f(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$g */
    /* compiled from: DefaultAudioSink */
    private static final class C8863g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final PlaybackParameters f18960a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f18961b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f18962c;

        /* synthetic */ C8863g(PlaybackParameters playbackParameters, long j, long j2, C8857a aVar) {
            this(playbackParameters, j, j2);
        }

        private C8863g(PlaybackParameters playbackParameters, long j, long j2) {
            this.f18960a = playbackParameters;
            this.f18961b = j;
            this.f18962c = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.u$h */
    /* compiled from: DefaultAudioSink */
    private final class C8864h implements C8852a {
        private C8864h() {
        }

        /* renamed from: a */
        public void mo23152a(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(C8856u.this.m25766i());
            sb.append(str);
            sb.append(C8856u.this.m25767j());
            String sb2 = sb.toString();
            if (!C8856u.f18898T) {
                Log.m29500d("AudioTrack", sb2);
                return;
            }
            throw new C8862f(sb2, null);
        }

        /* renamed from: b */
        public void mo23153b(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(C8856u.this.m25766i());
            sb.append(str);
            sb.append(C8856u.this.m25767j());
            String sb2 = sb.toString();
            if (!C8856u.f18898T) {
                Log.m29500d("AudioTrack", sb2);
                return;
            }
            throw new C8862f(sb2, null);
        }

        /* synthetic */ C8864h(C8856u uVar, C8857a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo23151a(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Log.m29500d("AudioTrack", sb.toString());
        }

        /* renamed from: a */
        public void mo23150a(int i, long j) {
            if (C8856u.this.f18927k != null) {
                C8856u.this.f18927k.mo23127a(i, j, SystemClock.elapsedRealtime() - C8856u.this.f18916R);
            }
        }
    }

    public C8856u(C8834j jVar, C8840m[] mVarArr) {
        this(jVar, mVarArr, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25764g() throws com.google.android.exoplayer2.p361p0.C8844o.C8848d {
        /*
            r9 = this;
            int r0 = r9.f18909K
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0016
            com.google.android.exoplayer2.p0.u$d r0 = r9.f18930n
            boolean r0 = r0.f18954i
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0012
        L_0x000f:
            com.google.android.exoplayer2.p0.m[] r0 = r9.f18903E
            int r0 = r0.length
        L_0x0012:
            r9.f18909K = r0
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r4 = r9.f18909K
            com.google.android.exoplayer2.p0.m[] r5 = r9.f18903E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x003a
            r4 = r5[r4]
            if (r0 == 0) goto L_0x002a
            r4.mo23068g()
        L_0x002a:
            r9.m25762d(r7)
            boolean r0 = r4.mo23063c()
            if (r0 != 0) goto L_0x0034
            return r3
        L_0x0034:
            int r0 = r9.f18909K
            int r0 = r0 + r2
            r9.f18909K = r0
            goto L_0x0014
        L_0x003a:
            java.nio.ByteBuffer r0 = r9.f18906H
            if (r0 == 0) goto L_0x0046
            r9.m25756b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f18906H
            if (r0 == 0) goto L_0x0046
            return r3
        L_0x0046:
            r9.f18909K = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8856u.m25764g():boolean");
    }

    /* renamed from: h */
    private void m25765h() {
        int i = 0;
        while (true) {
            C8840m[] mVarArr = this.f18903E;
            if (i < mVarArr.length) {
                C8840m mVar = mVarArr[i];
                mVar.flush();
                this.f18904F[i] = mVar.mo23062b();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public long m25766i() {
        C8860d dVar = this.f18930n;
        return dVar.f18946a ? this.f18939w / ((long) dVar.f18947b) : this.f18940x;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public long m25767j() {
        C8860d dVar = this.f18930n;
        return dVar.f18946a ? this.f18941y / ((long) dVar.f18949d) : this.f18942z;
    }

    /* renamed from: k */
    private boolean m25768k() {
        return this.f18931o != null;
    }

    /* renamed from: l */
    private void m25769l() {
        if (!this.f18911M) {
            this.f18911M = true;
            this.f18925i.mo23143b(m25767j());
            this.f18931o.stop();
            this.f18938v = 0;
        }
    }

    /* renamed from: m */
    private void m25770m() {
        AudioTrack audioTrack = this.f18928l;
        if (audioTrack != null) {
            this.f18928l = null;
            new C8858b(this, audioTrack).start();
        }
    }

    /* renamed from: n */
    private void m25771n() {
        if (m25768k()) {
            if (Util.SDK_INT >= 21) {
                m25750a(this.f18931o, this.f18902D);
            } else {
                m25755b(this.f18931o, this.f18902D);
            }
        }
    }

    /* renamed from: o */
    private void m25772o() {
        C8840m[] mVarArr = this.f18930n.f18956k;
        ArrayList arrayList = new ArrayList();
        for (C8840m mVar : mVarArr) {
            if (mVar.mo23059a()) {
                arrayList.add(mVar);
            } else {
                mVar.flush();
            }
        }
        int size = arrayList.size();
        this.f18903E = (C8840m[]) arrayList.toArray(new C8840m[size]);
        this.f18904F = new ByteBuffer[size];
        m25765h();
    }

    /* renamed from: Y */
    public void mo23105Y() {
        this.f18912N = true;
        if (m25768k()) {
            this.f18925i.mo23147d();
            this.f18931o.play();
        }
    }

    /* renamed from: f */
    public void mo23121f() {
        if (this.f18900B == 1) {
            this.f18900B = 2;
        }
    }

    public void flush() {
        if (m25768k()) {
            this.f18939w = 0;
            this.f18940x = 0;
            this.f18941y = 0;
            this.f18942z = 0;
            this.f18899A = 0;
            PlaybackParameters playbackParameters = this.f18933q;
            if (playbackParameters != null) {
                this.f18934r = playbackParameters;
                this.f18933q = null;
            } else if (!this.f18926j.isEmpty()) {
                this.f18934r = ((C8863g) this.f18926j.getLast()).f18960a;
            }
            this.f18926j.clear();
            this.f18935s = 0;
            this.f18936t = 0;
            this.f18921e.mo23075m();
            m25765h();
            this.f18905G = null;
            this.f18906H = null;
            this.f18911M = false;
            this.f18910L = false;
            this.f18909K = -1;
            this.f18937u = null;
            this.f18938v = 0;
            this.f18900B = 0;
            if (this.f18925i.mo23142a()) {
                this.f18931o.pause();
            }
            AudioTrack audioTrack = this.f18931o;
            this.f18931o = null;
            C8860d dVar = this.f18929m;
            if (dVar != null) {
                this.f18930n = dVar;
                this.f18929m = null;
            }
            this.f18925i.mo23145c();
            this.f18924h.close();
            new C8857a(audioTrack).start();
        }
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.f18934r;
    }

    public void reset() {
        flush();
        m25770m();
        for (C8840m reset : this.f18922f) {
            reset.reset();
        }
        for (C8840m reset2 : this.f18923g) {
            reset2.reset();
        }
        this.f18913O = 0;
        this.f18912N = false;
    }

    public C8856u(C8834j jVar, C8840m[] mVarArr, boolean z) {
        this(jVar, (C8859c) new C8861e(mVarArr), z);
    }

    /* renamed from: c */
    private void m25759c(long j) throws C8846b {
        this.f18924h.block();
        C8860d dVar = this.f18930n;
        Assertions.checkNotNull(dVar);
        this.f18931o = dVar.mo23168a(this.f18915Q, this.f18932p, this.f18913O);
        int audioSessionId = this.f18931o.getAudioSessionId();
        if (f18897S && Util.SDK_INT < 21) {
            AudioTrack audioTrack = this.f18928l;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                m25770m();
            }
            if (this.f18928l == null) {
                this.f18928l = m25761d(audioSessionId);
            }
        }
        if (this.f18913O != audioSessionId) {
            this.f18913O = audioSessionId;
            C8847c cVar = this.f18927k;
            if (cVar != null) {
                cVar.mo23126a(audioSessionId);
            }
        }
        m25751a(this.f18934r, j);
        C8851q qVar = this.f18925i;
        AudioTrack audioTrack2 = this.f18931o;
        C8860d dVar2 = this.f18930n;
        qVar.mo23141a(audioTrack2, dVar2.f18952g, dVar2.f18949d, dVar2.f18953h);
        m25771n();
        int i = this.f18914P.f18886a;
        if (i != 0) {
            this.f18931o.attachAuxEffect(i);
            this.f18931o.setAuxEffectSendLevel(this.f18914P.f18887b);
        }
    }

    /* renamed from: d */
    private void m25762d(long j) throws C8848d {
        ByteBuffer byteBuffer;
        int length = this.f18903E.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f18904F[i - 1];
            } else {
                byteBuffer = this.f18905G;
                if (byteBuffer == null) {
                    byteBuffer = C8840m.f18847a;
                }
            }
            if (i == length) {
                m25756b(byteBuffer, j);
            } else {
                C8840m mVar = this.f18903E[i];
                mVar.mo23058a(byteBuffer);
                ByteBuffer b = mVar.mo23062b();
                this.f18904F[i] = b;
                if (b.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo23113a(C8847c cVar) {
        this.f18927k = cVar;
    }

    /* renamed from: e */
    public void mo23120e() {
        if (this.f18915Q) {
            this.f18915Q = false;
            this.f18913O = 0;
            flush();
        }
    }

    public C8856u(C8834j jVar, C8859c cVar, boolean z) {
        this.f18917a = jVar;
        Assertions.checkNotNull(cVar);
        this.f18918b = cVar;
        this.f18919c = z;
        this.f18924h = new ConditionVariable(true);
        this.f18925i = new C8851q(new C8864h(this, null));
        this.f18920d = new C8855t();
        this.f18921e = new C8820c0();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C8854s[]{new C8870y(), this.f18920d, this.f18921e});
        Collections.addAll(arrayList, cVar.mo23166b());
        this.f18922f = (C8840m[]) arrayList.toArray(new C8840m[0]);
        this.f18923g = new C8840m[]{new C8866w()};
        this.f18902D = 1.0f;
        this.f18900B = 0;
        this.f18932p = C8831i.f18825e;
        this.f18913O = 0;
        this.f18914P = new C8853r(0, 0.0f);
        this.f18934r = PlaybackParameters.f18371e;
        this.f18909K = -1;
        this.f18903E = new C8840m[0];
        this.f18904F = new ByteBuffer[0];
        this.f18926j = new ArrayDeque<>();
    }

    /* renamed from: b */
    private void m25756b(ByteBuffer byteBuffer, long j) throws C8848d {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f18906H;
            boolean z = true;
            int i = 0;
            if (byteBuffer2 != null) {
                Assertions.m29299a(byteBuffer2 == byteBuffer);
            } else {
                this.f18906H = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f18907I;
                    if (bArr == null || bArr.length < remaining) {
                        this.f18907I = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f18907I, 0, remaining);
                    byteBuffer.position(position);
                    this.f18908J = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int a = this.f18925i.mo23139a(this.f18941y);
                if (a > 0) {
                    i = this.f18931o.write(this.f18907I, this.f18908J, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f18908J += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.f18915Q) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                Assertions.checkState(z);
                i = m25747a(this.f18931o, byteBuffer, remaining2, j);
            } else {
                i = m25746a(this.f18931o, byteBuffer, remaining2);
            }
            this.f18916R = SystemClock.elapsedRealtime();
            if (i >= 0) {
                if (this.f18930n.f18946a) {
                    this.f18941y += (long) i;
                }
                if (i == remaining2) {
                    if (!this.f18930n.f18946a) {
                        this.f18942z += (long) this.f18899A;
                    }
                    this.f18906H = null;
                }
                return;
            }
            throw new C8848d(i);
        }
    }

    /* renamed from: a */
    public boolean mo23115a(int i, int i2) {
        boolean z = true;
        if (Util.m29450e(i2)) {
            if (i2 == 4 && Util.SDK_INT < 21) {
                z = false;
            }
            return z;
        }
        C8834j jVar = this.f18917a;
        if (jVar == null || !jVar.mo23084a(i2) || (i != -1 && i > this.f18917a.mo23083a())) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public long mo23106a(boolean z) {
        if (!m25768k() || this.f18900B == 0) {
            return Long.MIN_VALUE;
        }
        return this.f18901C + m25748a(m25753b(Math.min(this.f18925i.mo23140a(z), this.f18930n.mo23170b(m25767j()))));
    }

    /* renamed from: d */
    public boolean mo23119d() {
        return m25768k() && this.f18925i.mo23146c(m25767j());
    }

    /* renamed from: d */
    private static AudioTrack m25761d(int i) {
        AudioTrack audioTrack = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        return audioTrack;
    }

    /* renamed from: a */
    public void mo23111a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws C8845a {
        int[] iArr2;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10 = i2;
        if (Util.SDK_INT < 21 && i10 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                iArr2[i11] = i11;
            }
        } else {
            iArr2 = iArr;
        }
        boolean e = Util.m29450e(i);
        boolean z2 = true;
        int i12 = i;
        boolean z3 = e && i12 != 4;
        boolean z4 = this.f18919c && mo23115a(i10, 4) && Util.m29445d(i);
        C8840m[] mVarArr = z4 ? this.f18923g : this.f18922f;
        if (z3) {
            this.f18921e.mo23071a(i5, i6);
            this.f18920d.mo23160a(iArr2);
            int length = mVarArr.length;
            int i13 = i3;
            i9 = i10;
            i7 = i12;
            int i14 = 0;
            boolean z5 = false;
            while (i14 < length) {
                C8840m mVar = mVarArr[i14];
                try {
                    z5 |= mVar.mo23060a(i13, i9, i7);
                    if (mVar.mo23059a()) {
                        i9 = mVar.mo23064d();
                        i13 = mVar.mo23065e();
                        i7 = mVar.mo23066f();
                    }
                    i14++;
                } catch (C8841a e2) {
                    throw new C8845a((Throwable) e2);
                }
            }
            z = z5;
            i8 = i13;
        } else {
            i8 = i3;
            i9 = i10;
            i7 = i12;
            z = false;
        }
        int a = m25745a(i9, e);
        if (a != 0) {
            C8860d dVar = new C8860d(e, e ? Util.m29425b(i, i2) : -1, i3, e ? Util.m29425b(i7, i9) : -1, i8, a, i7, i4, z3, z3 && !z4, mVarArr);
            if (!z && this.f18929m == null) {
                z2 = false;
            }
            if (!m25768k() || (dVar.mo23169a(this.f18930n) && !z2)) {
                this.f18930n = dVar;
            } else {
                this.f18929m = dVar;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported channel count: ");
            sb.append(i9);
            throw new C8845a(sb.toString());
        }
    }

    /* renamed from: c */
    public boolean mo23118c() {
        return !m25768k() || (this.f18910L && !mo23119d());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m25757c(int i) {
        if (i == 5) {
            return 80000;
        }
        if (i != 6) {
            if (i == 7) {
                return 192000;
            }
            if (i == 8) {
                return 2250000;
            }
            if (i == 14) {
                return 3062500;
            }
            if (i == 17) {
                return 336000;
            }
            if (i != 18) {
                throw new IllegalArgumentException();
            }
        }
        return 768000;
    }

    /* renamed from: b */
    public void mo23117b() {
        this.f18912N = false;
        if (m25768k() && this.f18925i.mo23144b()) {
            this.f18931o.pause();
        }
    }

    /* renamed from: b */
    private long m25753b(long j) {
        long j2;
        long a;
        C8863g gVar = null;
        while (!this.f18926j.isEmpty() && j >= ((C8863g) this.f18926j.getFirst()).f18962c) {
            gVar = (C8863g) this.f18926j.remove();
        }
        if (gVar != null) {
            this.f18934r = gVar.f18960a;
            this.f18936t = gVar.f18962c;
            this.f18935s = gVar.f18961b - this.f18901C;
        }
        if (this.f18934r.f18372a == 1.0f) {
            return (j + this.f18935s) - this.f18936t;
        }
        if (this.f18926j.isEmpty()) {
            j2 = this.f18935s;
            a = this.f18918b.mo23164a(j - this.f18936t);
        } else {
            j2 = this.f18935s;
            a = Util.m29387a(j - this.f18936t, this.f18934r.f18372a);
        }
        return j2 + a;
    }

    /* renamed from: a */
    public boolean mo23116a(ByteBuffer byteBuffer, long j) throws C8846b, C8848d {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f18905G;
        Assertions.m29299a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f18929m != null) {
            if (!m25764g()) {
                return false;
            }
            if (!this.f18929m.mo23169a(this.f18930n)) {
                m25769l();
                if (mo23119d()) {
                    return false;
                }
                flush();
            } else {
                this.f18930n = this.f18929m;
                this.f18929m = null;
            }
            m25751a(this.f18934r, j2);
        }
        if (!m25768k()) {
            m25759c(j2);
            if (this.f18912N) {
                mo23105Y();
            }
        }
        if (!this.f18925i.mo23149e(m25767j())) {
            return false;
        }
        String str = "AudioTrack";
        if (this.f18905G == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C8860d dVar = this.f18930n;
            if (!dVar.f18946a && this.f18899A == 0) {
                this.f18899A = m25744a(dVar.f18952g, byteBuffer2);
                if (this.f18899A == 0) {
                    return true;
                }
            }
            if (this.f18933q != null) {
                if (!m25764g()) {
                    return false;
                }
                PlaybackParameters playbackParameters = this.f18933q;
                this.f18933q = null;
                m25751a(playbackParameters, j2);
            }
            if (this.f18900B == 0) {
                this.f18901C = Math.max(0, j2);
                this.f18900B = 1;
            } else {
                long c = this.f18901C + this.f18930n.mo23171c(m25766i() - this.f18921e.mo23074l());
                if (this.f18900B == 1 && Math.abs(c - j2) > 200000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Discontinuity detected [expected ");
                    sb.append(c);
                    sb.append(", got ");
                    sb.append(j2);
                    sb.append("]");
                    Log.m29497b(str, sb.toString());
                    this.f18900B = 2;
                }
                if (this.f18900B == 2) {
                    long j3 = j2 - c;
                    this.f18901C += j3;
                    this.f18900B = 1;
                    C8847c cVar = this.f18927k;
                    if (!(cVar == null || j3 == 0)) {
                        cVar.mo23125a();
                    }
                }
            }
            if (this.f18930n.f18946a) {
                this.f18939w += (long) byteBuffer.remaining();
            } else {
                this.f18940x += (long) this.f18899A;
            }
            this.f18905G = byteBuffer2;
        }
        if (this.f18930n.f18954i) {
            m25762d(j2);
        } else {
            m25756b(this.f18905G, j2);
        }
        if (!this.f18905G.hasRemaining()) {
            this.f18905G = null;
            return true;
        } else if (!this.f18925i.mo23148d(m25767j())) {
            return false;
        } else {
            Log.m29500d(str, "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    /* renamed from: b */
    private static void m25755b(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: a */
    public void mo23108a() throws C8848d {
        if (!this.f18910L && m25768k() && m25764g()) {
            m25769l();
            this.f18910L = true;
        }
    }

    /* renamed from: a */
    public PlaybackParameters mo23107a(PlaybackParameters playbackParameters) {
        C8860d dVar = this.f18930n;
        if (dVar == null || dVar.f18955j) {
            PlaybackParameters playbackParameters2 = this.f18933q;
            if (playbackParameters2 == null) {
                playbackParameters2 = !this.f18926j.isEmpty() ? ((C8863g) this.f18926j.getLast()).f18960a : this.f18934r;
            }
            if (!playbackParameters.equals(playbackParameters2)) {
                if (m25768k()) {
                    this.f18933q = playbackParameters;
                } else {
                    this.f18934r = playbackParameters;
                }
            }
            return this.f18934r;
        }
        this.f18934r = PlaybackParameters.f18371e;
        return this.f18934r;
    }

    /* renamed from: a */
    public void mo23112a(C8831i iVar) {
        if (!this.f18932p.equals(iVar)) {
            this.f18932p = iVar;
            if (!this.f18915Q) {
                flush();
                this.f18913O = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo23114a(C8853r rVar) {
        if (!this.f18914P.equals(rVar)) {
            int i = rVar.f18886a;
            float f = rVar.f18887b;
            AudioTrack audioTrack = this.f18931o;
            if (audioTrack != null) {
                if (this.f18914P.f18886a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f18931o.setAuxEffectSendLevel(f);
                }
            }
            this.f18914P = rVar;
        }
    }

    /* renamed from: a */
    public void mo23110a(int i) {
        Assertions.checkState(Util.SDK_INT >= 21);
        if (!this.f18915Q || this.f18913O != i) {
            this.f18915Q = true;
            this.f18913O = i;
            flush();
        }
    }

    /* renamed from: a */
    public void mo23109a(float f) {
        if (this.f18902D != f) {
            this.f18902D = f;
            m25771n();
        }
    }

    /* renamed from: a */
    private void m25751a(PlaybackParameters playbackParameters, long j) {
        PlaybackParameters a = this.f18930n.f18955j ? this.f18918b.mo23165a(playbackParameters) : PlaybackParameters.f18371e;
        ArrayDeque<C8863g> arrayDeque = this.f18926j;
        C8863g gVar = new C8863g(a, Math.max(0, j), this.f18930n.mo23170b(m25767j()), null);
        arrayDeque.add(gVar);
        m25772o();
    }

    /* renamed from: a */
    private long m25748a(long j) {
        return j + this.f18930n.mo23170b(this.f18918b.mo23163a());
    }

    /* renamed from: a */
    private static int m25745a(int i, boolean z) {
        if (Util.SDK_INT <= 28 && !z) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (Util.SDK_INT <= 26) {
            if ("fugu".equals(Util.DEVICE) && !z && i == 1) {
                i = 2;
            }
        }
        return Util.m29380a(i);
    }

    /* renamed from: a */
    private static int m25744a(int i, ByteBuffer byteBuffer) {
        int i2;
        if (i == 7 || i == 8) {
            return C8865v.m25812a(byteBuffer);
        }
        if (i == 5) {
            return C8825g.m25595a();
        }
        if (i == 6 || i == 18) {
            return C8825g.m25602b(byteBuffer);
        }
        if (i == 17) {
            return C8828h.m25606a(byteBuffer);
        }
        if (i == 14) {
            int a = C8825g.m25597a(byteBuffer);
            if (a == -1) {
                i2 = 0;
            } else {
                i2 = C8825g.m25598a(byteBuffer, a) * 16;
            }
            return i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected audio encoding: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m25746a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: a */
    private int m25747a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f18937u == null) {
            this.f18937u = ByteBuffer.allocate(16);
            this.f18937u.order(ByteOrder.BIG_ENDIAN);
            this.f18937u.putInt(1431633921);
        }
        if (this.f18938v == 0) {
            this.f18937u.putInt(4, i);
            this.f18937u.putLong(8, j * 1000);
            this.f18937u.position(0);
            this.f18938v = i;
        }
        int remaining = this.f18937u.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f18937u, remaining, 1);
            if (write < 0) {
                this.f18938v = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a = m25746a(audioTrack, byteBuffer, i);
        if (a < 0) {
            this.f18938v = 0;
            return a;
        }
        this.f18938v -= a;
        return a;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m25750a(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }
}
