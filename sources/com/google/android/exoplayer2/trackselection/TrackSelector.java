package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C8735m0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

public abstract class TrackSelector {

    /* renamed from: a */
    private C9285a f21170a;

    /* renamed from: b */
    private BandwidthMeter f21171b;

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelector$a */
    public interface C9285a {
        /* renamed from: a */
        void mo24049a();
    }

    /* renamed from: a */
    public abstract C9318m mo24044a(C8735m0[] m0VarArr, TrackGroupArray trackGroupArray, MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;

    /* renamed from: a */
    public final void mo24046a(C9285a aVar, BandwidthMeter bandwidthMeter) {
        this.f21170a = aVar;
        this.f21171b = bandwidthMeter;
    }

    /* renamed from: a */
    public abstract void mo24047a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24048b() {
        C9285a aVar = this.f21170a;
        if (aVar != null) {
            aVar.mo24049a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final BandwidthMeter mo24045a() {
        BandwidthMeter bandwidthMeter = this.f21171b;
        Assertions.checkNotNull(bandwidthMeter);
        return bandwidthMeter;
    }
}
