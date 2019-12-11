package com.bamtech.sdk4.internal.media.adapters.exoplayer;

import com.bamtech.sdk4.media.BitrateChangedEventData;
import com.bamtech.sdk4.media.BitrateType;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.media.adapters.PlaybackMetricsProvider;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J.\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J.\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010%2\b\u0010*\u001a\u0004\u0018\u00010 H\u0016J@\u0010+\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010%2\b\u0010*\u001a\u0004\u0018\u00010 2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\fH\u0016J.\u0010/\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J\u001a\u00100\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u00101\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u00102\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J$\u00103\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010$\u001a\u0004\u0018\u00010 H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00064"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/HlsSourceEventListener;", "Lcom/google/android/exoplayer2/source/MediaSourceEventListener;", "playbackMetricsProvider", "Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;", "listenerQOS", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "primaryListener", "Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "expectMasterPlaylist", "", "getExpectMasterPlaylist", "()Z", "setExpectMasterPlaylist", "(Z)V", "getListenerQOS", "()Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "getPlaybackMetricsProvider", "()Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;", "getPrimaryListener", "()Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "getQosNetworkHelper", "()Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "onDownstreamFormatChanged", "", "windowIndex", "", "mediaPeriodId", "Lcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;", "loadData", "Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;", "onLoadCanceled", "p0", "p1", "p2", "Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;", "p3", "onLoadCompleted", "windowIdx", "loadEventInfo", "mediaLoadData", "onLoadError", "error", "Ljava/io/IOException;", "wasCanceled", "onLoadStarted", "onMediaPeriodCreated", "onMediaPeriodReleased", "onReadingStarted", "onUpstreamDiscarded", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: HlsSourceEventListener.kt */
public final class HlsSourceEventListener implements MediaSourceEventListener {
    private boolean expectMasterPlaylist = true;
    private final QOSPlaybackEventListener listenerQOS;
    private final PlaybackMetricsProvider playbackMetricsProvider;
    private final ExoPlayerListener primaryListener;
    private final QOSNetworkHelper qosNetworkHelper;

    public HlsSourceEventListener(PlaybackMetricsProvider playbackMetricsProvider2, QOSPlaybackEventListener qOSPlaybackEventListener, ExoPlayerListener exoPlayerListener, QOSNetworkHelper qOSNetworkHelper) {
        this.playbackMetricsProvider = playbackMetricsProvider2;
        this.listenerQOS = qOSPlaybackEventListener;
        this.primaryListener = exoPlayerListener;
        this.qosNetworkHelper = qOSNetworkHelper;
    }

    public void onDownstreamFormatChanged(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        Format format = mediaLoadData.f20156c;
        Long l = null;
        if (format != null) {
            String str = format.f18349b0;
            if (str != null && C12833x.m40154a((CharSequence) str, (CharSequence) "audio", false, 2, (Object) null)) {
                return;
            }
        }
        Format format2 = mediaLoadData.f20156c;
        if (format2 != null) {
            String str2 = format2.f18349b0;
            if (str2 != null && C12833x.m40154a((CharSequence) str2, (CharSequence) "text", false, 2, (Object) null)) {
                return;
            }
        }
        Format format3 = mediaLoadData.f20156c;
        if ((format3 != null ? format3.f18345X : -1) > 0 && !this.primaryListener.getFirstStart()) {
            String playbackSessionId = this.primaryListener.getPlaybackSessionId();
            if (playbackSessionId != null) {
                QOSPlaybackEventListener qOSPlaybackEventListener = this.listenerQOS;
                Format format4 = mediaLoadData.f20156c;
                if (format4 != null) {
                    l = Long.valueOf((long) format4.f18345X);
                }
                qOSPlaybackEventListener.onEvent(new BitrateChangedEventData(playbackSessionId, l, BitrateType.average));
            }
        }
    }

