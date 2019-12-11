package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9542g;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.C9318m;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.y */
/* compiled from: ExoPlayerImpl */
final class C9613y extends BasePlayer implements ExoPlayer {

    /* renamed from: b */
    final C9318m f22486b;

    /* renamed from: c */
    private final C8733l0[] f22487c;

    /* renamed from: d */
    private final TrackSelector f22488d;

    /* renamed from: e */
    private final Handler f22489e;

    /* renamed from: f */
    private final C9616z f22490f;

    /* renamed from: g */
    private final Handler f22491g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C8813a> f22492h;

    /* renamed from: i */
    private final C8669b f22493i;

    /* renamed from: j */
    private final ArrayDeque<Runnable> f22494j;

    /* renamed from: k */
    private boolean f22495k;

    /* renamed from: l */
    private int f22496l;

    /* renamed from: m */
    private int f22497m;

    /* renamed from: n */
    private boolean f22498n;

    /* renamed from: o */
    private int f22499o;

    /* renamed from: p */
    private boolean f22500p;

    /* renamed from: q */
    private boolean f22501q;

    /* renamed from: r */
    private PlaybackParameters f22502r;

    /* renamed from: s */
    private ExoPlaybackException f22503s;

    /* renamed from: t */
    private C8725h0 f22504t;

    /* renamed from: u */
    private int f22505u;

    /* renamed from: v */
    private int f22506v;

    /* renamed from: w */
    private long f22507w;

