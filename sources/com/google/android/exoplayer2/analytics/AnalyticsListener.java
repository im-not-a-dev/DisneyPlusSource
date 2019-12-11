package com.google.android.exoplayer2.analytics;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

public interface AnalyticsListener {

    public static final class EventTime {

        /* renamed from: a */
        public final long f18409a;

        public EventTime(long j, Timeline timeline, int i, MediaPeriodId mediaPeriodId, long j2, long j3, long j4) {
            this.f18409a = j2;
        }
    }

    /* renamed from: a */
    void mo9196a(EventTime eventTime);

    /* renamed from: a */
    void mo9197a(EventTime eventTime, float f);

    /* renamed from: a */
    void mo9198a(EventTime eventTime, int i);

    /* renamed from: a */
    void mo9199a(EventTime eventTime, int i, int i2);

    /* renamed from: a */
    void mo9200a(EventTime eventTime, int i, int i2, int i3, float f);

    /* renamed from: a */
    void mo9201a(EventTime eventTime, int i, long j);

    /* renamed from: a */
    void mo9202a(EventTime eventTime, int i, long j, long j2);

    /* renamed from: a */
    void mo9203a(EventTime eventTime, int i, Format format);

    /* renamed from: a */
    void mo9204a(EventTime eventTime, int i, C8878d dVar);

    /* renamed from: a */
    void mo9205a(EventTime eventTime, int i, String str, long j);

    /* renamed from: a */
    void mo9206a(EventTime eventTime, Surface surface);

    /* renamed from: a */
    void mo9207a(EventTime eventTime, ExoPlaybackException exoPlaybackException);

    /* renamed from: a */
    void mo9208a(EventTime eventTime, PlaybackParameters playbackParameters);

    /* renamed from: a */
    void mo9209a(EventTime eventTime, Metadata metadata);

    /* renamed from: a */
    void mo9210a(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: a */
    void mo9211a(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    /* renamed from: a */
    void mo9212a(EventTime eventTime, MediaLoadData mediaLoadData);

    /* renamed from: a */
    void mo9213a(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    /* renamed from: a */
    void mo9214a(EventTime eventTime, Exception exc);

    /* renamed from: a */
    void mo9215a(EventTime eventTime, boolean z);

    /* renamed from: a */
    void mo9216a(EventTime eventTime, boolean z, int i);

    /* renamed from: b */
    void mo9217b(EventTime eventTime);

    /* renamed from: b */
    void mo9218b(EventTime eventTime, int i);

    /* renamed from: b */
    void mo9219b(EventTime eventTime, int i, long j, long j2);

    /* renamed from: b */
    void mo9220b(EventTime eventTime, int i, C8878d dVar);

    /* renamed from: b */
    void mo9221b(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: b */
    void mo9222b(EventTime eventTime, MediaLoadData mediaLoadData);

    /* renamed from: b */
    void mo9223b(EventTime eventTime, boolean z);

    /* renamed from: c */
    void mo9224c(EventTime eventTime);

    /* renamed from: c */
    void mo9225c(EventTime eventTime, int i);

    /* renamed from: c */
    void mo9226c(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: d */
    void mo9227d(EventTime eventTime);

    /* renamed from: d */
    void mo9228d(EventTime eventTime, int i);

    /* renamed from: e */
    void mo9229e(EventTime eventTime);

    /* renamed from: f */
    void mo9230f(EventTime eventTime);

    /* renamed from: g */
    void mo9231g(EventTime eventTime);

    void onSeekProcessed(EventTime eventTime);

    void onSeekStarted(EventTime eventTime);
}