    public void onLoadCanceled(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoadCompleted(int r19, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r20, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo r21, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            com.bamtech.sdk4.media.ServerRequest r15 = new com.bamtech.sdk4.media.ServerRequest
            com.bamtech.sdk4.media.FetchStatus r4 = com.bamtech.sdk4.media.FetchStatus.completed
            com.bamtech.sdk4.media.QOSNetworkHelper r3 = r0.qosNetworkHelper
            r14 = 0
            if (r3 == 0) goto L_0x0015
            com.bamtech.sdk4.media.NetworkType r3 = r3.currentNetworkType()
            r7 = r3
            goto L_0x0016
        L_0x0015:
            r7 = r14
        L_0x0016:
            r8 = 0
            r9 = 0
            if (r1 == 0) goto L_0x0024
            android.net.Uri r3 = r1.f20152a
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getHost()
            r10 = r3
            goto L_0x0025
        L_0x0024:
            r10 = r14
        L_0x0025:
            if (r1 == 0) goto L_0x0031
            android.net.Uri r3 = r1.f20152a
            if (r3 == 0) goto L_0x0031
            java.lang.String r3 = r3.getEncodedPath()
            r11 = r3
            goto L_0x0032
        L_0x0031:
            r11 = r14
        L_0x0032:
            r12 = 0
            r13 = 0
            r16 = 0
            if (r1 == 0) goto L_0x003f
            long r5 = r1.f20153b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L_0x0040
        L_0x003f:
            r1 = r14
        L_0x0040:
            r5 = 0
            r6 = 0
            r3 = r15
            r14 = r16
            r17 = r15
            r15 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0054
            int r1 = r2.f20154a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x0055
        L_0x0054:
            r14 = 0
        L_0x0055:
            r1 = 4
            if (r14 != 0) goto L_0x005a
            goto L_0x00ee
        L_0x005a:
            int r3 = r14.intValue()
            if (r3 != r1) goto L_0x00ee
            boolean r1 = r0.expectMasterPlaylist
            if (r1 == 0) goto L_0x0088
            r1 = 0
            r0.expectMasterPlaylist = r1
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            java.lang.String r1 = r1.getPlaybackSessionId()
            if (r1 == 0) goto L_0x00ee
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r2 = r0.listenerQOS
            com.bamtech.sdk4.media.MasterPlaylistFetchedEventData r3 = new com.bamtech.sdk4.media.MasterPlaylistFetchedEventData
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r4 = r0.primaryListener
            boolean r4 = r4.isOffline()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r11 = r17
            r5 = 0
            r3.<init>(r1, r4, r5, r11)
            r2.onEvent(r3)
            goto L_0x00ee
        L_0x0088:
            r11 = r17
            r5 = 0
            com.bamtech.sdk4.media.adapters.PlaybackMetricsProvider r14 = r0.playbackMetricsProvider
            boolean r1 = r14 instanceof com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter
            if (r1 != 0) goto L_0x0092
            r14 = r5
        L_0x0092:
            com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter r14 = (com.bamtech.sdk4.media.adapters.exoplayer.ExoPlayerAdapter) r14
            if (r14 == 0) goto L_0x0099
            r14.getQosMetaData()
        L_0x0099:
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            java.lang.String r3 = r1.getPlaybackSessionId()
            if (r3 == 0) goto L_0x00ee
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r12 = r0.listenerQOS
            com.bamtech.sdk4.media.VariantPlaylistFetchedEventData r13 = new com.bamtech.sdk4.media.VariantPlaylistFetchedEventData
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            boolean r1 = r1.isOffline()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00bb
            int r1 = r1.f18345X
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6 = r1
            goto L_0x00bc
        L_0x00bb:
            r6 = r5
        L_0x00bc:
            r7 = 0
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00c9
            int r1 = r1.f18363o0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r8 = r1
            goto L_0x00ca
        L_0x00c9:
            r8 = r5
        L_0x00ca:
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00d2
            java.lang.String r1 = r1.f18350c
            r9 = r1
            goto L_0x00d3
        L_0x00d2:
            r9 = r5
        L_0x00d3:
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = r1.f18368t0
            r10 = r1
            goto L_0x00dc
        L_0x00db:
            r10 = r5
        L_0x00dc:
            r14 = 0
            r15 = 0
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r14
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.onEvent(r13)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.adapters.exoplayer.HlsSourceEventListener.onLoadCompleted(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoadError(int r19, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r20, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo r21, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData r22, java.io.IOException r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            com.bamtech.sdk4.media.ServerRequest r15 = new com.bamtech.sdk4.media.ServerRequest
            com.bamtech.sdk4.media.FetchStatus r4 = com.bamtech.sdk4.media.FetchStatus.completed
            com.bamtech.sdk4.media.QOSNetworkHelper r3 = r0.qosNetworkHelper
            r14 = 0
            if (r3 == 0) goto L_0x0015
            com.bamtech.sdk4.media.NetworkType r3 = r3.currentNetworkType()
            r7 = r3
            goto L_0x0016
        L_0x0015:
            r7 = r14
        L_0x0016:
            r8 = 0
            com.bamtech.sdk4.media.QOSNetworkHelper r3 = r0.qosNetworkHelper
            if (r3 == 0) goto L_0x0023
            r5 = r23
            com.bamtech.sdk4.media.NetworkError r3 = r3.translateLicenseError(r5)
            r9 = r3
            goto L_0x0024
        L_0x0023:
            r9 = r14
        L_0x0024:
            if (r1 == 0) goto L_0x0030
            android.net.Uri r3 = r1.f20152a
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.getHost()
            r10 = r3
            goto L_0x0031
        L_0x0030:
            r10 = r14
        L_0x0031:
            if (r1 == 0) goto L_0x003d
            android.net.Uri r3 = r1.f20152a
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.getEncodedPath()
            r11 = r3
            goto L_0x003e
        L_0x003d:
            r11 = r14
        L_0x003e:
            r12 = 0
            r13 = 0
            r16 = 0
            if (r1 == 0) goto L_0x004b
            long r5 = r1.f20153b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L_0x004c
        L_0x004b:
            r1 = r14
        L_0x004c:
            r5 = 0
            r6 = 0
            r3 = r15
            r14 = r16
            r17 = r15
            r15 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0060
            int r1 = r2.f20154a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x0061
        L_0x0060:
            r14 = 0
        L_0x0061:
            r1 = 4
            if (r14 != 0) goto L_0x0066
            goto L_0x00ea
        L_0x0066:
            int r3 = r14.intValue()
            if (r3 != r1) goto L_0x00ea
            boolean r1 = r0.expectMasterPlaylist
            if (r1 == 0) goto L_0x0091
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            java.lang.String r1 = r1.getPlaybackSessionId()
            if (r1 == 0) goto L_0x0112
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r2 = r0.listenerQOS
            com.bamtech.sdk4.media.MasterPlaylistFetchedEventData r3 = new com.bamtech.sdk4.media.MasterPlaylistFetchedEventData
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r4 = r0.primaryListener
            boolean r4 = r4.isOffline()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r11 = r17
            r5 = 0
            r3.<init>(r1, r4, r5, r11)
            r2.onEvent(r3)
            goto L_0x0112
        L_0x0091:
            r11 = r17
            r5 = 0
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            java.lang.String r3 = r1.getPlaybackSessionId()
            if (r3 == 0) goto L_0x0112
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r12 = r0.listenerQOS
            com.bamtech.sdk4.media.VariantPlaylistFetchedEventData r13 = new com.bamtech.sdk4.media.VariantPlaylistFetchedEventData
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            boolean r1 = r1.isOffline()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00b6
            int r1 = r1.f18345X
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6 = r1
            goto L_0x00b7
        L_0x00b6:
            r6 = r5
        L_0x00b7:
            r7 = 0
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00c4
            int r1 = r1.f18363o0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r8 = r1
            goto L_0x00c5
        L_0x00c4:
            r8 = r5
        L_0x00c5:
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00cd
            java.lang.String r1 = r1.f18350c
            r9 = r1
            goto L_0x00ce
        L_0x00cd:
            r9 = r5
        L_0x00ce:
            com.google.android.exoplayer2.Format r1 = r2.f20156c
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = r1.f18368t0
            r10 = r1
            goto L_0x00d7
        L_0x00d6:
            r10 = r5
        L_0x00d7:
            r14 = 0
            r15 = 0
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r14
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.onEvent(r13)
            goto L_0x0112
        L_0x00ea:
            r11 = r17
            r1 = 1
            if (r14 != 0) goto L_0x00f0
            goto L_0x0112
        L_0x00f0:
            int r2 = r14.intValue()
            if (r2 != r1) goto L_0x0112
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r1 = r0.primaryListener
            java.lang.String r1 = r1.getPlaybackSessionId()
            if (r1 == 0) goto L_0x0112
            com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r2 = r0.listenerQOS
            com.bamtech.sdk4.media.MediaSegmentFetchedEventData r3 = new com.bamtech.sdk4.media.MediaSegmentFetchedEventData
            com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener r4 = r0.primaryListener
            boolean r4 = r4.isOffline()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.<init>(r1, r4, r11)
            r2.onEvent(r3)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.adapters.exoplayer.HlsSourceEventListener.onLoadError(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData, java.io.IOException, boolean):void");
    }

    public void onLoadStarted(int i, MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onMediaPeriodCreated(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onMediaPeriodReleased(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onReadingStarted(int i, MediaPeriodId mediaPeriodId) {
    }

    public void onUpstreamDiscarded(int i, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    public final void setExpectMasterPlaylist(boolean z) {
        this.expectMasterPlaylist = z;
    }
}