    /* renamed from: com.google.android.exoplayer2.y$a */
    /* compiled from: ExoPlayerImpl */
    class C9614a extends Handler {
        C9614a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C9613y.this.mo24800a(message);
        }
    }

    /* renamed from: com.google.android.exoplayer2.y$b */
    /* compiled from: ExoPlayerImpl */
    private static final class C9615b implements Runnable {

        /* renamed from: U */
        private final CopyOnWriteArrayList<C8813a> f22509U;

        /* renamed from: V */
        private final TrackSelector f22510V;

        /* renamed from: W */
        private final boolean f22511W;

        /* renamed from: X */
        private final int f22512X;

        /* renamed from: Y */
        private final int f22513Y;

        /* renamed from: Z */
        private final boolean f22514Z;

        /* renamed from: a0 */
        private final boolean f22515a0;

        /* renamed from: b0 */
        private final boolean f22516b0;

        /* renamed from: c */
        private final C8725h0 f22517c;

        /* renamed from: c0 */
        private final boolean f22518c0;

        /* renamed from: d0 */
        private final boolean f22519d0;

        /* renamed from: e0 */
        private final boolean f22520e0;

        /* renamed from: f0 */
        private final boolean f22521f0;

        public C9615b(C8725h0 h0Var, C8725h0 h0Var2, CopyOnWriteArrayList<C8813a> copyOnWriteArrayList, TrackSelector trackSelector, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.f22517c = h0Var;
            this.f22509U = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.f22510V = trackSelector;
            this.f22511W = z;
            this.f22512X = i;
            this.f22513Y = i2;
            this.f22514Z = z2;
            this.f22520e0 = z3;
            this.f22521f0 = z4;
            boolean z5 = true;
            this.f22515a0 = h0Var2.f18538f != h0Var.f18538f;
            this.f22516b0 = (h0Var2.f18533a == h0Var.f18533a && h0Var2.f18534b == h0Var.f18534b) ? false : true;
            this.f22518c0 = h0Var2.f18539g != h0Var.f18539g;
            if (h0Var2.f18541i == h0Var.f18541i) {
                z5 = false;
            }
            this.f22519d0 = z5;
        }

        /* renamed from: a */
        public /* synthetic */ void mo24806a(EventListener eventListener) {
            C8725h0 h0Var = this.f22517c;
            eventListener.onTimelineChanged(h0Var.f18533a, h0Var.f18534b, this.f22513Y);
        }

        /* renamed from: b */
        public /* synthetic */ void mo24807b(EventListener eventListener) {
            eventListener.onPositionDiscontinuity(this.f22512X);
        }

        /* renamed from: c */
        public /* synthetic */ void mo24808c(EventListener eventListener) {
            C8725h0 h0Var = this.f22517c;
            eventListener.onTracksChanged(h0Var.f18540h, h0Var.f18541i.f21312c);
        }

        /* renamed from: d */
        public /* synthetic */ void mo24809d(EventListener eventListener) {
            eventListener.onLoadingChanged(this.f22517c.f18539g);
        }

        /* renamed from: e */
        public /* synthetic */ void mo24810e(EventListener eventListener) {
            eventListener.onPlayerStateChanged(this.f22520e0, this.f22517c.f18538f);
        }

        /* renamed from: f */
        public /* synthetic */ void mo24811f(EventListener eventListener) {
            eventListener.mo7578a(this.f22517c.f18538f == 3);
        }

        public void run() {
            if (this.f22516b0 || this.f22513Y == 0) {
                C9613y.m29775b(this.f22509U, new C8722g(this));
            }
            if (this.f22511W) {
                C9613y.m29775b(this.f22509U, new C8720f(this));
            }
            if (this.f22519d0) {
                this.f22510V.mo24047a(this.f22517c.f18541i.f21313d);
                C9613y.m29775b(this.f22509U, new C8726i(this));
            }
            if (this.f22518c0) {
                C9613y.m29775b(this.f22509U, new C8724h(this));
            }
            if (this.f22515a0) {
                C9613y.m29775b(this.f22509U, new C8728j(this));
            }
            if (this.f22521f0) {
                C9613y.m29775b(this.f22509U, new C8718e(this));
            }
            if (this.f22514Z) {
                C9613y.m29775b(this.f22509U, C8671a.f18406a);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C9613y(C8733l0[] l0VarArr, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, C9542g gVar, Looper looper) {
        C8733l0[] l0VarArr2 = l0VarArr;
        StringBuilder sb = new StringBuilder();
        sb.append("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.10.5");
        sb.append("] [");
        sb.append(Util.DEVICE_DEBUG_INFO);
        sb.append("]");
        Log.m29499c("ExoPlayerImpl", sb.toString());
        Assertions.checkState(l0VarArr2.length > 0);
        Assertions.checkNotNull(l0VarArr);
        this.f22487c = l0VarArr2;
        Assertions.checkNotNull(trackSelector);
        this.f22488d = trackSelector;
        this.f22495k = false;
        this.f22497m = 0;
        this.f22498n = false;
        this.f22492h = new CopyOnWriteArrayList<>();
        this.f22486b = new C9318m(new C8800n0[l0VarArr2.length], new TrackSelection[l0VarArr2.length], null);
        this.f22493i = new C8669b();
        this.f22502r = PlaybackParameters.f18371e;
        SeekParameters seekParameters = SeekParameters.f18390d;
        this.f22496l = 0;
        this.f22489e = new C9614a(looper);
        this.f22504t = C8725h0.m25302a(0, this.f22486b);
        this.f22494j = new ArrayDeque<>();
        C9616z zVar = new C9616z(l0VarArr, trackSelector, this.f22486b, loadControl, bandwidthMeter, this.f22495k, this.f22497m, this.f22498n, this.f22489e, gVar);
        this.f22490f = zVar;
        this.f22491g = new Handler(this.f22490f.mo24818b());
    }

    /* renamed from: h */
    private boolean m29777h() {
        return this.f22504t.f18533a.mo22671c() || this.f22499o > 0;
    }

    public void addListener(EventListener eventListener) {
        this.f22492h.addIfAbsent(new C8813a(eventListener));
    }

    /* renamed from: b */
    public int mo22619b() {
        return this.f22496l;
    }

    /* renamed from: f */
    public int mo23005f() {
        if (m29777h()) {
            return this.f22506v;
        }
        C8725h0 h0Var = this.f22504t;
        return h0Var.f18533a.mo22656a(h0Var.f18535c.f20147a);
    }

    /* renamed from: g */
    public void mo24804g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.10.5");
        String str = "] [";
        sb.append(str);
        sb.append(Util.DEVICE_DEBUG_INFO);
        sb.append(str);
        sb.append(C8672a0.m24989a());
        sb.append("]");
        Log.m29499c("ExoPlayerImpl", sb.toString());
        this.f22490f.mo24822c();
        this.f22489e.removeCallbacksAndMessages(null);
        this.f22504t = m29763a(false, false, 1);
    }

    public Looper getApplicationLooper() {
        return this.f22489e.getLooper();
    }

    public long getBufferedPosition() {
        long j;
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        C8725h0 h0Var = this.f22504t;
        if (h0Var.f18542j.equals(h0Var.f18535c)) {
            j = C.usToMs(this.f22504t.f18543k);
        } else {
            j = getDuration();
        }
        return j;
    }

    public long getContentBufferedPosition() {
        if (m29777h()) {
            return this.f22507w;
        }
        C8725h0 h0Var = this.f22504t;
        if (h0Var.f18542j.f20150d != h0Var.f18535c.f20150d) {
            return h0Var.f18533a.mo22663a(getCurrentWindowIndex(), this.f18741a).mo22692c();
        }
        long j = h0Var.f18543k;
        if (this.f22504t.f18542j.mo23494a()) {
            C8725h0 h0Var2 = this.f22504t;
            C8669b a = h0Var2.f18533a.mo22662a(h0Var2.f18542j.f20147a, this.f22493i);
            long b = a.mo22681b(this.f22504t.f18542j.f20148b);
            j = b == Long.MIN_VALUE ? a.f18396c : b;
        }
        return m29762a(this.f22504t.f18542j, j);
    }

    public long getContentPosition() {
        long j;
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        C8725h0 h0Var = this.f22504t;
        h0Var.f18533a.mo22662a(h0Var.f18535c.f20147a, this.f22493i);
        C8725h0 h0Var2 = this.f22504t;
        if (h0Var2.f18537e == -9223372036854775807L) {
            j = h0Var2.f18533a.mo22663a(getCurrentWindowIndex(), this.f18741a).mo22689a();
        } else {
            j = this.f22493i.mo22687e() + C.usToMs(this.f22504t.f18537e);
        }
        return j;
    }

    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.f22504t.f18535c.f20148b;
        }
        return -1;
    }

    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.f22504t.f18535c.f20149c;
        }
        return -1;
    }

    public long getCurrentPosition() {
        if (m29777h()) {
            return this.f22507w;
        }
        if (this.f22504t.f18535c.mo23494a()) {
            return C.usToMs(this.f22504t.f18545m);
        }
        C8725h0 h0Var = this.f22504t;
        return m29762a(h0Var.f18535c, h0Var.f18545m);
    }

    public Timeline getCurrentTimeline() {
        return this.f22504t.f18533a;
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.f22504t.f18540h;
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        return this.f22504t.f18541i.f21312c;
    }

    public int getCurrentWindowIndex() {
        if (m29777h()) {
            return this.f22505u;
        }
        C8725h0 h0Var = this.f22504t;
        return h0Var.f18533a.mo22662a(h0Var.f18535c.f20147a, this.f22493i).f18395b;
    }

    public long getDuration() {
        if (!isPlayingAd()) {
            return mo23044e();
        }
        C8725h0 h0Var = this.f22504t;
        MediaPeriodId mediaPeriodId = h0Var.f18535c;
        h0Var.f18533a.mo22662a(mediaPeriodId.f20147a, this.f22493i);
        return C.usToMs(this.f22493i.mo22675a(mediaPeriodId.f20148b, mediaPeriodId.f20149c));
    }

    public boolean getPlayWhenReady() {
        return this.f22495k;
    }

    public ExoPlaybackException getPlaybackError() {
        return this.f22503s;
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.f22502r;
    }

    public int getPlaybackState() {
        return this.f22504t.f18538f;
    }

    public int getRendererType(int i) {
        return this.f22487c[i].mo22847f();
    }

    public int getRepeatMode() {
        return this.f22497m;
    }

    public boolean getShuffleModeEnabled() {
        return this.f22498n;
    }

    public TextComponent getTextComponent() {
        return null;
    }

    public long getTotalBufferedDuration() {
        return C.usToMs(this.f22504t.f18544l);
    }

    public VideoComponent getVideoComponent() {
        return null;
    }

    public boolean isPlayingAd() {
        return !m29777h() && this.f22504t.f18535c.mo23494a();
    }

    public void prepare(MediaSource mediaSource) {
        mo24802a(mediaSource, true, true);
    }

    public void removeListener(EventListener eventListener) {
        Iterator it = this.f22492h.iterator();
        while (it.hasNext()) {
            C8813a aVar = (C8813a) it.next();
            if (aVar.f18742a.equals(eventListener)) {
                aVar.mo23045a();
                this.f22492h.remove(aVar);
            }
        }
    }

    public void seekTo(int i, long j) {
        Timeline timeline = this.f22504t.f18533a;
        if (i < 0 || (!timeline.mo22671c() && i >= timeline.mo22667b())) {
            throw new C8681c0(timeline, i, j);
        }
        this.f22501q = true;
        this.f22499o++;
        if (isPlayingAd()) {
            Log.m29500d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f22489e.obtainMessage(0, 1, -1, this.f22504t).sendToTarget();
            return;
        }
        this.f22505u = i;
        if (timeline.mo22671c()) {
            this.f22507w = j == -9223372036854775807L ? 0 : j;
            this.f22506v = 0;
        } else {
            long b = j == -9223372036854775807L ? timeline.mo22663a(i, this.f18741a).mo22691b() : C.msToUs(j);
            Pair a = timeline.mo22658a(this.f18741a, this.f22493i, i, b);
            this.f22507w = C.usToMs(b);
            this.f22506v = timeline.mo22656a(a.first);
        }
        this.f22490f.mo24815a(timeline, i, C.msToUs(j));
        m29770a((C8814b) C8680c.f18428a);
    }

    public void setPlayWhenReady(boolean z) {
        mo24803a(z, 0);
    }

    public void setRepeatMode(int i) {
        if (this.f22497m != i) {
            this.f22497m = i;
            this.f22490f.mo24813a(i);
            m29770a((C8814b) new C8799n(i));
        }
    }

    public void setShuffleModeEnabled(boolean z) {
        if (this.f22498n != z) {
            this.f22498n = z;
            this.f22490f.mo24821b(z);
            m29770a((C8814b) new C8730k(z));
        }
    }

    public void stop(boolean z) {
        if (z) {
            this.f22503s = null;
        }
        C8725h0 a = m29763a(z, z, 1);
        this.f22499o++;
        this.f22490f.mo24823c(z);
        m29769a(a, false, 4, 1, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m29775b(CopyOnWriteArrayList<C8813a> copyOnWriteArrayList, C8814b bVar) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((C8813a) it.next()).mo23046a(bVar);
        }
    }

    /* renamed from: a */
    public void mo24802a(MediaSource mediaSource, boolean z, boolean z2) {
        this.f22503s = null;
        C8725h0 a = m29763a(z, z2, 2);
        this.f22500p = true;
        this.f22499o++;
        this.f22490f.mo24816a(mediaSource, z, z2);
        m29769a(a, false, 4, 1, false);
    }

    /* renamed from: a */
    public void mo24803a(boolean z, int i) {
        boolean a = mo22618a();
        boolean z2 = this.f22495k && this.f22496l == 0;
        boolean z3 = z && i == 0;
        if (z2 != z3) {
            this.f22490f.mo24817a(z3);
        }
        boolean z4 = this.f22495k != z;
        this.f22495k = z;
        this.f22496l = i;
        boolean a2 = mo22618a();
        boolean z5 = a != a2;
        if (z4 || z5) {
            C8734m mVar = new C8734m(z4, z, this.f22504t.f18538f, z5, a2);
            m29770a((C8814b) mVar);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m29774a(boolean z, boolean z2, int i, boolean z3, boolean z4, EventListener eventListener) {
        if (z) {
            eventListener.onPlayerStateChanged(z2, i);
        }
        if (z3) {
            eventListener.mo7578a(z4);
        }
    }

    /* renamed from: a */
    public void mo24801a(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.f18371e;
        }
        this.f22490f.mo24814a(playbackParameters);
    }

    /* renamed from: a */
    public PlayerMessage mo24799a(Target target) {
        PlayerMessage playerMessage = new PlayerMessage(this.f22490f, target, this.f22504t.f18533a, getCurrentWindowIndex(), this.f22491g);
        return playerMessage;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24800a(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            C8725h0 h0Var = (C8725h0) message.obj;
            int i2 = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            m29768a(h0Var, i2, z, message.arg2);
        } else if (i == 1) {
            PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
            if (!this.f22502r.equals(playbackParameters)) {
                this.f22502r = playbackParameters;
                m29770a((C8814b) new C8682d(playbackParameters));
            }
        } else if (i == 2) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
            this.f22503s = exoPlaybackException;
            m29770a((C8814b) new C8732l(exoPlaybackException));
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m29768a(C8725h0 h0Var, int i, boolean z, int i2) {
        this.f22499o -= i;
        if (this.f22499o == 0) {
            if (h0Var.f18536d == -9223372036854775807L) {
                h0Var = h0Var.mo22831a(h0Var.f18535c, 0, h0Var.f18537e);
            }
            C8725h0 h0Var2 = h0Var;
            if (!this.f22504t.f18533a.mo22671c() && h0Var2.f18533a.mo22671c()) {
                this.f22506v = 0;
                this.f22505u = 0;
                this.f22507w = 0;
            }
            int i3 = this.f22500p ? 0 : 2;
            boolean z2 = this.f22501q;
            this.f22500p = false;
            this.f22501q = false;
            m29769a(h0Var2, z, i2, i3, z2);
        }
    }

    /* renamed from: a */
    private C8725h0 m29763a(boolean z, boolean z2, int i) {
        long j;
        long j2 = 0;
        boolean z3 = false;
        if (z) {
            this.f22505u = 0;
            this.f22506v = 0;
            this.f22507w = 0;
        } else {
            this.f22505u = getCurrentWindowIndex();
            this.f22506v = mo23005f();
            this.f22507w = getCurrentPosition();
        }
        if (z || z2) {
            z3 = true;
        }
        MediaPeriodId a = z3 ? this.f22504t.mo22835a(this.f22498n, this.f18741a) : this.f22504t.f18535c;
        if (!z3) {
            j2 = this.f22504t.f18545m;
        }
        long j3 = j2;
        if (z3) {
            j = -9223372036854775807L;
        } else {
            j = this.f22504t.f18537e;
        }
        C8725h0 h0Var = new C8725h0(z2 ? Timeline.f18393a : this.f22504t.f18533a, z2 ? null : this.f22504t.f18534b, a, j3, j, i, false, z2 ? TrackGroupArray.f20167W : this.f22504t.f18540h, z2 ? this.f22486b : this.f22504t.f18541i, a, j3, 0, j3);
        return h0Var;
    }

    /* renamed from: a */
    private void m29769a(C8725h0 h0Var, boolean z, int i, int i2, boolean z2) {
        boolean a = mo22618a();
        C8725h0 h0Var2 = this.f22504t;
        this.f22504t = h0Var;
        C9615b bVar = new C9615b(h0Var, h0Var2, this.f22492h, this.f22488d, z, i, i2, z2, this.f22495k, a != mo22618a());
        m29771a((Runnable) bVar);
    }

    /* renamed from: a */
    private void m29770a(C8814b bVar) {
        m29771a((Runnable) new C8678b(new CopyOnWriteArrayList(this.f22492h), bVar));
    }

    /* renamed from: a */
    private void m29771a(Runnable runnable) {
        boolean z = !this.f22494j.isEmpty();
        this.f22494j.addLast(runnable);
        if (!z) {
            while (!this.f22494j.isEmpty()) {
                ((Runnable) this.f22494j.peekFirst()).run();
                this.f22494j.removeFirst();
            }
        }
    }

    /* renamed from: a */
    private long m29762a(MediaPeriodId mediaPeriodId, long j) {
        long b = C.usToMs(j);
        this.f22504t.f18533a.mo22662a(mediaPeriodId.f20147a, this.f22493i);
        return b + this.f22493i.mo22687e();
    }
}
