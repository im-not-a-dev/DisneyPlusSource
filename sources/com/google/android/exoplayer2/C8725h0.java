package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9318m;

/* renamed from: com.google.android.exoplayer2.h0 */
/* compiled from: PlaybackInfo */
final class C8725h0 {

    /* renamed from: n */
    private static final MediaPeriodId f18532n = new MediaPeriodId(new Object());

    /* renamed from: a */
    public final Timeline f18533a;

    /* renamed from: b */
    public final Object f18534b;

    /* renamed from: c */
    public final MediaPeriodId f18535c;

    /* renamed from: d */
    public final long f18536d;

    /* renamed from: e */
    public final long f18537e;

    /* renamed from: f */
    public final int f18538f;

    /* renamed from: g */
    public final boolean f18539g;

    /* renamed from: h */
    public final TrackGroupArray f18540h;

    /* renamed from: i */
    public final C9318m f18541i;

    /* renamed from: j */
    public final MediaPeriodId f18542j;

    /* renamed from: k */
    public volatile long f18543k;

    /* renamed from: l */
    public volatile long f18544l;

    /* renamed from: m */
    public volatile long f18545m;

    public C8725h0(Timeline timeline, Object obj, MediaPeriodId mediaPeriodId, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C9318m mVar, MediaPeriodId mediaPeriodId2, long j3, long j4, long j5) {
        this.f18533a = timeline;
        this.f18534b = obj;
        this.f18535c = mediaPeriodId;
        this.f18536d = j;
        this.f18537e = j2;
        this.f18538f = i;
        this.f18539g = z;
        this.f18540h = trackGroupArray;
        this.f18541i = mVar;
        this.f18542j = mediaPeriodId2;
        this.f18543k = j3;
        this.f18544l = j4;
        this.f18545m = j5;
    }

    /* renamed from: a */
    public static C8725h0 m25302a(long j, C9318m mVar) {
        C9318m mVar2 = mVar;
        C8725h0 h0Var = new C8725h0(Timeline.f18393a, null, f18532n, j, -9223372036854775807L, 1, false, TrackGroupArray.f20167W, mVar2, f18532n, j, 0, j);
        return h0Var;
    }

    /* renamed from: a */
    public MediaPeriodId mo22835a(boolean z, C8670c cVar) {
        if (this.f18533a.mo22671c()) {
            return f18532n;
        }
        Timeline timeline = this.f18533a;
        return new MediaPeriodId(this.f18533a.mo22666a(timeline.mo22663a(timeline.mo22657a(z), cVar).f18401c));
    }

    /* renamed from: a */
    public C8725h0 mo22831a(MediaPeriodId mediaPeriodId, long j, long j2) {
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, mediaPeriodId, j, mediaPeriodId.mo23494a() ? j2 : -9223372036854775807L, this.f18538f, this.f18539g, this.f18540h, this.f18541i, mediaPeriodId, j, 0, j);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22832a(MediaPeriodId mediaPeriodId, long j, long j2, long j3) {
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, mediaPeriodId, j, mediaPeriodId.mo23494a() ? j2 : -9223372036854775807L, this.f18538f, this.f18539g, this.f18540h, this.f18541i, this.f18542j, this.f18543k, j3, j);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22829a(Timeline timeline, Object obj) {
        Timeline timeline2 = timeline;
        C8725h0 h0Var = new C8725h0(timeline, obj, this.f18535c, this.f18536d, this.f18537e, this.f18538f, this.f18539g, this.f18540h, this.f18541i, this.f18542j, this.f18543k, this.f18544l, this.f18545m);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22828a(int i) {
        int i2 = i;
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, this.f18535c, this.f18536d, this.f18537e, i2, this.f18539g, this.f18540h, this.f18541i, this.f18542j, this.f18543k, this.f18544l, this.f18545m);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22834a(boolean z) {
        boolean z2 = z;
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, this.f18535c, this.f18536d, this.f18537e, this.f18538f, z2, this.f18540h, this.f18541i, this.f18542j, this.f18543k, this.f18544l, this.f18545m);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22833a(TrackGroupArray trackGroupArray, C9318m mVar) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C9318m mVar2 = mVar;
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, this.f18535c, this.f18536d, this.f18537e, this.f18538f, this.f18539g, trackGroupArray2, mVar2, this.f18542j, this.f18543k, this.f18544l, this.f18545m);
        return h0Var;
    }

    /* renamed from: a */
    public C8725h0 mo22830a(MediaPeriodId mediaPeriodId) {
        MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        C8725h0 h0Var = new C8725h0(this.f18533a, this.f18534b, this.f18535c, this.f18536d, this.f18537e, this.f18538f, this.f18539g, this.f18540h, this.f18541i, mediaPeriodId2, this.f18543k, this.f18544l, this.f18545m);
        return h0Var;
    }
}
