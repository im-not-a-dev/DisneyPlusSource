package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.source.C9146h0.C9147a;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.z */
/* compiled from: LoopingMediaSource */
public final class C9266z extends C9233r<Void> {

    /* renamed from: b0 */
    private final MediaSource f21074b0;

    /* renamed from: c0 */
    private final int f21075c0;

    /* renamed from: d0 */
    private final Map<MediaPeriodId, MediaPeriodId> f21076d0;

    /* renamed from: e0 */
    private final Map<C9072a0, MediaPeriodId> f21077e0;

    /* renamed from: com.google.android.exoplayer2.source.z$a */
    /* compiled from: LoopingMediaSource */
    private static final class C9267a extends C9263x {
        public C9267a(Timeline timeline) {
            super(timeline);
        }

        /* renamed from: a */
        public int mo22654a(int i, int i2, boolean z) {
            int a = this.f21068b.mo22654a(i, i2, z);
            return a == -1 ? mo22657a(z) : a;
        }

        /* renamed from: b */
        public int mo22668b(int i, int i2, boolean z) {
            int b = this.f21068b.mo22668b(i, i2, z);
            return b == -1 ? mo22669b(z) : b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.z$b */
    /* compiled from: LoopingMediaSource */
    private static final class C9268b extends C9208m {

        /* renamed from: e */
        private final Timeline f21078e;

        /* renamed from: f */
        private final int f21079f;

        /* renamed from: g */
        private final int f21080g;

        /* renamed from: h */
        private final int f21081h;

        public C9268b(Timeline timeline, int i) {
            boolean z = false;
            super(false, new C9147a(i));
            this.f21078e = timeline;
            this.f21079f = timeline.mo22653a();
            this.f21080g = timeline.mo22667b();
            this.f21081h = i;
            int i2 = this.f21079f;
            if (i2 > 0) {
                if (i <= Integer.MAX_VALUE / i2) {
                    z = true;
                }
                Assertions.m29302b(z, "LoopingMediaSource contains too many periods");
            }
        }

        /* renamed from: a */
        public int mo22653a() {
            return this.f21079f * this.f21081h;
        }

        /* renamed from: b */
        public int mo22667b() {
            return this.f21080g * this.f21081h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo23922c(int i) {
            return i / this.f21080g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Object mo23923d(int i) {
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo23924e(int i) {
            return i * this.f21079f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo23925f(int i) {
            return i * this.f21080g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Timeline mo23926g(int i) {
            return this.f21078e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo23920b(int i) {
            return i / this.f21079f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo23921b(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }
    }

    public C9266z(MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    public C9266z(MediaSource mediaSource, int i) {
        Assertions.m29299a(i > 0);
        this.f21074b0 = mediaSource;
        this.f21075c0 = i;
        this.f21076d0 = new HashMap();
        this.f21077e0 = new HashMap();
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        super.mo23580a(transferListener);
        mo23968a(null, this.f21074b0);
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        if (this.f21075c0 == Integer.MAX_VALUE) {
            return this.f21074b0.mo23486a(mediaPeriodId, fVar, j);
        }
        MediaPeriodId a = mediaPeriodId.mo23493a(C9208m.m27731c(mediaPeriodId.f20147a));
        this.f21076d0.put(a, mediaPeriodId);
        C9072a0 a2 = this.f21074b0.mo23486a(a, fVar, j);
        this.f21077e0.put(a2, a);
        return a2;
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        this.f21074b0.mo23492a(a0Var);
        MediaPeriodId mediaPeriodId = (MediaPeriodId) this.f21077e0.remove(a0Var);
        if (mediaPeriodId != null) {
            this.f21076d0.remove(mediaPeriodId);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23970b(Void voidR, MediaSource mediaSource, Timeline timeline, Object obj) {
        int i = this.f21075c0;
        mo23961a(i != Integer.MAX_VALUE ? new C9268b(timeline, i) : new C9267a(timeline), obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MediaPeriodId mo23967a(Void voidR, MediaPeriodId mediaPeriodId) {
        return this.f21075c0 != Integer.MAX_VALUE ? (MediaPeriodId) this.f21076d0.get(mediaPeriodId) : mediaPeriodId;
    }
}
