package com.bamtech.sdk4.internal.media.adapters.exoplayer;

import android.view.Surface;
import com.bamtech.sdk4.media.PlaybackSeekedEventData;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime;
import com.google.android.exoplayer2.analytics.C8677b;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerAnalyticsListener;", "Lcom/google/android/exoplayer2/analytics/AnalyticsListener;", "listenerQOS", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "primaryListener", "Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "(Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;)V", "getListenerQOS", "()Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "getPrimaryListener", "()Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "seekStartTime", "", "Ljava/lang/Long;", "getCurrentPlayhead", "getCurrentPlayhead$playeradapter_exoplayer_2_10_1_release", "()Ljava/lang/Long;", "onSeekProcessed", "", "eventTime", "Lcom/google/android/exoplayer2/analytics/AnalyticsListener$EventTime;", "onSeekStarted", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoPlayerAnalyticsListener.kt */
public final class ExoPlayerAnalyticsListener implements AnalyticsListener {
    private final QOSPlaybackEventListener listenerQOS;
    private final ExoPlayerListener primaryListener;
    private Long seekStartTime;

    public ExoPlayerAnalyticsListener(QOSPlaybackEventListener qOSPlaybackEventListener, ExoPlayerListener exoPlayerListener) {
        this.listenerQOS = qOSPlaybackEventListener;
        this.primaryListener = exoPlayerListener;
    }

    /* renamed from: a */
    public /* synthetic */ void mo9196a(EventTime eventTime) {
        C8677b.m25108d(this, eventTime);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9197a(EventTime eventTime, float f) {
        C8677b.m25078a((AnalyticsListener) this, eventTime, f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9198a(EventTime eventTime, int i) {
        C8677b.m25099b((AnalyticsListener) this, eventTime, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9199a(EventTime eventTime, int i, int i2) {
        C8677b.m25080a((AnalyticsListener) this, eventTime, i, i2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9200a(EventTime eventTime, int i, int i2, int i3, float f) {
        C8677b.m25081a((AnalyticsListener) this, eventTime, i, i2, i3, f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9201a(EventTime eventTime, int i, long j) {
        C8677b.m25082a((AnalyticsListener) this, eventTime, i, j);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9202a(EventTime eventTime, int i, long j, long j2) {
        C8677b.m25100b(this, eventTime, i, j, j2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9203a(EventTime eventTime, int i, Format format) {
        C8677b.m25084a((AnalyticsListener) this, eventTime, i, format);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9204a(EventTime eventTime, int i, C8878d dVar) {
        C8677b.m25101b((AnalyticsListener) this, eventTime, i, dVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9205a(EventTime eventTime, int i, String str, long j) {
        C8677b.m25086a((AnalyticsListener) this, eventTime, i, str, j);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9206a(EventTime eventTime, Surface surface) {
        C8677b.m25087a((AnalyticsListener) this, eventTime, surface);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9207a(EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        C8677b.m25088a((AnalyticsListener) this, eventTime, exoPlaybackException);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9208a(EventTime eventTime, PlaybackParameters playbackParameters) {
        C8677b.m25089a((AnalyticsListener) this, eventTime, playbackParameters);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9209a(EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
        C8677b.m25090a((AnalyticsListener) this, eventTime, metadata);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9210a(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        C8677b.m25102b((AnalyticsListener) this, eventTime, loadEventInfo, mediaLoadData);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9211a(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        C8677b.m25092a((AnalyticsListener) this, eventTime, loadEventInfo, mediaLoadData, iOException, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9212a(EventTime eventTime, MediaLoadData mediaLoadData) {
        C8677b.m25093a((AnalyticsListener) this, eventTime, mediaLoadData);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9213a(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        C8677b.m25094a((AnalyticsListener) this, eventTime, trackGroupArray, trackSelectionArray);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9214a(EventTime eventTime, Exception exc) {
        C8677b.m25095a((AnalyticsListener) this, eventTime, exc);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9215a(EventTime eventTime, boolean z) {
        C8677b.m25096a((AnalyticsListener) this, eventTime, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9216a(EventTime eventTime, boolean z, int i) {
        C8677b.m25097a((AnalyticsListener) this, eventTime, z, i);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9217b(EventTime eventTime) {
        C8677b.m25098b(this, eventTime);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9218b(EventTime eventTime, int i) {
        C8677b.m25106c(this, eventTime, i);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9219b(EventTime eventTime, int i, long j, long j2) {
        C8677b.m25083a((AnalyticsListener) this, eventTime, i, j, j2);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9220b(EventTime eventTime, int i, C8878d dVar) {
        C8677b.m25085a((AnalyticsListener) this, eventTime, i, dVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9221b(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        C8677b.m25091a((AnalyticsListener) this, eventTime, loadEventInfo, mediaLoadData);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9222b(EventTime eventTime, MediaLoadData mediaLoadData) {
        C8677b.m25103b((AnalyticsListener) this, eventTime, mediaLoadData);
    }

    /* renamed from: b */
    public /* synthetic */ void mo9223b(EventTime eventTime, boolean z) {
        C8677b.m25104b((AnalyticsListener) this, eventTime, z);
    }

    /* renamed from: c */
    public /* synthetic */ void mo9224c(EventTime eventTime) {
        C8677b.m25111f(this, eventTime);
    }

    /* renamed from: c */
    public /* synthetic */ void mo9225c(EventTime eventTime, int i) {
        C8677b.m25109d(this, eventTime, i);
    }

    /* renamed from: c */
    public /* synthetic */ void mo9226c(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        C8677b.m25107c(this, eventTime, loadEventInfo, mediaLoadData);
    }

    /* renamed from: d */
    public /* synthetic */ void mo9227d(EventTime eventTime) {
        C8677b.m25077a(this, eventTime);
    }

    /* renamed from: d */
    public /* synthetic */ void mo9228d(EventTime eventTime, int i) {
        C8677b.m25079a((AnalyticsListener) this, eventTime, i);
    }

    /* renamed from: e */
    public /* synthetic */ void mo9229e(EventTime eventTime) {
        C8677b.m25110e(this, eventTime);
    }

    /* renamed from: f */
    public /* synthetic */ void mo9230f(EventTime eventTime) {
        C8677b.m25105c(this, eventTime);
    }

    /* renamed from: g */
    public /* synthetic */ void mo9231g(EventTime eventTime) {
        C8677b.m25112g(this, eventTime);
    }

    public final Long getCurrentPlayhead$playeradapter_exoplayer_2_10_1_release() {
        try {
            return Long.valueOf(this.primaryListener.getPlaybackMetricsProvier().getPlaybackMetrics().getCurrentPlayhead());
        } catch (Throwable unused) {
            return null;
        }
    }

    public void onSeekProcessed(EventTime eventTime) {
        if (!this.primaryListener.getFirstStart()) {
            String playbackSessionId = this.primaryListener.getPlaybackSessionId();
            if (playbackSessionId != null) {
                this.primaryListener.getPlaybackMetricsProvier().getPlaybackMetrics();
                this.listenerQOS.onEvent(new PlaybackSeekedEventData(playbackSessionId, null, this.seekStartTime, eventTime != null ? Long.valueOf(eventTime.f18409a) : getCurrentPlayhead$playeradapter_exoplayer_2_10_1_release()));
            }
            this.seekStartTime = null;
        }
    }

    public void onSeekStarted(EventTime eventTime) {
        this.seekStartTime = eventTime != null ? Long.valueOf(eventTime.f18409a) : getCurrentPlayhead$playeradapter_exoplayer_2_10_1_release();
    }
}
