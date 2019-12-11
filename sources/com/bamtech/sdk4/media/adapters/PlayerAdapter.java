package com.bamtech.sdk4.media.adapters;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "Lcom/bamtech/sdk4/media/adapters/PlaybackMetricsProvider;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "getQosNetworkHelper", "()Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "setQosNetworkHelper", "(Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "videoPlayerName", "", "getVideoPlayerName", "()Ljava/lang/String;", "setVideoPlayerName", "(Ljava/lang/String;)V", "videoPlayerVersion", "getVideoPlayerVersion", "setVideoPlayerVersion", "clean", "", "drmProviders", "", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "onPrepared", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "playlist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "preferredDrmScheme", "Ljava/util/UUID;", "onQosEvent", "event", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayerAdapter.kt */
public interface PlayerAdapter extends PlaybackMetricsProvider {
    void onPrepared(MediaItem mediaItem, MediaItemPlaylist mediaItemPlaylist, ServiceTransaction serviceTransaction, UUID uuid);

    void setQosNetworkHelper(QOSNetworkHelper qOSNetworkHelper);
}
