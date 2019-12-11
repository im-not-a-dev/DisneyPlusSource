package com.bamtech.sdk4.internal.media.adapters.exoplayer;

import com.bamtech.sdk4.media.PlaybackEndCause;
import com.bamtech.sdk4.media.PlaybackEndedEventData;
import com.bamtech.sdk4.media.PlaybackError;
import com.bamtech.sdk4.media.PlaybackInitializedEventData;
import com.bamtech.sdk4.media.PlaybackPausedEventData;
import com.bamtech.sdk4.media.PlaybackReadyEventData;
import com.bamtech.sdk4.media.PlaybackResumedEventData;
import com.bamtech.sdk4.media.PlaybackStartedEventData;
import com.bamtech.sdk4.media.QOSListener;
import com.bamtech.sdk4.media.RebufferingEndedEventData;
import com.bamtech.sdk4.media.RebufferingStartedEventData;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter.QosMetadata;
import com.bamtech.sdk4.media.adapters.PlaybackEventListener;
import com.bamtech.sdk4.media.adapters.PlaybackMetricsProvider;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0012\u0010-\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0016\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0013J\u0018\u00106\u001a\u00020+2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0013H\u0016J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u0013H\u0016J\u0010\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\u0013H\u0016J\b\u0010;\u001a\u00020+H\u0016J\u0010\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020\u000bH\u0016J$\u0010>\u001a\u00020+2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u00108\u001a\u00020\u0013H\u0016J\u001c\u0010C\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010\u0019H\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006G"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "Lcom/google/android/exoplayer2/Player$EventListener;", "Lcom/bamtech/sdk4/media/QOSListener;", "listener", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "playbackMetricsProvier", "Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;", "listenerQOS", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "(Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;)V", "firstStart", "", "getFirstStart", "()Z", "setFirstStart", "(Z)V", "isOffline", "setOffline", "lastState", "", "getLastState", "()I", "setLastState", "(I)V", "lastTrackSelections", "Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;", "getLastTrackSelections", "()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;", "setLastTrackSelections", "(Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V", "getListener", "()Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "getListenerQOS", "()Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "getPlaybackMetricsProvier", "()Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;", "playbackSessionId", "", "getPlaybackSessionId", "()Ljava/lang/String;", "setPlaybackSessionId", "(Ljava/lang/String;)V", "onLoadingChanged", "", "isLoading", "onPlaybackParametersChanged", "p0", "Lcom/google/android/exoplayer2/PlaybackParameters;", "onPlayerError", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPlayerStateChangeInternal", "playWhenReady", "playbackState", "onPlayerStateChanged", "onPositionDiscontinuity", "reason", "onRepeatModeChanged", "mode", "onSeekProcessed", "onShuffleModeEnabledChanged", "shuffleModeEnabled", "onTimelineChanged", "timeline", "Lcom/google/android/exoplayer2/Timeline;", "manifest", "", "onTracksChanged", "trackGroups", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "trackSelections", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoPlayerListener.kt */
public final class ExoPlayerListener implements EventListener, QOSListener {
    private boolean firstStart = true;
    private boolean isOffline;
    private int lastState = -1;
    private TrackSelectionArray lastTrackSelections;
    private final PlaybackEventListener listener;
    private final QOSPlaybackEventListener listenerQOS;
    private final PlaybackMetricsProvider playbackMetricsProvier;
    private String playbackSessionId;

    public ExoPlayerListener(PlaybackEventListener playbackEventListener, PlaybackMetricsProvider playbackMetricsProvider, QOSPlaybackEventListener qOSPlaybackEventListener) {
        this.listener = playbackEventListener;
        this.playbackMetricsProvier = playbackMetricsProvider;
        this.listenerQOS = qOSPlaybackEventListener;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7578a(boolean z) {
        C8729j0.m25320a((EventListener) this, z);
    }

    public final boolean getFirstStart() {
        return this.firstStart;
    }

    public final PlaybackMetricsProvider getPlaybackMetricsProvier() {
        return this.playbackMetricsProvier;
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public boolean isOffline() {
        return this.isOffline;
    }

    public void onLoadingChanged(boolean z) {
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        QOSPlaybackEventListener qOSPlaybackEventListener = this.listenerQOS;
        PlaybackEndedEventData playbackEndedEventData = new PlaybackEndedEventData(getPlaybackSessionId(), this.playbackMetricsProvier.getPlaybackMetrics().getCurrentPlayheadInSeconds(), PlaybackEndCause.error, PlaybackError.unknown);
        qOSPlaybackEventListener.onEvent(playbackEndedEventData);
    }

    public final void onPlayerStateChangeInternal(boolean z, int i) {
        int i2 = i;
        if (i2 == 1 || i2 == 2) {
            this.listener.onPause();
        } else if (i2 == 3) {
            PlaybackEventListener playbackEventListener = this.listener;
            if (z) {
                playbackEventListener.onPlay();
            } else {
                playbackEventListener.onPause();
            }
        } else if (i2 == 4) {
            this.listener.onPlayedToCompletion();
        }
        String playbackSessionId2 = getPlaybackSessionId();
        if (playbackSessionId2 == null) {
            return;
        }
        if (i2 == 1) {
            this.listenerQOS.onEvent(new PlaybackPausedEventData(playbackSessionId2));
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (this.firstStart) {
                    long currentPlayhead = this.playbackMetricsProvier.getPlaybackMetrics().getCurrentPlayhead();
                    Long currentBitrate = this.playbackMetricsProvier.getPlaybackMetrics().getCurrentBitrate();
                    PlaybackMetricsProvider playbackMetricsProvider = this.playbackMetricsProvier;
                    if (!(playbackMetricsProvider instanceof ExoPlayerAdapter)) {
                        playbackMetricsProvider = null;
                    }
                    ExoPlayerAdapter exoPlayerAdapter = (ExoPlayerAdapter) playbackMetricsProvider;
                    QosMetadata qosMetaData = exoPlayerAdapter != null ? exoPlayerAdapter.getQosMetaData() : null;
                    QOSPlaybackEventListener qOSPlaybackEventListener = this.listenerQOS;
                    PlaybackInitializedEventData playbackInitializedEventData = new PlaybackInitializedEventData(getPlaybackSessionId(), qosMetaData != null ? qosMetaData.getAudioChannels() : null, qosMetaData != null ? qosMetaData.getAudioCodec() : null, qosMetaData != null ? qosMetaData.getAudioLanguage() : null, qosMetaData != null ? qosMetaData.getAudioName() : null, currentPlayhead, currentBitrate, qosMetaData != null ? qosMetaData.getSubtitleLanguage() : null, qosMetaData != null ? qosMetaData.getSubtitleName() : null, null, qosMetaData != null ? qosMetaData.getVideoCodec() : null, null, exoPlayerAdapter != null ? exoPlayerAdapter.getVideoPlayerName() : null, exoPlayerAdapter != null ? exoPlayerAdapter.getVideoPlayerVersion() : null);
                    qOSPlaybackEventListener.onEvent(playbackInitializedEventData);
                }
                if (this.lastState == 2 && !this.firstStart) {
                    this.listenerQOS.onEvent(new RebufferingEndedEventData(playbackSessionId2));
                }
                if (z && this.firstStart) {
                    this.listenerQOS.onEvent(new PlaybackStartedEventData(playbackSessionId2, isOffline()));
                    this.firstStart = false;
                } else if (z && !this.firstStart) {
                    this.listenerQOS.onEvent(new PlaybackResumedEventData(playbackSessionId2));
                } else if (this.firstStart) {
                    this.listenerQOS.onEvent(new PlaybackReadyEventData(playbackSessionId2, null));
                } else {
                    this.listenerQOS.onEvent(new PlaybackPausedEventData(playbackSessionId2));
                }
            } else if (i2 == 4) {
                QOSPlaybackEventListener qOSPlaybackEventListener2 = this.listenerQOS;
                PlaybackEndedEventData playbackEndedEventData = new PlaybackEndedEventData(playbackSessionId2, this.playbackMetricsProvier.getPlaybackMetrics().getCurrentPlayheadInSeconds(), PlaybackEndCause.playedToEnd, null, 8, null);
                qOSPlaybackEventListener2.onEvent(playbackEndedEventData);
            }
        } else if (!this.firstStart) {
            this.listenerQOS.onEvent(new RebufferingStartedEventData(playbackSessionId2));
        }
    }

    public void onPlayerStateChanged(boolean z, int i) {
        onPlayerStateChangeInternal(z, i);
        this.lastState = i;
    }

    public void onPositionDiscontinuity(int i) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSeekProcessed() {
    }

    public void onShuffleModeEnabledChanged(boolean z) {
    }

    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        if (r14.equals(r15) != true) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTracksChanged(com.google.android.exoplayer2.source.TrackGroupArray r17, com.google.android.exoplayer2.trackselection.TrackSelectionArray r18) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r0.firstStart
            r2 = 0
            if (r1 != 0) goto L_0x00f3
            com.bamtech.sdk4.media.adapters.PlaybackMetricsProvider r1 = r0.playbackMetricsProvier
            boolean r3 = r1 instanceof com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter
            if (r3 != 0) goto L_0x000e
            r1 = r2
        L_0x000e:
            com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter r1 = (com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter) r1
            if (r1 == 0) goto L_0x0017
            com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter$QosMetadata r1 = r1.getQosMetaData()
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r18 == 0) goto L_0x00f3
            com.google.android.exoplayer2.trackselection.j[] r3 = r18.mo24041a()
            if (r3 == 0) goto L_0x00f3
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x0023:
            if (r6 >= r4) goto L_0x00f3
            r7 = r3[r6]
            com.google.android.exoplayer2.trackselection.TrackSelectionArray r8 = r0.lastTrackSelections
            if (r8 == 0) goto L_0x0073
            com.google.android.exoplayer2.trackselection.j[] r8 = r8.mo24041a()
            if (r8 == 0) goto L_0x0073
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r8.length
            r11 = 0
        L_0x0038:
            r12 = 1
            if (r11 >= r10) goto L_0x0065
            r13 = r8[r11]
            if (r13 == 0) goto L_0x005c
            com.google.android.exoplayer2.Format r14 = r13.mo24076f()
            if (r14 == 0) goto L_0x005c
            java.lang.String r14 = r14.f18349b0
            if (r14 == 0) goto L_0x005c
            if (r7 == 0) goto L_0x0054
            com.google.android.exoplayer2.Format r15 = r7.mo24076f()
            if (r15 == 0) goto L_0x0054
            java.lang.String r15 = r15.f18349b0
            goto L_0x0055
        L_0x0054:
            r15 = r2
        L_0x0055:
            boolean r14 = r14.equals(r15)
            if (r14 != r12) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            if (r12 == 0) goto L_0x0062
            r9.add(r13)
        L_0x0062:
            int r11 = r11 + 1
            goto L_0x0038
        L_0x0065:
            java.lang.Object r8 = kotlin.p590y.C13199w.m40591g(r9)
            com.google.android.exoplayer2.trackselection.j r8 = (com.google.android.exoplayer2.trackselection.C9311j) r8
            if (r8 == 0) goto L_0x0073
            boolean r8 = r8.equals(r7)
            if (r8 == r12) goto L_0x00ef
        L_0x0073:
            if (r7 == 0) goto L_0x00ef
            com.google.android.exoplayer2.Format r7 = r7.mo24076f()
            if (r7 == 0) goto L_0x00ef
            java.lang.String r7 = r7.f18349b0
            if (r7 == 0) goto L_0x00ef
            java.lang.String r8 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r8)
            r8 = 2
            java.lang.String r9 = "audio"
            boolean r9 = kotlin.p588j0.C12833x.m40154a(r7, r9, r5, r8, r2)
            if (r9 == 0) goto L_0x00c1
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r7 = r0.listenerQOS
            com.bamtech.sdk4.media.AudioChangedEventData r14 = new com.bamtech.sdk4.media.AudioChangedEventData
            java.lang.String r9 = r16.getPlaybackSessionId()
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r8 = r1.getAudioChannels()
            r10 = r8
            goto L_0x009e
        L_0x009d:
            r10 = r2
        L_0x009e:
            if (r1 == 0) goto L_0x00a6
            java.lang.String r8 = r1.getAudioCodec()
            r11 = r8
            goto L_0x00a7
        L_0x00a6:
            r11 = r2
        L_0x00a7:
            if (r1 == 0) goto L_0x00af
            java.lang.String r8 = r1.getAudioLanguage()
            r12 = r8
            goto L_0x00b0
        L_0x00af:
            r12 = r2
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            java.lang.String r8 = r1.getAudioName()
            r13 = r8
            goto L_0x00b9
        L_0x00b8:
            r13 = r2
        L_0x00b9:
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r7.onEvent(r14)
            goto L_0x00ef
        L_0x00c1:
            java.lang.String r9 = "text"
            boolean r7 = kotlin.p588j0.C12833x.m40154a(r7, r9, r5, r8, r2)
            if (r7 == 0) goto L_0x00ef
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r7 = r0.listenerQOS
            com.bamtech.sdk4.media.SubtitleChangedEventData r8 = new com.bamtech.sdk4.media.SubtitleChangedEventData
            java.lang.String r9 = r16.getPlaybackSessionId()
            if (r1 == 0) goto L_0x00d8
            java.lang.String r10 = r1.getSubtitleLanguage()
            goto L_0x00d9
        L_0x00d8:
            r10 = r2
        L_0x00d9:
            if (r1 == 0) goto L_0x00e0
            java.lang.String r11 = r1.getSubtitleName()
            goto L_0x00e1
        L_0x00e0:
            r11 = r2
        L_0x00e1:
            if (r1 == 0) goto L_0x00e8
            java.lang.Boolean r12 = r1.getSubtitleVisibility()
            goto L_0x00e9
        L_0x00e8:
            r12 = r2
        L_0x00e9:
            r8.<init>(r9, r10, r11, r12)
            r7.onEvent(r8)
        L_0x00ef:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x00f3:
            com.google.android.exoplayer2.trackselection.TrackSelectionArray r1 = new com.google.android.exoplayer2.trackselection.TrackSelectionArray
            if (r18 == 0) goto L_0x00fb
            com.google.android.exoplayer2.trackselection.j[] r2 = r18.mo24041a()
        L_0x00fb:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            com.google.android.exoplayer2.trackselection.j[] r2 = (com.google.android.exoplayer2.trackselection.C9311j[]) r2
            r1.<init>(r2)
            r0.lastTrackSelections = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener.onTracksChanged(com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectionArray):void");
    }

    public void setOffline(boolean z) {
        this.isOffline = z;
    }

    public void setPlaybackSessionId(String str) {
        this.playbackSessionId = str;
    }
}
